/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chun_chan_assignment6;

/**
 *This class test all the methods and make sure your analyzeBoard()algorithm works exactly right. 
 * @author douglas
 */
public class TicTacToeSimulation {

    public static void main(String[] args) {
        System.out.println("test 1");
        try { 
        TicTacToe game = new TicTacToe();
                    
            //test 1 to test player 'x' win
            game.simulateInput('x', '3');
            game.simulateInput('o', '1');
            game.simulateInput('x', '7');
            game.simulateInput('o', '2');
            game.simulateInput('x', 'b');
            game.analyzeBoard();
 

            switch (game.whoWon()) {
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
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("\n\ntest 2:");
        //Test 2: test input invalid date
          try { 
        TicTacToe game1 = new TicTacToe();
                    
            game1.simulateInput('b', '3');
            game1.analyzeBoard();
  
            game1.printBoard();
            game1.analyzeBoard();

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
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

          
          System.out.println("\n\ntest 3:");
        //Test 3: test input invalid date
          try { 
        TicTacToe game1 = new TicTacToe();
                    
            game1.simulateInput('x', 'z');
            game1.analyzeBoard();
  
            game1.printBoard();
            game1.analyzeBoard();

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
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
          
          
          System.out.println("\n\ntest 4:");
        //Test 4: enter a space that has already taken
          try { 
        TicTacToe game1 = new TicTacToe();
                    
            game1.simulateInput('x', '3');
            game1.simulateInput('o', '3');
            game1.analyzeBoard();
  
            game1.printBoard();
            game1.analyzeBoard();

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
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
          
          System.out.println("\n\ntest 5:");
        //Test 5: try to win diagonally across the board
          try { 
        TicTacToe game1 = new TicTacToe();
                    
            game1.simulateInput('x', '0');
            game1.simulateInput('o', '1');
            game1.simulateInput('x', '5');
            game1.simulateInput('o', 'd');
            game1.simulateInput('x', 'a');
            game1.simulateInput('o', 'f');
            
            game1.analyzeBoard();
  
            game1.printBoard();
            game1.analyzeBoard();

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
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
          
    }
    //code Validation: Use 5 tests to test all the methods in tictactoe class in different situtations . 
    // Including catch exceptions, handle invalid data, wins diagonally across the board. All result confirmed.
    
}