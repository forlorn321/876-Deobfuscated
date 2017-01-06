/* Class24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class24 implements Interface32 {
	static int anInt232;
	static Class179_Sub2[] aClass179_Sub2Array233;

	Class24() {
		/* empty */
	}

	public Interface31 method205(Class308 class308, int i, int i_0_) {
		if (Class308.aClass308_3456 == class308)
			return client.PLAYER_LIST[i];
		if (Class308.aClass308_3457 == class308) {
			ObjectParam class536_sub13 = (ObjectParam) client.aClass4_11050.method556((long) i);
			if (null != class536_sub13)
				return (Interface31) class536_sub13.value;
		}
		return null;
	}

	public Interface31 method204(Class308 class308, int i) {
		if (Class308.aClass308_3456 == class308)
			return client.PLAYER_LIST[i];
		if (Class308.aClass308_3457 == class308) {
			ObjectParam class536_sub13 = (ObjectParam) client.aClass4_11050.method556((long) i);
			if (null != class536_sub13)
				return (Interface31) class536_sub13.value;
		}
		return null;
	}

	public Interface31 method203(Class308 class308, int i) {
		if (Class308.aClass308_3456 == class308)
			return client.PLAYER_LIST[i];
		if (Class308.aClass308_3457 == class308) {
			ObjectParam class536_sub13 = (ObjectParam) client.aClass4_11050.method556((long) i);
			if (null != class536_sub13)
				return (Interface31) class536_sub13.value;
		}
		return null;
	}

	static final void method725(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class458_Sub1.method9334(ClientSetting.aClass536_Sub40_8843.toolkit.method10071(), 200, (byte) -47);
	}

	static final void method726(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 100;
	}

	static final void method727(Class668 class668, int i) {
		class668.anInt8546 -= -709931686;
		if (class668.aLongArray8565[class668.anInt8546 * 1346022693] < class668.aLongArray8565[1346022693 * class668.anInt8546 + 1])
			class668.anInt8564 += (class668.anIntArray8537[class668.anInt8564 * -1640738851] * -1531084683);
	}
}
