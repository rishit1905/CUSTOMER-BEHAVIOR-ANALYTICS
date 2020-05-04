package com.cts.cba.dashboard.controller;

import java.util.List;

import com.cts.cba.dashboard.entity.Product;
import com.cts.cba.dashboard.service.CategoryBrandListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/categories")
public class CategoryBrandListController {

    @Autowired
    CategoryBrandListService service;

    @RequestMapping("/soldcategorylist/{timeDuration}/{cat}/{category}")
    @ApiOperation(value = "Gets list of product categories", notes = "Generates list of categories of products with their average sales details")
    List<Product> getAllProductByCategory(
            @ApiParam(value = "Time duration in months", required = true) @PathVariable int timeDuration,
            @ApiParam(value = "Category of customers", required = true) @PathVariable String cat,
            @ApiParam(value = "Product category", required = true) @PathVariable String category) {
        return (List<Product>) service.getAllProductByCategory(timeDuration, cat, category);
    }

    @RequestMapping("/soldbrandlist/{timeDuration}/{cat}/{brand}")
    @ApiOperation(value = "Gets list of product brands", notes = "Generates list of brands with their average sales details")
    List<Product> getAllProductByBrand(
            @ApiParam(value = "Time duration in months", required = true) @PathVariable int timeDuration,
            @ApiParam(value = "Category of customers", required = true) @PathVariable String cat,
            @ApiParam(value = "Product brand", required = true) @PathVariable String brand) {
        return (List<Product>) service.getAllProductByBrand(timeDuration, cat, brand);
    }
}