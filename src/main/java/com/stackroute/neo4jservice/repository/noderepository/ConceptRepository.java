package com.stackroute.neo4jservice.repository.noderepository;

import com.stackroute.neo4jservice.domain.nodes.Concept;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ConceptRepository extends Neo4jRepository<Concept,String> {
//    @Query("LOAD CSV WITH HEADERS FROM "file:///home/cgi/Documents/javaConcepts1.csv" AS row
//    CREATE(n:Concept{nodeid:row.node_id,name:row.name,parentnodeid:row.parent_node_id})")
}
