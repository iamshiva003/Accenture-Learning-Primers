import java.util.Scanner;

public class MagicSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Fill the code here
        System.out.println("Enter the array size");
        int size = sc.nextInt();

        if (!(size >= 1 && size <= 5)) {
            System.out.println(size + " is an invalid array size");
            return;
        }

        System.out.println("Enter the numbers");
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();

            if (!(num > 0 && num < 100)) {
                System.out.println(num + " is an invalid input");
                return;
            }

            arr[i] = num;
        }
        int count = 0;
        int sum = 0;
        String result = "";

        first: for (int num : arr) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    continue first;
                }
            }

            second: for (int k = 2; k < num; k++) {
                for (int i = 2; i < k; i++) {
                    if (k % i == 0) {
                        continue second;
                    }
                }

                sum += k;

                if (sum == num) {
                    result += String.valueOf(sum);
                    result += ',';
                    count++;
                    continue second;
                }
            }
            sum = 0;
        }

        if (count == 0) {
            System.out.println("The " + size + " numbers are not sum of prime numbers");
        } else {
            System.out.println("The sum of prime numbers is");
            for (String num : result.split(",")) {
                System.out.println(Integer.parseInt(num));
            }
        }
    }
}