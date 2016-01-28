package com.pluralsight.service;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * Created by rhartley on 1/27/2016.
 */
public interface CustomerService {
    List<Customer> findAll();
}
