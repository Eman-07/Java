package com.example.fitnesscenter;

import java.io.Serializable;

public enum Gender implements Serializable {

    MALE("M"),
    FEMALE("F"),
    NOTSPECIFIE("NA");

    String type;
    Gender(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}