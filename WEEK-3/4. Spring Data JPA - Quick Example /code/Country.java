package com.cognizant.ormlearn.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity  // Marks this as a JPA Entity
@Table(name = "country")  // Maps to table 'country'
public class Country {

    @Id  // Primary key
    @Column(name = "code")  // Maps to 'code' column
    private String code;

    @Column(name = "name")  // Maps to 'name' column
    private String name;

    // Getter and Setter for code
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString method
    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
}
