/*
 * @Author: Anthony Watanabe
 * CS 356
 * 
 * This class controls and has access to the Mini Twitter service
 * 
 * AdminPortal follows the Singleton design pattern
 */
public class AdminPortal 
{
	private Group root;
	private static AdminPortal instance;
	
	public static AdminPortal getInstance()
	{
		return (instance != null) ? instance : new AdminPortal();
	}
	
	private AdminPortal()
	{
		root = new Group();
	}
	
	public int numUsers()
	{
		return root.size();
	}
}
