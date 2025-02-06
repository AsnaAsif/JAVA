package interfaceex;

public class Football implements Sports {
	public void game()
	{
		System.out.println("most popular sports are Football,cricket and Hockey");
		System.out.println("Print football");
	}



	public static void main(String[] args) {
		Sports obj;
		 obj=new Football();
		obj.game();
		obj=new Cricket();
		obj.game();
		obj=new Hockey();
		obj.game();

	}

}
