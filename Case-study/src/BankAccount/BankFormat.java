package BankAccount;

import Infomation.SerializationUtils;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankFormat {
    static final String BANK_NUMBER_FILE = "banking.data";
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> numberList;

    static {
        Object bankNumberFile = null;
        try {
            bankNumberFile = SerializationUtils.deserialize(BANK_NUMBER_FILE);
        } catch (IOException | ClassNotFoundException e) {
            numberList = new ArrayList<>();
        }
        numberList = bankNumberFile == null ? new ArrayList<>() : (ArrayList<String>) bankNumberFile;
    }

    public static String bankNumber() {
        int number = new Random().nextInt(999999999);
        String numberString = String.format("%09d", number);
        for (String numberOfList : numberList) {
            if (numberString.equals(numberOfList) || numberString.equals("000000000")) {
                return bankNumber();
            }
        }
        numberList.add(numberString);
        saveBankNumberToFile();
        return numberString;
    }

    public void printTitle() {
        System.out.format("%-2s |", "ID");
        System.out.format("%-20s |", "Full Name");
        System.out.format("%-7s |", "Gender");
        System.out.format("%-13s |", "Day Of Birth");
        System.out.format("%-13s |", "Phone");
        System.out.format("%-25s |", "Address");
        System.out.format("%-10s |", "People ID");
        System.out.format("%-13s |", "Account");
        System.out.format("%-14s |", "Balance");
        System.out.println();
    }

    public String getLine() {
        return sc.nextLine();
    }

    public String getName() {
        System.out.println("The name cannot be numbered or too long");
        String firstName = sc.nextLine();
        Pattern pattern = Pattern.compile("^([A-Za-z\\s]{5,10})");
        Matcher matcher = pattern.matcher(firstName);
        return (matcher.matches()) ? getFormatName(firstName) : getName();
    }

    public String getFormatName(String name) {
        name = name.replaceAll("\\s+", " ").toLowerCase();
        if (name.charAt(0) == ' ') name = name.substring(1);
        String formatName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        for (int i = 0; i < formatName.length() - 2; i++) {
            if (formatName.charAt(i) == ' ' && formatName.charAt(i + 1) != ' ') {
                String newName = formatName.substring(0, i + 1) + formatName.substring(i + 1, i + 2).toUpperCase() + formatName.substring(i + 2);
                formatName = newName;
            }
        }
        return formatName;
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

    public static void saveBankNumberToFile() {
        try {
            SerializationUtils.serialize(numberList, BANK_NUMBER_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
