import java.util.Scanner;

public class ProfileUpdate {
   public static boolean checkPAN(String pan) {
      return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]");
   }

   public static boolean checkEmail(String email) {
      return email.matches("[a-z]{5,10}@digitec.com");
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // Fill code here

      System.out.println("Enter your name");
      String name = sc.nextLine();

      System.out.println("Enter your PAN number");
      String pan = sc.nextLine();

      if (!checkPAN(pan)) {
         System.out.println(pan + " is an invalid PAN number");
         return;
      }

      System.out.println("Enter your E-mail ID");
      String email = sc.nextLine();
      if (!checkEmail(email)) {
         System.out.println("Invalid E-mail ID");
         return;
      }

      System.out.println("profile of " + name + " updated successfully");
   }
}