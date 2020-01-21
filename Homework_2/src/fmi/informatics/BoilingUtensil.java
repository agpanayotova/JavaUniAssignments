package fmi.informatics;

public class BoilingUtensil {
    boolean turkishCoffeePot = false;
    boolean pot = false;
    boolean eggBoilingMachine = false;

    public BoilingUtensil(boolean turkishCoffeePot, boolean pot,
                          boolean eggBoilingMachine) {

        this.turkishCoffeePot = turkishCoffeePot;
        this.pot = pot;
        this.eggBoilingMachine = eggBoilingMachine;
    }

    public BoilingUtensil() {

    }

    public void utensilChoice(){
        if(turkishCoffeePot){
            System.out.println("You chose a Turkish Coffee Pot!");
        }
        if(pot){
            System.out.println("You chose a Pot!");
        }
        if(eggBoilingMachine){
            System.out.println("You chose an Egg Boiling Machine!");
        }
    }
}
