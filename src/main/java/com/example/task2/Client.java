package com.example.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Client {
    private int id;
    public static int amount;
    private String name;
    private int age;
    private String sex;
}
