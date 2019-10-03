package me.i509.multilog.threaded;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentLinkedQueue;

import me.i509.multilog.common.data.LogData;

public class ThreadedLogger extends Thread implements AutoCloseable {
	
	public static ThreadedLoggerAccess getThread() {
		return null;
		
	}
	
	private boolean shouldRun = true;

	final ConcurrentLinkedQueue<MTask> tasks = new ConcurrentLinkedQueue<>();
	
	public ThreadedLogger(ThreadedLoggerAccess acc) {
		super("MultiLog-Logger-Thread");
	}
	
	@SuppressWarnings("unchecked")
	@Override
    public void run() {
		try {
			while(true) {
				synchronized(this) {
					if(!shouldRun) {
						break;
					}
					
					for(MTask task : tasks) {
						// Write task
						Object o = task.getType().getData(task.getSelector(), null);
						task.getFuture().accept(CompletableFuture.completedFuture(o)); // TODO probably not thread safe
					}
				}
				this.wait();
			}
    	} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
	
	static void ecx(LogData data) {
		
	}

	@Override
	public void close() throws Exception {
		synchronized(this) {
			
		}
	}
}
