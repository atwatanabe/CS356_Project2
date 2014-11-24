/*
 * @Author: Anthony Watanab
 * CS 356
 */

import java.util.Observable;
import java.util.Observer;


public class Component extends Observable implements Observer, Comparable<Component>
{
	protected String ID;
	
	public Component()
	{
		ID = "";
	}
	
	public Component(String id)
	{
		ID = id;
	}
	
	
	@Override
	public void update(Observable arg0, Object arg1) 
	{
		
	}

	protected String getID()
	{
		return ID;
	}
	protected void setID(String newID)
	{
		ID = newID;
	}
	
	public int size()
	{
		return 1;
	}
	
	public int compareTo(Component other)
	{
		return ID.compareTo(other.getID());
	}
	
}
