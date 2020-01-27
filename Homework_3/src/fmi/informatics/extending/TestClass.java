package fmi.informatics.extending;

import java.util.ArrayList;

public class TestClass {

    public static void main(String[] args){
        ArrayList<Person> people = new ArrayList<Person>();
        Student s = new Student("Theodor", 978,"BIT", "SU", 162);
        people.add(s);
        RichStudent2 r = new RichStudent2("George", 945, "UHT", "IT", 856);
        RichStudent2 r2 = new RichStudent2("Gosho", 552, "Ot", "Pochivka",65);
        people.add(r);
        people.add(r2);
        Professor p = new Professor("Professor","P.Petrov", true, 60, 170, 80);
        people.add(p);

        showStats(people);


    }
    public static void showStats(ArrayList<Person> people){
        int stu = 0;
        int prof = 0;
        int richStu = 0;

        for( Person person : people){
            if (person instanceof Student) {
                stu++;
            }
            if(person instanceof RichStudent2){
                richStu++;
            } else if(person instanceof Professor) {
                prof++;
            }
            if(stu != 0){
                person.study();
            }
            if(richStu != 0){
                person.study();
            }
        }

        System.out.println("Number of students in the collection:" + stu);
        System.out.println("Number of rich students in the collection:" + richStu);
        System.out.println("Number of professors in the collection:" + prof);


    }
}
