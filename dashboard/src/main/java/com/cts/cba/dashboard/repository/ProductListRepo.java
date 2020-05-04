package com.cts.cba.dashboard.repository;

import java.util.List;

import com.cts.cba.dashboard.entity.Product;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductListRepo extends CrudRepository<Product, Integer> {

    @Query(value = "SELECT * FROM product p WHERE p.pid IN(SELECT pid FROM invoice_product i WHERE i.iid IN(SELECT iid FROM invoice j WHERE j.idate>=DATE_SUB(CURDATE(), INTERVAL :timeDuration MONTH) AND j.cid IN(SELECT cid FROM customer c WHERE c.cat=:cat)))", nativeQuery = true)
    List<Product> findAllByDuration(int timeDuration, String cat);

    @Query(value = "SELECT * FROM product p WHERE p.pid IN(SELECT pid FROM invoice_product i WHERE i.iid IN(SELECT iid FROM invoice j WHERE j.idate>=DATE_SUB(CURDATE(), INTERVAL :timeDuration MONTH) AND j.cid IN(SELECT cid FROM customer c WHERE c.cat=:cat))) AND p.price BETWEEN :startPrice AND :endPrice ORDER BY p.price", nativeQuery = true)
    List<Product> findAllByPriceRange(int timeDuration, String cat, double startPrice, double endPrice);

    @Query(value = "SELECT * FROM product p WHERE p.pid IN(SELECT pid FROM invoice_product i WHERE i.iid IN(SELECT iid FROM invoice j WHERE j.idate>=DATE_SUB(CURDATE(), INTERVAL :timeDuration MONTH) AND j.cid IN(SELECT cid FROM customer c WHERE c.cat=:cat))) AND p.pid IN(SELECT pid FROM product_discount d WHERE d.did<>1)", nativeQuery = true)
	List<Product> findAllByDiscount(int timeDuration, String cat);

}