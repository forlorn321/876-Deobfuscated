/* Class269 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class269 {
	int anInt2877;
	byte[] aByteArray2878;
	static Class461 aClass461_2879;
	public static int anInt2880;

	Class269(byte[] is) {
		aByteArray2878 = is;
		anInt2877 = 0;
	}

	int method3705(int i) {
		short i_0_ = 0;
		for (int i_1_ = 0; i_1_ < 2; i_1_++)
			i_0_ |= (aByteArray2878[(anInt2877 += -1968479931) * 259000717 - 1] & 0xff) << 8 * i_1_;
		return i_0_;
	}

	String method3706() {
		int i = method3705(-1478885323);
		if (i == -1)
			return null;
		if (i > 256)
			throw new RuntimeException_Sub2();
		String string = new String(aByteArray2878, 259000717 * anInt2877, i);
		anInt2877 += i * -1968479931;
		return string;
	}

	int method3707() {
		short i = 0;
		for (int i_2_ = 0; i_2_ < 2; i_2_++)
			i |= (aByteArray2878[(anInt2877 += -1968479931) * 259000717 - 1] & 0xff) << 8 * i_2_;
		return i;
	}

	String method3708() {
		int i = method3705(-1003892083);
		if (i == -1)
			return null;
		if (i > 256)
			throw new RuntimeException_Sub2();
		String string = new String(aByteArray2878, 259000717 * anInt2877, i);
		anInt2877 += i * -1968479931;
		return string;
	}

	String method3709(int i) {
		int i_3_ = method3705(-910932233);
		if (i_3_ == -1)
			return null;
		if (i_3_ > 256)
			throw new RuntimeException_Sub2();
		String string = new String(aByteArray2878, 259000717 * anInt2877, i_3_);
		anInt2877 += i_3_ * -1968479931;
		return string;
	}

	public static void method3710(String string, byte i) {
		Class635.method7564(0, 0, "", "", "", string, null, -1538266173);
	}

	static final void method3711(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ClientSetting.aClass536_Sub40_8843.groundBlendingSetting.method10171(-498458505) == 1 ? 1 : 0;
	}

	static final void method3712(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_4_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_5_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		int i_6_ = client.aClass485ArrayArray11266[i_5_][i_4_].method5851(-224091979);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 5 == i_6_ ? 1 : 0;
	}
}
