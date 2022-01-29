package TicTac;

import java.util.Scanner;

public class TicTacTester {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner in = new Scanner(System.in);
        //System.out.println(game.printBoard());
        do {
            System.out.println("Enter the row where you want to place your mark: (1,2 or 3): ");
            int markRow = in.nextInt()-1;
            System.out.println("Enter the column where you want to place your mark: (1,2 or 3): ");
            int markColumn = in.nextInt()-1;
            System.out.println(game.takeTurn(markRow,markColumn));
            if(!game.isPlayerX && !game.hasWon()){
                System.out.println("Your turn, player O!");
            } else if (!game.hasWon()){
                System.out.println("Your turn, player X!");
            }
        }while(!game.hasWon());
        if (game.isPlayerX){
            System.out.println("You win, player O!");
        }else{
            System.out.println("You win, player X!");
        }

    }
}
