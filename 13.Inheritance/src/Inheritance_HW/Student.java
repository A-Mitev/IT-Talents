package Inheritance_HW;

public class Student extends Person {

	private double score;

	Student(String name, int age, boolean isMale, double score){
		super(name, age, isMale);
		setScore(score);
	}





	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		if (score >= 2 && score <= 6) {
			this.score = score;
		} else {
			System.out.println("Wrong value for score.");
			this.score = 0;
		}
	}
	
	public void showStudentInfo(){
		this.showPersonInfo();
		System.out.println("Score - " + this.score);
	}

}
