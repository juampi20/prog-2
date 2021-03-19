import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        String operator;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInput two numbers:");
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();

        System.out.println("\nOperator? (+ - * /)");
        operator = scanner.next();

        switch (operator) {
        case "+":
            addition(firstNumber, secondNumber);
            break;
        case "-":
            subtraction(firstNumber, secondNumber);
            break;
        case "*":
            multiplication(firstNumber, secondNumber);
            break;
        case "/":
            division(firstNumber, secondNumber);
            break;
        default:
            System.out.println("Invalid option: " + operator);
        }

    }

    private static double addition(Double firstNumber, Double secondNumber) {
        System.out.println("\nAddition");
        double ret = firstNumber + secondNumber;
        System.out.println("The result of the addition is: " + ret);
        return ret;
    }

    private static double subtraction(Double firstNumber, Double secondNumber) {
        System.out.println("\nSubtraction");
        double ret = firstNumber - secondNumber;
        System.out.println("The result of the subtraction is: " + ret);
        return ret;
    }

    private static double multiplication(Double firstNumber, Double secondNumber) {
        System.out.println("\nMultiplication");
        double ret = firstNumber * secondNumber;
        System.out.println("The result of the multiplication is: " + ret);
        return ret;
    }

    private static double division(double firstNumber, double secondNumber) {
        System.out.println("\nDivision");
        double ret = firstNumber / secondNumber;
        System.out.println("The result of division is: " + ret);
        return ret;
    }

}
