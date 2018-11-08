package com.stackroute.neo4jservice.service.relationservice.serviceinterface;

import com.stackroute.neo4jservice.domain.relation.Post;
import com.stackroute.neo4jservice.domain.relation.SubPartRelation;

import java.util.List;

public interface SubPartService {
    public SubPartRelation saveSubPartRelation(SubPartRelation subPartRelation);
    public List<SubPartRelation> getAllSubPartRelation();
}
