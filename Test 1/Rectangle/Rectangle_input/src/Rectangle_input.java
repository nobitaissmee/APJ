import java.util.Scanner;

public class Rectangle_input {
    public static void main(String[] args) {
        float width;
        float heigth;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width:");
        width=scanner.nextFloat();

        System.out.println("Enter height");
        heigth=scanner.nextFloat();

        float area=width*heigth;
        System.out.println("area:" + area);
    }
}
