package com.cts.cba.dashboard.repository;

import java.util.List;

import com.cts.cba.dashboard.entity.Product;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationListRepo extends CrudRepository<Product, Integer> {

   @Query(value = "SELECT * FROM product p WHERE p.pid IN(SELECT pid FROM invoice_product i WHERE i.iid IN(SELECT iid FROM invoice j WHERE j.cid IN(SELECT cid FROM customer c WHERE c.location=:location)))", nativeQuery = true)
	List<Product> findAllByLocation(String location);

}