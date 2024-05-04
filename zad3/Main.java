import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int sum = MathUtils.add(num1, num2);
        System.out.println("Suma: " + sum);

        EmailMessenger emailMessenger = new EmailMessenger();
        String message = "suma " + num1 + " i " + num2 + " to " + sum;
        emailMessenger.sendMessage(message);
    }
}
