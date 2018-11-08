package com.stackroute.neo4jservice.service.relationservice.serviceinterface;

import com.stackroute.neo4jservice.domain.nodes.Concept;
import com.stackroute.neo4jservice.domain.relation.Attempt;

import java.util.List;

public interface AttemptService {
    public Attempt saveAttempt(Attempt attempt);
    //public String deleteUser(String id);
    public List<Attempt> getAllAttempts();
}
