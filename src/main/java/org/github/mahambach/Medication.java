package org.github.mahambach;

public class Medication {
    //Properties
    private String name;
    private double price;
    private boolean availabel;
    //Constructors

    public Medication(String name, double price, boolean availabel) {
        this.name = name;
        this.price = price;
        this.availabel = availabel;
    }

    //Methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailabel() {
        return availabel;
    }

    public void setAvailabel(boolean availabel) {
        this.availabel = availabel;
    }

    @Override
    public String toString() {
        return String.format("Name: %s%s,  Price: %8.2f €,  Availability: %b",
                " ".repeat(20 - this.name.length()), this.name,
                this.price, this.availabel
        );
    }
}
