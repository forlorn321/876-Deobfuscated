/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class8 {
	public static final int anInt119 = 5;

	Class8() throws Throwable {
		throw new Error();
	}

	static final void method602(Class668 class668, byte i) {
		class668.aLongArray8565[(class668.anInt8546 += 1792517805) * 1346022693 - 1] = ((Long) (class668.aClass536_Sub18_Sub16_8547.anObjectArray11796[class668.anInt8564 * -1640738851])).longValue();
	}

	static final void method603(Class668 class668, int i) {
		class668.anIntArray8541[1867269829 * class668.anInt8542 - 1] = (class668.aClass536_Sub15_8553.method9504(-1783408504)[class668.anIntArray8541[class668.anInt8542 * 1867269829 - 1]]);
	}

	static final void method604(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
	}

	static void method605(RSBitBuffer stream, byte i) {
		boolean bool = stream.readUnsignedByte() == 1;
		if (bool) {
			boolean bool_0_ = false;
			int i_1_ = stream.method10777((byte) 87) << 24;
			i_1_ |= stream.method10777((byte) 10) << 16;
			i_1_ |= stream.method10777((byte) -42) << 8;
			i_1_ |= stream.method10777((byte) 41);
			Class218.aClass66_2307.method1064((Class450.aLong4943 * -6871820876617798991L), i_1_, (byte) 46);
		}
	}
}
