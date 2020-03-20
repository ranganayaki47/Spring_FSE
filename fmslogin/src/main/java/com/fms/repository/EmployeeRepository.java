package com.fms.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.fms.entity.Employee;

@Repository
public interface EmployeeRepository extends ReactiveCrudRepository<Employee,Long> {

}
