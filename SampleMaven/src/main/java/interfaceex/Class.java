package interfaceex;

public class Class implements sampleinterface {
	public void display()
	{
		System.out.println("1st abstract method "+Max);
		
	}
	public void show()
	{
		System.out.println("2nd abstract method"+D);
	}
	

	public static void main(String[] args) {
		sampleinterface obj=new Class();
		obj.display();
		obj.show();

	}

}
