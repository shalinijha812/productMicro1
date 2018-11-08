package com.stackroute.neo4jservice.service.relationservice.serviceimpl;

import com.stackroute.neo4jservice.domain.relation.Attempt;
import com.stackroute.neo4jservice.domain.relation.IsARelation;
import com.stackroute.neo4jservice.repository.relationrepository.AttemptRepository;
import com.stackroute.neo4jservice.repository.relationrepository.IsARepository;
import com.stackroute.neo4jservice.service.relationservice.serviceinterface.IsARelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IsARelationImpl implements IsARelationService {
    IsARepository isARepository;
    @Autowired
    public IsARelationImpl(IsARepository isARepository)
    {
        this.isARepository=isARepository;
    }

    @Override
    public IsARelation saveIsARelation(IsARelation isARelation) {
        IsARelation savedIsARelation = isARepository.save(isARelation);
        return savedIsARelation;
    }

    @Override
    public List<IsARelation> getAllIsARelation() {
        return (List<IsARelation>)isARepository.findAll();
    }
}
