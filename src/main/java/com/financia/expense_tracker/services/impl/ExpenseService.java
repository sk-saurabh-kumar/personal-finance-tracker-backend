package com.financia.expense_tracker.services.impl;

import com.financia.expense_tracker.entity.Expense;
import com.financia.expense_tracker.repository.ExpenseRepository;
import com.financia.expense_tracker.services.api.IEmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService implements IEmployeeService {
    final private ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    @Override
    public Expense addExpense(Expense expense) {
        return expenseRepository.save(expense);
    }
}
