package com.assignment.thepirates.service;

import com.assignment.thepirates.model.Store;
import com.assignment.thepirates.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    StoreRepository storeRepository;

    public StoreService() {}

    @Autowired
    public StoreService(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    public List<Store> getStores() {
        return storeRepository.findAll();
    }

    public Store getStore(int id) {
        return null;
    }

    public Store addStore(Store store) {
        return storeRepository.save(store);
    }
}
