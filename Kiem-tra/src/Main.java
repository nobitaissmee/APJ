import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User user =new User("Nguyen Van A",23000);
        ATMController atm = new ATMController();
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> listMoney = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ngan hang ABC kinh chao Quy khach " + user.getName());
        String choice = "P";
        while (!choice.equals("X")) {
            System.out.println("Menu:");
            System.out.println("1. Nhan phim A de kiem tra tai khoan\n" +
                    "2. Nhan phim D de nap tien\n" +
                    "3. Nhan phim W de rut tien\n" +
                    "4. Nhan phim H de xem lich su 3 lan \n" +
                    "5. Nhan phim X de thoat \n");
            System.out.println("===============");
            System.out.println("Nhap lua chon cua ban: ");
            choice = scanner.nextLine().toUpperCase();
            switch (choice) {
                case "A":
                    atm.checkBank();
                    break;
                case "D":
                    list.add(choice);
                    atm.inputMoney(listMoney);
                    break;
                case "W":
                    list.add(choice);
                    atm.outMoney(listMoney);
                    break;
                case "H":
                    atm.showHistory(list,listMoney);
                    break;
                case "X":
                    atm.goodBye();
            }
        }
    }
    }
