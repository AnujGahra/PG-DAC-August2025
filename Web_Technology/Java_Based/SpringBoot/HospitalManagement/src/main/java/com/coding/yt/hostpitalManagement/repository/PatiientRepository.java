package com.coding.yt.hostpitalManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coding.yt.hostpitalManagement.entity.Patient;

public interface PatiientRepository extends JpaRepository<Patient, Long> {

}
