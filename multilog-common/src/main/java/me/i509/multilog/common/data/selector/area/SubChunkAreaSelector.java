package me.i509.multilog.common.data.selector.area;

public class SubChunkAreaSelector extends AreaSelector {

	@Override
	public boolean isDegenerate() {
		return false; // Subchunks cannot be degenerate.
	}

}
