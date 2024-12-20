package org.example.springjpastoreproceduce.service;

import org.example.springjpastoreproceduce.model.Customer;
import org.example.springjpastoreproceduce.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public boolean saveWithStoredProcedure(Customer customer) {
        return iCustomerRepository.saveWithStoredProcedure(customer);
    }
}