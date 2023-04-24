/*
 * Author: Sean Emede
 * Description: class with methods to play tic tac toe game
 * Date: 04/21/2023
 */
import java.util.Scanner;

public class TicTacToe {
	
    private int[][] board;
    private int currentPlayer; // 1 for X, -1 for O
    private Scanner scanner;

    public TicTacToe() {
        //makes the board as a 3x3 array
        board = new int[3][3];
        currentPlayer = 1;
        scanner = new Scanner(System.in);
    }

    public void play() {
        //check to see if the game has ended
        boolean gameEnd = false;
        while (!gameEnd) {
            printBoard();

            int row, col;
            do {
                System.out.printf("Player %s, enter row (0-2) and column (0-2) separated by space: ", currentPlayer == 1 ? "X" : "O");
                row = scanner.nextInt();
                col = scanner.nextInt();
            } while (!isGoodMove(row, col));

            board[row][col] = currentPlayer;

            if (whoWon()) {
                printBoard();
                System.out.printf("Player %s wins!\n", currentPlayer == 1 ? "X" : "O");
                resetBoard();
            } else if (isADraw()) {
                printBoard();
                System.out.println("It's a draw!");
                resetBoard();
            } else {
                currentPlayer *= -1;
            }
        }
    }

    private void printBoard() {
        //print the board in its current state
        TicTacToePrinter.printBoard(board);
    }

    private boolean isGoodMove(int row, int col) {
        //check to see if the user inputted move can be played on the board
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid row or column.");
            return false;
        }
        if (board[row][col] != 0) {
            System.out.println("That square is already occupied.");
            return false;
        }
        return true;
    }

    private boolean whoWon() {
        // check rows
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == currentPlayer && board[row][1] == currentPlayer && board[row][2] == currentPlayer) {
                return true;
            }
        }

        // check columns
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == currentPlayer && board[1][col] == currentPlayer && board[2][col] == currentPlayer) {
                return true;
            }
        }

        // check diagonals
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }

        return false;
    }

    private boolean isADraw() {
        //check if the whole board is full so game can edn in a draw
        for (int[] row : board) {
            for (int square : row) {
                if (square == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private void resetBoard() {
        board = new int[3][3];
        currentPlayer = 1;
    }
}
