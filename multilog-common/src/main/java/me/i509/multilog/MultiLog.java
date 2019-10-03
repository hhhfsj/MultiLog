package me.i509.multilog;

import me.i509.multilog.common.MultiLogPlatform;

public final class MultiLog {
	private static MultiLog instance = new MultiLog();

	public static MultiLog getInstance() {
		return instance;
	}
	
	public MultiLogPlatform getPlatform() {
		return MultiLogPlatform.getInstance();
	}
}
