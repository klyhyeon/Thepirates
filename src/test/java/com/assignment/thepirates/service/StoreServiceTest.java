package com.assignment.thepirates.service;

import com.assignment.thepirates.model.Store;
import com.assignment.thepirates.repository.StoreRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

class StoreServiceTest {

    @MockBean
    StoreRepository storeRepository;

    private static StoreService storeService;

    @BeforeAll
    public static void setUp() {
        storeService = new StoreService();
        MockitoAnnotations.openMocks(StoreServiceTest.class);
    }

    @Test
    public void addRestaurant() {
        Store store = Store.builder()
                .name("mermaid")
                .owner("zhang")
                .address("incheon")
                .phone("010-4915-9399")
                .level(1)
                .description("detail").build();
        given(storeRepository.save(any())).willReturn(store);
        Store added = storeService.addStore(store);
        assertEquals("mermaid", added.getName());
    }

}