package exceptionfiles;

public class CommonExceptions 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Program is starting");
		int a = 5;
		int b = 0;
		
		//1. Identify the potential problem
		//2. Surround with try-catch block
		try 
		{
			int c = a/b;	
		}
		catch(ArithmeticException e)
		{
			System.out.println("CANNOT DIVIDE BY ZERO");
			System.out.println(e.toString());
		}
		
		String[] states = {"CA", "NY", "TX", "FL"};
		for(int i = 0; i <=states.length;i++)
		{
			try 
			{
				System.out.println(states[i]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ERROR: Index outside of array domain");
				System.out.println(e.toString());
			}
		}
		System.out.println("Program is closing");
		

	}

}
