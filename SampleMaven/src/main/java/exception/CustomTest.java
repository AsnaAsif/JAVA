package exception;

public class CustomTest {
	public static void lisence(int age) throws LisenceException
	{
		if(age<18)
		{
		throw new LisenceException("cannot apply for lisence");	
		}
		else
		{
			System.out.println("Eligible for Lisence");
		}
		
	}

	public static void main(String[] args) {
		try {
			lisence(9);
			}
		catch(LisenceException e)
		{
			System.out.println(e);
		}
	}

}
