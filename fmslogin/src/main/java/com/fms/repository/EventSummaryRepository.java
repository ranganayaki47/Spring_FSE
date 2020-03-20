package com.fms.repository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.r2dbc.core.DatabaseClient;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.fms.entity.EventSummary;
import com.fms.entity.Test;

import reactor.core.publisher.Mono;

@Repository
public interface EventSummaryRepository extends ReactiveCrudRepository<EventSummary,Long>  {
	
	
	
	
	@Query("SELECT new com.fms.model.EventSummary1(c.livesImpacted) FROM  com.fms.entity.EventSummary AS c")
	//@Query("select count(*) as totalEvents ,sum(lives_impacted) as livesImpacted,sum(total_no_of_volunteers)as totalVolunteers ,sum(total_no_of_volunteers)as totalParticipants from eventsummary;")
	public Mono<com.fms.model.EventSummary1> adminDashBoard();
	
	
	
	

}
