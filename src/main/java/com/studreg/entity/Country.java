package com.studreg.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Country")
public class Country {
    private String countryName;
    private String state;
   
    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    
    
}
