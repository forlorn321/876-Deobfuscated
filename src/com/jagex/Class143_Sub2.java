/* Class143_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class143_Sub2 extends NativeSprite {
	int anInt9033;
	int anInt9034 = 0;
	Class167_Sub2 aClass167_Sub2_9035;
	Class124_Sub1_Sub1 aClass124_Sub1_Sub1_9036;
	boolean aBool9037 = false;
	Class124_Sub1_Sub1 aClass124_Sub1_Sub1_9038;
	int anInt9039;
	int anInt9040;
	int anInt9041;

	void method1749(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		aClass124_Sub1_Sub1_9038.method1609((i_6_ & 0x1) != 0);
		aClass167_Sub2_9035.method8614();
		aClass167_Sub2_9035.method8567(i_5_);
		OpenGL.glColor4ub((byte) (i_4_ >> 16), (byte) (i_4_ >> 8), (byte) i_4_, (byte) (i_4_ >> 24));
		if (aBool9037) {
			float f = (float) i_1_ / (float) method12();
			float f_7_ = (float) i_2_ / (float) method1785();
			float f_8_ = (float) i + (float) anInt9039 * f;
			float f_9_ = (float) i_0_ + (float) anInt9033 * f_7_;
			float f_10_ = f_8_ + (float) aClass124_Sub1_Sub1_9038.anInt11361 * f;
			float f_11_ = f_9_ + (float) aClass124_Sub1_Sub1_9038.anInt11365 * f_7_;
			if (aClass124_Sub1_Sub1_9036 == null) {
				aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
				aClass167_Sub2_9035.method8557(i_3_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
				OpenGL.glVertex2f(f_8_, f_9_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_8_, f_11_);
				OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
				OpenGL.glVertex2f(f_10_, f_11_);
				OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
				OpenGL.glVertex2f(f_10_, f_9_);
				OpenGL.glEnd();
			} else {
				method8478(i_3_);
				aClass124_Sub1_Sub1_9036.method1609(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
				OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
				OpenGL.glVertex2f(f_8_, f_9_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_8_, f_11_);
				OpenGL.glMultiTexCoord2f(33985, aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
				OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
				OpenGL.glVertex2f(f_10_, f_11_);
				OpenGL.glMultiTexCoord2f(33985, aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
				OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
				OpenGL.glVertex2f(f_10_, f_9_);
				OpenGL.glEnd();
				method8479();
			}
		} else if (aClass124_Sub1_Sub1_9036 == null) {
			aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
			aClass167_Sub2_9035.method8557(i_3_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i, i_0_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_0_ + i_2_);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
			OpenGL.glVertex2i(i + i_1_, i_0_ + i_2_);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i + i_1_, i_0_);
			OpenGL.glEnd();
		} else {
			method8478(i_3_);
			aClass124_Sub1_Sub1_9036.method1609(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i, i_0_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_0_ + i_2_);
			OpenGL.glMultiTexCoord2f(33985, aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
			OpenGL.glVertex2i(i + i_1_, i_0_ + i_2_);
			OpenGL.glMultiTexCoord2f(33985, aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i + i_1_, i_0_);
			OpenGL.glEnd();
			method8479();
		}
	}

	public void method1773(int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_) {
		int i_18_ = i + i_13_;
		int i_19_ = i_12_ + i_14_;
		aClass124_Sub1_Sub1_9038.method1609(false);
		aClass167_Sub2_9035.method8614();
		aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
		aClass167_Sub2_9035.method8567(i_17_);
		aClass167_Sub2_9035.method8557(i_15_);
		OpenGL.glColor4ub((byte) (i_16_ >> 16), (byte) (i_16_ >> 8), (byte) i_16_, (byte) (i_16_ >> 24));
		if (aClass124_Sub1_Sub1_9038.aBool11364 && !aBool9037 && i_14_ >= aClass124_Sub1_Sub1_9038.anInt11365 && i_13_ >= aClass124_Sub1_Sub1_9038.anInt11361) {
			float f = (aClass124_Sub1_Sub1_9038.aFloat11362 * (float) i_14_ / (float) aClass124_Sub1_Sub1_9038.anInt11365);
			float f_20_ = (aClass124_Sub1_Sub1_9038.aFloat11363 * (float) i_13_ / (float) aClass124_Sub1_Sub1_9038.anInt11361);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f);
			OpenGL.glVertex2i(i, i_12_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_19_);
			OpenGL.glTexCoord2f(f_20_, 0.0F);
			OpenGL.glVertex2i(i_18_, i_19_);
			OpenGL.glTexCoord2f(f_20_, f);
			OpenGL.glVertex2i(i_18_, i_12_);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) anInt9039, (float) anInt9033, 0.0F);
			int i_21_ = method12();
			int i_22_ = method1785();
			int i_23_ = i_12_ + aClass124_Sub1_Sub1_9038.anInt11365;
			OpenGL.glBegin(7);
			int i_24_ = i_12_;
			for (/**/; i_23_ <= i_19_; i_23_ += i_22_) {
				int i_25_ = i + aClass124_Sub1_Sub1_9038.anInt11361;
				int i_26_ = i;
				while (i_25_ <= i_18_) {
					OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_26_, i_24_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_26_, i_23_);
					OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
					OpenGL.glVertex2i(i_25_, i_23_);
					OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_25_, i_24_);
					i_25_ += i_21_;
					i_26_ += i_21_;
				}
				if (i_26_ < i_18_) {
					float f = (aClass124_Sub1_Sub1_9038.aFloat11363 * (float) (i_18_ - i_26_) / (float) aClass124_Sub1_Sub1_9038.anInt11361);
					OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_26_, i_24_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_26_, i_23_);
					OpenGL.glTexCoord2f(f, 0.0F);
					OpenGL.glVertex2i(i_18_, i_23_);
					OpenGL.glTexCoord2f(f, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_18_, i_24_);
				}
				i_24_ += i_22_;
			}
			if (i_24_ < i_19_) {
				float f = (aClass124_Sub1_Sub1_9038.aFloat11362 * (float) (aClass124_Sub1_Sub1_9038.anInt11365 - (i_19_ - i_24_)) / (float) aClass124_Sub1_Sub1_9038.anInt11365);
				int i_27_ = i + aClass124_Sub1_Sub1_9038.anInt11361;
				int i_28_ = i;
				while (i_27_ <= i_18_) {
					OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_28_, i_24_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_28_, i_19_);
					OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, f);
					OpenGL.glVertex2i(i_27_, i_19_);
					OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_27_, i_24_);
					i_27_ += i_21_;
					i_28_ += i_21_;
				}
				if (i_28_ < i_18_) {
					float f_29_ = (aClass124_Sub1_Sub1_9038.aFloat11363 * (float) (i_18_ - i_28_) / (float) aClass124_Sub1_Sub1_9038.anInt11361);
					OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_28_, i_24_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_28_, i_19_);
					OpenGL.glTexCoord2f(f_29_, f);
					OpenGL.glVertex2i(i_18_, i_19_);
					OpenGL.glTexCoord2f(f_29_, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_18_, i_24_);
				}
			}
			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}
	}

	Class143_Sub2(Class167_Sub2 class167_sub2, int i, int i_30_, int[] is, int i_31_, int i_32_) {
		anInt9033 = 0;
		anInt9039 = 0;
		anInt9040 = 0;
		anInt9041 = 0;
		aClass167_Sub2_9035 = class167_sub2;
		aClass124_Sub1_Sub1_9038 = Class124_Sub1_Sub1.method10527(class167_sub2, i, i_30_, false, is, i_32_, i_31_);
	}

	public void method1718(int i, int i_33_, int i_34_, int i_35_) {
		anInt9039 = i;
		anInt9033 = i_33_;
		anInt9041 = i_34_;
		anInt9040 = i_35_;
		aBool9037 = (anInt9039 != 0 || anInt9033 != 0 || anInt9041 != 0 || anInt9040 != 0);
	}

	public void method1719(int[] is) {
		is[0] = anInt9039;
		is[1] = anInt9033;
		is[2] = anInt9041;
		is[3] = anInt9040;
	}

	public int method1720() {
		return aClass124_Sub1_Sub1_9038.anInt11361;
	}

	public void method1754(int i, int i_36_, Class161 class161, int i_37_, int i_38_) {
		Class161_Sub3 class161_sub3 = (Class161_Sub3) class161;
		Class124_Sub1_Sub1 class124_sub1_sub1 = class161_sub3.aClass124_Sub1_Sub1_9525;
		aClass124_Sub1_Sub1_9038.method1609(false);
		aClass167_Sub2_9035.method8614();
		aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
		aClass167_Sub2_9035.method8557(1);
		aClass167_Sub2_9035.method8556(1);
		aClass167_Sub2_9035.method8617(class124_sub1_sub1);
		aClass167_Sub2_9035.method8558(7681, 8448);
		aClass167_Sub2_9035.method8520(0, 34168, 768);
		aClass167_Sub2_9035.method8567(1);
		i += anInt9039;
		i_36_ += anInt9033;
		int i_39_ = i + aClass124_Sub1_Sub1_9038.anInt11361;
		int i_40_ = i_36_ + aClass124_Sub1_Sub1_9038.anInt11365;
		float f = (class124_sub1_sub1.aFloat11363 / (float) class124_sub1_sub1.anInt11361);
		float f_41_ = (class124_sub1_sub1.aFloat11362 / (float) class124_sub1_sub1.anInt11365);
		float f_42_ = (float) (i - i_37_) * f;
		float f_43_ = (float) (i_39_ - i_37_) * f;
		float f_44_ = class124_sub1_sub1.aFloat11362 - (float) (i_36_ - i_38_) * f_41_;
		float f_45_ = class124_sub1_sub1.aFloat11362 - (float) (i_40_ - i_38_) * f_41_;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glMultiTexCoord2f(33985, f_42_, f_44_);
		OpenGL.glVertex2i(i, i_36_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_42_, f_45_);
		OpenGL.glVertex2i(i, i_36_ + aClass124_Sub1_Sub1_9038.anInt11365);
		OpenGL.glMultiTexCoord2f(33984, aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_43_, f_45_);
		OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_36_ + aClass124_Sub1_Sub1_9038.anInt11365);
		OpenGL.glMultiTexCoord2f(33984, aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glMultiTexCoord2f(33985, f_43_, f_44_);
		OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_36_);
		OpenGL.glEnd();
		aClass167_Sub2_9035.method8520(0, 5890, 768);
		aClass167_Sub2_9035.method8557(0);
		aClass167_Sub2_9035.method8617(null);
		aClass167_Sub2_9035.method8556(0);
	}

	public int method1752() {
		return aClass124_Sub1_Sub1_9038.anInt11365;
	}

	public int method1785() {
		return aClass124_Sub1_Sub1_9038.anInt11365 + anInt9033 + anInt9040;
	}

	void method8476() {
		aClass167_Sub2_9035.method8556(1);
		aClass167_Sub2_9035.method8617(null);
		aClass167_Sub2_9035.method8558(8448, 8448);
		aClass167_Sub2_9035.method8520(1, 34168, 768);
		aClass167_Sub2_9035.method8560(0, 5890, 770);
		aClass167_Sub2_9035.method8556(0);
		aClass167_Sub2_9035.method8520(1, 34168, 768);
	}

	public void method1726(int i, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_) {
		method8477(i, i_46_, i_47_, i_48_, i_49_, i_50_, false);
	}

	void method8477(int i, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_, boolean bool) {
		if (aClass167_Sub2_9035.aBool9199 && !bool) {
			int[] is = aClass167_Sub2_9035.getPixelArea(i_54_, i_55_, i_52_, i_53_);
			if (is != null) {
				for (int i_56_ = 0; i_56_ < is.length; i_56_++)
					is[i_56_] |= ~0xffffff;
				method1783(i, i_51_, i_52_, i_53_, is, 0, i_52_);
			}
		} else
			aClass124_Sub1_Sub1_9038.method8400(i, i_51_, i_52_, i_53_, i_54_, i_55_);
	}

	public void method1727(int i, int i_57_, int i_58_) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		aClass124_Sub1_Sub1_9036 = Class124_Sub1_Sub1.method10529(aClass167_Sub2_9035, i, i_57_, (aClass124_Sub1_Sub1_9038.anInt11361), (aClass124_Sub1_Sub1_9038.anInt11365));
		anInt9034 = i_58_;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	public void method1783(int i, int i_59_, int i_60_, int i_61_, int[] is, int i_62_, int i_63_) {
		aClass124_Sub1_Sub1_9038.method8397(i, i_59_, i_60_, i_61_, is, i_62_, i_63_, true);
	}

	public void method1772(int i, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_) {
		int i_70_ = i + i_65_;
		int i_71_ = i_64_ + i_66_;
		aClass124_Sub1_Sub1_9038.method1609(false);
		aClass167_Sub2_9035.method8614();
		aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
		aClass167_Sub2_9035.method8567(i_69_);
		aClass167_Sub2_9035.method8557(i_67_);
		OpenGL.glColor4ub((byte) (i_68_ >> 16), (byte) (i_68_ >> 8), (byte) i_68_, (byte) (i_68_ >> 24));
		if (aClass124_Sub1_Sub1_9038.aBool11364 && !aBool9037 && i_66_ >= aClass124_Sub1_Sub1_9038.anInt11365 && i_65_ >= aClass124_Sub1_Sub1_9038.anInt11361) {
			float f = (aClass124_Sub1_Sub1_9038.aFloat11362 * (float) i_66_ / (float) aClass124_Sub1_Sub1_9038.anInt11365);
			float f_72_ = (aClass124_Sub1_Sub1_9038.aFloat11363 * (float) i_65_ / (float) aClass124_Sub1_Sub1_9038.anInt11361);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f);
			OpenGL.glVertex2i(i, i_64_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_71_);
			OpenGL.glTexCoord2f(f_72_, 0.0F);
			OpenGL.glVertex2i(i_70_, i_71_);
			OpenGL.glTexCoord2f(f_72_, f);
			OpenGL.glVertex2i(i_70_, i_64_);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) anInt9039, (float) anInt9033, 0.0F);
			int i_73_ = method12();
			int i_74_ = method1785();
			int i_75_ = i_64_ + aClass124_Sub1_Sub1_9038.anInt11365;
			OpenGL.glBegin(7);
			int i_76_ = i_64_;
			for (/**/; i_75_ <= i_71_; i_75_ += i_74_) {
				int i_77_ = i + aClass124_Sub1_Sub1_9038.anInt11361;
				int i_78_ = i;
				while (i_77_ <= i_70_) {
					OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_78_, i_76_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_78_, i_75_);
					OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
					OpenGL.glVertex2i(i_77_, i_75_);
					OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_77_, i_76_);
					i_77_ += i_73_;
					i_78_ += i_73_;
				}
				if (i_78_ < i_70_) {
					float f = (aClass124_Sub1_Sub1_9038.aFloat11363 * (float) (i_70_ - i_78_) / (float) aClass124_Sub1_Sub1_9038.anInt11361);
					OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_78_, i_76_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_78_, i_75_);
					OpenGL.glTexCoord2f(f, 0.0F);
					OpenGL.glVertex2i(i_70_, i_75_);
					OpenGL.glTexCoord2f(f, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_70_, i_76_);
				}
				i_76_ += i_74_;
			}
			if (i_76_ < i_71_) {
				float f = (aClass124_Sub1_Sub1_9038.aFloat11362 * (float) (aClass124_Sub1_Sub1_9038.anInt11365 - (i_71_ - i_76_)) / (float) aClass124_Sub1_Sub1_9038.anInt11365);
				int i_79_ = i + aClass124_Sub1_Sub1_9038.anInt11361;
				int i_80_ = i;
				while (i_79_ <= i_70_) {
					OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_80_, i_76_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_80_, i_71_);
					OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, f);
					OpenGL.glVertex2i(i_79_, i_71_);
					OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_79_, i_76_);
					i_79_ += i_73_;
					i_80_ += i_73_;
				}
				if (i_80_ < i_70_) {
					float f_81_ = (aClass124_Sub1_Sub1_9038.aFloat11363 * (float) (i_70_ - i_80_) / (float) aClass124_Sub1_Sub1_9038.anInt11361);
					OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_80_, i_76_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_80_, i_71_);
					OpenGL.glTexCoord2f(f_81_, f);
					OpenGL.glVertex2i(i_70_, i_71_);
					OpenGL.glTexCoord2f(f_81_, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_70_, i_76_);
				}
			}
			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}
	}

	void method8478(int i) {
		aClass167_Sub2_9035.method8556(1);
		aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
		aClass167_Sub2_9035.method8558(aClass167_Sub2_9035.method8510(i), 7681);
		aClass167_Sub2_9035.method8520(1, 34167, 768);
		aClass167_Sub2_9035.method8560(0, 34168, 770);
		aClass167_Sub2_9035.method8556(0);
		aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9036);
		aClass167_Sub2_9035.method8558(34479, 7681);
		aClass167_Sub2_9035.method8520(1, 34166, 768);
		if (anInt9034 == 0)
			aClass167_Sub2_9035.method8562(1.0F, 0.5F, 0.5F, 0.0F);
		else if (anInt9034 == 1)
			aClass167_Sub2_9035.method8562(0.5F, 1.0F, 0.5F, 0.0F);
		else if (anInt9034 == 2)
			aClass167_Sub2_9035.method8562(0.5F, 0.5F, 1.0F, 0.0F);
		else if (anInt9034 == 3)
			aClass167_Sub2_9035.method8562(128.5F, 128.5F, 128.5F, 0.0F);
	}

	void method8479() {
		aClass167_Sub2_9035.method8556(1);
		aClass167_Sub2_9035.method8617(null);
		aClass167_Sub2_9035.method8558(8448, 8448);
		aClass167_Sub2_9035.method8520(1, 34168, 768);
		aClass167_Sub2_9035.method8560(0, 5890, 770);
		aClass167_Sub2_9035.method8556(0);
		aClass167_Sub2_9035.method8520(1, 34168, 768);
	}

	public void method1729(int i, int i_82_, int i_83_, int i_84_, int i_85_) {
		aClass124_Sub1_Sub1_9038.method1609(false);
		aClass167_Sub2_9035.method8614();
		aClass167_Sub2_9035.method8567(i_85_);
		OpenGL.glColor4ub((byte) (i_84_ >> 16), (byte) (i_84_ >> 8), (byte) i_84_, (byte) (i_84_ >> 24));
		i += anInt9039;
		i_82_ += anInt9033;
		if (aClass124_Sub1_Sub1_9036 == null) {
			aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
			aClass167_Sub2_9035.method8557(i_83_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i, i_82_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_82_ + aClass124_Sub1_Sub1_9038.anInt11365);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
			OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_82_ + aClass124_Sub1_Sub1_9038.anInt11365);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_82_);
			OpenGL.glEnd();
		} else {
			method8478(i_83_);
			aClass124_Sub1_Sub1_9036.method1609(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i, i_82_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_82_ + aClass124_Sub1_Sub1_9038.anInt11365);
			OpenGL.glMultiTexCoord2f(33985, aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
			OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_82_ + aClass124_Sub1_Sub1_9038.anInt11365);
			OpenGL.glMultiTexCoord2f(33985, aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_82_);
			OpenGL.glEnd();
			method8479();
		}
	}

	public void method1737(int i, int i_86_, Class161 class161, int i_87_, int i_88_) {
		Class161_Sub3 class161_sub3 = (Class161_Sub3) class161;
		Class124_Sub1_Sub1 class124_sub1_sub1 = class161_sub3.aClass124_Sub1_Sub1_9525;
		aClass124_Sub1_Sub1_9038.method1609(false);
		aClass167_Sub2_9035.method8614();
		aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
		aClass167_Sub2_9035.method8557(1);
		aClass167_Sub2_9035.method8556(1);
		aClass167_Sub2_9035.method8617(class124_sub1_sub1);
		aClass167_Sub2_9035.method8558(7681, 8448);
		aClass167_Sub2_9035.method8520(0, 34168, 768);
		aClass167_Sub2_9035.method8567(1);
		i += anInt9039;
		i_86_ += anInt9033;
		int i_89_ = i + aClass124_Sub1_Sub1_9038.anInt11361;
		int i_90_ = i_86_ + aClass124_Sub1_Sub1_9038.anInt11365;
		float f = (class124_sub1_sub1.aFloat11363 / (float) class124_sub1_sub1.anInt11361);
		float f_91_ = (class124_sub1_sub1.aFloat11362 / (float) class124_sub1_sub1.anInt11365);
		float f_92_ = (float) (i - i_87_) * f;
		float f_93_ = (float) (i_89_ - i_87_) * f;
		float f_94_ = class124_sub1_sub1.aFloat11362 - (float) (i_86_ - i_88_) * f_91_;
		float f_95_ = class124_sub1_sub1.aFloat11362 - (float) (i_90_ - i_88_) * f_91_;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glMultiTexCoord2f(33985, f_92_, f_94_);
		OpenGL.glVertex2i(i, i_86_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_92_, f_95_);
		OpenGL.glVertex2i(i, i_86_ + aClass124_Sub1_Sub1_9038.anInt11365);
		OpenGL.glMultiTexCoord2f(33984, aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_93_, f_95_);
		OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_86_ + aClass124_Sub1_Sub1_9038.anInt11365);
		OpenGL.glMultiTexCoord2f(33984, aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glMultiTexCoord2f(33985, f_93_, f_94_);
		OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_86_);
		OpenGL.glEnd();
		aClass167_Sub2_9035.method8520(0, 5890, 768);
		aClass167_Sub2_9035.method8557(0);
		aClass167_Sub2_9035.method8617(null);
		aClass167_Sub2_9035.method8556(0);
	}

	public int method1767() {
		return aClass124_Sub1_Sub1_9038.anInt11361;
	}

	public void method1746(int i, int i_96_, int i_97_, int i_98_, int[] is, int[] is_99_, int i_100_, int i_101_) {
		aClass124_Sub1_Sub1_9038.method8396(i, i_96_, i_97_, i_98_, is, is_99_, i_100_);
	}

	public void method1734(int i, int i_102_, int i_103_, int i_104_, int i_105_, int i_106_, int i_107_) {
		int i_108_ = i + i_103_;
		int i_109_ = i_102_ + i_104_;
		aClass124_Sub1_Sub1_9038.method1609(false);
		aClass167_Sub2_9035.method8614();
		aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
		aClass167_Sub2_9035.method8567(i_107_);
		aClass167_Sub2_9035.method8557(i_105_);
		OpenGL.glColor4ub((byte) (i_106_ >> 16), (byte) (i_106_ >> 8), (byte) i_106_, (byte) (i_106_ >> 24));
		if (aClass124_Sub1_Sub1_9038.aBool11364 && !aBool9037 && i_104_ >= aClass124_Sub1_Sub1_9038.anInt11365 && i_103_ >= aClass124_Sub1_Sub1_9038.anInt11361) {
			float f = (aClass124_Sub1_Sub1_9038.aFloat11362 * (float) i_104_ / (float) aClass124_Sub1_Sub1_9038.anInt11365);
			float f_110_ = (aClass124_Sub1_Sub1_9038.aFloat11363 * (float) i_103_ / (float) aClass124_Sub1_Sub1_9038.anInt11361);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f);
			OpenGL.glVertex2i(i, i_102_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_109_);
			OpenGL.glTexCoord2f(f_110_, 0.0F);
			OpenGL.glVertex2i(i_108_, i_109_);
			OpenGL.glTexCoord2f(f_110_, f);
			OpenGL.glVertex2i(i_108_, i_102_);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) anInt9039, (float) anInt9033, 0.0F);
			int i_111_ = method12();
			int i_112_ = method1785();
			int i_113_ = i_102_ + aClass124_Sub1_Sub1_9038.anInt11365;
			OpenGL.glBegin(7);
			int i_114_ = i_102_;
			for (/**/; i_113_ <= i_109_; i_113_ += i_112_) {
				int i_115_ = i + aClass124_Sub1_Sub1_9038.anInt11361;
				int i_116_ = i;
				while (i_115_ <= i_108_) {
					OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_116_, i_114_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_116_, i_113_);
					OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
					OpenGL.glVertex2i(i_115_, i_113_);
					OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_115_, i_114_);
					i_115_ += i_111_;
					i_116_ += i_111_;
				}
				if (i_116_ < i_108_) {
					float f = (aClass124_Sub1_Sub1_9038.aFloat11363 * (float) (i_108_ - i_116_) / (float) aClass124_Sub1_Sub1_9038.anInt11361);
					OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_116_, i_114_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_116_, i_113_);
					OpenGL.glTexCoord2f(f, 0.0F);
					OpenGL.glVertex2i(i_108_, i_113_);
					OpenGL.glTexCoord2f(f, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_108_, i_114_);
				}
				i_114_ += i_112_;
			}
			if (i_114_ < i_109_) {
				float f = (aClass124_Sub1_Sub1_9038.aFloat11362 * (float) (aClass124_Sub1_Sub1_9038.anInt11365 - (i_109_ - i_114_)) / (float) aClass124_Sub1_Sub1_9038.anInt11365);
				int i_117_ = i + aClass124_Sub1_Sub1_9038.anInt11361;
				int i_118_ = i;
				while (i_117_ <= i_108_) {
					OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_118_, i_114_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_118_, i_109_);
					OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, f);
					OpenGL.glVertex2i(i_117_, i_109_);
					OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_117_, i_114_);
					i_117_ += i_111_;
					i_118_ += i_111_;
				}
				if (i_118_ < i_108_) {
					float f_119_ = (aClass124_Sub1_Sub1_9038.aFloat11363 * (float) (i_108_ - i_118_) / (float) aClass124_Sub1_Sub1_9038.anInt11361);
					OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_118_, i_114_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_118_, i_109_);
					OpenGL.glTexCoord2f(f_119_, f);
					OpenGL.glVertex2i(i_108_, i_109_);
					OpenGL.glTexCoord2f(f_119_, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_108_, i_114_);
				}
			}
			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}
	}

	Class143_Sub2(Class167_Sub2 class167_sub2, int i, int i_120_, boolean bool) {
		anInt9033 = 0;
		anInt9039 = 0;
		anInt9040 = 0;
		anInt9041 = 0;
		aClass167_Sub2_9035 = class167_sub2;
		aClass124_Sub1_Sub1_9038 = Class124_Sub1_Sub1.method10530(class167_sub2, (bool ? Class155.aClass155_1722 : Class155.aClass155_1724), Class171.aClass171_1905, i, i_120_);
	}

	public void method1743(int i, int i_121_, int i_122_, int i_123_, int[] is, int i_124_, int i_125_) {
		aClass124_Sub1_Sub1_9038.method8397(i, i_121_, i_122_, i_123_, is, i_124_, i_125_, true);
	}

	public void method1757(int i, int i_126_, int i_127_, int i_128_, int[] is, int i_129_, int i_130_) {
		aClass124_Sub1_Sub1_9038.method8397(i, i_126_, i_127_, i_128_, is, i_129_, i_130_, true);
	}

	public void method1730(int i, int i_131_, Class161 class161, int i_132_, int i_133_) {
		Class161_Sub3 class161_sub3 = (Class161_Sub3) class161;
		Class124_Sub1_Sub1 class124_sub1_sub1 = class161_sub3.aClass124_Sub1_Sub1_9525;
		aClass124_Sub1_Sub1_9038.method1609(false);
		aClass167_Sub2_9035.method8614();
		aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
		aClass167_Sub2_9035.method8557(1);
		aClass167_Sub2_9035.method8556(1);
		aClass167_Sub2_9035.method8617(class124_sub1_sub1);
		aClass167_Sub2_9035.method8558(7681, 8448);
		aClass167_Sub2_9035.method8520(0, 34168, 768);
		aClass167_Sub2_9035.method8567(1);
		i += anInt9039;
		i_131_ += anInt9033;
		int i_134_ = i + aClass124_Sub1_Sub1_9038.anInt11361;
		int i_135_ = i_131_ + aClass124_Sub1_Sub1_9038.anInt11365;
		float f = (class124_sub1_sub1.aFloat11363 / (float) class124_sub1_sub1.anInt11361);
		float f_136_ = (class124_sub1_sub1.aFloat11362 / (float) class124_sub1_sub1.anInt11365);
		float f_137_ = (float) (i - i_132_) * f;
		float f_138_ = (float) (i_134_ - i_132_) * f;
		float f_139_ = (class124_sub1_sub1.aFloat11362 - (float) (i_131_ - i_133_) * f_136_);
		float f_140_ = (class124_sub1_sub1.aFloat11362 - (float) (i_135_ - i_133_) * f_136_);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glMultiTexCoord2f(33985, f_137_, f_139_);
		OpenGL.glVertex2i(i, i_131_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_137_, f_140_);
		OpenGL.glVertex2i(i, i_131_ + aClass124_Sub1_Sub1_9038.anInt11365);
		OpenGL.glMultiTexCoord2f(33984, aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_138_, f_140_);
		OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_131_ + aClass124_Sub1_Sub1_9038.anInt11365);
		OpenGL.glMultiTexCoord2f(33984, aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glMultiTexCoord2f(33985, f_138_, f_139_);
		OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_131_);
		OpenGL.glEnd();
		aClass167_Sub2_9035.method8520(0, 5890, 768);
		aClass167_Sub2_9035.method8557(0);
		aClass167_Sub2_9035.method8617(null);
		aClass167_Sub2_9035.method8556(0);
	}

	public void method1751(int i, int i_141_, int i_142_) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		aClass124_Sub1_Sub1_9036 = Class124_Sub1_Sub1.method10529(aClass167_Sub2_9035, i, i_141_, (aClass124_Sub1_Sub1_9038.anInt11361), (aClass124_Sub1_Sub1_9038.anInt11365));
		anInt9034 = i_142_;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	public void method1763(int i, int i_143_, int i_144_, int i_145_, int i_146_) {
		aClass124_Sub1_Sub1_9038.method1609(false);
		aClass167_Sub2_9035.method8614();
		aClass167_Sub2_9035.method8567(i_146_);
		OpenGL.glColor4ub((byte) (i_145_ >> 16), (byte) (i_145_ >> 8), (byte) i_145_, (byte) (i_145_ >> 24));
		i += anInt9039;
		i_143_ += anInt9033;
		if (aClass124_Sub1_Sub1_9036 == null) {
			aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
			aClass167_Sub2_9035.method8557(i_144_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i, i_143_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_143_ + aClass124_Sub1_Sub1_9038.anInt11365);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
			OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_143_ + aClass124_Sub1_Sub1_9038.anInt11365);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_143_);
			OpenGL.glEnd();
		} else {
			method8478(i_144_);
			aClass124_Sub1_Sub1_9036.method1609(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i, i_143_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_143_ + aClass124_Sub1_Sub1_9038.anInt11365);
			OpenGL.glMultiTexCoord2f(33985, aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
			OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_143_ + aClass124_Sub1_Sub1_9038.anInt11365);
			OpenGL.glMultiTexCoord2f(33985, aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_143_);
			OpenGL.glEnd();
			method8479();
		}
	}

	public void method1742(int i, int i_147_, int i_148_) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		aClass124_Sub1_Sub1_9036 = Class124_Sub1_Sub1.method10529(aClass167_Sub2_9035, i, i_147_, (aClass124_Sub1_Sub1_9038.anInt11361), (aClass124_Sub1_Sub1_9038.anInt11365));
		anInt9034 = i_148_;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	public void method1750(int i, int i_149_, int i_150_) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		aClass124_Sub1_Sub1_9036 = Class124_Sub1_Sub1.method10529(aClass167_Sub2_9035, i, i_149_, (aClass124_Sub1_Sub1_9038.anInt11361), (aClass124_Sub1_Sub1_9038.anInt11365));
		anInt9034 = i_150_;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	public Interface22 method1782() {
		return aClass124_Sub1_Sub1_9038.method8398(0);
	}

	public Interface22 method1779() {
		return aClass124_Sub1_Sub1_9038.method8398(0);
	}

	public void method1747(int i, int i_151_, int i_152_, int i_153_, int[] is, int[] is_154_, int i_155_, int i_156_) {
		aClass124_Sub1_Sub1_9038.method8396(i, i_151_, i_152_, i_153_, is, is_154_, i_155_);
	}

	public Interface22 method1722() {
		return aClass124_Sub1_Sub1_9038.method8398(0);
	}

	public int method12() {
		return aClass124_Sub1_Sub1_9038.anInt11361 + anInt9039 + anInt9041;
	}

	public void method1755(int i, int i_157_, int i_158_, int i_159_, int i_160_) {
		aClass124_Sub1_Sub1_9038.method1609(false);
		aClass167_Sub2_9035.method8614();
		aClass167_Sub2_9035.method8567(i_160_);
		OpenGL.glColor4ub((byte) (i_159_ >> 16), (byte) (i_159_ >> 8), (byte) i_159_, (byte) (i_159_ >> 24));
		i += anInt9039;
		i_157_ += anInt9033;
		if (aClass124_Sub1_Sub1_9036 == null) {
			aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
			aClass167_Sub2_9035.method8557(i_158_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i, i_157_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_157_ + aClass124_Sub1_Sub1_9038.anInt11365);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
			OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_157_ + aClass124_Sub1_Sub1_9038.anInt11365);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_157_);
			OpenGL.glEnd();
		} else {
			method8478(i_158_);
			aClass124_Sub1_Sub1_9036.method1609(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i, i_157_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_157_ + aClass124_Sub1_Sub1_9038.anInt11365);
			OpenGL.glMultiTexCoord2f(33985, aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
			OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_157_ + aClass124_Sub1_Sub1_9038.anInt11365);
			OpenGL.glMultiTexCoord2f(33985, aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_157_);
			OpenGL.glEnd();
			method8479();
		}
	}

	public void method1756(int i, int i_161_, int i_162_, int i_163_, int i_164_) {
		aClass124_Sub1_Sub1_9038.method1609(false);
		aClass167_Sub2_9035.method8614();
		aClass167_Sub2_9035.method8567(i_164_);
		OpenGL.glColor4ub((byte) (i_163_ >> 16), (byte) (i_163_ >> 8), (byte) i_163_, (byte) (i_163_ >> 24));
		i += anInt9039;
		i_161_ += anInt9033;
		if (aClass124_Sub1_Sub1_9036 == null) {
			aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
			aClass167_Sub2_9035.method8557(i_162_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i, i_161_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_161_ + aClass124_Sub1_Sub1_9038.anInt11365);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
			OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_161_ + aClass124_Sub1_Sub1_9038.anInt11365);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_161_);
			OpenGL.glEnd();
		} else {
			method8478(i_162_);
			aClass124_Sub1_Sub1_9036.method1609(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i, i_161_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_161_ + aClass124_Sub1_Sub1_9038.anInt11365);
			OpenGL.glMultiTexCoord2f(33985, aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
			OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_161_ + aClass124_Sub1_Sub1_9038.anInt11365);
			OpenGL.glMultiTexCoord2f(33985, aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_161_);
			OpenGL.glEnd();
			method8479();
		}
	}

	public void method1721(int i, int i_165_, int i_166_, int i_167_, int i_168_) {
		aClass124_Sub1_Sub1_9038.method1609(false);
		aClass167_Sub2_9035.method8614();
		aClass167_Sub2_9035.method8567(i_168_);
		OpenGL.glColor4ub((byte) (i_167_ >> 16), (byte) (i_167_ >> 8), (byte) i_167_, (byte) (i_167_ >> 24));
		i += anInt9039;
		i_165_ += anInt9033;
		if (aClass124_Sub1_Sub1_9036 == null) {
			aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
			aClass167_Sub2_9035.method8557(i_166_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i, i_165_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_165_ + aClass124_Sub1_Sub1_9038.anInt11365);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
			OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_165_ + aClass124_Sub1_Sub1_9038.anInt11365);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_165_);
			OpenGL.glEnd();
		} else {
			method8478(i_166_);
			aClass124_Sub1_Sub1_9036.method1609(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i, i_165_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_165_ + aClass124_Sub1_Sub1_9038.anInt11365);
			OpenGL.glMultiTexCoord2f(33985, aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
			OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_165_ + aClass124_Sub1_Sub1_9038.anInt11365);
			OpenGL.glMultiTexCoord2f(33985, aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_165_);
			OpenGL.glEnd();
			method8479();
		}
	}

	void method1758(int i, int i_169_, int i_170_, int i_171_, int i_172_, int i_173_, int i_174_, int i_175_) {
		aClass124_Sub1_Sub1_9038.method1609((i_175_ & 0x1) != 0);
		aClass167_Sub2_9035.method8614();
		aClass167_Sub2_9035.method8567(i_174_);
		OpenGL.glColor4ub((byte) (i_173_ >> 16), (byte) (i_173_ >> 8), (byte) i_173_, (byte) (i_173_ >> 24));
		if (aBool9037) {
			float f = (float) i_170_ / (float) method12();
			float f_176_ = (float) i_171_ / (float) method1785();
			float f_177_ = (float) i + (float) anInt9039 * f;
			float f_178_ = (float) i_169_ + (float) anInt9033 * f_176_;
			float f_179_ = f_177_ + (float) aClass124_Sub1_Sub1_9038.anInt11361 * f;
			float f_180_ = (f_178_ + (float) aClass124_Sub1_Sub1_9038.anInt11365 * f_176_);
			if (aClass124_Sub1_Sub1_9036 == null) {
				aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
				aClass167_Sub2_9035.method8557(i_172_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
				OpenGL.glVertex2f(f_177_, f_178_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_177_, f_180_);
				OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
				OpenGL.glVertex2f(f_179_, f_180_);
				OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
				OpenGL.glVertex2f(f_179_, f_178_);
				OpenGL.glEnd();
			} else {
				method8478(i_172_);
				aClass124_Sub1_Sub1_9036.method1609(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
				OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
				OpenGL.glVertex2f(f_177_, f_178_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_177_, f_180_);
				OpenGL.glMultiTexCoord2f(33985, aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
				OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
				OpenGL.glVertex2f(f_179_, f_180_);
				OpenGL.glMultiTexCoord2f(33985, aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
				OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
				OpenGL.glVertex2f(f_179_, f_178_);
				OpenGL.glEnd();
				method8479();
			}
		} else if (aClass124_Sub1_Sub1_9036 == null) {
			aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
			aClass167_Sub2_9035.method8557(i_172_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i, i_169_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_169_ + i_171_);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
			OpenGL.glVertex2i(i + i_170_, i_169_ + i_171_);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i + i_170_, i_169_);
			OpenGL.glEnd();
		} else {
			method8478(i_172_);
			aClass124_Sub1_Sub1_9036.method1609(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i, i_169_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_169_ + i_171_);
			OpenGL.glMultiTexCoord2f(33985, aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
			OpenGL.glVertex2i(i + i_170_, i_169_ + i_171_);
			OpenGL.glMultiTexCoord2f(33985, aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i + i_170_, i_169_);
			OpenGL.glEnd();
			method8479();
		}
	}

	public int method1769() {
		return aClass124_Sub1_Sub1_9038.anInt11365;
	}

	public void method1760(int i, int i_181_, Class161 class161, int i_182_, int i_183_) {
		Class161_Sub3 class161_sub3 = (Class161_Sub3) class161;
		Class124_Sub1_Sub1 class124_sub1_sub1 = class161_sub3.aClass124_Sub1_Sub1_9525;
		aClass124_Sub1_Sub1_9038.method1609(false);
		aClass167_Sub2_9035.method8614();
		aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
		aClass167_Sub2_9035.method8557(1);
		aClass167_Sub2_9035.method8556(1);
		aClass167_Sub2_9035.method8617(class124_sub1_sub1);
		aClass167_Sub2_9035.method8558(7681, 8448);
		aClass167_Sub2_9035.method8520(0, 34168, 768);
		aClass167_Sub2_9035.method8567(1);
		i += anInt9039;
		i_181_ += anInt9033;
		int i_184_ = i + aClass124_Sub1_Sub1_9038.anInt11361;
		int i_185_ = i_181_ + aClass124_Sub1_Sub1_9038.anInt11365;
		float f = (class124_sub1_sub1.aFloat11363 / (float) class124_sub1_sub1.anInt11361);
		float f_186_ = (class124_sub1_sub1.aFloat11362 / (float) class124_sub1_sub1.anInt11365);
		float f_187_ = (float) (i - i_182_) * f;
		float f_188_ = (float) (i_184_ - i_182_) * f;
		float f_189_ = (class124_sub1_sub1.aFloat11362 - (float) (i_181_ - i_183_) * f_186_);
		float f_190_ = (class124_sub1_sub1.aFloat11362 - (float) (i_185_ - i_183_) * f_186_);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glMultiTexCoord2f(33985, f_187_, f_189_);
		OpenGL.glVertex2i(i, i_181_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_187_, f_190_);
		OpenGL.glVertex2i(i, i_181_ + aClass124_Sub1_Sub1_9038.anInt11365);
		OpenGL.glMultiTexCoord2f(33984, aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_188_, f_190_);
		OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_181_ + aClass124_Sub1_Sub1_9038.anInt11365);
		OpenGL.glMultiTexCoord2f(33984, aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glMultiTexCoord2f(33985, f_188_, f_189_);
		OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_181_);
		OpenGL.glEnd();
		aClass167_Sub2_9035.method8520(0, 5890, 768);
		aClass167_Sub2_9035.method8557(0);
		aClass167_Sub2_9035.method8617(null);
		aClass167_Sub2_9035.method8556(0);
	}

	Class143_Sub2(Class167_Sub2 class167_sub2, int i, int i_191_, int i_192_, int i_193_) {
		anInt9033 = 0;
		anInt9039 = 0;
		anInt9040 = 0;
		anInt9041 = 0;
		aClass167_Sub2_9035 = class167_sub2;
		aClass124_Sub1_Sub1_9038 = Class124_Sub1_Sub1.method10529(class167_sub2, i, i_191_, i_192_, i_193_);
	}

	public void method1761(int i, int i_194_, int i_195_, int i_196_, int[] is, int[] is_197_, int i_198_, int i_199_) {
		aClass124_Sub1_Sub1_9038.method8396(i, i_194_, i_195_, i_196_, is, is_197_, i_198_);
	}

	void method1775(float f, float f_200_, float f_201_, float f_202_, float f_203_, float f_204_, int i, int i_205_, int i_206_, int i_207_) {
		if (aBool9037) {
			float f_208_ = (float) method12();
			float f_209_ = (float) method1785();
			float f_210_ = (f_201_ - f) / f_208_;
			float f_211_ = (f_202_ - f_200_) / f_208_;
			float f_212_ = (f_203_ - f) / f_209_;
			float f_213_ = (f_204_ - f_200_) / f_209_;
			float f_214_ = f_212_ * (float) anInt9033;
			float f_215_ = f_213_ * (float) anInt9033;
			float f_216_ = f_210_ * (float) anInt9039;
			float f_217_ = f_211_ * (float) anInt9039;
			float f_218_ = -f_210_ * (float) anInt9041;
			float f_219_ = -f_211_ * (float) anInt9041;
			float f_220_ = -f_212_ * (float) anInt9040;
			float f_221_ = -f_213_ * (float) anInt9040;
			f = f + f_216_ + f_214_;
			f_200_ = f_200_ + f_217_ + f_215_;
			f_201_ = f_201_ + f_218_ + f_214_;
			f_202_ = f_202_ + f_219_ + f_215_;
			f_203_ = f_203_ + f_216_ + f_220_;
			f_204_ = f_204_ + f_217_ + f_221_;
		}
		float f_222_ = f_203_ + (f_201_ - f);
		float f_223_ = f_202_ + (f_204_ - f_200_);
		aClass124_Sub1_Sub1_9038.method1609((i_207_ & 0x1) != 0);
		aClass167_Sub2_9035.method8614();
		aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
		aClass167_Sub2_9035.method8567(i_206_);
		aClass167_Sub2_9035.method8557(i);
		OpenGL.glColor4ub((byte) (i_205_ >> 16), (byte) (i_205_ >> 8), (byte) i_205_, (byte) (i_205_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glVertex2f(f, f_200_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_203_, f_204_);
		OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
		OpenGL.glVertex2f(f_222_, f_223_);
		OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glVertex2f(f_201_, f_202_);
		OpenGL.glEnd();
	}

	public void method1788(int i, int i_224_, Class161 class161, int i_225_, int i_226_) {
		Class161_Sub3 class161_sub3 = (Class161_Sub3) class161;
		Class124_Sub1_Sub1 class124_sub1_sub1 = class161_sub3.aClass124_Sub1_Sub1_9525;
		aClass124_Sub1_Sub1_9038.method1609(false);
		aClass167_Sub2_9035.method8614();
		aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
		aClass167_Sub2_9035.method8557(1);
		aClass167_Sub2_9035.method8556(1);
		aClass167_Sub2_9035.method8617(class124_sub1_sub1);
		aClass167_Sub2_9035.method8558(7681, 8448);
		aClass167_Sub2_9035.method8520(0, 34168, 768);
		aClass167_Sub2_9035.method8567(1);
		i += anInt9039;
		i_224_ += anInt9033;
		int i_227_ = i + aClass124_Sub1_Sub1_9038.anInt11361;
		int i_228_ = i_224_ + aClass124_Sub1_Sub1_9038.anInt11365;
		float f = (class124_sub1_sub1.aFloat11363 / (float) class124_sub1_sub1.anInt11361);
		float f_229_ = (class124_sub1_sub1.aFloat11362 / (float) class124_sub1_sub1.anInt11365);
		float f_230_ = (float) (i - i_225_) * f;
		float f_231_ = (float) (i_227_ - i_225_) * f;
		float f_232_ = (class124_sub1_sub1.aFloat11362 - (float) (i_224_ - i_226_) * f_229_);
		float f_233_ = (class124_sub1_sub1.aFloat11362 - (float) (i_228_ - i_226_) * f_229_);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glMultiTexCoord2f(33985, f_230_, f_232_);
		OpenGL.glVertex2i(i, i_224_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_230_, f_233_);
		OpenGL.glVertex2i(i, i_224_ + aClass124_Sub1_Sub1_9038.anInt11365);
		OpenGL.glMultiTexCoord2f(33984, aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_231_, f_233_);
		OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_224_ + aClass124_Sub1_Sub1_9038.anInt11365);
		OpenGL.glMultiTexCoord2f(33984, aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glMultiTexCoord2f(33985, f_231_, f_232_);
		OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_224_);
		OpenGL.glEnd();
		aClass167_Sub2_9035.method8520(0, 5890, 768);
		aClass167_Sub2_9035.method8557(0);
		aClass167_Sub2_9035.method8617(null);
		aClass167_Sub2_9035.method8556(0);
	}

	public void method1764(int i, int i_234_, Class161 class161, int i_235_, int i_236_) {
		Class161_Sub3 class161_sub3 = (Class161_Sub3) class161;
		Class124_Sub1_Sub1 class124_sub1_sub1 = class161_sub3.aClass124_Sub1_Sub1_9525;
		aClass124_Sub1_Sub1_9038.method1609(false);
		aClass167_Sub2_9035.method8614();
		aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
		aClass167_Sub2_9035.method8557(1);
		aClass167_Sub2_9035.method8556(1);
		aClass167_Sub2_9035.method8617(class124_sub1_sub1);
		aClass167_Sub2_9035.method8558(7681, 8448);
		aClass167_Sub2_9035.method8520(0, 34168, 768);
		aClass167_Sub2_9035.method8567(1);
		i += anInt9039;
		i_234_ += anInt9033;
		int i_237_ = i + aClass124_Sub1_Sub1_9038.anInt11361;
		int i_238_ = i_234_ + aClass124_Sub1_Sub1_9038.anInt11365;
		float f = (class124_sub1_sub1.aFloat11363 / (float) class124_sub1_sub1.anInt11361);
		float f_239_ = (class124_sub1_sub1.aFloat11362 / (float) class124_sub1_sub1.anInt11365);
		float f_240_ = (float) (i - i_235_) * f;
		float f_241_ = (float) (i_237_ - i_235_) * f;
		float f_242_ = (class124_sub1_sub1.aFloat11362 - (float) (i_234_ - i_236_) * f_239_);
		float f_243_ = (class124_sub1_sub1.aFloat11362 - (float) (i_238_ - i_236_) * f_239_);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glMultiTexCoord2f(33985, f_240_, f_242_);
		OpenGL.glVertex2i(i, i_234_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_240_, f_243_);
		OpenGL.glVertex2i(i, i_234_ + aClass124_Sub1_Sub1_9038.anInt11365);
		OpenGL.glMultiTexCoord2f(33984, aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_241_, f_243_);
		OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_234_ + aClass124_Sub1_Sub1_9038.anInt11365);
		OpenGL.glMultiTexCoord2f(33984, aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glMultiTexCoord2f(33985, f_241_, f_242_);
		OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_234_);
		OpenGL.glEnd();
		aClass167_Sub2_9035.method8520(0, 5890, 768);
		aClass167_Sub2_9035.method8557(0);
		aClass167_Sub2_9035.method8617(null);
		aClass167_Sub2_9035.method8556(0);
	}

	public void method1765(int i, int i_244_, int i_245_, int i_246_) {
		anInt9039 = i;
		anInt9033 = i_244_;
		anInt9041 = i_245_;
		anInt9040 = i_246_;
		aBool9037 = (anInt9039 != 0 || anInt9033 != 0 || anInt9041 != 0 || anInt9040 != 0);
	}

	public void method1781(int i, int i_247_, int i_248_, int i_249_) {
		anInt9039 = i;
		anInt9033 = i_247_;
		anInt9041 = i_248_;
		anInt9040 = i_249_;
		aBool9037 = (anInt9039 != 0 || anInt9033 != 0 || anInt9041 != 0 || anInt9040 != 0);
	}

	public void method1766(int[] is) {
		is[0] = anInt9039;
		is[1] = anInt9033;
		is[2] = anInt9041;
		is[3] = anInt9040;
	}

	public void method1768(int[] is) {
		is[0] = anInt9039;
		is[1] = anInt9033;
		is[2] = anInt9041;
		is[3] = anInt9040;
	}

	void method1740(float f, float f_250_, float f_251_, float f_252_, float f_253_, float f_254_, int i, int i_255_, int i_256_, int i_257_) {
		if (aBool9037) {
			float f_258_ = (float) method12();
			float f_259_ = (float) method1785();
			float f_260_ = (f_251_ - f) / f_258_;
			float f_261_ = (f_252_ - f_250_) / f_258_;
			float f_262_ = (f_253_ - f) / f_259_;
			float f_263_ = (f_254_ - f_250_) / f_259_;
			float f_264_ = f_262_ * (float) anInt9033;
			float f_265_ = f_263_ * (float) anInt9033;
			float f_266_ = f_260_ * (float) anInt9039;
			float f_267_ = f_261_ * (float) anInt9039;
			float f_268_ = -f_260_ * (float) anInt9041;
			float f_269_ = -f_261_ * (float) anInt9041;
			float f_270_ = -f_262_ * (float) anInt9040;
			float f_271_ = -f_263_ * (float) anInt9040;
			f = f + f_266_ + f_264_;
			f_250_ = f_250_ + f_267_ + f_265_;
			f_251_ = f_251_ + f_268_ + f_264_;
			f_252_ = f_252_ + f_269_ + f_265_;
			f_253_ = f_253_ + f_266_ + f_270_;
			f_254_ = f_254_ + f_267_ + f_271_;
		}
		float f_272_ = f_253_ + (f_251_ - f);
		float f_273_ = f_252_ + (f_254_ - f_250_);
		aClass124_Sub1_Sub1_9038.method1609((i_257_ & 0x1) != 0);
		aClass167_Sub2_9035.method8614();
		aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
		aClass167_Sub2_9035.method8567(i_256_);
		aClass167_Sub2_9035.method8557(i);
		OpenGL.glColor4ub((byte) (i_255_ >> 16), (byte) (i_255_ >> 8), (byte) i_255_, (byte) (i_255_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glVertex2f(f, f_250_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_253_, f_254_);
		OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
		OpenGL.glVertex2f(f_272_, f_273_);
		OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glVertex2f(f_251_, f_252_);
		OpenGL.glEnd();
	}

	public int method1753() {
		return aClass124_Sub1_Sub1_9038.anInt11361;
	}

	public void method1745(int i, int i_274_, int i_275_, int i_276_, int[] is, int i_277_, int i_278_) {
		aClass124_Sub1_Sub1_9038.method8397(i, i_274_, i_275_, i_276_, is, i_277_, i_278_, true);
	}

	void method1732(int i, int i_279_, int i_280_, int i_281_, int i_282_, int i_283_, int i_284_, int i_285_) {
		aClass124_Sub1_Sub1_9038.method1609((i_285_ & 0x1) != 0);
		aClass167_Sub2_9035.method8614();
		aClass167_Sub2_9035.method8567(i_284_);
		OpenGL.glColor4ub((byte) (i_283_ >> 16), (byte) (i_283_ >> 8), (byte) i_283_, (byte) (i_283_ >> 24));
		if (aBool9037) {
			float f = (float) i_280_ / (float) method12();
			float f_286_ = (float) i_281_ / (float) method1785();
			float f_287_ = (float) i + (float) anInt9039 * f;
			float f_288_ = (float) i_279_ + (float) anInt9033 * f_286_;
			float f_289_ = f_287_ + (float) aClass124_Sub1_Sub1_9038.anInt11361 * f;
			float f_290_ = (f_288_ + (float) aClass124_Sub1_Sub1_9038.anInt11365 * f_286_);
			if (aClass124_Sub1_Sub1_9036 == null) {
				aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
				aClass167_Sub2_9035.method8557(i_282_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
				OpenGL.glVertex2f(f_287_, f_288_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_287_, f_290_);
				OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
				OpenGL.glVertex2f(f_289_, f_290_);
				OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
				OpenGL.glVertex2f(f_289_, f_288_);
				OpenGL.glEnd();
			} else {
				method8478(i_282_);
				aClass124_Sub1_Sub1_9036.method1609(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
				OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
				OpenGL.glVertex2f(f_287_, f_288_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_287_, f_290_);
				OpenGL.glMultiTexCoord2f(33985, aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
				OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
				OpenGL.glVertex2f(f_289_, f_290_);
				OpenGL.glMultiTexCoord2f(33985, aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
				OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
				OpenGL.glVertex2f(f_289_, f_288_);
				OpenGL.glEnd();
				method8479();
			}
		} else if (aClass124_Sub1_Sub1_9036 == null) {
			aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
			aClass167_Sub2_9035.method8557(i_282_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i, i_279_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_279_ + i_281_);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
			OpenGL.glVertex2i(i + i_280_, i_279_ + i_281_);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i + i_280_, i_279_);
			OpenGL.glEnd();
		} else {
			method8478(i_282_);
			aClass124_Sub1_Sub1_9036.method1609(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i, i_279_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_279_ + i_281_);
			OpenGL.glMultiTexCoord2f(33985, aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
			OpenGL.glVertex2i(i + i_280_, i_279_ + i_281_);
			OpenGL.glMultiTexCoord2f(33985, aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
			OpenGL.glVertex2i(i + i_280_, i_279_);
			OpenGL.glEnd();
			method8479();
		}
	}

	public int method1770() {
		return aClass124_Sub1_Sub1_9038.anInt11365 + anInt9033 + anInt9040;
	}

	public void method1759(int i, int i_291_, int i_292_, int i_293_, int i_294_, int i_295_, int i_296_) {
		int i_297_ = i + i_292_;
		int i_298_ = i_291_ + i_293_;
		aClass124_Sub1_Sub1_9038.method1609(false);
		aClass167_Sub2_9035.method8614();
		aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
		aClass167_Sub2_9035.method8567(i_296_);
		aClass167_Sub2_9035.method8557(i_294_);
		OpenGL.glColor4ub((byte) (i_295_ >> 16), (byte) (i_295_ >> 8), (byte) i_295_, (byte) (i_295_ >> 24));
		if (aClass124_Sub1_Sub1_9038.aBool11364 && !aBool9037 && i_293_ >= aClass124_Sub1_Sub1_9038.anInt11365 && i_292_ >= aClass124_Sub1_Sub1_9038.anInt11361) {
			float f = (aClass124_Sub1_Sub1_9038.aFloat11362 * (float) i_293_ / (float) aClass124_Sub1_Sub1_9038.anInt11365);
			float f_299_ = (aClass124_Sub1_Sub1_9038.aFloat11363 * (float) i_292_ / (float) aClass124_Sub1_Sub1_9038.anInt11361);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f);
			OpenGL.glVertex2i(i, i_291_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_298_);
			OpenGL.glTexCoord2f(f_299_, 0.0F);
			OpenGL.glVertex2i(i_297_, i_298_);
			OpenGL.glTexCoord2f(f_299_, f);
			OpenGL.glVertex2i(i_297_, i_291_);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) anInt9039, (float) anInt9033, 0.0F);
			int i_300_ = method12();
			int i_301_ = method1785();
			int i_302_ = i_291_ + aClass124_Sub1_Sub1_9038.anInt11365;
			OpenGL.glBegin(7);
			int i_303_ = i_291_;
			for (/**/; i_302_ <= i_298_; i_302_ += i_301_) {
				int i_304_ = i + aClass124_Sub1_Sub1_9038.anInt11361;
				int i_305_ = i;
				while (i_304_ <= i_297_) {
					OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_305_, i_303_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_305_, i_302_);
					OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
					OpenGL.glVertex2i(i_304_, i_302_);
					OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_304_, i_303_);
					i_304_ += i_300_;
					i_305_ += i_300_;
				}
				if (i_305_ < i_297_) {
					float f = (aClass124_Sub1_Sub1_9038.aFloat11363 * (float) (i_297_ - i_305_) / (float) aClass124_Sub1_Sub1_9038.anInt11361);
					OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_305_, i_303_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_305_, i_302_);
					OpenGL.glTexCoord2f(f, 0.0F);
					OpenGL.glVertex2i(i_297_, i_302_);
					OpenGL.glTexCoord2f(f, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_297_, i_303_);
				}
				i_303_ += i_301_;
			}
			if (i_303_ < i_298_) {
				float f = (aClass124_Sub1_Sub1_9038.aFloat11362 * (float) (aClass124_Sub1_Sub1_9038.anInt11365 - (i_298_ - i_303_)) / (float) aClass124_Sub1_Sub1_9038.anInt11365);
				int i_306_ = i + aClass124_Sub1_Sub1_9038.anInt11361;
				int i_307_ = i;
				while (i_306_ <= i_297_) {
					OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_307_, i_303_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_307_, i_298_);
					OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, f);
					OpenGL.glVertex2i(i_306_, i_298_);
					OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_306_, i_303_);
					i_306_ += i_300_;
					i_307_ += i_300_;
				}
				if (i_307_ < i_297_) {
					float f_308_ = (aClass124_Sub1_Sub1_9038.aFloat11363 * (float) (i_297_ - i_307_) / (float) aClass124_Sub1_Sub1_9038.anInt11361);
					OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_307_, i_303_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_307_, i_298_);
					OpenGL.glTexCoord2f(f_308_, f);
					OpenGL.glVertex2i(i_297_, i_298_);
					OpenGL.glTexCoord2f(f_308_, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_297_, i_303_);
				}
			}
			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}
	}

	public Interface22 method1784() {
		return aClass124_Sub1_Sub1_9038.method8398(0);
	}

	public void method1774(int i, int i_309_, int i_310_, int i_311_, int i_312_, int i_313_, int i_314_) {
		int i_315_ = i + i_310_;
		int i_316_ = i_309_ + i_311_;
		aClass124_Sub1_Sub1_9038.method1609(false);
		aClass167_Sub2_9035.method8614();
		aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
		aClass167_Sub2_9035.method8567(i_314_);
		aClass167_Sub2_9035.method8557(i_312_);
		OpenGL.glColor4ub((byte) (i_313_ >> 16), (byte) (i_313_ >> 8), (byte) i_313_, (byte) (i_313_ >> 24));
		if (aClass124_Sub1_Sub1_9038.aBool11364 && !aBool9037 && i_311_ >= aClass124_Sub1_Sub1_9038.anInt11365 && i_310_ >= aClass124_Sub1_Sub1_9038.anInt11361) {
			float f = (aClass124_Sub1_Sub1_9038.aFloat11362 * (float) i_311_ / (float) aClass124_Sub1_Sub1_9038.anInt11365);
			float f_317_ = (aClass124_Sub1_Sub1_9038.aFloat11363 * (float) i_310_ / (float) aClass124_Sub1_Sub1_9038.anInt11361);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f);
			OpenGL.glVertex2i(i, i_309_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_316_);
			OpenGL.glTexCoord2f(f_317_, 0.0F);
			OpenGL.glVertex2i(i_315_, i_316_);
			OpenGL.glTexCoord2f(f_317_, f);
			OpenGL.glVertex2i(i_315_, i_309_);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) anInt9039, (float) anInt9033, 0.0F);
			int i_318_ = method12();
			int i_319_ = method1785();
			int i_320_ = i_309_ + aClass124_Sub1_Sub1_9038.anInt11365;
			OpenGL.glBegin(7);
			int i_321_ = i_309_;
			for (/**/; i_320_ <= i_316_; i_320_ += i_319_) {
				int i_322_ = i + aClass124_Sub1_Sub1_9038.anInt11361;
				int i_323_ = i;
				while (i_322_ <= i_315_) {
					OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_323_, i_321_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_323_, i_320_);
					OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
					OpenGL.glVertex2i(i_322_, i_320_);
					OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_322_, i_321_);
					i_322_ += i_318_;
					i_323_ += i_318_;
				}
				if (i_323_ < i_315_) {
					float f = (aClass124_Sub1_Sub1_9038.aFloat11363 * (float) (i_315_ - i_323_) / (float) aClass124_Sub1_Sub1_9038.anInt11361);
					OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_323_, i_321_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_323_, i_320_);
					OpenGL.glTexCoord2f(f, 0.0F);
					OpenGL.glVertex2i(i_315_, i_320_);
					OpenGL.glTexCoord2f(f, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_315_, i_321_);
				}
				i_321_ += i_319_;
			}
			if (i_321_ < i_316_) {
				float f = (aClass124_Sub1_Sub1_9038.aFloat11362 * (float) (aClass124_Sub1_Sub1_9038.anInt11365 - (i_316_ - i_321_)) / (float) aClass124_Sub1_Sub1_9038.anInt11365);
				int i_324_ = i + aClass124_Sub1_Sub1_9038.anInt11361;
				int i_325_ = i;
				while (i_324_ <= i_315_) {
					OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_325_, i_321_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_325_, i_316_);
					OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, f);
					OpenGL.glVertex2i(i_324_, i_316_);
					OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_324_, i_321_);
					i_324_ += i_318_;
					i_325_ += i_318_;
				}
				if (i_325_ < i_315_) {
					float f_326_ = (aClass124_Sub1_Sub1_9038.aFloat11363 * (float) (i_315_ - i_325_) / (float) aClass124_Sub1_Sub1_9038.anInt11361);
					OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_325_, i_321_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_325_, i_316_);
					OpenGL.glTexCoord2f(f_326_, f);
					OpenGL.glVertex2i(i_315_, i_316_);
					OpenGL.glTexCoord2f(f_326_, aClass124_Sub1_Sub1_9038.aFloat11362);
					OpenGL.glVertex2i(i_315_, i_321_);
				}
			}
			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}
	}

	public void method1762(int i, int i_327_, Class161 class161, int i_328_, int i_329_) {
		Class161_Sub3 class161_sub3 = (Class161_Sub3) class161;
		Class124_Sub1_Sub1 class124_sub1_sub1 = class161_sub3.aClass124_Sub1_Sub1_9525;
		aClass124_Sub1_Sub1_9038.method1609(false);
		aClass167_Sub2_9035.method8614();
		aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
		aClass167_Sub2_9035.method8557(1);
		aClass167_Sub2_9035.method8556(1);
		aClass167_Sub2_9035.method8617(class124_sub1_sub1);
		aClass167_Sub2_9035.method8558(7681, 8448);
		aClass167_Sub2_9035.method8520(0, 34168, 768);
		aClass167_Sub2_9035.method8567(1);
		i += anInt9039;
		i_327_ += anInt9033;
		int i_330_ = i + aClass124_Sub1_Sub1_9038.anInt11361;
		int i_331_ = i_327_ + aClass124_Sub1_Sub1_9038.anInt11365;
		float f = (class124_sub1_sub1.aFloat11363 / (float) class124_sub1_sub1.anInt11361);
		float f_332_ = (class124_sub1_sub1.aFloat11362 / (float) class124_sub1_sub1.anInt11365);
		float f_333_ = (float) (i - i_328_) * f;
		float f_334_ = (float) (i_330_ - i_328_) * f;
		float f_335_ = (class124_sub1_sub1.aFloat11362 - (float) (i_327_ - i_329_) * f_332_);
		float f_336_ = (class124_sub1_sub1.aFloat11362 - (float) (i_331_ - i_329_) * f_332_);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glMultiTexCoord2f(33985, f_333_, f_335_);
		OpenGL.glVertex2i(i, i_327_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_333_, f_336_);
		OpenGL.glVertex2i(i, i_327_ + aClass124_Sub1_Sub1_9038.anInt11365);
		OpenGL.glMultiTexCoord2f(33984, aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_334_, f_336_);
		OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_327_ + aClass124_Sub1_Sub1_9038.anInt11365);
		OpenGL.glMultiTexCoord2f(33984, aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glMultiTexCoord2f(33985, f_334_, f_335_);
		OpenGL.glVertex2i(i + aClass124_Sub1_Sub1_9038.anInt11361, i_327_);
		OpenGL.glEnd();
		aClass167_Sub2_9035.method8520(0, 5890, 768);
		aClass167_Sub2_9035.method8557(0);
		aClass167_Sub2_9035.method8617(null);
		aClass167_Sub2_9035.method8556(0);
	}

	void method1776(float f, float f_337_, float f_338_, float f_339_, float f_340_, float f_341_, int i, int i_342_, int i_343_, int i_344_) {
		if (aBool9037) {
			float f_345_ = (float) method12();
			float f_346_ = (float) method1785();
			float f_347_ = (f_338_ - f) / f_345_;
			float f_348_ = (f_339_ - f_337_) / f_345_;
			float f_349_ = (f_340_ - f) / f_346_;
			float f_350_ = (f_341_ - f_337_) / f_346_;
			float f_351_ = f_349_ * (float) anInt9033;
			float f_352_ = f_350_ * (float) anInt9033;
			float f_353_ = f_347_ * (float) anInt9039;
			float f_354_ = f_348_ * (float) anInt9039;
			float f_355_ = -f_347_ * (float) anInt9041;
			float f_356_ = -f_348_ * (float) anInt9041;
			float f_357_ = -f_349_ * (float) anInt9040;
			float f_358_ = -f_350_ * (float) anInt9040;
			f = f + f_353_ + f_351_;
			f_337_ = f_337_ + f_354_ + f_352_;
			f_338_ = f_338_ + f_355_ + f_351_;
			f_339_ = f_339_ + f_356_ + f_352_;
			f_340_ = f_340_ + f_353_ + f_357_;
			f_341_ = f_341_ + f_354_ + f_358_;
		}
		float f_359_ = f_340_ + (f_338_ - f);
		float f_360_ = f_339_ + (f_341_ - f_337_);
		aClass124_Sub1_Sub1_9038.method1609((i_344_ & 0x1) != 0);
		aClass167_Sub2_9035.method8614();
		aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
		aClass167_Sub2_9035.method8567(i_343_);
		aClass167_Sub2_9035.method8557(i);
		OpenGL.glColor4ub((byte) (i_342_ >> 16), (byte) (i_342_ >> 8), (byte) i_342_, (byte) (i_342_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glVertex2f(f, f_337_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_340_, f_341_);
		OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
		OpenGL.glVertex2f(f_359_, f_360_);
		OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glVertex2f(f_338_, f_339_);
		OpenGL.glEnd();
	}

	void method1787(float f, float f_361_, float f_362_, float f_363_, float f_364_, float f_365_, int i, int i_366_, int i_367_, int i_368_) {
		if (aBool9037) {
			float f_369_ = (float) method12();
			float f_370_ = (float) method1785();
			float f_371_ = (f_362_ - f) / f_369_;
			float f_372_ = (f_363_ - f_361_) / f_369_;
			float f_373_ = (f_364_ - f) / f_370_;
			float f_374_ = (f_365_ - f_361_) / f_370_;
			float f_375_ = f_373_ * (float) anInt9033;
			float f_376_ = f_374_ * (float) anInt9033;
			float f_377_ = f_371_ * (float) anInt9039;
			float f_378_ = f_372_ * (float) anInt9039;
			float f_379_ = -f_371_ * (float) anInt9041;
			float f_380_ = -f_372_ * (float) anInt9041;
			float f_381_ = -f_373_ * (float) anInt9040;
			float f_382_ = -f_374_ * (float) anInt9040;
			f = f + f_377_ + f_375_;
			f_361_ = f_361_ + f_378_ + f_376_;
			f_362_ = f_362_ + f_379_ + f_375_;
			f_363_ = f_363_ + f_380_ + f_376_;
			f_364_ = f_364_ + f_377_ + f_381_;
			f_365_ = f_365_ + f_378_ + f_382_;
		}
		float f_383_ = f_364_ + (f_362_ - f);
		float f_384_ = f_363_ + (f_365_ - f_361_);
		aClass124_Sub1_Sub1_9038.method1609((i_368_ & 0x1) != 0);
		aClass167_Sub2_9035.method8614();
		aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
		aClass167_Sub2_9035.method8567(i_367_);
		aClass167_Sub2_9035.method8557(i);
		OpenGL.glColor4ub((byte) (i_366_ >> 16), (byte) (i_366_ >> 8), (byte) i_366_, (byte) (i_366_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glVertex2f(f, f_361_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_364_, f_365_);
		OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
		OpenGL.glVertex2f(f_383_, f_384_);
		OpenGL.glTexCoord2f(aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glVertex2f(f_362_, f_363_);
		OpenGL.glEnd();
	}

	void method1778(float f, float f_385_, float f_386_, float f_387_, float f_388_, float f_389_, int i, Class161 class161, int i_390_, int i_391_) {
		Class124_Sub1_Sub1 class124_sub1_sub1 = ((Class161_Sub3) class161).aClass124_Sub1_Sub1_9525;
		if (aBool9037) {
			float f_392_ = (float) method12();
			float f_393_ = (float) method1785();
			float f_394_ = (f_386_ - f) / f_392_;
			float f_395_ = (f_387_ - f_385_) / f_392_;
			float f_396_ = (f_388_ - f) / f_393_;
			float f_397_ = (f_389_ - f_385_) / f_393_;
			float f_398_ = f_396_ * (float) anInt9033;
			float f_399_ = f_397_ * (float) anInt9033;
			float f_400_ = f_394_ * (float) anInt9039;
			float f_401_ = f_395_ * (float) anInt9039;
			float f_402_ = -f_394_ * (float) anInt9041;
			float f_403_ = -f_395_ * (float) anInt9041;
			float f_404_ = -f_396_ * (float) anInt9040;
			float f_405_ = -f_397_ * (float) anInt9040;
			f = f + f_400_ + f_398_;
			f_385_ = f_385_ + f_401_ + f_399_;
			f_386_ = f_386_ + f_402_ + f_398_;
			f_387_ = f_387_ + f_403_ + f_399_;
			f_388_ = f_388_ + f_400_ + f_404_;
			f_389_ = f_389_ + f_401_ + f_405_;
		}
		float f_406_ = f_388_ + (f_386_ - f);
		float f_407_ = f_387_ + (f_389_ - f_385_);
		aClass124_Sub1_Sub1_9038.method1609((i & 0x1) != 0);
		aClass167_Sub2_9035.method8614();
		aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
		aClass167_Sub2_9035.method8557(1);
		aClass167_Sub2_9035.method8556(1);
		aClass167_Sub2_9035.method8617(class124_sub1_sub1);
		aClass167_Sub2_9035.method8558(7681, 8448);
		aClass167_Sub2_9035.method8520(0, 34168, 768);
		aClass167_Sub2_9035.method8567(1);
		float f_408_ = (class124_sub1_sub1.aFloat11363 / (float) class124_sub1_sub1.anInt11361);
		float f_409_ = (class124_sub1_sub1.aFloat11362 / (float) class124_sub1_sub1.anInt11365);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glMultiTexCoord2f(33985, f_408_ * (f - (float) i_390_), (class124_sub1_sub1.aFloat11362 - f_409_ * (f_385_ - (float) i_391_)));
		OpenGL.glVertex2f(f, f_385_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_408_ * (f_388_ - (float) i_390_), (class124_sub1_sub1.aFloat11362 - f_409_ * (f_389_ - (float) i_391_)));
		OpenGL.glVertex2f(f_388_, f_389_);
		OpenGL.glMultiTexCoord2f(33984, aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_408_ * (f_406_ - (float) i_390_), (class124_sub1_sub1.aFloat11362 - f_409_ * (f_407_ - (float) i_391_)));
		OpenGL.glVertex2f(f_406_, f_407_);
		OpenGL.glMultiTexCoord2f(33984, aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glMultiTexCoord2f(33985, f_408_ * (f_386_ - (float) i_390_), (class124_sub1_sub1.aFloat11362 - f_409_ * (f_387_ - (float) i_391_)));
		OpenGL.glVertex2f(f_386_, f_387_);
		OpenGL.glEnd();
		aClass167_Sub2_9035.method8520(0, 5890, 768);
		aClass167_Sub2_9035.method8557(0);
		aClass167_Sub2_9035.method8617(null);
		aClass167_Sub2_9035.method8556(0);
	}

	void method1777(float f, float f_410_, float f_411_, float f_412_, float f_413_, float f_414_, int i, Class161 class161, int i_415_, int i_416_) {
		Class124_Sub1_Sub1 class124_sub1_sub1 = ((Class161_Sub3) class161).aClass124_Sub1_Sub1_9525;
		if (aBool9037) {
			float f_417_ = (float) method12();
			float f_418_ = (float) method1785();
			float f_419_ = (f_411_ - f) / f_417_;
			float f_420_ = (f_412_ - f_410_) / f_417_;
			float f_421_ = (f_413_ - f) / f_418_;
			float f_422_ = (f_414_ - f_410_) / f_418_;
			float f_423_ = f_421_ * (float) anInt9033;
			float f_424_ = f_422_ * (float) anInt9033;
			float f_425_ = f_419_ * (float) anInt9039;
			float f_426_ = f_420_ * (float) anInt9039;
			float f_427_ = -f_419_ * (float) anInt9041;
			float f_428_ = -f_420_ * (float) anInt9041;
			float f_429_ = -f_421_ * (float) anInt9040;
			float f_430_ = -f_422_ * (float) anInt9040;
			f = f + f_425_ + f_423_;
			f_410_ = f_410_ + f_426_ + f_424_;
			f_411_ = f_411_ + f_427_ + f_423_;
			f_412_ = f_412_ + f_428_ + f_424_;
			f_413_ = f_413_ + f_425_ + f_429_;
			f_414_ = f_414_ + f_426_ + f_430_;
		}
		float f_431_ = f_413_ + (f_411_ - f);
		float f_432_ = f_412_ + (f_414_ - f_410_);
		aClass124_Sub1_Sub1_9038.method1609((i & 0x1) != 0);
		aClass167_Sub2_9035.method8614();
		aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
		aClass167_Sub2_9035.method8557(1);
		aClass167_Sub2_9035.method8556(1);
		aClass167_Sub2_9035.method8617(class124_sub1_sub1);
		aClass167_Sub2_9035.method8558(7681, 8448);
		aClass167_Sub2_9035.method8520(0, 34168, 768);
		aClass167_Sub2_9035.method8567(1);
		float f_433_ = (class124_sub1_sub1.aFloat11363 / (float) class124_sub1_sub1.anInt11361);
		float f_434_ = (class124_sub1_sub1.aFloat11362 / (float) class124_sub1_sub1.anInt11365);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glMultiTexCoord2f(33985, f_433_ * (f - (float) i_415_), (class124_sub1_sub1.aFloat11362 - f_434_ * (f_410_ - (float) i_416_)));
		OpenGL.glVertex2f(f, f_410_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_433_ * (f_413_ - (float) i_415_), (class124_sub1_sub1.aFloat11362 - f_434_ * (f_414_ - (float) i_416_)));
		OpenGL.glVertex2f(f_413_, f_414_);
		OpenGL.glMultiTexCoord2f(33984, aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_433_ * (f_431_ - (float) i_415_), (class124_sub1_sub1.aFloat11362 - f_434_ * (f_432_ - (float) i_416_)));
		OpenGL.glVertex2f(f_431_, f_432_);
		OpenGL.glMultiTexCoord2f(33984, aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glMultiTexCoord2f(33985, f_433_ * (f_411_ - (float) i_415_), (class124_sub1_sub1.aFloat11362 - f_434_ * (f_412_ - (float) i_416_)));
		OpenGL.glVertex2f(f_411_, f_412_);
		OpenGL.glEnd();
		aClass167_Sub2_9035.method8520(0, 5890, 768);
		aClass167_Sub2_9035.method8557(0);
		aClass167_Sub2_9035.method8617(null);
		aClass167_Sub2_9035.method8556(0);
	}

	public void method1748(int i, int i_435_, int i_436_, int i_437_, int i_438_, int i_439_) {
		method8477(i, i_435_, i_436_, i_437_, i_438_, i_439_, false);
	}

	public int method11() {
		return aClass124_Sub1_Sub1_9038.anInt11361 + anInt9039 + anInt9041;
	}

	void method8480(int i) {
		aClass167_Sub2_9035.method8556(1);
		aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
		aClass167_Sub2_9035.method8558(aClass167_Sub2_9035.method8510(i), 7681);
		aClass167_Sub2_9035.method8520(1, 34167, 768);
		aClass167_Sub2_9035.method8560(0, 34168, 770);
		aClass167_Sub2_9035.method8556(0);
		aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9036);
		aClass167_Sub2_9035.method8558(34479, 7681);
		aClass167_Sub2_9035.method8520(1, 34166, 768);
		if (anInt9034 == 0)
			aClass167_Sub2_9035.method8562(1.0F, 0.5F, 0.5F, 0.0F);
		else if (anInt9034 == 1)
			aClass167_Sub2_9035.method8562(0.5F, 1.0F, 0.5F, 0.0F);
		else if (anInt9034 == 2)
			aClass167_Sub2_9035.method8562(0.5F, 0.5F, 1.0F, 0.0F);
		else if (anInt9034 == 3)
			aClass167_Sub2_9035.method8562(128.5F, 128.5F, 128.5F, 0.0F);
	}

	void method8481(int i) {
		aClass167_Sub2_9035.method8556(1);
		aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
		aClass167_Sub2_9035.method8558(aClass167_Sub2_9035.method8510(i), 7681);
		aClass167_Sub2_9035.method8520(1, 34167, 768);
		aClass167_Sub2_9035.method8560(0, 34168, 770);
		aClass167_Sub2_9035.method8556(0);
		aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9036);
		aClass167_Sub2_9035.method8558(34479, 7681);
		aClass167_Sub2_9035.method8520(1, 34166, 768);
		if (anInt9034 == 0)
			aClass167_Sub2_9035.method8562(1.0F, 0.5F, 0.5F, 0.0F);
		else if (anInt9034 == 1)
			aClass167_Sub2_9035.method8562(0.5F, 1.0F, 0.5F, 0.0F);
		else if (anInt9034 == 2)
			aClass167_Sub2_9035.method8562(0.5F, 0.5F, 1.0F, 0.0F);
		else if (anInt9034 == 3)
			aClass167_Sub2_9035.method8562(128.5F, 128.5F, 128.5F, 0.0F);
	}

	void method1725(float f, float f_440_, float f_441_, float f_442_, float f_443_, float f_444_, int i, Class161 class161, int i_445_, int i_446_) {
		Class124_Sub1_Sub1 class124_sub1_sub1 = ((Class161_Sub3) class161).aClass124_Sub1_Sub1_9525;
		if (aBool9037) {
			float f_447_ = (float) method12();
			float f_448_ = (float) method1785();
			float f_449_ = (f_441_ - f) / f_447_;
			float f_450_ = (f_442_ - f_440_) / f_447_;
			float f_451_ = (f_443_ - f) / f_448_;
			float f_452_ = (f_444_ - f_440_) / f_448_;
			float f_453_ = f_451_ * (float) anInt9033;
			float f_454_ = f_452_ * (float) anInt9033;
			float f_455_ = f_449_ * (float) anInt9039;
			float f_456_ = f_450_ * (float) anInt9039;
			float f_457_ = -f_449_ * (float) anInt9041;
			float f_458_ = -f_450_ * (float) anInt9041;
			float f_459_ = -f_451_ * (float) anInt9040;
			float f_460_ = -f_452_ * (float) anInt9040;
			f = f + f_455_ + f_453_;
			f_440_ = f_440_ + f_456_ + f_454_;
			f_441_ = f_441_ + f_457_ + f_453_;
			f_442_ = f_442_ + f_458_ + f_454_;
			f_443_ = f_443_ + f_455_ + f_459_;
			f_444_ = f_444_ + f_456_ + f_460_;
		}
		float f_461_ = f_443_ + (f_441_ - f);
		float f_462_ = f_442_ + (f_444_ - f_440_);
		aClass124_Sub1_Sub1_9038.method1609((i & 0x1) != 0);
		aClass167_Sub2_9035.method8614();
		aClass167_Sub2_9035.method8617(aClass124_Sub1_Sub1_9038);
		aClass167_Sub2_9035.method8557(1);
		aClass167_Sub2_9035.method8556(1);
		aClass167_Sub2_9035.method8617(class124_sub1_sub1);
		aClass167_Sub2_9035.method8558(7681, 8448);
		aClass167_Sub2_9035.method8520(0, 34168, 768);
		aClass167_Sub2_9035.method8567(1);
		float f_463_ = (class124_sub1_sub1.aFloat11363 / (float) class124_sub1_sub1.anInt11361);
		float f_464_ = (class124_sub1_sub1.aFloat11362 / (float) class124_sub1_sub1.anInt11365);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glMultiTexCoord2f(33985, f_463_ * (f - (float) i_445_), (class124_sub1_sub1.aFloat11362 - f_464_ * (f_440_ - (float) i_446_)));
		OpenGL.glVertex2f(f, f_440_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_463_ * (f_443_ - (float) i_445_), (class124_sub1_sub1.aFloat11362 - f_464_ * (f_444_ - (float) i_446_)));
		OpenGL.glVertex2f(f_443_, f_444_);
		OpenGL.glMultiTexCoord2f(33984, aClass124_Sub1_Sub1_9038.aFloat11363, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_463_ * (f_461_ - (float) i_445_), (class124_sub1_sub1.aFloat11362 - f_464_ * (f_462_ - (float) i_446_)));
		OpenGL.glVertex2f(f_461_, f_462_);
		OpenGL.glMultiTexCoord2f(33984, aClass124_Sub1_Sub1_9038.aFloat11363, aClass124_Sub1_Sub1_9038.aFloat11362);
		OpenGL.glMultiTexCoord2f(33985, f_463_ * (f_441_ - (float) i_445_), (class124_sub1_sub1.aFloat11362 - f_464_ * (f_442_ - (float) i_446_)));
		OpenGL.glVertex2f(f_441_, f_442_);
		OpenGL.glEnd();
		aClass167_Sub2_9035.method8520(0, 5890, 768);
		aClass167_Sub2_9035.method8557(0);
		aClass167_Sub2_9035.method8617(null);
		aClass167_Sub2_9035.method8556(0);
	}

	void method8482() {
		aClass167_Sub2_9035.method8556(1);
		aClass167_Sub2_9035.method8617(null);
		aClass167_Sub2_9035.method8558(8448, 8448);
		aClass167_Sub2_9035.method8520(1, 34168, 768);
		aClass167_Sub2_9035.method8560(0, 5890, 770);
		aClass167_Sub2_9035.method8556(0);
		aClass167_Sub2_9035.method8520(1, 34168, 768);
	}
}
