package me.i509.multilog.threaded;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

import me.i509.multilog.common.LogType;
import me.i509.multilog.common.data.selector.area.ChunkAreaSelector;
import me.i509.multilog.common.data.selector.area.SelectorType;
import me.i509.multilog.math.BlockPosition3D;

public class ThreadedLoggerAccess {
	
	private static ThreadedLoggerAccess instance = new ThreadedLoggerAccess();
	private volatile ThreadedLogger thread;
	
	private ThreadedLoggerAccess() {
		thread = new ThreadedLogger(this);
	}
	
	public <N extends SelectorType, V> void addTask(final MTask<N, V> task) {
		thread.tasks.add(task);
		thread.notify();
	}

	public <N extends SelectorType, V> void addTask(MTask<N, V> read, Consumer<CompletableFuture<V>> futureConsumer) {
		// TODO test code
		read.setFuture(futureConsumer);
		thread.tasks.add(read);
		thread.notify();
	}
	
	protected static void e() {
		
		ThreadedLoggerAccess.getInstance().addTask(Tasks.read(LogType.EXPLOSIONS, new ChunkAreaSelector()), future -> {

		});
		
		ThreadedLoggerAccess.getInstance().addTask(Tasks.write(LogType.BLOCKS, BlockPosition3D.ZERO, null));
		
	}

	public static ThreadedLoggerAccess getInstance() {
		return instance;
	}
}
