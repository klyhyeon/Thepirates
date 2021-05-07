package com.assignment.thepirates.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class BusinessTimeDetail {
    @Id
    private Long id;
    private String day;
    private String open;
    private String close;
    @Transient
    private String status;

    public BusinessTimeDetail() {}

    public BusinessTimeDetail(String day, String open, String close) {
        this.day = day;
        this.open = open;
        this.close = close;
    }

    public Long getId() {
        return id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
