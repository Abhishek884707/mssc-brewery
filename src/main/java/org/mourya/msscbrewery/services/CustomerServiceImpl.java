package org.mourya.msscbrewery.services;

import org.mourya.msscbrewery.web.model.BeerDto;
import org.mourya.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Override
    public CustomerDto getCustomerById(UUID uuid) {
        return CustomerDto.builder()
                .id(uuid)
                .name("Abhishek Kumar Mourya")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return null;
    }

    @Override
    public void updateCustomer(UUID beerId, CustomerDto customerDto) {

    }

    @Override
    public void deleteCustomerById(UUID beerId) {

    }


}
