package me.i509.multilog.nbt;

import java.util.List;
import java.util.UUID;

import javax.annotation.Nullable;

public abstract class MCompound implements MTag {
	public abstract int getSize();

    @Nullable
    public abstract MTag put(String string_1, MTag tag_1);

    public abstract void putByte(String string_1, byte byte_1);

    public abstract void putShort(String string_1, short short_1);

    public abstract void putInt(String string_1, int int_1);

    public abstract void putLong(String string_1, long long_1);

    public abstract void putUuid(String string_1, UUID uuid);

    public abstract UUID getUuid(String string_1);

    public abstract boolean hasUuid(String string_1);

    public abstract void putFloat(String string_1, float float_1);

    public abstract void putDouble(String string_1, double double_1);

    public abstract void putString(String string_1, String string_2);

    public abstract void putByteArray(String string_1, byte[] bytes_1);

    public abstract void putIntArray(String string_1, int[] ints_1);

    public abstract void putIntArray(String string_1, List<Integer> list_1);

    public abstract void putLongArray(String string_1, long[] longs_1);

    public abstract void putLongArray(String string_1, List<Long> list_1);

    public abstract void putBoolean(String string_1, boolean boolean_1);

    @Nullable
    public abstract MTag getTag(String string_1);

    public abstract byte getType(String string_1);

    public abstract boolean containsKey(String string_1);

    public abstract boolean containsKey(String string_1, int nbtType);

    public abstract byte getByte(String string_1);

    public abstract short getShort(String string_1);

    public abstract int getInt(String string_1);

    public abstract long getLong(String string_1);

    public abstract float getFloat(String string_1);

    public abstract double getDouble(String string_1);

    public abstract String getString(String string_1);

    public abstract byte[] getByteArray(String string_1);

    public abstract int[] getIntArray(String string_1);

    public abstract long[] getLongArray(String string_1);

    public abstract MCompound getCompound(String string_1);

    public abstract boolean getBoolean(String string_1);

    public abstract void remove(String string_1);

    public abstract boolean isEmpty();

    public abstract boolean equals(Object object_1);

    public abstract int hashCode();
}
