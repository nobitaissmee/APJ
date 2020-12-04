package third;

import second.Drinks;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    private String nameStaff;
    private String date;
    private String timeIn;
    private String timeOut;
    private String table;
    private List<BillDetail> details = new ArrayList<>();

    public Bill(String nameStaff, String date, String timeIn, String timeOut, String table) {
        this.nameStaff = nameStaff;
        this.date = date;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        this.table = table;
        this.details = details;
    }

    public String getNameStaff() {
        return nameStaff;
    }

    public void setNameStaff(String nameStaff) {
        this.nameStaff = nameStaff;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(String timeIn) {
        this.timeIn = timeIn;
    }

    public String getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public void addOrder(Drinks drinks, int amount) {
        BillDetail billDetail = new BillDetail(drinks, amount);
        details.add(billDetail);
    }

    @Override
    public String toString() {
        return "Bill{" +
                "nameStaff='" + nameStaff + '\'' +
                ", date='" + date + '\'' +
                ", timeIn='" + timeIn + '\'' +
                ", timeOut='" + timeOut + '\'' +
                ", table='" + table + '\'' +
                ", details=" + details +
                '}';
    }
}
