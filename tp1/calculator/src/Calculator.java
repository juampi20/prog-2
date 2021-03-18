import java.util.ArrayList;
import java.util.Scanner;

/**
 * Calculator
 */
public class Calculator {

    public static void main(String[] args) {

        // Read an input from the user
        Scanner reader = new Scanner(System.in);

        // List of values
        ArrayList<Double> numbers = new ArrayList<>();

        // repeat the block until the block is exited
        while (true) {
            // Ask the user for an input
            System.out.println("Input a number, 0 to quit");
            // Read the input of user
            double number = Double.valueOf(reader.nextLine());
            // Add value to list
            numbers.add(number);
            // Check if the loop should be exited
            if (number == 0) {
                break;
            }

        }

        double sum = sum(numbers);
        double subtraction = subtraction(numbers);
        double multiplication = multiplication(numbers);

        System.out.println("The result of the sum is: " + sum);
        System.out.println("The result of the subtraction is: " + subtraction);
        System.out.println("The result of the multiplication is: " + multiplication);
    }

    private static double sum(ArrayList<Double> numbers) {
        double ret = 0;
        if (!numbers.isEmpty()) {
            for (double number : numbers) {
                ret += number;
            }
        }
        return ret;
    }

    private static double subtraction(ArrayList<Double> numbers) {
        double ret = 0;
        if (!numbers.isEmpty()) {
            for (Double number : numbers) {
                ret -= number;
            }
        }
        return ret;

    }

    private static double multiplication(ArrayList<Double> numbers) {
        double ret=1;
        if (!numbers.isEmpty()) {
            for (Double number : numbers) {
                ret = ret * number;
            }
        }
        return ret;
    }
}
