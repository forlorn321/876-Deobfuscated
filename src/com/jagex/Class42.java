/* Class42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class42 {
	static Class42 aClass42_507;
	static Class42 aClass42_508 = new Class42();
	public static int anInt509;

	static {
		aClass42_507 = new Class42();
	}

	Class42() {
		/* empty */
	}

	static final void method876(Class668 class668, int i) {
		class668.anInt8542 -= 61855783;
		int i_0_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_1_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		int i_2_ = class668.anIntArray8541[2 + 1867269829 * class668.anInt8542];
		Class184_Sub2.aClass211_9442.method2994(i_0_, i_1_, i_2_, -1311520746);
	}

	static final void method877(Class668 class668, int i) {
		class668.anInt8542 -= -1411037171;
	}

	static final void method878(InterfaceDefinitions class251, Class234 class234, Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		int[] is = Class510.method6183(string, class668, -507294061);
		if (null != is)
			string = string.substring(0, string.length() - 1);
		class251.onVarcstrTransmitHook = Class33.method796(string, class668, (short) 8355);
		class251.varcstrTransmitList = is;
		class251.hasComponentHook = true;
	}
}
