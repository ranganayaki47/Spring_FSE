package com.fms.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.fms.entity.User;

import reactor.core.publisher.Mono;

@Repository
public interface  UserRepository extends ReactiveCrudRepository<User, Long> {

	
	@Query("select a.* ,b.employee_name as name from User a ,employee b where a.email=b.emailId and  email =:email and password = MD5(:password)")
	public Mono<User> findByEmailPassword(String email,String password);
	
	@Query("select MD5(password) as password from User where email =:email ")
	public Mono<User> findByEmail(String email);
}
