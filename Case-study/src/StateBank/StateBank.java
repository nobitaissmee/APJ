package StateBank;

import BankAccount.*;

public class StateBank {

    StateBankScanner stateBankScanner = new StateBankScanner();
    BankScanner bankScanner = new BankScanner();
    BankAccountController bankAccountController = new BankAccountController();
    BankFormat bankFormat=new BankFormat();


    static String totalMenu = "1. Log in\n" +
            "2. Registration\n" +
            "0. Exit\n";

    static String accountMenu = "1. Display Information\n" +
            "2. Deposit\n" +
            "3. Withdrawal\n" +
            "4. Transaction history\n" +
            "0. Exit\n";

    private BankAccount bankAccountActive = null;
    private boolean totalRunningMenu = true;
    private boolean accountRunningMenu = false;

    public void printTotalMenu() {
        while (totalRunningMenu) {
            int optionTotalMenu = stateBankScanner.getOptionTotalMenu(totalMenu, 2);
            handleGetTotalMenuOption(optionTotalMenu);
        }
    }

    public void handleGetTotalMenuOption(int optionTotalMenu) {
        switch (optionTotalMenu) {
            case 1 -> {
                accountRunningMenu = true;
                bankAccountActive = stateBankScanner.getAccountToLogIn();
                getPrintAccountMenu(bankAccountActive);
            }
            case 2 -> bankScanner.handleAddBankAccount();
            case 0 -> {
                stateBankScanner.exitMachine();
                totalRunningMenu = false;
            }
        }
    }

    public void getPrintAccountMenu(BankAccount bankAccountActive) {
        if (bankAccountActive == null) {
            System.out.println("Your account is currently unavailable");
        } else {
            System.out.println("Login is complete.Wish you happy using the service!");
            printAccountMenu(bankAccountActive);
        }
    }

    public void printAccountMenu(BankAccount bankAccountActive) {
        while (accountRunningMenu) {
            int optionAccountMenu = stateBankScanner.getOptionAccountMenu(accountMenu, 4);
            handleGetAccountMenuOption(optionAccountMenu, bankAccountActive);
        }
    }

    public void handleGetAccountMenuOption(int optionAccountMenu, BankAccount bankAccountActive) {
        switch (optionAccountMenu) {
            case 1 -> {
                bankFormat.printTitle();
                bankAccountActive.printBankAccount();
            }
            case 2 -> bankScanner.handleDepositToAccount(bankAccountActive);
            case 3 -> bankScanner.handleWithdrawalFromAccount(bankAccountActive);
            case 4 -> bankAccountController.showHistoryOfBankAccount(bankAccountActive);
            case 0 -> accountRunningMenu = false;
        }
    }
}
