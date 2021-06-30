package models;

public class Milk extends Item {
    private final String name = "milk";
    private String dairyName;
    private String packaging;
    private boolean isLactoseFree;


    public Milk(String dairyName, int quantity, String packaging, boolean isLactoseFree) {
        super(quantity);

        if (dairyName == null || dairyName.isBlank()) {
            throw new IllegalArgumentException("Dairy cannot be null/blank");
        }
        if (packaging == null || packaging.isBlank()) {
            throw new IllegalArgumentException("Packaging of milk cannot be null/blank");
        }
        if (!(packaging.equalsIgnoreCase("Box") || packaging.equalsIgnoreCase("Bottle"))) {
            throw new IllegalArgumentException("Packaging of milk has to be bottle or box.");
        }


        this.dairyName = dairyName;
        this.packaging = packaging;
        this.isLactoseFree = isLactoseFree;

        this.setSellingPrice(isLactoseFree ? 1.45 : 1.20);
        this.setBuyingPrice(isLactoseFree ? 1.15 : 0.95);

    }

    public Milk(Milk source) {
        super(source.getQuantity());
        this.dairyName = source.dairyName;
        this.packaging = source.packaging;
        this.isLactoseFree = source.isLactoseFree;
        this.setSellingPrice(source.getSellingPrice());
        this.setBuyingPrice(source.getBuyingPrice());
    }

    public String getName() {
        return name;
    }

    public String getDairyName() {
        return dairyName;
    }

    public void setDairyName(String dairyName) {
        if (dairyName == null || dairyName.isBlank()) {
            throw new IllegalArgumentException("Dairy cannot be null/blank");
        }
        this.dairyName = dairyName;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        if (packaging == null || packaging.isBlank()) {
            throw new IllegalArgumentException("Packaging of milk cannot be null/blank");
        }
        if (!(packaging.equalsIgnoreCase("Box") || packaging.equalsIgnoreCase("Bottle"))) {
            throw new IllegalArgumentException("Packaging of milk has to be bottle or box.");
        }
        this.packaging = packaging;
    }

    public boolean isLactoseFree() {
        return isLactoseFree;
    }

    public void setLactoseFree(boolean lactoseFree) {
        isLactoseFree = lactoseFree;
        this.setSellingPrice(isLactoseFree ? 1.45 : 1.20);
        this.setBuyingPrice(isLactoseFree ? 1.15 : 0.95);
    }

    public String toString() {
        return "Name: " + name + "\n" +
                "Dairy: " + dairyName + "\n" +
                "Quantity: " + getQuantity() + " pieces\n" +
                "Packaging: " + packaging + "\n" +
                "Lactose-free: " + (isLactoseFree ? "yes" : "no") + "\n" +
                "Price: " + getSellingPrice() + " PLN\n";
    }
}
