/* Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class35 {
	static Class143[] aClass143Array292;
	static int anInt293;
	static int anInt294;
	static int anInt295;
	static int anInt296;
	static int anInt297;
	static int anInt298;
	static int anInt299;

	public static void method818(Class167 class167) {
		Class18.aClass184_190 = ((Class184) Class196.aClass410_2202.method4980(client.anInterface51_11196, -219992997 * anInt295, true, true, (byte) -6));
		Class556.aClass2_7510 = Class196.aClass410_2202.method4981(client.anInterface51_11196, -219992997 * anInt295, -1985074106);
		Class536_Sub15.aClass184_10488 = ((Class184) Class196.aClass410_2202.method4980(client.anInterface51_11196, 1743452435 * anInt298, true, true, (byte) -38));
		Class223.aClass2_2338 = Class196.aClass410_2202.method4981(client.anInterface51_11196, anInt298 * 1743452435, -1648086483);
		Class26.aClass184_248 = ((Class184) Class196.aClass410_2202.method4980(client.anInterface51_11196, anInt294 * 1622294095, true, true, (byte) -108));
		Class260.aClass2_2840 = Class196.aClass410_2202.method4981(client.anInterface51_11196, 1622294095 * anInt294, -1377674527);
	}

	public static void method819(Class167 class167) {
		Class18.aClass184_190 = ((Class184) Class196.aClass410_2202.method4980(client.anInterface51_11196, -219992997 * anInt295, true, true, (byte) -17));
		Class556.aClass2_7510 = Class196.aClass410_2202.method4981(client.anInterface51_11196, -219992997 * anInt295, -491577424);
		Class536_Sub15.aClass184_10488 = ((Class184) Class196.aClass410_2202.method4980(client.anInterface51_11196, 1743452435 * anInt298, true, true, (byte) -42));
		Class223.aClass2_2338 = Class196.aClass410_2202.method4981(client.anInterface51_11196, anInt298 * 1743452435, -1233971761);
		Class26.aClass184_248 = ((Class184) Class196.aClass410_2202.method4980(client.anInterface51_11196, anInt294 * 1622294095, true, true, (byte) -124));
		Class260.aClass2_2840 = Class196.aClass410_2202.method4981(client.anInterface51_11196, 1622294095 * anInt294, 115949680);
	}

	public static int method820() {
		return 10;
	}

	Class35() throws Throwable {
		throw new Error();
	}

	static final void method821(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_0_, -689214737);
		Class70.method1115(class251, class668, 1952215897);
	}

	static final void method822(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	static final void method823(Class668 class668, byte i) {
		int i_1_ = class668.anIntArray8537[-1640738851 * class668.anInt8564] >> 16;
		int i_2_ = (class668.anIntArray8537[class668.anInt8564 * -1640738851] & 0xffff);
		int i_3_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (i_3_ < 0 || i_3_ > 5000)
			throw new RuntimeException();
		class668.anIntArray8539[i_1_] = i_3_;
		int i_4_ = -1;
		if (i_2_ == Class453.aClass453_5008.method78())
			i_4_ = 0;
		for (int i_5_ = 0; i_5_ < i_3_; i_5_++)
			class668.anIntArrayArray8536[i_1_][i_5_] = i_4_;
	}
}
