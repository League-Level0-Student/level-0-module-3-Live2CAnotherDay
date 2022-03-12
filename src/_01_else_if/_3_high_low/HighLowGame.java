
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(101);
		int number = random;
		// 2. Print out the random variable above
		for (int x = 0; x <= 10; x = x + 1) {
			
			String Guess = JOptionPane.showInputDialog(null, "Guess a number between 1 - 100: ");
		// 11. Repeat steps 1 to 10 ten times
			int guess = Integer.parseInt(Guess);
			// 1. Ask the user for a guess using a pop-up window, and save their response 

			if (guess == number) {
				JOptionPane.showMessageDialog(null, "Congrats that was the correct answer");
				System.exit(0);
			
			}else if (guess > number) {
				JOptionPane.showMessageDialog(null, "The guess was too high");
			
			}else if (guess < number) {
				JOptionPane.showMessageDialog(null, "The guess was too low");
			
		}
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
		}	
		JOptionPane.showMessageDialog(null, "L Bozo you lost + Cope + Ratio");	// 5. if the guess is correct
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}


