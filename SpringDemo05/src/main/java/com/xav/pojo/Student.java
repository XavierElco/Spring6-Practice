package com.xav.pojo;

public class Student {
    private Clazz clazz;

    public Student() {
    }

    public Student(Clazz clazz) {
        this.clazz = clazz;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "clazz=" + clazz +
                '}';
    }
}
