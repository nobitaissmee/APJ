package frist;
public class Manage extends Staff{
    private String type="Manage";

    public Manage() {
    }

    public Manage(int id,String name, String phoneNumber, String dateOfBirth, String address,String type) {
        super(id,name,phoneNumber,dateOfBirth,address);
        this.type = type;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "type='" + type;
    }
}
