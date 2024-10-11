package inheritance;

public class Car extends Vehicle{
	int Milage=7000;
	public void honda()
	{
		System.out.println("child class method");
	}

	public static void main(String[] args) {
		Car obj=new Car();
		obj.honda();
		obj.run();
		System.out.println(obj.Milage);
		System.out.println(obj.speed);
		

	}

}
