import java.util.Scanner;

public class FishingCompetition {
   public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);
      // Fill the code

      System.out.println("Enter the details");
      String details = sc.nextLine();

      String[] detailsArr = details.split(":");

      String name = detailsArr[0];
      int age = Integer.parseInt(detailsArr[1]);
      int bigFishes = Integer.parseInt(detailsArr[2]);
      int mediumFishes = Integer.parseInt(detailsArr[3]);
      int smallFishes = Integer.parseInt(detailsArr[4]);

      if (age < 18) {
         System.out.println(age + " is an invalid age");
         return;
      }

      if (bigFishes < 0) {
         System.out.println(bigFishes + " is an invalid input");
         return;
      } else if (mediumFishes < 0) {
         System.out.println(mediumFishes + " is an invalid input");
         return;
      } else if (smallFishes < 0) {
         System.out.println(smallFishes + " is an invalid input");
         return;
      }

      int total = (bigFishes * 10) + (mediumFishes * 6) + (smallFishes * 3);

      System.out.println(name + " scored " + total + " points");
   }

}
