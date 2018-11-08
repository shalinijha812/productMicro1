package com.stackroute.neo4jservice.domain.relation;

import com.stackroute.neo4jservice.domain.nodes.Concept;
import com.stackroute.neo4jservice.domain.nodes.Language;
import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type="isSubPartOf")
public class SubPartRelation {

    @Id
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Property
    private String name;

    @StartNode
    Concept concept1;

    @EndNode
    Concept concept2;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
