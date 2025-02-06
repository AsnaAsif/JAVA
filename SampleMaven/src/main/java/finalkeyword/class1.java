package finalkeyword;

public final class class1 { //final class cannot be extended it
	final int A=10;
	final int B;//blank final variable or uninitialized final variable
    public class1()
    {
    	B=20;//blank final variable initialized in constructor only
    	
    }
    
    public final void method1()
    {
    	System.out.println("Final method");//if method declared as final we cannot override it
    	
    }
	public static void main(String[] args) {
		

	}

}
