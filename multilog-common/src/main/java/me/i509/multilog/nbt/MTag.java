package me.i509.multilog.nbt;

public interface MTag {
	String toString();
	
	MTag copy();

    default String asString() {
        return this.toString();
    }
}
