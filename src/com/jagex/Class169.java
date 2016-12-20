/* Class169 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class169 {
	public int anInt1872;
	public int anInt1873;
	public boolean aBool1874 = false;
	public int anInt1875;
	public int anInt1876;
	public int anInt1877;

	public void method2704(Class439 class439, Class427 class427, Class427 class427_0_, float f, float f_1_, float f_2_, float f_3_) {
		boolean bool = false;
		aBool1874 = true;
		int i = (int) (class439.aFloat4894 + class439.aFloat4893) >> 1;
		int i_4_ = (int) (class439.aFloat4892 + class439.aFloat4895) >> 1;
		int i_5_ = i;
		int i_6_ = (int) class439.aFloat4891;
		int i_7_ = i_4_;
		float f_8_ = (class427_0_.aFloatArray4807[0] * (float) i_5_ + class427_0_.aFloatArray4807[4] * (float) i_6_ + class427_0_.aFloatArray4807[8] * (float) i_7_ + class427_0_.aFloatArray4807[12]);
		float f_9_ = (class427_0_.aFloatArray4807[1] * (float) i_5_ + class427_0_.aFloatArray4807[5] * (float) i_6_ + class427_0_.aFloatArray4807[9] * (float) i_7_ + class427_0_.aFloatArray4807[13]);
		float f_10_ = (class427_0_.aFloatArray4807[2] * (float) i_5_ + class427_0_.aFloatArray4807[6] * (float) i_6_ + class427_0_.aFloatArray4807[10] * (float) i_7_ + class427_0_.aFloatArray4807[14]);
		float f_11_ = (class427_0_.aFloatArray4807[3] * (float) i_5_ + class427_0_.aFloatArray4807[7] * (float) i_6_ + class427_0_.aFloatArray4807[11] * (float) i_7_ + class427_0_.aFloatArray4807[15]);
		if (f_10_ >= -f_11_) {
			anInt1872 = (int) (f + f_2_ * f_8_ / f_11_);
			anInt1876 = (int) (f_1_ + f_3_ * f_9_ / f_11_);
		} else
			bool = true;
		i_5_ = i;
		i_6_ = (int) class439.aFloat4890;
		i_7_ = i_4_;
		float f_12_ = (class427_0_.aFloatArray4807[0] * (float) i_5_ + class427_0_.aFloatArray4807[4] * (float) i_6_ + class427_0_.aFloatArray4807[8] * (float) i_7_ + class427_0_.aFloatArray4807[12]);
		float f_13_ = (class427_0_.aFloatArray4807[1] * (float) i_5_ + class427_0_.aFloatArray4807[5] * (float) i_6_ + class427_0_.aFloatArray4807[9] * (float) i_7_ + class427_0_.aFloatArray4807[13]);
		float f_14_ = (class427_0_.aFloatArray4807[2] * (float) i_5_ + class427_0_.aFloatArray4807[6] * (float) i_6_ + class427_0_.aFloatArray4807[10] * (float) i_7_ + class427_0_.aFloatArray4807[14]);
		float f_15_ = (class427_0_.aFloatArray4807[3] * (float) i_5_ + class427_0_.aFloatArray4807[7] * (float) i_6_ + class427_0_.aFloatArray4807[11] * (float) i_7_ + class427_0_.aFloatArray4807[15]);
		if (f_14_ >= -f_15_) {
			anInt1873 = (int) (f + f_2_ * f_12_ / f_15_);
			anInt1875 = (int) (f_1_ + f_3_ * f_13_ / f_15_);
		} else
			bool = true;
		if (bool) {
			if (f_10_ < -f_11_ && f_14_ < -f_15_)
				aBool1874 = false;
			else if (f_10_ < -f_11_) {
				float f_16_ = (f_10_ + f_11_) / (f_14_ + f_15_) - 1.0F;
				float f_17_ = f_8_ + f_16_ * (f_12_ - f_8_);
				float f_18_ = f_9_ + f_16_ * (f_13_ - f_9_);
				float f_19_ = f_11_ + f_16_ * (f_15_ - f_11_);
				anInt1872 = (int) (f + f_2_ * f_17_ / f_19_);
				anInt1876 = (int) (f_1_ + f_3_ * f_18_ / f_19_);
			} else if (f_14_ < -f_15_) {
				float f_20_ = (f_14_ + f_15_) / (f_10_ + f_11_) - 1.0F;
				float f_21_ = f_12_ + f_20_ * (f_8_ - f_12_);
				float f_22_ = f_13_ + f_20_ * (f_9_ - f_13_);
				float f_23_ = f_15_ + f_20_ * (f_11_ - f_15_);
				anInt1873 = (int) (f + f_2_ * f_21_ / f_23_);
				anInt1875 = (int) (f_1_ + f_3_ * f_22_ / f_23_);
			}
		}
		if (aBool1874) {
			float f_24_ = ((float) Math.sqrt(Math.pow((double) (class439.aFloat4893 - class439.aFloat4894), 2.0) + Math.pow((double) (class439.aFloat4895 - (class439.aFloat4892)), 2.0)) / 2.0F);
			if (f_10_ / f_11_ > f_14_ / f_15_) {
				float f_25_ = (f_8_ + class427.aFloatArray4807[0] * f_24_ + class427.aFloatArray4807[12]);
				float f_26_ = (f_11_ + class427.aFloatArray4807[3] * f_24_ + class427.aFloatArray4807[15]);
				anInt1877 = (int) (f - (float) anInt1872 + f_2_ * f_25_ / f_26_);
			} else {
				float f_27_ = (f_12_ + class427.aFloatArray4807[0] * f_24_ + class427.aFloatArray4807[12]);
				float f_28_ = (f_15_ + class427.aFloatArray4807[3] * f_24_ + class427.aFloatArray4807[15]);
				anInt1877 = (int) (f - (float) anInt1873 + f_2_ * f_27_ / f_28_);
			}
			aBool1874 = true;
		}
	}

	public boolean method2705(int i, int i_29_) {
		if (!aBool1874)
			return false;
		int i_30_ = anInt1873 - anInt1872;
		int i_31_ = anInt1875 - anInt1876;
		int i_32_ = i_30_ * i_30_ + i_31_ * i_31_;
		int i_33_ = (i * i_30_ + i_29_ * i_31_ - (anInt1872 * i_30_ + anInt1876 * i_31_));
		if (i_33_ <= 0) {
			int i_34_ = anInt1872 - i;
			int i_35_ = anInt1876 - i_29_;
			return i_34_ * i_34_ + i_35_ * i_35_ < anInt1877 * anInt1877;
		}
		if (i_33_ > i_32_) {
			int i_36_ = anInt1873 - i;
			int i_37_ = anInt1875 - i_29_;
			return i_36_ * i_36_ + i_37_ * i_37_ < anInt1877 * anInt1877;
		}
		int i_38_ = 10;
		if (i_33_ != (i_33_ & 0x1fffff))
			i_38_ = 5;
		i_33_ = (i_33_ << i_38_) / i_32_;
		int i_39_ = anInt1872 + (i_30_ * i_33_ >> i_38_) - i;
		int i_40_ = anInt1876 + (i_31_ * i_33_ >> i_38_) - i_29_;
		return i_39_ * i_39_ + i_40_ * i_40_ < anInt1877 * anInt1877;
	}

	public void method2706(Class439 class439, Class427 class427, Class427 class427_41_, float f, float f_42_, float f_43_, float f_44_) {
		boolean bool = false;
		aBool1874 = true;
		int i = (int) (class439.aFloat4894 + class439.aFloat4893) >> 1;
		int i_45_ = (int) (class439.aFloat4892 + class439.aFloat4895) >> 1;
		int i_46_ = i;
		int i_47_ = (int) class439.aFloat4891;
		int i_48_ = i_45_;
		float f_49_ = (class427_41_.aFloatArray4807[0] * (float) i_46_ + class427_41_.aFloatArray4807[4] * (float) i_47_ + class427_41_.aFloatArray4807[8] * (float) i_48_ + class427_41_.aFloatArray4807[12]);
		float f_50_ = (class427_41_.aFloatArray4807[1] * (float) i_46_ + class427_41_.aFloatArray4807[5] * (float) i_47_ + class427_41_.aFloatArray4807[9] * (float) i_48_ + class427_41_.aFloatArray4807[13]);
		float f_51_ = (class427_41_.aFloatArray4807[2] * (float) i_46_ + class427_41_.aFloatArray4807[6] * (float) i_47_ + class427_41_.aFloatArray4807[10] * (float) i_48_ + class427_41_.aFloatArray4807[14]);
		float f_52_ = (class427_41_.aFloatArray4807[3] * (float) i_46_ + class427_41_.aFloatArray4807[7] * (float) i_47_ + class427_41_.aFloatArray4807[11] * (float) i_48_ + class427_41_.aFloatArray4807[15]);
		if (f_51_ >= -f_52_) {
			anInt1872 = (int) (f + f_43_ * f_49_ / f_52_);
			anInt1876 = (int) (f_42_ + f_44_ * f_50_ / f_52_);
		} else
			bool = true;
		i_46_ = i;
		i_47_ = (int) class439.aFloat4890;
		i_48_ = i_45_;
		float f_53_ = (class427_41_.aFloatArray4807[0] * (float) i_46_ + class427_41_.aFloatArray4807[4] * (float) i_47_ + class427_41_.aFloatArray4807[8] * (float) i_48_ + class427_41_.aFloatArray4807[12]);
		float f_54_ = (class427_41_.aFloatArray4807[1] * (float) i_46_ + class427_41_.aFloatArray4807[5] * (float) i_47_ + class427_41_.aFloatArray4807[9] * (float) i_48_ + class427_41_.aFloatArray4807[13]);
		float f_55_ = (class427_41_.aFloatArray4807[2] * (float) i_46_ + class427_41_.aFloatArray4807[6] * (float) i_47_ + class427_41_.aFloatArray4807[10] * (float) i_48_ + class427_41_.aFloatArray4807[14]);
		float f_56_ = (class427_41_.aFloatArray4807[3] * (float) i_46_ + class427_41_.aFloatArray4807[7] * (float) i_47_ + class427_41_.aFloatArray4807[11] * (float) i_48_ + class427_41_.aFloatArray4807[15]);
		if (f_55_ >= -f_56_) {
			anInt1873 = (int) (f + f_43_ * f_53_ / f_56_);
			anInt1875 = (int) (f_42_ + f_44_ * f_54_ / f_56_);
		} else
			bool = true;
		if (bool) {
			if (f_51_ < -f_52_ && f_55_ < -f_56_)
				aBool1874 = false;
			else if (f_51_ < -f_52_) {
				float f_57_ = (f_51_ + f_52_) / (f_55_ + f_56_) - 1.0F;
				float f_58_ = f_49_ + f_57_ * (f_53_ - f_49_);
				float f_59_ = f_50_ + f_57_ * (f_54_ - f_50_);
				float f_60_ = f_52_ + f_57_ * (f_56_ - f_52_);
				anInt1872 = (int) (f + f_43_ * f_58_ / f_60_);
				anInt1876 = (int) (f_42_ + f_44_ * f_59_ / f_60_);
			} else if (f_55_ < -f_56_) {
				float f_61_ = (f_55_ + f_56_) / (f_51_ + f_52_) - 1.0F;
				float f_62_ = f_53_ + f_61_ * (f_49_ - f_53_);
				float f_63_ = f_54_ + f_61_ * (f_50_ - f_54_);
				float f_64_ = f_56_ + f_61_ * (f_52_ - f_56_);
				anInt1873 = (int) (f + f_43_ * f_62_ / f_64_);
				anInt1875 = (int) (f_42_ + f_44_ * f_63_ / f_64_);
			}
		}
		if (aBool1874) {
			float f_65_ = ((float) Math.sqrt(Math.pow((double) (class439.aFloat4893 - class439.aFloat4894), 2.0) + Math.pow((double) (class439.aFloat4895 - (class439.aFloat4892)), 2.0)) / 2.0F);
			if (f_51_ / f_52_ > f_55_ / f_56_) {
				float f_66_ = (f_49_ + class427.aFloatArray4807[0] * f_65_ + class427.aFloatArray4807[12]);
				float f_67_ = (f_52_ + class427.aFloatArray4807[3] * f_65_ + class427.aFloatArray4807[15]);
				anInt1877 = (int) (f - (float) anInt1872 + f_43_ * f_66_ / f_67_);
			} else {
				float f_68_ = (f_53_ + class427.aFloatArray4807[0] * f_65_ + class427.aFloatArray4807[12]);
				float f_69_ = (f_56_ + class427.aFloatArray4807[3] * f_65_ + class427.aFloatArray4807[15]);
				anInt1877 = (int) (f - (float) anInt1873 + f_43_ * f_68_ / f_69_);
			}
			aBool1874 = true;
		}
	}

	public void method2707(Class439 class439, Class427 class427, Class427 class427_70_, float f, float f_71_, float f_72_, float f_73_) {
		boolean bool = false;
		aBool1874 = true;
		int i = (int) (class439.aFloat4894 + class439.aFloat4893) >> 1;
		int i_74_ = (int) (class439.aFloat4892 + class439.aFloat4895) >> 1;
		int i_75_ = i;
		int i_76_ = (int) class439.aFloat4891;
		int i_77_ = i_74_;
		float f_78_ = (class427_70_.aFloatArray4807[0] * (float) i_75_ + class427_70_.aFloatArray4807[4] * (float) i_76_ + class427_70_.aFloatArray4807[8] * (float) i_77_ + class427_70_.aFloatArray4807[12]);
		float f_79_ = (class427_70_.aFloatArray4807[1] * (float) i_75_ + class427_70_.aFloatArray4807[5] * (float) i_76_ + class427_70_.aFloatArray4807[9] * (float) i_77_ + class427_70_.aFloatArray4807[13]);
		float f_80_ = (class427_70_.aFloatArray4807[2] * (float) i_75_ + class427_70_.aFloatArray4807[6] * (float) i_76_ + class427_70_.aFloatArray4807[10] * (float) i_77_ + class427_70_.aFloatArray4807[14]);
		float f_81_ = (class427_70_.aFloatArray4807[3] * (float) i_75_ + class427_70_.aFloatArray4807[7] * (float) i_76_ + class427_70_.aFloatArray4807[11] * (float) i_77_ + class427_70_.aFloatArray4807[15]);
		if (f_80_ >= -f_81_) {
			anInt1872 = (int) (f + f_72_ * f_78_ / f_81_);
			anInt1876 = (int) (f_71_ + f_73_ * f_79_ / f_81_);
		} else
			bool = true;
		i_75_ = i;
		i_76_ = (int) class439.aFloat4890;
		i_77_ = i_74_;
		float f_82_ = (class427_70_.aFloatArray4807[0] * (float) i_75_ + class427_70_.aFloatArray4807[4] * (float) i_76_ + class427_70_.aFloatArray4807[8] * (float) i_77_ + class427_70_.aFloatArray4807[12]);
		float f_83_ = (class427_70_.aFloatArray4807[1] * (float) i_75_ + class427_70_.aFloatArray4807[5] * (float) i_76_ + class427_70_.aFloatArray4807[9] * (float) i_77_ + class427_70_.aFloatArray4807[13]);
		float f_84_ = (class427_70_.aFloatArray4807[2] * (float) i_75_ + class427_70_.aFloatArray4807[6] * (float) i_76_ + class427_70_.aFloatArray4807[10] * (float) i_77_ + class427_70_.aFloatArray4807[14]);
		float f_85_ = (class427_70_.aFloatArray4807[3] * (float) i_75_ + class427_70_.aFloatArray4807[7] * (float) i_76_ + class427_70_.aFloatArray4807[11] * (float) i_77_ + class427_70_.aFloatArray4807[15]);
		if (f_84_ >= -f_85_) {
			anInt1873 = (int) (f + f_72_ * f_82_ / f_85_);
			anInt1875 = (int) (f_71_ + f_73_ * f_83_ / f_85_);
		} else
			bool = true;
		if (bool) {
			if (f_80_ < -f_81_ && f_84_ < -f_85_)
				aBool1874 = false;
			else if (f_80_ < -f_81_) {
				float f_86_ = (f_80_ + f_81_) / (f_84_ + f_85_) - 1.0F;
				float f_87_ = f_78_ + f_86_ * (f_82_ - f_78_);
				float f_88_ = f_79_ + f_86_ * (f_83_ - f_79_);
				float f_89_ = f_81_ + f_86_ * (f_85_ - f_81_);
				anInt1872 = (int) (f + f_72_ * f_87_ / f_89_);
				anInt1876 = (int) (f_71_ + f_73_ * f_88_ / f_89_);
			} else if (f_84_ < -f_85_) {
				float f_90_ = (f_84_ + f_85_) / (f_80_ + f_81_) - 1.0F;
				float f_91_ = f_82_ + f_90_ * (f_78_ - f_82_);
				float f_92_ = f_83_ + f_90_ * (f_79_ - f_83_);
				float f_93_ = f_85_ + f_90_ * (f_81_ - f_85_);
				anInt1873 = (int) (f + f_72_ * f_91_ / f_93_);
				anInt1875 = (int) (f_71_ + f_73_ * f_92_ / f_93_);
			}
		}
		if (aBool1874) {
			float f_94_ = ((float) Math.sqrt(Math.pow((double) (class439.aFloat4893 - class439.aFloat4894), 2.0) + Math.pow((double) (class439.aFloat4895 - (class439.aFloat4892)), 2.0)) / 2.0F);
			if (f_80_ / f_81_ > f_84_ / f_85_) {
				float f_95_ = (f_78_ + class427.aFloatArray4807[0] * f_94_ + class427.aFloatArray4807[12]);
				float f_96_ = (f_81_ + class427.aFloatArray4807[3] * f_94_ + class427.aFloatArray4807[15]);
				anInt1877 = (int) (f - (float) anInt1872 + f_72_ * f_95_ / f_96_);
			} else {
				float f_97_ = (f_82_ + class427.aFloatArray4807[0] * f_94_ + class427.aFloatArray4807[12]);
				float f_98_ = (f_85_ + class427.aFloatArray4807[3] * f_94_ + class427.aFloatArray4807[15]);
				anInt1877 = (int) (f - (float) anInt1873 + f_72_ * f_97_ / f_98_);
			}
			aBool1874 = true;
		}
	}
}
