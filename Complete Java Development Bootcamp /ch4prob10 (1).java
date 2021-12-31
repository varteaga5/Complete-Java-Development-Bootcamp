import java.util.*;

public class ch4prob10
{
	static final double SERV_CHG_CHK = 25.00;
	static final double SERV_CHG_SAV = 10.00;
	static final double SAV_ACCNT_INT = .04;
	static final double CHECK_ACCNT_INT = .03;
	static final double CHECK_ACCNT_INT_2 = .05;
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String accountNum;
        String accountType;
		double minimumBal, currentBal;
		// variables for savings account.
		double belowBalAccount = currentBal-SERV_CHG_SAV;
		double newBalance = currentBal*SAV_ACCNT_INT;
		double aboveBalAccount = currentBal+aboveBalAccountCalculation;
		double aboveBalAccountCalculation = currentBal*SAV_ACCNT_INT;
		
		// variables for checking account.
		double belowChkAccount = currentBal-SERV_CHG_CHK;
		double newChkBalance = currentBal;
		System.out.println("Please enter the account number.");
		accountNum = console.next();
		
		System.out.println("Please enter the account type, 's' for savings, 'c' for checking.");
		accountType = console.next().charAt(0);
		
		System.out.println("Please enter the minimum balance with two decimal places.");
		minimumBal = console.nextDouble();
		
		System.out.println("Please enter the current balance with two decimal places.")
		currentBal = console.nextDouble();
		
		switch (accountType)
		{
		case 's':
		case 'S': if (currentBal<minimumBal)
					{
					System.out.println(accountNum+" "+accountType+" "+belowBalAccount+" Account is below"+
					"the minimum balance, account has been charged the service charge.");
					}
				  else
					System.out.println(accountNum+" "+accountType+" "+aboveBalAccount+" Account is above"+
					"or equal to the minimum balance, account received interest.");				  
		case 'c':
		case 'C': if (currentBal<minimumBal)
					{
					System.out.println(accountNum+" "+accountType+" "+);
		
		
		default: System.out.println(accoutType+", is an not an account type." );
		}
	}
}	