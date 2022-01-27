package Dice;

public class DiceGameTester {
    public static void main(String[] args) {
        DiceGame dicey = new DiceGame();
        dicey.fourTimeRoll();
        dicey.twentyFourTimeRoll();
        System.out.println("4 dice roll winnings: $" + dicey.getFourTimeWin());
        System.out.println("4 dice roll losses: $" + dicey.getFourTimeLoss());
        System.out.println("Total won/lost from 4 dice roll: $" + (dicey.getFourTimeWin() - dicey.getFourTimeLoss()));
        System.out.println("24 dice roll winnings: $" + dicey.getTwentyFourTimeWin());
        System.out.println("24 dice roll losses: $" + dicey.getTwentyFourTimeLoss());
        System.out.println("Total won/lost from 24 dice roll: $" + (dicey.getTwentyFourTimeWin() - dicey.getTwentyFourTimeLoss()));
    }

}
