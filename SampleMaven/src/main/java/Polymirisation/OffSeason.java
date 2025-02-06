package Polymirisation;

public class OffSeason {
	int pant;
	int top;
	int total;
	float discountAmount;
	public void discount(int pant,int top)
	{
		total=pant+top;
		discountAmount=(total*15)/100f;
		System.out.println("Discount price during offseason "+discountAmount);
		
		
	}
	

}
