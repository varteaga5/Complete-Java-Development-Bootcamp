package models;

public class Movie {
    // fields
    private String name;
    private String format;
    private double rating;
    private double sellingPrice;
    private double rentalPrice;
    private boolean isAvailable;

    // constructor
    public Movie(String name, String format, double rating) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null or blank.");
        }
        if (!format.equalsIgnoreCase("blue-ray") && !format.equalsIgnoreCase("dvd")) {
            throw new IllegalArgumentException("format must be blue-ray or dvd.");
        }
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("rating cannot be less than zero or more than 10.");
        }
        this.name = name;
        this.format = format;
        this.rating = rating;
        this.isAvailable = true;
        this.sellingPrice = format.equalsIgnoreCase("dvd") ? 2.25 : 4.25;
        this.rentalPrice = format.equalsIgnoreCase("dvd") ? .99 : 1.99;
    }
    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
        this.isAvailable = true;
        this.sellingPrice = source.sellingPrice;
        this.rentalPrice = source.rentalPrice;
    }

    public String getName() {
        return name;
    }
    public String getFormat() {
        return format;
    }
    public double getRating() {
        return rating;
    }
    public double getSellingPrice() {
        return sellingPrice;
    }
    public double getRentalPrice() {
        return rentalPrice;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setName(String name) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null or blank.");
        }
        this.name = name;
    }
    public void setFormat(String format) {
        if (!format.equalsIgnoreCase("blue-ray") && !format.equalsIgnoreCase("dvd")) {
            throw new IllegalArgumentException("format must be blue-ray or dvd.");
        }
        if(format == null || format.isBlank()) {
            throw new IllegalArgumentException("format cannot be null or blank.");
        }
        this.format = format;
        setSellingPrice(format.equalsIgnoreCase("dvd") ? 2.25 : 4.25);
        setRentalPrice(format.equalsIgnoreCase("dvd") ? .99 : 1.99);
    }
    public void setRating(double rating) {
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("rating cannot be less than zero or more than 10.");
        }
        this.rating = rating;
    }
    private void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
    private void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String toString() {
        return "\t Name: " + name + "\n" +
            "\t Format: " + format + "\n" +
            "\t Rating: " + rating + "\n" +
            "\t Selling Price: " + sellingPrice + "\n" +
            "\t Rental Price: " + rentalPrice + "\n" +
            "\t Availability: " + (this.isAvailable ? "in-stock" : "rented") + "\n";
    }



}
