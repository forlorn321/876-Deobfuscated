/* Class519 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class519 {
	static final int anInt7044 = 63;
	static final int anInt7045 = 1;
	static final int anInt7046 = 8;
	static final int anInt7047 = 16;
	static final int anInt7048 = 62;
	static final int anInt7049 = 2;

	Class519() throws Throwable {
		throw new Error();
	}

	static void method6333(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class187.method2787(1692296629);
	}

	static final void method6334(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class230.method3298(class251, class234, class668, 2033328431);
	}

	static final void method6335(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class668.aClass350_8563.anIntArray3721[i_0_];
	}

	public static int method6336(int i, int i_1_, int i_2_) {
		int i_3_ = 0;
		for (/**/; i_1_ > 0; i_1_--) {
			i_3_ = i_3_ << 1 | i & 0x1;
			i >>>= 1;
		}
		return i_3_;
	}

	static Class251 method6337(Class251 class251, int i) {
		Class251 class251_4_ = client.method10382(class251);
		if (null == class251_4_)
			class251_4_ = class251.aClass251_2553;
		return class251_4_;
	}
}
