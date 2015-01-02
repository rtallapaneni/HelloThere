/**
 * 
 */

/**
 * @author Raju
 *
 */
public class TestDriveDog {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog[] PetDogs = new Dog[3];
	
		PetDogs[0] = new Dog(6, "Tommy", "White");
		PetDogs[1] = new Dog(4, "Tiger", "Brown");
		PetDogs[2] = new Dog(2, "Tinku", "Black");
		
		for (int i=0; i<PetDogs.length; i++)
		{
			PetDogs[i].Describe();
			PetDogs[i].Bark();
		}
	}

}
