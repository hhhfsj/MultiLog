package me.i509.multilog.threaded;

import me.i509.multilog.common.LogType;

public abstract class MTask<N,V> {
	
	private LogType<N, V> type;
	private N typeSelector;

	MTask(final LogType<N,V> type, N typeSelector) {
		this.type = type;
		this.typeSelector = typeSelector;
	}

	public LogType<N, V> getType() {
		return type;
	}
}
