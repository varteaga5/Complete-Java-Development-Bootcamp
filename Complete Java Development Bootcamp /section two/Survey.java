import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;

        System.out.println("Welcome. Thank you for taking the survey");

        System.out.println("\nwhat is your name?");
        String name = scan.nextLine();
        counter++;

        System.out.println("\nhow much do you spend on coffee?");
        double coffeePrice = scan.nextDouble();
        counter++;
        
        System.out.println("\nhow much do you spend on fast food?");
        double foodPrice = scan.nextDouble();
        counter++;
        
        System.out.println("\nhow many times a week do you buy coffee?");
        int coffeeAmount = scan.nextInt();
        counter++;
        
        System.out.println("\nhow many times a week do you buy fast food?");
        int foodAmount = scan.nextInt();
        counter++;
        
        scan.close();

        System.out.println("\nthank you " + name + " you answered " + counter + " questions");
        System.out.println("your name: " + name);
        System.out.println("this is coffeePrice: " + coffeePrice);
        System.out.println("this is foodPrice: " + foodPrice);
        System.out.println("this is coffeeAmount: " + coffeeAmount);
        System.out.println("this is foodAmount: " + foodAmount);

        System.out.println("your fast food expenses are: " + (foodPrice/foodAmount) + " times your coffee expense");


    }
}
