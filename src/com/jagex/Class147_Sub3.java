/* Class147_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class147_Sub3 extends Class147 {
	int anInt9019;
	Class180_Sub3 aClass180_Sub3_9020;
	Class118_Sub3_Sub1 aClass118_Sub3_Sub1_9021;
	Class118_Sub3_Sub1 aClass118_Sub3_Sub1_9022;
	int anInt9023 = 0;
	boolean aBool9024 = false;
	int anInt9025;
	int anInt9026;
	int anInt9027;

	void method2432(float f, float f_0_, float f_1_, float f_2_, float f_3_, float f_4_, int i, Class142 class142, int i_5_, int i_6_) {
		Class118_Sub3_Sub1 class118_sub3_sub1 = ((Class142_Sub3) class142).aClass118_Sub3_Sub1_9382;
		if (aBool9024) {
			float f_7_ = (float) method42();
			float f_8_ = (float) method2410();
			float f_9_ = (f_1_ - f) / f_7_;
			float f_10_ = (f_2_ - f_0_) / f_7_;
			float f_11_ = (f_3_ - f) / f_8_;
			float f_12_ = (f_4_ - f_0_) / f_8_;
			float f_13_ = f_11_ * (float) anInt9019;
			float f_14_ = f_12_ * (float) anInt9019;
			float f_15_ = f_9_ * (float) anInt9025;
			float f_16_ = f_10_ * (float) anInt9025;
			float f_17_ = -f_9_ * (float) anInt9027;
			float f_18_ = -f_10_ * (float) anInt9027;
			float f_19_ = -f_11_ * (float) anInt9026;
			float f_20_ = -f_12_ * (float) anInt9026;
			f = f + f_15_ + f_13_;
			f_0_ = f_0_ + f_16_ + f_14_;
			f_1_ = f_1_ + f_17_ + f_13_;
			f_2_ = f_2_ + f_18_ + f_14_;
			f_3_ = f_3_ + f_15_ + f_19_;
			f_4_ = f_4_ + f_16_ + f_20_;
		}
		float f_21_ = f_3_ + (f_1_ - f);
		float f_22_ = f_2_ + (f_4_ - f_0_);
		aClass118_Sub3_Sub1_9022.method2035((i & 0x1) != 0);
		aClass180_Sub3_9020.method15429();
		aClass180_Sub3_9020.method15401(aClass118_Sub3_Sub1_9022);
		aClass180_Sub3_9020.method15402(1);
		aClass180_Sub3_9020.method15400(1);
		aClass180_Sub3_9020.method15401(class118_sub3_sub1);
		aClass180_Sub3_9020.method15403(7681, 8448);
		aClass180_Sub3_9020.method15404(0, 34168, 768);
		aClass180_Sub3_9020.method15525(1);
		float f_23_ = (class118_sub3_sub1.aFloat11377 / (float) class118_sub3_sub1.anInt11375);
		float f_24_ = (class118_sub3_sub1.aFloat11376 / (float) class118_sub3_sub1.anInt11379);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
		OpenGL.glMultiTexCoord2f(33985, f_23_ * (f - (float) i_5_), (class118_sub3_sub1.aFloat11376 - f_24_ * (f_0_ - (float) i_6_)));
		OpenGL.glVertex2f(f, f_0_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_23_ * (f_3_ - (float) i_5_), (class118_sub3_sub1.aFloat11376 - f_24_ * (f_4_ - (float) i_6_)));
		OpenGL.glVertex2f(f_3_, f_4_);
		OpenGL.glMultiTexCoord2f(33984, aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_23_ * (f_21_ - (float) i_5_), (class118_sub3_sub1.aFloat11376 - f_24_ * (f_22_ - (float) i_6_)));
		OpenGL.glVertex2f(f_21_, f_22_);
		OpenGL.glMultiTexCoord2f(33984, aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
		OpenGL.glMultiTexCoord2f(33985, f_23_ * (f_1_ - (float) i_5_), (class118_sub3_sub1.aFloat11376 - f_24_ * (f_2_ - (float) i_6_)));
		OpenGL.glVertex2f(f_1_, f_2_);
		OpenGL.glEnd();
		aClass180_Sub3_9020.method15404(0, 5890, 768);
		aClass180_Sub3_9020.method15402(0);
		aClass180_Sub3_9020.method15401(null);
		aClass180_Sub3_9020.method15400(0);
	}

	Class147_Sub3(Class180_Sub3 class180_sub3, int i, int i_25_, int i_26_, int i_27_) {
		anInt9019 = 0;
		anInt9025 = 0;
		anInt9026 = 0;
		anInt9027 = 0;
		aClass180_Sub3_9020 = class180_sub3;
		aClass118_Sub3_Sub1_9022 = Class118_Sub3_Sub1.method17949(class180_sub3, i, i_25_, i_26_, i_27_);
	}

	public void method2453(int i, int i_28_, int i_29_, int i_30_, int i_31_) {
		aClass118_Sub3_Sub1_9022.method2035(false);
		aClass180_Sub3_9020.method15429();
		aClass180_Sub3_9020.method15525(i_31_);
		OpenGL.glColor4ub((byte) (i_30_ >> 16), (byte) (i_30_ >> 8), (byte) i_30_, (byte) (i_30_ >> 24));
		i += anInt9025;
		i_28_ += anInt9019;
		if (aClass118_Sub3_Sub1_9021 == null) {
			aClass180_Sub3_9020.method15401(aClass118_Sub3_Sub1_9022);
			aClass180_Sub3_9020.method15402(i_29_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glVertex2i(i, i_28_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_28_ + aClass118_Sub3_Sub1_9022.anInt11379);
			OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
			OpenGL.glVertex2i(i + aClass118_Sub3_Sub1_9022.anInt11375, i_28_ + aClass118_Sub3_Sub1_9022.anInt11379);
			OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glVertex2i(i + aClass118_Sub3_Sub1_9022.anInt11375, i_28_);
			OpenGL.glEnd();
		} else {
			method14529(i_29_);
			aClass118_Sub3_Sub1_9021.method2035(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glVertex2i(i, i_28_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_28_ + aClass118_Sub3_Sub1_9022.anInt11379);
			OpenGL.glMultiTexCoord2f(33985, aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
			OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
			OpenGL.glVertex2i(i + aClass118_Sub3_Sub1_9022.anInt11375, i_28_ + aClass118_Sub3_Sub1_9022.anInt11379);
			OpenGL.glMultiTexCoord2f(33985, aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glVertex2i(i + aClass118_Sub3_Sub1_9022.anInt11375, i_28_);
			OpenGL.glEnd();
			method14524();
		}
	}

	public void method2405(int i, int i_32_, int i_33_, int i_34_) {
		anInt9025 = i;
		anInt9019 = i_32_;
		anInt9027 = i_33_;
		anInt9026 = i_34_;
		aBool9024 = (anInt9025 != 0 || anInt9019 != 0 || anInt9027 != 0 || anInt9026 != 0);
	}

	public void method2446(int[] is) {
		is[0] = anInt9025;
		is[1] = anInt9019;
		is[2] = anInt9027;
		is[3] = anInt9026;
	}

	public int method2407() {
		return aClass118_Sub3_Sub1_9022.anInt11375;
	}

	public void method2445(int i, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_) {
		method14525(i, i_35_, i_36_, i_37_, i_38_, i_39_, false);
	}

	public void method2486(int i, int i_40_, int i_41_) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		aClass118_Sub3_Sub1_9021 = Class118_Sub3_Sub1.method17949(aClass180_Sub3_9020, i, i_40_, (aClass118_Sub3_Sub1_9022.anInt11375), (aClass118_Sub3_Sub1_9022.anInt11379));
		anInt9023 = i_41_;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	public int method2410() {
		return aClass118_Sub3_Sub1_9022.anInt11379 + anInt9019 + anInt9026;
	}

	public int method44() {
		return aClass118_Sub3_Sub1_9022.anInt11375 + anInt9025 + anInt9027;
	}

	public int method41() {
		return aClass118_Sub3_Sub1_9022.anInt11375 + anInt9025 + anInt9027;
	}

	void method2420(int i, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_) {
		aClass118_Sub3_Sub1_9022.method2035((i_48_ & 0x1) != 0);
		aClass180_Sub3_9020.method15429();
		aClass180_Sub3_9020.method15525(i_47_);
		OpenGL.glColor4ub((byte) (i_46_ >> 16), (byte) (i_46_ >> 8), (byte) i_46_, (byte) (i_46_ >> 24));
		if (aBool9024) {
			float f = (float) i_43_ / (float) method42();
			float f_49_ = (float) i_44_ / (float) method2410();
			float f_50_ = (float) i + (float) anInt9025 * f;
			float f_51_ = (float) i_42_ + (float) anInt9019 * f_49_;
			float f_52_ = f_50_ + (float) aClass118_Sub3_Sub1_9022.anInt11375 * f;
			float f_53_ = f_51_ + (float) aClass118_Sub3_Sub1_9022.anInt11379 * f_49_;
			if (aClass118_Sub3_Sub1_9021 == null) {
				aClass180_Sub3_9020.method15401(aClass118_Sub3_Sub1_9022);
				aClass180_Sub3_9020.method15402(i_45_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
				OpenGL.glVertex2f(f_50_, f_51_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_50_, f_53_);
				OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
				OpenGL.glVertex2f(f_52_, f_53_);
				OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
				OpenGL.glVertex2f(f_52_, f_51_);
				OpenGL.glEnd();
			} else {
				method14529(i_45_);
				aClass118_Sub3_Sub1_9021.method2035(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
				OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
				OpenGL.glVertex2f(f_50_, f_51_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_50_, f_53_);
				OpenGL.glMultiTexCoord2f(33985, aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
				OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
				OpenGL.glVertex2f(f_52_, f_53_);
				OpenGL.glMultiTexCoord2f(33985, aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
				OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
				OpenGL.glVertex2f(f_52_, f_51_);
				OpenGL.glEnd();
				method14524();
			}
		} else if (aClass118_Sub3_Sub1_9021 == null) {
			aClass180_Sub3_9020.method15401(aClass118_Sub3_Sub1_9022);
			aClass180_Sub3_9020.method15402(i_45_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glVertex2i(i, i_42_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_42_ + i_44_);
			OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
			OpenGL.glVertex2i(i + i_43_, i_42_ + i_44_);
			OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glVertex2i(i + i_43_, i_42_);
			OpenGL.glEnd();
		} else {
			method14529(i_45_);
			aClass118_Sub3_Sub1_9021.method2035(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glVertex2i(i, i_42_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_42_ + i_44_);
			OpenGL.glMultiTexCoord2f(33985, aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
			OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
			OpenGL.glVertex2i(i + i_43_, i_42_ + i_44_);
			OpenGL.glMultiTexCoord2f(33985, aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glVertex2i(i + i_43_, i_42_);
			OpenGL.glEnd();
			method14524();
		}
	}

	public void method2433(int i, int i_54_, int i_55_, int i_56_, int[] is, int i_57_, int i_58_) {
		aClass118_Sub3_Sub1_9022.method14452(i, i_54_, i_55_, i_56_, is, i_57_, i_58_, true);
	}

	public void method2459(int i, int i_59_, int i_60_, int i_61_, int[] is, int i_62_, int i_63_) {
		aClass118_Sub3_Sub1_9022.method14452(i, i_59_, i_60_, i_61_, is, i_62_, i_63_, true);
	}

	public void method2412(int i, int i_64_, int i_65_, int i_66_, int[] is, int[] is_67_, int i_68_, int i_69_) {
		aClass118_Sub3_Sub1_9022.method14454(i, i_64_, i_65_, i_66_, is, is_67_, i_68_);
	}

	public int method2424() {
		return aClass118_Sub3_Sub1_9022.anInt11379;
	}

	void method14524() {
		aClass180_Sub3_9020.method15400(1);
		aClass180_Sub3_9020.method15401(null);
		aClass180_Sub3_9020.method15403(8448, 8448);
		aClass180_Sub3_9020.method15404(1, 34168, 768);
		aClass180_Sub3_9020.method15405(0, 5890, 770);
		aClass180_Sub3_9020.method15400(0);
		aClass180_Sub3_9020.method15404(1, 34168, 768);
	}

	public void method2416(int i, int i_70_, int i_71_, int i_72_, int i_73_) {
		aClass118_Sub3_Sub1_9022.method2035(false);
		aClass180_Sub3_9020.method15429();
		aClass180_Sub3_9020.method15525(i_73_);
		OpenGL.glColor4ub((byte) (i_72_ >> 16), (byte) (i_72_ >> 8), (byte) i_72_, (byte) (i_72_ >> 24));
		i += anInt9025;
		i_70_ += anInt9019;
		if (aClass118_Sub3_Sub1_9021 == null) {
			aClass180_Sub3_9020.method15401(aClass118_Sub3_Sub1_9022);
			aClass180_Sub3_9020.method15402(i_71_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glVertex2i(i, i_70_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_70_ + aClass118_Sub3_Sub1_9022.anInt11379);
			OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
			OpenGL.glVertex2i(i + aClass118_Sub3_Sub1_9022.anInt11375, i_70_ + aClass118_Sub3_Sub1_9022.anInt11379);
			OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glVertex2i(i + aClass118_Sub3_Sub1_9022.anInt11375, i_70_);
			OpenGL.glEnd();
		} else {
			method14529(i_71_);
			aClass118_Sub3_Sub1_9021.method2035(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glVertex2i(i, i_70_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_70_ + aClass118_Sub3_Sub1_9022.anInt11379);
			OpenGL.glMultiTexCoord2f(33985, aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
			OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
			OpenGL.glVertex2i(i + aClass118_Sub3_Sub1_9022.anInt11375, i_70_ + aClass118_Sub3_Sub1_9022.anInt11379);
			OpenGL.glMultiTexCoord2f(33985, aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glVertex2i(i + aClass118_Sub3_Sub1_9022.anInt11375, i_70_);
			OpenGL.glEnd();
			method14524();
		}
	}

	public void method2465(int i, int i_74_, Class142 class142, int i_75_, int i_76_) {
		Class142_Sub3 class142_sub3 = (Class142_Sub3) class142;
		Class118_Sub3_Sub1 class118_sub3_sub1 = class142_sub3.aClass118_Sub3_Sub1_9382;
		aClass118_Sub3_Sub1_9022.method2035(false);
		aClass180_Sub3_9020.method15429();
		aClass180_Sub3_9020.method15401(aClass118_Sub3_Sub1_9022);
		aClass180_Sub3_9020.method15402(1);
		aClass180_Sub3_9020.method15400(1);
		aClass180_Sub3_9020.method15401(class118_sub3_sub1);
		aClass180_Sub3_9020.method15403(7681, 8448);
		aClass180_Sub3_9020.method15404(0, 34168, 768);
		aClass180_Sub3_9020.method15525(1);
		i += anInt9025;
		i_74_ += anInt9019;
		int i_77_ = i + aClass118_Sub3_Sub1_9022.anInt11375;
		int i_78_ = i_74_ + aClass118_Sub3_Sub1_9022.anInt11379;
		float f = (class118_sub3_sub1.aFloat11377 / (float) class118_sub3_sub1.anInt11375);
		float f_79_ = (class118_sub3_sub1.aFloat11376 / (float) class118_sub3_sub1.anInt11379);
		float f_80_ = (float) (i - i_75_) * f;
		float f_81_ = (float) (i_77_ - i_75_) * f;
		float f_82_ = class118_sub3_sub1.aFloat11376 - (float) (i_74_ - i_76_) * f_79_;
		float f_83_ = class118_sub3_sub1.aFloat11376 - (float) (i_78_ - i_76_) * f_79_;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
		OpenGL.glMultiTexCoord2f(33985, f_80_, f_82_);
		OpenGL.glVertex2i(i, i_74_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_80_, f_83_);
		OpenGL.glVertex2i(i, i_74_ + aClass118_Sub3_Sub1_9022.anInt11379);
		OpenGL.glMultiTexCoord2f(33984, aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_81_, f_83_);
		OpenGL.glVertex2i(i + aClass118_Sub3_Sub1_9022.anInt11375, i_74_ + aClass118_Sub3_Sub1_9022.anInt11379);
		OpenGL.glMultiTexCoord2f(33984, aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
		OpenGL.glMultiTexCoord2f(33985, f_81_, f_82_);
		OpenGL.glVertex2i(i + aClass118_Sub3_Sub1_9022.anInt11375, i_74_);
		OpenGL.glEnd();
		aClass180_Sub3_9020.method15404(0, 5890, 768);
		aClass180_Sub3_9020.method15402(0);
		aClass180_Sub3_9020.method15401(null);
		aClass180_Sub3_9020.method15400(0);
	}

	public int method42() {
		return aClass118_Sub3_Sub1_9022.anInt11375 + anInt9025 + anInt9027;
	}

	public void method2422(int i, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_, int i_89_) {
		int i_90_ = i + i_85_;
		int i_91_ = i_84_ + i_86_;
		aClass118_Sub3_Sub1_9022.method2035(false);
		aClass180_Sub3_9020.method15429();
		aClass180_Sub3_9020.method15401(aClass118_Sub3_Sub1_9022);
		aClass180_Sub3_9020.method15525(i_89_);
		aClass180_Sub3_9020.method15402(i_87_);
		OpenGL.glColor4ub((byte) (i_88_ >> 16), (byte) (i_88_ >> 8), (byte) i_88_, (byte) (i_88_ >> 24));
		if (aClass118_Sub3_Sub1_9022.aBool11374 && !aBool9024 && i_86_ >= aClass118_Sub3_Sub1_9022.anInt11379 && i_85_ >= aClass118_Sub3_Sub1_9022.anInt11375) {
			float f = (aClass118_Sub3_Sub1_9022.aFloat11376 * (float) i_86_ / (float) aClass118_Sub3_Sub1_9022.anInt11379);
			float f_92_ = (aClass118_Sub3_Sub1_9022.aFloat11377 * (float) i_85_ / (float) aClass118_Sub3_Sub1_9022.anInt11375);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f);
			OpenGL.glVertex2i(i, i_84_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_91_);
			OpenGL.glTexCoord2f(f_92_, 0.0F);
			OpenGL.glVertex2i(i_90_, i_91_);
			OpenGL.glTexCoord2f(f_92_, f);
			OpenGL.glVertex2i(i_90_, i_84_);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) anInt9025, (float) anInt9019, 0.0F);
			int i_93_ = method42();
			int i_94_ = method2410();
			int i_95_ = i_84_ + aClass118_Sub3_Sub1_9022.anInt11379;
			OpenGL.glBegin(7);
			int i_96_ = i_84_;
			for (/**/; i_95_ <= i_91_; i_95_ += i_94_) {
				int i_97_ = i + aClass118_Sub3_Sub1_9022.anInt11375;
				int i_98_ = i;
				while (i_97_ <= i_90_) {
					OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_98_, i_96_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_98_, i_95_);
					OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
					OpenGL.glVertex2i(i_97_, i_95_);
					OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_97_, i_96_);
					i_97_ += i_93_;
					i_98_ += i_93_;
				}
				if (i_98_ < i_90_) {
					float f = (aClass118_Sub3_Sub1_9022.aFloat11377 * (float) (i_90_ - i_98_) / (float) aClass118_Sub3_Sub1_9022.anInt11375);
					OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_98_, i_96_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_98_, i_95_);
					OpenGL.glTexCoord2f(f, 0.0F);
					OpenGL.glVertex2i(i_90_, i_95_);
					OpenGL.glTexCoord2f(f, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_90_, i_96_);
				}
				i_96_ += i_94_;
			}
			if (i_96_ < i_91_) {
				float f = (aClass118_Sub3_Sub1_9022.aFloat11376 * (float) (aClass118_Sub3_Sub1_9022.anInt11379 - (i_91_ - i_96_)) / (float) aClass118_Sub3_Sub1_9022.anInt11379);
				int i_99_ = i + aClass118_Sub3_Sub1_9022.anInt11375;
				int i_100_ = i;
				while (i_99_ <= i_90_) {
					OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_100_, i_96_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_100_, i_91_);
					OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, f);
					OpenGL.glVertex2i(i_99_, i_91_);
					OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_99_, i_96_);
					i_99_ += i_93_;
					i_100_ += i_93_;
				}
				if (i_100_ < i_90_) {
					float f_101_ = (aClass118_Sub3_Sub1_9022.aFloat11377 * (float) (i_90_ - i_100_) / (float) aClass118_Sub3_Sub1_9022.anInt11375);
					OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_100_, i_96_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_100_, i_91_);
					OpenGL.glTexCoord2f(f_101_, f);
					OpenGL.glVertex2i(i_90_, i_91_);
					OpenGL.glTexCoord2f(f_101_, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_90_, i_96_);
				}
			}
			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}
	}

	public void method2440(int i, int i_102_, int i_103_) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		aClass118_Sub3_Sub1_9021 = Class118_Sub3_Sub1.method17949(aClass180_Sub3_9020, i, i_102_, (aClass118_Sub3_Sub1_9022.anInt11375), (aClass118_Sub3_Sub1_9022.anInt11379));
		anInt9023 = i_103_;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	void method14525(int i, int i_104_, int i_105_, int i_106_, int i_107_, int i_108_, boolean bool) {
		if (aClass180_Sub3_9020.aBool9814 && !bool) {
			int[] is = aClass180_Sub3_9020.method3113(i_107_, i_108_, i_105_, i_106_);
			if (is != null) {
				for (int i_109_ = 0; i_109_ < is.length; i_109_++)
					is[i_109_] |= ~0xffffff;
				method2459(i, i_104_, i_105_, i_106_, is, 0, i_105_);
			}
		} else
			aClass118_Sub3_Sub1_9022.method14453(i, i_104_, i_105_, i_106_, i_107_, i_108_);
	}

	public void method2444(int i, int i_110_, int i_111_, int i_112_, int[] is, int i_113_, int i_114_) {
		aClass118_Sub3_Sub1_9022.method14452(i, i_110_, i_111_, i_112_, is, i_113_, i_114_, true);
	}

	void method2430(float f, float f_115_, float f_116_, float f_117_, float f_118_, float f_119_, int i, int i_120_, int i_121_, int i_122_) {
		if (aBool9024) {
			float f_123_ = (float) method42();
			float f_124_ = (float) method2410();
			float f_125_ = (f_116_ - f) / f_123_;
			float f_126_ = (f_117_ - f_115_) / f_123_;
			float f_127_ = (f_118_ - f) / f_124_;
			float f_128_ = (f_119_ - f_115_) / f_124_;
			float f_129_ = f_127_ * (float) anInt9019;
			float f_130_ = f_128_ * (float) anInt9019;
			float f_131_ = f_125_ * (float) anInt9025;
			float f_132_ = f_126_ * (float) anInt9025;
			float f_133_ = -f_125_ * (float) anInt9027;
			float f_134_ = -f_126_ * (float) anInt9027;
			float f_135_ = -f_127_ * (float) anInt9026;
			float f_136_ = -f_128_ * (float) anInt9026;
			f = f + f_131_ + f_129_;
			f_115_ = f_115_ + f_132_ + f_130_;
			f_116_ = f_116_ + f_133_ + f_129_;
			f_117_ = f_117_ + f_134_ + f_130_;
			f_118_ = f_118_ + f_131_ + f_135_;
			f_119_ = f_119_ + f_132_ + f_136_;
		}
		float f_137_ = f_118_ + (f_116_ - f);
		float f_138_ = f_117_ + (f_119_ - f_115_);
		aClass118_Sub3_Sub1_9022.method2035((i_122_ & 0x1) != 0);
		aClass180_Sub3_9020.method15429();
		aClass180_Sub3_9020.method15401(aClass118_Sub3_Sub1_9022);
		aClass180_Sub3_9020.method15525(i_121_);
		aClass180_Sub3_9020.method15402(i);
		OpenGL.glColor4ub((byte) (i_120_ >> 16), (byte) (i_120_ >> 8), (byte) i_120_, (byte) (i_120_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
		OpenGL.glVertex2f(f, f_115_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_118_, f_119_);
		OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
		OpenGL.glVertex2f(f_137_, f_138_);
		OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
		OpenGL.glVertex2f(f_116_, f_117_);
		OpenGL.glEnd();
	}

	public void method2434(int i, int i_139_, int i_140_, int i_141_, int[] is, int i_142_, int i_143_) {
		aClass118_Sub3_Sub1_9022.method14452(i, i_139_, i_140_, i_141_, is, i_142_, i_143_, true);
	}

	void method14526() {
		aClass180_Sub3_9020.method15400(1);
		aClass180_Sub3_9020.method15401(null);
		aClass180_Sub3_9020.method15403(8448, 8448);
		aClass180_Sub3_9020.method15404(1, 34168, 768);
		aClass180_Sub3_9020.method15405(0, 5890, 770);
		aClass180_Sub3_9020.method15400(0);
		aClass180_Sub3_9020.method15404(1, 34168, 768);
	}

	public Interface21 method2443() {
		return aClass118_Sub3_Sub1_9022.method14459(0);
	}

	void method14527(int i) {
		aClass180_Sub3_9020.method15400(1);
		aClass180_Sub3_9020.method15401(aClass118_Sub3_Sub1_9022);
		aClass180_Sub3_9020.method15403(aClass180_Sub3_9020.method15388(i), 7681);
		aClass180_Sub3_9020.method15404(1, 34167, 768);
		aClass180_Sub3_9020.method15405(0, 34168, 770);
		aClass180_Sub3_9020.method15400(0);
		aClass180_Sub3_9020.method15401(aClass118_Sub3_Sub1_9021);
		aClass180_Sub3_9020.method15403(34479, 7681);
		aClass180_Sub3_9020.method15404(1, 34166, 768);
		if (anInt9023 == 0)
			aClass180_Sub3_9020.method15406(1.0F, 0.5F, 0.5F, 0.0F);
		else if (anInt9023 == 1)
			aClass180_Sub3_9020.method15406(0.5F, 1.0F, 0.5F, 0.0F);
		else if (anInt9023 == 2)
			aClass180_Sub3_9020.method15406(0.5F, 0.5F, 1.0F, 0.0F);
		else if (anInt9023 == 3)
			aClass180_Sub3_9020.method15406(128.5F, 128.5F, 128.5F, 0.0F);
	}

	public void method2438(int i, int i_144_, Class142 class142, int i_145_, int i_146_) {
		Class142_Sub3 class142_sub3 = (Class142_Sub3) class142;
		Class118_Sub3_Sub1 class118_sub3_sub1 = class142_sub3.aClass118_Sub3_Sub1_9382;
		aClass118_Sub3_Sub1_9022.method2035(false);
		aClass180_Sub3_9020.method15429();
		aClass180_Sub3_9020.method15401(aClass118_Sub3_Sub1_9022);
		aClass180_Sub3_9020.method15402(1);
		aClass180_Sub3_9020.method15400(1);
		aClass180_Sub3_9020.method15401(class118_sub3_sub1);
		aClass180_Sub3_9020.method15403(7681, 8448);
		aClass180_Sub3_9020.method15404(0, 34168, 768);
		aClass180_Sub3_9020.method15525(1);
		i += anInt9025;
		i_144_ += anInt9019;
		int i_147_ = i + aClass118_Sub3_Sub1_9022.anInt11375;
		int i_148_ = i_144_ + aClass118_Sub3_Sub1_9022.anInt11379;
		float f = (class118_sub3_sub1.aFloat11377 / (float) class118_sub3_sub1.anInt11375);
		float f_149_ = (class118_sub3_sub1.aFloat11376 / (float) class118_sub3_sub1.anInt11379);
		float f_150_ = (float) (i - i_145_) * f;
		float f_151_ = (float) (i_147_ - i_145_) * f;
		float f_152_ = (class118_sub3_sub1.aFloat11376 - (float) (i_144_ - i_146_) * f_149_);
		float f_153_ = (class118_sub3_sub1.aFloat11376 - (float) (i_148_ - i_146_) * f_149_);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
		OpenGL.glMultiTexCoord2f(33985, f_150_, f_152_);
		OpenGL.glVertex2i(i, i_144_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_150_, f_153_);
		OpenGL.glVertex2i(i, i_144_ + aClass118_Sub3_Sub1_9022.anInt11379);
		OpenGL.glMultiTexCoord2f(33984, aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_151_, f_153_);
		OpenGL.glVertex2i(i + aClass118_Sub3_Sub1_9022.anInt11375, i_144_ + aClass118_Sub3_Sub1_9022.anInt11379);
		OpenGL.glMultiTexCoord2f(33984, aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
		OpenGL.glMultiTexCoord2f(33985, f_151_, f_152_);
		OpenGL.glVertex2i(i + aClass118_Sub3_Sub1_9022.anInt11375, i_144_);
		OpenGL.glEnd();
		aClass180_Sub3_9020.method15404(0, 5890, 768);
		aClass180_Sub3_9020.method15402(0);
		aClass180_Sub3_9020.method15401(null);
		aClass180_Sub3_9020.method15400(0);
	}

	void method2439(int i, int i_154_, int i_155_, int i_156_, int i_157_, int i_158_, int i_159_, int i_160_) {
		aClass118_Sub3_Sub1_9022.method2035((i_160_ & 0x1) != 0);
		aClass180_Sub3_9020.method15429();
		aClass180_Sub3_9020.method15525(i_159_);
		OpenGL.glColor4ub((byte) (i_158_ >> 16), (byte) (i_158_ >> 8), (byte) i_158_, (byte) (i_158_ >> 24));
		if (aBool9024) {
			float f = (float) i_155_ / (float) method42();
			float f_161_ = (float) i_156_ / (float) method2410();
			float f_162_ = (float) i + (float) anInt9025 * f;
			float f_163_ = (float) i_154_ + (float) anInt9019 * f_161_;
			float f_164_ = f_162_ + (float) aClass118_Sub3_Sub1_9022.anInt11375 * f;
			float f_165_ = (f_163_ + (float) aClass118_Sub3_Sub1_9022.anInt11379 * f_161_);
			if (aClass118_Sub3_Sub1_9021 == null) {
				aClass180_Sub3_9020.method15401(aClass118_Sub3_Sub1_9022);
				aClass180_Sub3_9020.method15402(i_157_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
				OpenGL.glVertex2f(f_162_, f_163_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_162_, f_165_);
				OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
				OpenGL.glVertex2f(f_164_, f_165_);
				OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
				OpenGL.glVertex2f(f_164_, f_163_);
				OpenGL.glEnd();
			} else {
				method14529(i_157_);
				aClass118_Sub3_Sub1_9021.method2035(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
				OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
				OpenGL.glVertex2f(f_162_, f_163_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_162_, f_165_);
				OpenGL.glMultiTexCoord2f(33985, aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
				OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
				OpenGL.glVertex2f(f_164_, f_165_);
				OpenGL.glMultiTexCoord2f(33985, aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
				OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
				OpenGL.glVertex2f(f_164_, f_163_);
				OpenGL.glEnd();
				method14524();
			}
		} else if (aClass118_Sub3_Sub1_9021 == null) {
			aClass180_Sub3_9020.method15401(aClass118_Sub3_Sub1_9022);
			aClass180_Sub3_9020.method15402(i_157_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glVertex2i(i, i_154_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_154_ + i_156_);
			OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
			OpenGL.glVertex2i(i + i_155_, i_154_ + i_156_);
			OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glVertex2i(i + i_155_, i_154_);
			OpenGL.glEnd();
		} else {
			method14529(i_157_);
			aClass118_Sub3_Sub1_9021.method2035(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glVertex2i(i, i_154_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_154_ + i_156_);
			OpenGL.glMultiTexCoord2f(33985, aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
			OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
			OpenGL.glVertex2i(i + i_155_, i_154_ + i_156_);
			OpenGL.glMultiTexCoord2f(33985, aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glVertex2i(i + i_155_, i_154_);
			OpenGL.glEnd();
			method14524();
		}
	}

	void method2472(int i, int i_166_, int i_167_, int i_168_, int i_169_, int i_170_, int i_171_, int i_172_) {
		aClass118_Sub3_Sub1_9022.method2035((i_172_ & 0x1) != 0);
		aClass180_Sub3_9020.method15429();
		aClass180_Sub3_9020.method15525(i_171_);
		OpenGL.glColor4ub((byte) (i_170_ >> 16), (byte) (i_170_ >> 8), (byte) i_170_, (byte) (i_170_ >> 24));
		if (aBool9024) {
			float f = (float) i_167_ / (float) method42();
			float f_173_ = (float) i_168_ / (float) method2410();
			float f_174_ = (float) i + (float) anInt9025 * f;
			float f_175_ = (float) i_166_ + (float) anInt9019 * f_173_;
			float f_176_ = f_174_ + (float) aClass118_Sub3_Sub1_9022.anInt11375 * f;
			float f_177_ = (f_175_ + (float) aClass118_Sub3_Sub1_9022.anInt11379 * f_173_);
			if (aClass118_Sub3_Sub1_9021 == null) {
				aClass180_Sub3_9020.method15401(aClass118_Sub3_Sub1_9022);
				aClass180_Sub3_9020.method15402(i_169_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
				OpenGL.glVertex2f(f_174_, f_175_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_174_, f_177_);
				OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
				OpenGL.glVertex2f(f_176_, f_177_);
				OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
				OpenGL.glVertex2f(f_176_, f_175_);
				OpenGL.glEnd();
			} else {
				method14529(i_169_);
				aClass118_Sub3_Sub1_9021.method2035(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
				OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
				OpenGL.glVertex2f(f_174_, f_175_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_174_, f_177_);
				OpenGL.glMultiTexCoord2f(33985, aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
				OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
				OpenGL.glVertex2f(f_176_, f_177_);
				OpenGL.glMultiTexCoord2f(33985, aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
				OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
				OpenGL.glVertex2f(f_176_, f_175_);
				OpenGL.glEnd();
				method14524();
			}
		} else if (aClass118_Sub3_Sub1_9021 == null) {
			aClass180_Sub3_9020.method15401(aClass118_Sub3_Sub1_9022);
			aClass180_Sub3_9020.method15402(i_169_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glVertex2i(i, i_166_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_166_ + i_168_);
			OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
			OpenGL.glVertex2i(i + i_167_, i_166_ + i_168_);
			OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glVertex2i(i + i_167_, i_166_);
			OpenGL.glEnd();
		} else {
			method14529(i_169_);
			aClass118_Sub3_Sub1_9021.method2035(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glVertex2i(i, i_166_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_166_ + i_168_);
			OpenGL.glMultiTexCoord2f(33985, aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
			OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
			OpenGL.glVertex2i(i + i_167_, i_166_ + i_168_);
			OpenGL.glMultiTexCoord2f(33985, aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
			OpenGL.glVertex2i(i + i_167_, i_166_);
			OpenGL.glEnd();
			method14524();
		}
	}

	public void method2441(int i, int i_178_, int i_179_, int i_180_, int[] is, int[] is_181_, int i_182_, int i_183_) {
		aClass118_Sub3_Sub1_9022.method14454(i, i_178_, i_179_, i_180_, is, is_181_, i_182_);
	}

	void method14528(int i, int i_184_, int i_185_, int i_186_, int i_187_, int i_188_, boolean bool) {
		if (aClass180_Sub3_9020.aBool9814 && !bool) {
			int[] is = aClass180_Sub3_9020.method3113(i_187_, i_188_, i_185_, i_186_);
			if (is != null) {
				for (int i_189_ = 0; i_189_ < is.length; i_189_++)
					is[i_189_] |= ~0xffffff;
				method2459(i, i_184_, i_185_, i_186_, is, 0, i_185_);
			}
		} else
			aClass118_Sub3_Sub1_9022.method14453(i, i_184_, i_185_, i_186_, i_187_, i_188_);
	}

	public Interface21 method2462() {
		return aClass118_Sub3_Sub1_9022.method14459(0);
	}

	public void method2478(int i, int i_190_, int i_191_, int i_192_) {
		anInt9025 = i;
		anInt9019 = i_190_;
		anInt9027 = i_191_;
		anInt9026 = i_192_;
		aBool9024 = (anInt9025 != 0 || anInt9019 != 0 || anInt9027 != 0 || anInt9026 != 0);
	}

	public void method2417(int i, int i_193_, int i_194_, int i_195_) {
		anInt9025 = i;
		anInt9019 = i_193_;
		anInt9027 = i_194_;
		anInt9026 = i_195_;
		aBool9024 = (anInt9025 != 0 || anInt9019 != 0 || anInt9027 != 0 || anInt9026 != 0);
	}

	public void method2435(int i, int i_196_, int i_197_, int i_198_, int i_199_, int i_200_) {
		method14525(i, i_196_, i_197_, i_198_, i_199_, i_200_, false);
	}

	public void method2447(int[] is) {
		is[0] = anInt9025;
		is[1] = anInt9019;
		is[2] = anInt9027;
		is[3] = anInt9026;
	}

	public int method2448() {
		return aClass118_Sub3_Sub1_9022.anInt11375;
	}

	public int method2460() {
		return aClass118_Sub3_Sub1_9022.anInt11375;
	}

	Class147_Sub3(Class180_Sub3 class180_sub3, int i, int i_201_, int[] is, int i_202_, int i_203_) {
		anInt9019 = 0;
		anInt9025 = 0;
		anInt9026 = 0;
		anInt9027 = 0;
		aClass180_Sub3_9020 = class180_sub3;
		aClass118_Sub3_Sub1_9022 = Class118_Sub3_Sub1.method17947(class180_sub3, i, i_201_, false, is, i_203_, i_202_);
	}

	public int method40() {
		return aClass118_Sub3_Sub1_9022.anInt11375 + anInt9025 + anInt9027;
	}

	public int method43() {
		return aClass118_Sub3_Sub1_9022.anInt11375 + anInt9025 + anInt9027;
	}

	Class147_Sub3(Class180_Sub3 class180_sub3, int i, int i_204_, boolean bool) {
		anInt9019 = 0;
		anInt9025 = 0;
		anInt9026 = 0;
		anInt9027 = 0;
		aClass180_Sub3_9020 = class180_sub3;
		aClass118_Sub3_Sub1_9022 = Class118_Sub3_Sub1.method17951(class180_sub3, (bool ? Class157.aClass157_1723 : Class157.aClass157_1728), Class184.aClass184_2104, i, i_204_);
	}

	public int method2431() {
		return aClass118_Sub3_Sub1_9022.anInt11379 + anInt9019 + anInt9026;
	}

	public int method2452() {
		return aClass118_Sub3_Sub1_9022.anInt11379 + anInt9019 + anInt9026;
	}

	void method14529(int i) {
		aClass180_Sub3_9020.method15400(1);
		aClass180_Sub3_9020.method15401(aClass118_Sub3_Sub1_9022);
		aClass180_Sub3_9020.method15403(aClass180_Sub3_9020.method15388(i), 7681);
		aClass180_Sub3_9020.method15404(1, 34167, 768);
		aClass180_Sub3_9020.method15405(0, 34168, 770);
		aClass180_Sub3_9020.method15400(0);
		aClass180_Sub3_9020.method15401(aClass118_Sub3_Sub1_9021);
		aClass180_Sub3_9020.method15403(34479, 7681);
		aClass180_Sub3_9020.method15404(1, 34166, 768);
		if (anInt9023 == 0)
			aClass180_Sub3_9020.method15406(1.0F, 0.5F, 0.5F, 0.0F);
		else if (anInt9023 == 1)
			aClass180_Sub3_9020.method15406(0.5F, 1.0F, 0.5F, 0.0F);
		else if (anInt9023 == 2)
			aClass180_Sub3_9020.method15406(0.5F, 0.5F, 1.0F, 0.0F);
		else if (anInt9023 == 3)
			aClass180_Sub3_9020.method15406(128.5F, 128.5F, 128.5F, 0.0F);
	}

	public void method2409(int i, int i_205_, int i_206_, int i_207_, int i_208_, int i_209_, int i_210_) {
		int i_211_ = i + i_206_;
		int i_212_ = i_205_ + i_207_;
		aClass118_Sub3_Sub1_9022.method2035(false);
		aClass180_Sub3_9020.method15429();
		aClass180_Sub3_9020.method15401(aClass118_Sub3_Sub1_9022);
		aClass180_Sub3_9020.method15525(i_210_);
		aClass180_Sub3_9020.method15402(i_208_);
		OpenGL.glColor4ub((byte) (i_209_ >> 16), (byte) (i_209_ >> 8), (byte) i_209_, (byte) (i_209_ >> 24));
		if (aClass118_Sub3_Sub1_9022.aBool11374 && !aBool9024 && i_207_ >= aClass118_Sub3_Sub1_9022.anInt11379 && i_206_ >= aClass118_Sub3_Sub1_9022.anInt11375) {
			float f = (aClass118_Sub3_Sub1_9022.aFloat11376 * (float) i_207_ / (float) aClass118_Sub3_Sub1_9022.anInt11379);
			float f_213_ = (aClass118_Sub3_Sub1_9022.aFloat11377 * (float) i_206_ / (float) aClass118_Sub3_Sub1_9022.anInt11375);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f);
			OpenGL.glVertex2i(i, i_205_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_212_);
			OpenGL.glTexCoord2f(f_213_, 0.0F);
			OpenGL.glVertex2i(i_211_, i_212_);
			OpenGL.glTexCoord2f(f_213_, f);
			OpenGL.glVertex2i(i_211_, i_205_);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) anInt9025, (float) anInt9019, 0.0F);
			int i_214_ = method42();
			int i_215_ = method2410();
			int i_216_ = i_205_ + aClass118_Sub3_Sub1_9022.anInt11379;
			OpenGL.glBegin(7);
			int i_217_ = i_205_;
			for (/**/; i_216_ <= i_212_; i_216_ += i_215_) {
				int i_218_ = i + aClass118_Sub3_Sub1_9022.anInt11375;
				int i_219_ = i;
				while (i_218_ <= i_211_) {
					OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_219_, i_217_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_219_, i_216_);
					OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
					OpenGL.glVertex2i(i_218_, i_216_);
					OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_218_, i_217_);
					i_218_ += i_214_;
					i_219_ += i_214_;
				}
				if (i_219_ < i_211_) {
					float f = (aClass118_Sub3_Sub1_9022.aFloat11377 * (float) (i_211_ - i_219_) / (float) aClass118_Sub3_Sub1_9022.anInt11375);
					OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_219_, i_217_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_219_, i_216_);
					OpenGL.glTexCoord2f(f, 0.0F);
					OpenGL.glVertex2i(i_211_, i_216_);
					OpenGL.glTexCoord2f(f, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_211_, i_217_);
				}
				i_217_ += i_215_;
			}
			if (i_217_ < i_212_) {
				float f = (aClass118_Sub3_Sub1_9022.aFloat11376 * (float) (aClass118_Sub3_Sub1_9022.anInt11379 - (i_212_ - i_217_)) / (float) aClass118_Sub3_Sub1_9022.anInt11379);
				int i_220_ = i + aClass118_Sub3_Sub1_9022.anInt11375;
				int i_221_ = i;
				while (i_220_ <= i_211_) {
					OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_221_, i_217_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_221_, i_212_);
					OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, f);
					OpenGL.glVertex2i(i_220_, i_212_);
					OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_220_, i_217_);
					i_220_ += i_214_;
					i_221_ += i_214_;
				}
				if (i_221_ < i_211_) {
					float f_222_ = (aClass118_Sub3_Sub1_9022.aFloat11377 * (float) (i_211_ - i_221_) / (float) aClass118_Sub3_Sub1_9022.anInt11375);
					OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_221_, i_217_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_221_, i_212_);
					OpenGL.glTexCoord2f(f_222_, f);
					OpenGL.glVertex2i(i_211_, i_212_);
					OpenGL.glTexCoord2f(f_222_, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_211_, i_217_);
				}
			}
			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}
	}

	public void method2455(int i, int i_223_, int i_224_, int i_225_, int i_226_, int i_227_, int i_228_) {
		int i_229_ = i + i_224_;
		int i_230_ = i_223_ + i_225_;
		aClass118_Sub3_Sub1_9022.method2035(false);
		aClass180_Sub3_9020.method15429();
		aClass180_Sub3_9020.method15401(aClass118_Sub3_Sub1_9022);
		aClass180_Sub3_9020.method15525(i_228_);
		aClass180_Sub3_9020.method15402(i_226_);
		OpenGL.glColor4ub((byte) (i_227_ >> 16), (byte) (i_227_ >> 8), (byte) i_227_, (byte) (i_227_ >> 24));
		if (aClass118_Sub3_Sub1_9022.aBool11374 && !aBool9024 && i_225_ >= aClass118_Sub3_Sub1_9022.anInt11379 && i_224_ >= aClass118_Sub3_Sub1_9022.anInt11375) {
			float f = (aClass118_Sub3_Sub1_9022.aFloat11376 * (float) i_225_ / (float) aClass118_Sub3_Sub1_9022.anInt11379);
			float f_231_ = (aClass118_Sub3_Sub1_9022.aFloat11377 * (float) i_224_ / (float) aClass118_Sub3_Sub1_9022.anInt11375);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f);
			OpenGL.glVertex2i(i, i_223_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_230_);
			OpenGL.glTexCoord2f(f_231_, 0.0F);
			OpenGL.glVertex2i(i_229_, i_230_);
			OpenGL.glTexCoord2f(f_231_, f);
			OpenGL.glVertex2i(i_229_, i_223_);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) anInt9025, (float) anInt9019, 0.0F);
			int i_232_ = method42();
			int i_233_ = method2410();
			int i_234_ = i_223_ + aClass118_Sub3_Sub1_9022.anInt11379;
			OpenGL.glBegin(7);
			int i_235_ = i_223_;
			for (/**/; i_234_ <= i_230_; i_234_ += i_233_) {
				int i_236_ = i + aClass118_Sub3_Sub1_9022.anInt11375;
				int i_237_ = i;
				while (i_236_ <= i_229_) {
					OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_237_, i_235_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_237_, i_234_);
					OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
					OpenGL.glVertex2i(i_236_, i_234_);
					OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_236_, i_235_);
					i_236_ += i_232_;
					i_237_ += i_232_;
				}
				if (i_237_ < i_229_) {
					float f = (aClass118_Sub3_Sub1_9022.aFloat11377 * (float) (i_229_ - i_237_) / (float) aClass118_Sub3_Sub1_9022.anInt11375);
					OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_237_, i_235_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_237_, i_234_);
					OpenGL.glTexCoord2f(f, 0.0F);
					OpenGL.glVertex2i(i_229_, i_234_);
					OpenGL.glTexCoord2f(f, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_229_, i_235_);
				}
				i_235_ += i_233_;
			}
			if (i_235_ < i_230_) {
				float f = (aClass118_Sub3_Sub1_9022.aFloat11376 * (float) (aClass118_Sub3_Sub1_9022.anInt11379 - (i_230_ - i_235_)) / (float) aClass118_Sub3_Sub1_9022.anInt11379);
				int i_238_ = i + aClass118_Sub3_Sub1_9022.anInt11375;
				int i_239_ = i;
				while (i_238_ <= i_229_) {
					OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_239_, i_235_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_239_, i_230_);
					OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, f);
					OpenGL.glVertex2i(i_238_, i_230_);
					OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_238_, i_235_);
					i_238_ += i_232_;
					i_239_ += i_232_;
				}
				if (i_239_ < i_229_) {
					float f_240_ = (aClass118_Sub3_Sub1_9022.aFloat11377 * (float) (i_229_ - i_239_) / (float) aClass118_Sub3_Sub1_9022.anInt11375);
					OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_239_, i_235_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_239_, i_230_);
					OpenGL.glTexCoord2f(f_240_, f);
					OpenGL.glVertex2i(i_229_, i_230_);
					OpenGL.glTexCoord2f(f_240_, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_229_, i_235_);
				}
			}
			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}
	}

	public void method2456(int i, int i_241_, int i_242_, int i_243_, int i_244_, int i_245_, int i_246_) {
		int i_247_ = i + i_242_;
		int i_248_ = i_241_ + i_243_;
		aClass118_Sub3_Sub1_9022.method2035(false);
		aClass180_Sub3_9020.method15429();
		aClass180_Sub3_9020.method15401(aClass118_Sub3_Sub1_9022);
		aClass180_Sub3_9020.method15525(i_246_);
		aClass180_Sub3_9020.method15402(i_244_);
		OpenGL.glColor4ub((byte) (i_245_ >> 16), (byte) (i_245_ >> 8), (byte) i_245_, (byte) (i_245_ >> 24));
		if (aClass118_Sub3_Sub1_9022.aBool11374 && !aBool9024 && i_243_ >= aClass118_Sub3_Sub1_9022.anInt11379 && i_242_ >= aClass118_Sub3_Sub1_9022.anInt11375) {
			float f = (aClass118_Sub3_Sub1_9022.aFloat11376 * (float) i_243_ / (float) aClass118_Sub3_Sub1_9022.anInt11379);
			float f_249_ = (aClass118_Sub3_Sub1_9022.aFloat11377 * (float) i_242_ / (float) aClass118_Sub3_Sub1_9022.anInt11375);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f);
			OpenGL.glVertex2i(i, i_241_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_248_);
			OpenGL.glTexCoord2f(f_249_, 0.0F);
			OpenGL.glVertex2i(i_247_, i_248_);
			OpenGL.glTexCoord2f(f_249_, f);
			OpenGL.glVertex2i(i_247_, i_241_);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) anInt9025, (float) anInt9019, 0.0F);
			int i_250_ = method42();
			int i_251_ = method2410();
			int i_252_ = i_241_ + aClass118_Sub3_Sub1_9022.anInt11379;
			OpenGL.glBegin(7);
			int i_253_ = i_241_;
			for (/**/; i_252_ <= i_248_; i_252_ += i_251_) {
				int i_254_ = i + aClass118_Sub3_Sub1_9022.anInt11375;
				int i_255_ = i;
				while (i_254_ <= i_247_) {
					OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_255_, i_253_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_255_, i_252_);
					OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
					OpenGL.glVertex2i(i_254_, i_252_);
					OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_254_, i_253_);
					i_254_ += i_250_;
					i_255_ += i_250_;
				}
				if (i_255_ < i_247_) {
					float f = (aClass118_Sub3_Sub1_9022.aFloat11377 * (float) (i_247_ - i_255_) / (float) aClass118_Sub3_Sub1_9022.anInt11375);
					OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_255_, i_253_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_255_, i_252_);
					OpenGL.glTexCoord2f(f, 0.0F);
					OpenGL.glVertex2i(i_247_, i_252_);
					OpenGL.glTexCoord2f(f, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_247_, i_253_);
				}
				i_253_ += i_251_;
			}
			if (i_253_ < i_248_) {
				float f = (aClass118_Sub3_Sub1_9022.aFloat11376 * (float) (aClass118_Sub3_Sub1_9022.anInt11379 - (i_248_ - i_253_)) / (float) aClass118_Sub3_Sub1_9022.anInt11379);
				int i_256_ = i + aClass118_Sub3_Sub1_9022.anInt11375;
				int i_257_ = i;
				while (i_256_ <= i_247_) {
					OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_257_, i_253_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_257_, i_248_);
					OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, f);
					OpenGL.glVertex2i(i_256_, i_248_);
					OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_256_, i_253_);
					i_256_ += i_250_;
					i_257_ += i_250_;
				}
				if (i_257_ < i_247_) {
					float f_258_ = (aClass118_Sub3_Sub1_9022.aFloat11377 * (float) (i_247_ - i_257_) / (float) aClass118_Sub3_Sub1_9022.anInt11375);
					OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_257_, i_253_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_257_, i_248_);
					OpenGL.glTexCoord2f(f_258_, f);
					OpenGL.glVertex2i(i_247_, i_248_);
					OpenGL.glTexCoord2f(f_258_, aClass118_Sub3_Sub1_9022.aFloat11376);
					OpenGL.glVertex2i(i_247_, i_253_);
				}
			}
			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}
	}

	void method2457(float f, float f_259_, float f_260_, float f_261_, float f_262_, float f_263_, int i, int i_264_, int i_265_, int i_266_) {
		if (aBool9024) {
			float f_267_ = (float) method42();
			float f_268_ = (float) method2410();
			float f_269_ = (f_260_ - f) / f_267_;
			float f_270_ = (f_261_ - f_259_) / f_267_;
			float f_271_ = (f_262_ - f) / f_268_;
			float f_272_ = (f_263_ - f_259_) / f_268_;
			float f_273_ = f_271_ * (float) anInt9019;
			float f_274_ = f_272_ * (float) anInt9019;
			float f_275_ = f_269_ * (float) anInt9025;
			float f_276_ = f_270_ * (float) anInt9025;
			float f_277_ = -f_269_ * (float) anInt9027;
			float f_278_ = -f_270_ * (float) anInt9027;
			float f_279_ = -f_271_ * (float) anInt9026;
			float f_280_ = -f_272_ * (float) anInt9026;
			f = f + f_275_ + f_273_;
			f_259_ = f_259_ + f_276_ + f_274_;
			f_260_ = f_260_ + f_277_ + f_273_;
			f_261_ = f_261_ + f_278_ + f_274_;
			f_262_ = f_262_ + f_275_ + f_279_;
			f_263_ = f_263_ + f_276_ + f_280_;
		}
		float f_281_ = f_262_ + (f_260_ - f);
		float f_282_ = f_261_ + (f_263_ - f_259_);
		aClass118_Sub3_Sub1_9022.method2035((i_266_ & 0x1) != 0);
		aClass180_Sub3_9020.method15429();
		aClass180_Sub3_9020.method15401(aClass118_Sub3_Sub1_9022);
		aClass180_Sub3_9020.method15525(i_265_);
		aClass180_Sub3_9020.method15402(i);
		OpenGL.glColor4ub((byte) (i_264_ >> 16), (byte) (i_264_ >> 8), (byte) i_264_, (byte) (i_264_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
		OpenGL.glVertex2f(f, f_259_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_262_, f_263_);
		OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
		OpenGL.glVertex2f(f_281_, f_282_);
		OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
		OpenGL.glVertex2f(f_260_, f_261_);
		OpenGL.glEnd();
	}

	void method2408(float f, float f_283_, float f_284_, float f_285_, float f_286_, float f_287_, int i, int i_288_, int i_289_, int i_290_) {
		if (aBool9024) {
			float f_291_ = (float) method42();
			float f_292_ = (float) method2410();
			float f_293_ = (f_284_ - f) / f_291_;
			float f_294_ = (f_285_ - f_283_) / f_291_;
			float f_295_ = (f_286_ - f) / f_292_;
			float f_296_ = (f_287_ - f_283_) / f_292_;
			float f_297_ = f_295_ * (float) anInt9019;
			float f_298_ = f_296_ * (float) anInt9019;
			float f_299_ = f_293_ * (float) anInt9025;
			float f_300_ = f_294_ * (float) anInt9025;
			float f_301_ = -f_293_ * (float) anInt9027;
			float f_302_ = -f_294_ * (float) anInt9027;
			float f_303_ = -f_295_ * (float) anInt9026;
			float f_304_ = -f_296_ * (float) anInt9026;
			f = f + f_299_ + f_297_;
			f_283_ = f_283_ + f_300_ + f_298_;
			f_284_ = f_284_ + f_301_ + f_297_;
			f_285_ = f_285_ + f_302_ + f_298_;
			f_286_ = f_286_ + f_299_ + f_303_;
			f_287_ = f_287_ + f_300_ + f_304_;
		}
		float f_305_ = f_286_ + (f_284_ - f);
		float f_306_ = f_285_ + (f_287_ - f_283_);
		aClass118_Sub3_Sub1_9022.method2035((i_290_ & 0x1) != 0);
		aClass180_Sub3_9020.method15429();
		aClass180_Sub3_9020.method15401(aClass118_Sub3_Sub1_9022);
		aClass180_Sub3_9020.method15525(i_289_);
		aClass180_Sub3_9020.method15402(i);
		OpenGL.glColor4ub((byte) (i_288_ >> 16), (byte) (i_288_ >> 8), (byte) i_288_, (byte) (i_288_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
		OpenGL.glVertex2f(f, f_283_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_286_, f_287_);
		OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
		OpenGL.glVertex2f(f_305_, f_306_);
		OpenGL.glTexCoord2f(aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
		OpenGL.glVertex2f(f_284_, f_285_);
		OpenGL.glEnd();
	}

	void method2449(float f, float f_307_, float f_308_, float f_309_, float f_310_, float f_311_, int i, Class142 class142, int i_312_, int i_313_) {
		Class118_Sub3_Sub1 class118_sub3_sub1 = ((Class142_Sub3) class142).aClass118_Sub3_Sub1_9382;
		if (aBool9024) {
			float f_314_ = (float) method42();
			float f_315_ = (float) method2410();
			float f_316_ = (f_308_ - f) / f_314_;
			float f_317_ = (f_309_ - f_307_) / f_314_;
			float f_318_ = (f_310_ - f) / f_315_;
			float f_319_ = (f_311_ - f_307_) / f_315_;
			float f_320_ = f_318_ * (float) anInt9019;
			float f_321_ = f_319_ * (float) anInt9019;
			float f_322_ = f_316_ * (float) anInt9025;
			float f_323_ = f_317_ * (float) anInt9025;
			float f_324_ = -f_316_ * (float) anInt9027;
			float f_325_ = -f_317_ * (float) anInt9027;
			float f_326_ = -f_318_ * (float) anInt9026;
			float f_327_ = -f_319_ * (float) anInt9026;
			f = f + f_322_ + f_320_;
			f_307_ = f_307_ + f_323_ + f_321_;
			f_308_ = f_308_ + f_324_ + f_320_;
			f_309_ = f_309_ + f_325_ + f_321_;
			f_310_ = f_310_ + f_322_ + f_326_;
			f_311_ = f_311_ + f_323_ + f_327_;
		}
		float f_328_ = f_310_ + (f_308_ - f);
		float f_329_ = f_309_ + (f_311_ - f_307_);
		aClass118_Sub3_Sub1_9022.method2035((i & 0x1) != 0);
		aClass180_Sub3_9020.method15429();
		aClass180_Sub3_9020.method15401(aClass118_Sub3_Sub1_9022);
		aClass180_Sub3_9020.method15402(1);
		aClass180_Sub3_9020.method15400(1);
		aClass180_Sub3_9020.method15401(class118_sub3_sub1);
		aClass180_Sub3_9020.method15403(7681, 8448);
		aClass180_Sub3_9020.method15404(0, 34168, 768);
		aClass180_Sub3_9020.method15525(1);
		float f_330_ = (class118_sub3_sub1.aFloat11377 / (float) class118_sub3_sub1.anInt11375);
		float f_331_ = (class118_sub3_sub1.aFloat11376 / (float) class118_sub3_sub1.anInt11379);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, aClass118_Sub3_Sub1_9022.aFloat11376);
		OpenGL.glMultiTexCoord2f(33985, f_330_ * (f - (float) i_312_), (class118_sub3_sub1.aFloat11376 - f_331_ * (f_307_ - (float) i_313_)));
		OpenGL.glVertex2f(f, f_307_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_330_ * (f_310_ - (float) i_312_), (class118_sub3_sub1.aFloat11376 - f_331_ * (f_311_ - (float) i_313_)));
		OpenGL.glVertex2f(f_310_, f_311_);
		OpenGL.glMultiTexCoord2f(33984, aClass118_Sub3_Sub1_9022.aFloat11377, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_330_ * (f_328_ - (float) i_312_), (class118_sub3_sub1.aFloat11376 - f_331_ * (f_329_ - (float) i_313_)));
		OpenGL.glVertex2f(f_328_, f_329_);
		OpenGL.glMultiTexCoord2f(33984, aClass118_Sub3_Sub1_9022.aFloat11377, aClass118_Sub3_Sub1_9022.aFloat11376);
		OpenGL.glMultiTexCoord2f(33985, f_330_ * (f_308_ - (float) i_312_), (class118_sub3_sub1.aFloat11376 - f_331_ * (f_309_ - (float) i_313_)));
		OpenGL.glVertex2f(f_308_, f_309_);
		OpenGL.glEnd();
		aClass180_Sub3_9020.method15404(0, 5890, 768);
		aClass180_Sub3_9020.method15402(0);
		aClass180_Sub3_9020.method15401(null);
		aClass180_Sub3_9020.method15400(0);
	}

	public int method2414() {
		return aClass118_Sub3_Sub1_9022.anInt11379;
	}

	public int method2461() {
		return aClass118_Sub3_Sub1_9022.anInt11379;
	}

	void method14530(int i, int i_332_, int i_333_, int i_334_, int i_335_, int i_336_, boolean bool) {
		if (aClass180_Sub3_9020.aBool9814 && !bool) {
			int[] is = aClass180_Sub3_9020.method3113(i_335_, i_336_, i_333_, i_334_);
			if (is != null) {
				for (int i_337_ = 0; i_337_ < is.length; i_337_++)
					is[i_337_] |= ~0xffffff;
				method2459(i, i_332_, i_333_, i_334_, is, 0, i_333_);
			}
		} else
			aClass118_Sub3_Sub1_9022.method14453(i, i_332_, i_333_, i_334_, i_335_, i_336_);
	}

	public void method2436(int i, int i_338_, int i_339_) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		aClass118_Sub3_Sub1_9021 = Class118_Sub3_Sub1.method17949(aClass180_Sub3_9020, i, i_338_, (aClass118_Sub3_Sub1_9022.anInt11375), (aClass118_Sub3_Sub1_9022.anInt11379));
		anInt9023 = i_339_;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	void method14531(int i, int i_340_, int i_341_, int i_342_, int i_343_, int i_344_, boolean bool) {
		if (aClass180_Sub3_9020.aBool9814 && !bool) {
			int[] is = aClass180_Sub3_9020.method3113(i_343_, i_344_, i_341_, i_342_);
			if (is != null) {
				for (int i_345_ = 0; i_345_ < is.length; i_345_++)
					is[i_345_] |= ~0xffffff;
				method2459(i, i_340_, i_341_, i_342_, is, 0, i_341_);
			}
		} else
			aClass118_Sub3_Sub1_9022.method14453(i, i_340_, i_341_, i_342_, i_343_, i_344_);
	}

	public void method2482(int[] is) {
		is[0] = anInt9025;
		is[1] = anInt9019;
		is[2] = anInt9027;
		is[3] = anInt9026;
	}

	void method14532() {
		aClass180_Sub3_9020.method15400(1);
		aClass180_Sub3_9020.method15401(null);
		aClass180_Sub3_9020.method15403(8448, 8448);
		aClass180_Sub3_9020.method15404(1, 34168, 768);
		aClass180_Sub3_9020.method15405(0, 5890, 770);
		aClass180_Sub3_9020.method15400(0);
		aClass180_Sub3_9020.method15404(1, 34168, 768);
	}

	void method14533() {
		aClass180_Sub3_9020.method15400(1);
		aClass180_Sub3_9020.method15401(null);
		aClass180_Sub3_9020.method15403(8448, 8448);
		aClass180_Sub3_9020.method15404(1, 34168, 768);
		aClass180_Sub3_9020.method15405(0, 5890, 770);
		aClass180_Sub3_9020.method15400(0);
		aClass180_Sub3_9020.method15404(1, 34168, 768);
	}

	public Interface21 method2454() {
		return aClass118_Sub3_Sub1_9022.method14459(0);
	}

	void method14534() {
		aClass180_Sub3_9020.method15400(1);
		aClass180_Sub3_9020.method15401(null);
		aClass180_Sub3_9020.method15403(8448, 8448);
		aClass180_Sub3_9020.method15404(1, 34168, 768);
		aClass180_Sub3_9020.method15405(0, 5890, 770);
		aClass180_Sub3_9020.method15400(0);
		aClass180_Sub3_9020.method15404(1, 34168, 768);
	}

	void method14535() {
		aClass180_Sub3_9020.method15400(1);
		aClass180_Sub3_9020.method15401(null);
		aClass180_Sub3_9020.method15403(8448, 8448);
		aClass180_Sub3_9020.method15404(1, 34168, 768);
		aClass180_Sub3_9020.method15405(0, 5890, 770);
		aClass180_Sub3_9020.method15400(0);
		aClass180_Sub3_9020.method15404(1, 34168, 768);
	}
}
