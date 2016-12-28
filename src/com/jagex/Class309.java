/* Class309 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class309 implements Interface6 {
	int anInt3458;
	Class670 aClass670_3459;
	Class461 aClass461_3460;
	Class199 aClass199_3461 = new Class199(50);
	Class199 aClass199_3462 = new Class199(5);
	boolean aBool3463;
	String[] aStringArray3464;
	public static Class98_Sub1_Sub2 aClass98_Sub1_Sub2_3465;

	void method4137(int i, int i_0_) {
		synchronized (aClass199_3461) {
			aClass199_3461.method2883(i, -1324362433);
		}
		synchronized (aClass199_3462) {
			aClass199_3462.method2883(i, -1993616493);
		}
	}

	void method4138(boolean bool, byte i) {
		if (bool != aBool3463) {
			aBool3463 = bool;
			method4140((byte) -61);
		}
	}

	void method4139(int i, int i_1_) {
		anInt3458 = 51049993 * i;
		synchronized (aClass199_3461) {
			aClass199_3461.method2884((byte) -87);
		}
		synchronized (aClass199_3462) {
			aClass199_3462.method2884((byte) -55);
		}
	}

	void method4140(byte i) {
		synchronized (aClass199_3461) {
			aClass199_3461.method2884((byte) -71);
		}
		synchronized (aClass199_3462) {
			aClass199_3462.method2884((byte) -37);
		}
	}

	void method4141(int i) {
		anInt3458 = 51049993 * i;
		synchronized (aClass199_3461) {
			aClass199_3461.method2884((byte) -77);
		}
		synchronized (aClass199_3462) {
			aClass199_3462.method2884((byte) -98);
		}
	}

	Class309(boolean bool, Class461 class461, Class664 class664, Class670 class670) {
		aBool3463 = bool;
		aClass461_3460 = class461;
		aClass670_3459 = class670;
		if (Class670.aClass670_8568 == aClass670_3459)
			aStringArray3464 = new String[] { null, null, null, null, null, Class38.aClass38_459.method840(class664, 1957936067) };
		else
			aStringArray3464 = new String[] { null, null, null, null, null, null };
	}

	void method4142(boolean bool) {
		if (bool != aBool3463) {
			aBool3463 = bool;
			method4140((byte) -91);
		}
	}

	void method4143(boolean bool) {
		if (bool != aBool3463) {
			aBool3463 = bool;
			method4140((byte) -116);
		}
	}

	void method4144(int i) {
		anInt3458 = 51049993 * i;
		synchronized (aClass199_3461) {
			aClass199_3461.method2884((byte) -27);
		}
		synchronized (aClass199_3462) {
			aClass199_3462.method2884((byte) -93);
		}
	}

	void method4145(boolean bool) {
		if (bool != aBool3463) {
			aBool3463 = bool;
			method4140((byte) -6);
		}
	}

	void method4146(int i) {
		anInt3458 = 51049993 * i;
		synchronized (aClass199_3461) {
			aClass199_3461.method2884((byte) -72);
		}
		synchronized (aClass199_3462) {
			aClass199_3462.method2884((byte) -128);
		}
	}

	void method4147(int i) {
		anInt3458 = 51049993 * i;
		synchronized (aClass199_3461) {
			aClass199_3461.method2884((byte) -93);
		}
		synchronized (aClass199_3462) {
			aClass199_3462.method2884((byte) -3);
		}
	}

	void method4148(int i) {
		synchronized (aClass199_3461) {
			aClass199_3461.method2892(-1152630736);
		}
		synchronized (aClass199_3462) {
			aClass199_3462.method2892(-1105607615);
		}
	}

	void method4149() {
		synchronized (aClass199_3461) {
			aClass199_3461.method2892(2010929855);
		}
		synchronized (aClass199_3462) {
			aClass199_3462.method2892(36024005);
		}
	}

	void method4150() {
		synchronized (aClass199_3461) {
			aClass199_3461.method2892(1143001089);
		}
		synchronized (aClass199_3462) {
			aClass199_3462.method2892(1258203964);
		}
	}

	static final void method4151(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_2_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_3_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		Class273.method3730(5, i_2_, i_3_, "", -1919421896);
	}

	static final void method4152(IComponentDefinitions class251, Class234 class234, Class668 class668, int i) {
		class251.textShadow = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) == 1;
		Class668.method8011(class251, 263642117);
	}

	static final void method4153(Class668 class668, short i) {
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method10885(637868966);
	}

	static void method4154(byte[] is, int i) {
		RSByteBuffer class536_sub33 = new RSByteBuffer(is);
		for (;;) {
			int i_4_ = class536_sub33.readUnsignedByte();
			if (i_4_ == 0)
				break;
			if (1 == i_4_) {
				int i_5_ = class536_sub33.readUnsignedShort();
				Class184_Sub2.aClass211_9442.method3007(i_5_, -829236946);
			}
		}
	}
}
