import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Models.Additional;
import Models.Coffee;
import Models.Machine;

public class InterfazApp {

    private static void creatingCafe(Machine machine, List<Additional> additionals) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<Coffee>> coffesAvailables = machine.getCoffesAvailables();
        System.out.println();
        int count = 1;
        for (String key : coffesAvailables.keySet()) {
            System.out.println(  count + ": " + key);
            count ++;
        }
        System.out.print("Seleccione una de las opciones: ");
        String option = sc.nextLine().equals("1") ? 
    }

    public static void iniApp(Machine machine, List<Additional> additionals) {
        Scanner sc = new Scanner(System.in);
        int option = -1;
        do {
            System.out.println("Welcome to old Luci's coffee dispenser.");
            System.out.println("What do you want to do?");
            System.out.println("1. Create a cafe");
            System.out.println("2. Go out");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    creatingCafe(machine, additionals);
                    System.out.println();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("The option entered is not correct.");
            }

        } while (option != 0);

    }
}
