import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {
        String operator;
        boolean run = true;

        Scanner scanner = new Scanner(System.in);

        do {
            
            System.out.println("\nOperator? (+ - * /)");
            operator = scanner.next();

            switch (operator) {
                case "+":
                    double addition = addition();
                    System.out.println("\nThe result of sum is: " + addition);
                    run = false;
                    break;
                case "-":
                    double subtraction = subtraction();
                    System.out.println("\nThe result of subtract is: " + subtraction);
                    run = false;
                    break;

                case "*":
                    double multiplication = multiplication();
                    System.out.println("\nThe result of multiplication is: " + multiplication);
                    run = false;
                    break;
                
                case "/":
                    double division = division();
                    System.out.println("\nThe result of division is: " + division);
                    run = false;
                    break;
            
                default:
                    System.out.println("Invalid operator.");
                    break;
            }

        } while (run);
    }

    private static double addition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInput number: (type not number to exit)");
        double ret = scanner.nextDouble();
        while (scanner.hasNextDouble()) {
            ret += scanner.nextDouble();
        }
        scanner.close();
        return ret;

    }

    private static double subtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInput number: (type not number to exit)");
        double ret = scanner.nextDouble();
        while (scanner.hasNextDouble()) {
            ret -= scanner.nextDouble();
        }
        scanner.close();
        return ret;
    }

    private static double multiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInput number: (type not number to exit)");
        double ret = scanner.nextDouble();
        while (scanner.hasNextDouble()) {
            ret = ret * scanner.nextDouble();
        }
        scanner.close();
        return ret;
    }

    private static double division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInput two numbers:");
        double numerator = scanner.nextDouble();
        double denominator = scanner.nextDouble();
        scanner.close();
        return numerator / denominator;
    }
}
