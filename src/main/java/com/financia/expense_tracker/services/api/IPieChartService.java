package com.financia.expense_tracker.services.api;

import com.financia.expense_tracker.models.PieChartData;

import java.util.List;

public interface IPieChartService {
    public List<PieChartData> getPieChartData();
}
