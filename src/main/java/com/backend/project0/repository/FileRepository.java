package com.backend.project0.repository;

import com.backend.project0.document.Files;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FileRepository extends MongoRepository<Files, Integer> {
}
