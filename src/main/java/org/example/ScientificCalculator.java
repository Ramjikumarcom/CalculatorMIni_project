package org.example;
import java.util.Scanner;

public class ScientificCalculator {

    // Function to calculate square root
    public static double calculateSquareRoot(double x) {
        if (x < 0) {
            System.out.println("Invalid input: Square root of a negative number is not defined.");
            return Double.NaN;
        }
        return Math.sqrt(x);
    }

    // Function to calculate factorial
    public static long calculateFactorial(int x) {
        if (x < 0) {
            System.out.println("Invalid input: Factorial of a negative number is not defined.");
            return -1;
        }
        long factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Function to calculate natural logarithm
    public static double calculateNaturalLogarithm(double x) {
        if (x <= 0) {
            System.out.println("Invalid input: Natural logarithm is defined for positive numbers only.");
            return Double.NaN;
        }
        return Math.log(x);
    }

    // Function to calculate power
    public static double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nScientific Calculator Menu:");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power Function (x^b)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    double sqrtInput = scanner.nextDouble();
                    System.out.println("Result: " + calculateSquareRoot(sqrtInput));
                    break;
                case 2:
                    System.out.print("Enter an integer: ");
                    int factInput = scanner.nextInt();
                    System.out.println("Result: " + calculateFactorial(factInput));
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    double logInput = scanner.nextDouble();
                    System.out.println("Result: " + calculateNaturalLogarithm(logInput));
                    break;
                case 4:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Result: " + calculatePower(base, exponent));
                    break;
                case 5:
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
