/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Car nissan = new Car();

        nissan.make = "Nissan";
        nissan.price = 5000;
        nissan.year = 2010;
        nissan.color = "blue";

        Car dodge = new Car();
        dodge.make = "Dodge";
        dodge.price = 3500;
        dodge.year = 2020;
        dodge.color = "red";

        System.out.println("This " + nissan.make + " is worth $" + nissan.price + ". It was built in " + nissan.year + ". It is " + nissan.color + ".\n");

        System.out.println("This " + dodge.make + " is worth $" + dodge.price + ". It was built in " + dodge.year + ". It is " + dodge.color + ".\n");



    }
}