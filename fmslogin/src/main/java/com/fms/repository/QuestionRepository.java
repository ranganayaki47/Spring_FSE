package com.fms.repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.fms.entity.Question;

import reactor.core.publisher.Mono;

@Repository
public interface QuestionRepository extends ReactiveCrudRepository<Question, Long>{
	
	@Query("select * from Question q where q.question =:name")
	public Mono<Question> findByName(String name);

}
