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

	public List<Product> getAllProductByCategory(int timeDuration, String cat, String category) {
		return (List<Product>) repo.findAllByCategory(timeDuration, cat, category);
	}

	public List<Product> getAllProductByBrand(int timeDuration, String cat, String brand) {
		return (List<Product>) repo.findAllByBrand(timeDuration, cat, brand);
	}

}