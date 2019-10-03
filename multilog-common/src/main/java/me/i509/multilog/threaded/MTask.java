package me.i509.multilog.threaded;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

import me.i509.multilog.common.LogType;
import me.i509.multilog.common.data.selector.area.SelectorType;

public abstract class MTask<N extends SelectorType ,V> {
	
	private LogType<N, V> type;
	private SelectorType typeSelector;

	MTask(final LogType<N,V> type, SelectorType selector) {
		this.type = type;
		this.typeSelector = typeSelector;
	}

	public LogType<N, V> getType() {
		return type;
	}
	
	public SelectorType getSelector() {
		return typeSelector;
	}

	public void setFuture(Consumer<CompletableFuture<V>> future) {

	}

	public Consumer<CompletableFuture<V>> getFuture() {
		return null;
		// TODO Auto-generated method stub
		
	}
}
