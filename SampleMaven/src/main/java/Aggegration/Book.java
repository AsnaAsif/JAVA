package Aggegration;

public class Book {
	String storyname;
	String content;
	String charachers;
	Author add;
	public Book(String storyname,String content,String charachers,Author add)
	{
		this.storyname=storyname;
		this.content=content;
		this.charachers=charachers;
		this.add=add;		
	}

	public void details()
	{
		System.out.println("Name of book :"+storyname);
		System.out.println("content of story"+content);
		System.out.println("charachers are:"+charachers);
		System.out.println("name of author"+add.name);
		System.out.println("age :"+add.age);
		System.out.println("name of book written"+add.namebook);
		
	}
	public static void main(String args[])
	{
		Author obj=new Author("vaykom mohamed basheer",68,"fathimayude aadu");
		Book obj1=new Book("entee uppupakku oru anna undayirunu","comedy and drama","aanabasheer",obj);
		obj1.details();
	}

		
	}
