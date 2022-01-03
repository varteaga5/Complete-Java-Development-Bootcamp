import java.util.Arrays;

public class Main {
  
    public static void main(String[] args) {

        Person p1 = new Person("vaa", "usa", "42069", new String []{"vaa", "usa", "42069"}, 4 );

        System.out.println(p1.name);
        System.out.println(p1.dateOfBirth);
        System.out.println(p1.nationality);
        System.out.println(Arrays.toString(p1.passport));
        System.out.println(p1.seatNumber);
    }
  
  
}
