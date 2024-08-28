package com.financia.expense_tracker.endpoints;

import com.financia.expense_tracker.models.PieChartData;
import com.financia.expense_tracker.services.api.IPieChartService;
import com.financia.expense_tracker.services.impl.PieChartService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api/pieChartData")
public class PieChartController {
    final private IPieChartService pieChartService;

    public PieChartController(IPieChartService pieChartService) {
        this.pieChartService = pieChartService;
    }

    @GetMapping
    public List<PieChartData> getPieChartData() {
        return pieChartService.getPieChartData();
    }
}
