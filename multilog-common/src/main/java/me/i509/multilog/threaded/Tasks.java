package me.i509.multilog.threaded;

import java.util.concurrent.CompletableFuture;

import me.i509.multilog.common.LogType;

public class Tasks {

	private Tasks() {}

	public static <N, V> MTask<N,CompletableFuture<V>> read(final LogType<N, V> type, final N typedName) {
		return null;
	}
	
	public static <N, V> MTask<N,V> write(final LogType<N,V> type, final N typedName, final V value) {
		return null;
	}
}
