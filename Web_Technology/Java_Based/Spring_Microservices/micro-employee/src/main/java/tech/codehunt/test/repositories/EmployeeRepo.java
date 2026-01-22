package tech.codehunt.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.codehunt.test.entities.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, String> {

}
