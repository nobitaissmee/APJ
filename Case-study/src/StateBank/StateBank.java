package StateBank;

import BankAccount.*;

public class StateBank {

    StateBankScanner stateBankScanner = new StateBankScanner();
    BankScanner bankScanner = new BankScanner();
    BankAccountController bankAccountController = new BankAccountController();
    BankFormat bankFormat = new BankFormat();

    static String totalMenu = "1. Log in\n" +
            "2. Registration\n" +
            "0. Exit\n";

    static String accountMenu = "1. Display Information\n" +
            "2. Deposit\n" +
            "3. Withdrawal\n" +
            "4. Transaction history\n" +
            "0. Exit\n";

    static String adminMenu = "1. Display All Bank Accounts\n" +
            "2. Search For A Bank Account\n" +
            "3. Edit Bank Account\n" +
            "4. Remove Bank Account\n" +
            "0. Exit\n";

    private BankAccount bankAccountActive = null;
    private boolean totalRunningMenu = true;
    private boolean accountRunningMenu = false;
    private boolean adminRunningMenu = true;

    public void printTotalMenu() {
        while (totalRunningMenu) {
            int optionTotalMenu = stateBankScanner.getOptionMenu(totalMenu, 2,"----------Menu----------\n" );
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

    public void printAdminMenu() {
        while (adminRunningMenu) {
            int optionAdminMenu = stateBankScanner.getOptionMenu(adminMenu, 4,"----------Admin Menu----------\n");
            handleGetAdminMenuOption(optionAdminMenu);
        }
    }

    public void printAccountMenu(BankAccount bankAccountActive) {
        while (accountRunningMenu) {
            int optionAccountMenu = stateBankScanner.getOptionMenu(accountMenu, 4,"----------User Menu----------\n");
            handleGetAccountMenuOption(optionAccountMenu, bankAccountActive);
        }
    }

    public void handleGetAdminMenuOption(int optionAdminMenu) {
        switch (optionAdminMenu) {
            case 1:
                bankAccountController.showAllBankAccountList();
            case 2:
                bankScanner.showBankAccountByAccountNumber();
            case 4:
                bankScanner.handleRemoveAccountByAccountNumber();
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
