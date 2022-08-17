import java.util.Scanner;

// create a random password generator that takes input from the user on how long the password should be and how many passwords it should return and then generates a random password of that length and number. It should have letters, numbers, and symbols and must sounds like words in the english dictionary.
    public class RandomPasswordGenerator {
        // create a random password generator that takes input from the user on how long the password should be and how many passwords it should return and then generates a random password of that length and number. It should have letters, numbers, and symbols
        public static String generateRandomCharacter() {
            String randomCharacter = "";
            int randomNumber = (int) (Math.random() * 94) + 33;
            randomCharacter = Character.toString((char) randomNumber);
            return randomCharacter;
        }
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
        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("How long do you want your password to be?");
                int length = sc.nextInt();
                System.out.println("How many passwords do you want?");
                int number = sc.nextInt();
                for (int i = 0; i < number; i++) {
                    System.out.println(generatePassword(length, number));
                }
            }
        }
    }