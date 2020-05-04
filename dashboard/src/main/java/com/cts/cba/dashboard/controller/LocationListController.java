package com.cts.cba.dashboard.controller;

import java.util.List;

import com.cts.cba.dashboard.entity.Product;
import com.cts.cba.dashboard.service.LocationListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/locations")
public class LocationListController {

    @Autowired
    LocationListService service;

    @RequestMapping("/soldlocationlist/{timeDuration}/{cat}/{location}")
    @ApiOperation(value = "Gets list of locations", notes = "Generates list of average sales details based on customer geoagraphy")
    List<Product> getAllByLocation(
            @ApiParam(value = "Time duration in months", required = true) @PathVariable int timeDuration,
            @ApiParam(value = "Category of customers", required = true) @PathVariable String cat,
            @ApiParam(value = "Location of customers", required = true) @PathVariable String location) {
        return service.getAllByLocation(timeDuration, cat, location);
    }
}