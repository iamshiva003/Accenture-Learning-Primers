import java.util.Scanner;

public class SubsetOrNot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Fill the code here
        System.out.println("Enter the first array size");
        int firstArrSize = sc.nextInt();

        if (firstArrSize <= 0) {
            System.out.println(firstArrSize + " is an invalid array size");
            return;
        }

        int[] firstArr = new int[firstArrSize];

        System.out.println("Enter the numbers");
        for (int i = 0; i < firstArrSize; i++) {
            firstArr[i] = sc.nextInt();
        }

        System.out.println("Enter the second array size");
        int secondArrSize = sc.nextInt();

        if (secondArrSize <= 0) {
            System.out.println(secondArrSize + " is an invalid array size");
            return;
        }
        if (!(secondArrSize <= firstArrSize)) {
            System.out.println(
                    secondArrSize + " is an invalid size as it is greater than first array size " + firstArrSize);
            return;
        }

        int[] secondArr = new int[secondArrSize];

        System.out.println("Enter the numbers");
        for (int i = 0; i < secondArrSize; i++) {
            secondArr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < secondArrSize; i++) {
            for (int j = 0; j < firstArrSize; j++) {
                if (secondArr[i] == firstArr[j]) {
                    count++;
                }
            }
        }

        if (count == secondArrSize) {
            System.out.println("Array2 of size " + secondArrSize + " is a subset of array1");
        } else {
            System.out.println("Array2 of size " + secondArrSize + " is not a subset of array1");
        }

    }

}
