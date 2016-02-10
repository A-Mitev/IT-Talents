package HW_Task_Employee_Part_2;

public class Working {
	public static void main(String[] args) {
		AllWork muchWork = new AllWork();

		Task task1 = new Task("Shpaklovane", 12);
		Task task2 = new Task("Zidane", 5);
		Task task3 = new Task("Pochistvane", 4);
		Task task4 = new Task("Zavintvane", 16);
		Task task5 = new Task("Dupchene", 6);
		Task task6 = new Task("Lepene", 4);
		Task task7 = new Task("Nosene", 11);
		Task task8 = new Task("Pochivane", 5);
		Task task9 = new Task("Marzeluvane", 8);
		Task task10 = new Task("Uchene", 11);

		Employee firstEmployee = new Employee("Alex");
		Employee secondEmployee = new Employee("Paula");
		Employee thirdEmployee = new Employee("Vasil");

		Task[] work = new Task[] { task1, task2, task3, task4, task5, task6, task7, task8, task9, task10 };

		for (int task = 0; task < work.length; task++) {
			muchWork.addTask(work[task]);
		}

		Employee[] workers = new Employee[] { firstEmployee, secondEmployee, thirdEmployee };

		for (int index = 0; index < workers.length; index++) {
			workers[index].setAllWork(muchWork);
		}

		int day = 1;
		while (true) {
			System.out.println("Day:" + day);
			for (int index = 0; index < workers.length; index++) {
				workers[index].startWorkingDay();
				workers[index].work();
			}

			boolean isWorkFinished = muchWork.isAllWorkDone();
			if (isWorkFinished == true) {
				break;
			}
			day++;
			System.out.println();
		}
	}
}
