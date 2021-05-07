package com.assignment.thepirates.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StoreRepository extends CrudRepository<Store, Long> {
    List<Store> findAll();
    Store save(Store store);
}
