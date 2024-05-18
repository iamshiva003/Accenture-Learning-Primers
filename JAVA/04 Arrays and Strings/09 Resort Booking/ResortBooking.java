import java.util.Scanner;

public class ResortBooking {
    public static void main(String args[]) {
        // fill the code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the customer details");
        String[] details = sc.nextLine().split(":");

        String name = details[0];
        int adults = Integer.parseInt(details[1]);
        int child = Integer.parseInt(details[2]);
        int days = Integer.parseInt(details[3]);

        if (adults < 0) {
            System.out.println("Invalid input for number of adults");
            return;
        }
        if (child < 0) {
            System.out.println("Invalid input for number of children");
            return;
        }
        if (days <= 0) {
            System.out.println("Invalid input for number of days");
            return;
        }

        int total = days * ((adults * 1000) + (child * 650));

        System.out.println(name + " your booking is confirmed and the total cost is " + total);
    }
}