package abstractmethod;

public class ChildClassAbstract extends AbstractClass {
	public void print()
	{
		System.out.println("Abstract method body should be in child class");
		
	}
	public void display()
	{
		System.out.println("Abstract method body should be in child class");
	}

	public static void main(String[] args) {
		ChildClassAbstract obj=new ChildClassAbstract();
		obj.print();
		obj.display();
		obj.show();

	}

}
