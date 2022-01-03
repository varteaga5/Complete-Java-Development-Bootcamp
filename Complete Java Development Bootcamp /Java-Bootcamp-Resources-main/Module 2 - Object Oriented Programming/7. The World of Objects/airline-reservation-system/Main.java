import java.util.Arrays;

public class Main {
  
    public static void main(String[] args) {

        Person p1 = new Person("vaa", "usa", "42069", new String []{"vaa", "usa", "42069"}, 8 );

        Person p1Clone = new Person(p1);
        p1Clone.setName("cloned");

        p1.setSeatNumber(55);
        System.out.println("Name: " + p1.getName() + "\n" + "Nationality: " + p1.getNationality() + "\n" + "Date of Birth: " + p1.getDateOfBirth() + "\n" + "Seat Number: " + p1.getSeatNumber() + "\n");

        System.out.println("Name: " + p1Clone.getName() + "\n" + "Nationality: " + p1Clone.getNationality() + "\n" + "Date of Birth: " + p1Clone.getDateOfBirth() + "\n" + "Seat Number: " + p1Clone.getSeatNumber() + "\n");

    }
}
