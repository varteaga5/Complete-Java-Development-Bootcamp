// WaterBottleInterface.java
// holds variables and methods that can be used by other classes
// with public type keyword WaterBottleInterface must be defined in its own file
 interface WaterBottleInterface {
    String color = "Blue";

    void fillUp();
    void pourOut();
    // default methods can have a body
    default void printStuff(){
        System.out.println("this is printStuff");
    }
}

// InterfaceExample.java
// since there is a waterbottle interface that has already been created we can use that instead of creating new code, use "implements" to access it
public class InterfaceExample implements WaterBottleInterface{
    public static void main(String[] args) {
    // interface is an outline for a class
        System.out.println("this is color: " + color);
        InterfaceExample ex1 = new InterfaceExample();
        ex1.fillUp();
        ex1.pourOut();        
    }
    // when using implements you must include all the interfaces methods 
    @Override
    public void fillUp() {
        System.out.println("this is fillUp");
    }
    @Override
    public void pourOut() {
        System.out.println("this is pourOut");
    }
}