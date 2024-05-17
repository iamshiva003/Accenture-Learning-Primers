import java.util.Scanner;

public class MagicGoose {

    public static int pell(int n) {
        if (n <= 2)
            return n;
        return 2 * pell(n - 1) + pell(n - 2);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day");
        int day = sc.nextInt();

        if (day <= 0 || day > 30) {
            System.out.println(day + " is invalid day");
            return;
        }

        int total_eggs = pell(day);

        System.out.println("Number of eggs in " + day + "th day is " + total_eggs);
    }
}