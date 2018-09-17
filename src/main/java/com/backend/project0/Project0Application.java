package com.backend.project0;

import com.backend.project0.property.FileStorageProperties;
import com.mongodb.*;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSInputFile;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProperties.class
})
public class Project0Application {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(Project0Application.class, args);

	}

//	@Bean
//	CommandLineRunner runner(){
//		return args -> {
//			Mongo mongo = new Mongo("localhost", 27017);
//			DB db = mongo.getDB("backend_upload");
//			DBCollection collection = db.getCollection("files");
//
//			//
//			// The biiiiig file to be stored to MongoDB
//			//
//			File file = new File("uploads/1439356413-MV5BMTU5Nj-o.jpg");
//
//			//
//			// Store the file to MongoDB using GRIDFS
//			//
//			GridFS gridfs = new GridFS(db, "downloads");
//			GridFSInputFile gfsFile = gridfs.createFile(file);
//			gfsFile.setFilename("sth.jpg");
//			gfsFile.save();
//
//			//
//			// Let's create a new JSON document with some "metadata" information on the download
//			//
//			BasicDBObject info = new BasicDBObject();
//			info.put("name", "MongoDB");
//			info.put("fileName", "MongoDB-OSX-2-1.2.1");
//			info.put("rawName", "mongodb-osx-x86_64-2-1.2.1.tgz");
//			info.put("rawPath", "/Users/thomasjaspers/Downloads/");
//
//			//
//			// Let's store our document to MongoDB
//			//
//			collection.insert(info, WriteConcern.SAFE);
//		};
//	}
}
