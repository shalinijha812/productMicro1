package com.stackroute.neo4jservice.repository.relationrepository;

import com.stackroute.neo4jservice.domain.relation.IsARelation;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface IsARepository extends Neo4jRepository<IsARelation,String> {
}
