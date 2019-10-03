package me.i509.multilog.common;

import java.util.LinkedHashMap;
import java.util.Map;

import me.i509.multilog.common.data.selector.area.SelectorType;

public class LogTypeRegistry {
	
	private static final Map<String, LogType<?,?>> TYPES = new LinkedHashMap<>();

	@SuppressWarnings("unchecked")
	public static <N extends SelectorType,V> LogType<N,V> register(String name, LogType<N, V> blocks) {
		return (LogType<N, V>) TYPES.put(name, blocks);
	}
	
	public static <N extends SelectorType,V> TaskBuilder write(LogType<N,V> type) {
		return null;
	}

	public static <N extends SelectorType,V> TaskBuilder read(LogType<N, V> type) {
		// TODO Auto-generated method stub
		return null;
	}
}
