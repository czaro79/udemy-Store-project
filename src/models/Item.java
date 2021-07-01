package models;

public class Item {

    private int quantity;
    private double sellingPrice;
    private double buyingPrice;

    public Item(int quantity) throws IllegalArgumentException {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity lower than zero. Impossible.");
        }
        this.quantity = quantity;
        this.setSellingPrice(0);
        this.setBuyingPrice(0);
    }

    public Item(Item source) {
        this.setQuantity(source.getQuantity());
        this.sellingPrice = source.sellingPrice;
        this.buyingPrice = source.buyingPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) throws IllegalArgumentException {
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

    public String toString() {
        return "Name: " + this.getClass().getSimpleName() + "\n" +
                "Quantity: " + quantity + "\n" +
                "Price: " + sellingPrice + " PLN\n";
    }
}
