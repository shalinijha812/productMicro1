package com.stackroute.neo4jservice.repository.relationrepository;

import com.stackroute.neo4jservice.domain.relation.PartOfRelation;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PartOfRepository extends Neo4jRepository<PartOfRelation,String> {
}
