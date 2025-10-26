import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	static Random random = new Random();
	
	public static void game(Scanner scanner) {
		// The rock paper scissors game
		boolean running = true;
		
		String userInput;
		int cpuChoice;
		
		
		// The game program
		while (running) {
			cpuChoice = random.nextInt(1,4);
			System.out.println("| ^-^ | \nEnter Rock, Paper, or Scissors!");
			userInput = scanner.nextLine();
			userInput = userInput.toLowerCase();
			boolean inputWorks = false;
			
			Pierre.newPage();
			
			// User choices
			if (userInput.contains("rock")) {
				RockPaperScissors.animation();
				Pierre.newPage();
				inputWorks = true;
				
				// User choice is rock
				
				if (cpuChoice == 1) {
					System.out.println("| * o * | \nIt's a tie! We both chose Rock!");
				} else if (cpuChoice == 2) {
					System.out.println("| ^-^ | \nI win! I chose Paper!");
				} else if (cpuChoice == 3) {
					System.out.println("| -_- | \nYou win! I chose Scissors!");
				}
				
			} else if (userInput.contains("paper")) {
				RockPaperScissors.animation();
				Pierre.newPage();
				inputWorks = true;
				
				// User choice is paper
				
				if (cpuChoice == 1) {
					System.out.println("| -_- | \nYou win! I chose Rock!");
				} else if (cpuChoice == 2) {
					System.out.println("| * o * | \nIt's a tie! We both chose Paper!");
				} else if (cpuChoice == 3) {
					System.out.println("| ^-^ | \nI win! I chose Scissors!");
				}
				
			} else if (userInput.contains("scissors")) {
				RockPaperScissors.animation();
				Pierre.newPage();
				inputWorks = true;
				
				// User choice is scissors
				
				if (cpuChoice == 1) {
					System.out.println("| ^-^ | \nI win! I chose Rock!");
				} else if (cpuChoice == 2) {
					System.out.println("| -_- | \nYou win! I chose Paper!");
				} else if (cpuChoice == 3) {
					System.out.println("| * o * | \nIt's a tie! We both chose Scissors!");
				}
			} else {
				Pierre.newPage();
				
				// Input validation
				// Only happens if the user enters something the program cannot understand
				
				System.out.println("| o _ o | \nSorry! I don't know what you picked! Could you try entering it again?");
				
				try {
					Thread.sleep(4000);
				} catch (Exception e) {
					
				}
				
				Pierre.newPage();
				game(scanner);
			}
			
			if (inputWorks) {
				
				try {
					Thread.sleep(4000);
				} catch (Exception e) {
					
				}
				
				boolean retry = true;
				
				while (retry) {
					
					// Prompts the user if they want to go again
					Pierre.newPage();
					
					System.out.println("| - o - | \nWould you like to do it again?");
					userInput = scanner.nextLine();
					userInput = userInput.toLowerCase();
					Pierre.newPage();
					
					if (userInput.contains("yes")||userInput.contains("yeah")||userInput.contains("sure")||userInput.contains("yup")||userInput.contains("yuh")) { // More inputs could be added here
						// User says yes
						System.out.println("| ^ - ^ | \nYay! Let's do it!");
						retry = false;
						
						try {
							Thread.sleep(4000);
						} catch (Exception e) {
							
						}
						
						Pierre.newPage();
						
						continue;
					
					} else if (userInput.contains("no")||userInput.contains("nah")||userInput.contains("nope")) { // More inputs could be added here
						// User says no
						System.out.println("| U - U | \nOk, going back to the menu!");
						retry = false;
						
						try {
							Thread.sleep(4000);
						} catch (Exception e) {
							
						}
						
						Pierre.newPage();
						running = false;
					} else {
						// User enters an input that the program does not understand
						
						Pierre.newPage();
						
						System.out.println("| o _ o | \nSorry! I don't know what to do! Could you try entering it again?");
						
						try {
							Thread.sleep(4000);
						} catch (Exception e) {
							
						}
						
						Pierre.newPage();
						continue;
					}
				}
				
			}
			
		}
		
		// Once the loop ends, the program sends user back to the main menu
		Pierre.menu(scanner);
		
	}
	
	public static void animation() {
		// Animation that plays after a user picks rock, paper, or scissors
		System.out.println("| * - * | \nOk! Here we go!");
		
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			
		}
		
		Pierre.newPage();
		System.out.println("| - - - | \nRock!");
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			
		}
		
		Pierre.newPage();
		System.out.println("| ' - ' | \nPaper!");
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			
		}
		
		Pierre.newPage();
		System.out.println("| * o * | \nScissors!");
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			
		}
		
		Pierre.newPage();
		System.out.println("| ^ O ^ | \nShow!");
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			
		}
		
		Pierre.newPage();
	}

}
