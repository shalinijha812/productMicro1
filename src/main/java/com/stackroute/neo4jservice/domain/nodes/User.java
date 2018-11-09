package com.stackroute.neo4jservice.domain.nodes;

import org.neo4j.ogm.annotation.*;

import java.util.List;

@NodeEntity
public class User{

    @Property

    private String id;
    @Property
    @Id
    private String name;
    @Property
    private String preferredLang;

    public User(String id,String name, String preferredLang) {
        this.id=id;
        this.name = name;
        this.preferredLang = preferredLang;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreferredLang() {
        return preferredLang;
    }

    public void setPreferredLang(String preferredLang) {
        this.preferredLang = preferredLang;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Relationship(type="isPostedBy",direction=Relationship.INCOMING)
    List<Challenge> challengeP;
    @Relationship(type="isAttemptedBy",direction=Relationship.INCOMING)
    List<Challenge> challengeA;
}
