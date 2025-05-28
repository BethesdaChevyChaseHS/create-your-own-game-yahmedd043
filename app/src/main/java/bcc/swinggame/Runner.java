package bcc.swinggame;
import java.util.Scanner;

public class Runner {
    // ANSI escape codes for colored output
    // they're pretty nice, even if i don't understand how they work
    public static final String PLAYER = "\033[1;31m" + "X" + "\033[0m";
    public static final String BOT = "\033[1;34m" + "O" + "\033[0m";
    private static Ai ai; 

    private static Scanner scanner = new Scanner(System.in);
    private static TicTacToeGame game = new TicTacToeGame();
    public static void main(String[] args) {
        System.out.println("\nWelcome to" + "\033[1;33m" + " Tic Tac Toe" + "\033[0m" + "!");
        System.out.println("You are " + PLAYER + " and the bot is " + BOT + ".");
        ai = new Ai(); // create an instance of the AI class

        while (true) {
            game.printBoard();

            // player's turn
            if (game.emptySpaces().size() < 9) {
                System.out.println("\033[1;34m" + "AI:" + "\033[0m" + " " + ai.getRemark());
            }
            System.out.println("\033[1;37m" + "Pick a row and column! (1-3 for both, separated)" + "\033[0m");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            if (!game.makeMove(row - 1, col - 1, PLAYER)) {
                System.out.println("\033[1;33m" + "Invalid, try again!" + "\033[0m");
                continue; // if the move is invalid, go to the next iteration
            }
            if (game.checkWin(PLAYER)) {
                // check if the player has won
                game.printBoard();
                System.out.println(PLAYER + "\033[1;37m" + " wins! Would you like to play again? (Y/n)" + "\033[0m");
                String r1 = scanner.next();
                if (r1.equalsIgnoreCase("n")) {
                    break; // exit the game loop
                } else {
                    game.resetGame();
                    continue;
                }
            }

            // draw check
            if (game.emptySpaces().size() == 0) {
                game.printBoard();
                System.out.println("\033[1;37m" + "It's a draw!" + "\033[1;37m" + " Would you like to play again? (Y/n)" + "\033[0m");
                String r3 = scanner.next();
                if (r3.equalsIgnoreCase("n")) {
                    break; // exit the game loop
                } else {
                    game.resetGame();
                    continue;
                }
            }

            // bot's turn
            int[] move = ai.makeMove(game);
            game.makeMove(move[0], move[1], BOT);
            if (game.checkWin(BOT)) {
                // check if the bot has won
                game.printBoard();
                System.out.println(BOT + "\033[1;37m" + " won. Would you like to play again? (Y/n)" + "\033[0m");
                String r2 = scanner.next();
                if (r2.equalsIgnoreCase("n")) {
                    break; // exit the game loop
                } else {
                    game.resetGame();
                    continue;
                }
            }
        }
        System.out.println("Thanks for playing" + "\033[1;33m" + " Tic Tac Toe" + "\033[0m" + "!"); 
    }
}
