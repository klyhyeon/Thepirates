package com.assignment.thepirates.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Holiday {
    @Id
    private Long id;
    private String holiday;
    @Transient
    private List<String> holidays = new ArrayList<>();
}
