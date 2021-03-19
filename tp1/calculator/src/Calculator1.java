import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        String operator;
        boolean run = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInput two numbers:");
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();

        do {

            System.out.println("\nOperator? (+ - * /)");
            operator = scanner.next();

            switch (operator) {

            case "+":
                double sum = sum(firstNumber, secondNumber);
                System.out.println("\nThe result of sum is: " + sum);
                run = false;
                break;

            case "-":
                double subtract = subtract(firstNumber, secondNumber);
                System.out.println("\nThe result of subtract is: " + subtract);
                run = false;
                break;

            case "*":
                double multiplication = multiplication(firstNumber, secondNumber);
                System.out.println("\nThe result of multiplication is: " + multiplication);
                run = false;
                break;

            case "/":
                double division = division(firstNumber, secondNumber);
                System.out.println("\nThe result of division is: " + division);
                run = false;
                break;

            default:
                System.out.println("Invalid option: " + operator);
                break;
            }

        } while (run);

    }

    private static Double sum(Double firstNumber, Double secondNumber) {
        return firstNumber + secondNumber;
    }

    private static Double subtract(Double firstNumber, Double secondNumber) {
        return firstNumber - secondNumber;
    }

    private static Double multiplication(Double firstNumber, Double secondNumber) {
        return firstNumber * secondNumber;
    }

    private static Double division(Double firstNumber, Double secondNumber) {
        return firstNumber / secondNumber;
    }

}
