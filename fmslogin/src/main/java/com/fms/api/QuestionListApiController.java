package com.fms.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fms.entity.Answer;
import com.fms.entity.Question;
import com.fms.entity.QuestionModel;
import com.fms.entity.User;
import com.fms.repository.AnswerRepository;
import com.fms.repository.QuestionRepository;
import com.fms.repository.UserRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-22T18:02:22.909+05:30[Asia/Calcutta]")
@RestController
public class QuestionListApiController implements QuestionListApi {

    @Autowired
    private QuestionRepository questionRepository;
    
    

 public Flux<ResponseEntity<Question>> questionList () {
	 
	 
	 return questionRepository.findAll()
     		.map(user -> ResponseEntity.ok().body(user))
             .defaultIfEmpty(ResponseEntity.status(HttpStatus.NOT_FOUND).build()).log();
    	
    }

}
