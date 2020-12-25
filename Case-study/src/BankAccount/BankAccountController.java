package BankAccount;

import Infomation.Information;
import Infomation.SerializationUtils;

import java.io.IOException;
import java.util.ArrayList;

public class BankAccountController {
    private static int id;
    static ArrayList<BankAccount> bankAccountList;
    private static final String ACCOUNT_FILE = "bankAccount.data";

    BankFormat bankFormat = new BankFormat();

    static {
        try {
            Object accountFile = SerializationUtils.deserialize(ACCOUNT_FILE);
            bankAccountList = accountFile == null ? new ArrayList<>() : (ArrayList<BankAccount>) accountFile;
            int maxId = -1;
            for (BankAccount bankAccount : bankAccountList) {
                int currentId = bankAccount.getId();
                if (currentId > maxId) maxId = currentId;
            }
            id = maxId;
        } catch (IOException | ClassNotFoundException e) {
            bankAccountList = new ArrayList<>();
            id = 0;
        }
    }

    public void addBankAccountToSever(Information information, double balance) {
        BankAccount newAccount = new BankAccount(++id, information, balance);
        for (BankAccount bankAccount : bankAccountList) {
            if (bankAccount.getInformation().getIdentityCard().equals(newAccount.getInformation().getIdentityCard())) {
                System.out.println("IdentityCard already exists!");
                System.out.println("Cannot add to system.Please try again!");
                return;
            }
        }
        bankAccountList.add(newAccount);
        System.out.println("Your account:" + newAccount.getAccountNumber());
        saveAccountToFile();
    }

    public void showAllBankAccountList() {
        if (bankAccountList.size() == 0) {
            System.out.println("There is no account in the list");
        } else {
            bankFormat.printTitle();
            for (BankAccount bankAccount : bankAccountList) {
                bankAccount.printBankAccount();
            }
        }
    }

    public void showBankAccountByAccountNumber(String accountNumber) {
        BankAccount accountFind = getBankAccountByAccountNumber(accountNumber);
        if (accountFind == null) {
            System.out.println("No account to look for");
        } else {
            System.out.println(accountFind);
        }
    }

    public BankAccount getBankAccountByAccountNumber(String accountNumber) {
        for (BankAccount bankAccount : bankAccountList) {
            if (bankAccount.getAccountNumber().equals(accountNumber)) {
                return bankAccount;
            }
        }
        return null;
    }

    public void removeBankAccountByAccountNumber(String accountNumber) {
        BankAccount accountRemove = getBankAccountByAccountNumber(accountNumber);
        if (accountRemove == null) {
            System.out.println("No has bank account you want!");
        } else {
            bankAccountList.remove(accountRemove);
            System.out.println("Deleted successfully!");
            saveAccountToFile();
        }
    }

    public void accountDeposit(double amount, BankAccount bankDeposit) {
        if (bankDeposit == null) {
            System.out.println("No has bank account you want!");
        } else {
            checkAmountToDeposit(amount, bankDeposit);
            saveAccountToFile();
        }
    }

    public void checkAmountToDeposit(double amount, BankAccount bankDeposit) {
        if (amount < 0) {
            System.out.println("Deposit failed!");
        } else {
            bankDeposit.deposit(amount);
            System.out.println("Deposit account successfully!");
        }
    }

    public void accountWithdrawal(double amount, BankAccount bankWithdrawal) {
        if (bankWithdrawal == null) {
            System.out.println("No has bank account you want!");
        } else {
            checkAmountWithdrawal(amount, bankWithdrawal);
            saveAccountToFile();
        }
    }

    public void checkAmountWithdrawal(double amount, BankAccount bankWithdrawal) {
        double currentBalance = bankWithdrawal.checkAccount();
        if (amount > currentBalance) {
            System.out.println("Withdrawal failed!");
            System.out.println("Current Balance: " + currentBalance);
        } else {
            bankWithdrawal.withdrawal(amount);
            System.out.println("Withdrawal account successfully!");
        }
    }

    public void showHistoryOfBankAccount(BankAccount bankAccount) {
        int count = 0;
        ArrayList historyBank = bankAccount.returnHistory();
        for (int i = historyBank.size() - 1; i >= 0; i--) {
            if (count == 5) break;
            System.out.println(historyBank.get(i));
            count++;
        }
    }

    public static void saveAccountToFile() {
        try {
            SerializationUtils.serialize(bankAccountList, ACCOUNT_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
