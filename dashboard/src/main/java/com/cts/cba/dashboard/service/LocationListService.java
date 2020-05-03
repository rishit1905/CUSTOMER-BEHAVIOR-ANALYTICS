package com.cts.cba.dashboard.service;

import java.util.List;

import com.cts.cba.dashboard.entity.Product;
import com.cts.cba.dashboard.repository.LocationListRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationListService {

    @Autowired
    LocationListRepo repo;

    public List<Product> getAllByLocation(String location) {
        return (List<Product>)repo.findAllByLocation(location);
    }

}