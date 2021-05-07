package com.assignment.thepirates.service;

import com.assignment.thepirates.domain.Store;
import com.assignment.thepirates.domain.StoreRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockMultipartHttpServletRequest;

import java.io.IOException;

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
        Store store = new Store("mermaid", "incheon", "incheon", 2, "incheon", "010");
        given(storeRepository.save(any())).willReturn(store);
        Store added = storeService.addStore(store);
        assertEquals("mermaid", added.getName());
    }

}