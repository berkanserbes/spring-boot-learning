package com.jetbrains.berkan.photos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class Photo {
    private String id;

    @NotEmpty
    private String fileName;

    public Photo() {};
    public Photo(String id, String fileName) {
        this.id = id;
        this.fileName = fileName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
