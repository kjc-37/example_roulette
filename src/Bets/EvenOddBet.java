package Bets;

import roulette.Bet;
import roulette.Wheel;
import util.ConsoleReader;

public class EvenOddBet extends Bet {
	
	public EvenOddBet(String description, int odds) {
		super(description, odds);
	}

	@Override
	public boolean betIsMade(Wheel wheel) {
		return (wheel.getNumber() % 2 == 0 && myBetChoice.equals("even")) ||
              (wheel.getNumber() % 2 == 1 && myBetChoice.equals("odd"));
	}

	@Override
	public void setAndPlaceBet() {
		myBetChoice = ConsoleReader.promptOneOf("Please bet", "even", "odd");
		
	}

}
