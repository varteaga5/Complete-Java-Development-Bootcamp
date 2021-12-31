//Chapter 7: Programming Exercise 11

import java.io.*;
import java.util.*;

public class Ch7_PrExercise11
{
    public static void main(String[] args) throws FileNotFoundException
    {

        //variable declaration
        int count = 0; // Loop control variable
        IntClass number = new IntClass();  // Store the new number
        IntClass zeros = new IntClass();   // Store the number of zeros
        IntClass odds = new IntClass();    // Store the number of odd integers
        IntClass evens = new IntClass();  // Store the number of even integers

        int sum = 0;
        int average = 0;

        Scanner inFile = new Scanner(new FileReader("a:\\Ch7_Ex11Data.txt"));

        PrintWriter outFile = new PrintWriter("a:\\Ch7_Ex11out.txt");

        initialize(zeros, odds, evens);

        System.out.println("Processing Data");

        while (inFile.hasNext())
        {
			getNumber(number, inFile, outFile);
            classifyNumber(number.getNum(), zeros, odds, evens);

            count++;
            sum = sum + number.getNum();
            if (count % 10 == 0) //Print 10 numbers per line
               outFile.println();
        }

        if (count != 0)
            average = sum / count;
        else
        {
            System.out.println("No input. Check input file.");
            return;
        }

        outFile.println();

        printResults(zeros.getNum(),odds.getNum(),evens.getNum(), sum, average, outFile);

        outFile.close();
   }

   public static void initialize(IntClass zeroCount, IntClass oddCount,
                                 IntClass evenCount)
   {
       zeroCount.setNum(0);
       oddCount.setNum(0);
       evenCount.setNum(0);
   }

   public static void getNumber(IntClass num, Scanner inputFile, PrintWriter out)
   {
       num.setNum(inputFile.nextInt());
       out.print(num.getNum() + " ");
   }

   public static void classifyNumber(int num, IntClass zeroCount,
                                     IntClass oddCount,  IntClass evenCount)
   {
       if (num % 2 == 0)
       {
           evenCount.addToNum(1);
           if (num == 0)
               zeroCount.addToNum(1);
       }
       else
           oddCount.addToNum(1);
   }

   public static void printResults(int zeroCount, int oddCount, int evenCount,
                                   int sum, int avg, PrintWriter outputFile)
   {
       outputFile.println("There are " + evenCount + " evens, "
                         +"which also includes " + zeroCount
                         +" zeros");
       outputFile.println("Total number of odds are: " + oddCount);
       outputFile.println("The sum of numbers = " + sum);
       outputFile.println("The average is " + avg);
   }
}



