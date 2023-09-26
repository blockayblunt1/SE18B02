import java.util.Scanner;

public class numberexception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your numerator: ");
        double numerator = scanner.nextDouble();
        System.out.print("Enter your denominator: ");
        double denominator = scanner.nextDouble();
        scanner.close();
        
        try {
            if (denominator == 0) {
                throw new ArithmeticException("Invalid denominator!");
            }
            
            double result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
