package calculator;

import java.util.Scanner;

public final class Calculator {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Functions funcs = new Functions();

        System.out.println(Constants.ADD_NUMBER);
        float firstNumber = reader.nextFloat();
        float secondNumber = reader.nextFloat();

        System.out.print(Constants.CHOOSE_OPERATOR);
        String operator = reader.next();

        reader.close();

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
        System.out.println(String.format(Constants.INVALID_OPERATOR, operator));
            return;
        }

        System.out.println(String.format(Constants.RESULT, firstNumber, operator, secondNumber, result));

    }

}
