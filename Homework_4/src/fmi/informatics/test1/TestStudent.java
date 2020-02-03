package fmi.informatics.test1;

import fmi.informatics.extending.Student;

public class TestStudent {
    public static void getUniversity(Student student){
        String universityExpected = "PU";
        String universityResult = student.getUniversity();

        if(universityExpected.equals(universityResult)){
            System.out.println("All good");
        } else {
            System.err.println("Not good");
            System.err.println("Expected result " + universityExpected);
            System.err.println(("Result gotten " + universityResult));
        }
    }
}
