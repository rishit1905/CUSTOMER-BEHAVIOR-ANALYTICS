package com.cts.cba.dashboard.repository;

import java.util.List;

import com.cts.cba.dashboard.entity.Product;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryBrandListRepo extends CrudRepository<Product, Integer> {

    @Query(value = "SELECT * FROM product p WHERE p.pid IN(SELECT pid FROM invoice_product i WHERE i.iid IN(SELECT iid FROM invoice j WHERE j.idate>=DATE_SUB(CURDATE(), INTERVAL :timeDuration MONTH) AND j.cid IN(SELECT cid FROM customer c WHERE c.cat=:cat))) AND p.category=:category", nativeQuery = true)
    List<Product> findAllByCategory(int timeDuration, String cat, String category);

    @Query(value = "SELECT * FROM product p WHERE p.pid IN(SELECT pid FROM invoice_product i WHERE i.iid IN(SELECT iid FROM invoice j WHERE j.idate>=DATE_SUB(CURDATE(), INTERVAL :timeDuration MONTH) AND j.cid IN(SELECT cid FROM customer c WHERE c.cat=:cat))) AND p.brand=:brand", nativeQuery = true)
	List<Product> findAllByBrand(int timeDuration, String cat, String brand);

}