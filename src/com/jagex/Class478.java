/* Class478 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class478 implements Interface75 {
	public int anInt5383;
	int anInt5384;
	public static Class478 aClass478_5385 = new Class478(0, 0, java.lang.Integer.class, new Class474());
	static Class478 aClass478_5386;
	public static Class478 aClass478_5387;
	public static Class478 aClass478_5388 = new Class478(3, 1, java.lang.Long.class, new Class482());
	static Class478 aClass478_5389;
	public Class aClass5390;
	Interface11 anInterface11_5391;

	static {
		aClass478_5387 = new Class478(2, 2, java.lang.String.class, new Class495());
		aClass478_5386 = new Class478(1, 3, com.jagex.Class536_Sub30.class, new Class486());
		aClass478_5389 = new Class478(4, 4, com.jagex.Class243.class, new Class483());
	}

	static Class478 method5753(Class var_class, byte i) {
		Class478[] class478s = method5757((byte) 32);
		for (int i_0_ = 0; i_0_ < class478s.length; i_0_++) {
			Class478 class478 = class478s[i_0_];
			if (var_class == class478.aClass5390)
				return class478;
		}
		return null;
	}

	public static Interface11 method5754(Class var_class, byte i) {
		Class478 class478 = method5753(var_class, (byte) 61);
		if (null == class478)
			throw new IllegalArgumentException();
		return class478.anInterface11_5391;
	}

	public int method78() {
		return 1917591635 * anInt5384;
	}

	public static void method5755(byte i) {
		Class251.aClass199_2552.method2892(1476790285);
		Class251.aClass199_2694.method2892(-463576285);
		Class251.aClass199_2568.method2892(-1912303390);
		Class251.aClass199_2554.method2892(1261224843);
	}

	public Object method5756(RSByteBuffer class536_sub33, byte i) {
		return anInterface11_5391.method68(class536_sub33, (short) -13646);
	}

	public int method12() {
		return 1917591635 * anInt5384;
	}

	public int method73() {
		return 1917591635 * anInt5384;
	}

	Class478(int i, int i_1_, Class var_class, Interface11 interface11) {
		anInt5383 = i * 408776551;
		anInt5384 = 1394025435 * i_1_;
		aClass5390 = var_class;
		anInterface11_5391 = interface11;
	}

	public static Class478[] method5757(byte i) {
		return new Class478[] { aClass478_5387, aClass478_5385, aClass478_5388, aClass478_5386, aClass478_5389 };
	}

	static final void method5758(Class251 class251, Class234 class234, Class668 class668, int i) {
		class251.anInt2593 = class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)] * -207488001;
		Class668.method8011(class251, 263642117);
	}

	static final void method5759(Class668 class668, byte i) {
		class668.anInt8542 -= 1472892954;
		int i_2_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_3_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_2_ & -1 - (1 << i_3_);
	}

	static final void method5760(Class668 class668, int i) throws Exception_Sub3 {
		class668.anInt8542 -= 61855783;
		int i_4_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_5_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		int i_6_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 2];
		float f = (float) (2.0 * Math.atan((double) ((float) i_4_ / 2.0F / (float) i_6_)));
		float f_7_ = (float) (2.0 * Math.atan((double) ((float) i_5_ / 2.0F / (float) i_6_)));
		Class683.aClass301_Sub1_8651.method4045(f, f_7_, -1606307463);
	}

	static final void method5761(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub33_10762.method10196((byte) 0) ? 1 : 0;
	}

	static final void method5762(int i) {
		client.anInt11052 = 2044763365;
		client.anInt11074 = -416311143;
		Class392_Sub1.aClass536_Sub33_10107 = null;
		Class521_Sub4.method9368(336492549);
	}

	static final void method5763(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class497.aString5550.startsWith("win") ? 1 : 0;
	}
}
