//Chapter 7: Programming Exercise 8

import java.util.*;

public class Ch7_PrExercise8
{
    final static double R_SERVICE_CHARGE = 10.00;
    final static int R_FREE_MINUTES = 50;
    final static double R_RATE_OVER_50 = 0.20;

    final static double P_SERVICE_CHARGE = 25.00;
    final static int P_FREE_DAY = 75;
    final static double P_DAY_RATE_OVER_75 = 0.10;

    final static int P_FREE_NIGHT = 100;
    final static double P_NIGHT_RATE_OVER_100 = 0.05;

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {

        int accountNo;
        char serviceType;

        double billingAmount;

        System.out.print("Enter account number: ");
        accountNo = console.nextInt();
        System.out.println();

        System.out.print("Enter service type: (r or R) for regular "
                       + "(p or P) for premium service: ");
        serviceType = console.next().charAt(0);
        System.out.println();

        switch(serviceType)
        {
        case 'r':
        case 'R':  billingAmount = regularBill();
                   System.out.println("Account Number: " + accountNo);
                   System.out.println("Serice Type: Regular");
                   System.out.printf("Amount Due: $%.2f %n", billingAmount);
                   break;
        case 'p':
        case 'P':  billingAmount = premiumBill();
                   System.out.println("Account Number: "+accountNo);
                   System.out.println("Serice Type: Premium");
                   System.out.printf("Amount Due: $%.2f %n", billingAmount);
                   break;
        default:  System.out.println("Invalid Service Type");
        }//end switch
    }

    public static double regularBill()
    {
        int minutesUsed;
        double amountDue = 0;


        System.out.print("Enter number of minutes service used: ");
        minutesUsed = console.nextInt();
        System.out.println();

        if (minutesUsed <= R_FREE_MINUTES)
            amountDue= R_SERVICE_CHARGE;
        else
            amountDue = R_SERVICE_CHARGE + (minutesUsed - R_FREE_MINUTES) * R_RATE_OVER_50;

       return amountDue;
    }

    public static double premiumBill()
    {
        int minutesUsed;
        int minutesUsedPN;

        double amountDue = 0;

        System.out.print("Enter day time minutes used: ");
        minutesUsed = console.nextInt();
        System.out.println();

        System.out.print("Enter night time minutes used: ");
        minutesUsedPN = console.nextInt();
        System.out.println();

        amountDue = P_SERVICE_CHARGE;

        if (minutesUsed > P_FREE_DAY)
            amountDue = amountDue + (minutesUsed - P_FREE_DAY) * P_DAY_RATE_OVER_75;

        if (minutesUsedPN > P_FREE_NIGHT)
            amountDue = amountDue
                      + (minutesUsedPN - P_FREE_NIGHT) * P_NIGHT_RATE_OVER_100;

        return amountDue;
   }
}






