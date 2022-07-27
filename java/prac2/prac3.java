package pgm2;
import java.util.Scanner;
public class prac3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Player 1: Choose (1) - Rock, (2) - Paper, or (3) - Scissors: ");
        int player1 = sc.nextInt();
        System.out.println("Player 2: Choose (1) - Rock, (2) - Paper, or (3) - Scissors: ");
        int player2 = sc.nextInt();
        sc.close();
        if (player1 == player2){
            System.out.print("It is a tie");
        } else {
            switch (player1){
            case 1:
                if (player2 == 3)
                    System.out.print("Player 1 wins!");
                else
                    System.out.print("Player 2 wins!");
                break;
            case 2:
                if (player2 == 1)
                    System.out.print("Player 1 wins!");
                else
                    System.out.print("Player 2 wins!");
                break;
            case 3:
                if (player2 == 2)
                    System.out.print("Player 1 wins!");
                else
                    System.out.print("Player 2 wins!");
                break;
            }       
        }
	}
}
