package third;

import second.Drinks;

public class BillDetail {
    private Drinks drinks;
    private int amount;
    private double price;

    public BillDetail(Drinks drinks, int amount) {
        this.drinks = drinks;
        this.amount = amount;
        this.price=drinks.getPrice();
    }

    public Drinks getDrinks() {
        return drinks;
    }

    public void setDrinks(Drinks drinks) {
        this.drinks = drinks;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice() {
        return price * amount;
    }
}
