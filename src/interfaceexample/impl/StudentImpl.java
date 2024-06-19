package interfaceexample.impl;

import interfaceexample.Student;

public class StudentImpl extends School {

    public static void age(){
        System.out.println("24");
    }

    public static void main(String[] args) {
        StudentImpl student=new StudentImpl();
        student.name();
        age();
    }
}
