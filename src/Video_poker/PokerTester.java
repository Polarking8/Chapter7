package Video_poker;

import java.util.ArrayList;
import java.util.Scanner;
public class PokerTester {
    public static void main(String[] args) {
        ArrayList<Integer> rejected = new ArrayList<>();
        Poker gambling  = new Poker();
        Scanner scanner = new Scanner(System.in);
        gambling.shuffleCards(gambling.deck, 52);
        gambling.dealCards();
        for (int j = 0; j < 5; j++) {
            System.out.println("Input a card number (1,2,3,4 or 5) to reject or a letter to continue: ");
            if(scanner.hasNextInt()) {
                rejected.add(scanner.nextInt()-1);
            } else {
                break;
            }
        }
        gambling.rejectCards(rejected);
        gambling.scoreHand();
    }
}
