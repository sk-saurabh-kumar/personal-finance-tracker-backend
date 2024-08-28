package com.financia.expense_tracker.services.impl;

import com.financia.expense_tracker.entity.Expense;
import com.financia.expense_tracker.models.PieChartData;
import com.financia.expense_tracker.repository.ExpenseRepository;
import com.financia.expense_tracker.services.api.IPieChartService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PieChartService implements IPieChartService {
    final private ExpenseRepository expenseRepository;

    public PieChartService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public List<PieChartData> getPieChartData() {
        List<Expense> expenses = expenseRepository.findAll();

        Map<String, Integer> expensesMappedWithType = expenses.stream()
                .collect(Collectors.groupingBy(Expense::getType, Collectors.summingInt(Expense::getAmount)));

        List<PieChartData> pieChartData = new ArrayList<>();
        int id = 1;

        for(Map.Entry<String, Integer> entry : expensesMappedWithType.entrySet()) {
            pieChartData.add( new PieChartData(id++, entry.getKey(), entry.getValue()));
        }

        return pieChartData;
    }
}
