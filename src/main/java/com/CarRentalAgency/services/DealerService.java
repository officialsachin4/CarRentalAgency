package com.CarRentalAgency.services;

import com.CarRentalAgency.entity.Dealer;
import com.CarRentalAgency.exception.AlreadyExistsException;

import java.util.List;
import java.util.NoSuchElementException;

public interface DealerService {

    List<Dealer> findAllDealers();

    List<Dealer> findDealerByFirstNameIgnoreCase(String userName) throws NoSuchElementException;

    Dealer saveDealer(Dealer dealer) throws AlreadyExistsException, NoSuchElementException;

    Dealer findDealerById(Long id) throws NoSuchElementException;

    Dealer findDealerByEmail(String email) throws NoSuchElementException;

    void deleteDealerById(Long id) throws NoSuchElementException;

    Dealer updateDealer(Long id, Dealer dealer) throws NoSuchElementException;
}
