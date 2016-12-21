/* Class588 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class588 {
	static int anInt7740;

	Class588() throws Throwable {
		throw new Error();
	}

	static final void method7082(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class382.method4823(-42555787);
	}

	static final void method7083(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (i_0_ == 0)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class542_Sub1.aBool10714 ? 1 : 0;
		else if (1 == i_0_)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class542_Sub1.aBool10722 ? 1 : 0;
		else if (i_0_ == 2)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class542_Sub1.aBool10724 ? 1 : 0;
		else
			throw new RuntimeException();
	}

	public static Class12 method7084(Class1 class1, RSByteBuffer class536_sub33, int i) {
		return Class275.method3736(class1, class536_sub33, 2, 1614127484);
	}

	public static long method7085(int i, short i_1_) {
		return 86400000L * (long) (i + 11745);
	}
}
