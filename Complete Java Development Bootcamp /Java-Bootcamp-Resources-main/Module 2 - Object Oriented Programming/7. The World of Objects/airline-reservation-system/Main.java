import java.util.Arrays;

public class Main {
  
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "tim";
        p1.dateOfBirth = "420";
        p1.nationality = "sri lanka";
        p1.passport = new String []{"tim", "sri lanka", "420"};
        p1.seatNumber = 4;

        System.out.println(p1.name);
        System.out.println(p1.dateOfBirth);
        System.out.println(p1.nationality);
        System.out.println(Arrays.toString(p1.passport));
        System.out.println(p1.seatNumber);
      
      
      
    }
  
  
}
