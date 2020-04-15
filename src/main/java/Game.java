import java.util.Scanner;
public class Game {
    private ScoreBoard scoreBoard;
    private Player playerOne;
    private Player playerTwo;

    Game(Player playerOne, Player playerTwo) {
        super();
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        scoreBoard = new ScoreBoard(0,0);
    }

    public ScoreBoard play() {
        RuleEngine ruleEngine = new RuleEngine();
        return ruleEngine.getScore(playerOne.makeMove(),playerTwo.makeMove());
    }

    public ScoreBoard playForNRounds(int numberOfRounds) {
        for(int round = 0; round < numberOfRounds; round++) {
            ScoreBoard score = play();
            scoreBoard.updateScores(score);
            System.out.println(scoreBoard);
        }
        return scoreBoard;
    }
    public static void main(String[] args){
//        Scanner inputScanner = new Scanner(System.in);
//        ConsolePlayerBehavior consolePlayerOne = new ConsolePlayerBehavior(inputScanner);
//        ConsolePlayerBehavior consolePlayerTwo = new ConsolePlayerBehavior(inputScanner);
//        Game twoConsolePlayerGame = new Game(new Player(consolePlayerOne),new Player(consolePlayerTwo));
//        // ScoreBoard scores = twoConsolePlayerGame.playForNRounds(3);
//        ScoreBoard scores = twoConsolePlayerGame.play();
//        // System.out.println(scores.getScores());
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.nextLine();
        for(int i=1;i<10;i++){

        }
    }
}
