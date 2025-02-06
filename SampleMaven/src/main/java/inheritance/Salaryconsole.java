package inheritance;
import java.util.Scanner;
public class Salaryconsole {
	
	int basicpay;
	int deduction;
	int bonus;
	public void salarybasic()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your basic pay");
		basicpay=sc.nextInt();
		System.out.println("Enter your bonus");
		deduction=sc.nextInt();
		System.out.println("Enter your bonus");
		bonus=sc.nextInt();
		sc.close();		
		
	}

}
