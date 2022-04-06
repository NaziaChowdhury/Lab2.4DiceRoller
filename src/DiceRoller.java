import java.util.Random;
import java.util.Scanner;

public class DiceRoller {

	static Scanner scannerObj = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to the Grand Circus Casino!");

		rollDice();

	}

	public static void rollDice() {
		System.out.println("How many sides should each die have?");
		int numberOfSides = scannerObj.nextInt();

		System.out.println("Roll 1:");
		int randomNumber1 = generateRandomDieRoll(numberOfSides);
		int randomNumber2 = generateRandomDieRoll(numberOfSides);
		System.out.println(randomNumber1 + "\n" + randomNumber2);
		
		specialMessages(randomNumber1, randomNumber2);
		
		askToRollAgain();
	}

	public static int generateRandomDieRoll(int numberOfSides) {
		Random randomObj = new Random();
		int randomNumber = randomObj.nextInt(numberOfSides) + 1;
		return randomNumber;

	}
	
	public static void specialMessages(int randomNumber1, int randomNumber2) {
		if (randomNumber1 == 1 && randomNumber2 == 1) {
			System.out.println("Snake Eyes");
		}
		if (randomNumber1 == 6 && randomNumber2 == 6) {
			System.out.println("Box Cars");
		}
	}

	public static void askToRollAgain() {
		System.out.println("Roll again? (y/n):");
		scannerObj.nextLine();
		String rollAgainInput = scannerObj.nextLine();

		if (rollAgainInput.equals("y")) {
			rollDice();
		} else if (rollAgainInput.equals("n")) {
			System.out.println("Thanks for playing! Goodbye.");
			scannerObj.close();
		}
	}

}
