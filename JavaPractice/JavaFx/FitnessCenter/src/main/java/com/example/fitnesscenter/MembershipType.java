package com.example.fitnesscenter;

import java.io.Serializable;

public enum MembershipType implements Serializable {
    NONE("none"),
    BASIC("basic"),
    GOLD("gold"),
    PREMIUM("premium");

    String type;
    MembershipType(String type){
        this.type= type;
    }

    public String getType(){
        return type;
    }

}
