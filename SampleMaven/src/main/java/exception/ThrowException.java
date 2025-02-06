package exception;

public class ThrowException {
public void sum(int a,int b)
{
	int s=a+b;
	if(s>50)
	{
		throw new ArithmeticException("ArithmeticException occured");
	}
	else
	{
		System.out.println("Sum is less than 50");
	}
		
}
	public static void main(String[] args) {
		ThrowException obj=new ThrowException();
		try {
		obj.sum(40,50);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of code");

	}

}
