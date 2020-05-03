package com.cts.cba.dashboard.repository;

import java.util.List;

import com.cts.cba.dashboard.entity.Product;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductListRepo extends CrudRepository<Product, Integer> {

    @Query(value = "SELECT * FROM product p WHERE p.pid IN(SELECT pid FROM invoice_product i WHERE i.iid IN(SELECT iid FROM invoice j WHERE j.cid IN(SELECT cid FROM customer c WHERE c.cat=:cat)))", nativeQuery = true)
    List<Product> findAllByDuration(String cat);

    @Query(value = "SELECT * FROM product p WHERE p.price BETWEEN :startPrice AND :endPrice" ,nativeQuery=true)
	List<Product> findAllByPrice(double startPrice, double endPrice);

}