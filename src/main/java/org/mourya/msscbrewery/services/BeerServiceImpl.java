package org.mourya.msscbrewery.services;

import org.mourya.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService{

    @Override
    public BeerDto getBeerById(UUID uuid) {
        return BeerDto.builder()
                .id(uuid)
                .BeerName("Galaxy Cat")
                .BeerStyle("Pale Ale")
                .build();
    }
}
