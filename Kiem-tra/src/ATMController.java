import java.util.ArrayList;
import java.util.Scanner;

public class ATMController extends User {
    Scanner scanner=new Scanner(System.in);

    public ATMController(String name,int money){
        super(name, money);
    }

    public void checkBank(){
        System.out.println("So du tai khoan khach hang la: " + getMoney());
        System.out.println("Bam nut theo menu de tiep tuc giao dich");
        System.out.println("==============");
    }
    public void inputMoney(ArrayList<Integer> listMoney){
        System.out.println("Giao dich Nap tien");
        System.out.println("Vui long nhap so tien: ");
        int inputMoney=scanner.nextInt();
        listMoney.add(inputMoney);
        System.out.println("Giao dich thanh cong. Ban vua nap " + inputMoney + " thanh cong.");
        moneyUserAfterIn(inputMoney);
        System.out.println("So du tai khoan khach hang la: " + getMoney());
    }

    public void moneyUserAfterIn(int inputMoney){
         setMoney(getMoney()+inputMoney);
    }

    public void outMoney(ArrayList<Integer> listMoney){
        System.out.println("Giao dich Rut tien:");
        System.out.println("Vui long nhap so tien:");
        int outMoney= scanner.nextInt();
        if (notEnoughMoney(outMoney)){
            System.out.println("Giao dich khong thanh cong.");
            System.out.println("So du tai khoan khach hang la: " + getMoney());
            System.out.println("Ban khong the rut so tien hon so du tai khoan");
            System.out.println("Bam nut theo menu de tiep tuc giao dich");
            System.out.println("=======================");
        }else {
            listMoney.add(outMoney);
            System.out.println("Giao dich thanh cong. Ban vua rut" + outMoney + "thanh cong.");
            moneyUserAfterOut(outMoney);
            System.out.println("So du tai khoan khach hang la: " + getMoney());
        }
    }

    public void moneyUserAfterOut(int outMoney){
        setMoney(getMoney()+outMoney);
    }

    public boolean notEnoughMoney(int outMoney){
        return outMoney>getMoney();
    }

    public void showHistory(ArrayList<String> list,ArrayList<Integer> listMoney) {
        int count = 0;
        if (list.isEmpty()) {System.out.println("Ko co giao dich");}
        else {
            for (int i = list.size()-1; i>=0; i--) {
                if (count ==3) return;
                if (list.get(i) == "D") {
                    System.out.println("Nap tien: " + listMoney.get(i));
                    count++;
                }
                if (list.get(i) == "W") {
                    System.out.println("Rut tien: " + listMoney.get(i));
                    count++;
                }
            }
        }
    }

    public void goodBye(){
        System.out.println("Cam on ban da su dung dich vu ATM");
    }
}
