package com.example.demo.model;

public class Person {
    String name;
    private int age;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age + ",id=" + id +
                    '}';

        }
    }
