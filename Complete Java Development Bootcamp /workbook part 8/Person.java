import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.Random;

public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    // Constructor method
    public Person(String name, String nationality, String dateOfBirth, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.passport = new String[3];
        this.seatNumber = seatNumber;
    }
    // Copy constructor
    public Person(Person source){
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.passport = Arrays.copyOf(source.passport, source.passport.length);
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
    public String[] getPassport(){
        return Arrays.copyOf(this.passport, this.passport.length);
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
    public void setPassport(){
         this.passport = new String[] {this.name, this.nationality,this.dateOfBirth};
    }

    public boolean applyPassport(){
        return Math.random() < 0.5;
    }
    
    public void chooseSeat() {
        double randNum = Math.random() * 11;
        randNum += 1;
        this.seatNumber = (int)randNum;
    }
    public String toString() {
        return ("Name: " + this.name + "\n" + "Nationality: " + 
        this.nationality + "\n" + "Date of Birth: " + 
        this.dateOfBirth + "\n" + "Seat Number: " +
        this.seatNumber + "\n" + "Passport: " + 
        Arrays.toString(this.passport) + "\n"); 
    }
}
