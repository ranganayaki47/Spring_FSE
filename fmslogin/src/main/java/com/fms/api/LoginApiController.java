package com.fms.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fms.entity.DashBoard;
import com.fms.entity.User;
import com.fms.model.EventSummary1;
import com.fms.model.LoginCredentials;
import com.fms.model.UserInfo;
import com.fms.repository.EventSummaryRepository;
import com.fms.repository.UserRepository;
import com.fms.config.JwtTokenUtil;

import io.swagger.annotations.ApiParam;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.r2dbc.core.DatabaseClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.server.ServerResponse;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-22T18:02:22.909+05:30[Asia/Calcutta]")
@RestController
//@CrossOrigin()
public class LoginApiController implements LoginApi {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private UserDetailsService jwtInMemoryUserDetailsService;
   

    public Mono<ResponseEntity<User>> login(@Valid @RequestBody LoginCredentials loginCredentials) {
       		 
    	Mono<User> userData = userRepository.findByEmailPassword(loginCredentials.getEmailId(),loginCredentials.getPassword()).doOnError(e -> System.out.println(e.getStackTrace()) );
    	if(userData.block() != null ) { 
    	final UserDetails userDetails = jwtInMemoryUserDetailsService
				.loadUserByUsername(loginCredentials.getEmailId());

		final String  token = jwtTokenUtil.generateToken(userDetails);
    	
        return   Mono.just(ResponseEntity.ok( userData.map(data ->{data.setToken(token); return data;} ).block() ))
        		.defaultIfEmpty(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build())
                .onErrorReturn(new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR))
                .log();
    	}else {
    		return Mono.just(ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new User()));
    	}
    	
    }

}
