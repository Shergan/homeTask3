package com.divashchenko;

public class Student {
    private String name;
    private Group group;

    public Student(String name) {
        this.name = name;
    }

    public void setGroup(Group newGroup) {
        group = newGroup;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                '}';
    }
}
