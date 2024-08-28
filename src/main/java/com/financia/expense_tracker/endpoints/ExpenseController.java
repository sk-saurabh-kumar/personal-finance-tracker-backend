package com.financia.expense_tracker.endpoints;

import com.financia.expense_tracker.entity.Expense;
import com.financia.expense_tracker.services.api.IEmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api/expenses")
public class ExpenseController {
    final private IEmployeeService employeeService;

    public ExpenseController(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Expense> getExpenses() {
        return employeeService.getAllExpenses();
    }

    @PostMapping
    public Expense addExpense(@RequestBody Expense expense) {
//        expense.setId(0);
        return employeeService.addExpense(expense);
    }

}
