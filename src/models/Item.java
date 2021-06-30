package models;

public class Item {
    private final String name = "item";
    private int quantity;
    private double sellingPrice;
    private double buyingPrice;

    public Item(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity lower than zero. Impossible.");
        }
        this.quantity = quantity;
        this.setSellingPrice(0);
        this.setBuyingPrice(0);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity lower than zero. Impossible.");
        }
        this.quantity = quantity;
    }

    protected void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    protected void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Name: " + name + "\n" +
                "Quantity: " + quantity + "\n" +
                "Price: " + sellingPrice + " PLN\n";
    }
}