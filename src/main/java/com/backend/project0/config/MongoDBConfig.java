package com.backend.project0.config;

import com.backend.project0.document.Files;
import com.backend.project0.repository.FileRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = FileRepository.class)
@Configuration
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(FileRepository fileRepository) {
        return args -> {
            fileRepository.save(new Files(1,"yoyo.png"));
            fileRepository.save(new Files(2,"yoyo1.png"));
        };

    }
}
