package com.hr.payroll.payroll.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Worker {

    private Long id;
    private String name;
    private Double dailyIncome;
}
