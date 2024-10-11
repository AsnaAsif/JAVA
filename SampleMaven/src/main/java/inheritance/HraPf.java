package inheritance;

public class HraPf extends Salary{
	int hra;
	int pf;
	public float hraPay()
	{
		hra=(basicpay*5)/100;
		return hra;
	}
	public float pfPay()
	{
		pf=(basicpay*20)/100;
		return pf;
	}
		
}

	
	

