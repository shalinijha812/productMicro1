package com.stackroute.neo4jservice.domain.relation;

import com.stackroute.neo4jservice.domain.nodes.Challenge;
import com.stackroute.neo4jservice.domain.nodes.Concept;
import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type="isTypeOf")
public class TypeRelation {

   @Id
    private String id;
   @Property
    private String name;

    @StartNode
    Challenge challenge;
    @EndNode
    Concept concept;

    public TypeRelation() {
    }
    public TypeRelation(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Challenge getChallenge() {
        return challenge;
    }

    public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }

    public Concept getConcept() {
        return concept;
    }

    public void setConcept(Concept concept) {
        this.concept = concept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TypeRelation{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", challenge=" + challenge +
                ", concept=" + concept +
                '}';
    }
}
