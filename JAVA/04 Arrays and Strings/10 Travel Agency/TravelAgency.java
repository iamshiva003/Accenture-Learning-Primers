import java.util.Scanner;

public class TravelAgency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Fill the code here
        String[] cities = { "Chenai", "Coimbatore", "Erode", "Karur", "Madurai", "Hyderabad", "Salem", "Bangalore",
                "Delhi", "Agra" };

        System.out.println("Enter the city name");
        String city = sc.nextLine();

        boolean available = false;

        for (int i = 0; i < cities.length; i++) {
            if (city.equalsIgnoreCase(cities[i])) {
                available = true;
                break;
            }
        }

        if (available) {
            System.out.println("Bus for " + city + " is available");
        } else {
            System.out.println("Bus for " + city + " is not available");
        }
    }
}