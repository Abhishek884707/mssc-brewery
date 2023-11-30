package org.mourya.msscbrewery.services;

import lombok.extern.slf4j.Slf4j;
import org.mourya.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
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

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {

    }

    @Override
    public void deleteBeerById(UUID beerId) {
        log.info("Deleting Beer .... !");
    }
}
