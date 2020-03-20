package com.fms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.r2dbc.core.DatabaseClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fms.entity.PMOUser;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-22T18:02:22.909+05:30[Asia/Calcutta]")
@RestController
public class PMOUserListApiController implements PMOUserListApi {

    @Autowired
    private DatabaseClient databaseClient;

 public Flux<ResponseEntity<PMOUser>> getPMOUser () {
	 
	 return  databaseClient.execute("select employee_name as first_name , '' as last_name ,a.emailId as email_id from employee a ,user b where emailId = b.email and role_id=2")
 	        .as(PMOUser.class)
 	        .fetch().all()
 	       .map(user -> {System.out.println("fname:"+user.getEmailId()) ; return ResponseEntity.ok(user); })
	        .defaultIfEmpty(ResponseEntity.status(HttpStatus.NOT_FOUND).build()).log();
    	
    }

}
