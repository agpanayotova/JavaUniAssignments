package fmi.informatics.test2;

import fmi.informatics.events.Person;

public class GuiTest {
    public static void getTypicalGreeting(Person person){
        String typicalGreeting = "The person Ivan greets People";
        String typicalResult = person.talk();

        if (assertString(typicalGreeting, typicalResult)) {
            System.out.println("Method getTypicalDrink() from class Student returns what is expected");
        } else {
            System.err.println(
                    "Method getTypicalDrink() from class Student returns: " +
                            typicalResult + ", but the expected result is: " +
                            typicalGreeting
            );
        }
    }

    public static boolean assertString(String result, String expectedResult) {
        return result.equals(expectedResult);
    }

}

