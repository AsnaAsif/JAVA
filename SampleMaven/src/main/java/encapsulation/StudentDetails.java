package encapsulation;

public class StudentDetails {

	public static void main(String[] args) {
		Student obj=new Student();
	obj.setName("Asna");
	System.out.println(obj.getName());
	obj.setEmail("asna368@gmail.com");
	System.out.println(obj.getEmail());
	obj.setDepartment("Electronics");
	System.out.println(obj.getDepartment());
	}

}
