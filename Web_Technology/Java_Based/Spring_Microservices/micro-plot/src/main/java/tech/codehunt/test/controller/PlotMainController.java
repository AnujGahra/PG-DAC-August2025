package tech.codehunt.test.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.codehunt.test.dto.PlotDto;
import tech.codehunt.test.entities.Plot;
import tech.codehunt.test.payload.ApiResponse;
import tech.codehunt.test.services.PlotService;



@RestController
@RequestMapping("/api/plots")
public class PlotMainController {
	
	@Autowired
	private PlotService plotService;

//	SaveEmployee
	@PostMapping
	public ResponseEntity<ApiResponse<Plot>> savePlot(@Valid @RequestBody PlotDto plotDto) {
		ApiResponse<Plot> savedPlotResponse = plotService.savePlot(plotDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedPlotResponse);
	}

//	getAllEmployee	
	@GetMapping
	public ResponseEntity<ApiResponse<List<Plot>>> getAllPlots() {

		ApiResponse<List<Plot>> allPlotsResponse = plotService.getAllPlots();
		return ResponseEntity.ok(allPlotsResponse);
	}

//	getSingleEmployee
	@GetMapping("/{id}")
	public ResponseEntity<ApiResponse<Plot>> getSinglePlot(@PathVariable String id) {

		ApiResponse<Plot> singlePlotResponse = plotService.getSinglePlot(id);
		return ResponseEntity.ok(singlePlotResponse);
	}
	

    // 🔥 GET PLOTS BY EMPLOYEE ID
    @GetMapping("/employee/{employeeId}")
    public ResponseEntity<ApiResponse<List<Plot>>> getPlotsByEmployeeId(
            @PathVariable String employeeId) {

        return ResponseEntity.ok(
                plotService.getPlotsByEmployeeId(employeeId));
    }

}
