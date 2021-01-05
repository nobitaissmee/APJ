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

    public int getOptionTotalMenu(String messageTotalMenu, int limitTotalMenu) {
        int optionTotalMenu;
        do {
            System.out.print("----------Menu----------\n");
            System.out.println(messageTotalMenu);
            System.out.println("-------Your choice-------");
            optionTotalMenu = getAndParseInteger();
        } while (optionTotalMenu < 0 || optionTotalMenu > limitTotalMenu);
        return optionTotalMenu;
    }

    public int getOptionEditMenu(String messageEditMenu,int limitEditMenu){
        int optionEditMenu;
        do{
            System.out.println("----------Edit----------\n");
            System.out.println(messageEditMenu);
            System.out.println("-------Your choice-------");
            optionEditMenu=getAndParseInteger();
        }while (optionEditMenu < 0 || optionEditMenu > limitEditMenu);
        return optionEditMenu;
    }
}
