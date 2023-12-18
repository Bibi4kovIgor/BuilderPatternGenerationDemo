package com.baeldung.annotation;

import com.baeldung.annotation.processor.BuilderProperty;

public class Person {

    private int age;

    private String name;

    private String phone;

    public int getAge() {
        return age;
    }

    @BuilderProperty
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @BuilderProperty
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    @BuilderProperty
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
