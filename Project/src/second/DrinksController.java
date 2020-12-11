package second;

import service.InputScanner;

import java.util.ArrayList;
import java.util.List;

public class DrinksController {
    private static final List<Drinks> drinksList = new ArrayList<>();

    public static void addDrinks() {
        System.out.print("Name: ");
        String name = InputScanner.getString();
        System.out.print("Type: ");
        String type = InputScanner.getString();
        System.out.println("Price: ");
        double price=InputScanner.getDouble();
        Drinks drinks = new Drinks(name,type,price);
        drinksList.add(drinks);
    }

    public static int getDrinksListSize() {
        return drinksList.size();
    }

    public static Drinks getDrinks(int i) {
        return drinksList.get(i);
    }
}
