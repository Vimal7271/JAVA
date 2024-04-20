import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the source currency (e.g., USD, EUR, GBP): ");
        String sourceCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the target currency (e.g., USD, EUR, GBP): ");
        String targetCurrency = scanner.next().toUpperCase();

        
        double convertedAmount;
        switch (sourceCurrency) {
            case "USD":
                convertedAmount = convertFromUSD(amount, targetCurrency);
                break;
            case "EUR":
                convertedAmount = convertFromEUR(amount, targetCurrency);
                break;
            case "GBP":
                convertedAmount = convertFromGBP(amount, targetCurrency);
                break;
            default:
                System.out.println("Invalid source currency.");
                return;
        }

        System.out.println("Converted amount: " + convertedAmount + " " + targetCurrency);
    }

    
    public static double convertFromUSD(double amount, String targetCurrency) {
        switch (targetCurrency) {
            case "USD":
                return amount;
            case "EUR":
                return amount * 0.85;
            case "GBP":
                return amount * 0.72;
            default:
                System.out.println("Invalid target currency.");
                return -1;
        }
    }

    public static double convertFromEUR(double amount, String targetCurrency) {
        switch (targetCurrency) {
            case "USD":
                return amount * 1.18;
            case "EUR":
                return amount;
            case "GBP":
                return amount * 0.85;
            default:
                System.out.println("Invalid target currency.");
                return -1;
        }
    }

    public static double convertFromGBP(double amount, String targetCurrency) {
        switch (targetCurrency) {
            case "USD":
                return amount * 1.39;
            case "EUR":
                return amount * 1.18;
            case "GBP":
                return amount;
            default:
                System.out.println("Invalid target currency.");
                return -1;
        }
    }
}