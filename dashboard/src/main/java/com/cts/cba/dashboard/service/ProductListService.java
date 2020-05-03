package com.cts.cba.dashboard.service;

import java.util.List;
import java.util.Optional;

import com.cts.cba.dashboard.entity.Product;
import com.cts.cba.dashboard.repository.ProductListRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductListService {

    @Autowired
    ProductListRepo repo;

    public List<Product> getProductSold(String cat) {
        return (List<Product>) repo.findAllByDuration(cat);
    }

    public List<Product> getAllProduct() {
        return (List<Product>) repo.findAll();
    }

    public Optional<Product> getProductById(int id) {
        return repo.findById(id);
    }

	public List<Product> getAllProductByPriceRange(double startPrice, double endPrice) {
		return  (List<Product>)repo.findAllByPrice(startPrice,endPrice);
	}

}