package com.cts.cba.dashboard.service;

import java.util.List;

import com.cts.cba.dashboard.entity.Product;
import com.cts.cba.dashboard.repository.DashboardRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Bean;

@Service
public class DashboardService {

    @Autowired
    private RestTemplate restTemplate;
    
    @Bean
    public RestTemplate restTemplate(){
    return new RestTemplate();

    public Product getProductSales(int productId) {
        Product result = restTemplate.getForObject("http://localhost:8965/dashboard/products/{product_id}",Product.class,productId);
        return result;
    }

     public Product getLocationSales(int productId) {
        Product result = restTemplate.getForObject("http://localhost:8965/dashboard/products/{product_id}",Product.class,productId);
        return result;
    }

}