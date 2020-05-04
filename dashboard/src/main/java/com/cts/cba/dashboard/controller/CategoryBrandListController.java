package com.cts.cba.dashboard.controller;

import java.util.List;

import com.cts.cba.dashboard.entity.Product;
import com.cts.cba.dashboard.service.CategoryBrandListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryBrandListController {

    @Autowired
    CategoryBrandListService service;

    @RequestMapping("/soldcategorylist/{timeDuration}/{cat}/{category}")
    List<Product> getAllProductByCategory(@PathVariable int timeDuration, @PathVariable String cat,
            @PathVariable String category) {
        return (List<Product>) service.getAllProductByCategory(timeDuration, cat, category);
    }

    @RequestMapping("/soldbrandlist/{timeDuration}/{cat}/{brand}")
    List<Product> getAllProductByBrand(@PathVariable int timeDuration, @PathVariable String cat,
            @PathVariable String brand) {
        return (List<Product>) service.getAllProductByBrand(timeDuration, cat, brand);
    }
}