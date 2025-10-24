import java.util.Scanner;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RandomNumberGenerator {
	static Random random = new Random();
	static Pattern pattern = Pattern.compile("\\d+");
	
	public static void easyGame(Scanner scanner) {
		// Easy mode
		boolean running = true;
		
		String userInput;
		int userInputDigit;
		int randomDigit = random.nextInt(1, 11);
		
		System.out.println("\n| * - * | ");
		
		// The game program
		while (running) {
			
			System.out.println("\nI am thinking of a number between 1 and 10, what is it? (Enter in digits)");
			userInput = scanner.nextLine();
			
			Matcher matcher = pattern.matcher(userInput);
			
			if (matcher.find()) {
				userInput = matcher.group();
				userInputDigit = Integer.parseInt(userInput);
				
				// If user's number is too high
				if (userInputDigit > randomDigit) {
					
					Pierre.newPage();
					System.out.println("\n| - _ - | \n" + userInputDigit + "? Go lower!");
				}
				
				// If user's number is too low
				if (userInputDigit < randomDigit) {
					
					Pierre.newPage();
					System.out.println("\n| - _ - | \n" + userInputDigit + "? Go higher!");
				}
				
				// If user's number is the same number
				if (userInputDigit == randomDigit) {
					
					Pierre.newPage();
					System.out.println("\n| ^-^ | \nYay! You got it! Congratulations! It was " + randomDigit + "!");
					
					try {
						Thread.sleep(4000);
					} catch (Exception e) {
						
					}
					
					running = false;
					Pierre.newPage();
					Pierre.menu(scanner);
				}
				
			}
			
		}
		
	}
	
	public static void mediumGame(Scanner scanner) {
		// Medium mode
		boolean running = true;
		
		String userInput;
		int userInputDigit;
		int randomDigit = random.nextInt(1, 51);
		
		System.out.println("\n| * - * | ");
		
		// The game program
		while (running) {
			
			System.out.println("\nI am thinking of a number between 1 and 50, what is it? (Enter in digits)");
			userInput = scanner.nextLine();
			
			Matcher matcher = pattern.matcher(userInput);
			
			if (matcher.find()) {
				userInput = matcher.group();
				userInputDigit = Integer.parseInt(userInput);
				
				// If user's number is too high
				if (userInputDigit > randomDigit) {
					
					Pierre.newPage();
					System.out.println("\n| - _ - | \n" + userInputDigit + "? Go lower!");
				}
				
				// If user's number is too low
				if (userInputDigit < randomDigit) {
					
					Pierre.newPage();
					System.out.println("\n| - _ - | \n" + userInputDigit + "? Go higher!");
				}
				
				if (userInputDigit == randomDigit) {
					
					Pierre.newPage();
					System.out.println("\n| ^-^ | \nYay! You got it! Congratulations! It was " + randomDigit + "!");
					
					try {
						Thread.sleep(4000);
					} catch (Exception e) {
						
					}
					
					running = false;
					Pierre.newPage();
					Pierre.menu(scanner);
				}
				
			}
			
		}
		
	}
	
	public static void hardGame(Scanner scanner) {
		// Hard mode
		boolean running = true;
		
		String userInput;
		int userInputDigit;
		int randomDigit = random.nextInt(1, 101);
		
		System.out.println("\n| * - * | ");
		
		// The game program
		while (running) {
			
			System.out.println("\nI am thinking of a number between 1 and 100, what is it? (Enter in digits)");
			userInput = scanner.nextLine();
			
			Matcher matcher = pattern.matcher(userInput);
			
			if (matcher.find()) {
				userInput = matcher.group();
				userInputDigit = Integer.parseInt(userInput);
				
				// If user's number is too high
				if (userInputDigit > randomDigit) {
					
					Pierre.newPage();
					System.out.println("\n| - _ - | \n" + userInputDigit + "? Go lower!");
				}
				
				// If user's number is too low
				if (userInputDigit < randomDigit) {
					
					Pierre.newPage();
					System.out.println("\n| - _ - | \n" + userInputDigit + "? Go higher!");
				}
				
				if (userInputDigit == randomDigit) {
					
					Pierre.newPage();
					System.out.println("\n| ^-^ | \nYay! You got it! Congratulations! It was " + randomDigit + "!");
					
					try {
						Thread.sleep(4000);
					} catch (Exception e) {
						
					}
					
					running = false;
					Pierre.newPage();
					Pierre.menu(scanner);
				}
				
			}
			
		}
		
	}

}
