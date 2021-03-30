package calculator;

public final class Messages {

    public static final String ADD_NUMBER = "Input two numbers: ";
    public static final String INVALID_OPTION = "Invalid option: ";
    public static final String CHOOSE_OPTION = "Operator? (+ - * /)";

    private Messages() {
        throw new AssertionError();
    }

    public static void print(String message) {
        System.out.println("\n" + message);
    }

}
