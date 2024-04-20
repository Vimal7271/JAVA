public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator <operand1> <operator> <operand2>");
            return;
        }

        double operand1 = Double.parseDouble(args[0]);
        char operator = args[1].charAt(0);
        double operand2 = Double.parseDouble(args[2]);

        double result = 0;

        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 == 0) {
                    System.out.println("Error: Division by zero");
                    return;
                }
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("Result: " + result);
    }
}