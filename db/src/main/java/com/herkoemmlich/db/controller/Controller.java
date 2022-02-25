package com.herkoemmlich.db.controller;

import com.herkoemmlich.db.domain.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controller {

    @GetMapping(value = "/customer/{id}", produces = "application/json")
    public Customer findById(@PathVariable("id") int id) {
        log.info("Loading customer with id={}", id);
        Customer customer = new Customer();
        customer.setId(id);
        customer.setAge(42);
        customer.setCanton("BE");
        customer.setSex("Female");
        return customer;
    }

}
