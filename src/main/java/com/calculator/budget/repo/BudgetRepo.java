package com.calculator.budget.repo;

import com.calculator.budget.model.BudgetCalculator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepo extends JpaRepository<BudgetCalculator,String> {
    BudgetCalculator findByNationalId(String nationalId);

}
