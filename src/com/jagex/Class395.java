/* Class395 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class395 {
	Object anObject4104;
	int anInt4105;
	static long aLong4106;

	Class395(Object object, int i) {
		anObject4104 = object;
		anInt4105 = 726119543 * i;
	}

	public static int method6504(int i, int i_0_, int i_1_) {
		i_0_ = (i & 0x7f) * i_0_ >> 7;
		if (i_0_ < 2)
			i_0_ = 2;
		else if (i_0_ > 126)
			i_0_ = 126;
		return i_0_ + (i & 0xff80);
	}

	static boolean method6505(int i, int i_2_) {
		return 0 == i || 8 == i;
	}

	static final void method6506(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class299.anInt3400 * 746347361;
	}
}
