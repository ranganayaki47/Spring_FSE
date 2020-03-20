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

import reactor.core.publisher.Mono;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-22T18:02:22.909+05:30[Asia/Calcutta]")
@RestController
public class QuestionApiController implements QuestionApi {

    @Autowired
    private QuestionRepository questionRepository;
    
    @Autowired
    private AnswerRepository answerRepository;

 public Mono<ResponseEntity<String>> question ( @RequestBody QuestionModel questionModel) {
	 
	 Question question = new Question(questionModel.getQuestion(),questionModel.getFeedbackType(),0);
	 List<Answer> answerList = new ArrayList<Answer>();
	 questionRepository.save(question).log().block();
	 Mono<Question> fetchedQuestion= questionRepository.findByName(questionModel.getQuestion()).log();
	 questionModel.getAnswers().stream().forEach(ans -> answerList.add(new Answer(ans.getAnswer(),fetchedQuestion.block().getId())));
	 answerRepository.saveAll(answerList).log().subscribe();
	  
	 return Mono.just(ResponseEntity.ok("save successfully"))
			 .defaultIfEmpty(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    	
    }

}
