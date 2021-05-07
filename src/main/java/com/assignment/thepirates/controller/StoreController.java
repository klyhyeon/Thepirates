package com.assignment.thepirates.controller;

import com.assignment.thepirates.domain.Store;
import com.assignment.thepirates.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class StoreController {

    @Autowired
    StoreService storeService;

    @GetMapping("/stores")
    public List<Store> storeList() {
        List<Store> list = storeService.getStores();
        return list;
    }

    @GetMapping("/stores/{id}")
    public Store store(@PathVariable("id") int id) {
        Store store = storeService.getStore(id);
        return store;
    }

    @PostMapping("/stores")
    public ResponseEntity<?> add(@RequestBody Store source) {
        String name = source.getName();
        String owner = source.getOwner();
        String description = source.getDescription();
        int level = source.getLevel();
        String address = source.getAddress();
        String phone = source.getPhone();
        Store store = new Store(name, owner, description, level, address, phone);
        storeService.addStore(store);
        //URI location = new URI("/stores");
        return ResponseEntity.status(200).body("{}");
    }
}
