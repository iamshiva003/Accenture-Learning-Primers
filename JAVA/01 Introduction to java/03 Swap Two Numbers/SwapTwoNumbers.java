import java.util.Scanner;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Before swapping");
        System.out.println("first = " + num1 + ", second = " + num2);

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("After swapping");
        System.out.println("first = " + num1 + ", second = " + num2);

    }
}
