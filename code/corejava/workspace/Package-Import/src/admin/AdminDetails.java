package admin;
import student.StudentDetails; // import a specific class from the package
import teacher.*;  // import all the classes from the package
public class AdminDetails extends StudentDetails {
	public void printDetails() {
		//student.StudentDetails sd = new student.StudentDetails();
		StudentDetails sd = new StudentDetails();
		TeacherDetails td = new TeacherDetails();
	}
	
	public void printByObject() {
		StudentDetails sd = new StudentDetails();
		System.out.println(sd.id);
		System.out.println(sd.name);
		//System.out.println(sd.email);
		//System.out.println(sd.contact);
		//System.out.println(sd.dob);
	}
	
	public void printByInheritance() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		//System.out.println(contact);
		//System.out.println(dob);
	}
}
