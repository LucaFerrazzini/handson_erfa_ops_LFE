package com.herkoemmlich.db.domain;

import lombok.Data;

@Data
public class Customer {
    private int id;
    public int age;
    public String canton;
    public String sex;
}
