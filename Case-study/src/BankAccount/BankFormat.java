package BankAccount;

import java.sql.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankFormat {
    static Scanner sc = new Scanner(System.in);


    public static String ramdomBankNumber() {
        int number = new Random().nextInt(999999999);
        return String.format("%09d", number);
    }

    public void printTitle() {
        System.out.format("%-2s |", "ID");
        System.out.format("%-20s |", "Full Name");
        System.out.format("%-7s |","Gender");
        System.out.format("%-13s |","Day Of Birth");
        System.out.format("%-13s |","Phone");
        System.out.format("%-25s |","Address");
        System.out.format("%-10s |","People ID");
        System.out.format("%-13s |","Account");
        System.out.format("%-14s |","Balance");
        System.out.println();
    }

    public String getLine() {
        return sc.nextLine();
    }

    public String getFormatGender() {
        System.out.println("Male or Female");
        String gender = sc.nextLine().replaceAll(" ", "");
        String format = gender.substring(0, 1).toUpperCase() + gender.substring(1).toLowerCase();
        if (format.equals("Male") || format.equals("Female")) {
            return format;
        } else {
            return getFormatGender();
        }
    }

    public String getFormatDOB() {
        System.out.println("Format DOB (yyyy-mm-dd): ");
        try {
            Date date = Date.valueOf(sc.nextLine());
            return date.toString();
        } catch (Exception e) {
            return getFormatDOB();
        }
    }

    public String getFormatPhoneNumber() {
        System.out.println("Has 10 or 11 numbers: ");
        Pattern pattern = Pattern.compile("^(\\d{10,11})$");
        String phoneNumber = sc.nextLine();
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches()) {
            return phoneNumber;
        } else {
            return getFormatPhoneNumber();
        }
    }

    public String getFormatIdentityCard() {
        System.out.println("Has 9 character: ");
        Pattern pattern = Pattern.compile("[0-9]{9}");
        String idCard = sc.nextLine();
        Matcher matcher = pattern.matcher(idCard);
        if (matcher.matches()) {
            return idCard;
        } else {
            return getFormatIdentityCard();
        }
    }

    public double getBalanceInFirst() {
        double balance;
        while (true) {
            try {
                balance = Double.parseDouble(sc.nextLine());
                if (balance >= 50000) {
                    return balance;
                } else {
                    System.out.println("Please pay above 50000");
                }
            } catch (Exception e) {
                System.out.println("Please pay above 50000");
            }
        }
    }

    public String getFormatAccountNumber() {
        String accountNumberString = sc.nextLine().trim();
        Pattern pattern = Pattern.compile("\\d{9}");
        Matcher matcher = pattern.matcher(accountNumberString);
        if (matcher.matches()) {
            return accountNumberString;
        } else {
            System.out.println("Must be a number and have 9 digits");
            return getFormatAccountNumber();
        }
    }

    public double getMoneyToDeposit() {
        String moneyDeposit = sc.nextLine();
        try {
            return Double.parseDouble(moneyDeposit);
        } catch (Exception e) {
            System.out.println("Must be a number!");
            return getMoneyToDeposit();
        }
    }

    public double getMoneyToWithdraw() {
        String moneyWithdraw = sc.nextLine();
        try {
            return Double.parseDouble(moneyWithdraw);
        } catch (Exception e) {
            System.out.println("Must be a number!");
            return getMoneyToWithdraw();
        }
    }
}
