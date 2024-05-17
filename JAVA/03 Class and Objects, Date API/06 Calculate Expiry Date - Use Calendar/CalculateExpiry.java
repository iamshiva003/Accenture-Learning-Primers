import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.text.*;

public class CalculateExpiry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Manufacturing Date");
        String userDate = sc.nextLine();

        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            format.setLenient(false);

            Date date = format.parse(userDate);

            System.out.println("Enter the Month");
            int month = sc.nextInt();

            Calendar c = Calendar.getInstance();

            c.setTime(date);
            c.add(Calendar.MONTH, month);

            Date expiry = c.getTime();
            String strDate = format.format(expiry);

            System.out.println(strDate + " is the expiry date");
        } catch (ParseException e) {
            System.out.println(userDate + " is not a valid date");
        }

    }
}
