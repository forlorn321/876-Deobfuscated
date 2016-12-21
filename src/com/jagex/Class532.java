/* Class532 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class532 {
	static Interface46 anInterface46_7121;
	public static Class98_Sub1_Sub1 aClass98_Sub1_Sub1_7122;
	static Class143 aClass143_7123;
	static boolean aBool7124;

	Class532() throws Throwable {
		throw new Error();
	}

	static final void method6442(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_0_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_1_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		Class536_Sub36 class536_sub36 = (Class536_Sub36) client.aClass4_11008.method556((long) i_0_);
		if (null != class536_sub36 && i_1_ == -358726121 * class536_sub36.anInt10634)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	static final void method6443(Class668 class668, byte i) {
		Class710.aClass536_Sub40_8843.method9857(Class710.aClass536_Sub40_8843.aClass710_Sub3_10754, (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) == 1 ? 2 : 0, (byte) 1);
		client.aClass515_11066.method6319(-1900259270);
		Class27.method763(2057957788);
		client.aBool11015 = false;
	}

	static final void method6444(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.aClass231_11088.method3305(522657369);
	}

	static final void method6445(Class536_Sub33_Sub2 class536_sub33_sub2, int i) {
		int i_2_ = 0;
		class536_sub33_sub2.method10779((byte) 127);
		for (int i_3_ = 0; i_3_ < -1482773169 * Class95.anInt1156; i_3_++) {
			int i_4_ = Class95.anIntArray1157[i_3_];
			if (0 == (Class95.aByteArray1152[i_4_] & 0x1)) {
				if (i_2_ > 0) {
					i_2_--;
					Class95.aByteArray1152[i_4_] |= 0x2;
				} else {
					int i_5_ = class536_sub33_sub2.method10780(1, 1924300109);
					if (0 == i_5_) {
						i_2_ = Class300.method4026(class536_sub33_sub2, 1877429273);
						Class95.aByteArray1152[i_4_] |= 0x2;
					} else
						Class69.method1093(class536_sub33_sub2, i_4_, (byte) 65);
				}
			}
		}
		class536_sub33_sub2.method10781(-1962796354);
		if (i_2_ != 0)
			throw new RuntimeException();
		class536_sub33_sub2.method10779((byte) 85);
		for (int i_6_ = 0; i_6_ < Class95.anInt1156 * -1482773169; i_6_++) {
			int i_7_ = Class95.anIntArray1157[i_6_];
			if (0 != (Class95.aByteArray1152[i_7_] & 0x1)) {
				if (i_2_ > 0) {
					i_2_--;
					Class95.aByteArray1152[i_7_] |= 0x2;
				} else {
					int i_8_ = class536_sub33_sub2.method10780(1, -124130211);
					if (0 == i_8_) {
						i_2_ = Class300.method4026(class536_sub33_sub2, 1692779408);
						Class95.aByteArray1152[i_7_] |= 0x2;
					} else
						Class69.method1093(class536_sub33_sub2, i_7_, (byte) -26);
				}
			}
		}
		class536_sub33_sub2.method10781(-1798781078);
		if (i_2_ != 0)
			throw new RuntimeException();
		class536_sub33_sub2.method10779((byte) 19);
		for (int i_9_ = 0; i_9_ < Class95.anInt1158 * -745742703; i_9_++) {
			int i_10_ = Class95.anIntArray1159[i_9_];
			if (0 != (Class95.aByteArray1152[i_10_] & 0x1)) {
				if (i_2_ > 0) {
					i_2_--;
					Class95.aByteArray1152[i_10_] |= 0x2;
				} else {
					int i_11_ = class536_sub33_sub2.method10780(1, -780943820);
					if (i_11_ == 0) {
						i_2_ = Class300.method4026(class536_sub33_sub2, 2027133365);
						Class95.aByteArray1152[i_10_] |= 0x2;
					} else if (Class206.method2959(class536_sub33_sub2, i_10_, 1789136226))
						Class95.aByteArray1152[i_10_] |= 0x2;
				}
			}
		}
		class536_sub33_sub2.method10781(-1492178126);
		if (i_2_ != 0)
			throw new RuntimeException();
		class536_sub33_sub2.method10779((byte) 112);
		for (int i_12_ = 0; i_12_ < Class95.anInt1158 * -745742703; i_12_++) {
			int i_13_ = Class95.anIntArray1159[i_12_];
			if ((Class95.aByteArray1152[i_13_] & 0x1) == 0) {
				if (i_2_ > 0) {
					i_2_--;
					Class95.aByteArray1152[i_13_] |= 0x2;
				} else {
					int i_14_ = class536_sub33_sub2.method10780(1, 930571082);
					if (0 == i_14_) {
						i_2_ = Class300.method4026(class536_sub33_sub2, 1862362898);
						Class95.aByteArray1152[i_13_] |= 0x2;
					} else if (Class206.method2959(class536_sub33_sub2, i_13_, 1869404084))
						Class95.aByteArray1152[i_13_] |= 0x2;
				}
			}
		}
		class536_sub33_sub2.method10781(-1378748980);
		if (0 != i_2_)
			throw new RuntimeException();
		Class95.anInt1156 = 0;
		Class95.anInt1158 = 0;
		for (int i_15_ = 1; i_15_ < 2048; i_15_++) {
			Class95.aByteArray1152[i_15_] >>= 1;
			Class649_Sub1_Sub5_Sub1_Sub2 class649_sub1_sub5_sub1_sub2 = client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i_15_];
			if (null != class649_sub1_sub5_sub1_sub2)
				Class95.anIntArray1157[(Class95.anInt1156 += 1948535215) * -1482773169 - 1] = i_15_;
			else
				Class95.anIntArray1159[(Class95.anInt1158 += 190489201) * -745742703 - 1] = i_15_;
		}
	}

	public static void method6446(int[] is, Object[] objects, short i) {
		Class455.method5477(is, objects, 0, is.length - 1, 1378473377);
	}
}
