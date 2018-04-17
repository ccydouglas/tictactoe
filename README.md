# tictactoe
4X4 tic tac toe
A program that allows two players to play a game of tic-tac-toe on 4x4 board. Game user interface description:

Two players are playing a game, taking turns to make a move. Player 1 places Xs, and player 2 places Os on the 4x4 board. Player 1 wins when there are three Xs in a row on the game board (player 2 wins when there are three Os). Three Xs (or Os) can appear in a row, in a column, or diagonally across the board. A tie occurs when all of the locations on the board are full, but there is no winner.
On each turn the board is being displayed. There is a number of ways to organize better interface with the user. I would prefer to have a board that looks like this: 
0	1	2	3
4	5	6	7
8	9	a	b
c	d	e	f
When the user wants to make a move, he/she chooses a number (kind of a Hex system), that represents the placement of X or O on the board. Below is sample interaction with a player. Player’s input appears in blue. 
0	1	2	3
4	5	6	7
8	9	a	b
c	d	e	f
Player 1, make your move => 8 
0	1	2	3
4	5	6	7
X	9	a	b
c	d	e	f
Player 2, make your move => 9 
0	1	2	3
4	5	6	7
X	0	a	b
c	d	e	f
