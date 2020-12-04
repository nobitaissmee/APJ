package second;

import service.InputScanner;

import static second.DrinksController.addDrinks;

public class Controller {
    public static void menu() {
        int choose = -1;
        while (choose != 0) {
            System.out.println("MENU");
            System.out.println("1. Order Drinks");
            System.out.println("2. Add Drinks");
            System.out.println("0. Cancel");
            choose = InputScanner.scanner.nextInt();
            switch (choose) {
                case 1:
                    for (int i = 0; i < DrinksController.drinksList.size(); i++) {
                        System.out.println(DrinksController.drinksList.get(i));
                    }
                    break;
                case 2:
                    inputDrinks();
                    break;
                case 0:
                    System.out.println("Thanks you");
                    break;
                default:
                    break;
            }
        }
    }

    public static void inputDrinks() {
        int input =1;
        while (input != 0) {
        System.out.println("1. Add");
        System.out.println("0. Cancel");
         input = InputScanner.scanner.nextInt();
        InputScanner.scanner.nextLine();

            switch (input) {
                case 1:
                    addDrinks();
                    break;
                case 0:
                    menu();
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.menu();
    }
}

