package tayari;

import javax.swing.*;
import java.util.Scanner;

/**
 * 
 * @author shardulkulkarni
 * sample to create input dialog box to accept value from user.
 *
 */

public class GetInputs {
	
	public static void main(String args[]) {
		
		// Scanner example
		Scanner input = new Scanner(System.in);
		System.out.print("Enter something > ");
		String inputString = input.nextLine();
		input.close();
		
		System.out.print("You entered : ");
		System.out.println(inputString);

		// JOptionPane example
		String JOptionPaneInput = JOptionPane.showInputDialog(null, "Enter some text:");
		JOptionPane.showMessageDialog(null, "You entered " + JOptionPaneInput);
	}
	
}