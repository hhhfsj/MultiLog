package me.i509.multilog.common.data;

import java.time.Instant;

public interface LogData {
	
	public static final class LogEntry {
		
		public LogEntry(long epochSecond) {
			time = Instant.ofEpochSecond(epochSecond);
		}
		
		protected final Instant time;
	} 
}
