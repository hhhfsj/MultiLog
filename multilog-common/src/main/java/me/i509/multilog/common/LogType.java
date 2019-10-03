package me.i509.multilog.common;

import static me.i509.multilog.common.LogTypeRegistry.register;

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
import me.i509.multilog.common.data.selector.area.SelectorType;
import me.i509.multilog.math.BlockPosition3D;

/**
 * Represents the base log types in the game. This class is also used to define LogTypes
 * @author i509VCB
 *
 * @param <N> The data type used to find the LogData
 * @param <V> The LogData type returned.
 */
public interface LogType<N extends SelectorType, V> {
	
	V getData(N selector, TemporalContext temporalContext);
	
	public static final LogType<BlockPosition3D, BlockLogData> BLOCKS = register("blocks", (selector, temporalContext) -> temporalContext.select(BlockLogData.class, selector)); 
	
	public static final LogType<BlockPosition3D, BlockEntityLogData> BLOCK_ENTITY = register("block_entity", (selector, temporalContext) -> temporalContext.select(BlockEntityLogData.class, selector));

	public static final LogType<BlockPosition3D, FluidLogData> FLUIDS = register("fluids", (selector, temporalContext) -> temporalContext.select(FluidLogData.class, selector));

	public static final LogType<InventorySelector, InventoryLogData> ITEM = register("item", (selector, temporalContext) -> temporalContext.select(InventoryLogData.class, selector));

	public static final LogType<AreaSelector, EntityLogData> ENTITY = register("entity", (selector, temporalContext) -> temporalContext.select(EntityLogData.class, selector));
	
	public static final LogType<AreaSelector, ExplosionLogData> EXPLOSIONS = register("explosions", (selector, temporalContext) -> temporalContext.select(ExplosionLogData.class, selector));
	
	public static final LogType<AreaSelector, EnvironmentalLogData> LIGHTNING = register("lightning", (selector, temporalContext) -> temporalContext.select(EnvironmentalLogData.class, selector));
	
	public static final LogType<AreaSelector, EnvironmentalLogData> FIRE_SPREAD = register("fire_spread", (selector, temporalContext) -> temporalContext.select(EnvironmentalLogData.class, selector));
	
	public static final LogType<AreaSelector, CombatLogData> COMBAT = register("combat", (selector, temporalContext) -> temporalContext.select(CombatLogData.class, selector));
}
