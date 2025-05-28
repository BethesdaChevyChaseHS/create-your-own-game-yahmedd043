package bcc.swinggame;

public class Ai {
    private static final String[] REMARKS = {
        // list of remarks the AI can make
        "Still think you can take me on?",
        "Oh boy, I'm just getting started!",
        "Noob.",
        "Is this really the best you can do?",
        "Surely you can do better than that...",
        "My grandma plays better Tic Tac Toe than you!",
        "Man, you're really bad at this.",
        "You know, I really should've picked a better opponent.",
        "Pfft.",
        "You call that a move?",
        "\033[3m" + "yawn" + "\033[0m"
    };

    public Ai() {
    }

    public int[] makeMove(TicTacToeGame game) {
        return game.emptySpaces().get((int) (Math.random() * game.emptySpaces().size()));
        
        // i will eventually implement a smarter AI that uses the minimax algorithm, stay tuned!
    }

    public String getRemark() {
        // return a random remark from the list
        return REMARKS[(int) (Math.random() * REMARKS.length)];
    }
}
