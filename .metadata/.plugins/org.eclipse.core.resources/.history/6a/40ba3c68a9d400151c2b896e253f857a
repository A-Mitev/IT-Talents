package Task3Scheduler;

public class Task implements ITask {

	private String Name;
	private static int id = 0;
	private int number;

	public Task(String name) {
		setName(name);
		id++;
		number = id;

	}

	public String getName() {
		return Name;
	}
	
	public int getNumber() {
		return number;
	}

	public void setName(String name) {
		if (name != null && !name.equals(""))
			Name = name;
	}

	@Override
	public void doWork() {
		System.out.println(this.getName());
		switch(this.getNumber()){
		case 1:
			System.out.println("Shte karam dnes kolata.");
			int kilometers = (int)(Math.random() * 120 + 1);
			System.out.println("Karah kolata " + kilometers + " kilmetra");
			break;
		case 2:
			System.out.println("Sreshtam se s priqteli i pusha nargile. :D");
			break;
		case 3:
			System.out.println("Shte razvejdam kucheto.");
			int minutes = (int)(Math.random() * 60 + 1);
			System.out.println("Razhojdah kucheto " + minutes + " minuti.");
			break;
		case 4:
			System.out.println("Shte piq tazi vecher s priqteli.");
			int liters = (int)(Math.random() * 3 + 1);
			System.out.println("Izpihme " + liters + " litur/litra alkohol...");
			break;
		}
		System.out.println();
	}

	

}
