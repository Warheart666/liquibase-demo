package com.example.liquibasedemo;


import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Test {

    private String name;
    private long id;

}
