package Exercise2;

import entities.Calls;
import entities.Sim;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert your phone number:");
        String myNumber = scanner.nextLine();
        Sim sim = new Sim(myNumber);
        System.out.println("You have created a SIM");
        Sim.printSim(sim);

        int initializer = 0;

        while (initializer < 5) {
            System.out.println("You have made a call. Insert the number called and the duration of the call:");
            String number = scanner.nextLine();
            double duration = Double.parseDouble(scanner.nextLine());
            Calls call = new Calls(number, duration);
            sim.addCall(call);
            initializer++;
        }
        System.out.println("Your information now are:");
        Sim.printSim(sim);
    }
}
