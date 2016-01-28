package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * Created by rhartley on 1/27/2016.
 */
public interface CustomerRepository {
    List<Customer> findAll();
}
