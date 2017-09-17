//Your Name
//HW5 - Java I
//Date

import javax.swing.JOptionPane;
import java.text.*;
public class Charactergen {

	// This is the main method
	public static void main(String[] args) 
	{
		// Declare variables
		final double BASE_CURRENCY = 10.55;
		final int BASE_HEALTH = 50;
		int minHealthBonus = 1;
		int maxHealthBonus = 5;
		String cName;
    
		// Create a new character object named human
		Character human = new Character();

		// Use the Character class method to SET the character's name by prompting the user to enter a character name
		human.setCharName(JOptionPane.showInputDialog(null,"Enter your character's name: ", "Welcome to Legendary Epics!", JOptionPane.QUESTION_MESSAGE));

		// ***** Use the Character class method to SET the character's role by calling the roleSelect method, passing an integer that returns a string)
		
		//This String is only used in the immediate following method call
		String selectMessage = "Enter a number that represents your desired character class. 1-Barbarian 2-Magician 3-Celtic 4-Rogue:";
		human.setCharRole(roleSelect(JOptionPane.showInputDialog(null, selectMessage, "Welcome to Legendary Epics!", JOptionPane.QUESTION_MESSAGE)));

		// Use the Character class method to SET the character's health by calling the calculateHealth method, passing BASE_HEALTH, minHealthBonus, and maxHealthBonus as parameters
		human.setHealth(calculateHealth(BASE_HEALTH, minHealthBonus, maxHealthBonus));	

		// Use the Character class method to SET the character's currency by calling the setCurrency method, passing BASE_CURRENCY as a parameter
		human.setCurrency(calculateCurrency(BASE_CURRENCY));

		// Call the displayOutput Method by passing the values of character name, role, starting health, and starting currency through the Character class GETTER methods
		// ***** Modify the line below to add the role.
		displayOutput(human.getCharName(), human.getHealth(), human.getCurrency(), human.getCharRole());
	
	}

	// ***** Create a Method called roleSelect() here that sets the character's role, using a switch statement.
	

	public static String roleSelect(String selectedRole) {
		String Role = "Barbarian";
		//Switch Case to Determine Role
		switch (Integer.ParseInt(selectedRole)) {
			case 1:
				Role = "Barbarian";
				break;
			case 2:
				Role = "Magician";
				break;
			case 3:
				Role = "Celric"; 
				break;
			case 4:
				Role =  "Rogue";
				break;
			default:
				Role = "Barbarian";
		}

		return Role;
	}



	// This method calculates the starting health of the character by accepting 3 parameters
	public static int calculateHealth(int bh, int minhb, int maxhb)
	{
		int health = bh + minhb + (int)(Math.random() * maxhb);
		return health;
	}	

	// This method calculates the starting credits of the character by accepting one parameter
	public static double calculateCurrency(double cash)
	{
		//Compute Currency
		double startCurrency = cash - Math.random(); 
		return startCurrency;
	}	

	// This method displays the output to the user
	// ****** Modify the method header below so that it also accepts the Character's role as an input parameter.

	public static void displayOutput(String charName, int startHealth, double startCurrency, String charRole)
	{
		// Create a new decimal format to truncate double output
		DecimalFormat df = new DecimalFormat("#.##");  

		// Display output to the user
		// ***** Modify the code below so that it also display's the character's class.
		JOptionPane.showMessageDialog(null,"Your name is " + charName + " the " + charRole + ", your starting health is " + startHealth+ ", and your starting credits are " + Double.valueOf(df.format(startCurrency))+ ".", "Your Character Stats", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}