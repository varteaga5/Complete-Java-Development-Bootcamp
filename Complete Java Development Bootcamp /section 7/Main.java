/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        Car[] cars = new Car[] {
            new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
            new Car("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
            new Car("Nissan", 5000, 2020, "yellow", new String[] {"tires", "filter"}),
            new Car("Honda", 7000, 2019, "orange", new String[] {"tires", "filter"}),
            new Car("Mercedes", 12000, 2015, "jet black", new String[] {"tires", "filter", "tranny"})
        };

        Dealership dealership = new Dealership(cars);

       System.out.println(dealership);

     
        dealership.sell(2);
        System.out.println(dealership);


        // String[] parts = {"tires", "keys"};

        // Car nissan = new Car("nissan", 5000, 2020, "red", parts);
        // Car dodge = new Car("dodge", 8500, 2019, "", parts);
        // // create a new object of car, to avoid setting object variables equal to each other, this uses the copy constructor.
        // Car nissan2 = new Car(nissan);
        // nissan2.setColor("yellow");
        // nissan2.setParts(new String[] {"tires", "filter"});


        // System.out.println("This " + nissan.make + " is worth $" + nissan.price + ". It was built in " + nissan.year + ". It is " + nissan.color + ".\n");

        // System.out.println("This " + dodge.make + " is worth $" + dodge.price + ". It was built in " + dodge.year + ". It is " + dodge.color + ".\n");

        // nissan.make = "Nissan";
        // nissan.price = 5000;
        // nissan.year = 2010;
        // nissan.color = "blue";

        // Car dodge = new Car();
        // dodge.make = "Dodge";
        // dodge.price = 3500;
        // dodge.year = 2020;
        // dodge.color = "red";



    }
}