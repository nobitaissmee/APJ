import java.util.Scanner;

public class Main {
    private static boolean isRunning = true;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (isRunning) {
            System.out.println("1. Add Product\n" +
                    "2. Show All Product\n" +
                    "3. Find Product By Id\n" +
                    "4. Find Product By Name\n" +
                    "5. Remove Product By Id\n" +
                    "6. Remove Product By Name\n" +
                    "7. Exit\n");
            System.out.println("What's option you want?");
            int option = sc.nextInt();
            sc.nextLine();
            menuOption(option);
        }
        ProductManager.saveProductListToFile();
    }

    private static void menuOption(int option) {
        switch (option) {
            case 1 -> handleAdd();
            case 2 -> ProductManager.showAllProducts();
            case 3 -> handleFindProductById();
            case 4 -> handleFindProductByName();
            case 5 -> handleRemoveProductById();
            case 6 -> handleRemoveProductByName();
            case 7 -> isRunning = false;
        }
    }

    private static void handleAdd() {
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter manufacturer: ");
        String manufacturer = sc.nextLine();
        System.out.println("Enter price: ");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter description: ");
        String description = sc.nextLine();
        ProductManager.addProduct(name, manufacturer, price, description);
    }

    private static void handleFindProductById() {
        int idFind = sc.nextInt();
        sc.nextLine();
        ProductManager.findProductById(idFind);
    }

    private static void handleFindProductByName(){
        String nameFind=sc.nextLine();
        ProductManager.findProductByName(nameFind);
    }

    private static void handleRemoveProductById(){
        int idRemove=sc.nextInt();
        sc.nextLine();
        ProductManager.removeProductById(idRemove);
    }

    private static void handleRemoveProductByName(){
        String nameRemove=sc.nextLine();
        ProductManager.removeProductByName(nameRemove);
    }
}
