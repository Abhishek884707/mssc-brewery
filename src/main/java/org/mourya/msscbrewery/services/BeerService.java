package org.mourya.msscbrewery.services;

import org.mourya.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID uuid);

}
