package me.i509.multilog.math;

import me.i509.multilog.common.data.selector.area.SelectorType;

public class BlockPosition3D implements SelectorType {
	public static final BlockPosition3D ZERO = new BlockPosition3D(0,0,0);
	private int x;
	private int y;
	private int z;
	
	public BlockPosition3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getZ() {
		return z;
	}
	
	/**
	 * Returns this location as a string.
	 */
	public String toString() {
		return new String("BlockPosition3D{x=" + x + ",y=" + y + ",z=" + z + "}");
	}
	
}
