package Bets;

import roulette.Bet;
import roulette.Wheel;
import util.ConsoleReader;

public class ColorBet extends Bet {

	public ColorBet(String description, int odds) {
		super(description, odds);
	}
	
	public void setAndPlaceBet() {
		myBetChoice = ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}
	
	public boolean betIsMade(Wheel wheel) {
		return wheel.getColor().equals(myBetChoice);
	}

}
