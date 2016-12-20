/* Class527_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Map;

public abstract class Class527_Sub35 extends Class527 {
	protected static final int anInt10665 = 12;
	protected static final int anInt10666 = 4095;
	protected static final int anInt10667 = 8192;
	protected static final int anInt10668 = 2048;
	public static final float aFloat10669 = 4096.0F;
	protected static final int anInt10670 = 4096;

	Class527_Sub35(int i, boolean bool) {
		/* empty */
	}

	static final void method16379(Class243 class243, Class240 class240, Class665 class665, int i) {
		class243.anInt2541 = 605595485;
		class243.anInt2542 = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) * -174092741;
		if (-1 == class243.anInt2675 * -927924265 && !class240.aBool2394)
			Class207.method3844(class243.anInt2504 * -254728301, 352772051);
	}

	public static Map method16380(Class95_Sub1[] class95_sub1s, byte i) {
		if (null == class95_sub1s || class95_sub1s.length == 0)
			return null;
		HashMap hashmap = new HashMap();
		Class95_Sub1[] class95_sub1s_0_ = class95_sub1s;
		for (int i_1_ = 0; i_1_ < class95_sub1s_0_.length; i_1_++) {
			Class95_Sub1 class95_sub1 = class95_sub1s_0_[i_1_];
			hashmap.put(class95_sub1.aClass465_8985, class95_sub1);
		}
		return hashmap;
	}
}
