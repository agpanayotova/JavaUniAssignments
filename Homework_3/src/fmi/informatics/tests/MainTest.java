package fmi.informatics.tests;

import fmi.informatics.extending.Student;

public class MainTest {
    public static void main(String[] args) {
       // Student student = new Student();
        Student student = new Student("Theodor", 978,"BIT", "SU", 162);
        StudentTest.getUniversity(student);
    }
}
