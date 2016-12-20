/* Class185_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class185_Sub1 extends Class185 {
	boolean aBool9250 = false;
	int anInt9251;
	int anInt9252;
	int anInt9253;
	int anInt9254;
	int anInt9255;
	int[] anIntArray9256;
	int anInt9257;

	public int method3627(int i, int i_0_) {
		return anIntArray9256[i + i_0_ * anInt9252];
	}

	public void method3593() {
		int[] is = new int[anInt9252 * anInt9251];
		int i = 0;
		for (int i_1_ = 0; i_1_ < anInt9252; i_1_++) {
			for (int i_2_ = anInt9251 - 1; i_2_ >= 0; i_2_--)
				is[i++] = anIntArray9256[i_1_ + i_2_ * anInt9252];
		}
		anIntArray9256 = is;
		int i_3_ = anInt9254;
		anInt9254 = anInt9253;
		anInt9253 = anInt9255;
		anInt9255 = anInt9257;
		anInt9257 = i_3_;
		i_3_ = anInt9251;
		anInt9251 = anInt9252;
		anInt9252 = i_3_;
	}

	public void method3618() {
		int[] is = anIntArray9256;
		for (int i = anInt9251 - 1; i >= 0; i--) {
			int i_4_ = i * anInt9252;
			for (int i_5_ = (i + 1) * anInt9252; i_4_ < i_5_; i_4_++) {
				i_5_--;
				int i_6_ = is[i_4_];
				is[i_4_] = is[i_5_];
				is[i_5_] = i_6_;
			}
		}
		int i = anInt9253;
		anInt9253 = anInt9257;
		anInt9257 = i;
	}

	public int method3636() {
		return anInt9252;
	}

	public void method3616(int i) {
		int i_7_ = 0;
		aBool9250 = false;
		int[] is = new int[anInt9252 * anInt9251];
		for (int i_8_ = 0; i_8_ < anInt9251; i_8_++) {
			for (int i_9_ = 0; i_9_ < anInt9252; i_9_++) {
				int i_10_ = anIntArray9256[i_7_];
				if ((i_10_ & ~0xffffff) == 0) {
					if (i_9_ > 0 && (anIntArray9256[i_7_ - 1] & ~0xffffff) != 0)
						i_10_ = i;
					else if (i_8_ > 0 && (anIntArray9256[i_7_ - anInt9252] & ~0xffffff) != 0)
						i_10_ = i;
					else if (i_9_ < anInt9252 - 1 && (anIntArray9256[i_7_ + 1] & ~0xffffff) != 0)
						i_10_ = i;
					else if (i_8_ < anInt9251 - 1 && ((anIntArray9256[i_7_ + anInt9252] & ~0xffffff) != 0))
						i_10_ = i;
				}
				if ((i_10_ & ~0xffffff) != -16777216)
					aBool9250 = true;
				is[i_7_++] = i_10_;
			}
		}
		anIntArray9256 = is;
	}

	public int method3576() {
		return anInt9252 + anInt9253 + anInt9257;
	}

	public int method3577() {
		return anInt9251 + anInt9254 + anInt9255;
	}

	public int method3634() {
		return anInt9253;
	}

	public int method3572() {
		return anInt9257;
	}

	public int method3592() {
		return anInt9252;
	}

	public int method3603() {
		return anInt9255;
	}

	public void method3617() {
		anInt9255 = 0;
		anInt9254 = 0;
		anInt9257 = 0;
		anInt9253 = 0;
	}

	public void method3578(int i) {
		int i_11_ = method3576();
		int i_12_ = method3577();
		if (anInt9252 != i_11_ || anInt9251 != i_12_) {
			int i_13_ = i;
			if (i_13_ > anInt9253)
				i_13_ = anInt9253;
			int i_14_ = i;
			if (i_14_ + anInt9253 + anInt9252 > i_11_)
				i_14_ = i_11_ - anInt9253 - anInt9252;
			int i_15_ = i;
			if (i_15_ > anInt9254)
				i_15_ = anInt9254;
			int i_16_ = i;
			if (i_16_ + anInt9254 + anInt9251 > i_12_)
				i_16_ = i_12_ - anInt9254 - anInt9251;
			int i_17_ = anInt9252 + i_13_ + i_14_;
			int i_18_ = anInt9251 + i_15_ + i_16_;
			int[] is = new int[i_17_ * i_18_];
			aBool9250 = false;
			for (int i_19_ = 0; i_19_ < anInt9251; i_19_++) {
				int i_20_ = i_19_ * anInt9252;
				int i_21_ = (i_19_ + i_15_) * i_17_ + i_13_;
				for (int i_22_ = 0; i_22_ < anInt9252; i_22_++) {
					if ((anIntArray9256[i_20_] & ~0xffffff) != -16777216)
						aBool9250 = true;
					is[i_21_++] = anIntArray9256[i_20_++];
				}
			}
			anInt9253 -= i_13_;
			anInt9254 -= i_15_;
			anInt9257 -= i_14_;
			anInt9255 -= i_16_;
			anInt9252 = i_17_;
			anInt9251 = i_18_;
			anIntArray9256 = is;
		}
	}

	public void method3579(int i) {
		int i_23_ = 0;
		aBool9250 = false;
		int[] is = new int[anInt9252 * anInt9251];
		for (int i_24_ = 0; i_24_ < anInt9251; i_24_++) {
			for (int i_25_ = 0; i_25_ < anInt9252; i_25_++) {
				int i_26_ = anIntArray9256[i_23_];
				if ((i_26_ & ~0xffffff) == 0) {
					if (i_25_ > 0 && (anIntArray9256[i_23_ - 1] & ~0xffffff) != 0)
						i_26_ = i;
					else if (i_24_ > 0 && (anIntArray9256[i_23_ - anInt9252] & ~0xffffff) != 0)
						i_26_ = i;
					else if (i_25_ < anInt9252 - 1 && (anIntArray9256[i_23_ + 1] & ~0xffffff) != 0)
						i_26_ = i;
					else if (i_24_ < anInt9251 - 1 && (anIntArray9256[i_23_ + anInt9252] & ~0xffffff) != 0)
						i_26_ = i;
				}
				if ((i_26_ & ~0xffffff) != -16777216)
					aBool9250 = true;
				is[i_23_++] = i_26_;
			}
		}
		anIntArray9256 = is;
	}

	public void method3606() {
		anInt9255 = 0;
		anInt9254 = 0;
		anInt9257 = 0;
		anInt9253 = 0;
	}

	public void method3621() {
		int[] is = anIntArray9256;
		for (int i = anInt9251 - 1; i >= 0; i--) {
			int i_27_ = i * anInt9252;
			for (int i_28_ = (i + 1) * anInt9252; i_27_ < i_28_; i_27_++) {
				i_28_--;
				int i_29_ = is[i_27_];
				is[i_27_] = is[i_28_];
				is[i_28_] = i_29_;
			}
		}
		int i = anInt9253;
		anInt9253 = anInt9257;
		anInt9257 = i;
	}

	public void method3582() {
		int[] is = anIntArray9256;
		for (int i = (anInt9251 >> 1) - 1; i >= 0; i--) {
			int i_30_ = i * anInt9252;
			int i_31_ = (anInt9251 - i - 1) * anInt9252;
			for (int i_32_ = -anInt9252; i_32_ < 0; i_32_++) {
				int i_33_ = is[i_30_];
				is[i_30_] = is[i_31_];
				is[i_31_] = i_33_;
				i_30_++;
				i_31_++;
			}
		}
		int i = anInt9254;
		anInt9254 = anInt9255;
		anInt9255 = i;
	}

	public int method3598() {
		return anInt9251 + anInt9254 + anInt9255;
	}

	public void method3571() {
		int[] is = new int[anInt9252 * anInt9251];
		int i = 0;
		for (int i_34_ = 0; i_34_ < anInt9252; i_34_++) {
			for (int i_35_ = anInt9251 - 1; i_35_ >= 0; i_35_--)
				is[i++] = anIntArray9256[i_34_ + i_35_ * anInt9252];
		}
		anIntArray9256 = is;
		int i_36_ = anInt9254;
		anInt9254 = anInt9253;
		anInt9253 = anInt9255;
		anInt9255 = anInt9257;
		anInt9257 = i_36_;
		i_36_ = anInt9251;
		anInt9251 = anInt9252;
		anInt9252 = i_36_;
	}

	public void method3585(int i, int i_37_, int i_38_) {
		for (int i_39_ = 1; i_39_ < anIntArray9256.length; i_39_++) {
			int i_40_ = anIntArray9256[i_39_] >> 16 & 0xff;
			i_40_ += i;
			if (i_40_ < 0)
				i_40_ = 0;
			else if (i_40_ > 255)
				i_40_ = 255;
			int i_41_ = anIntArray9256[i_39_] >> 8 & 0xff;
			i_41_ += i_37_;
			if (i_41_ < 0)
				i_41_ = 0;
			else if (i_41_ > 255)
				i_41_ = 255;
			int i_42_ = anIntArray9256[i_39_] >> 0 & 0xff;
			i_42_ += i_38_;
			if (i_42_ < 0)
				i_42_ = 0;
			else if (i_42_ > 255)
				i_42_ = 255;
			anIntArray9256[i_39_] = (anIntArray9256[i_39_] & ~0xffffff | i_40_ << 16 | i_41_ << 8 | i_42_);
		}
	}

	public int method3566(int i, int i_43_) {
		return anIntArray9256[i + i_43_ * anInt9252];
	}

	public boolean method3587() {
		return false;
	}

	public boolean method3612() {
		return aBool9250;
	}

	public boolean method3602() {
		return aBool9250;
	}

	public void method3580(int i) {
		for (int i_44_ = anInt9251 - 1; i_44_ > 0; i_44_--) {
			int i_45_ = i_44_ * anInt9252;
			for (int i_46_ = anInt9252 - 1; i_46_ > 0; i_46_--) {
				if ((anIntArray9256[i_46_ + i_45_] & ~0xffffff) == 0 && (anIntArray9256[i_46_ + i_45_ - 1 - anInt9252] & ~0xffffff) != 0)
					anIntArray9256[i_46_ + i_45_] = i;
			}
		}
	}

	public int method3574() {
		return anInt9252;
	}

	public int method3570() {
		return anInt9251;
	}

	public boolean method3568() {
		return aBool9250;
	}

	public int method3620() {
		return anInt9252;
	}

	public int method3595() {
		return anInt9251;
	}

	public int method3596() {
		return anInt9251;
	}

	public int method3597() {
		return anInt9251;
	}

	public int method3619() {
		return anInt9257;
	}

	public int method3599() {
		return anInt9251 + anInt9254 + anInt9255;
	}

	public int method3622() {
		return anInt9252;
	}

	public int method3601() {
		return anInt9257;
	}

	public void method3581() {
		int[] is = anIntArray9256;
		for (int i = anInt9251 - 1; i >= 0; i--) {
			int i_47_ = i * anInt9252;
			for (int i_48_ = (i + 1) * anInt9252; i_47_ < i_48_; i_47_++) {
				i_48_--;
				int i_49_ = is[i_47_];
				is[i_47_] = is[i_48_];
				is[i_48_] = i_49_;
			}
		}
		int i = anInt9253;
		anInt9253 = anInt9257;
		anInt9257 = i;
	}

	public int method3630() {
		return anInt9257;
	}

	public int method3604() {
		return anInt9254;
	}

	public int method3608() {
		return anInt9254;
	}

	public int method3605() {
		return anInt9255;
	}

	public void method3615(int i) {
		int i_50_ = 0;
		aBool9250 = false;
		int[] is = new int[anInt9252 * anInt9251];
		for (int i_51_ = 0; i_51_ < anInt9251; i_51_++) {
			for (int i_52_ = 0; i_52_ < anInt9252; i_52_++) {
				int i_53_ = anIntArray9256[i_50_];
				if ((i_53_ & ~0xffffff) == 0) {
					if (i_52_ > 0 && (anIntArray9256[i_50_ - 1] & ~0xffffff) != 0)
						i_53_ = i;
					else if (i_51_ > 0 && (anIntArray9256[i_50_ - anInt9252] & ~0xffffff) != 0)
						i_53_ = i;
					else if (i_52_ < anInt9252 - 1 && (anIntArray9256[i_50_ + 1] & ~0xffffff) != 0)
						i_53_ = i;
					else if (i_51_ < anInt9251 - 1 && (anIntArray9256[i_50_ + anInt9252] & ~0xffffff) != 0)
						i_53_ = i;
				}
				if ((i_53_ & ~0xffffff) != -16777216)
					aBool9250 = true;
				is[i_50_++] = i_53_;
			}
		}
		anIntArray9256 = is;
	}

	public void method3607() {
		anInt9255 = 0;
		anInt9254 = 0;
		anInt9257 = 0;
		anInt9253 = 0;
	}

	Class185_Sub1(int i, int i_54_, int[] is) {
		anInt9252 = i;
		anInt9251 = i_54_;
		anIntArray9256 = is;
		for (int i_55_ = 0; i_55_ < anIntArray9256.length; i_55_++) {
			if ((anIntArray9256[i_55_] & ~0xffffff) != -16777216) {
				aBool9250 = true;
				break;
			}
		}
	}

	public void method3609() {
		anInt9255 = 0;
		anInt9254 = 0;
		anInt9257 = 0;
		anInt9253 = 0;
	}

	public void method3610(int i) {
		int i_56_ = method3576();
		int i_57_ = method3577();
		if (anInt9252 != i_56_ || anInt9251 != i_57_) {
			int i_58_ = i;
			if (i_58_ > anInt9253)
				i_58_ = anInt9253;
			int i_59_ = i;
			if (i_59_ + anInt9253 + anInt9252 > i_56_)
				i_59_ = i_56_ - anInt9253 - anInt9252;
			int i_60_ = i;
			if (i_60_ > anInt9254)
				i_60_ = anInt9254;
			int i_61_ = i;
			if (i_61_ + anInt9254 + anInt9251 > i_57_)
				i_61_ = i_57_ - anInt9254 - anInt9251;
			int i_62_ = anInt9252 + i_58_ + i_59_;
			int i_63_ = anInt9251 + i_60_ + i_61_;
			int[] is = new int[i_62_ * i_63_];
			aBool9250 = false;
			for (int i_64_ = 0; i_64_ < anInt9251; i_64_++) {
				int i_65_ = i_64_ * anInt9252;
				int i_66_ = (i_64_ + i_60_) * i_62_ + i_58_;
				for (int i_67_ = 0; i_67_ < anInt9252; i_67_++) {
					if ((anIntArray9256[i_65_] & ~0xffffff) != -16777216)
						aBool9250 = true;
					is[i_66_++] = anIntArray9256[i_65_++];
				}
			}
			anInt9253 -= i_58_;
			anInt9254 -= i_60_;
			anInt9257 -= i_59_;
			anInt9255 -= i_61_;
			anInt9252 = i_62_;
			anInt9251 = i_63_;
			anIntArray9256 = is;
		}
	}

	public void method3594(int i) {
		int i_68_ = method3576();
		int i_69_ = method3577();
		if (anInt9252 != i_68_ || anInt9251 != i_69_) {
			int i_70_ = i;
			if (i_70_ > anInt9253)
				i_70_ = anInt9253;
			int i_71_ = i;
			if (i_71_ + anInt9253 + anInt9252 > i_68_)
				i_71_ = i_68_ - anInt9253 - anInt9252;
			int i_72_ = i;
			if (i_72_ > anInt9254)
				i_72_ = anInt9254;
			int i_73_ = i;
			if (i_73_ + anInt9254 + anInt9251 > i_69_)
				i_73_ = i_69_ - anInt9254 - anInt9251;
			int i_74_ = anInt9252 + i_70_ + i_71_;
			int i_75_ = anInt9251 + i_72_ + i_73_;
			int[] is = new int[i_74_ * i_75_];
			aBool9250 = false;
			for (int i_76_ = 0; i_76_ < anInt9251; i_76_++) {
				int i_77_ = i_76_ * anInt9252;
				int i_78_ = (i_76_ + i_72_) * i_74_ + i_70_;
				for (int i_79_ = 0; i_79_ < anInt9252; i_79_++) {
					if ((anIntArray9256[i_77_] & ~0xffffff) != -16777216)
						aBool9250 = true;
					is[i_78_++] = anIntArray9256[i_77_++];
				}
			}
			anInt9253 -= i_70_;
			anInt9254 -= i_72_;
			anInt9257 -= i_71_;
			anInt9255 -= i_73_;
			anInt9252 = i_74_;
			anInt9251 = i_75_;
			anIntArray9256 = is;
		}
	}

	public void method3624() {
		int[] is = new int[anInt9252 * anInt9251];
		int i = 0;
		for (int i_80_ = 0; i_80_ < anInt9252; i_80_++) {
			for (int i_81_ = anInt9251 - 1; i_81_ >= 0; i_81_--)
				is[i++] = anIntArray9256[i_80_ + i_81_ * anInt9252];
		}
		anIntArray9256 = is;
		int i_82_ = anInt9254;
		anInt9254 = anInt9253;
		anInt9253 = anInt9255;
		anInt9255 = anInt9257;
		anInt9257 = i_82_;
		i_82_ = anInt9251;
		anInt9251 = anInt9252;
		anInt9252 = i_82_;
	}

	public int method3635() {
		return anInt9255;
	}

	public void method3614(int i) {
		int i_83_ = 0;
		aBool9250 = false;
		int[] is = new int[anInt9252 * anInt9251];
		for (int i_84_ = 0; i_84_ < anInt9251; i_84_++) {
			for (int i_85_ = 0; i_85_ < anInt9252; i_85_++) {
				int i_86_ = anIntArray9256[i_83_];
				if ((i_86_ & ~0xffffff) == 0) {
					if (i_85_ > 0 && (anIntArray9256[i_83_ - 1] & ~0xffffff) != 0)
						i_86_ = i;
					else if (i_84_ > 0 && (anIntArray9256[i_83_ - anInt9252] & ~0xffffff) != 0)
						i_86_ = i;
					else if (i_85_ < anInt9252 - 1 && (anIntArray9256[i_83_ + 1] & ~0xffffff) != 0)
						i_86_ = i;
					else if (i_84_ < anInt9251 - 1 && (anIntArray9256[i_83_ + anInt9252] & ~0xffffff) != 0)
						i_86_ = i;
				}
				if ((i_86_ & ~0xffffff) != -16777216)
					aBool9250 = true;
				is[i_83_++] = i_86_;
			}
		}
		anIntArray9256 = is;
	}

	public boolean method3590() {
		return aBool9250;
	}

	public int method3611() {
		return anInt9254;
	}

	public void method3569(int i) {
		for (int i_87_ = anInt9251 - 1; i_87_ > 0; i_87_--) {
			int i_88_ = i_87_ * anInt9252;
			for (int i_89_ = anInt9252 - 1; i_89_ > 0; i_89_--) {
				if ((anIntArray9256[i_89_ + i_88_] & ~0xffffff) == 0 && (anIntArray9256[i_89_ + i_88_ - 1 - anInt9252] & ~0xffffff) != 0)
					anIntArray9256[i_89_ + i_88_] = i;
			}
		}
	}

	public int method3628() {
		return anInt9253;
	}

	public int method3600() {
		return anInt9251 + anInt9254 + anInt9255;
	}

	public int[] method3584(boolean bool) {
		if (bool && (method3576() != anInt9252 || method3577() != anInt9251)) {
			int i = method3576();
			int[] is = new int[i * method3577()];
			for (int i_90_ = 0; i_90_ < anInt9251; i_90_++) {
				int i_91_ = i_90_ * anInt9252;
				int i_92_ = anInt9253 + (i_90_ + anInt9254) * i;
				for (int i_93_ = 0; i_93_ < anInt9252; i_93_++) {
					is[i_92_++] = anIntArray9256[i_91_];
					i_91_++;
				}
			}
			return is;
		}
		return anIntArray9256;
	}

	public void method3575() {
		int[] is = anIntArray9256;
		for (int i = (anInt9251 >> 1) - 1; i >= 0; i--) {
			int i_94_ = i * anInt9252;
			int i_95_ = (anInt9251 - i - 1) * anInt9252;
			for (int i_96_ = -anInt9252; i_96_ < 0; i_96_++) {
				int i_97_ = is[i_94_];
				is[i_94_] = is[i_95_];
				is[i_95_] = i_97_;
				i_94_++;
				i_95_++;
			}
		}
		int i = anInt9254;
		anInt9254 = anInt9255;
		anInt9255 = i;
	}

	public void method3573() {
		int[] is = anIntArray9256;
		for (int i = (anInt9251 >> 1) - 1; i >= 0; i--) {
			int i_98_ = i * anInt9252;
			int i_99_ = (anInt9251 - i - 1) * anInt9252;
			for (int i_100_ = -anInt9252; i_100_ < 0; i_100_++) {
				int i_101_ = is[i_98_];
				is[i_98_] = is[i_99_];
				is[i_99_] = i_101_;
				i_98_++;
				i_99_++;
			}
		}
		int i = anInt9254;
		anInt9254 = anInt9255;
		anInt9255 = i;
	}

	public void method3623() {
		int[] is = anIntArray9256;
		for (int i = (anInt9251 >> 1) - 1; i >= 0; i--) {
			int i_102_ = i * anInt9252;
			int i_103_ = (anInt9251 - i - 1) * anInt9252;
			for (int i_104_ = -anInt9252; i_104_ < 0; i_104_++) {
				int i_105_ = is[i_102_];
				is[i_102_] = is[i_103_];
				is[i_103_] = i_105_;
				i_102_++;
				i_103_++;
			}
		}
		int i = anInt9254;
		anInt9254 = anInt9255;
		anInt9255 = i;
	}

	public int method3626(int i, int i_106_) {
		return anIntArray9256[i + i_106_ * anInt9252];
	}

	public void method3591(int i, int i_107_, int i_108_) {
		for (int i_109_ = 1; i_109_ < anIntArray9256.length; i_109_++) {
			int i_110_ = anIntArray9256[i_109_] >> 16 & 0xff;
			i_110_ += i;
			if (i_110_ < 0)
				i_110_ = 0;
			else if (i_110_ > 255)
				i_110_ = 255;
			int i_111_ = anIntArray9256[i_109_] >> 8 & 0xff;
			i_111_ += i_107_;
			if (i_111_ < 0)
				i_111_ = 0;
			else if (i_111_ > 255)
				i_111_ = 255;
			int i_112_ = anIntArray9256[i_109_] >> 0 & 0xff;
			i_112_ += i_108_;
			if (i_112_ < 0)
				i_112_ = 0;
			else if (i_112_ > 255)
				i_112_ = 255;
			anIntArray9256[i_109_] = (anIntArray9256[i_109_] & ~0xffffff | i_110_ << 16 | i_111_ << 8 | i_112_);
		}
	}

	public void method3586(int i) {
		int i_113_ = 0;
		aBool9250 = false;
		int[] is = new int[anInt9252 * anInt9251];
		for (int i_114_ = 0; i_114_ < anInt9251; i_114_++) {
			for (int i_115_ = 0; i_115_ < anInt9252; i_115_++) {
				int i_116_ = anIntArray9256[i_113_];
				if ((i_116_ & ~0xffffff) == 0) {
					if (i_115_ > 0 && (anIntArray9256[i_113_ - 1] & ~0xffffff) != 0)
						i_116_ = i;
					else if (i_114_ > 0 && (anIntArray9256[i_113_ - anInt9252] & ~0xffffff) != 0)
						i_116_ = i;
					else if (i_115_ < anInt9252 - 1 && (anIntArray9256[i_113_ + 1] & ~0xffffff) != 0)
						i_116_ = i;
					else if (i_114_ < anInt9251 - 1 && (anIntArray9256[i_113_ + anInt9252] & ~0xffffff) != 0)
						i_116_ = i;
				}
				if ((i_116_ & ~0xffffff) != -16777216)
					aBool9250 = true;
				is[i_113_++] = i_116_;
			}
		}
		anIntArray9256 = is;
	}

	public void method3583(int i) {
		int i_117_ = method3576();
		int i_118_ = method3577();
		if (anInt9252 != i_117_ || anInt9251 != i_118_) {
			int i_119_ = i;
			if (i_119_ > anInt9253)
				i_119_ = anInt9253;
			int i_120_ = i;
			if (i_120_ + anInt9253 + anInt9252 > i_117_)
				i_120_ = i_117_ - anInt9253 - anInt9252;
			int i_121_ = i;
			if (i_121_ > anInt9254)
				i_121_ = anInt9254;
			int i_122_ = i;
			if (i_122_ + anInt9254 + anInt9251 > i_118_)
				i_122_ = i_118_ - anInt9254 - anInt9251;
			int i_123_ = anInt9252 + i_119_ + i_120_;
			int i_124_ = anInt9251 + i_121_ + i_122_;
			int[] is = new int[i_123_ * i_124_];
			aBool9250 = false;
			for (int i_125_ = 0; i_125_ < anInt9251; i_125_++) {
				int i_126_ = i_125_ * anInt9252;
				int i_127_ = (i_125_ + i_121_) * i_123_ + i_119_;
				for (int i_128_ = 0; i_128_ < anInt9252; i_128_++) {
					if ((anIntArray9256[i_126_] & ~0xffffff) != -16777216)
						aBool9250 = true;
					is[i_127_++] = anIntArray9256[i_126_++];
				}
			}
			anInt9253 -= i_119_;
			anInt9254 -= i_121_;
			anInt9257 -= i_120_;
			anInt9255 -= i_122_;
			anInt9252 = i_123_;
			anInt9251 = i_124_;
			anIntArray9256 = is;
		}
	}

	public int method3589(int i, int i_129_) {
		return anIntArray9256[i + i_129_ * anInt9252];
	}

	public int method3629() {
		return anInt9253;
	}

	public void method3625() {
		int[] is = anIntArray9256;
		for (int i = anInt9251 - 1; i >= 0; i--) {
			int i_130_ = i * anInt9252;
			for (int i_131_ = (i + 1) * anInt9252; i_130_ < i_131_; i_130_++) {
				i_131_--;
				int i_132_ = is[i_130_];
				is[i_130_] = is[i_131_];
				is[i_131_] = i_132_;
			}
		}
		int i = anInt9253;
		anInt9253 = anInt9257;
		anInt9257 = i;
	}

	public int[] method3631(boolean bool) {
		if (bool && (method3576() != anInt9252 || method3577() != anInt9251)) {
			int i = method3576();
			int[] is = new int[i * method3577()];
			for (int i_133_ = 0; i_133_ < anInt9251; i_133_++) {
				int i_134_ = i_133_ * anInt9252;
				int i_135_ = anInt9253 + (i_133_ + anInt9254) * i;
				for (int i_136_ = 0; i_136_ < anInt9252; i_136_++) {
					is[i_135_++] = anIntArray9256[i_134_];
					i_134_++;
				}
			}
			return is;
		}
		return anIntArray9256;
	}

	public int[] method3632(boolean bool) {
		if (bool && (method3576() != anInt9252 || method3577() != anInt9251)) {
			int i = method3576();
			int[] is = new int[i * method3577()];
			for (int i_137_ = 0; i_137_ < anInt9251; i_137_++) {
				int i_138_ = i_137_ * anInt9252;
				int i_139_ = anInt9253 + (i_137_ + anInt9254) * i;
				for (int i_140_ = 0; i_140_ < anInt9252; i_140_++) {
					is[i_139_++] = anIntArray9256[i_138_];
					i_138_++;
				}
			}
			return is;
		}
		return anIntArray9256;
	}

	public int[] method3633(boolean bool) {
		if (bool && (method3576() != anInt9252 || method3577() != anInt9251)) {
			int i = method3576();
			int[] is = new int[i * method3577()];
			for (int i_141_ = 0; i_141_ < anInt9251; i_141_++) {
				int i_142_ = i_141_ * anInt9252;
				int i_143_ = anInt9253 + (i_141_ + anInt9254) * i;
				for (int i_144_ = 0; i_144_ < anInt9252; i_144_++) {
					is[i_143_++] = anIntArray9256[i_142_];
					i_142_++;
				}
			}
			return is;
		}
		return anIntArray9256;
	}

	public void method3588(int i, int i_145_, int i_146_) {
		for (int i_147_ = 1; i_147_ < anIntArray9256.length; i_147_++) {
			int i_148_ = anIntArray9256[i_147_] >> 16 & 0xff;
			i_148_ += i;
			if (i_148_ < 0)
				i_148_ = 0;
			else if (i_148_ > 255)
				i_148_ = 255;
			int i_149_ = anIntArray9256[i_147_] >> 8 & 0xff;
			i_149_ += i_145_;
			if (i_149_ < 0)
				i_149_ = 0;
			else if (i_149_ > 255)
				i_149_ = 255;
			int i_150_ = anIntArray9256[i_147_] >> 0 & 0xff;
			i_150_ += i_146_;
			if (i_150_ < 0)
				i_150_ = 0;
			else if (i_150_ > 255)
				i_150_ = 255;
			anIntArray9256[i_147_] = (anIntArray9256[i_147_] & ~0xffffff | i_148_ << 16 | i_149_ << 8 | i_150_);
		}
	}

	public void method3613(int i, int i_151_, int i_152_) {
		for (int i_153_ = 1; i_153_ < anIntArray9256.length; i_153_++) {
			int i_154_ = anIntArray9256[i_153_] >> 16 & 0xff;
			i_154_ += i;
			if (i_154_ < 0)
				i_154_ = 0;
			else if (i_154_ > 255)
				i_154_ = 255;
			int i_155_ = anIntArray9256[i_153_] >> 8 & 0xff;
			i_155_ += i_151_;
			if (i_155_ < 0)
				i_155_ = 0;
			else if (i_155_ > 255)
				i_155_ = 255;
			int i_156_ = anIntArray9256[i_153_] >> 0 & 0xff;
			i_156_ += i_152_;
			if (i_156_ < 0)
				i_156_ = 0;
			else if (i_156_ > 255)
				i_156_ = 255;
			anIntArray9256[i_153_] = (anIntArray9256[i_153_] & ~0xffffff | i_154_ << 16 | i_155_ << 8 | i_156_);
		}
	}

	public boolean method3567() {
		return false;
	}

	public int method3637() {
		return anInt9252 + anInt9253 + anInt9257;
	}
}
