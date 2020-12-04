import java.util.Date;

class Person {
    private String name;
    private String dateOfBirth;
    private String address;
    private String phoneNumber;

    public Person(){

    }

    public Person(String name, String dateOfBirth, String address, String phoneNumber) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", DateOfBirth=" + dateOfBirth +
                        ", address='" + address + '\'' +
                        ", phoneNumber='" + phoneNumber + '\''
                ;
    }

    public static void main(String[] args) {
        Person person = new Person("Nam", "28/102/466", "105 nguyen trai", "0853468669");
        System.out.println(person);
    }
}