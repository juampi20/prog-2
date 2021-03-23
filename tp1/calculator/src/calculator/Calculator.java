package calculator;

import java.util.Scanner;

public class Calculator {

    static Scanner scanner = new Scanner(System.in);
    static Messages utils = new Messages();
    
    public static void main(String[] args) {
        
        Functions functions = new Functions();

        utils.printMessage("\nInput two numbers:");
        float firstNumber = scanner.nextFloat();
        float secondNumber = scanner.nextFloat();

        utils.printMessage("\nOperator? (+ - * /)");
        String operator = scanner.next();

        switch (operator) {
        case "+":
            functions.addition(firstNumber, secondNumber);
            break;
        case "-":
            functions.subtraction(firstNumber, secondNumber);
            break;
        case "*":
            functions.multiplication(firstNumber, secondNumber);
            break;
        case "/":
            functions.division(firstNumber, secondNumber);
            break;
        default:
            utils.printMessage("Invalid option: " + operator);
        }

    }

}
