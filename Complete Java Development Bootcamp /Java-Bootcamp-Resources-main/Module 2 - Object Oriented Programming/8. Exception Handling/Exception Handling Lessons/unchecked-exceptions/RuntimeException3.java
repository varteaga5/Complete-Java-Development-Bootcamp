import java.util.Scanner;
public class RuntimeException3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        if (scan.hasNextInt()) {
            System.out.println(scan.nextInt());
        } else {
            scan.nextLine();
            System.out.println("not a number");
        }
        System.out.println(scan.nextInt());
        scan.close();

        // RULE OF THUMB
        // catch checked exceptions (these are outside of the applications control)
        // fix unchecked exceptions (this is badly written code)
    }
}
