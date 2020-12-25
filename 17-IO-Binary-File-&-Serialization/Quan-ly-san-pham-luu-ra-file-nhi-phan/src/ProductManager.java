import java.util.ArrayList;
import java.io.*;

public class ProductManager {
    private static final String savedProductFile = "products.data";
    private static ArrayList<Product> productList;
    private static int idTracker;

    static {

        try {
            Object fileObject = SerializationUtils.deserialize(savedProductFile);
            productList = fileObject == null ? new ArrayList<>() : (ArrayList<Product>) fileObject;
            int maxId = -1;
            for (Product product : productList) {
                int currentId = product.getId();
                if (currentId > maxId) maxId = currentId;
            }
            idTracker = maxId + 1;
        } catch (IOException | ClassNotFoundException e) {
            productList = new ArrayList<>();
            idTracker = 1;
        }
    }

    public static void addProduct(String name, String manufacturer, int price, String description) {
        productList.add(new Product(idTracker++, name, manufacturer, price, description));
        saveProductListToFile();
    }

    public static void showAllProducts() {
        if (productList.size() == 0) {
            System.out.println("No has product!");
        } else {
            System.out.println("Products:");
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }

    public static Product findProductById(int id) {
        if (id < 1 && id >= idTracker) return null;
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        System.out.println("Product not found!");
        return null;
    }

    public static Product findProductByName(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        System.out.println("Product not found!");
        return null;
    }

    public static void removeProductById(int id) {
        Product thisProduct = findProductById(id);
        if (thisProduct == null) return;
        productList.remove(thisProduct);
        saveProductListToFile();
    }

    public static void removeProductByName(String name) {
        Product thisProduct = findProductByName(name);
        if (thisProduct == null) return;
        productList.remove(thisProduct);
        saveProductListToFile();
    }

    public static void saveProductListToFile() {
        try {
            SerializationUtils.serialize(productList, savedProductFile);
        } catch (IOException e) {
            System.out.println("Error: Save products failed!");
            e.printStackTrace();
        }
    }
}
