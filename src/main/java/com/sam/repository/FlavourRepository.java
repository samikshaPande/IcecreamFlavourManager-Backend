package com.sam.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import com.sam.models.FlavourModel;

@Transactional
public interface FlavourRepository extends MongoRepository<FlavourModel, String>{

}
