package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Contact {
    // fields
 private String name;
 private String phoneNumber;
 private String birthDate;
 private int age;

  public Contact(String name, String phoneNumber, String birthDate) throws ParseException{
    if (name == null || name.isBlank()) {
        throw new IllegalArgumentException("name cannot be null or blank");
    }
    if (phoneNumber == null || phoneNumber.isBlank() || phoneNumber.length() < 5) {
        throw new IllegalArgumentException("phone number cannot be null or blank or less than 5 numbers");
    }
    this.name = name;
    this.birthDate = birthDate;
    this.phoneNumber = phoneNumber;
    this.age = toAge(birthDate);
  }   
  public Contact(Contact source) {
    this.name = source.name;
    this.phoneNumber = source.phoneNumber;
    this.birthDate = source.birthDate;
    this.age = source.age;
  }

  public String getName() {
      return name;
  }
  public int getAge() {
      return age;
  }
  public String getBirthDate() {
      return birthDate;
  }
  public String getPhoneNumber() {
    if (phoneNumber == null || phoneNumber.isBlank() || phoneNumber.length() < 5) {
        throw new IllegalArgumentException("phone number cannot be null or blank or less than 5 numbers");
    }  
    return phoneNumber;
  }
  public void setName(String name) {
    if (name == null || name.isBlank()) {
        throw new IllegalArgumentException("name cannot be null or blank");
    }
    this.name = name;
  }
  private void setAge(int age) {
      this.age = age;
  }
  public int toAge(String birthDate) throws ParseException {
    // calculating age 
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
    formatter.setLenient(false);
    long diff = new Date().getTime() - formatter.parse(birthDate).getTime();
    return (int) (TimeUnit.MILLISECONDS.toDays(diff) / 365);
  }
  public void setBirthDate(String birthDate) throws ParseException {
      this.birthDate = birthDate;
      setAge(toAge(birthDate));
  }
  public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
  }
  public String toString() {
    return "Name: " + this.name + "\n" +

        "Phone number: " + this.phoneNumber + "\n" +
    
        "Birth Date: " + this.birthDate + "\n" +
    
        "Age: " + this.age + " year old\n";
  }
}
