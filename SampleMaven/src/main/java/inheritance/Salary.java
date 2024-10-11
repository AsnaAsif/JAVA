package inheritance;
import java.util.Scanner;
public class Salary{
	int basicpay;
	int deduction;
	int bonus;
	
	public  void salaryconsole()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter basic pay");
	basicpay=sc.nextInt();
	System.out.println("Basic Salary of employ : "+basicpay);
	
	System.out.println("Enter deduction amount");
	deduction=sc.nextInt();
	System.out.println("Deduction Amount : "+deduction);
	
	System.out.println("Enter bonus");
	bonus=sc.nextInt();
	System.out.println("Bonus Amount : "+bonus);
sc.close();
	}
	
}
