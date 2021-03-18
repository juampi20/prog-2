import java.util.ArrayList;
import java.util.Scanner;

/**
 * Calculator
 */
public class Calculator {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        String operator = "";

        while (true) {

            System.out.println("Operator? (+ - * /)");

            operator = reader.nextLine();

            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                break;
            } else {
                System.err.println("Invalid operator.");
            }

        }

        boolean onlyTwoNumbers = false;

        if (operator.equals("/")) {
            onlyTwoNumbers = true;
        }

        ArrayList<Double> numbers = new ArrayList<>();

        System.out.println("Input a number:");

        double firstNumber = reader.nextDouble();

        while (true) {

            if ((onlyTwoNumbers) && (numbers.size() == 1)) {
                if (numbers.get(0) == 0) {
                    numbers.remove(0);
                    System.err.println("The denominator can not be zero");
                    continue;
                }
                break;
            }

            System.out.println("\nInput a number:");

            if (!reader.hasNextDouble()) {
                break;
            }

            double number = reader.nextDouble();

            numbers.add(number);
        }

        reader.close();

        switch (operator) {

        case "+":
            double sum = sum(firstNumber, numbers);
            System.out.println("\nThe result of the sum is: " + sum);
            break;

        case "-":
            double subtraction = subtraction(firstNumber, numbers);
            System.out.println("The result of the subtraction is: " + subtraction);
            break;

        case "*":
            double multiplication = multiplication(firstNumber, numbers);
            System.out.println("The result of the multiplication is: " + multiplication);
            break;

        case "/":
            double division = division(firstNumber, numbers);
            System.out.println("The result of the division is: " + division);
            break;

        default:
            break;
        }

    }

    private static double sum(Double firstNumber, ArrayList<Double> numbers) {
        double ret = firstNumber;
        if (!numbers.isEmpty()) {
            for (double number : numbers) {
                ret += number;
            }
        }
        return ret;
    }

    private static double subtraction(Double firstNumber, ArrayList<Double> numbers) {
        double ret = firstNumber;
        if (!numbers.isEmpty()) {
            for (Double number : numbers) {
                ret -= number;
            }
        }
        return ret;

    }

    private static double multiplication(Double firstNumber, ArrayList<Double> numbers) {
        double ret = firstNumber;
        if (!numbers.isEmpty()) {
            for (Double number : numbers) {
                ret = ret * number;
            }
        }
        return ret;
    }

    private static double division(Double numerator, ArrayList<Double> numbers) {
        double denominator = numbers.get(0);
        return numerator / denominator;
    }
}
