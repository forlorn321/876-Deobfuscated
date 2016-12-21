/* Class253 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class253 {
	int[] anIntArray2747;
	int anInt2748;
	int[] anIntArray2749;
	int anInt2750;
	float[][] aFloatArrayArray2751;
	int anInt2752 = 0;
	int anInt2753 = 0;
	int[] anIntArray2754;

	static int method3523(int i, int i_0_) {
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
				i_5_ = i_2_ * i_4_;
			else
				i_5_ = i_4_;
			if (i_5_ <= i)
				break;
			i_1_--;
		}
		return i_1_;
	}

	void method3524() {
		int[] is = new int[anInt2750];
		int[] is_6_ = new int[33];
		for (int i = 0; i < anInt2750; i++) {
			int i_7_ = anIntArray2754[i];
			if (i_7_ != 0) {
				int i_8_ = 1 << 32 - i_7_;
				int i_9_ = is_6_[i_7_];
				is[i] = i_9_;
				int i_10_;
				if ((i_9_ & i_8_) != 0)
					i_10_ = is_6_[i_7_ - 1];
				else {
					i_10_ = i_9_ | i_8_;
					for (int i_11_ = i_7_ - 1; i_11_ >= 1; i_11_--) {
						int i_12_ = is_6_[i_11_];
						if (i_12_ != i_9_)
							break;
						int i_13_ = 1 << 32 - i_11_;
						if ((i_12_ & i_13_) != 0) {
							is_6_[i_11_] = is_6_[i_11_ - 1];
							break;
						}
						is_6_[i_11_] = i_12_ | i_13_;
					}
				}
				is_6_[i_7_] = i_10_;
				for (int i_14_ = i_7_ + 1; i_14_ <= 32; i_14_++) {
					int i_15_ = is_6_[i_14_];
					if (i_15_ == i_9_)
						is_6_[i_14_] = i_10_;
				}
			}
		}
		anIntArray2749 = new int[8];
		int i = 0;
		for (int i_16_ = 0; i_16_ < anInt2750; i_16_++) {
			int i_17_ = anIntArray2754[i_16_];
			if (i_17_ != 0) {
				int i_18_ = is[i_16_];
				int i_19_ = 0;
				for (int i_20_ = 0; i_20_ < i_17_; i_20_++) {
					int i_21_ = -2147483648 >>> i_20_;
					if ((i_18_ & i_21_) != 0) {
						if (anIntArray2749[i_19_] == 0)
							anIntArray2749[i_19_] = i;
						i_19_ = anIntArray2749[i_19_];
					} else
						i_19_++;
					if (i_19_ >= anIntArray2749.length) {
						int[] is_22_ = new int[anIntArray2749.length * 2];
						for (int i_23_ = 0; i_23_ < anIntArray2749.length; i_23_++)
							is_22_[i_23_] = anIntArray2749[i_23_];
						anIntArray2749 = is_22_;
					}
					i_21_ >>>= 1;
				}
				anIntArray2749[i_19_] = i_16_ ^ 0xffffffff;
				if (i_19_ >= i)
					i = i_19_ + 1;
			}
		}
	}

	void method3525(Class258 class258) {
		class258.method3563(anInt2752 * 8 + anInt2753);
	}

	void method3526(Class258 class258) {
		int i = class258.method3562();
		int i_24_ = class258.method3561();
		class258.method3563(24);
		anInt2748 = class258.method3563(16);
		anInt2750 = class258.method3563(24);
		if (anIntArray2754 == null || anIntArray2754.length != anInt2750)
			anIntArray2754 = new int[anInt2750];
		boolean bool = class258.method3590() != 0;
		if (bool) {
			int i_25_ = 0;
			int i_26_ = class258.method3563(5) + 1;
			while (i_25_ < anInt2750) {
				int i_27_ = class258.method3563(Class98_Sub1.method8392((anInt2750 - i_25_), (byte) -62));
				for (int i_28_ = 0; i_28_ < i_27_; i_28_++)
					anIntArray2754[i_25_++] = i_26_;
				i_26_++;
			}
		} else {
			boolean bool_29_ = class258.method3590() != 0;
			for (int i_30_ = 0; i_30_ < anInt2750; i_30_++) {
				if (bool_29_ && class258.method3590() == 0)
					anIntArray2754[i_30_] = 0;
				else
					anIntArray2754[i_30_] = class258.method3563(5) + 1;
			}
		}
		method3524();
		int i_31_ = class258.method3563(4);
		if (i_31_ > 0) {
			float f = class258.method3560(class258.method3563(32));
			float f_32_ = class258.method3560(class258.method3563(32));
			int i_33_ = class258.method3563(4) + 1;
			boolean bool_34_ = class258.method3590() != 0;
			int i_35_;
			if (i_31_ == 1)
				i_35_ = method3531(anInt2750, anInt2748);
			else
				i_35_ = anInt2750 * anInt2748;
			anIntArray2747 = new int[i_35_];
			for (int i_36_ = 0; i_36_ < i_35_; i_36_++)
				anIntArray2747[i_36_] = class258.method3563(i_33_);
			aFloatArrayArray2751 = new float[anInt2750][anInt2748];
			if (i_31_ == 1) {
				for (int i_37_ = 0; i_37_ < anInt2750; i_37_++) {
					float f_38_ = 0.0F;
					int i_39_ = 1;
					for (int i_40_ = 0; i_40_ < anInt2748; i_40_++) {
						int i_41_ = i_37_ / i_39_ % i_35_;
						float f_42_ = ((float) anIntArray2747[i_41_] * f_32_ + f + f_38_);
						aFloatArrayArray2751[i_37_][i_40_] = f_42_;
						if (bool_34_)
							f_38_ = f_42_;
						i_39_ *= i_35_;
					}
				}
			} else {
				for (int i_43_ = 0; i_43_ < anInt2750; i_43_++) {
					float f_44_ = 0.0F;
					int i_45_ = i_43_ * anInt2748;
					for (int i_46_ = 0; i_46_ < anInt2748; i_46_++) {
						float f_47_ = ((float) anIntArray2747[i_45_] * f_32_ + f + f_44_);
						aFloatArrayArray2751[i_43_][i_46_] = f_47_;
						if (bool_34_)
							f_44_ = f_47_;
						i_45_++;
					}
				}
			}
		}
		anInt2753 = class258.method3562() - i;
		anInt2752 = class258.method3561() - i_24_;
	}

	void method3527() {
		int[] is = new int[anInt2750];
		int[] is_48_ = new int[33];
		for (int i = 0; i < anInt2750; i++) {
			int i_49_ = anIntArray2754[i];
			if (i_49_ != 0) {
				int i_50_ = 1 << 32 - i_49_;
				int i_51_ = is_48_[i_49_];
				is[i] = i_51_;
				int i_52_;
				if ((i_51_ & i_50_) != 0)
					i_52_ = is_48_[i_49_ - 1];
				else {
					i_52_ = i_51_ | i_50_;
					for (int i_53_ = i_49_ - 1; i_53_ >= 1; i_53_--) {
						int i_54_ = is_48_[i_53_];
						if (i_54_ != i_51_)
							break;
						int i_55_ = 1 << 32 - i_53_;
						if ((i_54_ & i_55_) != 0) {
							is_48_[i_53_] = is_48_[i_53_ - 1];
							break;
						}
						is_48_[i_53_] = i_54_ | i_55_;
					}
				}
				is_48_[i_49_] = i_52_;
				for (int i_56_ = i_49_ + 1; i_56_ <= 32; i_56_++) {
					int i_57_ = is_48_[i_56_];
					if (i_57_ == i_51_)
						is_48_[i_56_] = i_52_;
				}
			}
		}
		anIntArray2749 = new int[8];
		int i = 0;
		for (int i_58_ = 0; i_58_ < anInt2750; i_58_++) {
			int i_59_ = anIntArray2754[i_58_];
			if (i_59_ != 0) {
				int i_60_ = is[i_58_];
				int i_61_ = 0;
				for (int i_62_ = 0; i_62_ < i_59_; i_62_++) {
					int i_63_ = -2147483648 >>> i_62_;
					if ((i_60_ & i_63_) != 0) {
						if (anIntArray2749[i_61_] == 0)
							anIntArray2749[i_61_] = i;
						i_61_ = anIntArray2749[i_61_];
					} else
						i_61_++;
					if (i_61_ >= anIntArray2749.length) {
						int[] is_64_ = new int[anIntArray2749.length * 2];
						for (int i_65_ = 0; i_65_ < anIntArray2749.length; i_65_++)
							is_64_[i_65_] = anIntArray2749[i_65_];
						anIntArray2749 = is_64_;
					}
					i_63_ >>>= 1;
				}
				anIntArray2749[i_61_] = i_58_ ^ 0xffffffff;
				if (i_61_ >= i)
					i = i_61_ + 1;
			}
		}
	}

	int method3528(Class258 class258) {
		int i;
		for (i = 0; anIntArray2749[i] >= 0; i = class258.method3590() != 0 ? anIntArray2749[i] : i + 1) {
			/* empty */
		}
		return anIntArray2749[i] ^ 0xffffffff;
	}

	float[] method3529(Class258 class258) {
		return aFloatArrayArray2751[method3528(class258)];
	}

	static int method3530(int i, int i_66_) {
		int i_67_ = (int) Math.pow((double) i, 1.0 / (double) i_66_) + 1;
		for (;;) {
			int i_68_ = i_67_;
			int i_69_ = i_66_;
			int i_70_ = 1;
			for (/**/; i_69_ > 1; i_69_ >>= 1) {
				if (0 != (i_69_ & 0x1))
					i_70_ *= i_68_;
				i_68_ *= i_68_;
			}
			int i_71_;
			if (1 == i_69_)
				i_71_ = i_68_ * i_70_;
			else
				i_71_ = i_70_;
			if (i_71_ <= i)
				break;
			i_67_--;
		}
		return i_67_;
	}

	static int method3531(int i, int i_72_) {
		int i_73_ = (int) Math.pow((double) i, 1.0 / (double) i_72_) + 1;
		for (;;) {
			int i_74_ = i_73_;
			int i_75_ = i_72_;
			int i_76_ = 1;
			for (/**/; i_75_ > 1; i_75_ >>= 1) {
				if (0 != (i_75_ & 0x1))
					i_76_ *= i_74_;
				i_74_ *= i_74_;
			}
			int i_77_;
			if (1 == i_75_)
				i_77_ = i_74_ * i_76_;
			else
				i_77_ = i_76_;
			if (i_77_ <= i)
				break;
			i_73_--;
		}
		return i_73_;
	}

	static int method3532(int i, int i_78_) {
		int i_79_ = (int) Math.pow((double) i, 1.0 / (double) i_78_) + 1;
		for (;;) {
			int i_80_ = i_79_;
			int i_81_ = i_78_;
			int i_82_ = 1;
			for (/**/; i_81_ > 1; i_81_ >>= 1) {
				if (0 != (i_81_ & 0x1))
					i_82_ *= i_80_;
				i_80_ *= i_80_;
			}
			int i_83_;
			if (1 == i_81_)
				i_83_ = i_80_ * i_82_;
			else
				i_83_ = i_82_;
			if (i_83_ <= i)
				break;
			i_79_--;
		}
		return i_79_;
	}

	void method3533() {
		int[] is = new int[anInt2750];
		int[] is_84_ = new int[33];
		for (int i = 0; i < anInt2750; i++) {
			int i_85_ = anIntArray2754[i];
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
		anIntArray2749 = new int[8];
		int i = 0;
		for (int i_94_ = 0; i_94_ < anInt2750; i_94_++) {
			int i_95_ = anIntArray2754[i_94_];
			if (i_95_ != 0) {
				int i_96_ = is[i_94_];
				int i_97_ = 0;
				for (int i_98_ = 0; i_98_ < i_95_; i_98_++) {
					int i_99_ = -2147483648 >>> i_98_;
					if ((i_96_ & i_99_) != 0) {
						if (anIntArray2749[i_97_] == 0)
							anIntArray2749[i_97_] = i;
						i_97_ = anIntArray2749[i_97_];
					} else
						i_97_++;
					if (i_97_ >= anIntArray2749.length) {
						int[] is_100_ = new int[anIntArray2749.length * 2];
						for (int i_101_ = 0; i_101_ < anIntArray2749.length; i_101_++)
							is_100_[i_101_] = anIntArray2749[i_101_];
						anIntArray2749 = is_100_;
					}
					i_99_ >>>= 1;
				}
				anIntArray2749[i_97_] = i_94_ ^ 0xffffffff;
				if (i_97_ >= i)
					i = i_97_ + 1;
			}
		}
	}

	void method3534() {
		int[] is = new int[anInt2750];
		int[] is_102_ = new int[33];
		for (int i = 0; i < anInt2750; i++) {
			int i_103_ = anIntArray2754[i];
			if (i_103_ != 0) {
				int i_104_ = 1 << 32 - i_103_;
				int i_105_ = is_102_[i_103_];
				is[i] = i_105_;
				int i_106_;
				if ((i_105_ & i_104_) != 0)
					i_106_ = is_102_[i_103_ - 1];
				else {
					i_106_ = i_105_ | i_104_;
					for (int i_107_ = i_103_ - 1; i_107_ >= 1; i_107_--) {
						int i_108_ = is_102_[i_107_];
						if (i_108_ != i_105_)
							break;
						int i_109_ = 1 << 32 - i_107_;
						if ((i_108_ & i_109_) != 0) {
							is_102_[i_107_] = is_102_[i_107_ - 1];
							break;
						}
						is_102_[i_107_] = i_108_ | i_109_;
					}
				}
				is_102_[i_103_] = i_106_;
				for (int i_110_ = i_103_ + 1; i_110_ <= 32; i_110_++) {
					int i_111_ = is_102_[i_110_];
					if (i_111_ == i_105_)
						is_102_[i_110_] = i_106_;
				}
			}
		}
		anIntArray2749 = new int[8];
		int i = 0;
		for (int i_112_ = 0; i_112_ < anInt2750; i_112_++) {
			int i_113_ = anIntArray2754[i_112_];
			if (i_113_ != 0) {
				int i_114_ = is[i_112_];
				int i_115_ = 0;
				for (int i_116_ = 0; i_116_ < i_113_; i_116_++) {
					int i_117_ = -2147483648 >>> i_116_;
					if ((i_114_ & i_117_) != 0) {
						if (anIntArray2749[i_115_] == 0)
							anIntArray2749[i_115_] = i;
						i_115_ = anIntArray2749[i_115_];
					} else
						i_115_++;
					if (i_115_ >= anIntArray2749.length) {
						int[] is_118_ = new int[anIntArray2749.length * 2];
						for (int i_119_ = 0; i_119_ < anIntArray2749.length; i_119_++)
							is_118_[i_119_] = anIntArray2749[i_119_];
						anIntArray2749 = is_118_;
					}
					i_117_ >>>= 1;
				}
				anIntArray2749[i_115_] = i_112_ ^ 0xffffffff;
				if (i_115_ >= i)
					i = i_115_ + 1;
			}
		}
	}

	void method3535() {
		int[] is = new int[anInt2750];
		int[] is_120_ = new int[33];
		for (int i = 0; i < anInt2750; i++) {
			int i_121_ = anIntArray2754[i];
			if (i_121_ != 0) {
				int i_122_ = 1 << 32 - i_121_;
				int i_123_ = is_120_[i_121_];
				is[i] = i_123_;
				int i_124_;
				if ((i_123_ & i_122_) != 0)
					i_124_ = is_120_[i_121_ - 1];
				else {
					i_124_ = i_123_ | i_122_;
					for (int i_125_ = i_121_ - 1; i_125_ >= 1; i_125_--) {
						int i_126_ = is_120_[i_125_];
						if (i_126_ != i_123_)
							break;
						int i_127_ = 1 << 32 - i_125_;
						if ((i_126_ & i_127_) != 0) {
							is_120_[i_125_] = is_120_[i_125_ - 1];
							break;
						}
						is_120_[i_125_] = i_126_ | i_127_;
					}
				}
				is_120_[i_121_] = i_124_;
				for (int i_128_ = i_121_ + 1; i_128_ <= 32; i_128_++) {
					int i_129_ = is_120_[i_128_];
					if (i_129_ == i_123_)
						is_120_[i_128_] = i_124_;
				}
			}
		}
		anIntArray2749 = new int[8];
		int i = 0;
		for (int i_130_ = 0; i_130_ < anInt2750; i_130_++) {
			int i_131_ = anIntArray2754[i_130_];
			if (i_131_ != 0) {
				int i_132_ = is[i_130_];
				int i_133_ = 0;
				for (int i_134_ = 0; i_134_ < i_131_; i_134_++) {
					int i_135_ = -2147483648 >>> i_134_;
					if ((i_132_ & i_135_) != 0) {
						if (anIntArray2749[i_133_] == 0)
							anIntArray2749[i_133_] = i;
						i_133_ = anIntArray2749[i_133_];
					} else
						i_133_++;
					if (i_133_ >= anIntArray2749.length) {
						int[] is_136_ = new int[anIntArray2749.length * 2];
						for (int i_137_ = 0; i_137_ < anIntArray2749.length; i_137_++)
							is_136_[i_137_] = anIntArray2749[i_137_];
						anIntArray2749 = is_136_;
					}
					i_135_ >>>= 1;
				}
				anIntArray2749[i_133_] = i_130_ ^ 0xffffffff;
				if (i_133_ >= i)
					i = i_133_ + 1;
			}
		}
	}

	Class253() {
		/* empty */
	}
}
