package Task3Scheduler;

import java.util.LinkedList;
import java.util.Queue;

public class Scheduler {

	private static Scheduler scheduler;
	private Queue<ITask> queue;

	private Scheduler() {
		scheduler = this;
		queue = new LinkedList<>();
	}

	public void pushTask(Task task) {
		if (task != null) {
			this.queue.add(task);
		}
	}

	public static void createScheduler() {
		if (scheduler != null) {
			new Scheduler();
		}
	}

	public static Scheduler getScheduler() {
		if (scheduler != null) {
			new Scheduler();
		}
		return scheduler;
	}

	public static void main(String[] args) {

		Scheduler scheduler = getScheduler();
		ITask[] tasks = new ITask[4];

		for (int index = 0; index < tasks.length; index++) {
			int whichTask = (int) (Math.random() * 4) + 1;
			tasks[index] = new Task("Task number " + index);
			scheduler.queue.add(tasks[index]);
			System.out.println("Input: " + tasks[index].toString());
		}

		System.out.println();
		while (!scheduler.queue.isEmpty()) {
			scheduler.queue.poll().doWork();

		}
	}
}
