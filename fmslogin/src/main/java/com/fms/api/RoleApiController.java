package com.fms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fms.entity.User;
import com.fms.repository.UserRepository;

import reactor.core.publisher.Mono;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-22T18:02:22.909+05:30[Asia/Calcutta]")
@RestController
public class RoleApiController implements RoleApi {

    @Autowired
    private UserRepository userRepository;

 public Mono<ResponseEntity<String>> role ( @PathVariable("token") String token, @PathVariable("emailId") String emailId) {
	 return userRepository.save(new User(emailId,"admin","2"))
     		.map(user -> ResponseEntity.ok().body("succesfully assigned PMO role for "+user.getEmail()))
             .defaultIfEmpty(ResponseEntity.status(HttpStatus.NOT_FOUND).build()).log();
    	
    }

}
