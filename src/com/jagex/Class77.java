/* Class77 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class77 {
	public static final int anInt822 = 8;

	Class77() throws Throwable {
		throw new Error();
	}

	static final void method1158(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_0_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_0_ >> 16];
		SubIncomingPacket.method4973(class251, class234, class668, (byte) -128);
	}

	static final void method1159(Class668 class668, boolean bool, boolean bool_1_, int i) {
		int i_2_ = class668.anIntArray8537[-1640738851 * class668.anInt8564];
		int i_3_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (i_3_ < 0 || i_3_ >= class668.anIntArray8539[i_2_])
			throw new RuntimeException();
		if (!bool)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class668.anIntArrayArray8536[i_2_][i_3_];
		else if (bool_1_) {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class668.anIntArrayArray8536[i_2_][i_3_];
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_3_;
		} else {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_3_;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class668.anIntArrayArray8536[i_2_][i_3_];
		}
	}
}
