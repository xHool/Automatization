import Models.Additional;
import Models.Coffee;
import Models.ColdCoffee;
import Models.HotCoffee;
import Models.Machine;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreatingData {

  public static Machine creatingCafes() {
    Map<String, List<Coffee>> coffesList = new HashMap();
    List<Coffee> coldCoffees = new ArrayList<>();
    List<Coffee> hotCoffees = new ArrayList<>();

    /* Creatin Cold Coffess */
    ColdCoffee coldCoffeeOne = new ColdCoffee(
      "Cold Brew",
      "El Cold Brew es un tipo de café que se prepara utilizando agua a baja temperatura. Básicamente se trata de un tipo de elaboración donde el café es sometido a temperaturas frías o a temperatura ambiente por un tiempo prolongado"
    );
    ColdCoffee coldCoffeeTwo = new ColdCoffee(
      "Affogato",
      "El Affogato es una preparación originaria de Italia, que muchos consideran un postre más que un tipo de café, ya que para su elaboración se utiliza una porción de helado"
    );
    ColdCoffee coldCoffeeThree = new ColdCoffee(
      "Cold Drip",
      "El Cold Drip es otra forma de preparación del café en la cual se separa el agua fría del café molido, utilizando para ello un aparato llamado “torre de goteo”. "
    );

    /* Creatin Hot Coffess */
    HotCoffee hotCoffeeOne = new HotCoffee(
      "Macchiato",
      "El café macchiato es un tipo de café caliente que tiene como base un espresso, al cual se le pone una pizca de leche que mancha el color negro de la bebida."
    );
    HotCoffee hotCoffeeTwo = new HotCoffee(
      "American",
      "Entre los tipos de café caliente más conocidos y consumidos a diario también se encuentra el café americano. "
    );
    HotCoffee hotCoffeeThree = new HotCoffee(
      "Capuchino",
      "Toda cafetería que se respete tiene entre sus ofertas de bebida el café capuchino. "
    );

    coldCoffees.add(coldCoffeeOne);
    coldCoffees.add(coldCoffeeTwo);
    coldCoffees.add(coldCoffeeThree);

    hotCoffees.add(hotCoffeeOne);
    hotCoffees.add(hotCoffeeTwo);
    hotCoffees.add(hotCoffeeThree);

    coffesList.put("Hot Coffee", hotCoffees);
    coffesList.put("Cold Coffee", coldCoffees);

    Machine machine = new Machine(coffesList);

    return machine;
  }

  public static List<Additional> creatingAdditions() {
    Additional aditAdditional1 = new Additional("Hielo", "HJielo", "Cold");
    Additional aditAdditional2 = new Additional(
      "Crema Chantiyi",
      "HJielo",
      "Cold"
    );
    Additional aditAdditional3 = new Additional("Helado", "HJielo", "Cold");

    Additional aditAdditional4 = new Additional(
      "Espuma de leche al vapor",
      "HJielo",
      "Hot"
    );
    Additional aditAdditional5 = new Additional("Leche", "HJielo", "Hot");
    Additional aditAdditional6 = new Additional(
      "Leche Descremada",
      "HJielo",
      "Hot"
    );

    List<Additional> additionals = new ArrayList<>();

    additionals.add(aditAdditional1);
    additionals.add(aditAdditional2);
    additionals.add(aditAdditional3);
    additionals.add(aditAdditional4);
    additionals.add(aditAdditional5);
    additionals.add(aditAdditional6);

    return additionals;
  }
}
