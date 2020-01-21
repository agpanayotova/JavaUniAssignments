package fmi.informatics;

public class Eggs {
    //boolean initiateBoiling;
    byte numberOfEggs;
    byte minutesBoiled;
    byte boilingChoice;
    boolean softBoiled;
    boolean semiHardBoiled;
    boolean hardBoiled;

    public Eggs(byte numberOfEggs, byte minutesBoiled,
                byte boilingChoice,
                boolean softBoiled,
                boolean semiHardBoiled,
                boolean hardBoiled) {

        //this.initiateBoiling = initiateBoiling;
        this.numberOfEggs = numberOfEggs;
        this.minutesBoiled = minutesBoiled;
        this.softBoiled = softBoiled;
        this.semiHardBoiled = semiHardBoiled;
        this.hardBoiled = hardBoiled;
        this.boilingChoice = boilingChoice;

    }

    public Eggs() {

    }

    public void boilingChoice(){
        if(boilingChoice == 1){
            softBoiled = true;
            for(int i = 0; i <= 3; i++){
                System.out.println("Minute " + i + " has passed. Preparing...");
            }
            System.out.println("Done! You have "+numberOfEggs+" soft boiled eggs. Bon Appetit!");
        } else if (boilingChoice == 2){
            semiHardBoiled = true;
            for(int i = 0; i <= 5; i++){
                System.out.println("Minute " + i + " has passed. Preparing...");
            }
            System.out.println("Done! You have "+numberOfEggs+" semi hard boiled eggs. Bon Appetit!");
        } else if (boilingChoice == 3){
            hardBoiled = true;
            for(int i = 0; i <= 6; i++){
                System.out.println("Minute " + i + " has passed. Preparing...");
            }
            System.out.println("Done! You have "+numberOfEggs+" hard boiled eggs. Bon Appetit!");
        }
    }
}
