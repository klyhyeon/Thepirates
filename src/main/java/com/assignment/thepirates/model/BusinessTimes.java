package com.assignment.thepirates.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Builder
public class BusinessTimes {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    private Store store; //store νμ΄λΈμ id

    private String day;

    private String open;

    private String close;

}