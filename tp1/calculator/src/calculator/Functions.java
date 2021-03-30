package calculator;

public class Functions {

    public float addition(float firstNumber, float secondNumber) {
        float ret = firstNumber + secondNumber;
        Messages.print(Messages.RESULT_ADDITION + ret);
        return ret;
    }

    public float subtraction(float firstNumber, float secondNumber) {
        float ret = firstNumber - secondNumber;
        Messages.print(Messages.RESULT_SUBTRACTION + ret);
        return ret;
    }

    public float multiplication(float firstNumber, float secondNumber) {
        float ret = firstNumber * secondNumber;
        Messages.print(Messages.RESULT_MULTIPLICATION + ret);
        return ret;
    }

    public float division(float firstNumber, float secondNumber) {
        float ret = firstNumber / secondNumber;
        Messages.print(Messages.RESULT_DIVISION + ret);
        return ret;
    }
}
