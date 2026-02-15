package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repository.EmployeeRepository;

@Service
public class MyServiceImpl implements MyService {
	
	
	@Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ModelMapper modelMapper;

    // CREATE
    @Override
    public EmployeeEntity insert(EmployeeDTO employeeDTO) {

        EmployeeEntity entity = modelMapper.map(employeeDTO, EmployeeEntity.class);
        entity.setDate(LocalDate.now());

        return employeeRepository.save(entity);
    }

    // READ - ALL
    @Override
    public List<EmployeeEntity> getAll() {
        return employeeRepository.findAll();
    }

    // READ - BY ID
    @Override
    public EmployeeEntity getById(int id) {
        return employeeRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Employee not found with id " + id));
    }

    // UPDATE
    @Override
    public EmployeeEntity update(int id, EmployeeDTO employeeDTO) {

        EmployeeEntity existing = employeeRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Employee not found with id " + id));

        modelMapper.map(employeeDTO, existing);

        return employeeRepository.save(existing);
    }

    // DELETE
    @Override
    public void deleteById(int id) {

        if (!employeeRepository.existsById(id)) {
            throw new RuntimeException("Employee not found with id " + id);
        }

        employeeRepository.deleteById(id);
    }


}
