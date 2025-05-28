package bcc.swinggame;

import java.util.ArrayList;

public class TicTacToeGame {
    private String[][] board;

    public TicTacToeGame() {
        // initialize the board with empty spaces
        board = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = " ";
            }
        }
    }

    // these methods are just to allow the minimax algorithm to work
    public TicTacToeGame(String[][] board) {
        this.board = board;
    }
    public String[][] getBoard() {
        return board;
    }

    public boolean makeMove(int row, int col, String player) {
        if (isValidMove(row, col)) {
            board[row][col] = player;
            return true; // set the move to the player's symbol
        } else {
            return false; // if move is invalid, return false
        }
    }

    private boolean isValidMove(int row, int col) {
        // return true if the move is within bounds and the cell is empty
        return row < 3 && row >= 0 && col < 3 && col >= 0 && board[row][col].equals(" ");
    }

    public boolean checkWin(String player) {
        // check horizontal victories
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(player) && board[i][1].equals(player) && board[i][2].equals(player)) {
                return true;
            }
        }

        // check vertical victories
        for (int i = 0; i < 3; i++) {
            if (board[0][i].equals(player) && board[1][i].equals(player) && board[2][i].equals(player)) {
                return true;
            }
        }

        // check diagonal victories
        if (board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)) {
            return true;
        }

        // else, return false
        return false;
    }

    public void resetGame() {
        // reset the board to empty spaces
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = " ";
            }
        }
    }

    public void printBoard() {
        // print the current state of the board
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.println("—————————");
            }
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) {
                    System.out.print(" # ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("# # # # #");
            }
        }
    }

    public ArrayList<int[]> emptySpaces() {
        ArrayList<int[]> emptySpaces = new ArrayList<int[]>();
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col].equals(" ")) {
                    emptySpaces.add(new int[]{row, col}); // add the empty space to the list
                }
            }
        }

        return emptySpaces; // return the list of empty spaces
    }
}