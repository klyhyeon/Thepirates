package com.assignment.thepirates.repository;

import com.assignment.thepirates.model.Store;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StoreRepository extends CrudRepository<Store, Long> {
    List<Store> findAll();
    Store save(Store store);
}
