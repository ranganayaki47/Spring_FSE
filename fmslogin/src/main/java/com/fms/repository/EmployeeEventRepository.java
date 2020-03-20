package com.fms.repository;

import org.springframework.stereotype.Repository;

import com.fms.entity.EmployeeEvent;
import com.fms.entity.EventPrimaryKey;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

@Repository
public interface EmployeeEventRepository extends ReactiveCrudRepository<EmployeeEvent,EventPrimaryKey> {

}
