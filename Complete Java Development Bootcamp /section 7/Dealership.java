import java.util.Arrays;

public class Dealership {
    // fields
    private Car[] cars;

    // constructor
    public Dealership() {
        this.cars = new Car[3];
        System.out.println(Arrays.toString(this.cars));
    }

    // getters
    public Car getCar(int index) {          
        return new Car(this.cars[index]);

    }
    // setters
    public void setCar(Car car, int index) {
        this.cars[index] = new Car(car);

    }

}
