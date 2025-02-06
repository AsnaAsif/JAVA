package exception;

public class ArtheaticException {

	public static void main(String[] args) {
		int b=30;
		int s=b;
		System.out.println(s);
		try
		{
			int arr[]=new int[5];
			arr[8]=48;
			int e=s/0;
		
		}
		
		catch(ArithmeticException e)// for try handling always need catch handling. 
		{
		System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Multi catch exception");
		}
		
		
	  catch(Exception e)
	{
		System.out.println("Exception ");
	}
	finally
	{
		System.out.println("Finally handing");
	}
		
			
		
		System.out.println("arithmatic exceptn");
	}
}
