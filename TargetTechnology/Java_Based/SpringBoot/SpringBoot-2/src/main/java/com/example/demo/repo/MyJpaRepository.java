package com.example.demo.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Employee;

public interface MyJpaRepository extends JpaRepository<Employee, Integer> {
	
	
	@Modifying
	@Transactional
	@Query(value = "insert into employee(id, name) values(:id, :name)", nativeQuery = true)
	public int insert(@Param("id") int id, @Param("name") String name); 
	
	
	
	@Modifying
	@Transactional
	@Query(value = "delete from employee where id=:id", nativeQuery = true)
	public int delete(@Param("id") int id); 
	
	@Modifying
	@Transactional
	@Query(value = "update employee set name=:name where id=:id", nativeQuery = true)
	public int update(@Param("id") int id, @Param("name") String name);

}
