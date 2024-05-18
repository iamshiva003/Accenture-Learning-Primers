import java.util.Scanner;

public class SumOfMax {

    public static int max(int[] arr) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();

        if (size > 1 && !(size % 2 == 0)) {
            System.out.println(size + " is an odd number.Please enter even number");
            return;
        }

        else if (size <= 0) {
            System.out.println(size + " is an invalid array size");
            return;
        }

        int[] arr = new int[size];

        System.out.println("Enter the number");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The maximum number is " + (max(arr) + min(arr)));
    }
}
