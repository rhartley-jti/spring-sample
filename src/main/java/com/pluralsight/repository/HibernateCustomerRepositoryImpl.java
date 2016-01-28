package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rhartley on 1/27/2016.
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<Customer>();
        Customer customer = new Customer();

        customer.setFirstname("Ryan");
        customer.setLastname("Hartley");

        customers.add(customer);

        return customers;
    }
}
