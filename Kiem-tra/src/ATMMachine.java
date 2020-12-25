import java.util.ArrayList;
import java.util.Scanner;

public class ATMMachine {
    BankAccount user = new BankAccount("Nguyen Van A", 23000);
    Scanner scanner = new Scanner(System.in);

    public String getMenuOption() {

            System.out.println("Menu:");
            System.out.println("1. Nhan phim A de kiem tra tai khoan\n" +
                    "2. Nhan phim D de nap tien\n" +
                    "3. Nhan phim W de rut tien\n" +
                    "4. Nhan phim H de xem lich su 3 lan \n" +
                    "5. Nhan phim X de thoat \n");
            System.out.println("===============");
            System.out.println("Nhap lua chon cua ban: ");
        return scanner.nextLine().toUpperCase();
    }

    public void checkAccountBalance() {
        System.out.println("So du tai khoan khach hang la: " + user.getMoney());
    }

    public void depositMoney(ArrayList<Integer> listMoney) {
        System.out.println("Giao dich Nap tien");
        System.out.println("Vui long nhap so tien: ");
        int inputMoney = scanner.nextInt();
        listMoney.add(inputMoney);
        System.out.println("Giao dich thanh cong. Ban vua nap " + inputMoney + " thanh cong.");
        moneyUserAfterIn(inputMoney);
        checkAccountBalance();
    }

    public void moneyUserAfterIn(int inputMoney) {
        user.setMoney(user.getMoney() + inputMoney);
    }

    public void withdrawMoney(ArrayList<Integer> listMoney, String choice, ArrayList<String> list) {
        System.out.println("Giao dich Rut tien:");
        System.out.println("Vui long nhap so tien:");
        int outMoney = scanner.nextInt();
        if (notEnoughMoney(outMoney)) {
            System.out.println("Giao dich khong thanh cong.");
            checkAccountBalance();
            System.out.println("Ban khong the rut so tien hon so du tai khoan");
        } else {
            list.add(choice);
            listMoney.add(outMoney);
            System.out.println("Giao dich thanh cong. Ban vua rut" + outMoney + "thanh cong.");
            moneyUserAfterOut(outMoney);
            checkAccountBalance();
        }
    }



    public void moneyUserAfterOut(int outMoney) {
        user.setMoney(user.getMoney() + outMoney);
    }

    public boolean notEnoughMoney(int outMoney) {
        return outMoney > user.getMoney();
    }

    public void showHistory(ArrayList<String> list, ArrayList<Integer> listMoney) {
        if (list.isEmpty()) {
            System.out.println("Ko co giao dich");
            return;
        }
        int currentId=1;
        int count = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (count == 3) return;
            String message = list.get(i).equals("D") ? ". Nap tien:  +" : ". Rut tien:  -";
            System.out.println(currentId++ +message + listMoney.get(i));
            count++;
        }
    }

    public void goodBye() {
        System.out.println("Cam on ban da su dung dich vu ATM");
    }
}
