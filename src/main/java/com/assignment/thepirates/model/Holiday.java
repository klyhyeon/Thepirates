package com.assignment.thepirates.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Builder
public class Holiday {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    private Store store;

    private LocalDateTime holiday;
}
