import java.util.Scanner;

public class ReverseAndExpand {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        
        int number = sc.nextInt();
        if (String.valueOf(number).length() != 4) {
            System.out.println(number + " is an invalid number");
            return;
        }

        int rev = 0;
        while (number != 0) {
            int remainder = number % 10;
            rev = rev * 10 + remainder;
            number = number / 10;
        }

        System.out.println("Reversed number is " + rev);

        String reverse = Integer.toString(rev);
        int divisor = 1;
        int count = 0;
        for (int i = 0; i < reverse.length() - 1; i++) {
            divisor *= 10;
            count++;
        }

        String result = "";
        for (char c : reverse.toCharArray()) {
            result += Character.getNumericValue(c) * divisor;
            if (count != 0) {
                result += '+';
            }
            count--;
            divisor /= 10;
        }

        System.out.println(result);
    }
}
