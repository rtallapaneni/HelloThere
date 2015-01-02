/**
 * 
 */

/**
 * @author Raju
 *
 */
public class Dog {
	
	int Age;
	String Name;
	String Color;
	
	Dog(int pAge, String pName, String pColor)
	{
		this.Age = pAge;
		this.Name = pName;
		this.Color = pColor;
	}
	
	Dog()
	{
		this.Age = 0;
		this.Name = "Unspecified";
		this.Color = "Unspecified";
	}
	
	public void Describe()
	{
		System.out.println("My name is " + this.Name + ". I am " + this.Age + "years old " + this.Color + " Dog.");
	}
	
	public void Bark()
	{
		if (this.Age > 5)
			System.out.println("Woof! Woof! Woof!");
		else if (this.Age > 3)
			System.out.println("Ruf! Ruf! Ruf!");
		else
			System.out.println("Yip! Yip! Yip!");
		
		System.out.println("");
	}

}
