import java.util.Arrays;

public class Dealership {
    // fields
    private Car[] cars;

    // constructor
    public Dealership(Car[] cars) {
        this.cars = new Car[cars.length];
        for (int i = 0; i < cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }
    }

    // getters
    public Car getCar(int index) {          
        return new Car(this.cars[index]);

    }
    // setters
    public void setCar(Car car, int index) {
        this.cars[index] = new Car(car);
    }

    public void sell(int index) {
        this.cars[index].drive();
        this.cars[index] = null;
    }
    /**
     * Function name: search
     *
     * @param make (String)
     * @param budget (int)
     * @return (int) <-------
     *
     * Inside the function:
     *   1. Loops through every element in the cars field.
     *   2. Skips the run if the element is null.
     *   3. If it finds a car the user wants and can afford:
     *     - println: \nWe found a car in spot <i> \n\n <toString>
     *     - print: If you're interested, type 'yes':
     *     - returns the index
     *   4. If the loop runs and it didn't find a car
     *     - println: \nYour search didn't match any results.\n
     *     - returns 404
     */
    public int search(String make, int budget) {
        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] == null) {
                continue;
            } else if (this.cars[i].getMake().equalsIgnoreCase(make) && this.cars[i].getPrice() <= budget){
                System.out.println("\nWe found one in spot " + i + "\n" + this.cars[i].toString());
                System.out.println("If you are interested, type 'yes': ");
                return i;                 
            }
            
        }
        System.out.println("\nYour search didn't match any results.\n");
            return 404;
    }
    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking spot: " + i + "\n";
            if (this.cars[i] == null) {
                temp += "Empty\n";
            } else {
                temp += this.cars[i].toString() + "\n";
            }
        }
        return temp;
    }

}
