import java.lang.*;
import java.util.*;


public class CustomSortArrayList {

	public static void main(String[] args)
	{
		CustomSortArrayList csa = new CustomSortArrayList();
		
		ArrayList<Cat> listOfCats = new ArrayList<Cat>();
		
		Cat Cat1 = csa.new Cat("Tommy", 6, "White");
		Cat Cat2 = csa.new Cat("Tiger", 4, "Brown");
		Cat Cat3 = csa.new Cat("Tinku", 2, "Black");
		Cat Cat4 = csa.new Cat("Alpha", 3, "Red");
		Cat Cat5 = csa.new Cat("Beta", 7, "Gray");
		Cat Cat6 = csa.new Cat("Charlie", 5, "Pink");
		Cat Cat7 = csa.new Cat("Catgy", 4, "Purple");
		Cat Cat8 = csa.new Cat("Fannie", 3, "Black");
		Cat Cat9 = csa.new Cat("Eamore", 2, "White");
		Cat Cat10 = csa.new Cat("Glaring", 1, "Brown");
		
		listOfCats.add(Cat1);
		listOfCats.add(Cat2);
		listOfCats.add(Cat3);
		listOfCats.add(Cat4);
		listOfCats.add(Cat5);
		listOfCats.add(Cat6);
		listOfCats.add(Cat7);
		listOfCats.add(Cat8);
		listOfCats.add(Cat9);
		listOfCats.add(Cat10);
		
		System.out.println("Before Sort :");
		
		for (Cat d: listOfCats)
		{
			d.describeCat();
		}
		
		CatCompareByName comp1 = csa.new CatCompareByName();
		Collections.sort(listOfCats, comp1);
		
		System.out.println("");
		System.out.println("Sort by Name :");
		for (Cat d: listOfCats)
		{
			d.describeCat();
		}
		
		CatCompareByAge comp2 = csa.new CatCompareByAge();
		Collections.sort(listOfCats, comp2);
		
		System.out.println("");
		System.out.println("Sort by Age :");
		for (Cat d: listOfCats)
		{
			d.describeCat();
		}
	}
	
	class Cat
	{
		//Private variables
		private String name;
		private int age;
		private String color;
		
		//Get & Set Methods
		public String getName(){
			return this.name;
		}
		
		public void setName(String name){
			this.name = name;
		}

		public int getAge(){
			return this.age;
		}
		
		public void setAge(int age){
			this.age = age;
		}
		
		public String getColor(){
			return this.color;
		}
		
		public void setColor(String color){
			this.color = color;
		}
		
		//Constructors
		public Cat()
		{
			this.name = "";
			this.age = 0;
			this.color = "";
		}
		
		public Cat(String name, int age, String color)
		{
			this.name = name;
			this.age = age;
			this.color = color;
		}
		
		//Methods
		public void describeCat()
		{
			System.out.println("Name: " + this.name + " - " + "Age: " + this.age + " - " + "Color: " + this.color);
		}
		
		public void makeNoice()
		{
			if (this.age >= 5)
				System.out.println("Name : " + this.name + " " + "Noice : MMeeyoy! MMeeyoy!");
			else if (this.age >= 3)
				System.out.println("Name : " + this.name + " " + "Bark : Meeeow! Meeeow!");
			else if (this.age < 3)
				System.out.println("Name : " + this.name + " " + "Meew : ! Meew!");
		}
		
	}
	
	public class CatCompareByName implements Comparator<Cat>
	{
		@Override
		public int compare(Cat c1, Cat c2)
		{
			return c1.name.compareTo(c2.name);
		}
	}
	
	public class CatCompareByAge implements Comparator<Cat>
	{
		@Override
		public int compare(Cat c1, Cat c2)
		{
			return c1.age - c2.age;
		}
	}

}
