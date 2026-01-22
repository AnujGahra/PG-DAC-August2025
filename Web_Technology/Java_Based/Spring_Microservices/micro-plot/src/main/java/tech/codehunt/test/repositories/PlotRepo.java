package tech.codehunt.test.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.codehunt.test.entities.Plot;


@Repository
public interface PlotRepo extends JpaRepository<Plot, String> {
	

    // 🔥 This method will fetch plots by employeeId
    List<Plot> findByEmployeeId(String employeeId);

}
