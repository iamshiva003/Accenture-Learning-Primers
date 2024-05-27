import java.util.Scanner;

public class EventIdValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Fill code here

        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("Enter your ID");
        String id = sc.nextLine();

        // if (id.length() != 10) {

        // }

        if (!id.matches("SPC\\d{3}(0[1-9]|1[0-2])(AM|PM)")) {
            System.out.println(id + " is an invalid ID");
            return;
        }

        int seatNumber = Integer.parseInt(id.substring(3, 6));
        int time = Integer.parseInt(id.substring(6, 8));
        String timeZone = id.substring(8, 10);

        System.out.println("Hi " + name + " your seat number is " + seatNumber +
                " and the event starts at " + time + timeZone);
    }
}