package com.cts.cba.dashboard.controller;

import java.util.List;
import java.util.Optional;

import com.cts.cba.dashboard.entity.Product;
import com.cts.cba.dashboard.service.ProductListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/products")
public class ProductListController {

    @Autowired
    ProductListService service;

    // @RequestMapping("/soldproductlist")
    // List<Product> getAllProduct() {
    // return (List<Product>) service.getAllProduct();
    // }

    @RequestMapping("/soldproductlist/{timeDuration}/{cat}")
    @ApiOperation(value = "Gets list of discounted/non-discounted products", notes = "Generates list of discounted sales based on time interval, customer category")
    List<Product> getProductSold(
            @ApiParam(value = "Time duration in months", required = true) @PathVariable int timeDuration,
            @ApiParam(value = "Category of customers", required = true) @PathVariable String cat) {
        return (List<Product>) service.getProductSold(timeDuration, cat);
    }

    // @RequestMapping("/soldproductlist/{id}")
    // Optional<Product> getProductById(@PathVariable int id){
    // return service.getProductById(id);
    // }

    @RequestMapping("/soldproductlist/priceRange/{timeDuration}/{cat}/{startPrice}/{endPrice}")
    @ApiOperation(value = "Gets list of products", notes = "Generates list of products and their sales details based on time interval, customer category, range of product price")
    List<Product> getAllProductByPriceRange(
            @ApiParam(value = "Time duration in months", required = true) @PathVariable int timeDuration,
            @ApiParam(value = "Category of customers", required = true) @PathVariable String cat,
            @ApiParam(value = "Starting price of product", required = true) @PathVariable double startPrice,
            @ApiParam(value = "Ending price of product", required = true) @PathVariable double endPrice) {
        return (List<Product>) service.getAllProductByPriceRange(timeDuration, cat, startPrice, endPrice);
    }

    @RequestMapping("/solddiscountlist/{timeDuration}/{cat}")
    @ApiOperation(value = "Gets list of products", notes = "Generates list of products and their sales details based on time interval, customer category")
    List<Product> getAllProductByDiscount(
            @ApiParam(value = "Time duration in months", required = true) @PathVariable int timeDuration,
            @ApiParam(value = "Category of customers", required = true) @PathVariable String cat) {
        return (List<Product>) service.getAllProductByDiscount(timeDuration, cat);
    }

}