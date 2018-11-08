package com.stackroute.neo4jservice.domain.nodes;


import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Challenge {

    @Property
    @Id
    private String id;
    @Property
    private String title;
    @Property
    private double level;
    @Property
    private String topic;
    @Property
    private String language;
    @Property
    private String smallDescription;
    @Property
    private String userName;

    public Challenge(String id,String title,double level, String topic, String language, String smallDescription, String userName) {

        this.id=id;
        this.level = level;
        this.topic = topic;
        this.language = language;
        this.smallDescription = smallDescription;
        this.userName = userName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSmallDescription() {
        return smallDescription;
    }

    public void setSmallDescription(String smallDescription) {
        this.smallDescription = smallDescription;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Relationship(type="isTypeOf",direction=Relationship.OUTGOING)
    Concept concept;
//    @Relationship(type="isPostedBy",direction=Relationship.OUTGOING)
//    User user1;
//    @Relationship(type="isAttemptedBy",direction=Relationship.OUTGOING)
//    User user2;
}
