package com.stackroute.neo4jservice.service.nodeservice;

import com.stackroute.neo4jservice.domain.nodes.Concept;

import java.util.List;

public interface ConceptService {
    public Concept saveConcept(Concept concept);
    public String deleteConcept(String id);
    public List<Concept> getAllConcepts();

}
