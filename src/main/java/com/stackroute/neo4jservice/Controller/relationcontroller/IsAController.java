package com.stackroute.neo4jservice.Controller.relationcontroller;


import com.stackroute.neo4jservice.domain.relation.IsARelation;

import com.stackroute.neo4jservice.service.relationservice.serviceinterface.IsARelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class IsAController {
    private IsARelationService isARelationService;

    @Autowired
    public IsAController(IsARelationService isARelationService) {
        this.isARelationService =isARelationService;
    }

    @PostMapping("is_a")
    public ResponseEntity<?> saveIsARelation(@RequestBody IsARelation isARelation) {
        ResponseEntity responseEntity;
        IsARelation savedIsARelation = isARelationService.saveIsARelation(isARelation);
        responseEntity = new ResponseEntity<IsARelation>(savedIsARelation, HttpStatus.CREATED);

        return responseEntity;
    }
    @GetMapping("is_a")
    public ResponseEntity<?> getAllIsARelation()
    {
        List<IsARelation> isARelationList;
        isARelationList=isARelationService.getAllIsARelation();
        ResponseEntity responseEntity=new ResponseEntity<List<IsARelation>>(isARelationList,HttpStatus.OK);
        return responseEntity;
    }
}
