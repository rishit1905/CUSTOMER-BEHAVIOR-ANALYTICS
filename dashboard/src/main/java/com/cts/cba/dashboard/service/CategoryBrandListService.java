package com.cts.cba.dashboard.service;

import java.util.List;

import com.cts.cba.dashboard.entity.Product;
import com.cts.cba.dashboard.repository.CategoryBrandListRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryBrandListService {

    @Autowired
    CategoryBrandListRepo repo;

    public List<Product> getAllProductByCategory(String category) {
		return (List<Product>)repo.findAllByCategory(category);
	}

	public List<Product> getAllProductByBrand(String brand) {
		return (List<Product>)repo.findAllByBrand(brand);
	}

}