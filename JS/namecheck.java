import java.util.Scanner;

public class namecheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean namedrop = false;
        String[] names = {"Kiet","Long","Vinh","Khuong","Trung" };
        System.out.print("Enter name to check: ");
        String nameToCheck = scanner.nextLine();
        for (String name : names) {
            if (nameToCheck.equals(name)) {
                namedrop = true;
                break;
            }
        }
        if (namedrop) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
}
