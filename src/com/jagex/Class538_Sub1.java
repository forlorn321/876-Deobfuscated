/* Class538_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Random;

public class Class538_Sub1 extends Class538 {
	int[] anIntArray10817 = new int[512];
	static float[][] aFloatArrayArray10818 = { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	static final float method16830(float f) {
		return f * f * f * (10.0F + (f * 6.0F - 15.0F) * f);
	}

	static final float method16831(float f, float f_0_, float f_1_) {
		return f + (f_0_ - f) * f_1_;
	}

	static final float method16832(float f) {
		return f * f * f * (10.0F + (f * 6.0F - 15.0F) * f);
	}

	public Class538_Sub1(int i) {
		Random random = new Random((long) i);
		for (int i_2_ = 0; i_2_ < 256; i_2_++)
			anIntArray10817[i_2_] = anIntArray10817[i_2_ + 256] = i_2_;
		for (int i_3_ = 0; i_3_ < 256; i_3_++) {
			int i_4_ = random.nextInt() & 0xff;
			int i_5_ = anIntArray10817[i_4_];
			anIntArray10817[i_4_] = anIntArray10817[i_4_ + 256] = anIntArray10817[i_3_];
			anIntArray10817[i_3_] = anIntArray10817[i_3_ + 256] = i_5_;
		}
	}

	static final float method16833(int i, float f, float f_6_, float f_7_) {
		float[] fs = aFloatArrayArray10818[i];
		return fs[0] * f + fs[1] * f_6_ + fs[2] * f_7_;
	}

	void method8989(int i, int i_8_, int i_9_, int i_10_, float f, float f_11_, float f_12_, float f_13_, float[] fs, int i_14_) {
		int i_15_ = (int) ((float) i_8_ * f - 1.0F);
		i_15_ &= 0xff;
		int i_16_ = (int) ((float) i_9_ * f_11_ - 1.0F);
		i_16_ &= 0xff;
		int i_17_ = (int) ((float) i_10_ * f_12_ - 1.0F);
		i_17_ &= 0xff;
		float f_18_ = (float) i * f_12_;
		int i_19_ = (int) f_18_;
		int i_20_ = i_19_ + 1;
		float f_21_ = f_18_ - (float) i_19_;
		float f_22_ = 1.0F - f_21_;
		float f_23_ = method16835(f_21_);
		i_19_ &= i_17_;
		i_20_ &= i_17_;
		int i_24_ = anIntArray10817[i_19_];
		int i_25_ = anIntArray10817[i_20_];
		for (int i_26_ = 0; i_26_ < i_9_; i_26_++) {
			float f_27_ = (float) i_26_ * f_11_;
			int i_28_ = (int) f_27_;
			int i_29_ = i_28_ + 1;
			float f_30_ = f_27_ - (float) i_28_;
			float f_31_ = 1.0F - f_30_;
			float f_32_ = method16835(f_30_);
			i_28_ &= i_16_;
			i_29_ &= i_16_;
			int i_33_ = anIntArray10817[i_28_ + i_24_];
			int i_34_ = anIntArray10817[i_29_ + i_24_];
			int i_35_ = anIntArray10817[i_28_ + i_25_];
			int i_36_ = anIntArray10817[i_29_ + i_25_];
			for (int i_37_ = 0; i_37_ < i_8_; i_37_++) {
				float f_38_ = (float) i_37_ * f;
				int i_39_ = (int) f_38_;
				int i_40_ = i_39_ + 1;
				float f_41_ = f_38_ - (float) i_39_;
				float f_42_ = 1.0F - f_41_;
				float f_43_ = method16835(f_41_);
				i_39_ &= i_15_;
				i_40_ &= i_15_;
				fs[i_14_++] = (f_13_ * (method16831((method16831(method16831(method16833((anIntArray10817[i_39_ + i_33_]) & 0x7, f_42_, f_31_, f_22_), method16833((anIntArray10817[i_40_ + i_33_]) & 0x7, f_41_, f_31_, f_22_), f_43_), method16831(method16833((anIntArray10817[i_39_ + i_34_]) & 0x7, f_42_, f_30_, f_22_), method16833((anIntArray10817[i_40_ + i_34_]) & 0x7, f_41_, f_30_, f_22_), f_43_), f_32_)),
						(method16831(method16831(method16833((anIntArray10817[i_39_ + i_35_]) & 0x7, f_42_, f_31_, f_21_), method16833((anIntArray10817[i_40_ + i_35_]) & 0x7, f_41_, f_31_, f_21_), f_43_), method16831(method16833((anIntArray10817[i_39_ + i_36_]) & 0x7, f_42_, f_30_, f_21_), method16833((anIntArray10817[i_40_ + i_36_]) & 0x7, f_41_, f_30_, f_21_), f_43_), f_32_)), f_23_)));
			}
		}
	}

	static final float method16834(float f) {
		return f * f * f * (10.0F + (f * 6.0F - 15.0F) * f);
	}

	static final float method16835(float f) {
		return f * f * f * (10.0F + (f * 6.0F - 15.0F) * f);
	}

	static final float method16836(float f, float f_44_, float f_45_) {
		return f + (f_44_ - f) * f_45_;
	}

	static final float method16837(float f, float f_46_, float f_47_) {
		return f + (f_46_ - f) * f_47_;
	}

	static final float method16838(float f, float f_48_, float f_49_) {
		return f + (f_48_ - f) * f_49_;
	}

	static final float method16839(int i, float f, float f_50_, float f_51_) {
		float[] fs = aFloatArrayArray10818[i];
		return fs[0] * f + fs[1] * f_50_ + fs[2] * f_51_;
	}

	void method8990(int i, int i_52_, int i_53_, int i_54_, float f, float f_55_, float f_56_, float f_57_, float[] fs, int i_58_) {
		int i_59_ = (int) ((float) i_52_ * f - 1.0F);
		i_59_ &= 0xff;
		int i_60_ = (int) ((float) i_53_ * f_55_ - 1.0F);
		i_60_ &= 0xff;
		int i_61_ = (int) ((float) i_54_ * f_56_ - 1.0F);
		i_61_ &= 0xff;
		float f_62_ = (float) i * f_56_;
		int i_63_ = (int) f_62_;
		int i_64_ = i_63_ + 1;
		float f_65_ = f_62_ - (float) i_63_;
		float f_66_ = 1.0F - f_65_;
		float f_67_ = method16835(f_65_);
		i_63_ &= i_61_;
		i_64_ &= i_61_;
		int i_68_ = anIntArray10817[i_63_];
		int i_69_ = anIntArray10817[i_64_];
		for (int i_70_ = 0; i_70_ < i_53_; i_70_++) {
			float f_71_ = (float) i_70_ * f_55_;
			int i_72_ = (int) f_71_;
			int i_73_ = i_72_ + 1;
			float f_74_ = f_71_ - (float) i_72_;
			float f_75_ = 1.0F - f_74_;
			float f_76_ = method16835(f_74_);
			i_72_ &= i_60_;
			i_73_ &= i_60_;
			int i_77_ = anIntArray10817[i_72_ + i_68_];
			int i_78_ = anIntArray10817[i_73_ + i_68_];
			int i_79_ = anIntArray10817[i_72_ + i_69_];
			int i_80_ = anIntArray10817[i_73_ + i_69_];
			for (int i_81_ = 0; i_81_ < i_52_; i_81_++) {
				float f_82_ = (float) i_81_ * f;
				int i_83_ = (int) f_82_;
				int i_84_ = i_83_ + 1;
				float f_85_ = f_82_ - (float) i_83_;
				float f_86_ = 1.0F - f_85_;
				float f_87_ = method16835(f_85_);
				i_83_ &= i_59_;
				i_84_ &= i_59_;
				fs[i_58_++] = (f_57_ * (method16831((method16831(method16831(method16833((anIntArray10817[i_83_ + i_77_]) & 0x7, f_86_, f_75_, f_66_), method16833((anIntArray10817[i_84_ + i_77_]) & 0x7, f_85_, f_75_, f_66_), f_87_), method16831(method16833((anIntArray10817[i_83_ + i_78_]) & 0x7, f_86_, f_74_, f_66_), method16833((anIntArray10817[i_84_ + i_78_]) & 0x7, f_85_, f_74_, f_66_), f_87_), f_76_)),
						(method16831(method16831(method16833((anIntArray10817[i_83_ + i_79_]) & 0x7, f_86_, f_75_, f_65_), method16833((anIntArray10817[i_84_ + i_79_]) & 0x7, f_85_, f_75_, f_65_), f_87_), method16831(method16833((anIntArray10817[i_83_ + i_80_]) & 0x7, f_86_, f_74_, f_65_), method16833((anIntArray10817[i_84_ + i_80_]) & 0x7, f_85_, f_74_, f_65_), f_87_), f_76_)), f_67_)));
			}
		}
	}
}
