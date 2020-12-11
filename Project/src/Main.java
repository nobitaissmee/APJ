import frist.Staff;
import service.InputScanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        manageCaffe();
    }

    public static void manageCaffe(){
        int choice = -1;
        while (choice !=0) {
            System.out.println("1. Quản lý nhân viên");
            System.out.println("2. Quản lý menu");
            System.out.println("0. Cancel");
            choice = InputScanner.getInt();
            switch(choice){
                case 1:
                    manageStaff();
                    break;
            }
        }
    }

    public static void manageStaff(){
        Staff staff = new Staff();
        int choiceStaff=-1;
        while(choiceStaff!=0){
            System.out.println("1. Show All Staff");
            System.out.println("2. Add Staff");
            System.out.println("0. Cancel");
            choiceStaff = InputScanner.getInt();
            switch(choiceStaff) {
                case 1:
                    for (int i=0;i<Staff.staffs.size();i++){
                        if(Staff.staffs.size() == 0) {
                            System.out.println("No Staff");
                        }else {
                            System.out.println(Staff.staffs.get(i));
                        }
                    }
                case 2:
                    staff.inputStaff();
                    break;
                case 0:
                    System.out.println("Thanks you");
            }
        }
    }

}
