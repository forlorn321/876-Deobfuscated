/* Class418 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Random;

public abstract class Class418 {
	int anInt4560;
	static final int anInt4561 = 4096;
	static final int anInt4562 = 4095;
	short[] aShortArray4563;
	int anInt4564;
	int anInt4565;
	short[] aShortArray4566 = new short[512];
	int anInt4567;
	int anInt4568;
	static final int anInt4569 = 12;
	public static int[] anIntArray4570 = new int[4096];

	void method5039(int i, int i_0_, int i_1_) {
		int[] is = new int[i];
		int[] is_2_ = new int[i_0_];
		int[] is_3_ = new int[i_1_];
		for (int i_4_ = 0; i_4_ < i; i_4_++)
			is[i_4_] = (i_4_ << 12) / i;
		for (int i_5_ = 0; i_5_ < i_0_; i_5_++)
			is_2_[i_5_] = (i_5_ << 12) / i_0_;
		for (int i_6_ = 0; i_6_ < i_1_; i_6_++)
			is_3_[i_6_] = (i_6_ << 12) / i_1_;
		method5041();
		for (int i_7_ = 0; i_7_ < i_1_; i_7_++) {
			for (int i_8_ = 0; i_8_ < i_0_; i_8_++) {
				for (int i_9_ = 0; i_9_ < i; i_9_++) {
					for (int i_10_ = 0; i_10_ < anInt4560; i_10_++) {
						int i_11_ = aShortArray4563[i_10_] << 12;
						int i_12_ = anInt4568 * i_11_ >> 12;
						int i_13_ = anInt4564 * i_11_ >> 12;
						int i_14_ = anInt4567 * i_11_ >> 12;
						int i_15_ = is[i_9_] * i_11_ >> 12;
						int i_16_ = is_2_[i_8_] * i_11_ >> 12;
						int i_17_ = is_3_[i_7_] * i_11_ >> 12;
						i_15_ *= anInt4568;
						i_16_ *= anInt4564;
						i_17_ *= anInt4567;
						int i_18_ = i_15_ >> 12;
						int i_19_ = i_18_ + 1;
						i_18_ &= 0xff;
						int i_20_ = i_16_ >> 12;
						int i_21_ = i_20_ + 1;
						i_20_ &= 0xff;
						int i_22_ = i_17_ >> 12;
						int i_23_ = i_22_ + 1;
						i_22_ &= 0xff;
						if (i_19_ >= i_12_)
							i_19_ = 0;
						else
							i_19_ &= 0xff;
						if (i_21_ >= i_13_)
							i_21_ = 0;
						else
							i_21_ &= 0xff;
						if (i_23_ >= i_14_)
							i_23_ = 0;
						else
							i_23_ &= 0xff;
						i_15_ &= 0xfff;
						i_16_ &= 0xfff;
						i_17_ &= 0xfff;
						int i_24_ = anIntArray4570[i_15_];
						int i_25_ = anIntArray4570[i_16_];
						int i_26_ = anIntArray4570[i_17_];
						int i_27_ = i_15_ - 4096;
						int i_28_ = i_16_ - 4096;
						int i_29_ = i_17_ - 4096;
						int i_30_ = aShortArray4566[i_22_];
						int i_31_ = aShortArray4566[i_23_];
						int i_32_ = aShortArray4566[i_20_ + i_30_];
						int i_33_ = aShortArray4566[i_21_ + i_30_];
						int i_34_ = aShortArray4566[i_20_ + i_31_];
						int i_35_ = aShortArray4566[i_21_ + i_31_];
						int i_36_ = method5050(aShortArray4566[i_18_ + i_32_], i_15_, i_16_, i_17_);
						int i_37_ = method5050(aShortArray4566[i_19_ + i_32_], i_27_, i_16_, i_17_);
						int i_38_ = i_36_ + (i_24_ * (i_37_ - i_36_) >> 12);
						i_36_ = method5050(aShortArray4566[i_18_ + i_33_], i_15_, i_28_, i_17_);
						i_37_ = method5050(aShortArray4566[i_19_ + i_33_], i_27_, i_28_, i_17_);
						int i_39_ = i_36_ + (i_24_ * (i_37_ - i_36_) >> 12);
						int i_40_ = i_38_ + (i_25_ * (i_39_ - i_38_) >> 12);
						i_36_ = method5050(aShortArray4566[i_18_ + i_34_], i_15_, i_16_, i_29_);
						i_37_ = method5050(aShortArray4566[i_19_ + i_34_], i_27_, i_16_, i_29_);
						i_38_ = i_36_ + (i_24_ * (i_37_ - i_36_) >> 12);
						i_36_ = method5050(aShortArray4566[i_18_ + i_35_], i_15_, i_28_, i_29_);
						i_37_ = method5050(aShortArray4566[i_19_ + i_35_], i_27_, i_28_, i_29_);
						i_39_ = i_36_ + (i_24_ * (i_37_ - i_36_) >> 12);
						int i_41_ = i_38_ + (i_25_ * (i_39_ - i_38_) >> 12);
						method5043(i_10_, i_40_ + (i_26_ * (i_41_ - i_40_) >> 12));
					}
					method5055();
				}
			}
		}
	}

	void method5040() {
		aShortArray4563 = new short[anInt4560];
		for (int i = 0; i < anInt4560; i++)
			aShortArray4563[i] = (short) (int) Math.pow(2.0, (double) i);
	}

	abstract void method5041();

	void method5042() {
		Random random = new Random((long) anInt4565);
		for (int i = 0; i < 255; i++)
			aShortArray4566[i] = (short) i;
		for (int i = 0; i < 255; i++) {
			int i_42_ = 255 - i;
			int i_43_ = Class147.method1815(random, i_42_, (byte) -78);
			short i_44_ = aShortArray4566[i_43_];
			aShortArray4566[i_43_] = aShortArray4566[i_42_];
			aShortArray4566[i_42_] = aShortArray4566[i_42_ + 256] = i_44_;
		}
	}

	abstract void method5043(int i, int i_45_);

	void method5044() {
		aShortArray4563 = new short[anInt4560];
		for (int i = 0; i < anInt4560; i++)
			aShortArray4563[i] = (short) (int) Math.pow(2.0, (double) i);
	}

	static final int method5045(int i) {
		int i_46_ = i * (i * i >> 12) >> 12;
		int i_47_ = i * 6 - 61440;
		int i_48_ = 40960 + (i_47_ * i >> 12);
		return i_48_ * i_46_ >> 12;
	}

	Class418(int i, int i_49_, int i_50_, int i_51_, int i_52_) {
		anInt4565 = 0;
		anInt4568 = 4;
		anInt4564 = 4;
		anInt4567 = 4;
		anInt4560 = 4;
		anInt4565 = i;
		anInt4568 = i_50_;
		anInt4564 = i_51_;
		anInt4567 = i_52_;
		anInt4560 = i_49_;
		method5044();
		method5042();
	}

	abstract void method5046();

	static {
		for (int i = 0; i < 4096; i++)
			anIntArray4570[i] = method5045(i);
	}

	void method5047(int i, int i_53_, int i_54_) {
		int[] is = new int[i];
		int[] is_55_ = new int[i_53_];
		int[] is_56_ = new int[i_54_];
		for (int i_57_ = 0; i_57_ < i; i_57_++)
			is[i_57_] = (i_57_ << 12) / i;
		for (int i_58_ = 0; i_58_ < i_53_; i_58_++)
			is_55_[i_58_] = (i_58_ << 12) / i_53_;
		for (int i_59_ = 0; i_59_ < i_54_; i_59_++)
			is_56_[i_59_] = (i_59_ << 12) / i_54_;
		method5041();
		for (int i_60_ = 0; i_60_ < i_54_; i_60_++) {
			for (int i_61_ = 0; i_61_ < i_53_; i_61_++) {
				for (int i_62_ = 0; i_62_ < i; i_62_++) {
					for (int i_63_ = 0; i_63_ < anInt4560; i_63_++) {
						int i_64_ = aShortArray4563[i_63_] << 12;
						int i_65_ = anInt4568 * i_64_ >> 12;
						int i_66_ = anInt4564 * i_64_ >> 12;
						int i_67_ = anInt4567 * i_64_ >> 12;
						int i_68_ = is[i_62_] * i_64_ >> 12;
						int i_69_ = is_55_[i_61_] * i_64_ >> 12;
						int i_70_ = is_56_[i_60_] * i_64_ >> 12;
						i_68_ *= anInt4568;
						i_69_ *= anInt4564;
						i_70_ *= anInt4567;
						int i_71_ = i_68_ >> 12;
						int i_72_ = i_71_ + 1;
						i_71_ &= 0xff;
						int i_73_ = i_69_ >> 12;
						int i_74_ = i_73_ + 1;
						i_73_ &= 0xff;
						int i_75_ = i_70_ >> 12;
						int i_76_ = i_75_ + 1;
						i_75_ &= 0xff;
						if (i_72_ >= i_65_)
							i_72_ = 0;
						else
							i_72_ &= 0xff;
						if (i_74_ >= i_66_)
							i_74_ = 0;
						else
							i_74_ &= 0xff;
						if (i_76_ >= i_67_)
							i_76_ = 0;
						else
							i_76_ &= 0xff;
						i_68_ &= 0xfff;
						i_69_ &= 0xfff;
						i_70_ &= 0xfff;
						int i_77_ = anIntArray4570[i_68_];
						int i_78_ = anIntArray4570[i_69_];
						int i_79_ = anIntArray4570[i_70_];
						int i_80_ = i_68_ - 4096;
						int i_81_ = i_69_ - 4096;
						int i_82_ = i_70_ - 4096;
						int i_83_ = aShortArray4566[i_75_];
						int i_84_ = aShortArray4566[i_76_];
						int i_85_ = aShortArray4566[i_73_ + i_83_];
						int i_86_ = aShortArray4566[i_74_ + i_83_];
						int i_87_ = aShortArray4566[i_73_ + i_84_];
						int i_88_ = aShortArray4566[i_74_ + i_84_];
						int i_89_ = method5050(aShortArray4566[i_71_ + i_85_], i_68_, i_69_, i_70_);
						int i_90_ = method5050(aShortArray4566[i_72_ + i_85_], i_80_, i_69_, i_70_);
						int i_91_ = i_89_ + (i_77_ * (i_90_ - i_89_) >> 12);
						i_89_ = method5050(aShortArray4566[i_71_ + i_86_], i_68_, i_81_, i_70_);
						i_90_ = method5050(aShortArray4566[i_72_ + i_86_], i_80_, i_81_, i_70_);
						int i_92_ = i_89_ + (i_77_ * (i_90_ - i_89_) >> 12);
						int i_93_ = i_91_ + (i_78_ * (i_92_ - i_91_) >> 12);
						i_89_ = method5050(aShortArray4566[i_71_ + i_87_], i_68_, i_69_, i_82_);
						i_90_ = method5050(aShortArray4566[i_72_ + i_87_], i_80_, i_69_, i_82_);
						i_91_ = i_89_ + (i_77_ * (i_90_ - i_89_) >> 12);
						i_89_ = method5050(aShortArray4566[i_71_ + i_88_], i_68_, i_81_, i_82_);
						i_90_ = method5050(aShortArray4566[i_72_ + i_88_], i_80_, i_81_, i_82_);
						i_92_ = i_89_ + (i_77_ * (i_90_ - i_89_) >> 12);
						int i_94_ = i_91_ + (i_78_ * (i_92_ - i_91_) >> 12);
						method5043(i_63_, i_93_ + (i_79_ * (i_94_ - i_93_) >> 12));
					}
					method5055();
				}
			}
		}
	}

	abstract void method5048();

	abstract void method5049();

	static int method5050(int i, int i_95_, int i_96_, int i_97_) {
		int i_98_ = i & 0xf;
		int i_99_ = i_98_ < 8 ? i_95_ : i_96_;
		int i_100_ = i_98_ < 4 ? i_96_ : i_98_ == 12 || i_98_ == 14 ? i_95_ : i_97_;
		return (((i_98_ & 0x1) == 0 ? i_99_ : -i_99_) + ((i_98_ & 0x2) == 0 ? i_100_ : -i_100_));
	}

	abstract void method5051();

	abstract void method5052();

	void method5053() {
		aShortArray4563 = new short[anInt4560];
		for (int i = 0; i < anInt4560; i++)
			aShortArray4563[i] = (short) (int) Math.pow(2.0, (double) i);
	}

	void method5054() {
		aShortArray4563 = new short[anInt4560];
		for (int i = 0; i < anInt4560; i++)
			aShortArray4563[i] = (short) (int) Math.pow(2.0, (double) i);
	}

	abstract void method5055();

	static final int method5056(int i) {
		int i_101_ = i * (i * i >> 12) >> 12;
		int i_102_ = i * 6 - 61440;
		int i_103_ = 40960 + (i_102_ * i >> 12);
		return i_103_ * i_101_ >> 12;
	}

	static final int method5057(int i) {
		int i_104_ = i * (i * i >> 12) >> 12;
		int i_105_ = i * 6 - 61440;
		int i_106_ = 40960 + (i_105_ * i >> 12);
		return i_106_ * i_104_ >> 12;
	}

	abstract void method5058(int i, int i_107_);

	abstract void method5059(int i, int i_108_);

	abstract void method5060(int i, int i_109_);
}
