package com.stackroute.neo4jservice.repository.noderepository;

import com.stackroute.neo4jservice.domain.nodes.Concept;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ConceptRepository extends Neo4jRepository<Concept,String> {
}
