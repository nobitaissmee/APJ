package frist;
import java.util.Scanner;

public class Staff {
    private int id;
    private String name,phoneNumber,dateOfBirth,address;
    Scanner scanner = new Scanner(System.in);

    public Staff(){
    }

    public Staff(int id,String name, String phoneNumber, String dateOfBirth, String address) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void inputStaff(){
        System.out.print("Id:");
        id=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name:");
        name=scanner.nextLine();
        System.out.print("DatOfBirth:");
        dateOfBirth=scanner.nextLine();
        System.out.print("PhoneNumber:");
        phoneNumber=scanner.nextLine();
        System.out.print("Address:");
        address=scanner.nextLine();
    }

    @Override
    public String toString() {
        return
                "ID:" + id +
                " Name:'" + name + '\'' +
                " PhoneNumber:'" + phoneNumber + '\'' +
                " DateOfBirth:'" + dateOfBirth + '\'' +
                " Address:'" + address;
    }
}