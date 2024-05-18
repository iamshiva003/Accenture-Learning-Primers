import java.util.Scanner;

public class SwapAndReverse {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        // Fill the code

        System.out.println("Enter the sentence");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        if (words.length <= 2) {
            System.out.println("Invalid length");
            return;
        }

        for (String word : words) {
            if (!word.matches("[a-zA-Z ]+")) {
                System.out.println(sentence + " is an invalid sentence");
                return;
            }
        }

        String first = words[0];
        String last = words[words.length - 1];

        StringBuilder result = new StringBuilder();

        result.append(last);

        StringBuilder res = new StringBuilder();

        for (int i = 1; i < words.length - 1; i++) {
            res.append(words[i] + " ");
        }

        result.append(res.reverse().toString());

        result.append(" " + first);

        System.out.println(result.toString());

    }

}
