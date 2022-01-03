public class Person {
    String name;
    String nationality;
    String dateOfBirth;
    String[] passport;
    int seatNumber;

    // Constructor method
    public Person(String name, String nationality, String dateOfBirth, String[] passport, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.passport = passport;
        this.seatNumber = seatNumber;
    }

    public void applyPassport(){
        System.out.println("passport");
    }
    
    public void chooseSeat() {
        System.out.println("passport");
        
    }
}
