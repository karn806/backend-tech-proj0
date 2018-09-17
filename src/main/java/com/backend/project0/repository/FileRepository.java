package com.backend.project0.repository;

import com.backend.project0.document.Files;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FileRepository{
    List<Files> getAll();
}
