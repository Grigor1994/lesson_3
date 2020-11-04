package com.grigor.picsart.oop;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFirstName("Grigor");
        student1.setLastName("Avetisyan");
        student1.setFaculty("Computer Science");
        student1.setAge(25);
        student1.printStudentInfo();

        System.out.println();

        Student student2 = new Student();
        student2.setFirstName("John");
        student2.setLastName("Smith");
        student2.setFaculty("Mathematics");
        student2.setAge(18);
        student2.printStudentInfo();
    }
}
