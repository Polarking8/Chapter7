package Video_poker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
public class Poker {
    int [] deck = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,
      27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51};
    int [] untranslatedHand = {0,0,0,0,0};
    private int playerTokens = 1;
    String [] exampleFaceValues = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
    String [] handSuit = new String[5];
    String [] handFaceValue = new String[5];
    String [] translatedHand = new String[5];
    int [] numericFaceValues = new int[5];
    public void shuffleCards(int[] card, int n) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int r = i + (random.nextInt(52 - i));
            int tempCard = card[r];
            card[r] = card[i];
            card[i] = tempCard;
        }
    }
    public void translateCards(){
        for(int i = 0; i < 5; i++) {
            if (untranslatedHand[i] < 13) {
                handSuit[i] = "Hearts";
            } else if (untranslatedHand[i] < 26) {
                handSuit[i] = "Spades";
            } else if (untranslatedHand[i] < 39) {
                handSuit[i] = "Clubs";
            } else {
                handSuit[i] = "Diamonds";
            }
        }
        for(int k = 0; k<5; k++) {
            int tempCardHolder = untranslatedHand[k];
            while (tempCardHolder > 12) {
                tempCardHolder = tempCardHolder-13;
            }
            numericFaceValues[k] = tempCardHolder;
            handFaceValue[k] = exampleFaceValues[tempCardHolder];
        }
        for(int l = 0; l < 5; l++){
            translatedHand[l] = handFaceValue[l] + " of " + handSuit[l];
        }
    }
    public void dealCards(){
        System.arraycopy(deck, 0, untranslatedHand, 0, 5);
        translateCards();
        System.out.println("Your hand currently is:" + Arrays.toString(translatedHand));
    }
    public void rejectCards(ArrayList<Integer> Rejected){
        int i = 0;
        while (i < Rejected.size()) {
            untranslatedHand[Rejected.get(i)] = deck[i + 6];
            i++;
        }
        translateCards();
        System.out.println("New Hand is: " + Arrays.toString(translatedHand));
    }
    public boolean compareSameFace(int firstValue, int secondValue){
        return numericFaceValues[firstValue]==numericFaceValues[secondValue];
    }
    public int scoreHand(){
        playerTokens--;
        Arrays.sort(numericFaceValues);
        translateCards();
        int sameFaceCounter = 0;
        int  threeOfKind = 0;
        for(int i = 0; i<4; i++){
            if(compareSameFace(i,i+1)){
                sameFaceCounter++;
            }
        }
        for (int j = 0; j<3; j++){
            if(compareSameFace(j,j+1)&&compareSameFace(j+1,j+2)){
                threeOfKind++;
            }
        }
        if(handFaceValue[0].equals("Ace") && handFaceValue[1].equals("Ten")&& Objects.equals(handFaceValue[2], "Jack")
                && handFaceValue[3].equals("Queen") && handFaceValue[4].equals("King")
                && handSuit[0].equals(handSuit[1]) && handSuit[0].equals(handSuit[2])
                && handSuit[0].equals(handSuit[3]) && handSuit[0].equals(handSuit[4])){
            System.out.println("You have a Royal Flush, you have won 250 tokens.");
            playerTokens += 250;
        } else if(handSuit[0].equals(handSuit[1]) && handSuit[1].equals(handSuit[2])
                && handSuit[2].equals(handSuit[3]) && handSuit[3].equals(handSuit[4])
                && numericFaceValues[0] == (numericFaceValues[1]-1)
                && numericFaceValues[0] == (numericFaceValues[2]-2) && numericFaceValues[0] == (numericFaceValues[3]-3)
                &&numericFaceValues[0] == (numericFaceValues[4]-4)){
            System.out.println("You have a Straight Flush, you have won 50 tokens.");
            playerTokens +=50;
        } else if(threeOfKind >=3){
            System.out.println("You have four of a kind, you have won 25 tokens.");
            playerTokens +=25;
        } else if(threeOfKind == 1 && sameFaceCounter >=2){
            System.out.println("You have a Full House, you have won 6 tokens.");
            playerTokens+=6;
        } else if(handSuit[0].equals(handSuit[1]) && handSuit[0].equals(handSuit[2])
                && handSuit[0].equals(handSuit[3]) && handSuit[0].equals(handSuit[4])){
            System.out.println("You have a Flush, you have won 5 tokens.");
            playerTokens +=5;
        } else if (numericFaceValues[0] == (numericFaceValues[1]-1) && numericFaceValues[0] == (numericFaceValues[2]-2)
                && numericFaceValues[0] == (numericFaceValues[3]-3) &&numericFaceValues[0] == (numericFaceValues[4] - 4)){
            System.out.println("You have a Straight, you have won 4 tokens.");
            playerTokens +=4;
        } else if(threeOfKind>=1){
            System.out.println("You have Three of a kind, you have won 3 tokens.");
            playerTokens +=3;
        } else if(sameFaceCounter>=2) {
            System.out.println("You have Two pair, you have won 2 tokens.");
            playerTokens+=2;
        } else if (sameFaceCounter>=1){
            System.out.println("You have a pair, you have won a token.");
            playerTokens++;
        } else{
            System.out.println("Your hand does not match any payouts. Better luck next time!");
        }
        System.out.println("You have "+ playerTokens + " tokens");
        return playerTokens;
    }
}
//No pair—The lowest hand, containing five separate cards that do not match up to create any of the hands below.
//One pair—Two cards of the same value, for example two queens. Payout: 1
//Two pairs—Two pairs, for example two queens and two 5’s. Payout: 2
//Three of a kind—Three cards of the same value, for example three queens. Payout: 3
//Straight—Five cards with consecutive values, not necessarily of the same suit, such as 4, 5, 6, 7, and 8.
// The ace can either precede a 2 or follow a king. Payout: 4
//Flush—Five cards, not necessarily in order, of the same suit. Payout: 5
//Full House—Three of a kind and a pair, for example three queens and two 5’s. Payout: 6
//Four of a Kind—Four cards of the same value, such as four queens. Payout: 25
//Straight Flush—A straight and a flush: Five cards with consecutive values of the same suit. Payout: 50
//Royal Flush—The best possible hand in poker. A 10, jack, queen, king, and ace, all the same suit. Payout: 250
//Include UML, flowchart and junit test.

