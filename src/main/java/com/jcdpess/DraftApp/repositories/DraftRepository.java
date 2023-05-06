package com.jcdpess.DraftApp.repositories;

import com.jcdpess.DraftApp.entities.Draft;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DraftRepository extends MongoRepository<Draft, String> {
}