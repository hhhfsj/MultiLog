package me.i509.multilog.common;

import me.i509.multilog.common.data.selector.area.SelectorType;
import me.i509.multilog.threaded.MTask;

public class TaskBuilder<N extends SelectorType, V> {
	private boolean isWriting;

	public TaskBuilder(LogType<N,V> type, boolean write) {
		this.isWriting = write;
	}
	
	public TaskBuilder<N,V> setSelector(N selector) {
		return this;
	}
	
	public TaskBuilder<N,V> setValue(V value) {
		return this;	
	}

	public MTask<N, V> compile() {
		return null;
	}
}
