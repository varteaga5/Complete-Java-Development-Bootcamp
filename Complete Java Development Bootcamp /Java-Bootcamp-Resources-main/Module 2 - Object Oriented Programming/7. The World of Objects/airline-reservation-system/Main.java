import java.util.Arrays;

public class Main {
  
    public static void main(String[] args) {

        Person p1 = new Person("vaa", "usa", "42069", new String []{"vaa", "usa", "42069"}, 4 );

        System.out.println(p1.name);
        System.out.println(p1.dateOfBirth);
        System.out.println(p1.nationality);
        System.out.println(Arrays.toString(p1.passport));
        System.out.println(p1.seatNumber);

        System.out.println("Name: " + p1.name + "\n" + "Nationality: " + p1.nationality + "\n" + "Date of Birth: " + p1.dateOfBirth + "\n" + "Seat Number: " + p1.seatNumber + "\n");
    }
}
