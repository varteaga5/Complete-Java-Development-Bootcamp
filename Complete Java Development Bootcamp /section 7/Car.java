/**
 * Car
 */
import java.util.Arrays;

// the big 3 are:
// 1. the Contructors(constructor and copy constructor)
// 2. getters 
// 1. setters

public class Car {
    
    private String make;
    private double price;
    private int year;
    private String color;
    private  String[] parts;

    public Car(String make, double price, int year, String color, String[] parts){
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);

    }
    // this is the copy constructor
    public Car(Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }    
    // getters
    public String getMake() {
        return this.make;
    }

    public double getPrice() {
        return this.price;
    }

    public int getYear() {
        return this.year;
    }

    public String getColor() {
        return this.color;
    }

    public String[] getParts() {
        return Arrays.copyOf(this.parts, this.parts.length);
    }
    // setters

    public void setMake(String make) {
        this.make = make;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setParts(String[] parts) {
        this.parts = Arrays.copyOf(parts, parts.length);
    }
    // end of setters

    public void drive() {
        System.out.println("you bought this beautiful car");
        System.out.println("please drive your car to the nearest exit.\n");
    }
}