import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        //Task 1 - Pick up the user's decision.
        String resp = scan.nextLine();
        int savings;
        int debt;
        int yearsWorked;
        String name;


        //Task 2 - Print this if the decision is "yes"
        if (resp.equals("yes")) {
            System.out.println("\nGreat! In one line" +
            "\nHow much money do you have in your savings?" +
            "\nAnd, how much do you owe in credit card debt?");
            // Task 3 - Pick up each value 
            savings = scan.nextInt();
            debt = scan.nextInt();

            System.out.println("\nHow many years have you worked for?");
            // Task 4 - Pick up number of years
            yearsWorked = scan.nextInt();
            
            System.out.println("What is your name?");
            // Task 5 - Pick up the user's name
            scan.nextLine();
            name = scan.nextLine();

            // Have $10,000 in their savings account.

            // Have less than $5,000 in credit card debt.

            // Have worked for more than 2 years.

            //Task 6 - Approve the mortgage if they meet the requirements (see article)
            if ( savings >= 10000 && debt <= 5000 && yearsWorked >= 2 ) {
                System.out.println("Congratulations " + name + " You have been approved!");

            } else {
                //       - Otherwise, don't give them a mortgage.          
                System.out.println("Sorry, you are not eligible for a mortgage.");
            }
            
            //Task 2 - Print this if the decision was not "yes"
        } else {

            System.out.println("\nOK. Have a nice day!");
        }


        scan.close();
    }
}