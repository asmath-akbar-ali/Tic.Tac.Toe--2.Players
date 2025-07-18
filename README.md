# Tic Tac Toe Game in Java

## Overview
  This is a simple console-based Tic Tac Toe game implemented in Java. It allows two players to take turns marking spaces on a 3x3 grid. The game continues until a player wins or the board is full (resulting in a draw)

## Features
- Two-player gameplay
- Input validation to ensure valid moves
- Win detection for rows, columns, and diagonals
- Automatic turn switching
- Draw detection when the board is full

## How to Play
1. Run the program.
2. Players take turns entering row and column numbers (0-2) to mark their moves.
3. The board updates after each move.
4. The game ends when a player wins or the board is full.
5. The winner is announced, or if no one wins, the game declares a draw.

## Code Explanation
- `printBoard()`: Displays the current game board.
- `isValidMove(row, col)`: Checks if a move is valid.
- `checkWin(player)`: Determines if a player has won.
- `isBoardFull()`: Checks if the board is full.
- `switchPlayer()`: Switches the turn between players.
- `playGame()`: Controls the game loop, taking user input and updating the board.
- `main()`: Starts the game.

## Prerequisites
- Java installed on your system
- A terminal or command prompt to run the program

## How to Run
1. Clone this repository:
   ```sh
   git clone https://github.com/yourusername/tic-tac-toe-java.git
   ```
2. Navigate to the project folder:
   ```sh
   cd tic-tac-toe-java
   ```
3. Compile the Java file:
   ```sh
   javac Main.java
   ```
4. Run the program:
   ```sh
   java Main
   ```

## Example Gameplay
```
Welcome to Tic Tac Toe Game!!!
- - -
- - -
- - -

Player X, enter row and column (0-2): 1 1

- - -
- X -
- - -

Player O, enter row and column (0-2): 0 0

O - -
- X -
- - -
```


