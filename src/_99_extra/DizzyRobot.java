
package _99_extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("How many times do you want to make this robot spin? ( From 1 to 10 ): ");
		// 1. Use the dance method below to make the robot spin.		
		// 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
		int numberOfSpins = Integer.parseInt(number);
		dance(numberOfSpins);
	}

	/*****************   Use this method, DON'T CHANGE THE CODE BELOW  **************/
	
	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.turn(360);
		}
	}
}

