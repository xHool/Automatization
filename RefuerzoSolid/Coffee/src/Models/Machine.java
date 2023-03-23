package Models;

import java.util.List;
import java.util.Map;

public class Machine {
    private static List<Coffee> coffees;

    private Map<String, List<Coffee>> coffesAvailables;

    public Machine(Map<String, List<Coffee>> coffesAvailables) {
        this.coffesAvailables = coffesAvailables;
    }

    public static List<Coffee> getCoffees() {
        return coffees;
    }

    public static void setCoffees(List<Coffee> coffees) {
        Machine.coffees = coffees;
    }

    public Map<String, List<Coffee>> getCoffesAvailables() {
        return coffesAvailables;
    }

    public void setCoffesAvailables(Map<String, List<Coffee>> coffesAvailables) {
        this.coffesAvailables = coffesAvailables;
    }

}
