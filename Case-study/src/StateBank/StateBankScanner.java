package StateBank;

import BankAccount.*;

import java.util.Scanner;

public class StateBankScanner {
    static Scanner sc = new Scanner(System.in);
    BankFormat bankFormat = new BankFormat();
    BankAccountController bankAccountController = new BankAccountController();

    public int getOptionMenu(String messageTotalMenu, int limitTotalMenu, String title) {
        int optionTotalMenu;
        do {
            System.out.print(title);
            System.out.println(messageTotalMenu);
            System.out.println("-------Your choice-------");
            optionTotalMenu = getAndParseInteger();
        } while (optionTotalMenu < 0 || optionTotalMenu > limitTotalMenu);
        return optionTotalMenu;
    }

    private int getAndParseInteger() {
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (Exception e) {
            System.out.println("Try it:");
            return -1;
        }
    }

    public BankAccount getAccountToLogIn() {
        System.out.println("----------Log In----------");
        System.out.print("Your Account: ");
        String accountInput = bankFormat.getFormatAccountNumber();
        return bankAccountController.getBankAccountByAccountNumber(accountInput);
    }

    public void exitMachine() {
        System.out.println("Thank you for using the service");
    }
}
