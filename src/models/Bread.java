package models;

public class Bread extends Item {
    private String bakeryName;
    private boolean isGlutenFree;

    public Bread(String bakeryName, int quantity, boolean isGlutenFree) {
        super(quantity);

        if (bakeryName == null || bakeryName.isBlank()) {
            throw new IllegalArgumentException("Bakery cannot be null/blank");
        }

        this.bakeryName = bakeryName;
        this.isGlutenFree = isGlutenFree;

        this.setSellingPrice(isGlutenFree ? 3.55 : 2.85);
        this.setBuyingPrice(isGlutenFree ? 2.50 : 2.35);
    }

    public Bread(Bread source) {
        super(source.getQuantity());
        this.bakeryName = source.bakeryName;
        this.setSellingPrice(source.getSellingPrice());
        this.setBuyingPrice(source.getBuyingPrice());
        this.isGlutenFree = source.isGlutenFree;
    }

    public void updateItem(Bread bread) {
        if (this.bakeryName.equals(bread.bakeryName) && this.isGlutenFree == bread.isGlutenFree) {
            this.setQuantity(this.getQuantity() + bread.getQuantity());
        }

        this.setQuantity(this.getQuantity() + bread.getQuantity());

    }

    public boolean getGlutenFree() {
        return isGlutenFree;
    }

    public String getBakeryName() {
        return bakeryName;
    }

    public void setGlutenFree(boolean glutenFree) {
        isGlutenFree = glutenFree;
        this.setSellingPrice(isGlutenFree ? 3.55 : 2.85);
        this.setBuyingPrice(isGlutenFree ? 2.50 : 2.35);
    }

    public void setBakeryName(String bakeryName) {
        if (bakeryName == null || bakeryName.isBlank()) {
            throw new IllegalArgumentException("Bakery cannot be null/blank");
        }
        this.bakeryName = bakeryName;
    }


    public String toString() {
        return "Name: " + this.getClass().getSimpleName() + "\n" +
                "Backery: " + bakeryName + "\n" +
                "Quantity: " + getQuantity() + " pieces\n" +
                "Glutenfree: " + (isGlutenFree ? "yes" : "no") + "\n" +
                "Price: " + getSellingPrice() + " PLN\n";
    }
}
