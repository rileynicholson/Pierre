import java.util.Scanner;

public class Pierre {
	
	public static void newPage() {
		// Makes a new page by flooding the console with a bunch of empty prints 
		
		for (int i = 0; i <= 15; i++) {
			System.out.println(" ");
		}
		
	}
	
	public static void introduction(Scanner scanner) {
		// Introduction sequence
		// Only happens at the start of the program
		System.out.println("| ^ - ^ | \nHello! My name is Pierre!");
		
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			
		}
		
		newPage();
		
	}
	
	public static void menu(Scanner scanner) {
		// Displays the menu to the user
		// Prompts the user to enter an option and play a game
		// Sends the user to that game based on the user's input
		String userInput;
		System.out.println("\n| * - * | \nPlease select one of my options! \n1. Random Number Guesser \n2. Rock Paper Scissors \n3. Exit");
		userInput = scanner.nextLine();
		userInput = userInput.toLowerCase();
		
		// Options
		if (userInput.contains("one")||userInput.contains("1")||userInput.contains("random")||userInput.contains("number")||userInput.contains("guesser")||userInput.contains("rng")) {
			newPage();
			
			// Random Number Guesser
			
			System.out.println("| ^ - ^ | \nLet's do it!");
			
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
				
			}
			
			newPage();
			
			// Sends them to the random number guesser game
			randomNumberGuesser(scanner);
		} else if (userInput.contains("two")||userInput.contains("2")||userInput.contains("rock")||userInput.contains("paper")||userInput.contains("scissors")||userInput.contains("rps")) {
			newPage();
			
			// Rock Paper Scissors
			
			System.out.println("| ^ - ^ | \nLet's do it!");
			
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
				
			}
			
			newPage();
			
			// Sends them to the rock paper scissors game
			RockPaperScissors.game(scanner);
		} else if (userInput.contains("three")||userInput.contains("3")||userInput.contains("exit")) {
			newPage();
			
			// Exit
			
			System.out.println("| ~ _ ~ | \nOh, ok.");
			
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
				
			}
			
			newPage();
			
			System.out.println("| ^ - ^ | \nThanks for spending time with me though! I'll see you later!");
			
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
				
			}
			
			// Exits the program
			System.exit(0);
		} else {
			newPage();
			
			// Input validation
			// Only happens if the user enters something the program cannot understand
			
			System.out.println("| o _ o | \nSorry! I don't know what to do! Could you try entering it again?");
			
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
				
			}
			
			newPage();
			menu(scanner);
		}
		
	}
	
	public static void randomNumberGuesser(Scanner scanner) {
		// Only applies to the random number guesser game
		// Prompts the user to choose a difficulty
		String userInput;
		
		System.out.println("| * - * | \nWhich difficulty do you want to do? Easy, Medium, or Hard?");
		
		userInput = scanner.nextLine();
		userInput = userInput.toLowerCase();
		
		// Modes
		if (userInput.contains("easy")) {
			newPage();
			
			// Easy mode
			
			System.out.println("| ^ - ^ | \nGotcha! Easy it is!");
			
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
				
			}
			
			newPage();
			RandomNumberGenerator.easyGame(scanner);
		} else if (userInput.contains("medium")) {
			newPage();
			
			// Medium mode
			
			System.out.println("| ^ - ^ | \nGotcha! Medium it is!");
			
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
				
			}
			
			newPage();
			RandomNumberGenerator.mediumGame(scanner);
		} else if (userInput.contains("hard")) {
			newPage();
			
			// Hard mode
			
			System.out.println("| ^ - ^ | \nGotcha! Hard it is!");
			
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
				
			}
			
			newPage();
			RandomNumberGenerator.hardGame(scanner);
		} else {
			newPage();
			
			// Input validation
			// Only happens if the user enters something the program cannot understand
			
			System.out.println("| o _ o | \nSorry! I don't know what to do! Could you try entering it again?");
			
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
				
			}
			
			newPage();
			randomNumberGuesser(scanner);
		}
		
	}
	
}
