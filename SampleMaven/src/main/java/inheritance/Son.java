package inheritance;

public class Son extends Father{
	public void sonfamily()
	{
		System.out.println("son family");
	}

	public static void main(String[] args) {
		Son obj1=new Son();
		
		obj1.sonfamily();
		obj1.fatherFamily();
		obj1.familyHead();
		
		Daughter obj2=new Daughter();
		obj2.daughterFamily();
		obj2.familyHead();
		obj2.fatherFamily();
	}

}
