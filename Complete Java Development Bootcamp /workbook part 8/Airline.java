public class Airline {
    // fields
    private Person[] seats;
    
    // constructors
    public Airline() {
        this.seats = new Person[11];
    }

    // getters
    public Person getPerson(int index){
        return new Person(this.seats[index]);
    }

    //setters
    public void setPerson(Person person){
        this.seats[person.getSeatNumber() - 1] = new Person(person);
    }


    public void createReservation() {
        System.out.println("this is reservation");
    }
}
