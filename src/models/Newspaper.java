package models;

public class Newspaper extends Item {
    private String titleOfNewspaper;
    private String typeOfNewspaper;

    public Newspaper(String titleOfNewspaper, String typeOfNewspaper, int quantity) {
        super(quantity);

        if (titleOfNewspaper == null || titleOfNewspaper.isBlank()) {
            throw new IllegalArgumentException("Title of newspaper cannot be null/blank.");
        }
        if (typeOfNewspaper == null || typeOfNewspaper.isBlank()) {
            throw new IllegalArgumentException("Type of newspaper cannot be null/blank.");
        }

        if (!(typeOfNewspaper.equalsIgnoreCase("daily") || typeOfNewspaper.equalsIgnoreCase("weekly") || typeOfNewspaper.equalsIgnoreCase("magazine"))) {
            throw new IllegalArgumentException("Type of newspaper should be daily/weekly/magazine.");
        }

        this.titleOfNewspaper = titleOfNewspaper; // "Washington Post" etc.
        this.typeOfNewspaper = typeOfNewspaper; //daily, weekly, magazine

        if (typeOfNewspaper.equalsIgnoreCase("daily")) {
            this.setSellingPrice(3.44);
            this.setBuyingPrice(2.50);
        } else if (typeOfNewspaper.equalsIgnoreCase("weekly")) {
            this.setSellingPrice(5.68);
            this.setBuyingPrice(4.85);
        } else {
            this.setSellingPrice(8.25);
            this.setBuyingPrice(6.90);
        }
    }

    public Newspaper(Newspaper source) {
        super(source.getQuantity());
        this.titleOfNewspaper = source.titleOfNewspaper;
        this.typeOfNewspaper = source.typeOfNewspaper;
        this.setSellingPrice(source.getSellingPrice());
        this.setBuyingPrice(source.getBuyingPrice());
    }

    public String getTitleOfNewspaper() {
        return titleOfNewspaper;
    }

    public void setTitleOfNewspaper(String titleOfNewspaper) {
        if (titleOfNewspaper == null || titleOfNewspaper.isBlank()) {
            throw new IllegalArgumentException("Title of newspaper cannot be null/blank.");
        }
        this.titleOfNewspaper = titleOfNewspaper;
    }

    public String getTypeOfNewspaper() {
        return typeOfNewspaper;
    }

    public void setTypeOfNewspaper(String typeOfNewspaper) {
        if (typeOfNewspaper == null || typeOfNewspaper.isBlank()) {
            throw new IllegalArgumentException("Type of newspaper cannot be null/blank.");
        }

        if (!(typeOfNewspaper.equalsIgnoreCase("daily") || typeOfNewspaper.equalsIgnoreCase("weekly") || typeOfNewspaper.equalsIgnoreCase("magazine"))) {
            throw new IllegalArgumentException("Type of newspaper should be daily/weekly/magazine.");
        }
        this.typeOfNewspaper = typeOfNewspaper;

        if (typeOfNewspaper.equalsIgnoreCase("daily")) {
            this.setSellingPrice(3.44);
            this.setBuyingPrice(2.50);
        } else if (typeOfNewspaper.equalsIgnoreCase("weekly")) {
            this.setSellingPrice(5.68);
            this.setBuyingPrice(4.85);
        } else {
            this.setSellingPrice(8.25);
            this.setBuyingPrice(6.90);
        }
    }

    public String toString() {
        return "Name: " + this.getClass().getSimpleName() + "\n" +
                "Title: " + titleOfNewspaper + "\n" +
                "Quantity: " + getQuantity() + " pieces\n" +
                "Type: " + typeOfNewspaper + "\n" +
                "Price: " + getSellingPrice() + " PLN\n";
    }
}
