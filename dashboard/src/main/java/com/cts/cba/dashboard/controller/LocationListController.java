package com.cts.cba.dashboard.controller;

import java.util.List;

import com.cts.cba.dashboard.entity.Product;
import com.cts.cba.dashboard.service.LocationListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/locations")
public class LocationListController {
    
    @Autowired
    LocationListService service;

    @RequestMapping("/soldlocationlist/{location}")
    List<Product> getAllByLocation(@PathVariable String location){
        return service.getAllByLocation(location);
    }
}