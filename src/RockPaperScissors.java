import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	static Random random = new Random();
	
	public static void game(Scanner scanner) {
		boolean running = true;
		
		String userInput;
		int cpuChoice;
		
		
		while (running) {
			cpuChoice = random.nextInt(1,4);
			System.out.println("| ^-^ | \nEnter Rock, Paper, or Scissors!");
			userInput = scanner.nextLine();
			userInput = userInput.toLowerCase();
			
			Pierre.newPage();
			RockPaperScissors.animation();
			Pierre.newPage();
			
			if (userInput.contains("rock")) {
				
				if (cpuChoice == 1) {
					System.out.println("| * o * | \nIt's a tie! We both chose Rock!");
				} else if (cpuChoice == 2) {
					System.out.println("| ^-^ | \nI win! I chose Paper!");
				} else if (cpuChoice == 3) {
					System.out.println("| -_- | \nYou win! I chose Scissors!");
				}
				
			}
			
			if (userInput.contains("paper")) {
				
				if (cpuChoice == 1) {
					System.out.println("| -_- | \nYou win! I chose Rock!");
				} else if (cpuChoice == 2) {
					System.out.println("| * o * | \nIt's a tie! We both chose Paper!");
				} else if (cpuChoice == 3) {
					System.out.println("| ^-^ | \nI win! I chose Scissors!");
				}
				
			}
			
			if (userInput.contains("scissors")) {
				
				if (cpuChoice == 1) {
					System.out.println("| ^-^ | \nI win! I chose Rock!");
				} else if (cpuChoice == 2) {
					System.out.println("| -_- | \nYou win! I chose Paper!");
				} else if (cpuChoice == 3) {
					System.out.println("| * o * | \nIt's a tie! We both chose Scissors!");
				}
			}
			
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
				
			}
			
			Pierre.newPage();
			System.out.println("| - o - | \nWould you like to do it again?");
			userInput = scanner.nextLine();
			userInput = userInput.toLowerCase();
			Pierre.newPage();
			
			if (userInput.contains("yes")||userInput.contains("yeah")||userInput.contains("sure")||userInput.contains("yup")||userInput.contains("yuh")) { // More inputs could be added here
				System.out.println("| ^ - ^ | \nYay! Let's do it!");
				
				try {
					Thread.sleep(4000);
				} catch (Exception e) {
					
				}
				
				Pierre.newPage();
				
				continue;
				
			} else if (userInput.contains("no")||userInput.contains("nah")||userInput.contains("nope")) { // More inputs could be added here
				System.out.println("| U - U | \nOk, Going back to the menu!");
				
				try {
					Thread.sleep(4000);
				} catch (Exception e) {
					
				}
				
				Pierre.newPage();
				break;
			}
		}
		
		Pierre.menu(scanner);
		
	}
	
	public static void animation() {
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
