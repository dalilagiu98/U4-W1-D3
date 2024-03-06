package entities;

import java.util.ArrayList;
import java.util.List;

public class Sim {
    //ATTRIBUTE LIST:
    private String number;
    private int credit;
    private List<Calls> calls;

    //CONSTRUCTOR:

    public Sim(String number) {
        this.number = number;
        this.credit = 0;
        this.calls = new ArrayList<>();
    }

    //METHODS:

    public void addCall(Calls call) {
        this.calls.add(call);
    }
    public static void printSim(Sim sim) {
        System.out.println("Your number is: " + sim.number + ", your credit is " + sim.credit + " , the lasts five calls are:");
        if (sim.calls.isEmpty() ) {
            System.out.println("There are no calls!");
        } else {
            for (Calls call : sim.calls) {
                System.out.println(call);
            }
        }
    }

}
