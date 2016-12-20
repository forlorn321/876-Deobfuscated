/* Class432 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class432 {
	float aFloat4852;
	public static Class432 aClass432_4853 = new Class432();
	float aFloat4854;
	float aFloat4855;
	float aFloat4856;
	float aFloat4857;
	float aFloat4858;
	float aFloat4859;
	float aFloat4860;
	float aFloat4861;
	float aFloat4862;
	float aFloat4863;
	float aFloat4864;

	public void method6878() {
		aFloat4864 = 0.0F;
		aFloat4863 = 0.0F;
		aFloat4852 = 0.0F;
		aFloat4861 = 0.0F;
		aFloat4859 = 0.0F;
		aFloat4860 = 0.0F;
		aFloat4856 = 0.0F;
		aFloat4858 = 0.0F;
		aFloat4854 = 0.0F;
		aFloat4855 = 1.0F;
		aFloat4857 = 1.0F;
		aFloat4862 = 1.0F;
	}

	public Class432(Class432 class432_0_) {
		method6899(class432_0_);
	}

	public void method6879(Class442 class442) {
		method6896(class442.aFloat4918, class442.aFloat4915, class442.aFloat4919);
	}

	public void method6880(Class445 class445) {
		method6907(class445.aClass438_4926);
		method6908(class445.aClass442_4927);
	}

	public void method6881(float f, float f_1_, float f_2_) {
		aFloat4862 *= f;
		aFloat4856 *= f;
		aFloat4859 *= f;
		aFloat4852 *= f;
		aFloat4854 *= f_1_;
		aFloat4857 *= f_1_;
		aFloat4861 *= f_1_;
		aFloat4863 *= f_1_;
		aFloat4858 *= f_2_;
		aFloat4860 *= f_2_;
		aFloat4855 *= f_2_;
		aFloat4864 *= f_2_;
	}

	public void method6882(Class432 class432_3_) {
		float f = aFloat4862;
		float f_4_ = aFloat4854;
		float f_5_ = aFloat4856;
		float f_6_ = aFloat4857;
		float f_7_ = aFloat4859;
		float f_8_ = aFloat4861;
		float f_9_ = aFloat4852;
		float f_10_ = aFloat4863;
		float f_11_ = aFloat4858;
		float f_12_ = aFloat4860;
		float f_13_ = aFloat4855;
		float f_14_ = aFloat4864;
		aFloat4862 = (f * class432_3_.aFloat4862 + f_4_ * class432_3_.aFloat4856 + f_11_ * class432_3_.aFloat4859);
		aFloat4854 = (f * class432_3_.aFloat4854 + f_4_ * class432_3_.aFloat4857 + f_11_ * class432_3_.aFloat4861);
		aFloat4858 = (f * class432_3_.aFloat4858 + f_4_ * class432_3_.aFloat4860 + f_11_ * class432_3_.aFloat4855);
		aFloat4856 = (f_5_ * class432_3_.aFloat4862 + f_6_ * class432_3_.aFloat4856 + f_12_ * class432_3_.aFloat4859);
		aFloat4857 = (f_5_ * class432_3_.aFloat4854 + f_6_ * class432_3_.aFloat4857 + f_12_ * class432_3_.aFloat4861);
		aFloat4860 = (f_5_ * class432_3_.aFloat4858 + f_6_ * class432_3_.aFloat4860 + f_12_ * class432_3_.aFloat4855);
		aFloat4859 = (f_7_ * class432_3_.aFloat4862 + f_8_ * class432_3_.aFloat4856 + f_13_ * class432_3_.aFloat4859);
		aFloat4861 = (f_7_ * class432_3_.aFloat4854 + f_8_ * class432_3_.aFloat4857 + f_13_ * class432_3_.aFloat4861);
		aFloat4855 = (f_7_ * class432_3_.aFloat4858 + f_8_ * class432_3_.aFloat4860 + f_13_ * class432_3_.aFloat4855);
		aFloat4852 = (f_9_ * class432_3_.aFloat4862 + f_10_ * class432_3_.aFloat4856 + f_14_ * class432_3_.aFloat4859 + class432_3_.aFloat4852);
		aFloat4863 = (f_9_ * class432_3_.aFloat4854 + f_10_ * class432_3_.aFloat4857 + f_14_ * class432_3_.aFloat4861 + class432_3_.aFloat4863);
		aFloat4864 = (f_9_ * class432_3_.aFloat4858 + f_10_ * class432_3_.aFloat4860 + f_14_ * class432_3_.aFloat4855 + class432_3_.aFloat4864);
	}

	public void method6883(float f, float f_15_, float f_16_, float[] fs) {
		fs[0] = (aFloat4862 * f + aFloat4856 * f_15_ + aFloat4859 * f_16_ + aFloat4852);
		fs[1] = (aFloat4854 * f + aFloat4857 * f_15_ + aFloat4861 * f_16_ + aFloat4863);
		fs[2] = (aFloat4858 * f + aFloat4860 * f_15_ + aFloat4855 * f_16_ + aFloat4864);
	}

	public void method6884(int i, int i_17_, int i_18_, float f, float f_19_, float f_20_) {
		if (i != 0) {
			float f_21_ = Class436.aFloatArray4880[i & 0x3fff];
			float f_22_ = Class436.aFloatArray4879[i & 0x3fff];
			aFloat4855 = 1.0F;
			aFloat4861 = 0.0F;
			aFloat4859 = 0.0F;
			aFloat4860 = 0.0F;
			aFloat4858 = 0.0F;
			aFloat4862 = 2.0F * f_21_ * (float) i_17_;
			aFloat4857 = 2.0F * f_21_ * (float) i_18_;
			aFloat4854 = 2.0F * f_22_ * (float) i_17_;
			aFloat4856 = -2.0F * f_22_ * (float) i_18_;
			aFloat4852 = (float) (2 * i_17_) * (0.5F * f_22_ - 0.5F * f_21_) + f;
			aFloat4863 = (float) (2 * i_18_) * (-0.5F * f_22_ - 0.5F * f_21_) + f_19_;
			aFloat4864 = f_20_;
		} else {
			aFloat4861 = 0.0F;
			aFloat4859 = 0.0F;
			aFloat4860 = 0.0F;
			aFloat4856 = 0.0F;
			aFloat4858 = 0.0F;
			aFloat4854 = 0.0F;
			aFloat4862 = (float) (2 * i_17_);
			aFloat4857 = (float) (2 * i_18_);
			aFloat4855 = 1.0F;
			aFloat4852 = f - (float) i_17_;
			aFloat4863 = f_19_ - (float) i_18_;
			aFloat4864 = f_20_;
		}
	}

	public void method6885(int i, int i_23_, int i_24_, float f, float f_25_, float f_26_) {
		if (i != 0) {
			float f_27_ = Class436.aFloatArray4880[i & 0x3fff];
			float f_28_ = Class436.aFloatArray4879[i & 0x3fff];
			aFloat4855 = 1.0F;
			aFloat4861 = 0.0F;
			aFloat4859 = 0.0F;
			aFloat4860 = 0.0F;
			aFloat4858 = 0.0F;
			aFloat4862 = 2.0F * f_27_ * (float) i_23_;
			aFloat4857 = 2.0F * f_27_ * (float) i_24_;
			aFloat4854 = 2.0F * f_28_ * (float) i_23_;
			aFloat4856 = -2.0F * f_28_ * (float) i_24_;
			aFloat4852 = (float) (2 * i_23_) * (0.5F * f_28_ - 0.5F * f_27_) + f;
			aFloat4863 = (float) (2 * i_24_) * (-0.5F * f_28_ - 0.5F * f_27_) + f_25_;
			aFloat4864 = f_26_;
		} else {
			aFloat4861 = 0.0F;
			aFloat4859 = 0.0F;
			aFloat4860 = 0.0F;
			aFloat4856 = 0.0F;
			aFloat4858 = 0.0F;
			aFloat4854 = 0.0F;
			aFloat4862 = (float) (2 * i_23_);
			aFloat4857 = (float) (2 * i_24_);
			aFloat4855 = 1.0F;
			aFloat4852 = f - (float) i_23_;
			aFloat4863 = f_25_ - (float) i_24_;
			aFloat4864 = f_26_;
		}
	}

	public void method6886() {
		aFloat4864 = 0.0F;
		aFloat4863 = 0.0F;
		aFloat4852 = 0.0F;
		aFloat4861 = 0.0F;
		aFloat4859 = 0.0F;
		aFloat4860 = 0.0F;
		aFloat4856 = 0.0F;
		aFloat4858 = 0.0F;
		aFloat4854 = 0.0F;
		aFloat4855 = 1.0F;
		aFloat4857 = 1.0F;
		aFloat4862 = 1.0F;
	}

	public void method6887() {
		float f = aFloat4852;
		float f_29_ = aFloat4863;
		float f_30_ = aFloat4856;
		aFloat4856 = aFloat4854;
		aFloat4854 = f_30_;
		float f_31_ = aFloat4859;
		aFloat4859 = aFloat4858;
		aFloat4858 = f_31_;
		float f_32_ = aFloat4861;
		aFloat4861 = aFloat4860;
		aFloat4860 = f_32_;
		aFloat4852 = -(f * aFloat4862 + f_29_ * aFloat4856 + aFloat4864 * aFloat4859);
		aFloat4863 = -(f * aFloat4854 + f_29_ * aFloat4857 + aFloat4864 * aFloat4861);
		aFloat4864 = -(f * aFloat4858 + f_29_ * aFloat4860 + aFloat4864 * aFloat4855);
	}

	public void method6888(float[] fs) {
		float f = fs[0] - aFloat4852;
		float f_33_ = fs[1] - aFloat4863;
		float f_34_ = fs[2] - aFloat4864;
		fs[0] = (float) (int) (aFloat4862 * f + aFloat4854 * f_33_ + aFloat4858 * f_34_);
		fs[1] = (float) (int) (aFloat4856 * f + aFloat4857 * f_33_ + aFloat4860 * f_34_);
		fs[2] = (float) (int) (aFloat4859 * f + aFloat4861 * f_33_ + aFloat4855 * f_34_);
	}

	public void method6889(float f, float f_35_, float f_36_, float[] fs) {
		f -= aFloat4852;
		f_35_ -= aFloat4863;
		f_36_ -= aFloat4864;
		fs[0] = (float) (int) (aFloat4862 * f + aFloat4854 * f_35_ + aFloat4858 * f_36_);
		fs[1] = (float) (int) (aFloat4856 * f + aFloat4857 * f_35_ + aFloat4860 * f_36_);
		fs[2] = (float) (int) (aFloat4859 * f + aFloat4861 * f_35_ + aFloat4855 * f_36_);
	}

	public void method6890(float f, float f_37_, float f_38_, float f_39_) {
		float f_40_ = (float) Math.cos((double) f_39_);
		float f_41_ = (float) Math.sin((double) f_39_);
		aFloat4862 = f_40_ + f * f * (1.0F - f_40_);
		aFloat4854 = f_38_ * f_41_ + f_37_ * f * (1.0F - f_40_);
		aFloat4858 = -f_37_ * f_41_ + f_38_ * f * (1.0F - f_40_);
		aFloat4856 = -f_38_ * f_41_ + f * f_37_ * (1.0F - f_40_);
		aFloat4857 = f_40_ + f_37_ * f_37_ * (1.0F - f_40_);
		aFloat4860 = f * f_41_ + f_38_ * f_37_ * (1.0F - f_40_);
		aFloat4859 = f_37_ * f_41_ + f * f_38_ * (1.0F - f_40_);
		aFloat4861 = -f * f_41_ + f_37_ * f_38_ * (1.0F - f_40_);
		aFloat4855 = f_40_ + f_38_ * f_38_ * (1.0F - f_40_);
		aFloat4864 = 0.0F;
		aFloat4863 = 0.0F;
		aFloat4852 = 0.0F;
	}

	public void method6891(Class432 class432_42_) {
		aFloat4862 = class432_42_.aFloat4862;
		aFloat4856 = class432_42_.aFloat4856;
		aFloat4859 = class432_42_.aFloat4859;
		aFloat4852 = class432_42_.aFloat4852;
		aFloat4854 = class432_42_.aFloat4854;
		aFloat4857 = class432_42_.aFloat4857;
		aFloat4861 = class432_42_.aFloat4861;
		aFloat4863 = class432_42_.aFloat4863;
		aFloat4858 = class432_42_.aFloat4858;
		aFloat4860 = class432_42_.aFloat4860;
		aFloat4855 = class432_42_.aFloat4855;
		aFloat4864 = class432_42_.aFloat4864;
	}

	public void method6892(float f, float f_43_, float f_44_) {
		aFloat4862 = f;
		aFloat4856 = 0.0F;
		aFloat4859 = 0.0F;
		aFloat4852 = 0.0F;
		aFloat4854 = 0.0F;
		aFloat4857 = f_43_;
		aFloat4861 = 0.0F;
		aFloat4863 = 0.0F;
		aFloat4858 = 0.0F;
		aFloat4860 = 0.0F;
		aFloat4855 = f_44_;
		aFloat4864 = 0.0F;
	}

	public void method6893(float f, float f_45_, float f_46_) {
		aFloat4862 *= f;
		aFloat4856 *= f;
		aFloat4859 *= f;
		aFloat4852 *= f;
		aFloat4854 *= f_45_;
		aFloat4857 *= f_45_;
		aFloat4861 *= f_45_;
		aFloat4863 *= f_45_;
		aFloat4858 *= f_46_;
		aFloat4860 *= f_46_;
		aFloat4855 *= f_46_;
		aFloat4864 *= f_46_;
	}

	public void method6894(float f, float f_47_, float f_48_) {
		aFloat4861 = 0.0F;
		aFloat4859 = 0.0F;
		aFloat4860 = 0.0F;
		aFloat4856 = 0.0F;
		aFloat4858 = 0.0F;
		aFloat4854 = 0.0F;
		aFloat4855 = 1.0F;
		aFloat4857 = 1.0F;
		aFloat4862 = 1.0F;
		aFloat4852 = f;
		aFloat4863 = f_47_;
		aFloat4864 = f_48_;
	}

	public float[] method6895(float[] fs) {
		fs[0] = aFloat4862;
		fs[1] = aFloat4854;
		fs[2] = aFloat4858;
		fs[3] = aFloat4856;
		fs[4] = aFloat4857;
		fs[5] = aFloat4860;
		fs[6] = aFloat4859;
		fs[7] = aFloat4861;
		fs[8] = aFloat4855;
		return fs;
	}

	public void method6896(float f, float f_49_, float f_50_) {
		aFloat4852 += f;
		aFloat4863 += f_49_;
		aFloat4864 += f_50_;
	}

	public void method6897(Class432 class432_51_, Class432 class432_52_) {
		aFloat4862 = (class432_51_.aFloat4862 * class432_52_.aFloat4862 + class432_51_.aFloat4854 * class432_52_.aFloat4856 + class432_51_.aFloat4858 * class432_52_.aFloat4859);
		aFloat4854 = (class432_51_.aFloat4862 * class432_52_.aFloat4854 + class432_51_.aFloat4854 * class432_52_.aFloat4857 + class432_51_.aFloat4858 * class432_52_.aFloat4861);
		aFloat4858 = (class432_51_.aFloat4862 * class432_52_.aFloat4858 + class432_51_.aFloat4854 * class432_52_.aFloat4860 + class432_51_.aFloat4858 * class432_52_.aFloat4855);
		aFloat4856 = (class432_51_.aFloat4856 * class432_52_.aFloat4862 + class432_51_.aFloat4857 * class432_52_.aFloat4856 + class432_51_.aFloat4860 * class432_52_.aFloat4859);
		aFloat4857 = (class432_51_.aFloat4856 * class432_52_.aFloat4854 + class432_51_.aFloat4857 * class432_52_.aFloat4857 + class432_51_.aFloat4860 * class432_52_.aFloat4861);
		aFloat4860 = (class432_51_.aFloat4856 * class432_52_.aFloat4858 + class432_51_.aFloat4857 * class432_52_.aFloat4860 + class432_51_.aFloat4860 * class432_52_.aFloat4855);
		aFloat4859 = (class432_51_.aFloat4859 * class432_52_.aFloat4862 + class432_51_.aFloat4861 * class432_52_.aFloat4856 + class432_51_.aFloat4855 * class432_52_.aFloat4859);
		aFloat4861 = (class432_51_.aFloat4859 * class432_52_.aFloat4854 + class432_51_.aFloat4861 * class432_52_.aFloat4857 + class432_51_.aFloat4855 * class432_52_.aFloat4861);
		aFloat4855 = (class432_51_.aFloat4859 * class432_52_.aFloat4858 + class432_51_.aFloat4861 * class432_52_.aFloat4860 + class432_51_.aFloat4855 * class432_52_.aFloat4855);
		aFloat4852 = (class432_51_.aFloat4852 * class432_52_.aFloat4862 + class432_51_.aFloat4863 * class432_52_.aFloat4856 + class432_51_.aFloat4864 * class432_52_.aFloat4859 + class432_52_.aFloat4852);
		aFloat4863 = (class432_51_.aFloat4852 * class432_52_.aFloat4854 + class432_51_.aFloat4863 * class432_52_.aFloat4857 + class432_51_.aFloat4864 * class432_52_.aFloat4861 + class432_52_.aFloat4863);
		aFloat4864 = (class432_51_.aFloat4852 * class432_52_.aFloat4858 + class432_51_.aFloat4863 * class432_52_.aFloat4860 + class432_51_.aFloat4864 * class432_52_.aFloat4855 + class432_52_.aFloat4864);
	}

	void method6898(float f, float f_53_, float f_54_, float f_55_) {
		float f_56_ = f * f;
		float f_57_ = f * f_53_;
		float f_58_ = f * f_54_;
		float f_59_ = f * f_55_;
		float f_60_ = f_53_ * f_53_;
		float f_61_ = f_53_ * f_54_;
		float f_62_ = f_53_ * f_55_;
		float f_63_ = f_54_ * f_54_;
		float f_64_ = f_54_ * f_55_;
		aFloat4862 = 1.0F - 2.0F * (f_60_ + f_63_);
		aFloat4856 = 2.0F * (f_57_ - f_64_);
		aFloat4859 = 2.0F * (f_58_ + f_62_);
		aFloat4854 = 2.0F * (f_57_ + f_64_);
		aFloat4857 = 1.0F - 2.0F * (f_56_ + f_63_);
		aFloat4861 = 2.0F * (f_61_ - f_59_);
		aFloat4858 = 2.0F * (f_58_ - f_62_);
		aFloat4860 = 2.0F * (f_61_ + f_59_);
		aFloat4855 = 1.0F - 2.0F * (f_56_ + f_60_);
		aFloat4864 = 0.0F;
		aFloat4863 = 0.0F;
		aFloat4852 = 0.0F;
	}

	public void method6899(Class432 class432_65_) {
		aFloat4862 = class432_65_.aFloat4862;
		aFloat4856 = class432_65_.aFloat4856;
		aFloat4859 = class432_65_.aFloat4859;
		aFloat4852 = class432_65_.aFloat4852;
		aFloat4854 = class432_65_.aFloat4854;
		aFloat4857 = class432_65_.aFloat4857;
		aFloat4861 = class432_65_.aFloat4861;
		aFloat4863 = class432_65_.aFloat4863;
		aFloat4858 = class432_65_.aFloat4858;
		aFloat4860 = class432_65_.aFloat4860;
		aFloat4855 = class432_65_.aFloat4855;
		aFloat4864 = class432_65_.aFloat4864;
	}

	public void method6900(float f, float f_66_, float f_67_, float[] fs) {
		f -= aFloat4852;
		f_66_ -= aFloat4863;
		f_67_ -= aFloat4864;
		fs[0] = (float) (int) (aFloat4862 * f + aFloat4854 * f_66_ + aFloat4858 * f_67_);
		fs[1] = (float) (int) (aFloat4856 * f + aFloat4857 * f_66_ + aFloat4860 * f_67_);
		fs[2] = (float) (int) (aFloat4859 * f + aFloat4861 * f_66_ + aFloat4855 * f_67_);
	}

	public void method6901(float f, float f_68_, float f_69_, float f_70_) {
		float f_71_ = (float) Math.cos((double) f_70_);
		float f_72_ = (float) Math.sin((double) f_70_);
		float f_73_ = f_71_ + f * f * (1.0F - f_71_);
		float f_74_ = f_69_ * f_72_ + f_68_ * f * (1.0F - f_71_);
		float f_75_ = -f_68_ * f_72_ + f_69_ * f * (1.0F - f_71_);
		float f_76_ = -f_69_ * f_72_ + f * f_68_ * (1.0F - f_71_);
		float f_77_ = f_71_ + f_68_ * f_68_ * (1.0F - f_71_);
		float f_78_ = f * f_72_ + f_69_ * f_68_ * (1.0F - f_71_);
		float f_79_ = f_68_ * f_72_ + f * f_69_ * (1.0F - f_71_);
		float f_80_ = -f * f_72_ + f_68_ * f_69_ * (1.0F - f_71_);
		float f_81_ = f_71_ + f_69_ * f_69_ * (1.0F - f_71_);
		float f_82_ = aFloat4862;
		float f_83_ = aFloat4854;
		float f_84_ = aFloat4856;
		float f_85_ = aFloat4857;
		float f_86_ = aFloat4859;
		float f_87_ = aFloat4861;
		float f_88_ = aFloat4852;
		float f_89_ = aFloat4863;
		aFloat4862 = f_82_ * f_73_ + f_83_ * f_76_ + aFloat4858 * f_79_;
		aFloat4854 = f_82_ * f_74_ + f_83_ * f_77_ + aFloat4858 * f_80_;
		aFloat4858 = f_82_ * f_75_ + f_83_ * f_78_ + aFloat4858 * f_81_;
		aFloat4856 = f_84_ * f_73_ + f_85_ * f_76_ + aFloat4860 * f_79_;
		aFloat4857 = f_84_ * f_74_ + f_85_ * f_77_ + aFloat4860 * f_80_;
		aFloat4860 = f_84_ * f_75_ + f_85_ * f_78_ + aFloat4860 * f_81_;
		aFloat4859 = f_86_ * f_73_ + f_87_ * f_76_ + aFloat4855 * f_79_;
		aFloat4861 = f_86_ * f_74_ + f_87_ * f_77_ + aFloat4855 * f_80_;
		aFloat4855 = f_86_ * f_75_ + f_87_ * f_78_ + aFloat4855 * f_81_;
		aFloat4852 = f_88_ * f_73_ + f_89_ * f_76_ + aFloat4864 * f_79_;
		aFloat4863 = f_88_ * f_74_ + f_89_ * f_77_ + aFloat4864 * f_80_;
		aFloat4864 = f_88_ * f_75_ + f_89_ * f_78_ + aFloat4864 * f_81_;
	}

	public void method6902(Class445 class445) {
		float f = (class445.aClass438_4926.aFloat4889 * class445.aClass438_4926.aFloat4889);
		float f_90_ = (class445.aClass438_4926.aFloat4889 * class445.aClass438_4926.aFloat4883);
		float f_91_ = (class445.aClass438_4926.aFloat4889 * class445.aClass438_4926.aFloat4886);
		float f_92_ = (class445.aClass438_4926.aFloat4889 * class445.aClass438_4926.aFloat4887);
		float f_93_ = (class445.aClass438_4926.aFloat4883 * class445.aClass438_4926.aFloat4883);
		float f_94_ = (class445.aClass438_4926.aFloat4883 * class445.aClass438_4926.aFloat4886);
		float f_95_ = (class445.aClass438_4926.aFloat4883 * class445.aClass438_4926.aFloat4887);
		float f_96_ = (class445.aClass438_4926.aFloat4886 * class445.aClass438_4926.aFloat4886);
		float f_97_ = (class445.aClass438_4926.aFloat4886 * class445.aClass438_4926.aFloat4887);
		float f_98_ = (class445.aClass438_4926.aFloat4887 * class445.aClass438_4926.aFloat4887);
		aFloat4862 = f_93_ + f - f_98_ - f_96_;
		aFloat4854 = f_94_ + f_92_ + f_94_ + f_92_;
		aFloat4858 = f_95_ - f_91_ - f_91_ + f_95_;
		aFloat4856 = f_94_ - f_92_ - f_92_ + f_94_;
		aFloat4857 = f_96_ + f - f_93_ - f_98_;
		aFloat4860 = f_97_ + f_90_ + f_97_ + f_90_;
		aFloat4859 = f_95_ + f_91_ + f_95_ + f_91_;
		aFloat4861 = f_97_ - f_90_ - f_90_ + f_97_;
		aFloat4855 = f_98_ + f - f_96_ - f_93_;
		aFloat4852 = class445.aClass442_4927.aFloat4918;
		aFloat4863 = class445.aClass442_4927.aFloat4915;
		aFloat4864 = class445.aClass442_4927.aFloat4919;
	}

	public float[] method6903(float[] fs) {
		fs[0] = aFloat4852;
		fs[1] = aFloat4863;
		fs[2] = aFloat4864;
		return fs;
	}

	public float[] method6904(float[] fs) {
		fs[0] = aFloat4862;
		fs[1] = aFloat4854;
		fs[2] = aFloat4858;
		fs[3] = aFloat4856;
		fs[4] = aFloat4857;
		fs[5] = aFloat4860;
		fs[6] = aFloat4859;
		fs[7] = aFloat4861;
		fs[8] = aFloat4855;
		return fs;
	}

	public String toString() {
		return new StringBuilder().append(aFloat4862).append(",").append(aFloat4856).append(",").append(aFloat4859).append(",").append(aFloat4852).append(" - ").append(aFloat4854).append(",").append(aFloat4857).append(",").append(aFloat4861).append(",").append(aFloat4863).append(" - ").append(aFloat4858).append(",").append(aFloat4860).append(",").append(aFloat4855).append(",").append(aFloat4864).toString();
	}

	public String method6905() {
		return new StringBuilder().append(aFloat4862).append(",").append(aFloat4856).append(",").append(aFloat4859).append(",").append(aFloat4852).append(" - ").append(aFloat4854).append(",").append(aFloat4857).append(",").append(aFloat4861).append(",").append(aFloat4863).append(" - ").append(aFloat4858).append(",").append(aFloat4860).append(",").append(aFloat4855).append(",").append(aFloat4864).toString();
	}

	public void method6906(Class432 class432_99_) {
		aFloat4862 = class432_99_.aFloat4862;
		aFloat4856 = class432_99_.aFloat4856;
		aFloat4859 = class432_99_.aFloat4859;
		aFloat4852 = class432_99_.aFloat4852;
		aFloat4854 = class432_99_.aFloat4854;
		aFloat4857 = class432_99_.aFloat4857;
		aFloat4861 = class432_99_.aFloat4861;
		aFloat4863 = class432_99_.aFloat4863;
		aFloat4858 = class432_99_.aFloat4858;
		aFloat4860 = class432_99_.aFloat4860;
		aFloat4855 = class432_99_.aFloat4855;
		aFloat4864 = class432_99_.aFloat4864;
	}

	public void method6907(Class438 class438) {
		method6898(class438.aFloat4883, class438.aFloat4886, class438.aFloat4887, class438.aFloat4889);
	}

	public void method6908(Class442 class442) {
		method6896(class442.aFloat4918, class442.aFloat4915, class442.aFloat4919);
	}

	public void method6909(Class432 class432_100_) {
		aFloat4862 = class432_100_.aFloat4862;
		aFloat4856 = class432_100_.aFloat4856;
		aFloat4859 = class432_100_.aFloat4859;
		aFloat4852 = class432_100_.aFloat4852;
		aFloat4854 = class432_100_.aFloat4854;
		aFloat4857 = class432_100_.aFloat4857;
		aFloat4861 = class432_100_.aFloat4861;
		aFloat4863 = class432_100_.aFloat4863;
		aFloat4858 = class432_100_.aFloat4858;
		aFloat4860 = class432_100_.aFloat4860;
		aFloat4855 = class432_100_.aFloat4855;
		aFloat4864 = class432_100_.aFloat4864;
	}

	public void method6910(Class432 class432_101_) {
		aFloat4862 = class432_101_.aFloat4862;
		aFloat4856 = class432_101_.aFloat4856;
		aFloat4859 = class432_101_.aFloat4859;
		aFloat4852 = class432_101_.aFloat4852;
		aFloat4854 = class432_101_.aFloat4854;
		aFloat4857 = class432_101_.aFloat4857;
		aFloat4861 = class432_101_.aFloat4861;
		aFloat4863 = class432_101_.aFloat4863;
		aFloat4858 = class432_101_.aFloat4858;
		aFloat4860 = class432_101_.aFloat4860;
		aFloat4855 = class432_101_.aFloat4855;
		aFloat4864 = class432_101_.aFloat4864;
	}

	public void method6911(Class432 class432_102_) {
		aFloat4862 = class432_102_.aFloat4862;
		aFloat4856 = class432_102_.aFloat4856;
		aFloat4859 = class432_102_.aFloat4859;
		aFloat4852 = class432_102_.aFloat4852;
		aFloat4854 = class432_102_.aFloat4854;
		aFloat4857 = class432_102_.aFloat4857;
		aFloat4861 = class432_102_.aFloat4861;
		aFloat4863 = class432_102_.aFloat4863;
		aFloat4858 = class432_102_.aFloat4858;
		aFloat4860 = class432_102_.aFloat4860;
		aFloat4855 = class432_102_.aFloat4855;
		aFloat4864 = class432_102_.aFloat4864;
	}

	public float[] method6912(float[] fs) {
		fs[0] = aFloat4852;
		fs[1] = aFloat4863;
		fs[2] = aFloat4864;
		return fs;
	}

	public void method6913(Class445 class445) {
		method6907(class445.aClass438_4926);
		method6908(class445.aClass442_4927);
	}

	public void method6914(Class445 class445) {
		float f = (class445.aClass438_4926.aFloat4889 * class445.aClass438_4926.aFloat4889);
		float f_103_ = (class445.aClass438_4926.aFloat4889 * class445.aClass438_4926.aFloat4883);
		float f_104_ = (class445.aClass438_4926.aFloat4889 * class445.aClass438_4926.aFloat4886);
		float f_105_ = (class445.aClass438_4926.aFloat4889 * class445.aClass438_4926.aFloat4887);
		float f_106_ = (class445.aClass438_4926.aFloat4883 * class445.aClass438_4926.aFloat4883);
		float f_107_ = (class445.aClass438_4926.aFloat4883 * class445.aClass438_4926.aFloat4886);
		float f_108_ = (class445.aClass438_4926.aFloat4883 * class445.aClass438_4926.aFloat4887);
		float f_109_ = (class445.aClass438_4926.aFloat4886 * class445.aClass438_4926.aFloat4886);
		float f_110_ = (class445.aClass438_4926.aFloat4886 * class445.aClass438_4926.aFloat4887);
		float f_111_ = (class445.aClass438_4926.aFloat4887 * class445.aClass438_4926.aFloat4887);
		aFloat4862 = f_106_ + f - f_111_ - f_109_;
		aFloat4854 = f_107_ + f_105_ + f_107_ + f_105_;
		aFloat4858 = f_108_ - f_104_ - f_104_ + f_108_;
		aFloat4856 = f_107_ - f_105_ - f_105_ + f_107_;
		aFloat4857 = f_109_ + f - f_106_ - f_111_;
		aFloat4860 = f_110_ + f_103_ + f_110_ + f_103_;
		aFloat4859 = f_108_ + f_104_ + f_108_ + f_104_;
		aFloat4861 = f_110_ - f_103_ - f_103_ + f_110_;
		aFloat4855 = f_111_ + f - f_109_ - f_106_;
		aFloat4852 = class445.aClass442_4927.aFloat4918;
		aFloat4863 = class445.aClass442_4927.aFloat4915;
		aFloat4864 = class445.aClass442_4927.aFloat4919;
	}

	public void method6915(Class445 class445) {
		float f = (class445.aClass438_4926.aFloat4889 * class445.aClass438_4926.aFloat4889);
		float f_112_ = (class445.aClass438_4926.aFloat4889 * class445.aClass438_4926.aFloat4883);
		float f_113_ = (class445.aClass438_4926.aFloat4889 * class445.aClass438_4926.aFloat4886);
		float f_114_ = (class445.aClass438_4926.aFloat4889 * class445.aClass438_4926.aFloat4887);
		float f_115_ = (class445.aClass438_4926.aFloat4883 * class445.aClass438_4926.aFloat4883);
		float f_116_ = (class445.aClass438_4926.aFloat4883 * class445.aClass438_4926.aFloat4886);
		float f_117_ = (class445.aClass438_4926.aFloat4883 * class445.aClass438_4926.aFloat4887);
		float f_118_ = (class445.aClass438_4926.aFloat4886 * class445.aClass438_4926.aFloat4886);
		float f_119_ = (class445.aClass438_4926.aFloat4886 * class445.aClass438_4926.aFloat4887);
		float f_120_ = (class445.aClass438_4926.aFloat4887 * class445.aClass438_4926.aFloat4887);
		aFloat4862 = f_115_ + f - f_120_ - f_118_;
		aFloat4854 = f_116_ + f_114_ + f_116_ + f_114_;
		aFloat4858 = f_117_ - f_113_ - f_113_ + f_117_;
		aFloat4856 = f_116_ - f_114_ - f_114_ + f_116_;
		aFloat4857 = f_118_ + f - f_115_ - f_120_;
		aFloat4860 = f_119_ + f_112_ + f_119_ + f_112_;
		aFloat4859 = f_117_ + f_113_ + f_117_ + f_113_;
		aFloat4861 = f_119_ - f_112_ - f_112_ + f_119_;
		aFloat4855 = f_120_ + f - f_118_ - f_115_;
		aFloat4852 = class445.aClass442_4927.aFloat4918;
		aFloat4863 = class445.aClass442_4927.aFloat4915;
		aFloat4864 = class445.aClass442_4927.aFloat4919;
	}

	public void method6916(Class445 class445) {
		float f = (class445.aClass438_4926.aFloat4889 * class445.aClass438_4926.aFloat4889);
		float f_121_ = (class445.aClass438_4926.aFloat4889 * class445.aClass438_4926.aFloat4883);
		float f_122_ = (class445.aClass438_4926.aFloat4889 * class445.aClass438_4926.aFloat4886);
		float f_123_ = (class445.aClass438_4926.aFloat4889 * class445.aClass438_4926.aFloat4887);
		float f_124_ = (class445.aClass438_4926.aFloat4883 * class445.aClass438_4926.aFloat4883);
		float f_125_ = (class445.aClass438_4926.aFloat4883 * class445.aClass438_4926.aFloat4886);
		float f_126_ = (class445.aClass438_4926.aFloat4883 * class445.aClass438_4926.aFloat4887);
		float f_127_ = (class445.aClass438_4926.aFloat4886 * class445.aClass438_4926.aFloat4886);
		float f_128_ = (class445.aClass438_4926.aFloat4886 * class445.aClass438_4926.aFloat4887);
		float f_129_ = (class445.aClass438_4926.aFloat4887 * class445.aClass438_4926.aFloat4887);
		aFloat4862 = f_124_ + f - f_129_ - f_127_;
		aFloat4854 = f_125_ + f_123_ + f_125_ + f_123_;
		aFloat4858 = f_126_ - f_122_ - f_122_ + f_126_;
		aFloat4856 = f_125_ - f_123_ - f_123_ + f_125_;
		aFloat4857 = f_127_ + f - f_124_ - f_129_;
		aFloat4860 = f_128_ + f_121_ + f_128_ + f_121_;
		aFloat4859 = f_126_ + f_122_ + f_126_ + f_122_;
		aFloat4861 = f_128_ - f_121_ - f_121_ + f_128_;
		aFloat4855 = f_129_ + f - f_127_ - f_124_;
		aFloat4852 = class445.aClass442_4927.aFloat4918;
		aFloat4863 = class445.aClass442_4927.aFloat4915;
		aFloat4864 = class445.aClass442_4927.aFloat4919;
	}

	public void method6917(Class445 class445) {
		float f = (class445.aClass438_4926.aFloat4889 * class445.aClass438_4926.aFloat4889);
		float f_130_ = (class445.aClass438_4926.aFloat4889 * class445.aClass438_4926.aFloat4883);
		float f_131_ = (class445.aClass438_4926.aFloat4889 * class445.aClass438_4926.aFloat4886);
		float f_132_ = (class445.aClass438_4926.aFloat4889 * class445.aClass438_4926.aFloat4887);
		float f_133_ = (class445.aClass438_4926.aFloat4883 * class445.aClass438_4926.aFloat4883);
		float f_134_ = (class445.aClass438_4926.aFloat4883 * class445.aClass438_4926.aFloat4886);
		float f_135_ = (class445.aClass438_4926.aFloat4883 * class445.aClass438_4926.aFloat4887);
		float f_136_ = (class445.aClass438_4926.aFloat4886 * class445.aClass438_4926.aFloat4886);
		float f_137_ = (class445.aClass438_4926.aFloat4886 * class445.aClass438_4926.aFloat4887);
		float f_138_ = (class445.aClass438_4926.aFloat4887 * class445.aClass438_4926.aFloat4887);
		aFloat4862 = f_133_ + f - f_138_ - f_136_;
		aFloat4854 = f_134_ + f_132_ + f_134_ + f_132_;
		aFloat4858 = f_135_ - f_131_ - f_131_ + f_135_;
		aFloat4856 = f_134_ - f_132_ - f_132_ + f_134_;
		aFloat4857 = f_136_ + f - f_133_ - f_138_;
		aFloat4860 = f_137_ + f_130_ + f_137_ + f_130_;
		aFloat4859 = f_135_ + f_131_ + f_135_ + f_131_;
		aFloat4861 = f_137_ - f_130_ - f_130_ + f_137_;
		aFloat4855 = f_138_ + f - f_136_ - f_133_;
		aFloat4852 = class445.aClass442_4927.aFloat4918;
		aFloat4863 = class445.aClass442_4927.aFloat4915;
		aFloat4864 = class445.aClass442_4927.aFloat4919;
	}

	public void method6918(Class432 class432_139_) {
		if (class432_139_ == this)
			method6887();
		else {
			aFloat4862 = class432_139_.aFloat4862;
			aFloat4856 = class432_139_.aFloat4854;
			aFloat4859 = class432_139_.aFloat4858;
			aFloat4854 = class432_139_.aFloat4856;
			aFloat4857 = class432_139_.aFloat4857;
			aFloat4861 = class432_139_.aFloat4860;
			aFloat4858 = class432_139_.aFloat4859;
			aFloat4860 = class432_139_.aFloat4861;
			aFloat4855 = class432_139_.aFloat4855;
			aFloat4852 = -(class432_139_.aFloat4852 * aFloat4862 + class432_139_.aFloat4863 * aFloat4856 + class432_139_.aFloat4864 * aFloat4859);
			aFloat4863 = -(class432_139_.aFloat4852 * aFloat4854 + class432_139_.aFloat4863 * aFloat4857 + class432_139_.aFloat4864 * aFloat4861);
			aFloat4864 = -(class432_139_.aFloat4852 * aFloat4858 + class432_139_.aFloat4863 * aFloat4860 + class432_139_.aFloat4864 * aFloat4855);
		}
	}

	public void method6919(double d, double d_140_, double d_141_, double d_142_, double d_143_, double d_144_, float f, float f_145_, float f_146_) {
		float f_147_ = (float) (d_142_ - d);
		float f_148_ = (float) (d_143_ - d_140_);
		float f_149_ = (float) (d_144_ - d_141_);
		float f_150_ = f_145_ * f_149_ - f_146_ * f_148_;
		float f_151_ = f_146_ * f_147_ - f * f_149_;
		float f_152_ = f * f_148_ - f_145_ * f_147_;
		float f_153_ = (float) (1.0 / Math.sqrt((double) (f_150_ * f_150_ + f_151_ * f_151_ + f_152_ * f_152_)));
		float f_154_ = (float) (1.0 / Math.sqrt((double) (f_147_ * f_147_ + f_148_ * f_148_ + f_149_ * f_149_)));
		aFloat4862 = f_150_ * f_153_;
		aFloat4856 = f_151_ * f_153_;
		aFloat4859 = f_152_ * f_153_;
		aFloat4858 = f_147_ * f_154_;
		aFloat4860 = f_148_ * f_154_;
		aFloat4855 = f_149_ * f_154_;
		aFloat4854 = aFloat4860 * aFloat4859 - aFloat4855 * aFloat4856;
		aFloat4857 = aFloat4855 * aFloat4862 - aFloat4858 * aFloat4859;
		aFloat4861 = aFloat4858 * aFloat4856 - aFloat4860 * aFloat4862;
		aFloat4852 = -(float) (d * (double) aFloat4862 + d_140_ * (double) aFloat4856 + d_141_ * (double) aFloat4859);
		aFloat4863 = -(float) (d * (double) aFloat4854 + d_140_ * (double) aFloat4857 + d_141_ * (double) aFloat4861);
		aFloat4864 = -(float) (d * (double) aFloat4858 + d_140_ * (double) aFloat4860 + d_141_ * (double) aFloat4855);
	}

	public void method6920(int i, int i_155_, int i_156_, float f, float f_157_, float f_158_) {
		if (i != 0) {
			float f_159_ = Class436.aFloatArray4880[i & 0x3fff];
			float f_160_ = Class436.aFloatArray4879[i & 0x3fff];
			aFloat4855 = 1.0F;
			aFloat4861 = 0.0F;
			aFloat4859 = 0.0F;
			aFloat4860 = 0.0F;
			aFloat4858 = 0.0F;
			aFloat4862 = 2.0F * f_159_ * (float) i_155_;
			aFloat4857 = 2.0F * f_159_ * (float) i_156_;
			aFloat4854 = 2.0F * f_160_ * (float) i_155_;
			aFloat4856 = -2.0F * f_160_ * (float) i_156_;
			aFloat4852 = (float) (2 * i_155_) * (0.5F * f_160_ - 0.5F * f_159_) + f;
			aFloat4863 = (float) (2 * i_156_) * (-0.5F * f_160_ - 0.5F * f_159_) + f_157_;
			aFloat4864 = f_158_;
		} else {
			aFloat4861 = 0.0F;
			aFloat4859 = 0.0F;
			aFloat4860 = 0.0F;
			aFloat4856 = 0.0F;
			aFloat4858 = 0.0F;
			aFloat4854 = 0.0F;
			aFloat4862 = (float) (2 * i_155_);
			aFloat4857 = (float) (2 * i_156_);
			aFloat4855 = 1.0F;
			aFloat4852 = f - (float) i_155_;
			aFloat4863 = f_157_ - (float) i_156_;
			aFloat4864 = f_158_;
		}
	}

	public void method6921(int i, int i_161_, int i_162_, float f, float f_163_, float f_164_) {
		if (i != 0) {
			float f_165_ = Class436.aFloatArray4880[i & 0x3fff];
			float f_166_ = Class436.aFloatArray4879[i & 0x3fff];
			aFloat4855 = 1.0F;
			aFloat4861 = 0.0F;
			aFloat4859 = 0.0F;
			aFloat4860 = 0.0F;
			aFloat4858 = 0.0F;
			aFloat4862 = 2.0F * f_165_ * (float) i_161_;
			aFloat4857 = 2.0F * f_165_ * (float) i_162_;
			aFloat4854 = 2.0F * f_166_ * (float) i_161_;
			aFloat4856 = -2.0F * f_166_ * (float) i_162_;
			aFloat4852 = (float) (2 * i_161_) * (0.5F * f_166_ - 0.5F * f_165_) + f;
			aFloat4863 = (float) (2 * i_162_) * (-0.5F * f_166_ - 0.5F * f_165_) + f_163_;
			aFloat4864 = f_164_;
		} else {
			aFloat4861 = 0.0F;
			aFloat4859 = 0.0F;
			aFloat4860 = 0.0F;
			aFloat4856 = 0.0F;
			aFloat4858 = 0.0F;
			aFloat4854 = 0.0F;
			aFloat4862 = (float) (2 * i_161_);
			aFloat4857 = (float) (2 * i_162_);
			aFloat4855 = 1.0F;
			aFloat4852 = f - (float) i_161_;
			aFloat4863 = f_163_ - (float) i_162_;
			aFloat4864 = f_164_;
		}
	}

	public void method6922(Class432 class432_167_) {
		float f = aFloat4862;
		float f_168_ = aFloat4854;
		float f_169_ = aFloat4856;
		float f_170_ = aFloat4857;
		float f_171_ = aFloat4859;
		float f_172_ = aFloat4861;
		float f_173_ = aFloat4852;
		float f_174_ = aFloat4863;
		float f_175_ = aFloat4858;
		float f_176_ = aFloat4860;
		float f_177_ = aFloat4855;
		float f_178_ = aFloat4864;
		aFloat4862 = (f * class432_167_.aFloat4862 + f_168_ * class432_167_.aFloat4856 + f_175_ * class432_167_.aFloat4859);
		aFloat4854 = (f * class432_167_.aFloat4854 + f_168_ * class432_167_.aFloat4857 + f_175_ * class432_167_.aFloat4861);
		aFloat4858 = (f * class432_167_.aFloat4858 + f_168_ * class432_167_.aFloat4860 + f_175_ * class432_167_.aFloat4855);
		aFloat4856 = (f_169_ * class432_167_.aFloat4862 + f_170_ * class432_167_.aFloat4856 + f_176_ * class432_167_.aFloat4859);
		aFloat4857 = (f_169_ * class432_167_.aFloat4854 + f_170_ * class432_167_.aFloat4857 + f_176_ * class432_167_.aFloat4861);
		aFloat4860 = (f_169_ * class432_167_.aFloat4858 + f_170_ * class432_167_.aFloat4860 + f_176_ * class432_167_.aFloat4855);
		aFloat4859 = (f_171_ * class432_167_.aFloat4862 + f_172_ * class432_167_.aFloat4856 + f_177_ * class432_167_.aFloat4859);
		aFloat4861 = (f_171_ * class432_167_.aFloat4854 + f_172_ * class432_167_.aFloat4857 + f_177_ * class432_167_.aFloat4861);
		aFloat4855 = (f_171_ * class432_167_.aFloat4858 + f_172_ * class432_167_.aFloat4860 + f_177_ * class432_167_.aFloat4855);
		aFloat4852 = (f_173_ * class432_167_.aFloat4862 + f_174_ * class432_167_.aFloat4856 + f_178_ * class432_167_.aFloat4859 + class432_167_.aFloat4852);
		aFloat4863 = (f_173_ * class432_167_.aFloat4854 + f_174_ * class432_167_.aFloat4857 + f_178_ * class432_167_.aFloat4861 + class432_167_.aFloat4863);
		aFloat4864 = (f_173_ * class432_167_.aFloat4858 + f_174_ * class432_167_.aFloat4860 + f_178_ * class432_167_.aFloat4855 + class432_167_.aFloat4864);
	}

	public void method6923(int i, int i_179_, int i_180_, float f, float f_181_, float f_182_) {
		if (i != 0) {
			float f_183_ = Class436.aFloatArray4880[i & 0x3fff];
			float f_184_ = Class436.aFloatArray4879[i & 0x3fff];
			aFloat4855 = 1.0F;
			aFloat4861 = 0.0F;
			aFloat4859 = 0.0F;
			aFloat4860 = 0.0F;
			aFloat4858 = 0.0F;
			aFloat4862 = 2.0F * f_183_ * (float) i_179_;
			aFloat4857 = 2.0F * f_183_ * (float) i_180_;
			aFloat4854 = 2.0F * f_184_ * (float) i_179_;
			aFloat4856 = -2.0F * f_184_ * (float) i_180_;
			aFloat4852 = (float) (2 * i_179_) * (0.5F * f_184_ - 0.5F * f_183_) + f;
			aFloat4863 = (float) (2 * i_180_) * (-0.5F * f_184_ - 0.5F * f_183_) + f_181_;
			aFloat4864 = f_182_;
		} else {
			aFloat4861 = 0.0F;
			aFloat4859 = 0.0F;
			aFloat4860 = 0.0F;
			aFloat4856 = 0.0F;
			aFloat4858 = 0.0F;
			aFloat4854 = 0.0F;
			aFloat4862 = (float) (2 * i_179_);
			aFloat4857 = (float) (2 * i_180_);
			aFloat4855 = 1.0F;
			aFloat4852 = f - (float) i_179_;
			aFloat4863 = f_181_ - (float) i_180_;
			aFloat4864 = f_182_;
		}
	}

	public void method6924(float f, float f_185_, float f_186_, float f_187_, float f_188_, float f_189_, float f_190_, float f_191_, float f_192_) {
		aFloat4862 = f;
		aFloat4856 = f_187_;
		aFloat4859 = f_190_;
		aFloat4852 = 0.0F;
		aFloat4854 = f_185_;
		aFloat4857 = f_188_;
		aFloat4861 = f_191_;
		aFloat4863 = 0.0F;
		aFloat4858 = f_186_;
		aFloat4860 = f_189_;
		aFloat4855 = f_192_;
		aFloat4864 = 0.0F;
	}

	public void method6925(Class445 class445) {
		method6907(class445.aClass438_4926);
		method6908(class445.aClass442_4927);
	}

	public void method6926(Class442 class442) {
		method6896(class442.aFloat4918, class442.aFloat4915, class442.aFloat4919);
	}

	public void method6927() {
		float f = aFloat4852;
		float f_193_ = aFloat4863;
		float f_194_ = aFloat4856;
		aFloat4856 = aFloat4854;
		aFloat4854 = f_194_;
		float f_195_ = aFloat4859;
		aFloat4859 = aFloat4858;
		aFloat4858 = f_195_;
		float f_196_ = aFloat4861;
		aFloat4861 = aFloat4860;
		aFloat4860 = f_196_;
		aFloat4852 = -(f * aFloat4862 + f_193_ * aFloat4856 + aFloat4864 * aFloat4859);
		aFloat4863 = -(f * aFloat4854 + f_193_ * aFloat4857 + aFloat4864 * aFloat4861);
		aFloat4864 = -(f * aFloat4858 + f_193_ * aFloat4860 + aFloat4864 * aFloat4855);
	}

	public void method6928() {
		float f = aFloat4852;
		float f_197_ = aFloat4863;
		float f_198_ = aFloat4856;
		aFloat4856 = aFloat4854;
		aFloat4854 = f_198_;
		float f_199_ = aFloat4859;
		aFloat4859 = aFloat4858;
		aFloat4858 = f_199_;
		float f_200_ = aFloat4861;
		aFloat4861 = aFloat4860;
		aFloat4860 = f_200_;
		aFloat4852 = -(f * aFloat4862 + f_197_ * aFloat4856 + aFloat4864 * aFloat4859);
		aFloat4863 = -(f * aFloat4854 + f_197_ * aFloat4857 + aFloat4864 * aFloat4861);
		aFloat4864 = -(f * aFloat4858 + f_197_ * aFloat4860 + aFloat4864 * aFloat4855);
	}

	public void method6929() {
		float f = aFloat4852;
		float f_201_ = aFloat4863;
		float f_202_ = aFloat4856;
		aFloat4856 = aFloat4854;
		aFloat4854 = f_202_;
		float f_203_ = aFloat4859;
		aFloat4859 = aFloat4858;
		aFloat4858 = f_203_;
		float f_204_ = aFloat4861;
		aFloat4861 = aFloat4860;
		aFloat4860 = f_204_;
		aFloat4852 = -(f * aFloat4862 + f_201_ * aFloat4856 + aFloat4864 * aFloat4859);
		aFloat4863 = -(f * aFloat4854 + f_201_ * aFloat4857 + aFloat4864 * aFloat4861);
		aFloat4864 = -(f * aFloat4858 + f_201_ * aFloat4860 + aFloat4864 * aFloat4855);
	}

	public void method6930(float f, float f_205_, float f_206_, float f_207_) {
		float f_208_ = (float) Math.cos((double) f_207_);
		float f_209_ = (float) Math.sin((double) f_207_);
		aFloat4862 = f_208_ + f * f * (1.0F - f_208_);
		aFloat4854 = f_206_ * f_209_ + f_205_ * f * (1.0F - f_208_);
		aFloat4858 = -f_205_ * f_209_ + f_206_ * f * (1.0F - f_208_);
		aFloat4856 = -f_206_ * f_209_ + f * f_205_ * (1.0F - f_208_);
		aFloat4857 = f_208_ + f_205_ * f_205_ * (1.0F - f_208_);
		aFloat4860 = f * f_209_ + f_206_ * f_205_ * (1.0F - f_208_);
		aFloat4859 = f_205_ * f_209_ + f * f_206_ * (1.0F - f_208_);
		aFloat4861 = -f * f_209_ + f_205_ * f_206_ * (1.0F - f_208_);
		aFloat4855 = f_208_ + f_206_ * f_206_ * (1.0F - f_208_);
		aFloat4864 = 0.0F;
		aFloat4863 = 0.0F;
		aFloat4852 = 0.0F;
	}

	public void method6931(float f, float f_210_, float f_211_, float f_212_) {
		float f_213_ = (float) Math.cos((double) f_212_);
		float f_214_ = (float) Math.sin((double) f_212_);
		aFloat4862 = f_213_ + f * f * (1.0F - f_213_);
		aFloat4854 = f_211_ * f_214_ + f_210_ * f * (1.0F - f_213_);
		aFloat4858 = -f_210_ * f_214_ + f_211_ * f * (1.0F - f_213_);
		aFloat4856 = -f_211_ * f_214_ + f * f_210_ * (1.0F - f_213_);
		aFloat4857 = f_213_ + f_210_ * f_210_ * (1.0F - f_213_);
		aFloat4860 = f * f_214_ + f_211_ * f_210_ * (1.0F - f_213_);
		aFloat4859 = f_210_ * f_214_ + f * f_211_ * (1.0F - f_213_);
		aFloat4861 = -f * f_214_ + f_210_ * f_211_ * (1.0F - f_213_);
		aFloat4855 = f_213_ + f_211_ * f_211_ * (1.0F - f_213_);
		aFloat4864 = 0.0F;
		aFloat4863 = 0.0F;
		aFloat4852 = 0.0F;
	}

	public void method6932(Class438 class438) {
		method6898(class438.aFloat4883, class438.aFloat4886, class438.aFloat4887, class438.aFloat4889);
	}

	public void method6933(float f, float f_215_, float f_216_, float f_217_) {
		float f_218_ = (float) Math.cos((double) f_217_);
		float f_219_ = (float) Math.sin((double) f_217_);
		float f_220_ = f_218_ + f * f * (1.0F - f_218_);
		float f_221_ = f_216_ * f_219_ + f_215_ * f * (1.0F - f_218_);
		float f_222_ = -f_215_ * f_219_ + f_216_ * f * (1.0F - f_218_);
		float f_223_ = -f_216_ * f_219_ + f * f_215_ * (1.0F - f_218_);
		float f_224_ = f_218_ + f_215_ * f_215_ * (1.0F - f_218_);
		float f_225_ = f * f_219_ + f_216_ * f_215_ * (1.0F - f_218_);
		float f_226_ = f_215_ * f_219_ + f * f_216_ * (1.0F - f_218_);
		float f_227_ = -f * f_219_ + f_215_ * f_216_ * (1.0F - f_218_);
		float f_228_ = f_218_ + f_216_ * f_216_ * (1.0F - f_218_);
		float f_229_ = aFloat4862;
		float f_230_ = aFloat4854;
		float f_231_ = aFloat4856;
		float f_232_ = aFloat4857;
		float f_233_ = aFloat4859;
		float f_234_ = aFloat4861;
		float f_235_ = aFloat4852;
		float f_236_ = aFloat4863;
		aFloat4862 = f_229_ * f_220_ + f_230_ * f_223_ + aFloat4858 * f_226_;
		aFloat4854 = f_229_ * f_221_ + f_230_ * f_224_ + aFloat4858 * f_227_;
		aFloat4858 = f_229_ * f_222_ + f_230_ * f_225_ + aFloat4858 * f_228_;
		aFloat4856 = f_231_ * f_220_ + f_232_ * f_223_ + aFloat4860 * f_226_;
		aFloat4857 = f_231_ * f_221_ + f_232_ * f_224_ + aFloat4860 * f_227_;
		aFloat4860 = f_231_ * f_222_ + f_232_ * f_225_ + aFloat4860 * f_228_;
		aFloat4859 = f_233_ * f_220_ + f_234_ * f_223_ + aFloat4855 * f_226_;
		aFloat4861 = f_233_ * f_221_ + f_234_ * f_224_ + aFloat4855 * f_227_;
		aFloat4855 = f_233_ * f_222_ + f_234_ * f_225_ + aFloat4855 * f_228_;
		aFloat4852 = f_235_ * f_220_ + f_236_ * f_223_ + aFloat4864 * f_226_;
		aFloat4863 = f_235_ * f_221_ + f_236_ * f_224_ + aFloat4864 * f_227_;
		aFloat4864 = f_235_ * f_222_ + f_236_ * f_225_ + aFloat4864 * f_228_;
	}

	public void method6934(float f, float f_237_, float f_238_, float f_239_) {
		float f_240_ = (float) Math.cos((double) f_239_);
		float f_241_ = (float) Math.sin((double) f_239_);
		float f_242_ = f_240_ + f * f * (1.0F - f_240_);
		float f_243_ = f_238_ * f_241_ + f_237_ * f * (1.0F - f_240_);
		float f_244_ = -f_237_ * f_241_ + f_238_ * f * (1.0F - f_240_);
		float f_245_ = -f_238_ * f_241_ + f * f_237_ * (1.0F - f_240_);
		float f_246_ = f_240_ + f_237_ * f_237_ * (1.0F - f_240_);
		float f_247_ = f * f_241_ + f_238_ * f_237_ * (1.0F - f_240_);
		float f_248_ = f_237_ * f_241_ + f * f_238_ * (1.0F - f_240_);
		float f_249_ = -f * f_241_ + f_237_ * f_238_ * (1.0F - f_240_);
		float f_250_ = f_240_ + f_238_ * f_238_ * (1.0F - f_240_);
		float f_251_ = aFloat4862;
		float f_252_ = aFloat4854;
		float f_253_ = aFloat4856;
		float f_254_ = aFloat4857;
		float f_255_ = aFloat4859;
		float f_256_ = aFloat4861;
		float f_257_ = aFloat4852;
		float f_258_ = aFloat4863;
		aFloat4862 = f_251_ * f_242_ + f_252_ * f_245_ + aFloat4858 * f_248_;
		aFloat4854 = f_251_ * f_243_ + f_252_ * f_246_ + aFloat4858 * f_249_;
		aFloat4858 = f_251_ * f_244_ + f_252_ * f_247_ + aFloat4858 * f_250_;
		aFloat4856 = f_253_ * f_242_ + f_254_ * f_245_ + aFloat4860 * f_248_;
		aFloat4857 = f_253_ * f_243_ + f_254_ * f_246_ + aFloat4860 * f_249_;
		aFloat4860 = f_253_ * f_244_ + f_254_ * f_247_ + aFloat4860 * f_250_;
		aFloat4859 = f_255_ * f_242_ + f_256_ * f_245_ + aFloat4855 * f_248_;
		aFloat4861 = f_255_ * f_243_ + f_256_ * f_246_ + aFloat4855 * f_249_;
		aFloat4855 = f_255_ * f_244_ + f_256_ * f_247_ + aFloat4855 * f_250_;
		aFloat4852 = f_257_ * f_242_ + f_258_ * f_245_ + aFloat4864 * f_248_;
		aFloat4863 = f_257_ * f_243_ + f_258_ * f_246_ + aFloat4864 * f_249_;
		aFloat4864 = f_257_ * f_244_ + f_258_ * f_247_ + aFloat4864 * f_250_;
	}

	public void method6935(float f, float f_259_, float f_260_, float f_261_) {
		float f_262_ = (float) Math.cos((double) f_261_);
		float f_263_ = (float) Math.sin((double) f_261_);
		float f_264_ = f_262_ + f * f * (1.0F - f_262_);
		float f_265_ = f_260_ * f_263_ + f_259_ * f * (1.0F - f_262_);
		float f_266_ = -f_259_ * f_263_ + f_260_ * f * (1.0F - f_262_);
		float f_267_ = -f_260_ * f_263_ + f * f_259_ * (1.0F - f_262_);
		float f_268_ = f_262_ + f_259_ * f_259_ * (1.0F - f_262_);
		float f_269_ = f * f_263_ + f_260_ * f_259_ * (1.0F - f_262_);
		float f_270_ = f_259_ * f_263_ + f * f_260_ * (1.0F - f_262_);
		float f_271_ = -f * f_263_ + f_259_ * f_260_ * (1.0F - f_262_);
		float f_272_ = f_262_ + f_260_ * f_260_ * (1.0F - f_262_);
		float f_273_ = aFloat4862;
		float f_274_ = aFloat4854;
		float f_275_ = aFloat4856;
		float f_276_ = aFloat4857;
		float f_277_ = aFloat4859;
		float f_278_ = aFloat4861;
		float f_279_ = aFloat4852;
		float f_280_ = aFloat4863;
		aFloat4862 = f_273_ * f_264_ + f_274_ * f_267_ + aFloat4858 * f_270_;
		aFloat4854 = f_273_ * f_265_ + f_274_ * f_268_ + aFloat4858 * f_271_;
		aFloat4858 = f_273_ * f_266_ + f_274_ * f_269_ + aFloat4858 * f_272_;
		aFloat4856 = f_275_ * f_264_ + f_276_ * f_267_ + aFloat4860 * f_270_;
		aFloat4857 = f_275_ * f_265_ + f_276_ * f_268_ + aFloat4860 * f_271_;
		aFloat4860 = f_275_ * f_266_ + f_276_ * f_269_ + aFloat4860 * f_272_;
		aFloat4859 = f_277_ * f_264_ + f_278_ * f_267_ + aFloat4855 * f_270_;
		aFloat4861 = f_277_ * f_265_ + f_278_ * f_268_ + aFloat4855 * f_271_;
		aFloat4855 = f_277_ * f_266_ + f_278_ * f_269_ + aFloat4855 * f_272_;
		aFloat4852 = f_279_ * f_264_ + f_280_ * f_267_ + aFloat4864 * f_270_;
		aFloat4863 = f_279_ * f_265_ + f_280_ * f_268_ + aFloat4864 * f_271_;
		aFloat4864 = f_279_ * f_266_ + f_280_ * f_269_ + aFloat4864 * f_272_;
	}

	public void method6936(float f, float f_281_, float f_282_, float f_283_) {
		float f_284_ = (float) Math.cos((double) f_283_);
		float f_285_ = (float) Math.sin((double) f_283_);
		float f_286_ = f_284_ + f * f * (1.0F - f_284_);
		float f_287_ = f_282_ * f_285_ + f_281_ * f * (1.0F - f_284_);
		float f_288_ = -f_281_ * f_285_ + f_282_ * f * (1.0F - f_284_);
		float f_289_ = -f_282_ * f_285_ + f * f_281_ * (1.0F - f_284_);
		float f_290_ = f_284_ + f_281_ * f_281_ * (1.0F - f_284_);
		float f_291_ = f * f_285_ + f_282_ * f_281_ * (1.0F - f_284_);
		float f_292_ = f_281_ * f_285_ + f * f_282_ * (1.0F - f_284_);
		float f_293_ = -f * f_285_ + f_281_ * f_282_ * (1.0F - f_284_);
		float f_294_ = f_284_ + f_282_ * f_282_ * (1.0F - f_284_);
		float f_295_ = aFloat4862;
		float f_296_ = aFloat4854;
		float f_297_ = aFloat4856;
		float f_298_ = aFloat4857;
		float f_299_ = aFloat4859;
		float f_300_ = aFloat4861;
		float f_301_ = aFloat4852;
		float f_302_ = aFloat4863;
		aFloat4862 = f_295_ * f_286_ + f_296_ * f_289_ + aFloat4858 * f_292_;
		aFloat4854 = f_295_ * f_287_ + f_296_ * f_290_ + aFloat4858 * f_293_;
		aFloat4858 = f_295_ * f_288_ + f_296_ * f_291_ + aFloat4858 * f_294_;
		aFloat4856 = f_297_ * f_286_ + f_298_ * f_289_ + aFloat4860 * f_292_;
		aFloat4857 = f_297_ * f_287_ + f_298_ * f_290_ + aFloat4860 * f_293_;
		aFloat4860 = f_297_ * f_288_ + f_298_ * f_291_ + aFloat4860 * f_294_;
		aFloat4859 = f_299_ * f_286_ + f_300_ * f_289_ + aFloat4855 * f_292_;
		aFloat4861 = f_299_ * f_287_ + f_300_ * f_290_ + aFloat4855 * f_293_;
		aFloat4855 = f_299_ * f_288_ + f_300_ * f_291_ + aFloat4855 * f_294_;
		aFloat4852 = f_301_ * f_286_ + f_302_ * f_289_ + aFloat4864 * f_292_;
		aFloat4863 = f_301_ * f_287_ + f_302_ * f_290_ + aFloat4864 * f_293_;
		aFloat4864 = f_301_ * f_288_ + f_302_ * f_291_ + aFloat4864 * f_294_;
	}

	public void method6937(float f, float f_303_, float f_304_) {
		aFloat4862 = f;
		aFloat4856 = 0.0F;
		aFloat4859 = 0.0F;
		aFloat4852 = 0.0F;
		aFloat4854 = 0.0F;
		aFloat4857 = f_303_;
		aFloat4861 = 0.0F;
		aFloat4863 = 0.0F;
		aFloat4858 = 0.0F;
		aFloat4860 = 0.0F;
		aFloat4855 = f_304_;
		aFloat4864 = 0.0F;
	}

	public float[] method6938(float[] fs) {
		fs[0] = aFloat4852;
		fs[1] = aFloat4863;
		fs[2] = aFloat4864;
		return fs;
	}

	public void method6939(float f, float f_305_, float f_306_, float f_307_, float f_308_, float f_309_, float f_310_, float f_311_, float f_312_) {
		aFloat4862 = f;
		aFloat4856 = f_307_;
		aFloat4859 = f_310_;
		aFloat4852 = 0.0F;
		aFloat4854 = f_305_;
		aFloat4857 = f_308_;
		aFloat4861 = f_311_;
		aFloat4863 = 0.0F;
		aFloat4858 = f_306_;
		aFloat4860 = f_309_;
		aFloat4855 = f_312_;
		aFloat4864 = 0.0F;
	}

	public void method6940(float f, float f_313_, float f_314_) {
		aFloat4862 *= f;
		aFloat4856 *= f;
		aFloat4859 *= f;
		aFloat4852 *= f;
		aFloat4854 *= f_313_;
		aFloat4857 *= f_313_;
		aFloat4861 *= f_313_;
		aFloat4863 *= f_313_;
		aFloat4858 *= f_314_;
		aFloat4860 *= f_314_;
		aFloat4855 *= f_314_;
		aFloat4864 *= f_314_;
	}

	public void method6941(float f, float f_315_, float f_316_) {
		aFloat4862 *= f;
		aFloat4856 *= f;
		aFloat4859 *= f;
		aFloat4852 *= f;
		aFloat4854 *= f_315_;
		aFloat4857 *= f_315_;
		aFloat4861 *= f_315_;
		aFloat4863 *= f_315_;
		aFloat4858 *= f_316_;
		aFloat4860 *= f_316_;
		aFloat4855 *= f_316_;
		aFloat4864 *= f_316_;
	}

	public void method6942(Class432 class432_317_) {
		float f = aFloat4862;
		float f_318_ = aFloat4854;
		float f_319_ = aFloat4856;
		float f_320_ = aFloat4857;
		float f_321_ = aFloat4859;
		float f_322_ = aFloat4861;
		float f_323_ = aFloat4852;
		float f_324_ = aFloat4863;
		float f_325_ = aFloat4858;
		float f_326_ = aFloat4860;
		float f_327_ = aFloat4855;
		float f_328_ = aFloat4864;
		aFloat4862 = (f * class432_317_.aFloat4862 + f_318_ * class432_317_.aFloat4856 + f_325_ * class432_317_.aFloat4859);
		aFloat4854 = (f * class432_317_.aFloat4854 + f_318_ * class432_317_.aFloat4857 + f_325_ * class432_317_.aFloat4861);
		aFloat4858 = (f * class432_317_.aFloat4858 + f_318_ * class432_317_.aFloat4860 + f_325_ * class432_317_.aFloat4855);
		aFloat4856 = (f_319_ * class432_317_.aFloat4862 + f_320_ * class432_317_.aFloat4856 + f_326_ * class432_317_.aFloat4859);
		aFloat4857 = (f_319_ * class432_317_.aFloat4854 + f_320_ * class432_317_.aFloat4857 + f_326_ * class432_317_.aFloat4861);
		aFloat4860 = (f_319_ * class432_317_.aFloat4858 + f_320_ * class432_317_.aFloat4860 + f_326_ * class432_317_.aFloat4855);
		aFloat4859 = (f_321_ * class432_317_.aFloat4862 + f_322_ * class432_317_.aFloat4856 + f_327_ * class432_317_.aFloat4859);
		aFloat4861 = (f_321_ * class432_317_.aFloat4854 + f_322_ * class432_317_.aFloat4857 + f_327_ * class432_317_.aFloat4861);
		aFloat4855 = (f_321_ * class432_317_.aFloat4858 + f_322_ * class432_317_.aFloat4860 + f_327_ * class432_317_.aFloat4855);
		aFloat4852 = (f_323_ * class432_317_.aFloat4862 + f_324_ * class432_317_.aFloat4856 + f_328_ * class432_317_.aFloat4859 + class432_317_.aFloat4852);
		aFloat4863 = (f_323_ * class432_317_.aFloat4854 + f_324_ * class432_317_.aFloat4857 + f_328_ * class432_317_.aFloat4861 + class432_317_.aFloat4863);
		aFloat4864 = (f_323_ * class432_317_.aFloat4858 + f_324_ * class432_317_.aFloat4860 + f_328_ * class432_317_.aFloat4855 + class432_317_.aFloat4864);
	}

	public void method6943(float f, float f_329_, float f_330_) {
		aFloat4861 = 0.0F;
		aFloat4859 = 0.0F;
		aFloat4860 = 0.0F;
		aFloat4856 = 0.0F;
		aFloat4858 = 0.0F;
		aFloat4854 = 0.0F;
		aFloat4855 = 1.0F;
		aFloat4857 = 1.0F;
		aFloat4862 = 1.0F;
		aFloat4852 = f;
		aFloat4863 = f_329_;
		aFloat4864 = f_330_;
	}

	public void method6944(Class432 class432_331_) {
		aFloat4862 = class432_331_.aFloat4862;
		aFloat4856 = class432_331_.aFloat4856;
		aFloat4859 = class432_331_.aFloat4859;
		aFloat4852 = class432_331_.aFloat4852;
		aFloat4854 = class432_331_.aFloat4854;
		aFloat4857 = class432_331_.aFloat4857;
		aFloat4861 = class432_331_.aFloat4861;
		aFloat4863 = class432_331_.aFloat4863;
		aFloat4858 = class432_331_.aFloat4858;
		aFloat4860 = class432_331_.aFloat4860;
		aFloat4855 = class432_331_.aFloat4855;
		aFloat4864 = class432_331_.aFloat4864;
	}

	public void method6945(double d, double d_332_, double d_333_, double d_334_, double d_335_, double d_336_, float f, float f_337_, float f_338_) {
		float f_339_ = (float) (d_334_ - d);
		float f_340_ = (float) (d_335_ - d_332_);
		float f_341_ = (float) (d_336_ - d_333_);
		float f_342_ = f_337_ * f_341_ - f_338_ * f_340_;
		float f_343_ = f_338_ * f_339_ - f * f_341_;
		float f_344_ = f * f_340_ - f_337_ * f_339_;
		float f_345_ = (float) (1.0 / Math.sqrt((double) (f_342_ * f_342_ + f_343_ * f_343_ + f_344_ * f_344_)));
		float f_346_ = (float) (1.0 / Math.sqrt((double) (f_339_ * f_339_ + f_340_ * f_340_ + f_341_ * f_341_)));
		aFloat4862 = f_342_ * f_345_;
		aFloat4856 = f_343_ * f_345_;
		aFloat4859 = f_344_ * f_345_;
		aFloat4858 = f_339_ * f_346_;
		aFloat4860 = f_340_ * f_346_;
		aFloat4855 = f_341_ * f_346_;
		aFloat4854 = aFloat4860 * aFloat4859 - aFloat4855 * aFloat4856;
		aFloat4857 = aFloat4855 * aFloat4862 - aFloat4858 * aFloat4859;
		aFloat4861 = aFloat4858 * aFloat4856 - aFloat4860 * aFloat4862;
		aFloat4852 = -(float) (d * (double) aFloat4862 + d_332_ * (double) aFloat4856 + d_333_ * (double) aFloat4859);
		aFloat4863 = -(float) (d * (double) aFloat4854 + d_332_ * (double) aFloat4857 + d_333_ * (double) aFloat4861);
		aFloat4864 = -(float) (d * (double) aFloat4858 + d_332_ * (double) aFloat4860 + d_333_ * (double) aFloat4855);
	}

	public void method6946(float f, float f_347_, float f_348_) {
		aFloat4852 += f;
		aFloat4863 += f_347_;
		aFloat4864 += f_348_;
	}

	public void method6947(float f, float f_349_, float f_350_) {
		aFloat4852 += f;
		aFloat4863 += f_349_;
		aFloat4864 += f_350_;
	}

	public void method6948(float f, float f_351_, float f_352_) {
		aFloat4862 *= f;
		aFloat4856 *= f;
		aFloat4859 *= f;
		aFloat4852 *= f;
		aFloat4854 *= f_351_;
		aFloat4857 *= f_351_;
		aFloat4861 *= f_351_;
		aFloat4863 *= f_351_;
		aFloat4858 *= f_352_;
		aFloat4860 *= f_352_;
		aFloat4855 *= f_352_;
		aFloat4864 *= f_352_;
	}

	public void method6949(float[] fs) {
		float f = fs[0];
		float f_353_ = fs[1];
		float f_354_ = fs[2];
		fs[0] = aFloat4862 * f + aFloat4854 * f_353_ + aFloat4858 * f_354_;
		fs[1] = aFloat4856 * f + aFloat4857 * f_353_ + aFloat4860 * f_354_;
		fs[2] = aFloat4859 * f + aFloat4861 * f_353_ + aFloat4855 * f_354_;
	}

	public void method6950(Class432 class432_355_) {
		float f = aFloat4862;
		float f_356_ = aFloat4854;
		float f_357_ = aFloat4856;
		float f_358_ = aFloat4857;
		float f_359_ = aFloat4859;
		float f_360_ = aFloat4861;
		float f_361_ = aFloat4852;
		float f_362_ = aFloat4863;
		float f_363_ = aFloat4858;
		float f_364_ = aFloat4860;
		float f_365_ = aFloat4855;
		float f_366_ = aFloat4864;
		aFloat4862 = (f * class432_355_.aFloat4862 + f_356_ * class432_355_.aFloat4856 + f_363_ * class432_355_.aFloat4859);
		aFloat4854 = (f * class432_355_.aFloat4854 + f_356_ * class432_355_.aFloat4857 + f_363_ * class432_355_.aFloat4861);
		aFloat4858 = (f * class432_355_.aFloat4858 + f_356_ * class432_355_.aFloat4860 + f_363_ * class432_355_.aFloat4855);
		aFloat4856 = (f_357_ * class432_355_.aFloat4862 + f_358_ * class432_355_.aFloat4856 + f_364_ * class432_355_.aFloat4859);
		aFloat4857 = (f_357_ * class432_355_.aFloat4854 + f_358_ * class432_355_.aFloat4857 + f_364_ * class432_355_.aFloat4861);
		aFloat4860 = (f_357_ * class432_355_.aFloat4858 + f_358_ * class432_355_.aFloat4860 + f_364_ * class432_355_.aFloat4855);
		aFloat4859 = (f_359_ * class432_355_.aFloat4862 + f_360_ * class432_355_.aFloat4856 + f_365_ * class432_355_.aFloat4859);
		aFloat4861 = (f_359_ * class432_355_.aFloat4854 + f_360_ * class432_355_.aFloat4857 + f_365_ * class432_355_.aFloat4861);
		aFloat4855 = (f_359_ * class432_355_.aFloat4858 + f_360_ * class432_355_.aFloat4860 + f_365_ * class432_355_.aFloat4855);
		aFloat4852 = (f_361_ * class432_355_.aFloat4862 + f_362_ * class432_355_.aFloat4856 + f_366_ * class432_355_.aFloat4859 + class432_355_.aFloat4852);
		aFloat4863 = (f_361_ * class432_355_.aFloat4854 + f_362_ * class432_355_.aFloat4857 + f_366_ * class432_355_.aFloat4861 + class432_355_.aFloat4863);
		aFloat4864 = (f_361_ * class432_355_.aFloat4858 + f_362_ * class432_355_.aFloat4860 + f_366_ * class432_355_.aFloat4855 + class432_355_.aFloat4864);
	}

	public void method6951(Class432 class432_367_, Class432 class432_368_) {
		aFloat4862 = (class432_367_.aFloat4862 * class432_368_.aFloat4862 + class432_367_.aFloat4854 * class432_368_.aFloat4856 + class432_367_.aFloat4858 * class432_368_.aFloat4859);
		aFloat4854 = (class432_367_.aFloat4862 * class432_368_.aFloat4854 + class432_367_.aFloat4854 * class432_368_.aFloat4857 + class432_367_.aFloat4858 * class432_368_.aFloat4861);
		aFloat4858 = (class432_367_.aFloat4862 * class432_368_.aFloat4858 + class432_367_.aFloat4854 * class432_368_.aFloat4860 + class432_367_.aFloat4858 * class432_368_.aFloat4855);
		aFloat4856 = (class432_367_.aFloat4856 * class432_368_.aFloat4862 + class432_367_.aFloat4857 * class432_368_.aFloat4856 + class432_367_.aFloat4860 * class432_368_.aFloat4859);
		aFloat4857 = (class432_367_.aFloat4856 * class432_368_.aFloat4854 + class432_367_.aFloat4857 * class432_368_.aFloat4857 + class432_367_.aFloat4860 * class432_368_.aFloat4861);
		aFloat4860 = (class432_367_.aFloat4856 * class432_368_.aFloat4858 + class432_367_.aFloat4857 * class432_368_.aFloat4860 + class432_367_.aFloat4860 * class432_368_.aFloat4855);
		aFloat4859 = (class432_367_.aFloat4859 * class432_368_.aFloat4862 + class432_367_.aFloat4861 * class432_368_.aFloat4856 + class432_367_.aFloat4855 * class432_368_.aFloat4859);
		aFloat4861 = (class432_367_.aFloat4859 * class432_368_.aFloat4854 + class432_367_.aFloat4861 * class432_368_.aFloat4857 + class432_367_.aFloat4855 * class432_368_.aFloat4861);
		aFloat4855 = (class432_367_.aFloat4859 * class432_368_.aFloat4858 + class432_367_.aFloat4861 * class432_368_.aFloat4860 + class432_367_.aFloat4855 * class432_368_.aFloat4855);
		aFloat4852 = (class432_367_.aFloat4852 * class432_368_.aFloat4862 + class432_367_.aFloat4863 * class432_368_.aFloat4856 + class432_367_.aFloat4864 * class432_368_.aFloat4859 + class432_368_.aFloat4852);
		aFloat4863 = (class432_367_.aFloat4852 * class432_368_.aFloat4854 + class432_367_.aFloat4863 * class432_368_.aFloat4857 + class432_367_.aFloat4864 * class432_368_.aFloat4861 + class432_368_.aFloat4863);
		aFloat4864 = (class432_367_.aFloat4852 * class432_368_.aFloat4858 + class432_367_.aFloat4863 * class432_368_.aFloat4860 + class432_367_.aFloat4864 * class432_368_.aFloat4855 + class432_368_.aFloat4864);
	}

	public void method6952(float f, float f_369_, float f_370_) {
		aFloat4861 = 0.0F;
		aFloat4859 = 0.0F;
		aFloat4860 = 0.0F;
		aFloat4856 = 0.0F;
		aFloat4858 = 0.0F;
		aFloat4854 = 0.0F;
		aFloat4855 = 1.0F;
		aFloat4857 = 1.0F;
		aFloat4862 = 1.0F;
		aFloat4852 = f;
		aFloat4863 = f_369_;
		aFloat4864 = f_370_;
	}

	public void method6953(float[] fs) {
		float f = fs[0] - aFloat4852;
		float f_371_ = fs[1] - aFloat4863;
		float f_372_ = fs[2] - aFloat4864;
		fs[0] = (float) (int) (aFloat4862 * f + aFloat4854 * f_371_ + aFloat4858 * f_372_);
		fs[1] = (float) (int) (aFloat4856 * f + aFloat4857 * f_371_ + aFloat4860 * f_372_);
		fs[2] = (float) (int) (aFloat4859 * f + aFloat4861 * f_371_ + aFloat4855 * f_372_);
	}

	public void method6954(float[] fs) {
		float f = fs[0] - aFloat4852;
		float f_373_ = fs[1] - aFloat4863;
		float f_374_ = fs[2] - aFloat4864;
		fs[0] = (float) (int) (aFloat4862 * f + aFloat4854 * f_373_ + aFloat4858 * f_374_);
		fs[1] = (float) (int) (aFloat4856 * f + aFloat4857 * f_373_ + aFloat4860 * f_374_);
		fs[2] = (float) (int) (aFloat4859 * f + aFloat4861 * f_373_ + aFloat4855 * f_374_);
	}

	public void method6955(float[] fs) {
		float f = fs[0];
		float f_375_ = fs[1];
		float f_376_ = fs[2];
		fs[0] = aFloat4862 * f + aFloat4854 * f_375_ + aFloat4858 * f_376_;
		fs[1] = aFloat4856 * f + aFloat4857 * f_375_ + aFloat4860 * f_376_;
		fs[2] = aFloat4859 * f + aFloat4861 * f_375_ + aFloat4855 * f_376_;
	}

	public Class432() {
		method6886();
	}

	public void method6956(float f, float f_377_, float f_378_, float f_379_, float f_380_, float f_381_, float f_382_, float f_383_, float f_384_) {
		aFloat4862 = f;
		aFloat4856 = f_379_;
		aFloat4859 = f_382_;
		aFloat4852 = 0.0F;
		aFloat4854 = f_377_;
		aFloat4857 = f_380_;
		aFloat4861 = f_383_;
		aFloat4863 = 0.0F;
		aFloat4858 = f_378_;
		aFloat4860 = f_381_;
		aFloat4855 = f_384_;
		aFloat4864 = 0.0F;
	}

	public float[] method6957(float[] fs) {
		fs[0] = aFloat4852;
		fs[1] = aFloat4863;
		fs[2] = aFloat4864;
		return fs;
	}

	public float[] method6958(float[] fs) {
		fs[0] = aFloat4852;
		fs[1] = aFloat4863;
		fs[2] = aFloat4864;
		return fs;
	}

	public float[] method6959(float[] fs) {
		fs[0] = aFloat4862;
		fs[1] = aFloat4854;
		fs[2] = aFloat4858;
		fs[3] = aFloat4856;
		fs[4] = aFloat4857;
		fs[5] = aFloat4860;
		fs[6] = aFloat4859;
		fs[7] = aFloat4861;
		fs[8] = aFloat4855;
		return fs;
	}

	public float[] method6960(float[] fs) {
		fs[0] = aFloat4862;
		fs[1] = aFloat4854;
		fs[2] = aFloat4858;
		fs[3] = aFloat4856;
		fs[4] = aFloat4857;
		fs[5] = aFloat4860;
		fs[6] = aFloat4859;
		fs[7] = aFloat4861;
		fs[8] = aFloat4855;
		return fs;
	}

	public float[] method6961(float[] fs) {
		fs[0] = aFloat4862;
		fs[1] = aFloat4854;
		fs[2] = aFloat4858;
		fs[3] = aFloat4856;
		fs[4] = aFloat4857;
		fs[5] = aFloat4860;
		fs[6] = aFloat4859;
		fs[7] = aFloat4861;
		fs[8] = aFloat4855;
		return fs;
	}

	public void method6962(Class432 class432_385_) {
		if (class432_385_ == this)
			method6887();
		else {
			aFloat4862 = class432_385_.aFloat4862;
			aFloat4856 = class432_385_.aFloat4854;
			aFloat4859 = class432_385_.aFloat4858;
			aFloat4854 = class432_385_.aFloat4856;
			aFloat4857 = class432_385_.aFloat4857;
			aFloat4861 = class432_385_.aFloat4860;
			aFloat4858 = class432_385_.aFloat4859;
			aFloat4860 = class432_385_.aFloat4861;
			aFloat4855 = class432_385_.aFloat4855;
			aFloat4852 = -(class432_385_.aFloat4852 * aFloat4862 + class432_385_.aFloat4863 * aFloat4856 + class432_385_.aFloat4864 * aFloat4859);
			aFloat4863 = -(class432_385_.aFloat4852 * aFloat4854 + class432_385_.aFloat4863 * aFloat4857 + class432_385_.aFloat4864 * aFloat4861);
			aFloat4864 = -(class432_385_.aFloat4852 * aFloat4858 + class432_385_.aFloat4863 * aFloat4860 + class432_385_.aFloat4864 * aFloat4855);
		}
	}
}
