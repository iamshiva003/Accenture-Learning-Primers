import java.util.Scanner;

public class CompleteTheCaption {

   public static boolean check(String str) {
      return str.matches("[a-zA-Z! ]+");
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // fill the code here

      System.out.println("Enter the first string");
      String firstStr = sc.nextLine();

      System.out.println("Enter the second string");
      String secondStr = sc.nextLine();

      if (firstStr.length() != secondStr.length()) {
         System.out.println("Length of the strings " + firstStr + " and " + secondStr + " does not match");
         return;
      }

      if (!check(firstStr) && !check(secondStr)) {
         System.out.println(firstStr + " and " + secondStr + " contains invalid symbols");
         return;
      }

      if (!check(firstStr)) {
         System.out.println(firstStr + " contains invalid symbols");
         return;
      }
      if (!check(secondStr)) {
         System.out.println(secondStr + " contains invalid symbols");
         return;
      }

      StringBuilder thirdStr = new StringBuilder();

      // char[] firstStrArr = firstStr.toCharArray();
      // char[] secondStrArr = secondStr.toCharArray();

      for (int i = 0; i < firstStr.length(); i++) {
         char f = firstStr.charAt(i);
         char s = secondStr.charAt(i);
         if (f == '!') {
            thirdStr.append(s);
         } else {
            thirdStr.append(f);
         }
         // if (f == ' ' || s == ' ') {
         // thirdStr.append(f);
         // }
      }

      System.out.println(thirdStr.toString());
   }
}
