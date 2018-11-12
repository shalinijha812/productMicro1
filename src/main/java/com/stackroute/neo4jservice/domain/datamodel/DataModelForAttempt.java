package com.stackroute.neo4jservice.domain.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stackroute.neo4jservice.domain.nodes.Challenge;
import com.stackroute.neo4jservice.domain.nodes.Concept;
import com.stackroute.neo4jservice.domain.nodes.Language;
import com.stackroute.neo4jservice.domain.nodes.User;
import org.neo4j.ogm.annotation.*;

public class DataModelForAttempt {


    @Id
   // @GeneratedValue
    private int id;
    @Property
    private String status;
    @Property
    private double score;
    //    @Property
//    private String name;
    @JsonIgnore
    @Property
    private Language language;
    @JsonIgnore
    @Property
    private Concept concept;
    @StartNode
    Challenge challenge;
    @EndNode
    User user;

    public DataModelForAttempt() {
    }

    public DataModelForAttempt(int id, String status, double score, Language language, Concept concept, Challenge challenge, User user) {
        this.id = id;
        this.status = status;
        this.score = score;
        this.language = language;
        this.concept = concept;
        this.challenge = challenge;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Concept getConcept() {
        return concept;
    }

    public void setConcept(Concept concept) {
        this.concept = concept;
    }

    public Challenge getChallenge() {
        return challenge;
    }

    public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "DataModelForAttempt{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", score=" + score +
                ", language=" + language +
                ", concept=" + concept +
                ", challenge=" + challenge +
                ", user=" + user +
                '}';
    }
}

