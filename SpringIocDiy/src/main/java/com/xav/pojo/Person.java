package com.xav.pojo;

public class Person {
    private int age;
    private int name;
    private int height;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public Person() {
        System.out.println("空参构造器");
    }

    public Person(int age, int name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
        System.out.println("有参构造器");
    }

    public void eat ( ) {
        System.out.println("我吃吃吃");
    }
}
