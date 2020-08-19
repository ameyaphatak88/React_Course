package collegedatabaseapp;
import java.util.Scanner;
import java.util.*;

public class Student {
	private String firstName;
	private String lastName;
	private String studentId;
	private String year;
	private int division;
	Vector subjects = new Vector();
	Hashtable marks_distribution = new Hashtable();
	
	
	public void input_data() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter first name");
		this.firstName = in.nextLine();
		
		System.out.print("Enter last name");
		this.lastName = in.nextLine();
		
		System.out.print("Enter student id");
		this.studentId = in.nextLine();
		
		System.out.print("Enter year");
		this.year = in.nextLine();
		
		System.out.print("Enter division");
		this.division = in.nextInt();
	}
	
	public void assignSubjects() {
		
		if(this.year.equals("FE")) {
			subjects.addElement("BXE");
			subjects.addElement("PHYSICS");
			subjects.addElement("CHEMISTRY");
			subjects.addElement("MATHS 1");
		}
		
		if(this.year.equals("SE")) {
			subjects.addElement("DSA");
			subjects.addElement("OOP");
			subjects.addElement("DELD");
			subjects.addElement("DM");
		}
		
		if(this.year.equals("TE")) {
			subjects.addElement("SDL");
			subjects.addElement("DBMS");
			subjects.addElement("CN");
			subjects.addElement("TOC");
		}
		
		if(this.year.equals("BE")) {
			subjects.addElement("WEB DEVELOPMENT");
			subjects.addElement("AI");
			subjects.addElement("DATA ANALYSIS");
			subjects.addElement("DEEP LEARNING");
		}
	}
	
	public void display_subjects() {
		Enumeration e;
		e = subjects.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
