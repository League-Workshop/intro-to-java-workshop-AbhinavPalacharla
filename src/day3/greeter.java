package day3;

import javax.swing.JOptionPane;

public class greeter {
public static void main(String[] args) { 
	String person = JOptionPane.showInputDialog("Enter your name");
	JOptionPane.showMessageDialog(null, "Hello "+person);
	
} 
}
