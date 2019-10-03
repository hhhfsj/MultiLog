package me.i509.multilog.common;

import java.lang.ref.WeakReference;

import com.mojang.datafixers.DataFixer;

import me.i509.multilog.threaded.ThreadedLoggerAccess;

public abstract class MultiLogPlatform {
	
	private String platformName;
	private ThreadedLoggerAccess thread;
	private DataFixer datafixer;
	private static WeakReference<MultiLogPlatform> instance = null;

	protected MultiLogPlatform(String platformName, DataFixer datafixer) {
		this.platformName = platformName;
		this.datafixer = datafixer;
		this.thread = ThreadedLoggerAccess.getInstance();
	}
	
	public static MultiLogPlatform getInstance() {
		return instance.get();
	}
	
	public static void setInstance(MultiLogPlatform platform) {
		instance = new WeakReference<>(platform);
	}

	public DataFixer getDataFixer() {
		return this.datafixer;
	}
	
	public String getPlatformName() {
		return platformName;
	}

	public ThreadedLoggerAccess getThread() {
		return this.thread;
	}
}
