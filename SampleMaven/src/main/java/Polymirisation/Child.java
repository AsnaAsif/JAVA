package Polymirisation;

public class Child extends Parent{
	public void method1(int c,int d)
	{
		int s=c+d;
		System.out.println("child sum is"+s);
		super.method1(50, 50);
	}
	

	public static void main(String[] args) {
		Parent obj=new Child();//upcasing
		obj.method1(67, 10);
		

	}

}
