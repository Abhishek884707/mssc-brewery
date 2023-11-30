package org.mourya.msscbrewery.services;

import org.mourya.msscbrewery.web.model.BeerDto;
import org.mourya.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID uuid);
    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID beerId, CustomerDto customerDto);

    void deleteCustomerById(UUID beerId);
}
