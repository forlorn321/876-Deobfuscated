/* Class485 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class485 {
	public int anInt5437;
	byte aByte5438;
	public int anInt5439;
	public int anInt5440;
	public int anInt5441;
	public int anInt5442;

	public int method5850(int i) {
		return (aByte5438 & 0x8) == 8 ? 1 : 0;
	}

	public int method5851(int i) {
		return aByte5438 & 0x7;
	}

	public int method5852() {
		return aByte5438 & 0x7;
	}

	public Class485() {
		/* empty */
	}

	public Class485(RSByteBuffer buffer, Class98_Sub1 class98_sub1) {
		aByte5438 = buffer.readByte();
		anInt5442 = buffer.readUnsignedShort() * 389835411;
		anInt5439 = buffer.readInt() * -562153739;
		anInt5437 = buffer.readInt() * -63553687;
		anInt5441 = buffer.readInt() * 1709462743;
		anInt5440 = buffer.readInt() * -1559793033;
		if (null != class98_sub1)
			Class524.method6407(buffer, class98_sub1, 1775435078);
	}

	public int method5853() {
		return aByte5438 & 0x7;
	}

	public int method5854() {
		return aByte5438 & 0x7;
	}

	static final void method5855(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class465_Sub1.aClass96_10352.method481(i_0_, (byte) 118);
	}

	static final void method5856(Class668 class668, byte i) {
		if (null != Class66.aClass536_Sub15_724) {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1;
			class668.aClass536_Sub15_8553 = Class66.aClass536_Sub15_724;
		} else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	static final void method5857(Class668 class668, int i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(i_1_, (byte) -8)).name);
	}
}
