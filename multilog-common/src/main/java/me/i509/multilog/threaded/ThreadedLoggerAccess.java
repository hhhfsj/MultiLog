package me.i509.multilog.threaded;

import java.util.Arrays;

import me.i509.multilog.common.LogType;

public class ThreadedLoggerAccess {
	
	private static ThreadedLoggerAccess instance = new ThreadedLoggerAccess();
	private volatile ThreadedLogger thread;
	
	private ThreadedLoggerAccess() {
		thread = new ThreadedLogger(this);
	}
	
	public void addTask(final MTask task) {
		thread.tasks.add(task);
		thread.notify();
	}
	
	public void addTasks(final MTask... taskArray) {
		Tasks.read(LogType.BLOCKS, null);
		thread.tasks.addAll(Arrays.asList(taskArray));
		thread.notify();
	}

	public static ThreadedLoggerAccess getInstance() {
		return instance;
	}
}
