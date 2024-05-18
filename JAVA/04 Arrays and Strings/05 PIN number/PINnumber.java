import java.util.Scanner;

public class PINnumber {

    public static boolean checkNum(int num) {
        if (Integer.toString(num).length() != 4) {
            return false;
        }
        return true;
    }

    public static boolean checkOdd(int num) {
        if (num % 2 == 0) {
            return false;
        }
        return true;
    }

    public static boolean checkPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkComposite(int num) {
        if (num == 1 || num == 2) {
            return false;
        }
        if (checkPrime(num)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Fill the code here
        System.out.println("Enter the total number of PIN numbers");
        int total = sc.nextInt();

        if (total <= 0) {
            System.out.println(total + " is an invalid number");
            return;
        }

        int[] pinNumbers = new int[total];

        System.out.println("Enter the PIN numbers");
        for (int i = 0; i < total; i++) {
            int num = sc.nextInt();
            if (checkNum(num)) {
                pinNumbers[i] = num;
            } else {
                System.out.println(num + " is an invalid PIN number");
            }
        }

        String result = "";
        int test = 0;
        String string = "";
        int cnt = 0;

        first: for (int pin : pinNumbers) {
            int count = 0;
            String strPin = Integer.toString(pin);

            second: for (char c : strPin.toCharArray()) {
                int num = Integer.parseInt(Character.toString(c));
                count++;

                switch (count) {
                    case 1:
                        if (checkOdd(num)) {
                            string += Integer.toString(num);
                            cnt++;
                        } else {
                            test = 1;

                        }
                        break;
                    case 2:
                        if (num % 2 == 0) {
                            string += Integer.toString(num);
                            cnt++;
                        } else {
                            test = 1;
                        }
                        break;
                    case 3:
                        if (checkPrime(num)) {
                            string += Integer.toString(num);
                            cnt++;
                        } else {
                            test = 1;
                        }
                        break;
                    case 4:
                        if (checkComposite(num)) {
                            string += Integer.toString(num);
                            cnt++;
                            string += ',';
                        } else {
                            test = 1;
                        }
                        break;
                }
                // System.out.println(string);
                if (cnt == 4) {
                    result += String.valueOf(string);
                    string = "";
                    cnt = 0;
                }
                // System.out.println(result);
                if (test > 0) {
                    test = 0;
                    string = "";
                    cnt = 0;
                    continue first;
                }
            }
        }

        // System.out.println(result);

        if (result.length() < 4) {
            System.out.println("All these " + total + " numbers are not a valid PIN number");
        } else {
            System.out.println("Valid PIN numbers are");

            String[] splitted = result.split(",");
            for (String str : splitted) {
                int res = Integer.parseInt(str);
                System.out.println(res);
            }
        }

    }
}