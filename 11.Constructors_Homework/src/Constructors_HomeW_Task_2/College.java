package Constructors_HomeW_Task_2;
public class College {

	public static void main(String[] args) {
		
		Student Alex = new Student("Alex", "Informatics", 24);
		Student Petya = new Student("Petya", "Java", 21);
		Student Qvor = new Student("Qavor", "cSharp", 29);
		Student Asen = new Student("Asen", "Biology", 32);
		Student Pavel = new Student("Pavel", "Php", 19);
		Student Atanas = new Student("Atanas", "Java", 31);
		Student Maria = new Student("Maria", "Java", 22);
		Student Nikol = new Student("Nikol", "cSharp", 24);
		
		Alex.money = 300;
		//System.out.println(Alex.grade);
		Alex.receiveScholarship(4.0, 800);
		System.out.println("Alex money - " + Alex.money);
		
		Asen.money = 250;
		Asen.receiveScholarship(3.5, 400);
		// Asen ne vzima stipendiq zashtoto e na 32. Egati diskriminaciqta :) !
		System.out.println("Asen money - " + Asen.money);
		
		
		//System.out.println(Petya.yearInCollege);
		Petya.upYear();
		System.out.println("Petya year in college - " + Petya.yearInCollege);
		Pavel.yearInCollege = 4;
		Pavel.upYear();
		
		StudentGroup java = new StudentGroup();
		StudentGroup cSharp = new StudentGroup();
		
		java.groupSubject = "Java";
		cSharp.groupSubject = "cSharp";
		
		java.addStudent(Petya);
		Petya.grade = 4.5;
		cSharp.addStudent(Qvor);
		java.addStudent(Atanas);
		java.addStudent(Maria);
		cSharp.addStudent(Nikol);
		System.out.println("Ostavashti svobodni mesta v grupa Java - " + java.freePlaces);
		
		
		System.out.println("The best student in the group " + java.groupSubject + " is " +  java.theBestStudent(java.students));
		System.out.println("Ostavashti svobodni mesta v " + java.groupSubject + " - " + java.freePlaces);
		java.printStudentsInGroup(java.students);
		
		java.emptyGroup();
		java.printStudentsInGroup(java.students);
	}
}
