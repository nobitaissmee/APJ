import java.util.ArrayList;
import java.util.Scanner;

public class Main {

        public static final String CHECK_BALANCE = "A";
        public static final String DEPOSIT_MONEY = "D";
        public static final String WITHDRAW_MONEY = "W";
        public static final String HISTORY = "H";
        public static final String EXIT = "X";

        public static void main(String[] args) {
            User user =new User("Nguyen Van A",23000);
            ATMMachine atm = new ATMMachine();
            ArrayList<String> list = new ArrayList<>();
            ArrayList<Integer> listMoney = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ngan hang ABC kinh chao Quy khach " + user.getName());
            while (true) {
                String choice = atm.getMenuOption();
                switch (choice) {
                    case CHECK_BALANCE -> atm.checkAccountBalance();
                    case DEPOSIT_MONEY -> {
                        list.add(choice);
                        atm.depositMoney(listMoney);
                    }
                    case WITHDRAW_MONEY -> atm.withdrawMoney(listMoney, choice, list);
                    case HISTORY -> atm.showHistory(list, listMoney);
                    case EXIT -> {
                        atm.goodBye();
                        return;
                    }
                }
                printNextActionMessage();
            }
        }

        private static void printNextActionMessage() {
            System.out.println("Bam nut theo menu de tiep tuc giao dich");
            System.out.println("=======================");
        }
    }
