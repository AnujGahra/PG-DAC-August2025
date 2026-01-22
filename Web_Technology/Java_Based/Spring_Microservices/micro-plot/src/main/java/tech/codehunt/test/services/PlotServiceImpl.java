package tech.codehunt.test.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.codehunt.test.dto.PlotDto;
import tech.codehunt.test.entities.Plot;
import tech.codehunt.test.exceptions.ResourceNotFoundException;
import tech.codehunt.test.external.client.EmployeeClient;
import tech.codehunt.test.payload.ApiResponse;
import tech.codehunt.test.repositories.PlotRepo;

@Service
public class PlotServiceImpl implements PlotService {

	@Autowired
	private PlotRepo plotRepo;

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private EmployeeClient employeeClient;

	@Override
	public ApiResponse<Plot> savePlot(PlotDto plotDto) {
		
		
//		check if employee id is present or not
		employeeClient.getSingleEmployee(plotDto.getEmployeeId());

		Plot plot = modelMapper.map(plotDto, Plot.class);
		plot.setId(UUID.randomUUID().toString());
		plot.setDatetime(LocalDateTime.now().toString());
		Plot savedPlot = plotRepo.save(plot);

		return new ApiResponse<>("SUCCESS", "PLOT DATA CREATED", savedPlot);
	}

	@Override
	public ApiResponse<List<Plot>> getAllPlots() {

		List<Plot> allPlots = plotRepo.findAll();

		if (allPlots.isEmpty()) {
			return new ApiResponse<List<Plot>>("SUCCESS", "PLOT DATA NOT FOUND", allPlots);
		}
		return new ApiResponse<List<Plot>>("SUCCESS", "PLOT DATA FOUND", allPlots);
	}

	@Override
	public ApiResponse<Plot> getSinglePlot(String id) {

		Plot singlePlot = plotRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("PLOT NOT FOUND WITH ID: " + id));

		return new ApiResponse<>("SUCCESS", "SINGLE PLOT DATA FOUND", singlePlot);
	}

	  // 🔥 CORE LOGIC FOR EMPLOYEE ID
	@Override
	public ApiResponse<List<Plot>> getPlotsByEmployeeId(String employeeId) {
		 List<Plot> plots = plotRepo.findByEmployeeId(employeeId);

	        if (plots.isEmpty()) {
	            throw new ResourceNotFoundException(
	                    "NO PLOTS FOUND FOR EMPLOYEE ID: " + employeeId);
	        }

	        return new ApiResponse<>(
	                "SUCCESS",
	                "PLOTS FOUND FOR EMPLOYEE ID: " + employeeId,
	                plots
	        );
	}

}
