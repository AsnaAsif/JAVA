package inheritance;

public class TotalSalary extends HraPf {
	int tlslry;
	public void total()
	{
		tlslry=(basicpay+hra-pf-deduction+bonus);
		System.out.println("total salary:"+tlslry);
	}

	public static void main(String[] args) {
		TotalSalary obj1=new TotalSalary();
		obj1.salarybasic();
		obj1.hraPay();
		obj1.pfpay();
		obj1.total();

	}

}

