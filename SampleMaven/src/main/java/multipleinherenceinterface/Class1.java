package multipleinherenceinterface;

public class Class1 implements Interface1,Interface2{
	public void display()
	{
		System.out.println("interface1"+Max);
	}
	public void show()
	{
		System.out.println("interface2"+D);
	}

	public static void main(String[] args) {
		Class1 obj=new Class1();
		obj.display();
		obj.show();

	}

}
