/*
PROJECT IDENTIFICATION

Course Name/Number: Problem Solving and Programming 1, CMPSC 205
Section number:     2697

Programmer:			Vincent Arteaga
Assignment:			problem 10 chapter 4 

due date: 			Wednesday march, 9 2011

PROJECT ALGORITHM/PSEUDOCODE
	STEPS
		1. prompt the user to enter the account number/ get the account number.
		2. prompt the user to enter the account type/ get the account type.
		3. prompt the user to enter the minimum balance/ get the minimum balance.
		4. prompt the user to enter the current balance/ get the current balance.
		5. if the account type is 'S' or 's'.
			- if current balance is less than minimum balance.
			   a. get service charge and apply service charge.
			   b. print account number, account type, new balance, and appropriate message.
			- if current balance is more than the minimum balance.
			   a. calculate interest and add to current balance. 
			   b. print the account number, account type, new balance, and appropriate message.
		6. if the account type is 'C' or 'c'.
			- if current balance is less than minimum balance.
			   a. get service charge and apply service charge.
			   b. print account number, account type, new balance, and appropriate message.
			- if current balance is more than the minimum balance and less than 5000.00 more 
				than the minimum balance 
			   a. calculate the interest and apply to current balance.
			   b. print the account number, account type, new balance, and appropriate message.
		
			
		*/


import java.util.*;

public class ch4prob10
{
	static final double SERV_CHG_CHK = 25.00;
	static final double SERV_CHG_SAV = 10.00;
	static final double SAV_ACCNT_INT = .04;
	static final double CHECK_ACCNT_INT = .03;
	static final double CHECK_ACCNT_INT_2 = .05; 
	static final double CHECK_ACCNT_OVER_BAL = 5000.00;
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		// variables to recieve input from user
		String accountNum;
        double minimumBal, currentBal;
		char accountType;
				
		// prompts user for account number and assigns value to accountNum.				
		System.out.println("Please enter the account number.");
		accountNum = console.next();
		
		// prompts user for account type and assigns value to accountType. 
		System.out.println("Please enter the account type, 's' for savings, 'c' for checking.");
		accountType = console.next().charAt(0);
				
		// prompts user for minimum balance and assigns value to minimumBal.
		// variable that holds value of amount over minimum balance
		System.out.println("Please enter the minimum balance with two decimal places.");
		minimumBal = console.nextDouble();
		double amountOverBal = (minimumBal)+(CHECK_ACCNT_OVER_BAL);
		
		// prompts user for current balance and assigns value to currentBal.
		System.out.println("Please enter the current balance with two decimal places.");
		currentBal = console.nextDouble();
		double belowBalAccount = (currentBal)-(SERV_CHG_SAV);
		double newBalance = currentBal*SAV_ACCNT_INT;
		double aboveBalAccountCalculation = currentBal*SAV_ACCNT_INT;
		double aboveBalAccount = currentBal+aboveBalAccountCalculation;
		double interestAddition5Percent = currentBal*CHECK_ACCNT_INT_2;
		double interestAddition3Percent = currentBal*CHECK_ACCNT_INT;
		double belowChkAccount = currentBal-SERV_CHG_CHK;
		double newChkBalance5 = currentBal+interestAddition5Percent;
		double newChkBalance3 = currentBal+interestAddition3Percent;
		
		switch (accountType)
		{
		case 's':
		case 'S': if (currentBal<minimumBal)
					{
					System.out.println(accountNum+" "+accountType);
					System.out.printf("%.2f %n",belowBalAccount);
					System.out.println("Account is below the minimum balance, account has been charged the service charge.");
					}
				  else
					{
					System.out.println(accountNum+" "+accountType);
					System.out.printf("%.2f %n",aboveBalAccount);
					System.out.println("Account is above or equal to the minimum balance, account received interest.");				  
					}
				break;
		case 'c':
		case 'C': if (currentBal<minimumBal)
					{
					System.out.println(accountNum+" "+accountType);
					System.out.printf("%.2f %n",belowChkAccount);
					System.out.println("Account is below the minimum balance, account has been charged the service charge.");
		            }
				  else
                    {
					if (currentBal<amountOverBal)
					{
					System.out.println(accountNum+" "+accountType);
					System.out.printf("%.2f %n",newChkBalance3);
					System.out.println("Account received 3% interest.");
					}
					else
					{
					System.out.println(accountNum+" "+accountType);
					System.out.printf("%.2f %n",newChkBalance5);
					System.out.println("Account received 5% interest.");
				    }
					}
				break;	
		default: System.out.println(accountType+", is an not an account type." );
		}
	}
	//if (currentBal>minimumBal && currentBal<amountOverBal)
}	