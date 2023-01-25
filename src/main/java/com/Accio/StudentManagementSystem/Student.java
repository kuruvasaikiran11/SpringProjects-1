package com.Accio.StudentManagementSystem;

public class Student {
    private String name;
    private int age;
    private int admNo;
    private String state;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAdmNo(int admNo) {
        this.admNo = admNo;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getAdmNo() {
        return admNo;
    }

    public String getState() {
        return state;
    }

    public Student(String name, int age, int admNo, String state) {
        this.name = name;
        this.age = age;
        this.admNo = admNo;
        this.state = state;
    }
}
