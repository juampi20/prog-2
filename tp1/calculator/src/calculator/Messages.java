package calculator;

public final class Messages {

    public static final String ADD_NUMBER = "Input two numbers: ";
    public static final String INVALID_OPTION = "Invalid option: ";
    public static final String CHOOSE_OPTION = "Operator? (+ - * /)";
    public static final String RESULT_ADDITION = "The result of the addition is: ";
    public static final String RESULT_SUBTRACTION = "The result of the subtraction is: ";
    public static final String RESULT_MULTIPLICATION = "The result of the multiplication is: ";
    public static final String RESULT_DIVISION = "The result of the division is: ";

    private Messages() {
        throw new AssertionError();
    }

    public static void print(String message) {
        System.out.println("\n" + message);
    }

}
