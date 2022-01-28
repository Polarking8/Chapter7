package Video_poker;

import java.util.Random;

public class Poker {
    private int [] deck = {
      0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,
      27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51
    };
    private int [] hand = {4};
    private int playerTokens = 1;
    public void shuffleCards(int card[], int n) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int r = i + random.nextInt(52 - i);
            int tempCard = card[r];
            card[r] = card[i];
            card[i] = tempCard;
        }
    } // to shuffle cards go shuffleCards(array, 52)
    public void dealCards(){
        for(int i = 0;i < 4; i++){
            hand [i] = deck[i];
            System.out.println(hand.toString());
        }
    }
    public void rejectCards(){

    }
    public void scoreHand(){

    }
    public void playGame(){

    }
}
// order validated: Royal Flush, Straight Flush, Four of a Kind, Full House,
// Flush, Straight, Three of a Kind, Two Pair, and Jacks or Better.
// The card deck contains 52 cards, 13 of each suit. At the beginning of the game, the deck is shuffled.
// You need to devise a fair method for shuffling. (It does not have to be efficient.)
// The player pays a token for each game.
// Then the top five cards of the deck are presented to the player.
// The player can reject none, some, or all of the cards.
// The rejected cards are replaced from the top of the deck.
// Now the hand is scored. Your program should pronounce it to be one of the following:
//No pair—The lowest hand, containing five separate cards that do not match up to create any of the hands below.
//One pair—Two cards of the same value, for example two queens. Payout: 1
//Two pairs—Two pairs, for example two queens and two 5’s. Payout: 2
//Three of a kind—Three cards of the same value, for example three queens. Payout: 3
//Straight—Five cards with consecutive values, not necessarily of the same suit,
// such as 4, 5, 6, 7, and 8. The ace can either precede a 2 or follow a king. Payout: 4
//Flush—Five cards, not necessarily in order, of the same suit. Payout: 5
//Full House—Three of a kind and a pair, for example three queens and two 5’s.
//Payout: 6
//Four of a Kind—Four cards of the same value, such as four queens. Payout: 25
//Straight Flush—A straight and a flush: Five cards with consecutive values of the same suit. Payout: 50
//Royal Flush—The best possible hand in poker. A 10, jack, queen, king, and ace, all of the same suit. Payout: 250
//Include UML, flowchart and junit test.
//Separate your business logic from your tester.
//All diagrams need to be included in the repo.  If they are supplied via a link, they will be counted as missing.
