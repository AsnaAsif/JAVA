package exception;
//unchecked
public class Throws {
	public static void m() throws ArithmeticException
	{
		throw new ArithmeticException();
	}

	public static void main(String[] args) {
		m();

	}

}
