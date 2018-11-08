package com.stackroute.neo4jservice.domain.relation;

import com.stackroute.neo4jservice.domain.nodes.Language;
import com.stackroute.neo4jservice.domain.nodes.Source;
import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type="isA")
public class IsARelation {
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
    Source source;

    @EndNode
    Language language;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
