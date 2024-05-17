import java.util.Scanner;

public class OxygenPlants {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the room (in m)");
        int length_m = sc.nextInt();

        if (length_m <= 0) {
            System.out.println("Invalid length");
            return;
        }

        System.out.println("Enter the breadth of the room (in m)");
        int breadth_m = sc.nextInt();

        if (breadth_m <= 0) {
            System.out.println("Invalid breadth");
            return;
        }

        System.out.println("Enter the plant area of a single plant (in cm²)");
        int plant_area_cm = sc.nextInt();

        if (plant_area_cm <= 0) {
            System.out.println("Invalid plant area");
            return;
        }

        int floor_area = (length_m * breadth_m) * 10000;
        int total_area = floor_area / plant_area_cm;
        int total_plants = (total_area / 10) * 10;
        double total_oxygen = total_plants * 0.9;

        System.out.println("Total number of plants is " + total_plants);
        System.out.printf("Total oxygen production is %.2f litres\n", total_oxygen);
    }
}
