/* Class281 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class281 {
	int[] anIntArray3188;
	static int anInt3189;

	public int method5180(int i) {
		int i_0_ = (anIntArray3188.length >> 1) - 1;
		int i_1_ = i & i_0_;
		for (;;) {
			int i_2_ = anIntArray3188[1 + (i_1_ + i_1_)];
			if (i_2_ == -1)
				return -1;
			if (i == anIntArray3188[i_1_ + i_1_])
				return i_2_;
			i_1_ = i_1_ + 1 & i_0_;
		}
	}

	public int method5181(int i, byte i_3_) {
		int i_4_ = (anIntArray3188.length >> 1) - 1;
		int i_5_ = i & i_4_;
		for (;;) {
			int i_6_ = anIntArray3188[1 + (i_5_ + i_5_)];
			if (i_6_ == -1)
				return -1;
			if (i == anIntArray3188[i_5_ + i_5_])
				return i_6_;
			i_5_ = i_5_ + 1 & i_4_;
		}
	}

	public int method5182(int i) {
		int i_7_ = (anIntArray3188.length >> 1) - 1;
		int i_8_ = i & i_7_;
		for (;;) {
			int i_9_ = anIntArray3188[1 + (i_8_ + i_8_)];
			if (i_9_ == -1)
				return -1;
			if (i == anIntArray3188[i_8_ + i_8_])
				return i_9_;
			i_8_ = i_8_ + 1 & i_7_;
		}
	}

	public Class281(int[] is) {
		int i;
		for (i = 1; i <= (is.length >> 1) + is.length; i <<= 1) {
			/* empty */
		}
		anIntArray3188 = new int[i + i];
		for (int i_10_ = 0; i_10_ < i + i; i_10_++)
			anIntArray3188[i_10_] = -1;
		for (int i_11_ = 0; i_11_ < is.length; i_11_++) {
			int i_12_;
			for (i_12_ = is[i_11_] & i - 1; -1 != anIntArray3188[1 + (i_12_ + i_12_)]; i_12_ = i_12_ + 1 & i - 1) {
				/* empty */
			}
			anIntArray3188[i_12_ + i_12_] = is[i_11_];
			anIntArray3188[1 + (i_12_ + i_12_)] = i_11_;
		}
	}

	public int method5183(int i) {
		int i_13_ = (anIntArray3188.length >> 1) - 1;
		int i_14_ = i & i_13_;
		for (;;) {
			int i_15_ = anIntArray3188[1 + (i_14_ + i_14_)];
			if (i_15_ == -1)
				return -1;
			if (i == anIntArray3188[i_14_ + i_14_])
				return i_15_;
			i_14_ = i_14_ + 1 & i_13_;
		}
	}

	static boolean method5184(int i) {
		if (Class35.aClass527_Sub8_Sub7_345 == null)
			return false;
		if (Class35.aClass527_Sub8_Sub7_345.anInt11652 * 1720667579 >= 2000)
			Class35.aClass527_Sub8_Sub7_345.anInt11652 -= -492391824;
		if (1007 == 1720667579 * Class35.aClass527_Sub8_Sub7_345.anInt11652)
			return true;
		return false;
	}

	static final void method5185(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 236302803 * class243.anInt2576;
	}

	public static boolean method5186(CharSequence charsequence, int i) {
		return Class208_Sub3.method15608(charsequence, 10, true, (byte) -35);
	}

	static void method5187(int i, int i_16_, int i_17_, int i_18_) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(11, (long) i);
		class527_sub8_sub9.method18187(206302653);
		class527_sub8_sub9.anInt11676 = -281159195 * i_16_;
		class527_sub8_sub9.anInt11667 = i_17_ * -164049787;
	}
}
