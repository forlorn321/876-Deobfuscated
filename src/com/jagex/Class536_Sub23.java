/* Class536_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub23 extends Class536 {
	int anInt10527;
	public Class536_Sub33_Sub2 aClass536_Sub33_Sub2_10528;
	OutgoingPacket aClass414_10529;
	public int anInt10530;
	static Class536_Sub23[] aClass536_Sub23Array10531 = new Class536_Sub23[300];
	static int anInt10532 = 0;

	public void method9582(byte i) {
		if (anInt10532 * 1727980915 < aClass536_Sub23Array10531.length)
			aClass536_Sub23Array10531[((anInt10532 += 373737403) * 1727980915 - 1)] = this;
	}

	Class536_Sub23() {
		/* empty */
	}

	public static Class388 method9583(RSByteBuffer class536_sub33, int i) {
		int i_0_ = class536_sub33.readBigSmart((byte) 1);
		return new Class388(i_0_);
	}
}
