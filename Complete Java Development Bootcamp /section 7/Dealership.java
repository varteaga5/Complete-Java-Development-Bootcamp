import java.util.Arrays;

public class Dealership {
    private Car[] cars;

    public Dealership() {
        this.cars = new Car[3];
    }

    public void setCar(Car car, int index) {
        this.cars[index] = new Car(car);

    }
}
