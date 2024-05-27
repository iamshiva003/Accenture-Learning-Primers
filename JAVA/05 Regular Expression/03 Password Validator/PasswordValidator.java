import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Fill code here

        System.out.println("Generate your password");
        String password = sc.nextLine();

        int lower = 0;
        int upper = 0;
        int special = 0;
        int digits = 0;

        if (password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[@$*#])[a-zA-Z\\d@$*#]{6,12}$")) {
            for (char c : password.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    lower++;
                }
                if (Character.isUpperCase(c)) {
                    upper++;
                }
                if (Character.isDigit(c)) {
                    digits++;
                }
                if (Character.toString(c).matches("[@$*#]")) {
                    special++;
                }
            }
            System.out.println("The generated password " + password + " is valid and has " + lower + " lowercase alphabet " + upper + " uppercase alphabet " + special + " special character " + digits + " digit");
        } 
        else {
            System.out.println(password + " is an invalid password");
        }
    }
}
