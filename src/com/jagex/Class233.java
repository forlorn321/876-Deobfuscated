/* Class233 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class233 {
	int anInt2363;
	int anInt2364;
	int[] anIntArray2365;
	int[] anIntArray2366;
	int[] anIntArray2367;
	int anInt2368 = 0;
	int anInt2369;
	float[][] aFloatArrayArray2370;

	float[] method4332(Class241 class241) {
		return aFloatArrayArray2370[method4337(class241)];
	}

	static int method4333(int i, int i_0_) {
		int i_1_ = (int) Math.pow((double) i, 1.0 / (double) i_0_) + 1;
		for (;;) {
			int i_2_ = i_1_;
			int i_3_ = i_0_;
			int i_4_ = 1;
			for (/**/; i_3_ > 1; i_3_ >>= 1) {
				if (0 != (i_3_ & 0x1))
					i_4_ *= i_2_;
				i_2_ *= i_2_;
			}
			int i_5_;
			if (1 == i_3_)
				i_5_ = i_4_ * i_2_;
			else
				i_5_ = i_4_;
			if (i_5_ <= i)
				break;
			i_1_--;
		}
		return i_1_;
	}

	void method4334(Class241 class241) {
		class241.method4413(anInt2368 * 8 + anInt2364);
	}

	void method4335(Class241 class241) {
		int i = class241.method4415();
		int i_6_ = class241.method4423();
		class241.method4413(24);
		anInt2369 = class241.method4413(16);
		anInt2363 = class241.method4413(24);
		if (anIntArray2366 == null || anIntArray2366.length != anInt2363)
			anIntArray2366 = new int[anInt2363];
		boolean bool = class241.method4416() != 0;
		if (bool) {
			int i_7_ = 0;
			int i_8_ = class241.method4413(5) + 1;
			while (i_7_ < anInt2363) {
				int i_9_ = class241.method4413(Class15.method735(anInt2363 - i_7_, (byte) -93));
				for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
					anIntArray2366[i_7_++] = i_8_;
				i_8_++;
			}
		} else {
			boolean bool_11_ = class241.method4416() != 0;
			for (int i_12_ = 0; i_12_ < anInt2363; i_12_++) {
				if (bool_11_ && class241.method4416() == 0)
					anIntArray2366[i_12_] = 0;
				else
					anIntArray2366[i_12_] = class241.method4413(5) + 1;
			}
		}
		method4336();
		int i_13_ = class241.method4413(4);
		if (i_13_ > 0) {
			float f = class241.method4454(class241.method4413(32));
			float f_14_ = class241.method4454(class241.method4413(32));
			int i_15_ = class241.method4413(4) + 1;
			boolean bool_16_ = class241.method4416() != 0;
			int i_17_;
			if (i_13_ == 1)
				i_17_ = method4333(anInt2363, anInt2369);
			else
				i_17_ = anInt2363 * anInt2369;
			anIntArray2367 = new int[i_17_];
			for (int i_18_ = 0; i_18_ < i_17_; i_18_++)
				anIntArray2367[i_18_] = class241.method4413(i_15_);
			aFloatArrayArray2370 = new float[anInt2363][anInt2369];
			if (i_13_ == 1) {
				for (int i_19_ = 0; i_19_ < anInt2363; i_19_++) {
					float f_20_ = 0.0F;
					int i_21_ = 1;
					for (int i_22_ = 0; i_22_ < anInt2369; i_22_++) {
						int i_23_ = i_19_ / i_21_ % i_17_;
						float f_24_ = ((float) anIntArray2367[i_23_] * f_14_ + f + f_20_);
						aFloatArrayArray2370[i_19_][i_22_] = f_24_;
						if (bool_16_)
							f_20_ = f_24_;
						i_21_ *= i_17_;
					}
				}
			} else {
				for (int i_25_ = 0; i_25_ < anInt2363; i_25_++) {
					float f_26_ = 0.0F;
					int i_27_ = i_25_ * anInt2369;
					for (int i_28_ = 0; i_28_ < anInt2369; i_28_++) {
						float f_29_ = ((float) anIntArray2367[i_27_] * f_14_ + f + f_26_);
						aFloatArrayArray2370[i_25_][i_28_] = f_29_;
						if (bool_16_)
							f_26_ = f_29_;
						i_27_++;
					}
				}
			}
		}
		anInt2364 = class241.method4415() - i;
		anInt2368 = class241.method4423() - i_6_;
	}

	void method4336() {
		int[] is = new int[anInt2363];
		int[] is_30_ = new int[33];
		for (int i = 0; i < anInt2363; i++) {
			int i_31_ = anIntArray2366[i];
			if (i_31_ != 0) {
				int i_32_ = 1 << 32 - i_31_;
				int i_33_ = is_30_[i_31_];
				is[i] = i_33_;
				int i_34_;
				if ((i_33_ & i_32_) != 0)
					i_34_ = is_30_[i_31_ - 1];
				else {
					i_34_ = i_33_ | i_32_;
					for (int i_35_ = i_31_ - 1; i_35_ >= 1; i_35_--) {
						int i_36_ = is_30_[i_35_];
						if (i_36_ != i_33_)
							break;
						int i_37_ = 1 << 32 - i_35_;
						if ((i_36_ & i_37_) != 0) {
							is_30_[i_35_] = is_30_[i_35_ - 1];
							break;
						}
						is_30_[i_35_] = i_36_ | i_37_;
					}
				}
				is_30_[i_31_] = i_34_;
				for (int i_38_ = i_31_ + 1; i_38_ <= 32; i_38_++) {
					int i_39_ = is_30_[i_38_];
					if (i_39_ == i_33_)
						is_30_[i_38_] = i_34_;
				}
			}
		}
		anIntArray2365 = new int[8];
		int i = 0;
		for (int i_40_ = 0; i_40_ < anInt2363; i_40_++) {
			int i_41_ = anIntArray2366[i_40_];
			if (i_41_ != 0) {
				int i_42_ = is[i_40_];
				int i_43_ = 0;
				for (int i_44_ = 0; i_44_ < i_41_; i_44_++) {
					int i_45_ = -2147483648 >>> i_44_;
					if ((i_42_ & i_45_) != 0) {
						if (anIntArray2365[i_43_] == 0)
							anIntArray2365[i_43_] = i;
						i_43_ = anIntArray2365[i_43_];
					} else
						i_43_++;
					if (i_43_ >= anIntArray2365.length) {
						int[] is_46_ = new int[anIntArray2365.length * 2];
						for (int i_47_ = 0; i_47_ < anIntArray2365.length; i_47_++)
							is_46_[i_47_] = anIntArray2365[i_47_];
						anIntArray2365 = is_46_;
					}
					i_45_ >>>= 1;
				}
				anIntArray2365[i_43_] = i_40_ ^ 0xffffffff;
				if (i_43_ >= i)
					i = i_43_ + 1;
			}
		}
	}

	int method4337(Class241 class241) {
		int i;
		for (i = 0; anIntArray2365[i] >= 0; i = class241.method4416() != 0 ? anIntArray2365[i] : i + 1) {
			/* empty */
		}
		return anIntArray2365[i] ^ 0xffffffff;
	}

	float[] method4338(Class241 class241) {
		return aFloatArrayArray2370[method4337(class241)];
	}

	static int method4339(int i, int i_48_) {
		int i_49_ = (int) Math.pow((double) i, 1.0 / (double) i_48_) + 1;
		for (;;) {
			int i_50_ = i_49_;
			int i_51_ = i_48_;
			int i_52_ = 1;
			for (/**/; i_51_ > 1; i_51_ >>= 1) {
				if (0 != (i_51_ & 0x1))
					i_52_ *= i_50_;
				i_50_ *= i_50_;
			}
			int i_53_;
			if (1 == i_51_)
				i_53_ = i_52_ * i_50_;
			else
				i_53_ = i_52_;
			if (i_53_ <= i)
				break;
			i_49_--;
		}
		return i_49_;
	}

	static int method4340(int i, int i_54_) {
		int i_55_ = (int) Math.pow((double) i, 1.0 / (double) i_54_) + 1;
		for (;;) {
			int i_56_ = i_55_;
			int i_57_ = i_54_;
			int i_58_ = 1;
			for (/**/; i_57_ > 1; i_57_ >>= 1) {
				if (0 != (i_57_ & 0x1))
					i_58_ *= i_56_;
				i_56_ *= i_56_;
			}
			int i_59_;
			if (1 == i_57_)
				i_59_ = i_58_ * i_56_;
			else
				i_59_ = i_58_;
			if (i_59_ <= i)
				break;
			i_55_--;
		}
		return i_55_;
	}

	void method4341(Class241 class241) {
		class241.method4413(anInt2368 * 8 + anInt2364);
	}

	void method4342(Class241 class241) {
		class241.method4413(anInt2368 * 8 + anInt2364);
	}

	void method4343(Class241 class241) {
		class241.method4413(anInt2368 * 8 + anInt2364);
	}

	Class233() {
		anInt2364 = 0;
	}

	void method4344(Class241 class241) {
		int i = class241.method4415();
		int i_60_ = class241.method4423();
		class241.method4413(24);
		anInt2369 = class241.method4413(16);
		anInt2363 = class241.method4413(24);
		if (anIntArray2366 == null || anIntArray2366.length != anInt2363)
			anIntArray2366 = new int[anInt2363];
		boolean bool = class241.method4416() != 0;
		if (bool) {
			int i_61_ = 0;
			int i_62_ = class241.method4413(5) + 1;
			while (i_61_ < anInt2363) {
				int i_63_ = class241.method4413(Class15.method735(anInt2363 - i_61_, (byte) -20));
				for (int i_64_ = 0; i_64_ < i_63_; i_64_++)
					anIntArray2366[i_61_++] = i_62_;
				i_62_++;
			}
		} else {
			boolean bool_65_ = class241.method4416() != 0;
			for (int i_66_ = 0; i_66_ < anInt2363; i_66_++) {
				if (bool_65_ && class241.method4416() == 0)
					anIntArray2366[i_66_] = 0;
				else
					anIntArray2366[i_66_] = class241.method4413(5) + 1;
			}
		}
		method4336();
		int i_67_ = class241.method4413(4);
		if (i_67_ > 0) {
			float f = class241.method4454(class241.method4413(32));
			float f_68_ = class241.method4454(class241.method4413(32));
			int i_69_ = class241.method4413(4) + 1;
			boolean bool_70_ = class241.method4416() != 0;
			int i_71_;
			if (i_67_ == 1)
				i_71_ = method4333(anInt2363, anInt2369);
			else
				i_71_ = anInt2363 * anInt2369;
			anIntArray2367 = new int[i_71_];
			for (int i_72_ = 0; i_72_ < i_71_; i_72_++)
				anIntArray2367[i_72_] = class241.method4413(i_69_);
			aFloatArrayArray2370 = new float[anInt2363][anInt2369];
			if (i_67_ == 1) {
				for (int i_73_ = 0; i_73_ < anInt2363; i_73_++) {
					float f_74_ = 0.0F;
					int i_75_ = 1;
					for (int i_76_ = 0; i_76_ < anInt2369; i_76_++) {
						int i_77_ = i_73_ / i_75_ % i_71_;
						float f_78_ = ((float) anIntArray2367[i_77_] * f_68_ + f + f_74_);
						aFloatArrayArray2370[i_73_][i_76_] = f_78_;
						if (bool_70_)
							f_74_ = f_78_;
						i_75_ *= i_71_;
					}
				}
			} else {
				for (int i_79_ = 0; i_79_ < anInt2363; i_79_++) {
					float f_80_ = 0.0F;
					int i_81_ = i_79_ * anInt2369;
					for (int i_82_ = 0; i_82_ < anInt2369; i_82_++) {
						float f_83_ = ((float) anIntArray2367[i_81_] * f_68_ + f + f_80_);
						aFloatArrayArray2370[i_79_][i_82_] = f_83_;
						if (bool_70_)
							f_80_ = f_83_;
						i_81_++;
					}
				}
			}
		}
		anInt2364 = class241.method4415() - i;
		anInt2368 = class241.method4423() - i_60_;
	}

	void method4345() {
		int[] is = new int[anInt2363];
		int[] is_84_ = new int[33];
		for (int i = 0; i < anInt2363; i++) {
			int i_85_ = anIntArray2366[i];
			if (i_85_ != 0) {
				int i_86_ = 1 << 32 - i_85_;
				int i_87_ = is_84_[i_85_];
				is[i] = i_87_;
				int i_88_;
				if ((i_87_ & i_86_) != 0)
					i_88_ = is_84_[i_85_ - 1];
				else {
					i_88_ = i_87_ | i_86_;
					for (int i_89_ = i_85_ - 1; i_89_ >= 1; i_89_--) {
						int i_90_ = is_84_[i_89_];
						if (i_90_ != i_87_)
							break;
						int i_91_ = 1 << 32 - i_89_;
						if ((i_90_ & i_91_) != 0) {
							is_84_[i_89_] = is_84_[i_89_ - 1];
							break;
						}
						is_84_[i_89_] = i_90_ | i_91_;
					}
				}
				is_84_[i_85_] = i_88_;
				for (int i_92_ = i_85_ + 1; i_92_ <= 32; i_92_++) {
					int i_93_ = is_84_[i_92_];
					if (i_93_ == i_87_)
						is_84_[i_92_] = i_88_;
				}
			}
		}
		anIntArray2365 = new int[8];
		int i = 0;
		for (int i_94_ = 0; i_94_ < anInt2363; i_94_++) {
			int i_95_ = anIntArray2366[i_94_];
			if (i_95_ != 0) {
				int i_96_ = is[i_94_];
				int i_97_ = 0;
				for (int i_98_ = 0; i_98_ < i_95_; i_98_++) {
					int i_99_ = -2147483648 >>> i_98_;
					if ((i_96_ & i_99_) != 0) {
						if (anIntArray2365[i_97_] == 0)
							anIntArray2365[i_97_] = i;
						i_97_ = anIntArray2365[i_97_];
					} else
						i_97_++;
					if (i_97_ >= anIntArray2365.length) {
						int[] is_100_ = new int[anIntArray2365.length * 2];
						for (int i_101_ = 0; i_101_ < anIntArray2365.length; i_101_++)
							is_100_[i_101_] = anIntArray2365[i_101_];
						anIntArray2365 = is_100_;
					}
					i_99_ >>>= 1;
				}
				anIntArray2365[i_97_] = i_94_ ^ 0xffffffff;
				if (i_97_ >= i)
					i = i_97_ + 1;
			}
		}
	}

	float[] method4346(Class241 class241) {
		return aFloatArrayArray2370[method4337(class241)];
	}
}
