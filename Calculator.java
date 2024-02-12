//import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator with java");

        double num1, num2, result;
        char operator;

        System.out.print("Enter the first number: ");
        num1 = 10//scanner.nextDouble();

        System.out.print("Enter an operator for an operation ");
        operator = +//scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = 12//scanner.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result is : " + result);
                } else {
                    System.out.println("Error : Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
        }

        //scanner.close();
    }
}
