import java.util.HashMap;
import java.util.Scanner;

public class LudoKing {

    public static boolean checkPoints(int points) {
        if (points < 0 || points > 50) {
            System.out.println(points + " is an invalid number");
            return false;
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        HashMap <Integer, String> players= new HashMap<>();

        System.out.println("Enter Alex points");
        int alexPoints = sc.nextInt();

        if (!checkPoints(alexPoints)) {
            return;
        }
        players.put(alexPoints, "Alex");

        System.out.println("Enter Nikil points");
        int nikilPoints = sc.nextInt();

        if (!checkPoints(nikilPoints)) {
            return;
        }

        players.put(nikilPoints, "Nikil");

        System.out.println("Enter Sam points");
        int samPoints = sc.nextInt();

        if (!checkPoints(samPoints)) {
            return;
        }

        players.put(samPoints, "Sam");

        if (alexPoints == nikilPoints || alexPoints == samPoints || nikilPoints == samPoints) {
            System.out.println("The game is a tie");
            return;
        }

        int temp = alexPoints > nikilPoints ? alexPoints : nikilPoints;  
 
        int winner = samPoints > temp ? samPoints : temp;  

        System.out.println(players.get(winner) + " scored " + winner + " points and won the game");
    }
}