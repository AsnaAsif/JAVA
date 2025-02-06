package encapsulation;

public class Bank {
	private String name;
	private int balance;
	private int accountnumber;
	public void setter(String name,int balance,int accountnumber)
	{
		this.name=name;
		this.balance=balance;
		this.accountnumber=accountnumber;
	}
	public void getter()
	{
		System.out.println("Name:"+name);
		System.out.println("Balance:"+balance);
		System.out.println("Account number:"+accountnumber);
		
	}
	

}
