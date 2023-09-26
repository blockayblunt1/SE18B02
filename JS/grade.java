import java.util.Scanner;

public class grade {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your attendance grade: ");
        int grade = scanner.nextInt();
        System.out.print("Enter your mid-term grade: ");
        int mid = scanner.nextInt();
        System.out.print("Enter your final grade: ");
        int finalExam = scanner.nextInt();
        double finalGrade = (grade*0.1) + (mid*0.2) + (finalExam*0.7);
        System.out.println("Your final grade is: " + finalGrade);
        scanner.close();
    }
}
