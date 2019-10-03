package me.i509.multilog.threaded;

import java.util.concurrent.CompletableFuture;

import me.i509.multilog.common.LogType;
import me.i509.multilog.common.LogTypeRegistry;
import me.i509.multilog.common.data.selector.area.SelectorType;

public class Tasks {

	private Tasks() {}

	@SuppressWarnings("unchecked")
	public static <N extends SelectorType, V> MTask<N,CompletableFuture<V>> read(final LogType<N, V> type, final N typedName) {
		return LogTypeRegistry.read(type).setSelector(typedName).compile();
	}
	
	@SuppressWarnings("unchecked")
	public static <N extends SelectorType, V> MTask<N,V> write(final LogType<N,V> type, final N typedName, final V value) {
		return LogTypeRegistry.write(type).setSelector(typedName).setValue(value).compile();
	}
}
