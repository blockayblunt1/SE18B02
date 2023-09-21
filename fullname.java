import java.util.Scanner;

public class fullname {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstname = scanner.nextLine();
        System.out.print("Enter your middle name: ");
        String middlename = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastname = scanner.nextLine();
        System.out.println("Your full name: " + firstname + " " + middlename + " " + lastname);
        scanner.close();
    }
}
