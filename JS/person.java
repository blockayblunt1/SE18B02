import java.util.Scanner;

public class person {
    private String email;
    private String fullName;
    private int birthYear;
    private String gender;
    private String phoneNumber;
    private String address;

    public person(String email, String fullName, int birthYear, String gender, String phoneNumber, String address) {
        this.email = email;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void displayProfile() {
        System.out.println("Email: " + email);
        System.out.println("Name: " + fullName);
        System.out.println("Date of birth: " + birthYear);
        System.out.println("Gender: " + gender);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Address: " + address);
    }

    public void changePhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
        System.out.println("Phone number changed to: " + newPhoneNumber);
    }

    public void changeAddress(String newAddress) {
        this.address = newAddress;
        System.out.println("Address changed to: " + newAddress);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter birth year: ");
        int birthYear = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        person person = new person(email, fullName, birthYear, gender, phoneNumber, address);
        System.out.println();
        System.out.print("Enter new phone number: ");
        String newPhoneNumber = scanner.nextLine();
        person.changePhoneNumber(newPhoneNumber);
        System.out.print("Enter new address: ");
        String newAddress = scanner.nextLine();
        person.changeAddress(newAddress);
        System.out.println();
        System.out.println("Updated Credentials: ");
        person.displayProfile();

        scanner.close();
    }
}
