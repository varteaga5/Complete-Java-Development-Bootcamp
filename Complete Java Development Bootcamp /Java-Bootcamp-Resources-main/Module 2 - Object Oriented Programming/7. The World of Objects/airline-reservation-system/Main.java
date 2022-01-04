import java.util.Arrays;

public class Main {
  
    public static void main(String[] args) {

        Person p1 = new Person("vaa", "usa", "42069", 5 ); 
        if (p1.applyPassport() == true) {
            p1.setPassport();
        }

        System.out.println(p1);
        // Person p1 = new Person("vaa", "usa", "42069", new String []{"vaa", "usa", "42069"}, 8 );
        
        // // Person p1Clone = new Person(p1);
        // // p1Clone.setName("cloned");
        
        // p1.chooseSeat();
        // System.out.println("Name: " + p1.getName() + "\n" + "Nationality: " + p1.getNationality() + "\n" + "Date of Birth: " + p1.getDateOfBirth() + "\n" + "Seat Number: " + p1.getSeatNumber() + "\n");
        
        // if(p1.applyPassport()) {
        //     System.out.println("Congratulations " + p1.getName() + ". Your passport was approved!");
        // } else {
        //     System.out.println("We're sorry " + p1.getName() + ". We cannot process your application.");
        // }
        // // System.out.println("Name: " + p1Clone.getName() + "\n" + "Nationality: " + p1Clone.getNationality() + "\n" + "Date of Birth: " + p1Clone.getDateOfBirth() + "\n" + "Seat Number: " + p1Clone.getSeatNumber() + "\n");

    }
}
