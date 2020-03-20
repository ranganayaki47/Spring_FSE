package com.fms.api;

import com.fms.entity.DashBoard;

import io.swagger.annotations.ApiParam;
import reactor.core.publisher.Mono;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.r2dbc.core.DatabaseClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-22T18:02:22.909+05:30[Asia/Calcutta]")
@RestController
//@CrossOrigin("http://localhost:3000")
public class DashboardApiController implements DashboardApi {

    
    @Autowired
    private DatabaseClient databaseClient;
    //@CrossOrigin
public Mono<ResponseEntity<DashBoard>> dashboard ( @PathVariable("userId") String userId ) {
    	
	return databaseClient.execute("select count(*) as total_events ,sum(lives_impacted) as lives_impacted,sum(total_no_of_volunteers)as total_volunteers ,sum(total_no_of_volunteers)as total_participants from eventsummary")
    	        .as(DashBoard.class)
    	        .fetch().first()
    	        .map(dashboard -> ResponseEntity.ok(dashboard))
    	        .defaultIfEmpty(ResponseEntity.status(HttpStatus.NOT_FOUND).build()).log();
    	
    }

}
