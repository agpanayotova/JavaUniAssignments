package fmi.informatics.test1;

import fmi.informatics.extending.Student;

public class MainTest {
    public static void main(String[] args) {
        Student student = new Student("Theodor", 978,"BIT", "SU", 162);
        TestStudent.getUniversity(student);
    }
}
