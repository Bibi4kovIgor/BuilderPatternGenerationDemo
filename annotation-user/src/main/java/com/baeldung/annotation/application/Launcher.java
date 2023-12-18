package com.baeldung.annotation.application;

import com.baeldung.annotation.Person;
import com.baeldung.annotation.PersonBuilder;

public class Launcher {
    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .setName("Ihor")
                .setAge(32)
                .setPhone("+38097774744")
                .build();
        System.out.println(person);
    }
}

