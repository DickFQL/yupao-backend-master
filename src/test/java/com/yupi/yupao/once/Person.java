package com.yupi.yupao.once;

import lombok.Data;

import java.util.stream.Stream;

@Data
public class Person {
    private int id;

    private String name;

    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


}
