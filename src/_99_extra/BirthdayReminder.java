
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
		
		// 1. correct the birthdays for your family below
		String momsBirthday = "Stalker";
		String dadsBirthday = "Huh";
		String myBirthday = "Why are you so interested in knowing people's birthdays?";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String variable = JOptionPane.showInputDialog("Hello, to search for someone's birthday, just input their names in here: ");
		// 3. Print out what the user typed
		if (variable.equalsIgnoreCase("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}else if (variable.equalsIgnoreCase("dad") ) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}else if (variable.equalsIgnoreCase("me")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}else{
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday. Goodbye.");
		}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
