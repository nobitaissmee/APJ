import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private static final List<Product> productList = new LinkedList<>();
    private static int currentId = 0;

    public static void addProduct(String name, int price) {
        productList.add(new Product(currentId++, name, price));
    }

    public static void showProduct() {
        System.out.println("List:");
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public static void showProductByName(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                System.out.println(product);
            }
        }
    }

    public static void showProductById(int id) {
        System.out.println("Produc in id:");
        System.out.println(getProductById(id));
    }

    public static Product getProductById(int id) {
        if (id < 0 || id > currentId) return null;
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        System.out.println("No Product");
        return null;
    }

    public static void removeProduct(int id) {
        Product thisProduct = getProductById(id);
        if (thisProduct == null) return;
        productList.remove(thisProduct);
    }

    private static void sortProducts(boolean isAscending) {
        productList.sort((o1, o2) -> (o1.getPrice() - o2.getPrice()) * (isAscending ? 1 : -1));
        showProduct();
    }

    public static void sortAscending() {
        System.out.println("Ascending price:");
        sortProducts(true);
    }

    public static void sortDescending() {
        System.out.println("Descending price:");
        sortProducts(false);
    }


}
