import company.implementations.EmailMessenger;
import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        
      final int b = 10;

        try {
            people[0] = new Person("Krzysiek", 30);
            people[1] = new Person("Seba", 25);
            people[2] = new Person("Marcin", 40);
            people[3] = new Person("Janek", 35);
            people[4] = new Person("Kuba", 20);

            for (Person person : people) {
                int value = MathUtils.add(person.getAge(), b);
                String message = "The value for " + person.getName() + " is " + value;
                sendMessage(message);
            }
        } catch (InvalidAgeException e) {
            System.err.println("Invalid age: " + e.getMessage());
        }
    }

    private static void sendMessage(String message) {
        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage(message);
    }
}
