package inheritance;

public class Puppy extends Dog{
	String colour="brown";
	public void puppycolour()
	{
		System.out.println(colour);
	}

	public static void main(String[] args) {
		Puppy obj=new Puppy();
		obj.puppycolour();
		obj.dogage();
		obj.animalname();

	}

}
