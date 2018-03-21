import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
	
	Random rand = new Random(System.currentTimeMillis()); // new field as an instance of class random
	
	public static void main(String[] args) {
		
	    RockPaperScissors rps = new RockPaperScissors();
	    
	    rps.playRound();
	}
	
	void playRound() {
		
		String playerHand = getPlayerHand();
		//String computerHand = generateComputerHand();
		//String playerHand = "s";
		String computerHand = "s";
		String winner = getWinner(playerHand, computerHand);
		System.out.format("Computer: %s \n", computerHand);  // format as a better way of printing %s %d %f
		System.out.format("Winner: %s \n",winner);
		//System.out.println(winner);
	
	}

	String getWinner(String playerHand, String computerHand) {
		/*
		 * if (rockBeats (computerHand)) { return "player"; } else { return "computer";
		 * }
		 */
		if (!computerHand.equals( playerHand)) {
			switch (playerHand) {
			case "r":
				return (rockBeats(computerHand)) ? "player" : "computer"; // ternary
			case "p":
				return (paperBeats(computerHand)) ? "player" : "computer"; // ternary
			case "s":
				return (scissorsBeats(computerHand)) ? "player" : "computer"; // ternary
			}
		}
		return "tie";
	}

	boolean rockBeats(String computerHand) {
		return (computerHand.equals("s"));
	}

	static boolean scissorsBeats(String computerHand) {
		return (computerHand.equals("p"));
	}

	static boolean paperBeats(String computerHand) {
		return (computerHand.equals("r"));
	}
	
	String getPlayerHand() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input r/p/s?");
		String playerHand = scanner.next();
		return playerHand;
	}
	
	String generateComputerHand () {
		int handNumber = rand.nextInt(3);
		
		String hand = "error";
		if (handNumber == 0) {
			hand = "r";
		} else if (handNumber == 1) {
			hand = "p";
		} else if (handNumber == 2){
			hand = "s";
		}
		return hand;
	}
	
}
