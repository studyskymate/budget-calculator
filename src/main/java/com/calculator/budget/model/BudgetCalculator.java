package com.calculator.budget.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "budget_calculator")
public class BudgetCalculator implements Serializable {
    @Id
    private String nationalId;
    private Double mortgageValue;

    public BudgetCalculator() {
    }


}
