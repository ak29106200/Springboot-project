package com.healthhub.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestReport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String patientName;
    private int age;
    @Column(length=10,nullable = false)
    private String mob;
    private String email;
    private String test_name;
    private LocalDate test_date;
    private LocalDate test_report_date;
    private String report_remark ;
}
