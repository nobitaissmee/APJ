import java.util.Scanner;

public class StudentManagerScanner {
    static Scanner sc = new Scanner(System.in);

    private int getAndParseInteger() {
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (Exception e) {
            System.out.println("Try it:");
            return -1;
        }
    }

    public int getOptionMenu(String messageMenu, int limitMenu, String title) {
        int optionTotalMenu;
        do {
            System.out.print(title);
            System.out.println(messageMenu);
            System.out.println("-------Your choice-------");
            optionTotalMenu = getAndParseInteger();
        } while (optionTotalMenu < 0 || optionTotalMenu > limitMenu);
        return optionTotalMenu;
    }
}