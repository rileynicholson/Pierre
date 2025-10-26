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
				
				// Status of the user's number
				if (userInputDigit > randomDigit) {
					
					// If user's number is too high
					
					Pierre.newPage();
					System.out.println("\n| - _ - | \n" + userInputDigit + "? Go lower!");
				} else if (userInputDigit < randomDigit) {
					
					// If user's number is too low
					
					Pierre.newPage();
					System.out.println("\n| - _ - | \n" + userInputDigit + "? Go higher!");
				} else if (userInputDigit == randomDigit) {
					
					// If user's number is the same number
					
					Pierre.newPage();
					System.out.println("\n| ^-^ | \nYay! You got it! Congratulations! It was " + randomDigit + "!");
					
					try {
						Thread.sleep(4000);
					} catch (Exception e) {
						
					}
					
					running = false;
					Pierre.newPage();
					Pierre.menu(scanner);
				} else {
					Pierre.newPage();
					
					// Input validation
					// Only happens if the user enters something the program cannot understand
					
					System.out.println("| o _ o | \nSorry! I don't understand! Could you try entering it again?");
					
					try {
						Thread.sleep(4000);
					} catch (Exception e) {
						
					}
					
					Pierre.newPage();
					easyGame(scanner);
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
				
				// Status of the user's number
				if (userInputDigit > randomDigit) {
					
					// If user's number is too high
					
					Pierre.newPage();
					System.out.println("\n| - _ - | \n" + userInputDigit + "? Go lower!");
				} else if (userInputDigit < randomDigit) {
					
					// If user's number is too low
					
					Pierre.newPage();
					System.out.println("\n| - _ - | \n" + userInputDigit + "? Go higher!");
				} if (userInputDigit == randomDigit) {
					
					// If user's number is the same number
					
					Pierre.newPage();
					System.out.println("\n| ^-^ | \nYay! You got it! Congratulations! It was " + randomDigit + "!");
					
					try {
						Thread.sleep(4000);
					} catch (Exception e) {
						
					}
					
					running = false;
					Pierre.newPage();
					Pierre.menu(scanner);
				} else {
					Pierre.newPage();
					
					// Input validation
					// Only happens if the user enters something the program cannot understand
					
					System.out.println("| o _ o | \nSorry! I don't understand! Could you try entering it again?");
					
					try {
						Thread.sleep(4000);
					} catch (Exception e) {
						
					}
					
					Pierre.newPage();
					mediumGame(scanner);
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
				
				// Status of the user's number
				if (userInputDigit > randomDigit) {
					
					// If user's number is too high
					
					Pierre.newPage();
					System.out.println("\n| - _ - | \n" + userInputDigit + "? Go lower!");
				} else if (userInputDigit < randomDigit) {
					
					// If user's number is too low
					
					Pierre.newPage();
					System.out.println("\n| - _ - | \n" + userInputDigit + "? Go higher!");
				} else if (userInputDigit == randomDigit) {
					
					// If user's number is the same number
					
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
