package com.backend.project0.document;

import com.mongodb.Bytes;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.aggregation.DateOperators;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "files")
public class Files {

    @Id
    private Long _id;
    private String fileName;
    private Integer length;
    private Integer chunkSize;
    private Byte data;

    public Files(long _id, String fileName, Integer length, Integer chunkSize, Byte data) {
        this._id = _id;
        this.fileName = fileName;
        this.length = length;
        this.chunkSize = chunkSize;
        this.data = data;
    }

    public long get_id() {
        return _id;
    }

    public void set_id(long _id) {
        this._id = _id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getChunkSize() {
        return chunkSize;
    }

    public void setChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
    }

    public Byte getData() {
        return data;
    }

    public void setData(Byte data) {
        this.data = data;
    }
}
