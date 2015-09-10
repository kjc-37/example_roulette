# example_roulette
Program to refactor that plays a game of roulette
kjc37 and elj16

Refactoring questions
1. We added the abstract methods betIsMade() and setAndPlaceBet().
2. We took out the placeBet() and betIsMade() methods from Game to make it's
functionality make more sense.
3. getOdds() and getDescription() are the only methods implemented in Bet.
betIsMade() and setAndPlaceBet() are implemented in the subclass.
4. The myPossibleBets array now contains the different subclasses of Bet.