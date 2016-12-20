/* Class81 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class81 {
	public static final long aLong808 = 94608000L;

	Class81() throws Throwable {
		throw new Error();
	}

	public static int method1574(byte i) {
		if (Class707.aBool8841 && Class56.aFrame711 != null)
			return 3;
		return client.aBool11155 ? 2 : 1;
	}

	static final void method1575(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_0_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_1_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		if (i_0_ >= 0 && i_0_ < 2)
			client.anIntArrayArrayArray11148[i_0_] = new int[i_1_ << 1][4];
	}
}
