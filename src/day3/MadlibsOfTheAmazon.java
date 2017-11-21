package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
JOptionPane.showMessageDialog(null, "If you find yourself haveing a to cross a piranah-infested river, here's how to do it...");
		// Get the user to enter an adjective
String Adjective = JOptionPane.showInputDialog("please enter an adjective");
		// Get the user to enter a type of liquid
String Liquid = JOptionPane.showInputDialog("please enter a liquid");
		// Get the user to enter a body part
String BodyPart = JOptionPane.showInputDialog("please enter a bodypart");
		// Get the user to enter a verb
String Verb = JOptionPane.showInputDialog("please enter a verb");
		// Get the user to enter a place
String Place = JOptionPane.showInputDialog("please enter a place");
		// Fit the user's words into this sentence, and save it in a String:

		
		// Make a pop-up for the final story. You can use \n to go to the next line
		
JOptionPane.showMessageDialog(null, "Piranhas are more" +Adjective+ " during the day, so cross the river at"
		 +"night. Piranhas are attracted to fresh " +Liquid+ " and will most "
		 +"likely take a bite out of your " +BodyPart+ " if you " +Verb+ ". Whatever "
		 +"you do, if you have an open wound, try to find another way to get "
		 +"back to the " +Place+ ". Good luck!");
	}
}

