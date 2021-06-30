package models;

public class Bread extends Item {
    private final String name = "bread";
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

    public boolean getGlutenFree() {
        return isGlutenFree;
    }

    public String getBakeryName() {
        return bakeryName;
    }

    @Override
    public String getName() {
        return name;
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
        return "Name: " + name + "\n" +
                "Backery: " + bakeryName + "\n" +
                "Quantity: " + getQuantity() + " pieces\n" +
                "Glutenfree: " + (isGlutenFree ? "yes" : "no") + "\n" +
                "Price: " + getSellingPrice() + " PLN\n";
    }
}
