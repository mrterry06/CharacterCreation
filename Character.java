//Your Name
//HW5 - Java I
//Date

// This is a class definition for the Character class.

public class Character
{
	// Declare instance variables

	private String charName;
	private int startHealth;
	private double startCurrency;
	// **** Add a string variable named charRole

	// Declare object methods, getters and setters for character name, health, and currency

	// ****** Add a setter named setCharRole

	// ****** Add a getter named getCharRole


	public void setCharName(String cName)
	{
		charName = cName;
	}

	public String getCharName()
	{
		return charName;
	}	
	
	public void setHealth(int health)
	{
		startHealth = health;
	}

	public int getHealth()
	{
		return startHealth;
	}

	public void setCurrency(double currency)
	{
		startCurrency = currency;
	}

	public double getCurrency()
	{
		return startCurrency;
	}
}