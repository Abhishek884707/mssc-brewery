package org.mourya.msscbrewery.services;

import org.mourya.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID uuid);

}
