package calculator;

import java.util.Scanner;

public final class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Functions funcs = new Functions();

        Messages.print(Messages.ADD_NUMBER);
        float firstNumber = scanner.nextFloat();
        float secondNumber = scanner.nextFloat();

        Messages.print(Messages.CHOOSE_OPTION);
        String operator = scanner.next();

        scanner.close();

        float result = 0;
        switch (operator) {
        case "+":
            result = funcs.addition(firstNumber, secondNumber);
            break;
        case "-":
            result = funcs.subtraction(firstNumber, secondNumber);
            break;
        case "*":
            result = funcs.multiplication(firstNumber, secondNumber);
            break;
        case "/":
            result = funcs.division(firstNumber, secondNumber);
            break;
        default:
            Messages.print(Messages.INVALID_OPTION + operator);
            return;
        }

        System.out.println("\n" + firstNumber + " " + operator + " " + secondNumber + " = " + result);

    }

}
