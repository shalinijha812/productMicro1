package com.stackroute.neo4jservice.service.relationservice.serviceinterface;


import com.stackroute.neo4jservice.domain.relation.PartOfRelation;

import java.util.List;

public interface PartOfRelationService {
    public PartOfRelation savePartOfRelation(PartOfRelation PartOfRelation);
    public List<PartOfRelation> getAllPartOfRelation();
}
