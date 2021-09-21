package com.calculator.budget.controller;

import com.calculator.budget.model.BudgetCalculator;
import com.calculator.budget.repo.BudgetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BudgetController {

    @Autowired
    private BudgetRepo budgetRepo;

@GetMapping("/mortgage/{id}")
public BudgetCalculator getMortgage(@PathVariable("id") String id){

    BudgetCalculator bCal= new BudgetCalculator();
   // bCal.setNationalId(id);
   // bCal.setMortgageValue(1000.25);
    bCal= budgetRepo.findByNationalId(id);
    return bCal;


}

}
