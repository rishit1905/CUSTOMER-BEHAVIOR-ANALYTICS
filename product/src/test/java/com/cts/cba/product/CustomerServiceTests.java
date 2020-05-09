package com.cts.cba.product;

import static org.mockito.Mockito.when;

import com.cts.cba.product.repository.CustomerRepo;
import com.cts.cba.product.service.CustomerService;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceTests {
    
    @Autowired
    private CustomerService service;

    @MockBean
    private CustomerRepo repo;

    // public void getAllByLocationTest(){
    //     when(repo.findAll())
    // }
}