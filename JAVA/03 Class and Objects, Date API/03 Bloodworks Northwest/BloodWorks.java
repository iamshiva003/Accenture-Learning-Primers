import java.util.Scanner;

public class BloodWorks {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name");
        String name = sc.next();

        System.out.println("Enter the age");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the gender");
        String gender = sc.next();
        sc.nextLine();

        System.out.println("Enter the blood group");
        String bgroup = sc.nextLine();

        System.out.println("Enter the phone no");
        long phoneNo = sc.nextLong();

        DonorDetails donor = new DonorDetails(name, age, gender, bgroup, phoneNo);

        donor.displayDetails();
    }

}
