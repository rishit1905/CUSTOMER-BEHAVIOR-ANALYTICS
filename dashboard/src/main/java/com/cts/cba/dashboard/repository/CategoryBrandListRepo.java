package com.cts.cba.dashboard.repository;

import java.util.List;

import com.cts.cba.dashboard.entity.Product;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryBrandListRepo extends CrudRepository<Product, Integer> {

    @Query(value = "SELECT * FROM product p WHERE p.category=:category", nativeQuery = true)
    List<Product> findAllByCategory(String category);

    @Query(value = "SELECT * FROM product p WHERE p.brand=:brand", nativeQuery = true)
	List<Product> findAllByBrand(String brand);

}