import java.util.*;

public class ch4prob10
{
	static final double SERV_CHG_CHK = 25.00
	static final double SERV_CHG_SAV = 10.00
	static final double SAV_ACCNT_INT = .04;
	static final double CHECK_ACCNT_INT = .03
	static final double CHECK_ACCNT_INT_2 = .05 
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String accountNum;
        String accountType;
		double minimumBal, currentBal;
		double ;
		
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
		case 'S':
		
		case 'c':
		case 'C':