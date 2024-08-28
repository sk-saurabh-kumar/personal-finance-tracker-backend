package com.financia.expense_tracker.services.api;

import com.financia.expense_tracker.entity.Expense;

import java.util.List;

public interface IEmployeeService {
    public List<Expense> getAllExpenses();

    public Expense addExpense(Expense expense);
}
