import java.util.Random;

public class DiceRoller {

    private Random random;

    public DiceRoller() {
        this.random = new Random();
    }

    // Roll a single die (1-6)
    public int rollDie() {
        return random.nextInt(6) + 1; // Generates 1-6
    }

    // Roll two dice and return the results as an array
    public int[] rollTwoDice() {
        int die1 = rollDie();
        int die2 = rollDie();
        return new int[]{die1, die2};
    }

    // Check if two dice show the same number (a double)
    public boolean isDouble(int die1, int die2) {
        return die1 == die2;
    }

    // Simulate rolling until a double is rolled, return number of rolls
    public int rollsUntilDouble() {
        int count = 0;
        int die1, die2;
        do {
            int[] dice = rollTwoDice();
            die1 = dice[0];
            die2 = dice[1];
            count++;
        } while (!isDouble(die1, die2));
        return count;
    }

    public static void main(String[] args) {
        DiceRoller diceRoller = new DiceRoller();

        int[] dice = diceRoller.rollTwoDice();
        System.out.println("You rolled: " + dice[0] + " and " + dice[1]);

        if (diceRoller.isDouble(dice[0], dice[1])) {
            System.out.println("You rolled a double!");
        } else {
            System.out.println("Try again.");
        }

        int rolls = diceRoller.rollsUntilDouble();
        System.out.println("It took " + rolls + " rolls to get a double.");
    }
}
