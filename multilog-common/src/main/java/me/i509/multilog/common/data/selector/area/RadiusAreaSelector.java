package me.i509.multilog.common.data.selector.area;

public class RadiusAreaSelector extends AreaSelector {

	private double radius;

	@Override
	public boolean isDegenerate() {
		return radius<=0; // AreaSelector is degenerate when the radius is less than or equal to 0.
	}

}
