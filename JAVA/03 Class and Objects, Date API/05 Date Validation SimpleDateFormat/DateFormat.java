import java.util.Scanner;
import java.util.Date;
import java.text.*;

public class DateFormat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // FILL THE CODE
        System.out.println("Enter the date");
        String userDate = sc.nextLine();

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);

        try {
            Date date = format.parse(userDate);

            System.out.println(userDate + " is a valid date");
        } catch (ParseException e) {
            System.out.println(userDate + " is not a valid date");
        }
    }
}