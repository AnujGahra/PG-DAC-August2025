package tech.codehunt.test.services;

import java.util.List;

import tech.codehunt.test.dto.PlotDto;
import tech.codehunt.test.entities.Plot;
import tech.codehunt.test.payload.ApiResponse;



public interface PlotService {
    ApiResponse<Plot> savePlot(PlotDto plotDto);

    ApiResponse<List<Plot>> getAllPlots();

    ApiResponse<Plot> getSinglePlot(String id);
    
    // ✅ NEW METHOD
    ApiResponse<List<Plot>> getPlotsByEmployeeId(String employeeId);

}
