import java.util.Scanner;

public class stringexception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            int numerator = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter the denominator: ");
            int denominator = Integer.parseInt(scanner.nextLine());

            if (denominator == 0) {
                scanner.close();
                throw new ArithmeticException("Denominator cannot be zero.");
            }
            scanner.close();    
            double result = (double) numerator / denominator;
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
