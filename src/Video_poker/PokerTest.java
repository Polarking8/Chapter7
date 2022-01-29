package Video_poker;

import Fibonacci.Fib_loop;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PokerTest {
    @Test
    public void pokerFourOfKindTest(){
        Poker gambling ;
        gambling = new Poker();
        Assertions.assertEquals(25, gambling.scoreHand());
        // this test is not actually working properly
    }
    @Test
    // The compare same face method in Poker.java is used for the sameFaceCounter
    // for several of the if/else statements when checking for what is returned based on the cards.
    // This test tests if it works properly.
    public void compareSameFaceTest(){
        Poker gambling;
        gambling = new Poker();
        Assertions.assertEquals(true, gambling.compareSameFace(1,2));
    }
}
