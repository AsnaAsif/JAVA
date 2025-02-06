package Polymirisation;

public class SBI extends Bank {
	int deposit=5600;
	public void interst()
	{
		float interst=deposit*(0.8f);
				System.out.println("interst of SBI:"+interst);
				super.interst();//to call parent
				}

	public static void main(String[] args) {
		Bank b;//parent class named b
		b=new SBI();//upcasting
		b.interst();
		
		
		b=new Hdfc();
		b.interst();

	}

}
