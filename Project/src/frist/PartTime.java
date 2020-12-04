package frist;
public class PartTime extends Staff {
    private String type = "PartTime";

    public PartTime() {
    }

    public PartTime(int id, String name, String phoneNumber, String dateOfBirth, String address, String type) {
        super(id,name,phoneNumber,dateOfBirth,address);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() +
                "type='" + type;
    }
}
