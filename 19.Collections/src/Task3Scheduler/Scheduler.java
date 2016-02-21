package Task3Scheduler;

import java.util.ArrayList;
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

		ArrayList<Task> allTasks = new ArrayList<Task>();

		allTasks.add(new Task("Da izveda kucheto"));
		allTasks.add(new Task("Da nahranq kucheto"));
		allTasks.add(new Task("Da si napravq kafe"));
		allTasks.add(new Task("Da si vzema chadur"));
		allTasks.add(new Task("Da zaklucha vratata"));

		for (Task zadachi : allTasks) {
			scheduler.push(zadachi);
		}

		for (ITask task : someTasks) {
			task.doWork();
		}
	}
}
