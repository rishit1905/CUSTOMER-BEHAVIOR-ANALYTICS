package com.cts.cba.dashboard.controller;

import java.util.List;
import java.util.Optional;

import com.cts.cba.dashboard.entity.Product;
import com.cts.cba.dashboard.service.ProductListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductListController {

    @Autowired
    ProductListService service;

    @RequestMapping("/soldproductlist")
    List<Product> getAllProduct() {
        return (List<Product>) service.getAllProduct();
    }

    // @RequestMapping("/soldproductlist/{id}")
    // Optional<Product> getProductById(@PathVariable int id){
    //     return  service.getProductById(id);
    // }

    @RequestMapping("/soldproductlist/priceRange/{startPrice}/{endPrice}")
    List<Product> getAllProductByPriceRange(@PathVariable double startPrice, @PathVariable double endPrice ) {
        return (List<Product>) service.getAllProductByPriceRange(startPrice, endPrice);
    }

    @RequestMapping("/soldproductlist/{cat}")
    List<Product> getProductSold(@PathVariable String cat) {
        return (List<Product>) service.getProductSold(cat);
    }
}