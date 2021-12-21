import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        

        //Task 1 - Using Scanner, ask the user questions

        //Ask for their first name.
        System.out.println("what is your first name?");
        String firstName = scan.nextLine();
        
        //Ask for their last name.
        System.out.println("what is your last name?");
        String lastName = scan.nextLine();
        
        //Ask: how old are you?
        System.out.println("how old are you?");
        int age = scan.nextInt();
        
        //Ask them to make a username.
        System.out.println("make a username");
        scan.nextLine();
        String username = scan.nextLine();
        
        //Ask what city they live in.
        System.out.println("what city do you live in?");
        String city = scan.nextLine();
        
        //Ask what country that's from.
        System.out.println("what country is that from?");
        String country = scan.nextLine();


        //Task 2 - Print their information. 

        System.out.println("Thank you for joining JavaGram!");

        //Print their information like so:

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //
        System.out.println("Your information:");
        System.out.println("\tFirst Name: " + firstName);
        System.out.println("\tLast Name: " + lastName);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + username);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);


        //close scanner. It's good practice :D ! 
        scan.close();
    }
}