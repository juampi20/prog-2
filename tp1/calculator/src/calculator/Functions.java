package calculator;

public class Functions {
    
    Messages utils = new Messages();

    public float addition(float firstNumber, float secondNumber) {
        utils.printMessage("\nAddition");
        float ret = firstNumber + secondNumber;
        utils.printMessage("The result of the addition is: " + ret);
        return ret;
    }

     public float subtraction(float firstNumber, float secondNumber) {
        utils.printMessage("\nSubtraction");
        float ret = firstNumber - secondNumber;
        utils.printMessage("The result of the subtraction is: " + ret);
        return ret;
    }

    public float multiplication(float firstNumber, float secondNumber) {
        utils.printMessage("\nMultiplication");
        float ret = firstNumber * secondNumber;
        utils.printMessage("The result of the multiplication is: " + ret);
        return ret;
    }

    public float division(float firstNumber, float secondNumber) {
        utils.printMessage("\nDivision");
        float ret = firstNumber / secondNumber;
        utils.printMessage("The result of division is: " + ret);
        return ret;
    }
}
