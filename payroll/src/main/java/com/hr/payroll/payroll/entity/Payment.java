package com.hr.payroll.payroll.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double dailyIncome;
    private Integer days;

    public Payment(String name, Double dailyIncome, Integer days) {
        this.name = name;
        this.dailyIncome = dailyIncome;
        this.days = days;
    }

    public double getTotal(){
        return days * dailyIncome;
    }

}