package com.assignment.thepirates.controller;

import com.assignment.thepirates.domain.Store;
import com.assignment.thepirates.service.StoreService;
import org.hamcrest.core.StringContains;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(StoreController.class)
class StoreControllerTest {

    @Autowired
    private MockMvc mock;

    @MockBean
    private StoreService storeService;

    @Test
    public void storeListTest() throws Exception {
        List<Store> storeList = new ArrayList<>();
        storeList.add(new Store("mermaid", "zhang", "incheon",
                2, "incheon", "010-1234"));
        given(storeService.getStores()).willReturn(storeList);
        mock.perform(get("/stores"))
                .andExpect(status().isOk())
                .andExpect(content().string(
                        containsString("\"name\":\"mermaid\""))
                );
    }

}