import java.util.Scanner;

public class StudentGradeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade (A-F): ");
        char grade = Character.toUpperCase(scanner.next().charAt(0)); // Ensures case insensitivity

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("You passed.");
                break;
            case 'D':
                System.out.println("Needs improvement.");
                break;
            case 'F':
                System.out.println("Failed.");
                break;
            default:
                System.out.println("Invalid grade. Please enter a valid grade (A-F).");
        }

        scanner.close();
    }
}
