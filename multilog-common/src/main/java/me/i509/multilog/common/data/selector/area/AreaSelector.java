package me.i509.multilog.common.data.selector.area;

public abstract class AreaSelector implements SelectorType {
	/**
	 * Checks weather the AreaSelector is degenerate (a single block location/vector location)
	 * @return true if the AreaSelector is degenerate.
	 */
	public abstract boolean isDegenerate();
}
