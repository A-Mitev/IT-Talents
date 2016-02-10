package HW_Task_Employee_Part_2;

public class Employee {

	private static final int WRONG_VALUE_FOR_HOURS_LEFT = -9999;
	private String name;
	private Task currentTask;
	private int hoursLeft;
	private static AllWork allWork;

	Employee(String name) {
		setName(name);
	}

	void work() {
		while (this.hoursLeft > 0) {
			if (this.currentTask == null || this.currentTask.getWorkingHours() == 0) {
				this.currentTask = Employee.allWork.getNextTask();
				if (this.currentTask == null) {
					System.out.println("No task for " + this.getName());
					break;
				}
				System.out.println(this.getName() + " start work on " + this.getCurrentTask().getName());
				this.activityDuringDay();
			} else {
				System.out.println(this.getName() + " continue work on " + this.getCurrentTask().getName());
				this.activityDuringDay();
			}
		}

	}

	void activityDuringDay() {
		if (this.getHoursLeft() < this.currentTask.getWorkingHours()) {
			this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.getHoursLeft());
			this.setHoursLeft(0);
			System.out.println(this.getName() + " finished work for today!");
			System.out.println(this.getName() + " has more " + this.getCurrentTask().getWorkingHours()
					+ "hours until end of his current task!");

		}
		if (this.getHoursLeft() >= this.currentTask.getWorkingHours()) {
			this.setHoursLeft(this.getHoursLeft() - this.currentTask.getWorkingHours());
			this.currentTask.setWorkingHours(0);
			System.out.println(this.getName() + " finished work on " + this.getCurrentTask().getName());
			System.out.println(this.getName() + " has more " + this.getHoursLeft() + " hours until end of the day!");
		}
	}

	void startWorkingDay() {

		this.setHoursLeft(8);
		System.out.println(this.getName() + " start work today!");
	}

	public String getName() {
		return name;
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		this.currentTask = currentTask;
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		} else {
			this.hoursLeft = WRONG_VALUE_FOR_HOURS_LEFT;
		}
	}

	public AllWork getAllWork() {
		return Employee.allWork;
	}

	public void setAllWork(AllWork allWork) {
		if (allWork != null) {
			Employee.allWork = allWork;
		}
	}

	public void setName(String name) {
		if (name != null && !name.equals("")) {
			this.name = name;
		} else {
			this.name = "The name is wrong";
		}
	}

	void showReport() {
		work();
		System.out.println("Name of employee: " + this.getName());
		System.out.println("Task of the employee: " + this.getCurrentTask().getName());
		System.out.println("Working hours left: " + this.getHoursLeft());
		System.out.println("Hours left for task: " + this.getCurrentTask().getWorkingHours());
		System.out.println();
	}
}
