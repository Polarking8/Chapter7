package TicTac;

import java.sql.Array;
import java.util.ArrayList;

public class TicTacToe {
    boolean successfulTurn = false;
    boolean won = false;
    boolean isPlayerX = false;
    int [][] board = {{0,0,0,},{0,0,0},{0,0,0}};
    String [][] humanBoard = {{"","",""},{"","",""},{"","",""}};
    public String takeTurn(int rowCoordinate, int colCoordinate){
        successfulTurn = false;
        if (board[rowCoordinate][colCoordinate] == 0){
            if(!isPlayerX){
                board[rowCoordinate][colCoordinate] = 1;
            } else {
                board[rowCoordinate][colCoordinate] = 2;
            }
            isPlayerX = !isPlayerX;
            successfulTurn = true;

        }
        translateBoard();
        return printHumanBoard();
    }
    public boolean hasWon(){
        for(int i = 0; i <3; i++){
            if(board[i][0] == board[i][1]&& board[i][2] == board[i][1] && board[i][0]!= 0){
                won = true;
                break;
            }
        }
        for (int j = 0; j<3; j++){
            if(board[0][j] == board[1][j]&&board[1][j] == board[2][j] && board[0][j] != 0){
                won = true;
                break;
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != 0){
            won = true;
        } else if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[1][1] !=0){
            won = true;
        }
        return won;
    }
//    public String printBoard(){
//        StringBuilder boardBuild = new StringBuilder();
//        for(int i = 0; i< board.length; i++){
//            for(int j = 0; j< board[0].length; j++){
//                boardBuild.append(String.format("|%1d|",board[i][j]));
//            }
//            boardBuild.append(String.format("\n"));
//        }
//        return boardBuild.toString();
//    }
    public void translateBoard(){
        for(int i = 0; i <board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(board[i][j] == 1){
                    humanBoard[i][j] = "O";
                } else if (board[i][j] == 2){
                    humanBoard[i][j] = "X";
                } else {
                    humanBoard[i][j] = " ";
                }
            }
        }
    }
    public String printHumanBoard(){
        StringBuilder boardBuild = new StringBuilder();
        for (String[] strings : humanBoard) {
            for (int j = 0; j < humanBoard[0].length; j++) {
                boardBuild.append(String.format("|%1s|", strings[j]));
            }
            boardBuild.append("\n");
        }
        return boardBuild.toString();
    }
    public String playGameJUnit(ArrayList<Integer> turnList){
        while(!hasWon()) {
            System.out.println(takeTurn(turnList.get(0), turnList.get(1)));
            turnList.remove(0);
            if(turnList.size()!=0) {
                turnList.remove(0);
            }
        }
        if(isPlayerX){
            return ("You win, player O!");
        }else{
            return("You win, player X!");
        }
    }
}
//Include a junit test, UML and a flow chart.
