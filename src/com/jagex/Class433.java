/* Class433 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class433 {
	float aFloat4826;
	float aFloat4827;
	float aFloat4828;
	float aFloat4829;
	float aFloat4830;
	float aFloat4831;
	float aFloat4832;
	float aFloat4833;
	float aFloat4834;
	float aFloat4835;
	public static Class433 aClass433_4836 = new Class433();
	float aFloat4837;
	float aFloat4838;

	public void method5190(Class433 class433_0_) {
		aFloat4827 = class433_0_.aFloat4827;
		aFloat4826 = class433_0_.aFloat4826;
		aFloat4834 = class433_0_.aFloat4834;
		aFloat4835 = class433_0_.aFloat4835;
		aFloat4828 = class433_0_.aFloat4828;
		aFloat4831 = class433_0_.aFloat4831;
		aFloat4830 = class433_0_.aFloat4830;
		aFloat4837 = class433_0_.aFloat4837;
		aFloat4833 = class433_0_.aFloat4833;
		aFloat4832 = class433_0_.aFloat4832;
		aFloat4829 = class433_0_.aFloat4829;
		aFloat4838 = class433_0_.aFloat4838;
	}

	public void method5191(Class431 class431) {
		method5198(class431.aClass425_4822);
		method5222(class431.aClass436_4823);
	}

	public void method5192(Class431 class431) {
		float f = (class431.aClass425_4822.aFloat4799 * class431.aClass425_4822.aFloat4799);
		float f_1_ = (class431.aClass425_4822.aFloat4799 * class431.aClass425_4822.aFloat4796);
		float f_2_ = (class431.aClass425_4822.aFloat4799 * class431.aClass425_4822.aFloat4793);
		float f_3_ = (class431.aClass425_4822.aFloat4799 * class431.aClass425_4822.aFloat4798);
		float f_4_ = (class431.aClass425_4822.aFloat4796 * class431.aClass425_4822.aFloat4796);
		float f_5_ = (class431.aClass425_4822.aFloat4796 * class431.aClass425_4822.aFloat4793);
		float f_6_ = (class431.aClass425_4822.aFloat4796 * class431.aClass425_4822.aFloat4798);
		float f_7_ = (class431.aClass425_4822.aFloat4793 * class431.aClass425_4822.aFloat4793);
		float f_8_ = (class431.aClass425_4822.aFloat4793 * class431.aClass425_4822.aFloat4798);
		float f_9_ = (class431.aClass425_4822.aFloat4798 * class431.aClass425_4822.aFloat4798);
		aFloat4827 = f_4_ + f - f_9_ - f_7_;
		aFloat4828 = f_5_ + f_3_ + f_5_ + f_3_;
		aFloat4833 = f_6_ - f_2_ - f_2_ + f_6_;
		aFloat4826 = f_5_ - f_3_ - f_3_ + f_5_;
		aFloat4831 = f_7_ + f - f_4_ - f_9_;
		aFloat4832 = f_8_ + f_1_ + f_8_ + f_1_;
		aFloat4834 = f_6_ + f_2_ + f_6_ + f_2_;
		aFloat4830 = f_8_ - f_1_ - f_1_ + f_8_;
		aFloat4829 = f_9_ + f - f_7_ - f_4_;
		aFloat4835 = class431.aClass436_4823.aFloat4850;
		aFloat4837 = class431.aClass436_4823.aFloat4852;
		aFloat4838 = class431.aClass436_4823.aFloat4853;
	}

	public void method5193() {
		aFloat4838 = 0.0F;
		aFloat4837 = 0.0F;
		aFloat4835 = 0.0F;
		aFloat4830 = 0.0F;
		aFloat4834 = 0.0F;
		aFloat4832 = 0.0F;
		aFloat4826 = 0.0F;
		aFloat4833 = 0.0F;
		aFloat4828 = 0.0F;
		aFloat4829 = 1.0F;
		aFloat4831 = 1.0F;
		aFloat4827 = 1.0F;
	}

	public void method5194(double d, double d_10_, double d_11_, double d_12_, double d_13_, double d_14_, float f, float f_15_, float f_16_) {
		float f_17_ = (float) (d_12_ - d);
		float f_18_ = (float) (d_13_ - d_10_);
		float f_19_ = (float) (d_14_ - d_11_);
		float f_20_ = f_15_ * f_19_ - f_16_ * f_18_;
		float f_21_ = f_16_ * f_17_ - f * f_19_;
		float f_22_ = f * f_18_ - f_15_ * f_17_;
		float f_23_ = (float) (1.0 / Math.sqrt((double) (f_20_ * f_20_ + f_21_ * f_21_ + f_22_ * f_22_)));
		float f_24_ = (float) (1.0 / Math.sqrt((double) (f_17_ * f_17_ + f_18_ * f_18_ + f_19_ * f_19_)));
		aFloat4827 = f_20_ * f_23_;
		aFloat4826 = f_21_ * f_23_;
		aFloat4834 = f_22_ * f_23_;
		aFloat4833 = f_17_ * f_24_;
		aFloat4832 = f_18_ * f_24_;
		aFloat4829 = f_19_ * f_24_;
		aFloat4828 = aFloat4832 * aFloat4834 - aFloat4829 * aFloat4826;
		aFloat4831 = aFloat4829 * aFloat4827 - aFloat4833 * aFloat4834;
		aFloat4830 = aFloat4833 * aFloat4826 - aFloat4832 * aFloat4827;
		aFloat4835 = -(float) (d * (double) aFloat4827 + d_10_ * (double) aFloat4826 + d_11_ * (double) aFloat4834);
		aFloat4837 = -(float) (d * (double) aFloat4828 + d_10_ * (double) aFloat4831 + d_11_ * (double) aFloat4830);
		aFloat4838 = -(float) (d * (double) aFloat4833 + d_10_ * (double) aFloat4832 + d_11_ * (double) aFloat4829);
	}

	public void method5195(int i, int i_25_, int i_26_, float f, float f_27_, float f_28_) {
		if (i != 0) {
			float f_29_ = Class435.aFloatArray4847[i & 0x3fff];
			float f_30_ = Class435.aFloatArray4846[i & 0x3fff];
			aFloat4829 = 1.0F;
			aFloat4830 = 0.0F;
			aFloat4834 = 0.0F;
			aFloat4832 = 0.0F;
			aFloat4833 = 0.0F;
			aFloat4827 = 2.0F * f_29_ * (float) i_25_;
			aFloat4831 = 2.0F * f_29_ * (float) i_26_;
			aFloat4828 = 2.0F * f_30_ * (float) i_25_;
			aFloat4826 = -2.0F * f_30_ * (float) i_26_;
			aFloat4835 = (float) (2 * i_25_) * (0.5F * f_30_ - 0.5F * f_29_) + f;
			aFloat4837 = (float) (2 * i_26_) * (-0.5F * f_30_ - 0.5F * f_29_) + f_27_;
			aFloat4838 = f_28_;
		} else {
			aFloat4830 = 0.0F;
			aFloat4834 = 0.0F;
			aFloat4832 = 0.0F;
			aFloat4826 = 0.0F;
			aFloat4833 = 0.0F;
			aFloat4828 = 0.0F;
			aFloat4827 = (float) (2 * i_25_);
			aFloat4831 = (float) (2 * i_26_);
			aFloat4829 = 1.0F;
			aFloat4835 = f - (float) i_25_;
			aFloat4837 = f_27_ - (float) i_26_;
			aFloat4838 = f_28_;
		}
	}

	public void method5196(Class433 class433_31_) {
		if (class433_31_ == this)
			method5209();
		else {
			aFloat4827 = class433_31_.aFloat4827;
			aFloat4826 = class433_31_.aFloat4828;
			aFloat4834 = class433_31_.aFloat4833;
			aFloat4828 = class433_31_.aFloat4826;
			aFloat4831 = class433_31_.aFloat4831;
			aFloat4830 = class433_31_.aFloat4832;
			aFloat4833 = class433_31_.aFloat4834;
			aFloat4832 = class433_31_.aFloat4830;
			aFloat4829 = class433_31_.aFloat4829;
			aFloat4835 = -(class433_31_.aFloat4835 * aFloat4827 + class433_31_.aFloat4837 * aFloat4826 + class433_31_.aFloat4838 * aFloat4834);
			aFloat4837 = -(class433_31_.aFloat4835 * aFloat4828 + class433_31_.aFloat4837 * aFloat4831 + class433_31_.aFloat4838 * aFloat4830);
			aFloat4838 = -(class433_31_.aFloat4835 * aFloat4833 + class433_31_.aFloat4837 * aFloat4832 + class433_31_.aFloat4838 * aFloat4829);
		}
	}

	public void method5197(float f, float f_32_, float f_33_) {
		aFloat4827 = f;
		aFloat4826 = 0.0F;
		aFloat4834 = 0.0F;
		aFloat4835 = 0.0F;
		aFloat4828 = 0.0F;
		aFloat4831 = f_32_;
		aFloat4830 = 0.0F;
		aFloat4837 = 0.0F;
		aFloat4833 = 0.0F;
		aFloat4832 = 0.0F;
		aFloat4829 = f_33_;
		aFloat4838 = 0.0F;
	}

	public void method5198(Class425 class425) {
		method5199(class425.aFloat4796, class425.aFloat4793, class425.aFloat4798, class425.aFloat4799);
	}

	void method5199(float f, float f_34_, float f_35_, float f_36_) {
		float f_37_ = f * f;
		float f_38_ = f * f_34_;
		float f_39_ = f * f_35_;
		float f_40_ = f * f_36_;
		float f_41_ = f_34_ * f_34_;
		float f_42_ = f_34_ * f_35_;
		float f_43_ = f_34_ * f_36_;
		float f_44_ = f_35_ * f_35_;
		float f_45_ = f_35_ * f_36_;
		aFloat4827 = 1.0F - 2.0F * (f_41_ + f_44_);
		aFloat4826 = 2.0F * (f_38_ - f_45_);
		aFloat4834 = 2.0F * (f_39_ + f_43_);
		aFloat4828 = 2.0F * (f_38_ + f_45_);
		aFloat4831 = 1.0F - 2.0F * (f_37_ + f_44_);
		aFloat4830 = 2.0F * (f_42_ - f_40_);
		aFloat4833 = 2.0F * (f_39_ - f_43_);
		aFloat4832 = 2.0F * (f_42_ + f_40_);
		aFloat4829 = 1.0F - 2.0F * (f_37_ + f_41_);
		aFloat4838 = 0.0F;
		aFloat4837 = 0.0F;
		aFloat4835 = 0.0F;
	}

	public void method5200(float f, float f_46_, float f_47_) {
		aFloat4835 += f;
		aFloat4837 += f_46_;
		aFloat4838 += f_47_;
	}

	public float[] method5201(float[] fs) {
		fs[0] = aFloat4827;
		fs[1] = aFloat4828;
		fs[2] = aFloat4833;
		fs[3] = aFloat4826;
		fs[4] = aFloat4831;
		fs[5] = aFloat4832;
		fs[6] = aFloat4834;
		fs[7] = aFloat4830;
		fs[8] = aFloat4829;
		return fs;
	}

	public void method5202(float f, float f_48_, float f_49_) {
		aFloat4827 *= f;
		aFloat4826 *= f;
		aFloat4834 *= f;
		aFloat4835 *= f;
		aFloat4828 *= f_48_;
		aFloat4831 *= f_48_;
		aFloat4830 *= f_48_;
		aFloat4837 *= f_48_;
		aFloat4833 *= f_49_;
		aFloat4832 *= f_49_;
		aFloat4829 *= f_49_;
		aFloat4838 *= f_49_;
	}

	public void method5203(float f, float f_50_, float f_51_) {
		aFloat4830 = 0.0F;
		aFloat4834 = 0.0F;
		aFloat4832 = 0.0F;
		aFloat4826 = 0.0F;
		aFloat4833 = 0.0F;
		aFloat4828 = 0.0F;
		aFloat4829 = 1.0F;
		aFloat4831 = 1.0F;
		aFloat4827 = 1.0F;
		aFloat4835 = f;
		aFloat4837 = f_50_;
		aFloat4838 = f_51_;
	}

	public void method5204(Class433 class433_52_) {
		float f = aFloat4827;
		float f_53_ = aFloat4828;
		float f_54_ = aFloat4826;
		float f_55_ = aFloat4831;
		float f_56_ = aFloat4834;
		float f_57_ = aFloat4830;
		float f_58_ = aFloat4835;
		float f_59_ = aFloat4837;
		float f_60_ = aFloat4833;
		float f_61_ = aFloat4832;
		float f_62_ = aFloat4829;
		float f_63_ = aFloat4838;
		aFloat4827 = (f * class433_52_.aFloat4827 + f_53_ * class433_52_.aFloat4826 + f_60_ * class433_52_.aFloat4834);
		aFloat4828 = (f * class433_52_.aFloat4828 + f_53_ * class433_52_.aFloat4831 + f_60_ * class433_52_.aFloat4830);
		aFloat4833 = (f * class433_52_.aFloat4833 + f_53_ * class433_52_.aFloat4832 + f_60_ * class433_52_.aFloat4829);
		aFloat4826 = (f_54_ * class433_52_.aFloat4827 + f_55_ * class433_52_.aFloat4826 + f_61_ * class433_52_.aFloat4834);
		aFloat4831 = (f_54_ * class433_52_.aFloat4828 + f_55_ * class433_52_.aFloat4831 + f_61_ * class433_52_.aFloat4830);
		aFloat4832 = (f_54_ * class433_52_.aFloat4833 + f_55_ * class433_52_.aFloat4832 + f_61_ * class433_52_.aFloat4829);
		aFloat4834 = (f_56_ * class433_52_.aFloat4827 + f_57_ * class433_52_.aFloat4826 + f_62_ * class433_52_.aFloat4834);
		aFloat4830 = (f_56_ * class433_52_.aFloat4828 + f_57_ * class433_52_.aFloat4831 + f_62_ * class433_52_.aFloat4830);
		aFloat4829 = (f_56_ * class433_52_.aFloat4833 + f_57_ * class433_52_.aFloat4832 + f_62_ * class433_52_.aFloat4829);
		aFloat4835 = (f_58_ * class433_52_.aFloat4827 + f_59_ * class433_52_.aFloat4826 + f_63_ * class433_52_.aFloat4834 + class433_52_.aFloat4835);
		aFloat4837 = (f_58_ * class433_52_.aFloat4828 + f_59_ * class433_52_.aFloat4831 + f_63_ * class433_52_.aFloat4830 + class433_52_.aFloat4837);
		aFloat4838 = (f_58_ * class433_52_.aFloat4833 + f_59_ * class433_52_.aFloat4832 + f_63_ * class433_52_.aFloat4829 + class433_52_.aFloat4838);
	}

	public void method5205(Class431 class431) {
		method5198(class431.aClass425_4822);
		method5222(class431.aClass436_4823);
	}

	public void method5206(float f, float f_64_, float f_65_, float f_66_) {
		float f_67_ = (float) Math.cos((double) f_66_);
		float f_68_ = (float) Math.sin((double) f_66_);
		aFloat4827 = f_67_ + f * f * (1.0F - f_67_);
		aFloat4828 = f_65_ * f_68_ + f_64_ * f * (1.0F - f_67_);
		aFloat4833 = -f_64_ * f_68_ + f_65_ * f * (1.0F - f_67_);
		aFloat4826 = -f_65_ * f_68_ + f * f_64_ * (1.0F - f_67_);
		aFloat4831 = f_67_ + f_64_ * f_64_ * (1.0F - f_67_);
		aFloat4832 = f * f_68_ + f_65_ * f_64_ * (1.0F - f_67_);
		aFloat4834 = f_64_ * f_68_ + f * f_65_ * (1.0F - f_67_);
		aFloat4830 = -f * f_68_ + f_64_ * f_65_ * (1.0F - f_67_);
		aFloat4829 = f_67_ + f_65_ * f_65_ * (1.0F - f_67_);
		aFloat4838 = 0.0F;
		aFloat4837 = 0.0F;
		aFloat4835 = 0.0F;
	}

	public void method5207(float f, float f_69_, float f_70_, float[] fs) {
		f -= aFloat4835;
		f_69_ -= aFloat4837;
		f_70_ -= aFloat4838;
		fs[0] = (float) (int) (aFloat4827 * f + aFloat4828 * f_69_ + aFloat4833 * f_70_);
		fs[1] = (float) (int) (aFloat4826 * f + aFloat4831 * f_69_ + aFloat4832 * f_70_);
		fs[2] = (float) (int) (aFloat4834 * f + aFloat4830 * f_69_ + aFloat4829 * f_70_);
	}

	public void method5208(float[] fs) {
		float f = fs[0] - aFloat4835;
		float f_71_ = fs[1] - aFloat4837;
		float f_72_ = fs[2] - aFloat4838;
		fs[0] = (float) (int) (aFloat4827 * f + aFloat4828 * f_71_ + aFloat4833 * f_72_);
		fs[1] = (float) (int) (aFloat4826 * f + aFloat4831 * f_71_ + aFloat4832 * f_72_);
		fs[2] = (float) (int) (aFloat4834 * f + aFloat4830 * f_71_ + aFloat4829 * f_72_);
	}

	public void method5209() {
		float f = aFloat4835;
		float f_73_ = aFloat4837;
		float f_74_ = aFloat4826;
		aFloat4826 = aFloat4828;
		aFloat4828 = f_74_;
		float f_75_ = aFloat4834;
		aFloat4834 = aFloat4833;
		aFloat4833 = f_75_;
		float f_76_ = aFloat4830;
		aFloat4830 = aFloat4832;
		aFloat4832 = f_76_;
		aFloat4835 = -(f * aFloat4827 + f_73_ * aFloat4826 + aFloat4838 * aFloat4834);
		aFloat4837 = -(f * aFloat4828 + f_73_ * aFloat4831 + aFloat4838 * aFloat4830);
		aFloat4838 = -(f * aFloat4833 + f_73_ * aFloat4832 + aFloat4838 * aFloat4829);
	}

	public Class433() {
		method5193();
	}

	public String toString() {
		return new StringBuilder().append(aFloat4827).append(",").append(aFloat4826).append(",").append(aFloat4834).append(",").append(aFloat4835).append(" - ").append(aFloat4828).append(",").append(aFloat4831).append(",").append(aFloat4830).append(",").append(aFloat4837).append(" - ").append(aFloat4833).append(",").append(aFloat4832).append(",").append(aFloat4829).append(",").append(aFloat4838).toString();
	}

	public String method5210() {
		return new StringBuilder().append(aFloat4827).append(",").append(aFloat4826).append(",").append(aFloat4834).append(",").append(aFloat4835).append(" - ").append(aFloat4828).append(",").append(aFloat4831).append(",").append(aFloat4830).append(",").append(aFloat4837).append(" - ").append(aFloat4833).append(",").append(aFloat4832).append(",").append(aFloat4829).append(",").append(aFloat4838).toString();
	}

	public String method5211() {
		return new StringBuilder().append(aFloat4827).append(",").append(aFloat4826).append(",").append(aFloat4834).append(",").append(aFloat4835).append(" - ").append(aFloat4828).append(",").append(aFloat4831).append(",").append(aFloat4830).append(",").append(aFloat4837).append(" - ").append(aFloat4833).append(",").append(aFloat4832).append(",").append(aFloat4829).append(",").append(aFloat4838).toString();
	}

	public String method5212() {
		return new StringBuilder().append(aFloat4827).append(",").append(aFloat4826).append(",").append(aFloat4834).append(",").append(aFloat4835).append(" - ").append(aFloat4828).append(",").append(aFloat4831).append(",").append(aFloat4830).append(",").append(aFloat4837).append(" - ").append(aFloat4833).append(",").append(aFloat4832).append(",").append(aFloat4829).append(",").append(aFloat4838).toString();
	}

	public void method5213(Class433 class433_77_, Class433 class433_78_) {
		aFloat4827 = (class433_77_.aFloat4827 * class433_78_.aFloat4827 + class433_77_.aFloat4828 * class433_78_.aFloat4826 + class433_77_.aFloat4833 * class433_78_.aFloat4834);
		aFloat4828 = (class433_77_.aFloat4827 * class433_78_.aFloat4828 + class433_77_.aFloat4828 * class433_78_.aFloat4831 + class433_77_.aFloat4833 * class433_78_.aFloat4830);
		aFloat4833 = (class433_77_.aFloat4827 * class433_78_.aFloat4833 + class433_77_.aFloat4828 * class433_78_.aFloat4832 + class433_77_.aFloat4833 * class433_78_.aFloat4829);
		aFloat4826 = (class433_77_.aFloat4826 * class433_78_.aFloat4827 + class433_77_.aFloat4831 * class433_78_.aFloat4826 + class433_77_.aFloat4832 * class433_78_.aFloat4834);
		aFloat4831 = (class433_77_.aFloat4826 * class433_78_.aFloat4828 + class433_77_.aFloat4831 * class433_78_.aFloat4831 + class433_77_.aFloat4832 * class433_78_.aFloat4830);
		aFloat4832 = (class433_77_.aFloat4826 * class433_78_.aFloat4833 + class433_77_.aFloat4831 * class433_78_.aFloat4832 + class433_77_.aFloat4832 * class433_78_.aFloat4829);
		aFloat4834 = (class433_77_.aFloat4834 * class433_78_.aFloat4827 + class433_77_.aFloat4830 * class433_78_.aFloat4826 + class433_77_.aFloat4829 * class433_78_.aFloat4834);
		aFloat4830 = (class433_77_.aFloat4834 * class433_78_.aFloat4828 + class433_77_.aFloat4830 * class433_78_.aFloat4831 + class433_77_.aFloat4829 * class433_78_.aFloat4830);
		aFloat4829 = (class433_77_.aFloat4834 * class433_78_.aFloat4833 + class433_77_.aFloat4830 * class433_78_.aFloat4832 + class433_77_.aFloat4829 * class433_78_.aFloat4829);
		aFloat4835 = (class433_77_.aFloat4835 * class433_78_.aFloat4827 + class433_77_.aFloat4837 * class433_78_.aFloat4826 + class433_77_.aFloat4838 * class433_78_.aFloat4834 + class433_78_.aFloat4835);
		aFloat4837 = (class433_77_.aFloat4835 * class433_78_.aFloat4828 + class433_77_.aFloat4837 * class433_78_.aFloat4831 + class433_77_.aFloat4838 * class433_78_.aFloat4830 + class433_78_.aFloat4837);
		aFloat4838 = (class433_77_.aFloat4835 * class433_78_.aFloat4833 + class433_77_.aFloat4837 * class433_78_.aFloat4832 + class433_77_.aFloat4838 * class433_78_.aFloat4829 + class433_78_.aFloat4838);
	}

	public Class433(Class433 class433_79_) {
		method5190(class433_79_);
	}

	public void method5214(float f, float f_80_, float f_81_, float f_82_) {
		float f_83_ = (float) Math.cos((double) f_82_);
		float f_84_ = (float) Math.sin((double) f_82_);
		float f_85_ = f_83_ + f * f * (1.0F - f_83_);
		float f_86_ = f_81_ * f_84_ + f_80_ * f * (1.0F - f_83_);
		float f_87_ = -f_80_ * f_84_ + f_81_ * f * (1.0F - f_83_);
		float f_88_ = -f_81_ * f_84_ + f * f_80_ * (1.0F - f_83_);
		float f_89_ = f_83_ + f_80_ * f_80_ * (1.0F - f_83_);
		float f_90_ = f * f_84_ + f_81_ * f_80_ * (1.0F - f_83_);
		float f_91_ = f_80_ * f_84_ + f * f_81_ * (1.0F - f_83_);
		float f_92_ = -f * f_84_ + f_80_ * f_81_ * (1.0F - f_83_);
		float f_93_ = f_83_ + f_81_ * f_81_ * (1.0F - f_83_);
		float f_94_ = aFloat4827;
		float f_95_ = aFloat4828;
		float f_96_ = aFloat4826;
		float f_97_ = aFloat4831;
		float f_98_ = aFloat4834;
		float f_99_ = aFloat4830;
		float f_100_ = aFloat4835;
		float f_101_ = aFloat4837;
		aFloat4827 = f_94_ * f_85_ + f_95_ * f_88_ + aFloat4833 * f_91_;
		aFloat4828 = f_94_ * f_86_ + f_95_ * f_89_ + aFloat4833 * f_92_;
		aFloat4833 = f_94_ * f_87_ + f_95_ * f_90_ + aFloat4833 * f_93_;
		aFloat4826 = f_96_ * f_85_ + f_97_ * f_88_ + aFloat4832 * f_91_;
		aFloat4831 = f_96_ * f_86_ + f_97_ * f_89_ + aFloat4832 * f_92_;
		aFloat4832 = f_96_ * f_87_ + f_97_ * f_90_ + aFloat4832 * f_93_;
		aFloat4834 = f_98_ * f_85_ + f_99_ * f_88_ + aFloat4829 * f_91_;
		aFloat4830 = f_98_ * f_86_ + f_99_ * f_89_ + aFloat4829 * f_92_;
		aFloat4829 = f_98_ * f_87_ + f_99_ * f_90_ + aFloat4829 * f_93_;
		aFloat4835 = f_100_ * f_85_ + f_101_ * f_88_ + aFloat4838 * f_91_;
		aFloat4837 = f_100_ * f_86_ + f_101_ * f_89_ + aFloat4838 * f_92_;
		aFloat4838 = f_100_ * f_87_ + f_101_ * f_90_ + aFloat4838 * f_93_;
	}

	public void method5215(float f, float f_102_, float f_103_, float[] fs) {
		fs[0] = (aFloat4827 * f + aFloat4826 * f_102_ + aFloat4834 * f_103_ + aFloat4835);
		fs[1] = (aFloat4828 * f + aFloat4831 * f_102_ + aFloat4830 * f_103_ + aFloat4837);
		fs[2] = (aFloat4833 * f + aFloat4832 * f_102_ + aFloat4829 * f_103_ + aFloat4838);
	}

	public void method5216(int i, int i_104_, int i_105_, float f, float f_106_, float f_107_) {
		if (i != 0) {
			float f_108_ = Class435.aFloatArray4847[i & 0x3fff];
			float f_109_ = Class435.aFloatArray4846[i & 0x3fff];
			aFloat4829 = 1.0F;
			aFloat4830 = 0.0F;
			aFloat4834 = 0.0F;
			aFloat4832 = 0.0F;
			aFloat4833 = 0.0F;
			aFloat4827 = 2.0F * f_108_ * (float) i_104_;
			aFloat4831 = 2.0F * f_108_ * (float) i_105_;
			aFloat4828 = 2.0F * f_109_ * (float) i_104_;
			aFloat4826 = -2.0F * f_109_ * (float) i_105_;
			aFloat4835 = (float) (2 * i_104_) * (0.5F * f_109_ - 0.5F * f_108_) + f;
			aFloat4837 = (float) (2 * i_105_) * (-0.5F * f_109_ - 0.5F * f_108_) + f_106_;
			aFloat4838 = f_107_;
		} else {
			aFloat4830 = 0.0F;
			aFloat4834 = 0.0F;
			aFloat4832 = 0.0F;
			aFloat4826 = 0.0F;
			aFloat4833 = 0.0F;
			aFloat4828 = 0.0F;
			aFloat4827 = (float) (2 * i_104_);
			aFloat4831 = (float) (2 * i_105_);
			aFloat4829 = 1.0F;
			aFloat4835 = f - (float) i_104_;
			aFloat4837 = f_106_ - (float) i_105_;
			aFloat4838 = f_107_;
		}
	}

	public void method5217(float f, float f_110_, float f_111_, float f_112_) {
		float f_113_ = (float) Math.cos((double) f_112_);
		float f_114_ = (float) Math.sin((double) f_112_);
		aFloat4827 = f_113_ + f * f * (1.0F - f_113_);
		aFloat4828 = f_111_ * f_114_ + f_110_ * f * (1.0F - f_113_);
		aFloat4833 = -f_110_ * f_114_ + f_111_ * f * (1.0F - f_113_);
		aFloat4826 = -f_111_ * f_114_ + f * f_110_ * (1.0F - f_113_);
		aFloat4831 = f_113_ + f_110_ * f_110_ * (1.0F - f_113_);
		aFloat4832 = f * f_114_ + f_111_ * f_110_ * (1.0F - f_113_);
		aFloat4834 = f_110_ * f_114_ + f * f_111_ * (1.0F - f_113_);
		aFloat4830 = -f * f_114_ + f_110_ * f_111_ * (1.0F - f_113_);
		aFloat4829 = f_113_ + f_111_ * f_111_ * (1.0F - f_113_);
		aFloat4838 = 0.0F;
		aFloat4837 = 0.0F;
		aFloat4835 = 0.0F;
	}

	public void method5218(Class433 class433_115_) {
		aFloat4827 = class433_115_.aFloat4827;
		aFloat4826 = class433_115_.aFloat4826;
		aFloat4834 = class433_115_.aFloat4834;
		aFloat4835 = class433_115_.aFloat4835;
		aFloat4828 = class433_115_.aFloat4828;
		aFloat4831 = class433_115_.aFloat4831;
		aFloat4830 = class433_115_.aFloat4830;
		aFloat4837 = class433_115_.aFloat4837;
		aFloat4833 = class433_115_.aFloat4833;
		aFloat4832 = class433_115_.aFloat4832;
		aFloat4829 = class433_115_.aFloat4829;
		aFloat4838 = class433_115_.aFloat4838;
	}

	public void method5219() {
		float f = aFloat4835;
		float f_116_ = aFloat4837;
		float f_117_ = aFloat4826;
		aFloat4826 = aFloat4828;
		aFloat4828 = f_117_;
		float f_118_ = aFloat4834;
		aFloat4834 = aFloat4833;
		aFloat4833 = f_118_;
		float f_119_ = aFloat4830;
		aFloat4830 = aFloat4832;
		aFloat4832 = f_119_;
		aFloat4835 = -(f * aFloat4827 + f_116_ * aFloat4826 + aFloat4838 * aFloat4834);
		aFloat4837 = -(f * aFloat4828 + f_116_ * aFloat4831 + aFloat4838 * aFloat4830);
		aFloat4838 = -(f * aFloat4833 + f_116_ * aFloat4832 + aFloat4838 * aFloat4829);
	}

	public void method5220(float f, float f_120_, float f_121_) {
		aFloat4827 *= f;
		aFloat4826 *= f;
		aFloat4834 *= f;
		aFloat4835 *= f;
		aFloat4828 *= f_120_;
		aFloat4831 *= f_120_;
		aFloat4830 *= f_120_;
		aFloat4837 *= f_120_;
		aFloat4833 *= f_121_;
		aFloat4832 *= f_121_;
		aFloat4829 *= f_121_;
		aFloat4838 *= f_121_;
	}

	public void method5221(float f, float f_122_, float f_123_) {
		aFloat4827 *= f;
		aFloat4826 *= f;
		aFloat4834 *= f;
		aFloat4835 *= f;
		aFloat4828 *= f_122_;
		aFloat4831 *= f_122_;
		aFloat4830 *= f_122_;
		aFloat4837 *= f_122_;
		aFloat4833 *= f_123_;
		aFloat4832 *= f_123_;
		aFloat4829 *= f_123_;
		aFloat4838 *= f_123_;
	}

	public void method5222(Class436 class436) {
		method5200(class436.aFloat4850, class436.aFloat4852, class436.aFloat4853);
	}

	public void method5223(Class436 class436) {
		method5200(class436.aFloat4850, class436.aFloat4852, class436.aFloat4853);
	}

	public void method5224(Class436 class436) {
		method5200(class436.aFloat4850, class436.aFloat4852, class436.aFloat4853);
	}

	public void method5225(Class436 class436) {
		method5200(class436.aFloat4850, class436.aFloat4852, class436.aFloat4853);
	}

	public void method5226(float f, float f_124_, float f_125_, float[] fs) {
		f -= aFloat4835;
		f_124_ -= aFloat4837;
		f_125_ -= aFloat4838;
		fs[0] = (float) (int) (aFloat4827 * f + aFloat4828 * f_124_ + aFloat4833 * f_125_);
		fs[1] = (float) (int) (aFloat4826 * f + aFloat4831 * f_124_ + aFloat4832 * f_125_);
		fs[2] = (float) (int) (aFloat4834 * f + aFloat4830 * f_124_ + aFloat4829 * f_125_);
	}

	public void method5227(float[] fs) {
		float f = fs[0] - aFloat4835;
		float f_126_ = fs[1] - aFloat4837;
		float f_127_ = fs[2] - aFloat4838;
		fs[0] = (float) (int) (aFloat4827 * f + aFloat4828 * f_126_ + aFloat4833 * f_127_);
		fs[1] = (float) (int) (aFloat4826 * f + aFloat4831 * f_126_ + aFloat4832 * f_127_);
		fs[2] = (float) (int) (aFloat4834 * f + aFloat4830 * f_126_ + aFloat4829 * f_127_);
	}

	public void method5228(float f, float f_128_, float f_129_, float f_130_, float f_131_, float f_132_, float f_133_, float f_134_, float f_135_) {
		aFloat4827 = f;
		aFloat4826 = f_130_;
		aFloat4834 = f_133_;
		aFloat4835 = 0.0F;
		aFloat4828 = f_128_;
		aFloat4831 = f_131_;
		aFloat4830 = f_134_;
		aFloat4837 = 0.0F;
		aFloat4833 = f_129_;
		aFloat4832 = f_132_;
		aFloat4829 = f_135_;
		aFloat4838 = 0.0F;
	}

	public void method5229(float[] fs) {
		float f = fs[0];
		float f_136_ = fs[1];
		float f_137_ = fs[2];
		fs[0] = aFloat4827 * f + aFloat4828 * f_136_ + aFloat4833 * f_137_;
		fs[1] = aFloat4826 * f + aFloat4831 * f_136_ + aFloat4832 * f_137_;
		fs[2] = aFloat4834 * f + aFloat4830 * f_136_ + aFloat4829 * f_137_;
	}

	public float[] method5230(float[] fs) {
		fs[0] = aFloat4835;
		fs[1] = aFloat4837;
		fs[2] = aFloat4838;
		return fs;
	}

	public void method5231(float f, float f_138_, float f_139_) {
		aFloat4827 *= f;
		aFloat4826 *= f;
		aFloat4834 *= f;
		aFloat4835 *= f;
		aFloat4828 *= f_138_;
		aFloat4831 *= f_138_;
		aFloat4830 *= f_138_;
		aFloat4837 *= f_138_;
		aFloat4833 *= f_139_;
		aFloat4832 *= f_139_;
		aFloat4829 *= f_139_;
		aFloat4838 *= f_139_;
	}
}
