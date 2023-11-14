package Tester;

import first.Person;
import first.Student;
import first.Faculty;

import java.util.Scanner;

public class EventOrganies {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("checking the max capacity ");
		Person[] participant =new Person[sc.nextInt()];
		int counter=0;
		boolean exit=false;
		while(!exit)
		{
			
			System.out.println("Option  1.Student Registraion 2.Facuilty Registraion  3. Display the participants  10.exit");
			System.out.println("enter the choice ");
			switch(sc.nextInt()) {
			
			
			case 1:
			{if(counter<participant.length) {
				System.out.println("Enter the Student Deatils Fn,Ln,Grade,Course,Fees,Marks");
				participant[counter++]= new Student(sc.next(), sc.next(), sc.nextInt(),sc.next(), sc.nextInt(), sc.nextInt());
			System.out.println("student registered Successful");
			}else
			
				System.out.println("event full plz try again at necxt event");
			}
				break;
			
			case 2:
			{if(counter<participant.length) {
				System.out.println("Enter the Faculty Deatils Fn,Ln,YearOfExp,sme");
				participant[counter++]= new Faculty(sc.next(), sc.next(), sc.nextInt(),sc.next());
				System.out.println("Faculty registered Successful");
			}else
			
				System.out.println("event full plz try again at necxt event");
			}
				break;
			
			case 3:
			{
				System.out.println("participants details ..");
				for(Person p : participant)
					if(p!=null) {
						System.out.println(p);
					}
					
			}
				break;
			
			case 10:
			{
				exit=true;
			
			}
			break;
			}
			
	
		}
		sc.close();	
	}

}
