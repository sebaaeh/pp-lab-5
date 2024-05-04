// Main.java
import company.beans.Person;
import company.exceptions.InvalidAgeException;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Krzysiek", 30);
            System.out.println("Nazwa: " + person.getName());
            System.out.println("Wiek: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.err.println("Zły Wiek: " + e.getMessage());
        }
        try {
            Person person = new Person("Seba", 130);
            System.out.println("Nazwa: " + person.getName());
            System.out.println("Wiek: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.err.println("Zły wiek: " + e.getMessage());
        }
    }
}
