import java.lang.*;
import java.util.*;

public class HandsOnArrayList {

	public static void main(String[] args)
	{
		ArrayList<String> strArrayList = new ArrayList<>();
		
		//Adding elements to the ArrayList
		strArrayList.add(new String("First"));
		strArrayList.add(new String("Second"));
		strArrayList.add(new String("Third"));
		strArrayList.add(new String("Fourth"));
		strArrayList.add(new String("Fifth"));
		strArrayList.add(new String("Sixth"));
		strArrayList.add(new String("Seventh"));
		strArrayList.add(new String("Eighth"));
		strArrayList.add(new String("Nineth"));
		strArrayList.add(new String("Tenth"));
		
		//Looping through all the elements in the ArrayList
		for (String str : strArrayList)
		{
			System.out.println(str);
		}
		
		//Checking for existence of a particular element
		if (strArrayList.contains("blah"))
			System.out.println("Found the element");
		else
			System.out.println("Element not found");
		
		//Size of the ArrayList
		System.out.println("Size of the ArrayList is : " + strArrayList.size());
		
		//TODO: Removing alternate elements of an ArrayList
		//Research the best method to remove alternative elements in an 
		
		//Simple Sorting of an ArrayList
		ArrayList<String> listForSorting = new ArrayList<String>();
		listForSorting.add("aaa");
		listForSorting.add("abc");
		listForSorting.add("bbc");
		listForSorting.add("bba");
		listForSorting.add("bac");
		listForSorting.add("cab");
		listForSorting.add("cba");
		listForSorting.add("ccb");
		listForSorting.add("bbb");
		listForSorting.add("ccc");
		
		Collections.sort(listForSorting);
		//Looping through all the elements in the ArrayList
		for (String str : listForSorting)
		{
			System.out.println(str);
		}		
	}
}
