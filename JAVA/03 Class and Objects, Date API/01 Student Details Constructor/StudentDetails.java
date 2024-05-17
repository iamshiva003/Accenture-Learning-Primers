import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student's Id:");
        int stuId = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.println("Enter Student's Name:");
        String stuName = sc.next();

        System.out.println("Enter Student's address:");
        String stuAddress = sc.next();

        String stuCollegeName;
        String ans;

        while (true) {
            System.out.println("Whether the student is from NIT(Yes/No):");
            ans = sc.next();
            if (ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("no")) {
                break;
            } else {
                System.out.println("Wrong Input");
            }
        }

        if (ans.equalsIgnoreCase("no")) {
            System.out.println("Enter the college name:");
            stuCollegeName = sc.next();
            Student student = new Student(stuId, stuName, stuAddress, stuCollegeName);
            student.displayStudentDetails();
        } else {
            Student student = new Student(stuId, stuName, stuAddress);
            student.displayStudentDetails();
        }
    }
}