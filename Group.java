/*
 * @Author: Anthony Watanab
 * CS 356
 */

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class Group extends Component 
{
	Set<Component> elements;
	
	public Group()
	{
		elements = new TreeSet<Component>();
	}
	
	public Group(String id)
	{
		this();
		ID = id;
	}
	
	public boolean add(Component newElement)
	{
		return elements.add(newElement);
	}
	
	public boolean remove(Component element)
	{
		return elements.remove(element);
	}
	
	public int size()
	{
		int sum = 0;
		Iterator<Component> iter = elements.iterator();
		while (iter.hasNext())
		{
			sum += ((Component)(iter.next())).size();
		}
		return sum;
	}
}
