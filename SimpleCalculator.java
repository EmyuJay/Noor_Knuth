import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        // Perform arithmetic operations
        double addition = firstNumber + secondNumber;
        double subtraction = firstNumber - secondNumber;
        double multiplication = firstNumber * secondNumber;
        double division = (secondNumber != 0) ? firstNumber / secondNumber : Double.NaN;

        // Display results
        System.out.println("\nResults:");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);

        if (secondNumber == 0) {
            System.out.println("Division: Undefined (cannot divide by zero)");
        } else {
            System.out.println("Division: " + division);
        }

        scanner.close();
    }
}
