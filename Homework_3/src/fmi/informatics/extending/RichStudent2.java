package fmi.informatics.extending;

public class RichStudent2 extends Student {
    public RichStudent2(String name, int egn, String university,
                        String specialty, int facNumber){
        super(name,egn,university,specialty,facNumber);
    }

    @Override
    public String getTypicalDrink(){
        return "50 years Black Johnny";
    }
}
