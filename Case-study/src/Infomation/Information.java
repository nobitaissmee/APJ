package Infomation;

import java.io.Serializable;

public class Information implements Serializable {
    private static final long serialVersionUID = 1L;
    private String firstName, lastName;
    private String gender;
    private String dayOfBirth;
    private String phoneNumber;
    private String address;
    private String identityCard;

    public Information() {
    }

    public Information(String firstName, String lastName, String gender, String dayOfBirth, String phoneNumber, String address, String identityCard) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dayOfBirth = dayOfBirth;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.identityCard = identityCard;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    @Override
    public String toString() {
        return
                " firstName='" + firstName + " " + lastName + '\'' +
                        " gender='" + gender + '\'' +
                        " dayOfBirth='" + dayOfBirth + '\'' +
                        " phoneNumber='" + phoneNumber + '\'' +
                        " address='" + address + '\'' +
                        " identityCard='" + identityCard;
    }
}