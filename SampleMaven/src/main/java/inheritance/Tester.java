package inheritance;

public class Tester extends Employ {//multilevel inheritance
	String testername="arun";
	public void Test()
	{
		System.out.println(testername);
	}
	

	public static void main(String[] args) {
		Tester obj1=new Tester();
		obj1.Employnumber();
		obj1.Test();
		Developer obj=new Developer();
		obj.Employnumber();
		obj.company();
		

	}

}
