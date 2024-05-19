import java.util.Scanner;

public class EmployeeIDGeneration {
   public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the training id");
      String tid = sc.next();

      if (tid.length() != 9) {
         System.out.println(tid + " is an invalid training id");
         return;
      }

      String year = tid.substring(0, 4);

      if (!year.equals("2021")) {
         System.out.println(year + " is an invalid year");
         return;
      }

      String teamIdStr = tid.substring(4, 6);
      String rollNoStr = tid.substring(6, 9);

      int teamId = Integer.parseInt(teamIdStr);
      int rollNo = Integer.parseInt(rollNoStr);

      if (teamId > 5 || teamId < 0) {
         System.out.println(teamIdStr + " is an invalid team code");
         return;
      }

      if (rollNo < 1 || rollNo > 999) {
         System.out.println(rollNoStr + " is an invalid roll number");
         return;
      }

      String teamCodes = "LP,TA,CT,PT,TT";
      String team = teamCodes.split(",")[teamId - 1];

      String empId = "SIET" + team + rollNoStr;

      System.out.println("Employee Id: " + empId);
   }

}
