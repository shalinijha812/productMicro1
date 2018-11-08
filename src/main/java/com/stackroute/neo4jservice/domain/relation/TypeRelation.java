package com.stackroute.neo4jservice.domain.relation;

import org.neo4j.ogm.annotation.RelationshipEntity;

@RelationshipEntity(type="isTypeOf")
public class TypeRelation {
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
