package frist;
import service.InputScanner;

import java.util.ArrayList;
import java.util.List;

public class Staff {
    private int id;
    private String name,phoneNumber,dateOfBirth,address;

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

    public static List<Staff> staffs = new ArrayList<>();

    public void inputStaff(){
        System.out.print("Id: ");
        id= InputScanner.getInt();
        System.out.print("Name: ");
        name=InputScanner.getString();
        System.out.print("DatOfBirth: ");
        dateOfBirth=InputScanner.getString();
        System.out.print("PhoneNumber: ");
        phoneNumber=InputScanner.getString();
        System.out.print("Address: ");
        address=InputScanner.getString();
        Staff staff= new Staff(id,name,dateOfBirth,phoneNumber,address);
        staffs.add(staff);
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