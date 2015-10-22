package roulette.bets;

import java.lang.reflect.Constructor;

import roulette.Bet;

public class BetFactory {
    // add new bet subclasses here
    /*private Bet[] myPossibleBets = {
        new RedBlack("Red or Black", 1),
        new OddEven("Odd or Even", 1),
        new ThreeConsecutive("Three in a Row", 11),
    };*/
	private String[] myPossibleBets = {
		"RedBlack",
		"OddEven",
		"ThreeConsecutive"
	};

	public Bet makeBet(int response) throws Exception {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		Class<Bet> clazz = (Class<Bet>) Class.forName("roulette.bets." + myPossibleBets[response-1]);
		return clazz.newInstance();
	}

	public void printChoices() {
		// TODO Auto-generated method stub
		System.out.println("You can make one of the following types of bets:");
        for (int k = 0; k < myPossibleBets.length; k++) {
            System.out.println(String.format("%d) %s", (k + 1), myPossibleBets[k]));
        }
	}

	public int numPossibleBets() {
		// TODO Auto-generated method stub
		return myPossibleBets.length;
	}
}
