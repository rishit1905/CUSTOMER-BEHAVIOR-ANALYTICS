package com.cts.cba.dashboard.controller;

import java.util.List;

import com.cts.cba.product.entity.Product;
// import com.cts.cba.product.model.AuthenticationRequest;
// import com.cts.cba.product.model.AuthenticationResponse;
// import com.cts.cba.product.security.JwtUtil;
import com.cts.cba.product.service.CustomerService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
// import org.springframework.http.ResponseEntity;
// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.authentication.BadCredentialsException;
// import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(tags = "Customer", description = "A controller to activate endpoint related to properties of customer entity")
@RequestMapping("/customers")
@RefreshScope
public class DashboardController {

    Logger logger = LoggerFactory.getLogger(DashboardController.class);

    @Autowired
    private DashboardService service;

    // @Autowired
    // private JwtUtil jwtTokenUtil;

    // @Autowired
    // private AuthenticationManager authenticationManager;

    @RequestMapping(method = RequestMethod.GET, value = "/productsales/{timeDuration}/{customerCategory}/{location}")
    @ApiOperation(value = "Gets list of locations", notes = "Generates list of average sales details based on customer geoagraphy")
    List<Product> getAllByLocation(
            @ApiParam(value = "Time duration in months", required = true) @PathVariable int timeDuration,
            @ApiParam(value = "Category of customers", required = true) @PathVariable String customerCategory,
            @ApiParam(value = "Location of customers", required = true) @PathVariable String location) {
        return service.getAllByLocation(timeDuration, customerCategory, location);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/locationsales/{timeDuration}/{customerCategory}/{productName}")
    @ApiOperation(value = "Gets list of locations", notes = "Generates list of average sales details based on customer geoagraphy")
    List<Product> getAllByLocation(
            @ApiParam(value = "Time duration in months", required = true) @PathVariable int timeDuration,
            @ApiParam(value = "Category of customers", required = true) @PathVariable String customerCategory,
            @ApiParam(value = "List of product name", required = true) @PathVariable String productName) {
        return service.getAllByLocation(timeDuration, customerCategory, location);
    }
    // @RequestMapping(method = RequestMethod.POST, value = "/authenticate")
    // public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest)
    //         throws Exception {
    //     try {
    //         authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
    //                 authenticationRequest.getUserName(), authenticationRequest.getPassword()));
    //     } catch (BadCredentialsException exception) {
    //         throw new Exception("Incorrect username or password !", exception);
    //     }

    //     final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUserName());

    //     final String jwt = jwtTokenUtil.generateToken(userDetails);
    //     return ResponseEntity.ok(new AuthenticationResponse(jwt));
    // }
}