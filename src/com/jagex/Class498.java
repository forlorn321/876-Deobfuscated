/* Class498 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class498 {
	static Class498 aClass498_5555;
	public static Class498 aClass498_5556;
	public static Class498 aClass498_5557;
	public static Class498 aClass498_5558;
	public static Class498 aClass498_5559 = new Class498(false, false);
	static Class498 aClass498_5560;
	static Class498 aClass498_5561;
	public static Class498 aClass498_5562;
	boolean aBool5563;
	boolean aBool5564;

	static {
		aClass498_5556 = new Class498(true, false);
		aClass498_5557 = new Class498(false, false);
		aClass498_5558 = new Class498(true, false);
		aClass498_5555 = new Class498(true, false);
		aClass498_5560 = new Class498(true, true);
		aClass498_5561 = new Class498(true, true);
		aClass498_5562 = new Class498(false, false);
	}

	Class498(boolean bool, boolean bool_0_) {
		aBool5563 = bool;
		aBool5564 = bool_0_;
	}

	public boolean method6015(short i) {
		return aBool5564;
	}

	boolean method6016(byte i) {
		return aBool5563;
	}

	boolean method6017() {
		return aBool5563;
	}

	static final void method6018(Class668 class668, byte i) {
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)]);
		if (-1 != class251.anInt2711 * -1484799213)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1880327077 * class251.anInt2712;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	static final void method6019(Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = Class166.method1997(string, (byte) 17);
	}
}
