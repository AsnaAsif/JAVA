package SuperKeyword;
public class Class2 extends Class1 {
	String colour="Red";
	public Class2(String name)
	{
		super("asna");
		System.out.println("Child Constructorclass1");
	}
	
	public void details()
	{
		
		super.details();
		System.out.println("child class method");
		System.out.println(colour);
		System.out.println(colour);
	}

	public static void main(String[] args) {
		Class2 obj=new Class2("asna");
		obj.details();
		

	}

}
