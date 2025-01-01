// DataTypesAndOperators.java
public class DataTypesAndOperators {
    public static void main(String[] args) {
        // Different data types in Java
        byte byteVal = 127;
        short shortVal = 32000;
        int intVal = 100000;
        long longVal = 10000000000L;
        float floatVal = 3.14F;
        double doubleVal = 12345.6789;
        char charVal = 'A';
        boolean boolVal = true;

        // Print data types
        System.out.println("Byte Value: " + byteVal);
        System.out.println("Short Value: " + shortVal);
        System.out.println("Integer Value: " + intVal);
        System.out.println("Long Value: " + longVal);
        System.out.println("Float Value: " + floatVal);
        System.out.println("Double Value: " + doubleVal);
        System.out.println("Character Value: " + charVal);
        System.out.println("Boolean Value: " + boolVal);

        // Type casting
        double castToInt = intVal; // Implicit casting
        int castToByte = (byte) longVal; // Explicit casting
        System.out.println("Implicit Casting (int to double): " + castToInt);
        System.out.println("Explicit Casting (long to byte): " + castToByte);

        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational and Logical Operators
        System.out.println("Is a > b? " + (a > b));
        System.out.println("Is a < b? " + (a < b));
        System.out.println("Is a == b? " + (a == b));
        System.out.println("Logical AND (a > 0 && b > 0): " + (a > 0 && b > 0));
        System.out.println("Logical OR (a < 0 || b > 0): " + (a < 0 || b > 0));
    }
}
