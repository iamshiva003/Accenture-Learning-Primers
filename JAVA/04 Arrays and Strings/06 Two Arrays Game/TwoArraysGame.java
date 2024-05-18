import java.util.Scanner;

public class TwoArraysGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Fill the code here

        System.out.println("Enter the size for the first array");
        int firstArrSize = sc.nextInt();

        if (firstArrSize <= 0) {
            System.out.println(firstArrSize + " is an invalid array size");
            return;
        }

        System.out.println("Enter the elements for the first array");

        int[] firstArr = new int[firstArrSize];

        for (int i = 0; i < firstArrSize; i++) {
            firstArr[i] = sc.nextInt();
        }

        System.out.println("Enter the size for the second array");
        int secondArrSize = sc.nextInt();

        if (secondArrSize <= 0) {
            System.out.println(secondArrSize + " is an invalid array size");
            return;
        }

        System.out.println("Enter the elements for the second array");

        int[] secondArr = new int[secondArrSize];

        for (int i = 0; i < secondArrSize; i++) {
            secondArr[i] = sc.nextInt();
        }

        if (firstArrSize != secondArrSize) {
            System.out.println("Both array size are not same");
            return;
        }

        int[] thirdArr = new int[firstArrSize];

        for (int i = 0, j = 1; i < firstArrSize || j < firstArrSize; i += 2, j += 2) {
            thirdArr[i] = firstArr[i] + secondArr[i];
            if (j < firstArrSize) {
                thirdArr[j] = firstArr[j] - secondArr[j];
            }
        }

        System.out.println("The elements of the third array");
        for (int i = 0; i < thirdArr.length; i++) {
            System.out.println(thirdArr[i]);
        }
    }
}