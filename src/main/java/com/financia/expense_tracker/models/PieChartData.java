package com.financia.expense_tracker.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class PieChartData {
    private int id;
    private String label;
    private int value;
}
