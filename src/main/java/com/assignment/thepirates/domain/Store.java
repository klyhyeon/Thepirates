package com.assignment.thepirates.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Store {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String owner;
    private String description;
    private int level;
    private String address;
    private String phone;
    @Transient
    private List<BusinessTimeDetail> businessTimes = new ArrayList<>();
    @Transient
    private String businessStatus;

    public Store() {}

    public Store(String name, String owner, String description, int level, String address, String phone) {
        this.name = name;
        this.owner = owner;
        this.description = description;
        this.level = level;
        this.address = address;
        this.phone = phone;
    }

    public Store(String name, String owner, String description, int level, String address, String phone, List<BusinessTimeDetail> businessTimes) {
        this.name = name;
        this.owner = owner;
        this.description = description;
        this.level = level;
        this.address = address;
        this.phone = phone;
        this.businessTimes = businessTimes;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<BusinessTimeDetail> getBusinessTimes() {
        return businessTimes;
    }

    public void setBusinessTimes(List<BusinessTimeDetail> businessTimes) {
        this.businessTimes = businessTimes;
    }

    public String getBusinessStatus() {
        return businessStatus;
    }

    public void setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
    }
}
