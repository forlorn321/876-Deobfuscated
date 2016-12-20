/* Class251 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class251 {
	int[] anIntArray2784;
	int anInt2785;
	int anInt2786;
	int anInt2787;
	int anInt2788;
	int anInt2789;
	int anInt2790;
	int[] anIntArray2791;
	Class241 aClass241_2792;
	int[][] anIntArrayArray2793;

	void method4664(Class241 class241) {
		aClass241_2792 = class241;
		anInt2785 = aClass241_2792.method4413(16);
		anInt2787 = aClass241_2792.method4413(24);
		anInt2786 = aClass241_2792.method4413(24);
		anInt2790 = aClass241_2792.method4413(24) + 1;
		anInt2788 = aClass241_2792.method4413(6) + 1;
		anInt2789 = aClass241_2792.method4413(8);
		if (anIntArray2791 == null || anIntArray2791.length != anInt2788)
			anIntArray2791 = new int[anInt2788];
		for (int i = 0; i < anInt2788; i++) {
			int i_0_ = 0;
			int i_1_ = aClass241_2792.method4413(3);
			boolean bool = aClass241_2792.method4416() != 0;
			if (bool)
				i_0_ = aClass241_2792.method4413(5);
			anIntArray2791[i] = i_0_ << 3 | i_1_;
		}
		if (anIntArray2784 == null || anIntArray2784.length != anInt2788 * 8)
			anIntArray2784 = new int[anInt2788 * 8];
		for (int i = 0; i < anInt2788 * 8; i++)
			anIntArray2784[i] = ((anIntArray2791[i >> 3] & 1 << (i & 0x7)) != 0 ? aClass241_2792.method4413(8) : -1);
	}

	Class251() {
		/* empty */
	}

	void method4665(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}

	Class250[] method4666(Class250[] class250s, int i, boolean[] bools) {
		int i_2_ = class250s.length;
		for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
			if (!bools[i_3_]) {
				for (int i_4_ = 0; i_4_ < i; i_4_++)
					class250s[i_3_].aFloatArray2781[i_4_] = 0.0F;
			}
		}
		int i_5_ = aClass241_2792.aClass233Array2444[anInt2789].anInt2369;
		int i_6_ = anInt2786 - anInt2787;
		int i_7_ = i_6_ / anInt2790;
		if (anIntArrayArray2793 == null || anIntArrayArray2793.length != i_2_ || anIntArrayArray2793[0].length != i_7_)
			anIntArrayArray2793 = new int[i_2_][i_7_];
		else {
			for (int i_8_ = 0; i_8_ < i_2_; i_8_++)
				method4665(anIntArrayArray2793[i_8_]);
		}
		for (int i_9_ = 0; i_9_ < 8; i_9_++) {
			int i_10_ = 0;
			while (i_10_ < i_7_) {
				if (i_9_ == 0) {
					for (int i_11_ = 0; i_11_ < i_2_; i_11_++) {
						if (!bools[i_11_]) {
							int i_12_ = aClass241_2792.aClass233Array2444[anInt2789].method4337(aClass241_2792);
							for (int i_13_ = i_5_ - 1; i_13_ >= 0; i_13_--) {
								if (i_10_ + i_13_ < i_7_)
									anIntArrayArray2793[i_11_][i_10_ + i_13_] = i_12_ % anInt2788;
								i_12_ /= anInt2788;
							}
						}
					}
				}
				for (int i_14_ = 0; i_14_ < i_5_; i_14_++) {
					for (int i_15_ = 0; i_15_ < i_2_; i_15_++) {
						if (!bools[i_15_]) {
							int i_16_ = anIntArrayArray2793[i_15_][i_10_];
							int i_17_ = anIntArray2784[i_16_ * 8 + i_9_];
							if (i_17_ >= 0) {
								int i_18_ = anInt2787 + i_10_ * anInt2790;
								Class233 class233 = aClass241_2792.aClass233Array2444[i_17_];
								if (anInt2785 == 0) {
									int i_19_ = anInt2790 / class233.anInt2369;
									for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
										float[] fs = class233.method4338(aClass241_2792);
										for (int i_21_ = 0; i_21_ < class233.anInt2369; i_21_++)
											class250s[i_15_].aFloatArray2781[i_18_ + i_20_ + i_21_ * i_19_] += fs[i_21_];
									}
								} else if (anInt2785 == 1 || anInt2785 == 2) {
									int i_22_ = 0;
									while (i_22_ < anInt2790) {
										float[] fs = class233.method4338(aClass241_2792);
										for (int i_23_ = 0; i_23_ < class233.anInt2369; i_23_++) {
											class250s[i_15_].aFloatArray2781[i_18_ + i_22_] += fs[i_23_];
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
		return class250s;
	}

	void method4667(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}

	void method4668(Class241 class241) {
		aClass241_2792 = class241;
		anInt2785 = aClass241_2792.method4413(16);
		anInt2787 = aClass241_2792.method4413(24);
		anInt2786 = aClass241_2792.method4413(24);
		anInt2790 = aClass241_2792.method4413(24) + 1;
		anInt2788 = aClass241_2792.method4413(6) + 1;
		anInt2789 = aClass241_2792.method4413(8);
		if (anIntArray2791 == null || anIntArray2791.length != anInt2788)
			anIntArray2791 = new int[anInt2788];
		for (int i = 0; i < anInt2788; i++) {
			int i_24_ = 0;
			int i_25_ = aClass241_2792.method4413(3);
			boolean bool = aClass241_2792.method4416() != 0;
			if (bool)
				i_24_ = aClass241_2792.method4413(5);
			anIntArray2791[i] = i_24_ << 3 | i_25_;
		}
		if (anIntArray2784 == null || anIntArray2784.length != anInt2788 * 8)
			anIntArray2784 = new int[anInt2788 * 8];
		for (int i = 0; i < anInt2788 * 8; i++)
			anIntArray2784[i] = ((anIntArray2791[i >> 3] & 1 << (i & 0x7)) != 0 ? aClass241_2792.method4413(8) : -1);
	}

	void method4669(Class241 class241) {
		aClass241_2792 = class241;
		anInt2785 = aClass241_2792.method4413(16);
		anInt2787 = aClass241_2792.method4413(24);
		anInt2786 = aClass241_2792.method4413(24);
		anInt2790 = aClass241_2792.method4413(24) + 1;
		anInt2788 = aClass241_2792.method4413(6) + 1;
		anInt2789 = aClass241_2792.method4413(8);
		if (anIntArray2791 == null || anIntArray2791.length != anInt2788)
			anIntArray2791 = new int[anInt2788];
		for (int i = 0; i < anInt2788; i++) {
			int i_26_ = 0;
			int i_27_ = aClass241_2792.method4413(3);
			boolean bool = aClass241_2792.method4416() != 0;
			if (bool)
				i_26_ = aClass241_2792.method4413(5);
			anIntArray2791[i] = i_26_ << 3 | i_27_;
		}
		if (anIntArray2784 == null || anIntArray2784.length != anInt2788 * 8)
			anIntArray2784 = new int[anInt2788 * 8];
		for (int i = 0; i < anInt2788 * 8; i++)
			anIntArray2784[i] = ((anIntArray2791[i >> 3] & 1 << (i & 0x7)) != 0 ? aClass241_2792.method4413(8) : -1);
	}

	void method4670(Class241 class241) {
		aClass241_2792 = class241;
		anInt2785 = aClass241_2792.method4413(16);
		anInt2787 = aClass241_2792.method4413(24);
		anInt2786 = aClass241_2792.method4413(24);
		anInt2790 = aClass241_2792.method4413(24) + 1;
		anInt2788 = aClass241_2792.method4413(6) + 1;
		anInt2789 = aClass241_2792.method4413(8);
		if (anIntArray2791 == null || anIntArray2791.length != anInt2788)
			anIntArray2791 = new int[anInt2788];
		for (int i = 0; i < anInt2788; i++) {
			int i_28_ = 0;
			int i_29_ = aClass241_2792.method4413(3);
			boolean bool = aClass241_2792.method4416() != 0;
			if (bool)
				i_28_ = aClass241_2792.method4413(5);
			anIntArray2791[i] = i_28_ << 3 | i_29_;
		}
		if (anIntArray2784 == null || anIntArray2784.length != anInt2788 * 8)
			anIntArray2784 = new int[anInt2788 * 8];
		for (int i = 0; i < anInt2788 * 8; i++)
			anIntArray2784[i] = ((anIntArray2791[i >> 3] & 1 << (i & 0x7)) != 0 ? aClass241_2792.method4413(8) : -1);
	}

	void method4671(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}

	Class250[] method4672(Class250[] class250s, int i, boolean[] bools) {
		int i_30_ = class250s.length;
		for (int i_31_ = 0; i_31_ < i_30_; i_31_++) {
			if (!bools[i_31_]) {
				for (int i_32_ = 0; i_32_ < i; i_32_++)
					class250s[i_31_].aFloatArray2781[i_32_] = 0.0F;
			}
		}
		int i_33_ = aClass241_2792.aClass233Array2444[anInt2789].anInt2369;
		int i_34_ = anInt2786 - anInt2787;
		int i_35_ = i_34_ / anInt2790;
		if (anIntArrayArray2793 == null || anIntArrayArray2793.length != i_30_ || anIntArrayArray2793[0].length != i_35_)
			anIntArrayArray2793 = new int[i_30_][i_35_];
		else {
			for (int i_36_ = 0; i_36_ < i_30_; i_36_++)
				method4665(anIntArrayArray2793[i_36_]);
		}
		for (int i_37_ = 0; i_37_ < 8; i_37_++) {
			int i_38_ = 0;
			while (i_38_ < i_35_) {
				if (i_37_ == 0) {
					for (int i_39_ = 0; i_39_ < i_30_; i_39_++) {
						if (!bools[i_39_]) {
							int i_40_ = aClass241_2792.aClass233Array2444[anInt2789].method4337(aClass241_2792);
							for (int i_41_ = i_33_ - 1; i_41_ >= 0; i_41_--) {
								if (i_38_ + i_41_ < i_35_)
									anIntArrayArray2793[i_39_][i_38_ + i_41_] = i_40_ % anInt2788;
								i_40_ /= anInt2788;
							}
						}
					}
				}
				for (int i_42_ = 0; i_42_ < i_33_; i_42_++) {
					for (int i_43_ = 0; i_43_ < i_30_; i_43_++) {
						if (!bools[i_43_]) {
							int i_44_ = anIntArrayArray2793[i_43_][i_38_];
							int i_45_ = anIntArray2784[i_44_ * 8 + i_37_];
							if (i_45_ >= 0) {
								int i_46_ = anInt2787 + i_38_ * anInt2790;
								Class233 class233 = aClass241_2792.aClass233Array2444[i_45_];
								if (anInt2785 == 0) {
									int i_47_ = anInt2790 / class233.anInt2369;
									for (int i_48_ = 0; i_48_ < i_47_; i_48_++) {
										float[] fs = class233.method4338(aClass241_2792);
										for (int i_49_ = 0; i_49_ < class233.anInt2369; i_49_++)
											class250s[i_43_].aFloatArray2781[i_46_ + i_48_ + i_49_ * i_47_] += fs[i_49_];
									}
								} else if (anInt2785 == 1 || anInt2785 == 2) {
									int i_50_ = 0;
									while (i_50_ < anInt2790) {
										float[] fs = class233.method4338(aClass241_2792);
										for (int i_51_ = 0; i_51_ < class233.anInt2369; i_51_++) {
											class250s[i_43_].aFloatArray2781[i_46_ + i_50_] += fs[i_51_];
											i_50_++;
										}
									}
								}
							}
						}
					}
					if (++i_38_ >= i_35_)
						break;
				}
			}
		}
		return class250s;
	}
}
