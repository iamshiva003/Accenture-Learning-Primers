import java.util.Scanner;

public class PrimeNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Fill the code here

        System.out.println("Enter the size of first array");
        int firstArrSize = sc.nextInt();

        if (firstArrSize <= 0) {
            System.out.println(firstArrSize + " is an invalid array size");
            return;
        }

        int[] firstArr = new int[firstArrSize];

        System.out.println("Enter the array elements");
        for (int i = 0; i < firstArrSize; i++) {
            int num = sc.nextInt();

            if (num < 0) {
                System.out.println(num + " is an invalid input");
                return;
            }

            firstArr[i] = num;
        }

        System.out.println("Enter the size of second array");
        int secondArrSize = sc.nextInt();

        if (secondArrSize <= 0) {
            System.out.println(secondArrSize + " is an invalid array size");
            return;
        }

        if (firstArrSize != secondArrSize) {
            System.out.println("Both array size is different");
            return;
        }

        int[] secondArr = new int[secondArrSize];

        System.out.println("Enter the array elements");
        for (int i = 0; i < secondArrSize; i++) {
            int num = sc.nextInt();

            if (num < 0) {
                System.out.println(num + " is an invalid input");
                return;
            }

            secondArr[i] = num;
        }

        int[] thirdArr = new int[secondArrSize];
        int sum = 0;
        for (int i = 0; i < secondArrSize; i++) {
            thirdArr[i] = firstArr[i] + secondArr[i];
            sum += (thirdArr[i] % 10);
        }

        boolean isNotPrime = false;
        for (int i = 2; i < sum; i++) {
            if (sum % i == 0) {
                isNotPrime = true;
                break;
            }
        }

        if (isNotPrime) {
            System.out.println(sum + " is not a prime number");
        } else {
            System.out.println(sum + " is a prime number");
        }

    }
}
