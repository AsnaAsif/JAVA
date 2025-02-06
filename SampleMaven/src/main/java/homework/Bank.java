package homework;

public class Bank {
	private int pin;
	private String name;
	private int balance;
	private int accountnumber;
	private int withdraw;
	
	public void setter(int pin,String name,int balance,int accountnumber)
	{
	this.pin=pin;
	this.name=name;
	this.balance=balance;
	balance=balance-withdraw;
	this.accountnumber=accountnumber;
	}
	public void getter()
	{
		System.out.println("name:"+name);
		System.out.println("Account number"+accountnumber);
		System.out.println("pin number:"+pin);
		System.out.println("balance is"+balance);
		
	}
	int numb;
	public void check()
	{
		if(numb==1001)
		{
			System.out.println("your new pin number is"+numb);
		}
			else if(numb==1234)
			{
				System.out.println("your pin number"+numb);
				
			}
			else if(numb==1212)
			{
				System.out.println("your pin number"+numb);
			}
			else
			{
				System.out.println("invalid number");
			}
	}

}
/*/* Program to withdraw amount from an ATM 
 Class 1- Bank One method to set pin from „User‟ class and 
validate Pin in another method 
 [Valid pins – 1001, 1234, 1212] 
 Pin number should declared as private 
 Class 2 – User Get the pin from User*/