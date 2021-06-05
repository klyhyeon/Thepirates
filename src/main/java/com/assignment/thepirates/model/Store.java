package com.assignment.thepirates.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Builder
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String owner;

    private String description;

    private int level;

    private String address;

    private String phone;

    @OneToMany(mappedBy = "store")
    List<BusinessTimes> businessTimesList;

    @OneToMany(mappedBy = "store")
    List<Holiday> holidayList;

}
