package TicTac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class TicTacTest {
    @Test
    public void oWinDiagonal(){
        TicTacToe game;
        game = new TicTacToe();
        ArrayList<Integer> inputValues = new ArrayList<>();
        inputValues.add(0);
        inputValues.add(0);
        inputValues.add(1);
        inputValues.add(0);
        inputValues.add(1);
        inputValues.add(1);
        inputValues.add(2);
        inputValues.add(1);
        inputValues.add(2);
        inputValues.add(2);
        Assertions.assertEquals("You win, player O!", game.playGameJUnit(inputValues));
    }
    @Test
    public void xWinHorizontal(){
        TicTacToe game;
        game = new TicTacToe();
        ArrayList<Integer> inputValues = new ArrayList<>();
        inputValues.add(0);
        inputValues.add(0);
        inputValues.add(2);
        inputValues.add(0);
        inputValues.add(1);
        inputValues.add(0);
        inputValues.add(2);
        inputValues.add(1);
        inputValues.add(1);
        inputValues.add(2);
        inputValues.add(2);
        inputValues.add(2);
        Assertions.assertEquals("You win, player X!", game.playGameJUnit(inputValues));
    }
}
