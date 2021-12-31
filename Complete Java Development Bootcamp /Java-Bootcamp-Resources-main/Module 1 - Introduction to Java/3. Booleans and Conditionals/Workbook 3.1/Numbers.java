import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        // !)Write a program to accept 10 numbers and find out the total even numbers and total odd numbers in array.
        
        // create scanner
        Scanner scan = new Scanner(System.in);
        // create oddCount variable
        int oddCount = 0;
        // create evenCount variable
        int evenCount = 0;
        // create array 
        int [] numArr = new int[10];
        // element of array6
        int arrElement = 0;
        // prompt user for numbers
        // loop here to add each number to the array
        for(int i = 0; i < numArr.length; i++){
            if(i > 9) {
                break;
            } else {

                System.out.println("please enter a number");
                arrElement = scan.nextInt();
                // set response to the NumArr
                numArr[i] = arrElement;
            }
        }
        // once array is complete2
        
        // loop over array
        for(int j = 0; j < numArr.length; j++){
            // check if it is odd '%'
            if(numArr[j] % 2 != 0){
                System.out.println(" this is inside true");
                // if odd increase oddCount variable
                oddCount++;
            } else {
                // else increase evenCount variable
                evenCount++;
            }

        }

        // print even numbers 
        System.out.println("these are the number of even numbers " + evenCount);
        
        // print odd numbers 
        System.out.println("these are the number of odd numbers " + oddCount);


    }
}

// initializing array from {} to new int [10]
// adding a conditional inside the loop to make sure that it does not go out of bounds