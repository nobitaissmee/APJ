package BankAccount;

import Infomation.Information;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class BankAccount implements Serializable {
    private static final long serialVersionUID = 2L;
    private int id;
    private Information information;
    private String accountNumber;
    private double balance;
    private ArrayList<String> historyBankTime = new ArrayList<>();

    public BankAccount() {
    }

    public BankAccount(int id, Information information, double balance) {
        this.id = id;
        this.information = information;
        this.accountNumber = BankFormat.ramdomBankNumber();
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public Information getInformation() {
        return information;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        historyBankTime.add("Deposit: " + amount + " at " + new Date());
    }

    public void withdrawal(double amount) {
        balance -= amount;
        historyBankTime.add("Withdrawal " + amount + " at " + new Date());
    }

    public double checkAccount() {
        return balance;
    }

    public ArrayList returnHistory() {
        return historyBankTime;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", information=" + information +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void printBankAccount() {
        System.out.format("%-2d |", id);
        System.out.format("%-20s |", information.getFirstName() + " " + information.getLastName());
        System.out.format("%-7s |", information.isGender());
        System.out.format("%-13s |", information.getDayOfBirth());
        System.out.format("%-13s |", information.getPhoneNumber());
        System.out.format("%-25s |", information.getAddress());
        System.out.format("%-10s |", information.getIdentityCard());
        System.out.format("%-13s |", accountNumber);
        System.out.format("%-14f |", balance);
        System.out.println();
    }

}
