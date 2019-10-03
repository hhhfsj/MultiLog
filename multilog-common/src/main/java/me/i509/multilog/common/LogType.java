package me.i509.multilog.common;

import me.i509.multilog.common.data.BlockEntityLogData;
import me.i509.multilog.common.data.BlockLogData;
import me.i509.multilog.common.data.CombatLogData;
import me.i509.multilog.common.data.EntityLogData;
import me.i509.multilog.common.data.EnvironmentalLogData;
import me.i509.multilog.common.data.ExplosionLogData;
import me.i509.multilog.common.data.FluidLogData;
import me.i509.multilog.common.data.InventoryLogData;
import me.i509.multilog.common.data.selector.InventorySelector;
import me.i509.multilog.common.data.selector.area.AreaSelector;
import me.i509.multilog.math.BlockPosition3D;

/**
 * Represents the base log types in the game. This class is also used to define LogTypes
 * @author i509VCB
 *
 * @param <N> The data type used to find the LogData
 * @param <V> The LogData type returned.
 */
public interface LogType<N, V> {
	
	void makeType(N namedType, V valueType);
	
	public static final LogType<BlockPosition3D, BlockLogData> BLOCKS = (named, valueType) -> {}; 
	
	public static final LogType<BlockPosition3D, BlockEntityLogData> BLOCK_ENTITY = (named, valueType) -> {};

	public static final LogType<BlockPosition3D, FluidLogData> FLUIDS = (named, valueType) -> {};

	public static final LogType<InventorySelector, InventoryLogData> ITEM = (named, valueType) -> {};

	public static final LogType<AreaSelector, EntityLogData> ENTITY = (named, valueType) -> {};
	
	public static final LogType<AreaSelector, ExplosionLogData> EXPLOSIONS = (named, valueType) -> {};
	
	public static final LogType<AreaSelector, EnvironmentalLogData> LIGHTNING = (named, valueType) -> {};
	
	public static final LogType<AreaSelector, EnvironmentalLogData> FIRE_SPREAD = (named, valueType) -> {};
	
	public static final LogType<AreaSelector, CombatLogData> COMBAT = (named, valueType) -> {};
}
