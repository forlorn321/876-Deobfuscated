/* Class536_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub21 extends Class536 {
	int anInt10521;
	int anInt10522;
	int[] anIntArray10523;
	boolean aBool10524;
	int anInt10525;
	static int[] anIntArray10526;

	void method9571(int i, int i_0_) {
		if (i != 0 || i_0_ != 0) {
			if (anIntArray10526 == null || anIntArray10526.length != anIntArray10523.length)
				anIntArray10526 = new int[anIntArray10523.length];
			int i_1_ = anIntArray10523.length;
			int i_2_ = i;
			int i_3_ = anInt10525 - 1;
			int i_4_ = anInt10525 * i_0_;
			int i_5_ = i_1_ - 1;
			for (int i_6_ = 0; i_6_ < i_1_; i_6_ += anInt10525) {
				int i_7_ = i_6_ + i_4_ & i_5_;
				for (int i_8_ = 0; i_8_ < anInt10525; i_8_++) {
					int i_9_ = i_6_ + i_8_;
					int i_10_ = i_7_ + (i_8_ + i_2_ & i_3_);
					anIntArray10526[i_9_] = anIntArray10523[i_10_];
				}
			}
			int[] is = anIntArray10523;
			anIntArray10523 = anIntArray10526;
			anIntArray10526 = is;
		}
	}

	Class536_Sub21(int i, int i_11_, int[] is, boolean bool) {
		anInt10521 = i;
		anInt10525 = i_11_;
		anIntArray10523 = is;
		if (bool) {
			int[] is_12_ = new int[anInt10525];
			int[] is_13_ = new int[anInt10525];
			int[] is_14_ = new int[anInt10525];
			int[] is_15_ = new int[anInt10525];
			if (anIntArray10526 == null || anIntArray10526.length != anIntArray10523.length)
				anIntArray10526 = new int[anIntArray10523.length];
			int i_16_ = anInt10525;
			int i_17_ = anInt10525;
			int i_18_ = i_16_ - 1;
			int i_19_ = i_17_ - 1;
			int i_20_ = i_16_ * i_17_;
			int i_22_;
			int i_21_ = i_22_ = 1 * i_16_;
			for (int i_23_ = 2; i_23_ >= 0; i_23_--) {
				for (int i_24_ = i_18_; i_24_ >= 0; i_24_--) {
					int i_25_ = anIntArray10523[--i_22_];
					is_12_[i_24_] += i_25_ >> 24 & 0xff;
					is_13_[i_24_] += i_25_ >> 16 & 0xff;
					is_14_[i_24_] += i_25_ >> 8 & 0xff;
					is_15_[i_24_] += i_25_ & 0xff;
				}
				if (i_22_ == 0)
					i_22_ = i_20_;
			}
			int i_26_ = i_20_;
			for (int i_27_ = i_19_; i_27_ >= 0; i_27_--) {
				int i_28_ = 1;
				int i_29_ = 1;
				int i_30_ = 0;
				int i_31_ = 0;
				int i_32_ = 0;
				int i_33_ = 0;
				for (int i_34_ = 2; i_34_ >= 0; i_34_--) {
					i_29_--;
					i_33_ += is_12_[i_29_];
					i_32_ += is_13_[i_29_];
					i_30_ += is_14_[i_29_];
					i_31_ += is_15_[i_29_];
					if (i_29_ == 0)
						i_29_ = i_16_;
				}
				for (int i_35_ = i_18_; i_35_ >= 0; i_35_--) {
					i_29_--;
					i_28_--;
					int i_36_ = i_33_ / 9;
					int i_37_ = i_32_ / 9;
					int i_38_ = i_30_ / 9;
					int i_39_ = i_31_ / 9;
					anIntArray10526[--i_26_] = i_36_ << 24 | i_37_ << 16 | i_38_ << 8 | i_39_;
					i_33_ += is_12_[i_29_] - is_12_[i_28_];
					i_32_ += is_13_[i_29_] - is_13_[i_28_];
					i_31_ += is_15_[i_29_] - is_15_[i_28_];
					i_30_ += is_14_[i_29_] - is_14_[i_28_];
					if (i_29_ == 0)
						i_29_ = i_16_;
					if (i_28_ == 0)
						i_28_ = i_16_;
				}
				for (int i_40_ = i_18_; i_40_ >= 0; i_40_--) {
					int i_41_ = anIntArray10523[--i_22_];
					int i_42_ = anIntArray10523[--i_21_];
					is_12_[i_40_] += (i_41_ >> 24 & 0xff) - (i_42_ >> 24 & 0xff);
					is_13_[i_40_] += (i_41_ >> 16 & 0xff) - (i_42_ >> 16 & 0xff);
					is_14_[i_40_] += (i_41_ >> 8 & 0xff) - (i_42_ >> 8 & 0xff);
					is_15_[i_40_] += (i_41_ & 0xff) - (i_42_ & 0xff);
				}
				if (i_22_ == 0)
					i_22_ = i_20_;
				if (i_21_ == 0)
					i_21_ = i_20_;
			}
			int[] is_43_ = anIntArray10523;
			anIntArray10523 = anIntArray10526;
			anIntArray10526 = is_43_;
		}
	}

	void method9572(int i, int i_44_) {
		if (i != 0 || i_44_ != 0) {
			if (anIntArray10526 == null || anIntArray10526.length != anIntArray10523.length)
				anIntArray10526 = new int[anIntArray10523.length];
			int i_45_ = anIntArray10523.length;
			int i_46_ = i;
			int i_47_ = anInt10525 - 1;
			int i_48_ = anInt10525 * i_44_;
			int i_49_ = i_45_ - 1;
			for (int i_50_ = 0; i_50_ < i_45_; i_50_ += anInt10525) {
				int i_51_ = i_50_ + i_48_ & i_49_;
				for (int i_52_ = 0; i_52_ < anInt10525; i_52_++) {
					int i_53_ = i_50_ + i_52_;
					int i_54_ = i_51_ + (i_52_ + i_46_ & i_47_);
					anIntArray10526[i_53_] = anIntArray10523[i_54_];
				}
			}
			int[] is = anIntArray10523;
			anIntArray10523 = anIntArray10526;
			anIntArray10526 = is;
		}
	}

	void method9573(int i, int i_55_) {
		if (i != 0 || i_55_ != 0) {
			if (anIntArray10526 == null || anIntArray10526.length != anIntArray10523.length)
				anIntArray10526 = new int[anIntArray10523.length];
			int i_56_ = anIntArray10523.length;
			int i_57_ = i;
			int i_58_ = anInt10525 - 1;
			int i_59_ = anInt10525 * i_55_;
			int i_60_ = i_56_ - 1;
			for (int i_61_ = 0; i_61_ < i_56_; i_61_ += anInt10525) {
				int i_62_ = i_61_ + i_59_ & i_60_;
				for (int i_63_ = 0; i_63_ < anInt10525; i_63_++) {
					int i_64_ = i_61_ + i_63_;
					int i_65_ = i_62_ + (i_63_ + i_57_ & i_58_);
					anIntArray10526[i_64_] = anIntArray10523[i_65_];
				}
			}
			int[] is = anIntArray10523;
			anIntArray10523 = anIntArray10526;
			anIntArray10526 = is;
		}
	}

	int[] method9574() {
		return anIntArray10523;
	}

	void method9575(int i, int i_66_) {
		if (i != 0 || i_66_ != 0) {
			if (anIntArray10526 == null || anIntArray10526.length != anIntArray10523.length)
				anIntArray10526 = new int[anIntArray10523.length];
			int i_67_ = anIntArray10523.length;
			int i_68_ = i;
			int i_69_ = anInt10525 - 1;
			int i_70_ = anInt10525 * i_66_;
			int i_71_ = i_67_ - 1;
			for (int i_72_ = 0; i_72_ < i_67_; i_72_ += anInt10525) {
				int i_73_ = i_72_ + i_70_ & i_71_;
				for (int i_74_ = 0; i_74_ < anInt10525; i_74_++) {
					int i_75_ = i_72_ + i_74_;
					int i_76_ = i_73_ + (i_74_ + i_68_ & i_69_);
					anIntArray10526[i_75_] = anIntArray10523[i_76_];
				}
			}
			int[] is = anIntArray10523;
			anIntArray10523 = anIntArray10526;
			anIntArray10526 = is;
		}
	}

	void method9576(int i, int i_77_) {
		if (i != 0 || i_77_ != 0) {
			if (anIntArray10526 == null || anIntArray10526.length != anIntArray10523.length)
				anIntArray10526 = new int[anIntArray10523.length];
			int i_78_ = anIntArray10523.length;
			int i_79_ = i;
			int i_80_ = anInt10525 - 1;
			int i_81_ = anInt10525 * i_77_;
			int i_82_ = i_78_ - 1;
			for (int i_83_ = 0; i_83_ < i_78_; i_83_ += anInt10525) {
				int i_84_ = i_83_ + i_81_ & i_82_;
				for (int i_85_ = 0; i_85_ < anInt10525; i_85_++) {
					int i_86_ = i_83_ + i_85_;
					int i_87_ = i_84_ + (i_85_ + i_79_ & i_80_);
					anIntArray10526[i_86_] = anIntArray10523[i_87_];
				}
			}
			int[] is = anIntArray10523;
			anIntArray10523 = anIntArray10526;
			anIntArray10526 = is;
		}
	}
}
