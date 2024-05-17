import java.util.Scanner;

public class SIMCard {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the phone number");
        long phone_no = sc.nextLong();

        int odd_sum = 0;
        int even_sum = 0;

        for (char char_num: Long.toString(phone_no).toCharArray()) {
            int num = Character.getNumericValue(char_num);

            if (num % 2 == 0) {
                even_sum += num;
            }
            else {
                odd_sum += num;
            }
        }

        if (even_sum == odd_sum) {
            System.out.println("Sum of odd and even are equal");
        }
        else if (even_sum > odd_sum) {
            System.out.println("Sum of even is greater than sum of odd");
        }
        else if (even_sum < odd_sum) {
            System.out.println("Sum of odd is greater than sum of even");
        }
    }
}