/* Class536_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class OutgoingPacketContainer extends Class536 {
	int anInt10527;
	public RSBitBuffer stream;
	OutgoingPacket aClass414_10529;
	public int anInt10530;
	static OutgoingPacketContainer[] aClass536_Sub23Array10531 = new OutgoingPacketContainer[300];
	static int anInt10532 = 0;

	public void method9582(byte i) {
		if (anInt10532 * 1727980915 < aClass536_Sub23Array10531.length)
			aClass536_Sub23Array10531[((anInt10532 += 373737403) * 1727980915 - 1)] = this;
	}

	OutgoingPacketContainer() {
		/* empty */
	}

	public static Class388 method9583(RSByteBuffer class536_sub33, int i) {
		int i_0_ = class536_sub33.readBigSmart();
		return new Class388(i_0_);
	}
}
