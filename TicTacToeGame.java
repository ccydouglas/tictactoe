/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chun_chan_assignment6;

/**
 *This method allows 2 players to play the game tic tac toe by using the tictactoe class
 * @author douglas
 */
public class TicTacToeGame {

public static void main(String[] args) {
        TicTacToe game1 = new TicTacToe();

        while (!game1.done()) {
            game1.input();
            game1.analyzeBoard();
        }
        switch (game1.whoWon()) {
            case 'T':
                System.out.print("This game is tie");
                break;
            case 'O':
                System.out.print("Player 'O' won the game");
                break;
            case 'X':
                System.out.print("Player 'X' won the game");
                break;
        }
    }

}

/*
code validation
(1)Enter 4, 5,6 for player 'O'. Player 'O' wins.
(2)Enter 0,5,a for player 'X'. Player 'X' wins.
(3)Enter 'z'. Displayed error message
(4)enter '3' for player 'x' and '3' for player 'o' displayed error message.
*/