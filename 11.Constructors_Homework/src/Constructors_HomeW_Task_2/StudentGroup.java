package Constructors_HomeW_Task_2;
public class StudentGroup {
	
	String groupSubject= "";
	Student[] students;
	int freePlaces;
	
	StudentGroup(){
		this.students = new Student[5];
		this.freePlaces = 5;
	}
	
	StudentGroup(String subject){
		this();
		this.groupSubject = subject;
	}
	
	void addStudent(Student s){
		if (s.subject.equals(this.groupSubject) && (this.freePlaces > 0)){
			this.students[students.length-this.freePlaces] = s;
			this.freePlaces--;
		}
	}
	
	void emptyGroup(){
		this.students = new Student[5];
		this.freePlaces = 5;
	}
	
	String theBestStudent(Student[] students){
		double maxGrade = 0;
		String nameOfTheBest = "";
		for (int index = 0; index < students.length - freePlaces; index++) {
			if (students[index].grade > maxGrade){
				maxGrade = students[index].grade;
				nameOfTheBest = students[index].name;
			}
		}
		return nameOfTheBest;
	}
	
	void printStudentsInGroup(Student[] students){
		if(this.freePlaces > 4){
			System.out.println(" Students group is empty!");
			return;
		}
		for (int index = 0; index < students.length-freePlaces; index++) {
			System.out.println("Name - " + students[index].name + "\n" + "Subject - " + students[index].subject + "\n" +
					"Grade - " + students[index].grade + "\n" + "Year in college - " + students[index].yearInCollege + "\n" +
					"Age - " + students[index].age + "\n" + "Is degree - " + students[index].isDegree + "\n" +
					"Money - " + students[index].money + "\n" + "---------"  );
		}
	}
}
