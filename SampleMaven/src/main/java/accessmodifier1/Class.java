package accessmodifier1;

public class Class {
	 protected int age=34;
	protected void sum()
	{
		System.out.println(age);
	}

	public static void main(String[] args) {
		Class obj=new Class();
		obj.sum();

	}

}
