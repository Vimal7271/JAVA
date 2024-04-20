import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java PasswordGenerator <length> [<includeUppercase>] [<includeLowercase>] [<includeNumbers>] [<includeSpecialCharacters>]");
            return;
        }

        int length = Integer.parseInt(args[0]);

        boolean includeUppercase = false;
        boolean includeLowercase = false;
        boolean includeNumbers = false;
        boolean includeSpecialCharacters = false;

        if (args.length > 1) {
            includeUppercase = Boolean.parseBoolean(args[1]);
        }
        if (args.length > 2) {
            includeLowercase = Boolean.parseBoolean(args[2]);
        }
        if (args.length > 3) {
            includeNumbers = Boolean.parseBoolean(args[3]);
        }
        if (args.length > 4) {
            includeSpecialCharacters = Boolean.parseBoolean(args[4]);
        }

        String password = generatePassword(length, includeUppercase, includeLowercase, includeNumbers, includeSpecialCharacters);
        System.out.println("Generated Password: " + password);
    }

    public static String generatePassword(int length, boolean includeUppercase, boolean includeLowercase, boolean includeNumbers, boolean includeSpecialCharacters) {
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*()_+[]{}|;:,.<>?";

        String allCharacters = "";
        if (includeUppercase) {
            allCharacters += uppercaseLetters;
        }
        if (includeLowercase) {
            allCharacters += lowercaseLetters;
        }
        if (includeNumbers) {
            allCharacters += numbers;
        }
        if (includeSpecialCharacters) {
            allCharacters += specialCharacters;
        }

        if (allCharacters.isEmpty()) {
            return "Error: No character sets selected";
        }

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(allCharacters.length());
            password.append(allCharacters.charAt(randomIndex));
        }

        return password.toString();
    }
}