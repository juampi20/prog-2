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

        switch (operator) {
        case "+":
            funcs.addition(firstNumber, secondNumber);
            break;
        case "-":
            funcs.subtraction(firstNumber, secondNumber);
            break;
        case "*":
            funcs.multiplication(firstNumber, secondNumber);
            break;
        case "/":
            funcs.division(firstNumber, secondNumber);
            break;
        default:
            Messages.print(Messages.INVALID_OPTION + operator);
        }

        scanner.close();

    }

}
