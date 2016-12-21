/* Class240 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class240 {
	int anInt2445;
	int anInt2446;
	int anInt2447;
	int anInt2448;
	int anInt2449;
	int anInt2450;
	int[] anIntArray2451;
	int[] anIntArray2452;
	Class258 aClass258_2453;
	int[][] anIntArrayArray2454;

	Class240() {
		/* empty */
	}

	void method3380(Class258 class258) {
		aClass258_2453 = class258;
		anInt2450 = aClass258_2453.method3563(16);
		anInt2446 = aClass258_2453.method3563(24);
		anInt2447 = aClass258_2453.method3563(24);
		anInt2448 = aClass258_2453.method3563(24) + 1;
		anInt2445 = aClass258_2453.method3563(6) + 1;
		anInt2449 = aClass258_2453.method3563(8);
		if (anIntArray2452 == null || anIntArray2452.length != anInt2445)
			anIntArray2452 = new int[anInt2445];
		for (int i = 0; i < anInt2445; i++) {
			int i_0_ = 0;
			int i_1_ = aClass258_2453.method3563(3);
			boolean bool = aClass258_2453.method3590() != 0;
			if (bool)
				i_0_ = aClass258_2453.method3563(5);
			anIntArray2452[i] = i_0_ << 3 | i_1_;
		}
		if (anIntArray2451 == null || anIntArray2451.length != anInt2445 * 8)
			anIntArray2451 = new int[anInt2445 * 8];
		for (int i = 0; i < anInt2445 * 8; i++)
			anIntArray2451[i] = ((anIntArray2452[i >> 3] & 1 << (i & 0x7)) != 0 ? aClass258_2453.method3563(8) : -1);
	}

	void method3381(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}

	Class235[] method3382(Class235[] class235s, int i, boolean[] bools) {
		int i_2_ = class235s.length;
		for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
			if (!bools[i_3_]) {
				for (int i_4_ = 0; i_4_ < i; i_4_++)
					class235s[i_3_].aFloatArray2382[i_4_] = 0.0F;
			}
		}
		int i_5_ = aClass258_2453.aClass253Array2785[anInt2449].anInt2748;
		int i_6_ = anInt2447 - anInt2446;
		int i_7_ = i_6_ / anInt2448;
		if (anIntArrayArray2454 == null || anIntArrayArray2454.length != i_2_ || anIntArrayArray2454[0].length != i_7_)
			anIntArrayArray2454 = new int[i_2_][i_7_];
		else {
			for (int i_8_ = 0; i_8_ < i_2_; i_8_++)
				method3381(anIntArrayArray2454[i_8_]);
		}
		for (int i_9_ = 0; i_9_ < 8; i_9_++) {
			int i_10_ = 0;
			while (i_10_ < i_7_) {
				if (i_9_ == 0) {
					for (int i_11_ = 0; i_11_ < i_2_; i_11_++) {
						if (!bools[i_11_]) {
							int i_12_ = aClass258_2453.aClass253Array2785[anInt2449].method3528(aClass258_2453);
							for (int i_13_ = i_5_ - 1; i_13_ >= 0; i_13_--) {
								if (i_10_ + i_13_ < i_7_)
									anIntArrayArray2454[i_11_][i_10_ + i_13_] = i_12_ % anInt2445;
								i_12_ /= anInt2445;
							}
						}
					}
				}
				for (int i_14_ = 0; i_14_ < i_5_; i_14_++) {
					for (int i_15_ = 0; i_15_ < i_2_; i_15_++) {
						if (!bools[i_15_]) {
							int i_16_ = anIntArrayArray2454[i_15_][i_10_];
							int i_17_ = anIntArray2451[i_16_ * 8 + i_9_];
							if (i_17_ >= 0) {
								int i_18_ = anInt2446 + i_10_ * anInt2448;
								Class253 class253 = aClass258_2453.aClass253Array2785[i_17_];
								if (anInt2450 == 0) {
									int i_19_ = anInt2448 / class253.anInt2748;
									for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
										float[] fs = class253.method3529(aClass258_2453);
										for (int i_21_ = 0; i_21_ < class253.anInt2748; i_21_++)
											class235s[i_15_].aFloatArray2382[i_18_ + i_20_ + i_21_ * i_19_] += fs[i_21_];
									}
								} else if (anInt2450 == 1 || anInt2450 == 2) {
									int i_22_ = 0;
									while (i_22_ < anInt2448) {
										float[] fs = class253.method3529(aClass258_2453);
										for (int i_23_ = 0; i_23_ < class253.anInt2748; i_23_++) {
											class235s[i_15_].aFloatArray2382[i_18_ + i_22_] += fs[i_23_];
											i_22_++;
										}
									}
								}
							}
						}
					}
					if (++i_10_ >= i_7_)
						break;
				}
			}
		}
		return class235s;
	}

	void method3383(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}
}
