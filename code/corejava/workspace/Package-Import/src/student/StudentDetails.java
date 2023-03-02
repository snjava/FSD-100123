package student;

public class StudentDetails {
	public int id;
	public String name;
	protected String email;
	 String contact;
	private String dob;
	
	public void print() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(contact);
		System.out.println(dob);
	}
}

class StudentAttendance extends StudentDetails {
	public void printByObject() {
		StudentDetails sd = new StudentDetails();
		System.out.println(sd.id);
		System.out.println(sd.name);
		System.out.println(sd.email);
		System.out.println(sd.contact);
		//System.out.println(sd.dob);
	}
	
	public void printByInheritance() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(contact);
		//System.out.println(dob);
	}
}








