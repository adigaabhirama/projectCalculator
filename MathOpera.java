import java.util.Scanner;

public class MathOpera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Addition
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " = " + sum);

        // Square root
        double sqrt = Math.sqrt(num1);
        System.out.println("Square root of " + num1 + " = " + sqrt);

        // Absolute value
        int absoluteValue = Math.abs(num2);
        System.out.println("Absolute value of " + num2 + " = " + absoluteValue);

        // Power (num1 raised to the power of num2)
        double power = Math.pow(num1, num2);
        System.out.println(num1 + " raised to the power of " + num2 + " = " + power);

        // Logarithm (base 10)
        double logBase10 = Math.log10(num1);
        System.out.println("Logarithm (base 10) of " + num1 + " = " + logBase10);

        // Trigonometric functions (sine and cosine)
        double sineValue = Math.sin(num1);
        double cosineValue = Math.cos(num1);
        System.out.println("Sine of " + num1 + " = " + sineValue);
        System.out.println("Cosine of " + num1 + " = " + cosineValue);

        scanner.close();
    }
}
