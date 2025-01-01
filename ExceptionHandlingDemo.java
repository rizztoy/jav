// Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionHandlingDemo {

    // Method demonstrating 'throws' keyword
    public static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to vote.");
        } else {
            System.out.println("Eligible to vote.");
        }
    }

    public static void main(String[] args) {
        // 1. Try-Catch Block
        try {
            int result = 10 / 0; // ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        // 2. Multiple Catch Blocks
        try {
            String str = null;
            System.out.println(str.length()); // NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException.");
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException.");
        }

        // 3. Finally Block
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
            // throw new ArrayIndexOutOfBoundsException("heh");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        // 4. Throw Statement
        try {
            int a=12;
            if(a!=10)
            throw new IllegalArgumentException("heheheh.");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }

        // 5. Using 'throws' Keyword
        try {
            checkEligibility(16);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }

        // 6. Nested Try-Catch Block
        try {
            int[] numbers = {10, 20, 30};
            try {
                System.out.println("Number: " + numbers[3]); // Inner exception
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught Inner ArrayIndexOutOfBoundsException.");
            }
            int value = 10 / 0; // Outer exception
        } catch (ArithmeticException e) {
            System.out.println("Caught Outer ArithmeticException.");
        }

        // 7. Custom Exception
        try {
            checkEligibility(15);
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }

        System.out.println("Program completed.");
    }

    // Helper method for custom exception
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is below 18, not valid.");
        } else {
            System.out.println("Valid age.");
        }
    }
}
