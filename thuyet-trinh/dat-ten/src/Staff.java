import java.util.Date;
import java.util.Scanner;

public class Staff extends Person {
    private String type;

    public Staff() {

    }

    private Staff(String name, String dateOfBirth, String address, String phoneNumber, String type) {
        super(name, dateOfBirth, address, phoneNumber);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Staff{" +
                super.toString() +
                " type='" + type + '\'' +
                '}';
    }

    public void staff() {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Staff");
        System.out.println("1.Thông tin nhân viên");
        System.out.println("2.Nhan vien quan ly");
        System.out.println("3.Nhan vien lam them");
        System.out.println("4.Thoát chương trình");
        while (choice != 4) {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < information().length; i++) {
                        System.out.println(information()[i]);
                    }
                    break;
                case 2:
                    System.out.println(information()[0]);
                    System.out.println(information()[1]);
                    break;
                case 3:
                    System.out.println(information()[2]);
                    System.out.println(information()[3]);
                    System.out.println(information()[4]);
                    break;
                case 4:
                    System.out.println("thoat");
                    break;
                default:
                    System.out.println("chon sai");
                    break;
            }
        }
    }

    public Staff[] information() {
        return new Staff[]{
                new Staff("Le Phu Thinh", "12/12/2000", "31 Nguyen Trai", "0905123456", "Quan ly"),
                new Staff("Nguyen Hoai Son", "15/12/1995", "31 Ly Thuong Kiet", "0905234567", "Quan ly"),
                new Staff("Nguyen Thanh Tien Dat", "29/5/1995", "105 Nguyen Trai", "0853468669", "Lam them"),
                new Staff("Vo Van Tu", "12/12/2000", "31 Lam Hoang", "0905465798", "Lam them"),
                new Staff("Nguyen Hai", "12/12/1998", "151 Nguyen Trai", "0905123486", "Lam them"),

        };
    }

    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.staff();

    }
}