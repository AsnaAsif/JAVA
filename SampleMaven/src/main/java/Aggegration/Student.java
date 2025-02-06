package Aggegration;

public class Student {
	String name;
	int admissionnumber;
	int cls;
	Address add;
	
	public Student(String name,int admissionnumber,int cls,Address add)
{
	this.name=name;
	this.admissionnumber=admissionnumber;
	this.cls=cls;
	this.add=add;
}
	public void details()
	{
		System.out.println("name is"+name);
		System.out.println("Admission number is"+admissionnumber);
		System.out.println("class is"+cls);
		System.out.println("HOUSE NUMBER IS"+add.housename);
		System.out.println("house no:"+add.housenumber);
		System.out.println("state is"+add.state);
	}

	public static void main(String args[])
	{
	Address obj=new Address("ERALATHAYIL HOUSE",234,"KERALA");
	Student obj1=new Student("hezza",1234,2,obj);
	obj1.details();
	
}
}
