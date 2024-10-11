package inheritance;

public class TotalSalary extends HraPf{
	int totalamount;
	public void total()
	{
	totalamount=(basicpay+hra-pf-deduction+bonus);
	System.out.println("Total salary : "+totalamount);
	

	}

	public static void main(String[] args) {
		TotalSalary obj2=new TotalSalary();
		obj2.total();
		obj2.allowance();
		

		
		
		
		

	}

}
