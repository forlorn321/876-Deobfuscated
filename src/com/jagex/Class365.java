/* Class365 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class365 {
	Class180_Sub2 aClass180_Sub2_3865;
	Class342 aClass342_3866 = Class342.aClass342_3689;
	Class342 aClass342_3867;
	int anInt3868 = 128;
	float[] aFloatArray3869;
	Interface37 anInterface37_3870;
	Interface38[] anInterface38Array3871;
	int[] anIntArray3872;
	int anInt3873 = 0;
	int anInt3874;
	Class355 aClass355_3875;
	Interface44 anInterface44_3876;
	int[] anIntArray3877;

	void method6333() {
		if (anInt3873 != 0) {
			aClass180_Sub2_3865.method15011();
			aClass180_Sub2_3865.method15238(1);
			aClass180_Sub2_3865.method15001(anInterface44_3876);
			aClass180_Sub2_3865.method14988(0, anInterface37_3870);
			aClass180_Sub2_3865.method15149(aClass355_3875);
			Class316 class316 = aClass180_Sub2_3865.aClass316_9543;
			Unsafe unsafe = aClass180_Sub2_3865.anUnsafe9437;
			ByteBuffer bytebuffer = aClass180_Sub2_3865.aByteBuffer9438;
			bytebuffer.clear();
			aClass180_Sub2_3865.method15274().method6750(Class427.aClass427_4808);
			aClass180_Sub2_3865.method14982(Class377.aClass377_3921);
			int i = (anInt3873 + anInt3874 - 1) / anInt3874;
			int i_0_ = 0;
			int i_1_ = 0;
			for (int i_2_ = 0; i_2_ < i; i_2_++) {
				int i_3_ = Math.min(anInt3874, anInt3873 - i_0_);
				long l = anInterface37_3870.method209(0, i_3_ * 96);
				int i_4_ = i_2_ * anInt3874 + i_3_;
				for (int i_5_ = i_0_; i_5_ < i_4_; i_5_++) {
					for (int i_6_ = 0; i_6_ < 4; i_6_++) {
						unsafe.putFloat(l, aFloatArray3869[i_1_++]);
						l += 4L;
						unsafe.putFloat(l, aFloatArray3869[i_1_++]);
						l += 4L;
						unsafe.putFloat(l, 0.0F);
						l += 4L;
						unsafe.putFloat(l, aFloatArray3869[i_1_++]);
						l += 4L;
						unsafe.putFloat(l, aFloatArray3869[i_1_++]);
						l += 4L;
						unsafe.putInt(l, anIntArray3872[i_5_]);
						l += 4L;
					}
				}
				anInterface37_3870.method211();
				Interface38 interface38 = anInterface38Array3871[i_0_];
				int i_7_ = 1;
				int i_8_ = 0;
				for (int i_9_ = i_0_ + 1; i_9_ < i_4_; i_9_++) {
					if (interface38 == anInterface38Array3871[i_9_])
						i_7_++;
					else {
						class316.anInterface38_3525 = interface38;
						class316.method5676();
						aClass180_Sub2_3865.method15009(anInterface44_3876, (Class364.aClass364_3861), i_8_ * 4, i_7_ * 4, i_8_ * 6, i_7_ * 2);
						interface38 = anInterface38Array3871[i_9_];
						i_7_ = 1;
						i_8_ = i_9_ - i_0_;
					}
				}
				class316.anInterface38_3525 = interface38;
				class316.method5676();
				aClass180_Sub2_3865.method15009(anInterface44_3876, Class364.aClass364_3861, i_8_ * 4, i_7_ * 4, i_8_ * 6, i_7_ * 2);
				i_0_ += anInt3874;
			}
			anInt3873 = 0;
		}
	}

	float method6334(float f) {
		int i = aClass180_Sub2_3865.method3285(1880005347).method2728();
		float f_10_ = ((f + aClass180_Sub2_3865.method14911()) / (float) i * 2.0F - 1.0F);
		return f_10_;
	}

	void method6335() {
		if (anInt3873 != 0) {
			aClass180_Sub2_3865.method15011();
			aClass180_Sub2_3865.method15238(1);
			aClass180_Sub2_3865.method15001(anInterface44_3876);
			aClass180_Sub2_3865.method14988(0, anInterface37_3870);
			aClass180_Sub2_3865.method15149(aClass355_3875);
			Class316 class316 = aClass180_Sub2_3865.aClass316_9543;
			Unsafe unsafe = aClass180_Sub2_3865.anUnsafe9437;
			ByteBuffer bytebuffer = aClass180_Sub2_3865.aByteBuffer9438;
			bytebuffer.clear();
			aClass180_Sub2_3865.method15274().method6750(Class427.aClass427_4808);
			aClass180_Sub2_3865.method14982(Class377.aClass377_3921);
			int i = (anInt3873 + anInt3874 - 1) / anInt3874;
			int i_11_ = 0;
			int i_12_ = 0;
			for (int i_13_ = 0; i_13_ < i; i_13_++) {
				int i_14_ = Math.min(anInt3874, anInt3873 - i_11_);
				long l = anInterface37_3870.method209(0, i_14_ * 96);
				int i_15_ = i_13_ * anInt3874 + i_14_;
				for (int i_16_ = i_11_; i_16_ < i_15_; i_16_++) {
					for (int i_17_ = 0; i_17_ < 4; i_17_++) {
						unsafe.putFloat(l, aFloatArray3869[i_12_++]);
						l += 4L;
						unsafe.putFloat(l, aFloatArray3869[i_12_++]);
						l += 4L;
						unsafe.putFloat(l, 0.0F);
						l += 4L;
						unsafe.putFloat(l, aFloatArray3869[i_12_++]);
						l += 4L;
						unsafe.putFloat(l, aFloatArray3869[i_12_++]);
						l += 4L;
						unsafe.putInt(l, anIntArray3872[i_16_]);
						l += 4L;
					}
				}
				anInterface37_3870.method211();
				Interface38 interface38 = anInterface38Array3871[i_11_];
				int i_18_ = 1;
				int i_19_ = 0;
				for (int i_20_ = i_11_ + 1; i_20_ < i_15_; i_20_++) {
					if (interface38 == anInterface38Array3871[i_20_])
						i_18_++;
					else {
						class316.anInterface38_3525 = interface38;
						class316.method5676();
						aClass180_Sub2_3865.method15009(anInterface44_3876, (Class364.aClass364_3861), i_19_ * 4, i_18_ * 4, i_19_ * 6, i_18_ * 2);
						interface38 = anInterface38Array3871[i_20_];
						i_18_ = 1;
						i_19_ = i_20_ - i_11_;
					}
				}
				class316.anInterface38_3525 = interface38;
				class316.method5676();
				aClass180_Sub2_3865.method15009(anInterface44_3876, Class364.aClass364_3861, i_19_ * 4, i_18_ * 4, i_19_ * 6, i_18_ * 2);
				i_11_ += anInt3874;
			}
			anInt3873 = 0;
		}
	}

	void method6336(float f, float f_21_, float f_22_, float f_23_, float f_24_, float f_25_, float f_26_, float f_27_, Interface38 interface38, int i) {
		if ((i & ~0xffffff) != 0) {
			aClass180_Sub2_3865.method3135(anIntArray3877);
			int i_28_ = anIntArray3877[0];
			int i_29_ = anIntArray3877[1];
			int i_30_ = anIntArray3877[2];
			int i_31_ = anIntArray3877[3];
			if (!(f > (float) i_30_) && !(f_21_ > (float) i_31_) && !(f_22_ < (float) i_28_) && !(f_23_ < (float) i_29_)) {
				float f_32_ = f_22_ - f;
				float f_33_ = f_23_ - f_21_;
				float f_34_ = f_26_ - f_24_;
				float f_35_ = f_27_ - f_25_;
				if (f < (float) i_28_) {
					f_24_ += ((float) i_28_ - f) / f_32_ * f_34_;
					f = (float) i_28_;
				}
				if (f_21_ < (float) i_29_) {
					f_25_ += ((float) i_29_ - f_21_) / f_33_ * f_35_;
					f_21_ = (float) i_29_;
				}
				if (f_22_ > (float) i_30_) {
					f_26_ -= (f_22_ - (float) i_30_) / f_32_ * f_34_;
					f_22_ = (float) i_30_;
				}
				if (f_23_ > (float) i_31_) {
					f_27_ -= (f_23_ - (float) i_31_) / f_33_ * f_35_;
					f_23_ = (float) i_31_;
				}
				method6338();
				f = method6334(f);
				f_21_ = method6340(f_21_);
				f_22_ = method6334(f_22_);
				f_23_ = method6340(f_23_);
				aFloatArray3869[anInt3873 * 16 + 0] = f;
				aFloatArray3869[anInt3873 * 16 + 1] = f_21_;
				aFloatArray3869[anInt3873 * 16 + 2] = f_24_;
				aFloatArray3869[anInt3873 * 16 + 3] = f_25_;
				aFloatArray3869[anInt3873 * 16 + 4] = f_22_;
				aFloatArray3869[anInt3873 * 16 + 5] = f_21_;
				aFloatArray3869[anInt3873 * 16 + 6] = f_26_;
				aFloatArray3869[anInt3873 * 16 + 7] = f_25_;
				aFloatArray3869[anInt3873 * 16 + 8] = f;
				aFloatArray3869[anInt3873 * 16 + 9] = f_23_;
				aFloatArray3869[anInt3873 * 16 + 10] = f_24_;
				aFloatArray3869[anInt3873 * 16 + 11] = f_27_;
				aFloatArray3869[anInt3873 * 16 + 12] = f_22_;
				aFloatArray3869[anInt3873 * 16 + 13] = f_23_;
				aFloatArray3869[anInt3873 * 16 + 14] = f_26_;
				aFloatArray3869[anInt3873 * 16 + 15] = f_27_;
				anInterface38Array3871[anInt3873] = interface38;
				if (aClass180_Sub2_3865.anInt9578 == 1)
					anIntArray3872[anInt3873] = ~0xff00ff & i | (i & 0xff) << 16 | i >> 16 & 0xff;
				else
					anIntArray3872[anInt3873] = i;
				anInt3873++;
				if (aClass342_3866 == Class342.aClass342_3688)
					method6333();
			}
		}
	}

	void method6337(float f, float f_36_, float f_37_, float f_38_, float f_39_, float f_40_, float f_41_, float f_42_, float f_43_, float f_44_, float f_45_, float f_46_, float f_47_, float f_48_, float f_49_, float f_50_, Interface38 interface38, int i) {
		if ((i & ~0xffffff) != 0) {
			aClass180_Sub2_3865.method3135(anIntArray3877);
			int i_51_ = anIntArray3877[0];
			int i_52_ = anIntArray3877[1];
			int i_53_ = anIntArray3877[2];
			int i_54_ = anIntArray3877[3];
			int i_55_ = 0;
			int i_56_ = ((f < (float) i_51_ ? 1 : 0) + (f_37_ < (float) i_51_ ? 1 : 0) + (f_39_ < (float) i_51_ ? 1 : 0) + (f_41_ < (float) i_51_ ? 1 : 0));
			if (i_56_ != 4) {
				i_55_ |= i_56_;
				i_56_ = ((f > (float) i_53_ ? 1 : 0) + (f_37_ > (float) i_53_ ? 1 : 0) + (f_39_ > (float) i_53_ ? 1 : 0) + (f_41_ > (float) i_53_ ? 1 : 0));
				if (i_56_ != 4) {
					i_55_ |= i_56_;
					i_56_ = ((f_36_ < (float) i_52_ ? 1 : 0) + (f_38_ < (float) i_52_ ? 1 : 0) + (f_40_ < (float) i_52_ ? 1 : 0) + (f_42_ < (float) i_52_ ? 1 : 0));
					if (i_56_ != 4) {
						i_55_ |= i_56_;
						i_56_ = ((f_36_ > (float) i_54_ ? 1 : 0) + (f_38_ > (float) i_54_ ? 1 : 0) + (f_40_ > (float) i_54_ ? 1 : 0) + (f_42_ > (float) i_54_ ? 1 : 0));
						if (i_56_ != 4) {
							i_55_ |= i_56_;
							if (i_55_ != 0) {
								method6333();
								aClass180_Sub2_3865.method3124(true);
								aClass180_Sub2_3865.method3132(i_51_, i_52_, i_53_, i_54_);
							}
							method6338();
							f = method6334(f);
							f_36_ = method6340(f_36_);
							f_37_ = method6334(f_37_);
							f_38_ = method6340(f_38_);
							f_39_ = method6334(f_39_);
							f_40_ = method6340(f_40_);
							f_41_ = method6334(f_41_);
							f_42_ = method6340(f_42_);
							aFloatArray3869[anInt3873 * 16 + 0] = f;
							aFloatArray3869[anInt3873 * 16 + 1] = f_36_;
							aFloatArray3869[anInt3873 * 16 + 2] = f_43_;
							aFloatArray3869[anInt3873 * 16 + 3] = f_44_;
							aFloatArray3869[anInt3873 * 16 + 4] = f_37_;
							aFloatArray3869[anInt3873 * 16 + 5] = f_38_;
							aFloatArray3869[anInt3873 * 16 + 6] = f_45_;
							aFloatArray3869[anInt3873 * 16 + 7] = f_46_;
							aFloatArray3869[anInt3873 * 16 + 8] = f_39_;
							aFloatArray3869[anInt3873 * 16 + 9] = f_40_;
							aFloatArray3869[anInt3873 * 16 + 10] = f_47_;
							aFloatArray3869[anInt3873 * 16 + 11] = f_48_;
							aFloatArray3869[anInt3873 * 16 + 12] = f_41_;
							aFloatArray3869[anInt3873 * 16 + 13] = f_42_;
							aFloatArray3869[anInt3873 * 16 + 14] = f_49_;
							aFloatArray3869[anInt3873 * 16 + 15] = f_50_;
							anInterface38Array3871[anInt3873] = interface38;
							if (aClass180_Sub2_3865.anInt9578 == 1)
								anIntArray3872[anInt3873] = (~0xff00ff & i | (i & 0xff) << 16 | i >> 16 & 0xff);
							else
								anIntArray3872[anInt3873] = i;
							anInt3873++;
							if (aClass342_3866 == Class342.aClass342_3688 || i_55_ > 0)
								method6333();
							if (i_55_ != 0) {
								aClass180_Sub2_3865.method3124(false);
								aClass180_Sub2_3865.method3131();
								aClass180_Sub2_3865.method3132(i_51_, i_52_, i_53_, i_54_);
							}
						}
					}
				}
			}
		}
	}

	void method6338() {
		if (anInt3873 == anInt3868) {
			anInt3868 *= 2;
			float[] fs = new float[anInt3868 * 16];
			for (int i = 0; i < anInt3873 * 16; i++)
				fs[i] = aFloatArray3869[i];
			aFloatArray3869 = fs;
			Interface38[] interface38s = new Interface38[anInt3868];
			int[] is = new int[anInt3868];
			for (int i = 0; i < anInt3873; i++) {
				interface38s[i] = anInterface38Array3871[i];
				is[i] = anIntArray3872[i];
			}
			anInterface38Array3871 = interface38s;
			anIntArray3872 = is;
		}
	}

	void method6339(float f, float f_57_, float f_58_, float f_59_, float f_60_, float f_61_, float f_62_, float f_63_, float f_64_, float f_65_, float f_66_, float f_67_, float f_68_, float f_69_, float f_70_, float f_71_, Interface38 interface38, int i) {
		if ((i & ~0xffffff) != 0) {
			aClass180_Sub2_3865.method3135(anIntArray3877);
			int i_72_ = anIntArray3877[0];
			int i_73_ = anIntArray3877[1];
			int i_74_ = anIntArray3877[2];
			int i_75_ = anIntArray3877[3];
			int i_76_ = 0;
			int i_77_ = ((f < (float) i_72_ ? 1 : 0) + (f_58_ < (float) i_72_ ? 1 : 0) + (f_60_ < (float) i_72_ ? 1 : 0) + (f_62_ < (float) i_72_ ? 1 : 0));
			if (i_77_ != 4) {
				i_76_ |= i_77_;
				i_77_ = ((f > (float) i_74_ ? 1 : 0) + (f_58_ > (float) i_74_ ? 1 : 0) + (f_60_ > (float) i_74_ ? 1 : 0) + (f_62_ > (float) i_74_ ? 1 : 0));
				if (i_77_ != 4) {
					i_76_ |= i_77_;
					i_77_ = ((f_57_ < (float) i_73_ ? 1 : 0) + (f_59_ < (float) i_73_ ? 1 : 0) + (f_61_ < (float) i_73_ ? 1 : 0) + (f_63_ < (float) i_73_ ? 1 : 0));
					if (i_77_ != 4) {
						i_76_ |= i_77_;
						i_77_ = ((f_57_ > (float) i_75_ ? 1 : 0) + (f_59_ > (float) i_75_ ? 1 : 0) + (f_61_ > (float) i_75_ ? 1 : 0) + (f_63_ > (float) i_75_ ? 1 : 0));
						if (i_77_ != 4) {
							i_76_ |= i_77_;
							if (i_76_ != 0) {
								method6333();
								aClass180_Sub2_3865.method3124(true);
								aClass180_Sub2_3865.method3132(i_72_, i_73_, i_74_, i_75_);
							}
							method6338();
							f = method6334(f);
							f_57_ = method6340(f_57_);
							f_58_ = method6334(f_58_);
							f_59_ = method6340(f_59_);
							f_60_ = method6334(f_60_);
							f_61_ = method6340(f_61_);
							f_62_ = method6334(f_62_);
							f_63_ = method6340(f_63_);
							aFloatArray3869[anInt3873 * 16 + 0] = f;
							aFloatArray3869[anInt3873 * 16 + 1] = f_57_;
							aFloatArray3869[anInt3873 * 16 + 2] = f_64_;
							aFloatArray3869[anInt3873 * 16 + 3] = f_65_;
							aFloatArray3869[anInt3873 * 16 + 4] = f_58_;
							aFloatArray3869[anInt3873 * 16 + 5] = f_59_;
							aFloatArray3869[anInt3873 * 16 + 6] = f_66_;
							aFloatArray3869[anInt3873 * 16 + 7] = f_67_;
							aFloatArray3869[anInt3873 * 16 + 8] = f_60_;
							aFloatArray3869[anInt3873 * 16 + 9] = f_61_;
							aFloatArray3869[anInt3873 * 16 + 10] = f_68_;
							aFloatArray3869[anInt3873 * 16 + 11] = f_69_;
							aFloatArray3869[anInt3873 * 16 + 12] = f_62_;
							aFloatArray3869[anInt3873 * 16 + 13] = f_63_;
							aFloatArray3869[anInt3873 * 16 + 14] = f_70_;
							aFloatArray3869[anInt3873 * 16 + 15] = f_71_;
							anInterface38Array3871[anInt3873] = interface38;
							if (aClass180_Sub2_3865.anInt9578 == 1)
								anIntArray3872[anInt3873] = (~0xff00ff & i | (i & 0xff) << 16 | i >> 16 & 0xff);
							else
								anIntArray3872[anInt3873] = i;
							anInt3873++;
							if (aClass342_3866 == Class342.aClass342_3688 || i_76_ > 0)
								method6333();
							if (i_76_ != 0) {
								aClass180_Sub2_3865.method3124(false);
								aClass180_Sub2_3865.method3131();
								aClass180_Sub2_3865.method3132(i_72_, i_73_, i_74_, i_75_);
							}
						}
					}
				}
			}
		}
	}

	float method6340(float f) {
		int i = aClass180_Sub2_3865.method3285(1104242012).method2729();
		float f_78_ = (((1.0F - (f + aClass180_Sub2_3865.method14911()) / (float) i) * 2.0F) - 1.0F);
		return f_78_;
	}

	void method6341() {
		aClass342_3867 = aClass342_3866;
		aClass342_3866 = Class342.aClass342_3690;
	}

	void method6342() {
		if (aClass342_3867 != null) {
			aClass342_3866 = aClass342_3867;
			aClass342_3867 = null;
		}
	}

	Class342 method6343() {
		return aClass342_3866;
	}

	void method6344(float f, float f_79_, float f_80_, float f_81_, float f_82_, float f_83_, float f_84_, float f_85_, Interface38 interface38, int i) {
		if ((i & ~0xffffff) != 0) {
			aClass180_Sub2_3865.method3135(anIntArray3877);
			int i_86_ = anIntArray3877[0];
			int i_87_ = anIntArray3877[1];
			int i_88_ = anIntArray3877[2];
			int i_89_ = anIntArray3877[3];
			if (!(f > (float) i_88_) && !(f_79_ > (float) i_89_) && !(f_80_ < (float) i_86_) && !(f_81_ < (float) i_87_)) {
				float f_90_ = f_80_ - f;
				float f_91_ = f_81_ - f_79_;
				float f_92_ = f_84_ - f_82_;
				float f_93_ = f_85_ - f_83_;
				if (f < (float) i_86_) {
					f_82_ += ((float) i_86_ - f) / f_90_ * f_92_;
					f = (float) i_86_;
				}
				if (f_79_ < (float) i_87_) {
					f_83_ += ((float) i_87_ - f_79_) / f_91_ * f_93_;
					f_79_ = (float) i_87_;
				}
				if (f_80_ > (float) i_88_) {
					f_84_ -= (f_80_ - (float) i_88_) / f_90_ * f_92_;
					f_80_ = (float) i_88_;
				}
				if (f_81_ > (float) i_89_) {
					f_85_ -= (f_81_ - (float) i_89_) / f_91_ * f_93_;
					f_81_ = (float) i_89_;
				}
				method6338();
				f = method6334(f);
				f_79_ = method6340(f_79_);
				f_80_ = method6334(f_80_);
				f_81_ = method6340(f_81_);
				aFloatArray3869[anInt3873 * 16 + 0] = f;
				aFloatArray3869[anInt3873 * 16 + 1] = f_79_;
				aFloatArray3869[anInt3873 * 16 + 2] = f_82_;
				aFloatArray3869[anInt3873 * 16 + 3] = f_83_;
				aFloatArray3869[anInt3873 * 16 + 4] = f_80_;
				aFloatArray3869[anInt3873 * 16 + 5] = f_79_;
				aFloatArray3869[anInt3873 * 16 + 6] = f_84_;
				aFloatArray3869[anInt3873 * 16 + 7] = f_83_;
				aFloatArray3869[anInt3873 * 16 + 8] = f;
				aFloatArray3869[anInt3873 * 16 + 9] = f_81_;
				aFloatArray3869[anInt3873 * 16 + 10] = f_82_;
				aFloatArray3869[anInt3873 * 16 + 11] = f_85_;
				aFloatArray3869[anInt3873 * 16 + 12] = f_80_;
				aFloatArray3869[anInt3873 * 16 + 13] = f_81_;
				aFloatArray3869[anInt3873 * 16 + 14] = f_84_;
				aFloatArray3869[anInt3873 * 16 + 15] = f_85_;
				anInterface38Array3871[anInt3873] = interface38;
				if (aClass180_Sub2_3865.anInt9578 == 1)
					anIntArray3872[anInt3873] = ~0xff00ff & i | (i & 0xff) << 16 | i >> 16 & 0xff;
				else
					anIntArray3872[anInt3873] = i;
				anInt3873++;
				if (aClass342_3866 == Class342.aClass342_3688)
					method6333();
			}
		}
	}

	void method6345() {
		anInterface37_3870.method129();
		anInterface44_3876.method129();
		anInterface37_3870 = null;
		anInterface44_3876 = null;
		aClass355_3875 = null;
		anInt3873 = 0;
	}

	void method6346() {
		if (anInt3873 == anInt3868) {
			anInt3868 *= 2;
			float[] fs = new float[anInt3868 * 16];
			for (int i = 0; i < anInt3873 * 16; i++)
				fs[i] = aFloatArray3869[i];
			aFloatArray3869 = fs;
			Interface38[] interface38s = new Interface38[anInt3868];
			int[] is = new int[anInt3868];
			for (int i = 0; i < anInt3873; i++) {
				interface38s[i] = anInterface38Array3871[i];
				is[i] = anIntArray3872[i];
			}
			anInterface38Array3871 = interface38s;
			anIntArray3872 = is;
		}
	}

	Class365(Class180_Sub2 class180_sub2, int i) {
		aFloatArray3869 = new float[anInt3868 * 16];
		anInterface38Array3871 = new Interface38[anInt3868];
		anIntArray3872 = new int[anInt3868];
		anIntArray3877 = new int[4];
		aClass180_Sub2_3865 = class180_sub2;
		anInterface37_3870 = aClass180_Sub2_3865.method15035(true);
		anInterface37_3870.method219(i * 96, 24);
		aClass355_3875 = (aClass180_Sub2_3865.method14999(new Class372[] { new Class372(new Class347[] { Class347.aClass347_3742, Class347.aClass347_3738, Class347.aClass347_3734 }) }));
		anInterface44_3876 = aClass180_Sub2_3865.method15025(false);
		int i_94_ = i * 6;
		anInterface44_3876.method323(i_94_);
		int i_95_ = i_94_ * (anInterface44_3876.method329().anInt2111 * 408933829);
		ByteBuffer bytebuffer = aClass180_Sub2_3865.aByteBuffer9438;
		aClass180_Sub2_3865.method15097(i_95_);
		bytebuffer.clear();
		for (int i_96_ = 0; i_96_ < i; i_96_++) {
			bytebuffer.putShort((short) (i_96_ * 4));
			bytebuffer.putShort((short) (i_96_ * 4 + 2));
			bytebuffer.putShort((short) (i_96_ * 4 + 1));
			bytebuffer.putShort((short) (i_96_ * 4 + 2));
			bytebuffer.putShort((short) (i_96_ * 4 + 3));
			bytebuffer.putShort((short) (i_96_ * 4 + 1));
		}
		anInterface44_3876.method213(0, i_94_ * ((anInterface44_3876.method329().anInt2111) * 408933829), aClass180_Sub2_3865.aLong9439);
		anInt3874 = i;
		anInt3873 = 0;
	}

	void method6347(float f, float f_97_, float f_98_, float f_99_, float f_100_, float f_101_, float f_102_, float f_103_, float f_104_, float f_105_, float f_106_, float f_107_, float f_108_, float f_109_, float f_110_, float f_111_, Interface38 interface38, int i) {
		if ((i & ~0xffffff) != 0) {
			aClass180_Sub2_3865.method3135(anIntArray3877);
			int i_112_ = anIntArray3877[0];
			int i_113_ = anIntArray3877[1];
			int i_114_ = anIntArray3877[2];
			int i_115_ = anIntArray3877[3];
			int i_116_ = 0;
			int i_117_ = ((f < (float) i_112_ ? 1 : 0) + (f_98_ < (float) i_112_ ? 1 : 0) + (f_100_ < (float) i_112_ ? 1 : 0) + (f_102_ < (float) i_112_ ? 1 : 0));
			if (i_117_ != 4) {
				i_116_ |= i_117_;
				i_117_ = ((f > (float) i_114_ ? 1 : 0) + (f_98_ > (float) i_114_ ? 1 : 0) + (f_100_ > (float) i_114_ ? 1 : 0) + (f_102_ > (float) i_114_ ? 1 : 0));
				if (i_117_ != 4) {
					i_116_ |= i_117_;
					i_117_ = ((f_97_ < (float) i_113_ ? 1 : 0) + (f_99_ < (float) i_113_ ? 1 : 0) + (f_101_ < (float) i_113_ ? 1 : 0) + (f_103_ < (float) i_113_ ? 1 : 0));
					if (i_117_ != 4) {
						i_116_ |= i_117_;
						i_117_ = ((f_97_ > (float) i_115_ ? 1 : 0) + (f_99_ > (float) i_115_ ? 1 : 0) + (f_101_ > (float) i_115_ ? 1 : 0) + (f_103_ > (float) i_115_ ? 1 : 0));
						if (i_117_ != 4) {
							i_116_ |= i_117_;
							if (i_116_ != 0) {
								method6333();
								aClass180_Sub2_3865.method3124(true);
								aClass180_Sub2_3865.method3132(i_112_, i_113_, i_114_, i_115_);
							}
							method6338();
							f = method6334(f);
							f_97_ = method6340(f_97_);
							f_98_ = method6334(f_98_);
							f_99_ = method6340(f_99_);
							f_100_ = method6334(f_100_);
							f_101_ = method6340(f_101_);
							f_102_ = method6334(f_102_);
							f_103_ = method6340(f_103_);
							aFloatArray3869[anInt3873 * 16 + 0] = f;
							aFloatArray3869[anInt3873 * 16 + 1] = f_97_;
							aFloatArray3869[anInt3873 * 16 + 2] = f_104_;
							aFloatArray3869[anInt3873 * 16 + 3] = f_105_;
							aFloatArray3869[anInt3873 * 16 + 4] = f_98_;
							aFloatArray3869[anInt3873 * 16 + 5] = f_99_;
							aFloatArray3869[anInt3873 * 16 + 6] = f_106_;
							aFloatArray3869[anInt3873 * 16 + 7] = f_107_;
							aFloatArray3869[anInt3873 * 16 + 8] = f_100_;
							aFloatArray3869[anInt3873 * 16 + 9] = f_101_;
							aFloatArray3869[anInt3873 * 16 + 10] = f_108_;
							aFloatArray3869[anInt3873 * 16 + 11] = f_109_;
							aFloatArray3869[anInt3873 * 16 + 12] = f_102_;
							aFloatArray3869[anInt3873 * 16 + 13] = f_103_;
							aFloatArray3869[anInt3873 * 16 + 14] = f_110_;
							aFloatArray3869[anInt3873 * 16 + 15] = f_111_;
							anInterface38Array3871[anInt3873] = interface38;
							if (aClass180_Sub2_3865.anInt9578 == 1)
								anIntArray3872[anInt3873] = (~0xff00ff & i | (i & 0xff) << 16 | i >> 16 & 0xff);
							else
								anIntArray3872[anInt3873] = i;
							anInt3873++;
							if (aClass342_3866 == Class342.aClass342_3688 || i_116_ > 0)
								method6333();
							if (i_116_ != 0) {
								aClass180_Sub2_3865.method3124(false);
								aClass180_Sub2_3865.method3131();
								aClass180_Sub2_3865.method3132(i_112_, i_113_, i_114_, i_115_);
							}
						}
					}
				}
			}
		}
	}

	void method6348() {
		if (anInt3873 == anInt3868) {
			anInt3868 *= 2;
			float[] fs = new float[anInt3868 * 16];
			for (int i = 0; i < anInt3873 * 16; i++)
				fs[i] = aFloatArray3869[i];
			aFloatArray3869 = fs;
			Interface38[] interface38s = new Interface38[anInt3868];
			int[] is = new int[anInt3868];
			for (int i = 0; i < anInt3873; i++) {
				interface38s[i] = anInterface38Array3871[i];
				is[i] = anIntArray3872[i];
			}
			anInterface38Array3871 = interface38s;
			anIntArray3872 = is;
		}
	}

	void method6349() {
		anInterface37_3870.method129();
		anInterface44_3876.method129();
		anInterface37_3870 = null;
		anInterface44_3876 = null;
		aClass355_3875 = null;
		anInt3873 = 0;
	}

	void method6350() {
		if (anInt3873 == anInt3868) {
			anInt3868 *= 2;
			float[] fs = new float[anInt3868 * 16];
			for (int i = 0; i < anInt3873 * 16; i++)
				fs[i] = aFloatArray3869[i];
			aFloatArray3869 = fs;
			Interface38[] interface38s = new Interface38[anInt3868];
			int[] is = new int[anInt3868];
			for (int i = 0; i < anInt3873; i++) {
				interface38s[i] = anInterface38Array3871[i];
				is[i] = anIntArray3872[i];
			}
			anInterface38Array3871 = interface38s;
			anIntArray3872 = is;
		}
	}

	void method6351() {
		if (anInt3873 == anInt3868) {
			anInt3868 *= 2;
			float[] fs = new float[anInt3868 * 16];
			for (int i = 0; i < anInt3873 * 16; i++)
				fs[i] = aFloatArray3869[i];
			aFloatArray3869 = fs;
			Interface38[] interface38s = new Interface38[anInt3868];
			int[] is = new int[anInt3868];
			for (int i = 0; i < anInt3873; i++) {
				interface38s[i] = anInterface38Array3871[i];
				is[i] = anIntArray3872[i];
			}
			anInterface38Array3871 = interface38s;
			anIntArray3872 = is;
		}
	}

	float method6352(float f) {
		int i = aClass180_Sub2_3865.method3285(706715243).method2728();
		float f_118_ = ((f + aClass180_Sub2_3865.method14911()) / (float) i * 2.0F - 1.0F);
		return f_118_;
	}

	void method6353() {
		aClass342_3867 = aClass342_3866;
		aClass342_3866 = Class342.aClass342_3690;
	}

	void method6354() {
		if (aClass342_3867 != null) {
			aClass342_3866 = aClass342_3867;
			aClass342_3867 = null;
		}
	}

	Class342 method6355() {
		return aClass342_3866;
	}

	Class342 method6356() {
		return aClass342_3866;
	}

	Class342 method6357() {
		return aClass342_3866;
	}
}
