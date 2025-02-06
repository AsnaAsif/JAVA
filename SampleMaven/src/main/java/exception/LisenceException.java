package exception;

public class LisenceException extends Exception{
	public LisenceException(String s)
	{
	super(s);
		System.out.println("LIsence Expired");
	}

}
