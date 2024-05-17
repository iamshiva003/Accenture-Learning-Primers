import java.util.Scanner;

public class LotteryWinner {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the ticket Id");
        long ticketId = sc.nextLong();

        System.out.println("Enter the unlucky code");
        int unluckyCode = sc.nextInt();

        long temp = ticketId;
        int count = 0;

        while (temp > 0) {
            long num = temp % 10;
            
            if (num == unluckyCode) {
                count++;
            }

            temp /= 10;
        }

        if (count == 0) {
            System.out.println(ticketId + " is lucky ticket");
        }

        else if (count < 3) {
            System.out.println(ticketId + " is partially lucky");
        }

        else if (count >= 3) {
            System.out.println(ticketId + " is unlucky ticket");
        }
    }
}