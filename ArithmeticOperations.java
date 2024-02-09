 import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Square
        int square = num1 * num1;
        System.out.println("Square of " + num1 + " = " + square);

        // Cube
        int cube = num1 * num1 * num1;
        System.out.println("Cube of " + num1 + " = " + cube);

        // Modulus
        int modulus = num1 % num2;
        System.out.println("Modulus of " + num1 + " and " + num2 + " = " + modulus);

        // Power
        double power = Math.pow(num1, num2);
        System.out.println(num1 + " raised to the power of " + num2 + " = " + power);

        scanner.close();
    }
}

