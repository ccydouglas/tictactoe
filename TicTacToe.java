/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chun_chan_assignment6;

import java.util.Scanner;

/**
 * This TicTaeToe class is the program of a tic tac toe board game. It has
 * method to display the board, define who is the winner and receive user input.
 *
 * @author douglas
 */
public class TicTacToe {

    final private int boardSize = 4;
    private boolean gameStatus = false;
    private char whoWins = 'T';
    private char whoTurns = 'X';
    private final char board[][] = new char[boardSize][boardSize];
    char[] boardValue = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g'};

    /*
     this method creates the initial setting on the board and gives initial values to all fields.
     */
    public TicTacToe() {
        int count = 0;
        for (int row = 0; row < boardSize; row++) {
            for (int col = 0; col < boardSize; col++) {
                board[row][col] = boardValue[count];
                count++;
            }
        }
    }

    /**
     * This method print the current board to the user
     */
    public void printBoard() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * this method provides the prompt and gathers input from the user.
     */
    public void input() {
        printBoard();
        Scanner keyboard = new Scanner(System.in);
        boolean again = true;

        while (again) {
            System.out.println();
            System.out.println("Hi player '" + whoTurns + "' please select your next move.");
            char m = keyboard.next().trim().charAt(0);
            char move = Character.toLowerCase(m);

            //check If the character provided by the user is valid
            boolean found = false;
            for (int index = 0; index < boardValue.length; index++) {
                if (move == boardValue[index]) {
                    found = true;
                }
            }

            if (!found) {
                System.out.println("The value you input is not valid");
//                break;
            } else {
                //covert user's input into the 2D array
                int i = 0;

                for (; i < boardValue.length; i++) {
                    if (move == boardValue[i]) {
                        break;
                    }
                }

                int row = i / boardSize;
                int col = i % boardSize;

                if (board[row][col] == 'X' || board[row][col] == 'O') {
                    System.out.println("The place has been taken. Please try again.");
                } else {

                    board[row][col] = whoTurns;
                    again = false;
                }
            }
        }

        //switch user
        if (whoTurns == 'X') {
            whoTurns = 'O';
        } else {
            whoTurns = 'X';
        }
    }

    /**
     * This method allows to simulate the moves of two opponents.
     *
     * @param player X or O
     * @param letter the move (as a character)
     */
    public void simulateInput(char player, char letter) {

        boolean again = true;
        player = Character.toUpperCase(player);

        if (player != 'X' && player != 'O') {
            throw new IllegalArgumentException("The player need to be 'X' or 'O' ");
        }

        if (letter < 1) {
            throw new IllegalArgumentException("Error: Value cannot be empty. ");
        }

        boolean found = false;
        for (int index = 0; index < boardValue.length; index++) {
            if (letter == boardValue[index]) {
                found = true;
            }
        }

        if (!found) {
            throw new IllegalArgumentException("The value you input is not valid");
        }

        int i = 0;

        for (; i < boardValue.length; i++) {
            if (letter == boardValue[i]) {
                break;
            }
        }

        int row = i / boardSize;
        int col = i % boardSize;

        if (board[row][col] == 'X' || board[row][col] == 'O') {
            throw new IllegalArgumentException("The place has been taken. Please try again.");
        } else {
            board[row][col] = player;
        }

        if (whoTurns != player) {
            throw new IllegalArgumentException("Error: It is not your turn");
        }

        if (whoTurns == 'X') {
            whoTurns = 'O';
        } else {
            whoTurns = 'X';
        }

    }

    /**
     * this method analyzes the current board and determines if there is a
     * winning position present or if it is a tie.
     *
     */
    public void analyzeBoard() {
        boolean freeSpace = true;
        //check rows if there is a winner 
        for (int row = 0; row < boardSize; row++) {
            if (board[row][0] == board[row][1] && board[row][1] == board[row][2]) {
                whoWins = board[row][1];
                gameStatus = true;
            }
            if (board[row][1] == board[row][2] && board[row][2] == board[row][3]) {
                whoWins = board[row][1];
                gameStatus = true;
            }
        }
        //check columns if there is a winner        
        for (int col = 0; col < boardSize; col++) {
            if (board[0][col] == board[1][col] && board[1][col] == board[2][col]) {
                whoWins = board[1][col];
                gameStatus = true;
            }
            if (board[1][col] == board[2][col] && board[2][col] == board[3][col]) {
                whoWins = board[2][col];
                gameStatus = true;
            }
        }

        //diagonally across the board if there is a winner
        for (int d = 0; d < 2; d++) {
            if (board[d][d] == board[d + 1][d + 1] && board[d + 1][d + 1] == board[d + 2][d + 2]) {
                whoWins = board[d + 1][d + 1];
                gameStatus = true;
            }
            if (board[d + 1][d + 1] == board[d + 2][d + 2] && board[d + 2][d + 2] == board[d + 3][d + 3]) {
                whoWins = board[d + 2][d + 2];
                gameStatus = true;
            }
        }

        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            whoWins = board[1][1];
            gameStatus = true;
        }

        if (board[3][1] == board[2][2] && board[2][2] == board[1][3]) {
            whoWins = board[2][2];
            gameStatus = true;
        }

        if (board[0][1] == board[1][2] && board[1][2] == board[2][3]) {
            whoWins = board[1][2];
            gameStatus = true;
        }

        if (board[1][0] == board[2][1] && board[2][1] == board[3][2]) {
            whoWins = board[2][1];
            gameStatus = true;
        }

        //check if there are any free spaces on the board
        for (int row = 0; row < boardSize; row++) {
            for (int col = 0; col < boardSize; col++) {
                if (board[row][col] != 'X' && board[row][col] != 'O') {
                    freeSpace = true;
                } else {
                    freeSpace = false;
                }
            }
        }

        if (!freeSpace) {
            gameStatus = true;

        }

    }

    /**
     * this method returns true if the game came to the end.
     *
     * @return game status
     */
    public boolean done() {
        return gameStatus;
    }

    /**
     * this method returns a character (X, O or T – for tie),
     *
     * @return whoWins- who is the winner of the game
     */
    public char whoWon() {
        return whoWins;
    }
}
