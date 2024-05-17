import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight in kg");
        double weight = sc.nextDouble();

        System.out.println("Enter height in cm");
        double height = sc.nextDouble();

        double BMI = weight / ((height / 100) * (height / 100));

        if (BMI >= 25) {
            System.out.printf("Your BMI is %.2f. You are overweight\n", BMI);
            System.out.printf("Reduce %.2f kg to be fit", (BMI - 25));
        }

        else if (BMI < 25 && BMI >= 18.5) {
            System.out.printf("Your BMI is %.2f. You are fit and healthy\n", BMI);
        }

        else if (BMI < 18.5) {
            System.out.printf("Your BMI is %.2f. You are underweight\n", BMI);
            System.out.printf("Gain %.2f kg to be fit\n", (18.5 - BMI));
        }
    }
}
