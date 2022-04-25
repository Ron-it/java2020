/*
 * Element class
 * component element of a collection
 * this is done at pseudocode level, but
 * it's good for testing and practice
 * 
 * Wrapper classes: Integer, Character, Double, etc.
 * Tutorial about generics: https://youtu.be/K1iu1kXkVoA
 */


public class Element <T> // <T> = generics;
{
	private T data; // can also be a number, String, array, etc.
	private Element next;// for numbers use the wrapper classes
	
	public Element() { }
	
	public Element(T data)
	{	this.data = data;
		this.next = null;
	}
	
	public boolean hasNext()
	{	return this.next != null;
	}
	
	public Element getNext()
	{	return this.next;
	}
	
	public T getData()
	{	return this.data;
	}
	
	public void setNext(Element e)
	{	this.next = e;
	}
	
	public void setData(T data)
	{	this.data = data;
	}
	
	public String toString()
	{	return this.data.toString();
	}
	
}

