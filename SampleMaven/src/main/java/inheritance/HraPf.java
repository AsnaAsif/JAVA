package inheritance;

public class HraPf extends Salaryconsole{
	int hra;
	int pf;
	public int hraPay()
	{
		hra=(basicpay*5)/100;
		return hra;
	}
	public int pfpay()
	{
	pf=(20*basicpay)/100;
	return pf;
	}
}
