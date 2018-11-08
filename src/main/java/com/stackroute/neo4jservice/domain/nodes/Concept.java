package com.stackroute.neo4jservice.domain.nodes;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Concept {

    @Property
    @Id
    private String nodeid;
    @Property
    private String name;
    @Property
    private String parentnodeid;

    public Concept(String nodeid, String name, String parentnodeid) {
        this.nodeid = nodeid;
        this.name = name;
        this.parentnodeid = parentnodeid;
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentnodeid() {
        return parentnodeid;
    }

    public void setParentnodeid(String parentnodeid) {
        this.parentnodeid = parentnodeid;
    }
    @Relationship(type="isPartOf",direction=Relationship.INCOMING)
    Language language;
    @Relationship(type="isSubPartOf",direction=Relationship.OUTGOING)
    Concept concept;
}
