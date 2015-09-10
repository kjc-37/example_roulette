package Bets;

import roulette.Bet;
import roulette.Wheel;
import util.ConsoleReader;

public class NumberBet extends Bet {

	public NumberBet(String description, int odds) {
		super(description, odds);
	}

	@Override
	public boolean betIsMade(Wheel wheel) {
		int start = Integer.parseInt(myBetChoice);
      return (start <= wheel.getNumber() && wheel.getNumber() < start + 3);
	}

	@Override
	public void setAndPlaceBet() {
		myBetChoice = "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
            1, Wheel.NUM_SPOTS - 3);
		
	}

}
