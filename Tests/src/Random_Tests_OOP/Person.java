package Random_Tests_OOP;

public class Person {
	String name;
	int age;
	
	Person friend;
	
	void printPErsonDetails(Person p){
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.friend.age);
		System.out.println(this.friend.name);
	}
}
