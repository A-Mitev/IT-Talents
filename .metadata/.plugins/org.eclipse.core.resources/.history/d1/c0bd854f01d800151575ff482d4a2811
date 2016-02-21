package Task3Scheduler;

import java.util.LinkedList;
import java.util.Queue;

public class Scheduler {

	public void push(ITask task) {
		if (task != null) {
			someTasks.add(task);
		}
	}

	public static Queue<ITask> someTasks = new LinkedList<ITask>();

	public static void main(String[] args) throws WrongWorkEntryException {

		Scheduler scheduler = new Scheduler();

		ITask firstTask = new Task("Da izveda kucheto");
		ITask secondTask = new Task("Da nahranq kucheto");
		ITask thirdTask = new Task("Da si napravq kafe");
		ITask fourthTask = new Task("Da si vzema chadur");
		ITask fifthTask = new Task("Da zaklucha vratada");

		scheduler.push(firstTask);
		scheduler.push(secondTask);
		scheduler.push(thirdTask);
		scheduler.push(thirdTask);
		scheduler.push(fourthTask);
		scheduler.push(fifthTask);

		for (ITask task : someTasks) {
			task.doWork();
		}
	}
}
