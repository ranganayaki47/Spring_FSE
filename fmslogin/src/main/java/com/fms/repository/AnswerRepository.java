package com.fms.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.fms.entity.Answer;

public interface AnswerRepository extends ReactiveCrudRepository<Answer, Long> {

}
