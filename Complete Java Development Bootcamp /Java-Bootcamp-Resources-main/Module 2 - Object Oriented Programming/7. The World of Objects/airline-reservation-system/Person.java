import java.io.ObjectInputStream.GetField;
import java.util.Random;

public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    // Constructor method
    public Person(String name, String nationality, String dateOfBirth, String[] passport, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.passport = passport;
        this.seatNumber = seatNumber;
    }
    // Copy constructor
    public Person(Person source){
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.passport = source.passport;
        this.seatNumber = source.seatNumber;
    }

    // Getter methods
    public String getName(){
        return this.name;
    }
    public String getNationality(){
        return this.nationality;
    }    
    public String getDateOfBirth(){
        return this.dateOfBirth;
    }    
    public int getSeatNumber(){
        return this.seatNumber;
    }

    // Setter methods
    public String setName(String name){
        return this.name = name;
    }
    public String setNationality(String nationality){
        return this.nationality = nationality;
    }    
    public String setDateOfBirth(String dateOfBirth){
        return this.dateOfBirth = dateOfBirth;
    }    
    public int setSeatNumber(int seatNumber){
        return this.seatNumber = seatNumber;
    }

    public boolean applyPassport(){
        return Math.random() < 0.5;
    }
    
    public void chooseSeat() {
        double randNum = Math.random() * 11;
        randNum += 1;
        this.seatNumber = (int)randNum;
    }
}
