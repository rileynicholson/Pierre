import java.util.Scanner;

public class Pierre {
	
	public static void newPage() {
		
		for (int i = 0; i <= 15; i++) {
			System.out.println(" ");
		}
		
	}
	
	public static void introduction(Scanner scanner) {
		System.out.println("| ^ - ^ | \nHello! My name is Pierre!");
		
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			
		}
		
		newPage();
		
	}
	
	public static void menu(Scanner scanner) {
		String userInput;
		System.out.println("\n| * - * | \nPlease select one of my options! \n1. Random Number Guesser \n2. Rock Paper Scissors \n3. Exit");
		userInput = scanner.nextLine();
		userInput = userInput.toLowerCase();
		
		if (userInput.contains("one")||userInput.contains("1")||userInput.contains("random")||userInput.contains("number")||userInput.contains("guesser")||userInput.contains("rng")) {
			newPage();
			
			System.out.println("| ^ - ^ | \nLet's do it!");
			
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
				
			}
			
			newPage();
			
			randomNumberGuesser(scanner);
		}
		
		if (userInput.contains("two")||userInput.contains("2")||userInput.contains("rock")||userInput.contains("paper")||userInput.contains("scissors")||userInput.contains("rps")) {
			newPage();
			
			System.out.println("| ^ - ^ | \nLet's do it!");
			
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
				
			}
			
			newPage();
			
			RockPaperScissors.game(scanner);
		}
		
	}
	
	public static void randomNumberGuesser(Scanner scanner) {
		String userInput;
		
		System.out.println("| * - * | \nWhich difficulty do you want to do? Easy, Medium, or Hard?");
		
		userInput = scanner.nextLine();
		userInput = userInput.toLowerCase();
		
		if (userInput.contains("easy")) {
			newPage();
			
			System.out.println("| ^ - ^ | \nGotcha! Easy it is!");
			
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
				
			}
			
			newPage();
			RandomNumberGenerator.easyGame(scanner);
		}
		
		if (userInput.contains("medium")) {
			newPage();
			
			System.out.println("| ^ - ^ | \nGotcha! Medium it is!");
			
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
				
			}
			
			newPage();
			RandomNumberGenerator.mediumGame(scanner);
		}
		
		if (userInput.contains("hard")) {
			newPage();
			
			System.out.println("| ^ - ^ | \nGotcha! Hard it is!");
			
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
				
			}
			
			newPage();
			RandomNumberGenerator.hardGame(scanner);
		}	
		
	}
	
}
