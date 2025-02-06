package Polymirisation;

public class OnSeason extends OffSeason{

	public void discount(int pant,int top)
	{
		int total=pant+top;
		float discountAmount=(total*40)/100f;
		System.out.println("discount price during onseason"+discountAmount);
		super.discount(6000, 4000);//to call parent
		
		
	}
	public static void main(String[] args) {
		OffSeason obj=new OnSeason();//upcasting
		obj.discount(3500, 6000);//child class call
		
		
	
	

	}

}
