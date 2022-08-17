import java.util.Scanner;

public class RandomPasswordGenerator {
    // Generates a single random character (lowercase, uppercase, digit, or special
    // character)
    public static String generateRandomCharacter() {
        String randomCharacter = "";
        int randomNumber = (int) (Math.random() * 94) + 33;
        randomCharacter = Character.toString((char) randomNumber);
        return randomCharacter;
    }

    // Generates a random password of the length and number specified by the user
    public static String generatePassword(int length, int numberOfPasswords) {
        String password = "";
        for (int i = 0; i < numberOfPasswords; i++) {
            for (int j = 0; j < length; j++) {
                password += generateRandomCharacter();
            }
            password += "\n";
        }
        return password;
    }

    // Main method
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Ask the user for the length of the password
            String message = "How long do you want your password to be?\n";
            for (char c : message.toCharArray()) {
                System.out.print(c);
                try {
                    Thread.sleep(35);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int length = sc.nextInt();
            System.out.println();

            // Ask the user for the number of passwords to generate
            message = "How many passwords do you want?\n";
            for (char c : message.toCharArray()) {
                System.out.print(c);
                try {
                    Thread.sleep(35);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int number = sc.nextInt();
            System.out.println();

            // Outputs the generated passwords
            for (int i = 0; i < 50; i++) {
                System.out.println();
                try {
                    Thread.sleep(6);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\nHere are your random passwords:");
            System.out.println("--------------------------------");
            System.out.println(generatePassword(length, number) + "\n");
        }
    }
}