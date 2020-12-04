package second;

import service.InputScanner;

import java.util.ArrayList;
import java.util.List;

import static second.Controller.inputDrinks;

public class DrinksController {
    public static List<Drinks> drinksList = new ArrayList<>();

    public static void addDrinks() {
        System.out.print("Name: ");
        String name = InputScanner.scanner.nextLine();
        System.out.print("Type: ");
        String type = InputScanner.scanner.nextLine();
        System.out.println("Price: ");
        double price=InputScanner.scanner.nextDouble();
        InputScanner.scanner.nextLine();
        Drinks drinks = new Drinks(name,type,price);
        drinksList.add(drinks);
    }
}
