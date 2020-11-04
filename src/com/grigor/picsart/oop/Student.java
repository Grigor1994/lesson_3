package com.grigor.picsart.oop;

public class Student {
    private String firstName;
    private String lastName;
    private String faculty;
    private int age;

    public void printStudentInfo() {
        System.out.println("First name: " + firstName + "\nLast name: " + lastName + "\nFaculty: " + faculty + "\nAge: " + age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
