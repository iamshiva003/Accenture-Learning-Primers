import java.util.Scanner;
import java.util.Arrays;

public class HappyMart {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Fill the code here

        System.out.println("Enter the products count");
        int productCount = sc.nextInt();

        if (productCount <= 0) {
            System.out.println("Invalid count");
            return;
        }

        Product[] products = new Product[productCount];

        sc.nextLine();

        System.out.println("Enter Product details");
        for (int i = 0; i < productCount; i++) {
            String[] details = sc.nextLine().split(":");

            int id = Integer.parseInt(details[0]);
            String name = details[1];
            double price = Double.parseDouble(details[2]);

            products[i] = new Product(id, name, price);
        }
        System.out.println("1.Sort By Id");
        System.out.println("2.Sort By Price");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                SortById sortById = new SortById();
                Arrays.sort(products, sortById);
                System.out.println("After Sorting By Id");
                for (Product p : products) {
                    System.out.println(p);
                }
                break;
            case 2:
                SortByPrice sortByPrice = new SortByPrice();
                Arrays.sort(products, sortByPrice);
                System.out.println("After Sorting By Price");
                for (Product p : products) {
                    System.out.println(p);
                }
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

    }
}
