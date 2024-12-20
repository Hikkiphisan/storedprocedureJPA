package org.example.springjpastoreproceduce.repository;

import org.example.springjpastoreproceduce.model.Customer;

public interface ICustomerRepository {
    boolean saveWithStoredProcedure(Customer customer);
}