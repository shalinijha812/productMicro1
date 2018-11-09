package com.stackroute.neo4jservice.Controller.relationcontroller;

import com.stackroute.neo4jservice.domain.nodes.Challenge;
import com.stackroute.neo4jservice.domain.nodes.Concept;
import com.stackroute.neo4jservice.domain.relation.Attempt;
import com.stackroute.neo4jservice.service.nodeservice.ConceptService;
import com.stackroute.neo4jservice.service.relationservice.serviceinterface.AttemptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class AttemptController {
    private AttemptService attemptService;

    @Autowired
    public AttemptController(AttemptService attemptService) {
        this.attemptService = attemptService;
    }

    @PostMapping("attempt")
    public ResponseEntity<?> saveAttempt(@RequestBody Attempt attempt) {
        ResponseEntity responseEntity;
        Attempt savedAttempt = attemptService.saveAttempt(attempt);
        responseEntity = new ResponseEntity<Attempt>(savedAttempt, HttpStatus.CREATED);

        return responseEntity;
    }
    @GetMapping("attempt")
    public ResponseEntity<?> getAllAttempts()
    {
        List<Attempt> attemptList;
        attemptList=attemptService.getAllAttempts();
        ResponseEntity responseEntity=new ResponseEntity<List<Attempt>>(attemptList,HttpStatus.OK);
        return responseEntity;
    }
    @DeleteMapping("attempt/{id}")
    public ResponseEntity<?> deleteAttempt(@PathVariable("id") String id) {
        List<Attempt> attemptList;
        ResponseEntity responseEntity;
        String message = attemptService.deleteAttempt(id);
        responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
        return responseEntity;
    }
}
