package guru.qa;

public class HomeWork {
    public static void main(String[] args) {
        int a = 10, b = 5;
        double c = 3.5;

        //Math Operations
        int sum = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int remainder = a % b;

        //Max and Min values
        byte max_byte = Byte.MAX_VALUE;
        byte min_byte = Byte.MIN_VALUE;

        short max_short = Short.MAX_VALUE;
        short min_short = Short.MIN_VALUE;

        int max_int = Integer.MAX_VALUE;
        int min_int = Integer.MIN_VALUE;

        long max_long = Long.MAX_VALUE;
        long min_long = Long.MIN_VALUE;

        float max_float = Float.MAX_VALUE;
        float min_float = Float.MIN_VALUE;

        double max_double = Double.MAX_VALUE;
        double min_double = Double.MIN_VALUE;

        //Int and Double comparison
        double v = a * c - b;

        //Boolean operations
        boolean y = a > b;
        boolean u = b >= b;
        boolean i = a < b;
        boolean o = b >= a;

        //Overflow and Underflow
        int overflow = max_int + 1;
        int underflow = min_int - 1;
    }
}
