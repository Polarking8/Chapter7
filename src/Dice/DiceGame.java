package Dice;
import java.util.Random;
public class DiceGame {
    /**
     * these four next private integers store the wins and losses.
     */
    private int fourTimeWin = 0;
    private int fourTimeLoss = 0;
    private int twentyFourTimeWin = 0;
    private int twentyFourTimeLoss = 0;
    /**
     * This method is the one that has four dice values, if any of them are 6 then the user loses. This iterates 1 million
     * times or one million trials. It re-declares the variables every time.
     */
    public void fourTimeRoll() {
        int i = 0;
        Random random = new Random();
        while(i<1000000){
            int diceOne = (random.nextInt(0,6)+1);
            int diceTwo = (random.nextInt(0,6)+1);
            int diceThree = (random.nextInt( 0,6)+1);
            int diceFour = (random.nextInt(0,6)+1);
            if (diceOne != 6 && diceTwo != 6 && diceThree != 6 && diceFour != 6) {
                fourTimeWin++;
            } else{
                fourTimeLoss++;
            }
            i++;
        }
    }
    /**
     * This method is the one that rolls a pair of dice twenty-four times. It uses two arrays and checks if both of
     * their dice values in the pair are 6. If not it moves on to the next pair. it checks this 24 times and then counts
     * it as a loss if it does not find double 6's. This loop iterates 1 million times.
     */
    public void twentyFourTimeRoll(){
        int j = 0;
        Random random = new Random();
        while(j<1000000){
            int [] multipleDiceOne = {
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1)
                    };
            int [] multipleDiceTwo = {
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1),
                    (random.nextInt(0,6)+1)
                    };
            for (int k = 0;k < 24; k++){
                if (multipleDiceOne[k] == 6 && multipleDiceTwo[k] == 6){
                    twentyFourTimeWin ++;
                    break;
                }
                if (k >= 23){
                    twentyFourTimeLoss ++;
                    break;
                }
            }
            j++;
        }
    }
    /**
     * @return - returns the four dice roll wins
     */
    public int getFourTimeWin(){
        return fourTimeWin;
    }
    /**
     * @return - returns the four dice roll losses
     */
    public int getFourTimeLoss(){
        return fourTimeLoss;
    }
    /**
     * @return - returns the twenty-four dice roll wins
     */
    public int getTwentyFourTimeWin(){
        return twentyFourTimeWin;
    }
    /**
     * @return - returns the twenty-four dice roll losses
     */
    public int getTwentyFourTimeLoss(){
        return twentyFourTimeLoss;
    }
}
//Add Javadoc and a UML diagram.
//UML MUST be added to your project.  it will be marked as missing if it is included in a secondary link like Google Docs.
// Export and include your diagrams in your repo in GitHub.
