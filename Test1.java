package Tester;

import first.Person;
import first.Student;
import first.Faculty;

class Test1 {

	public static void main(String[] args) {

		Student s1 = new Student("Tilak", "Shelke", 8, "Java", 15000, 98);
		System.out.println(s1);
		System.out.println("                          ");
		Person p;
		p=s1;
		System.out.println(p);
		p= new Faculty("Pooja ", "Google", 15, "DBMS,javaScript");
		System.out.println(p);
	}

}
