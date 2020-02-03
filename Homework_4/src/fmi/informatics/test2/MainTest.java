package fmi.informatics.test2;

import fmi.informatics.events.Person;
import fmi.informatics.events.People;
public class MainTest {
    public static void main (String[] args){
        People people = new People();
        Person person = new Person("Ivan", people);

        GuiTest.getTypicalGreeting(person);
    }
}
