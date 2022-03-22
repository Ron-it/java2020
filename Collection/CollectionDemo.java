import java.util.*;

public class CollectionDemo
{
	
	public static void main (String[] args)
	{
		Collection list = new Collection();
		list.add("Joe");
		list.add("Adam");
		list.add("James");
		list.add("Bob");
		System.out.println("Collections SL Demo");
		System.out.println(list + "\n");
		
		list.resetNext();
		int size = 0;
		
		while( list.hasNext() )
		{	System.out.println( list.getNext() );
			size++;
		}
		System.out.println(size);
		Object[] names = new String[size];
		list.resetNext();
		for(int i = 0; i < size; i++)
		{	names[i] = list.getNext();
		}
		System.out.println("Collection to array");
		// don't use this shortcut in exams, use a loop to traverse
		// through the array. Useful to show you that the Arrays class
		// has a static toString method to print an array, though!
		System.out.println( Arrays.toString(names) );
	}
}

