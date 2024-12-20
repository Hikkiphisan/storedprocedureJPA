package org.example.springjpastoreproceduce.service;

import org.example.springjpastoreproceduce.model.Customer;

public interface ICustomerService {
    boolean saveWithStoredProcedure(Customer customer);
}