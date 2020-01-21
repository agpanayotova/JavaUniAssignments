package fmi.informatics;
import java.util.Scanner;


public class Test {

    public static void main(String[] args) {
        readInstructions();
    }

    public static void readInstructions() {
        Scanner scan = new Scanner(System.in);
        Eggs eggs = new Eggs();
        BoilingUtensil boilingUtensil = new BoilingUtensil();
        String anyKeyToContinue;

        System.out.println("Hello! Are you ready " +
                "to boil some eggs? (Press any key to continue...)");
        anyKeyToContinue = scan.nextLine();
        System.out.println("How many eggs do you want to boil? (1-10)");
        eggs.numberOfEggs = scan.nextByte();

        switch (eggs.numberOfEggs) {
            case 1:
            case 2:
            case 3: {
                boilingUtensil.turkishCoffeePot = true;
                boilingUtensil.utensilChoice();
                break;
            }
            case 4:
            case 5:
            case 6: {
                boilingUtensil.pot = true;
                boilingUtensil.utensilChoice();
                break;
            }
            case 7:
            case 8:
            case 9:
            case 10: {
                boilingUtensil.eggBoilingMachine = true;
                boilingUtensil.utensilChoice();
                break;
            }
        }

        System.out.println("|MENU| What do you want your eggs to be?");
        System.out.println("1 - Soft Boiled \n" +
                "2 - Semi Hard Boiled \n" +
                "3 - Hard Boiled");
        eggs.boilingChoice = scan.nextByte();
        eggs.boilingChoice();
    }
}
