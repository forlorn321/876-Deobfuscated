/* Class184_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class184_Sub4 extends FontRenderer {
	Class124_Sub1_Sub1 aClass124_Sub1_Sub1_9900;
	Class167_Sub2 aClass167_Sub2_9901;
	Class125 aClass125_9902;
	boolean aBool9903;

	void method2751(char c, int i, int i_0_, int i_1_, boolean bool, Class161 class161, int i_2_, int i_3_) {
		Class161_Sub3 class161_sub3 = (Class161_Sub3) class161;
		Class124_Sub1_Sub1 class124_sub1_sub1 = class161_sub3.aClass124_Sub1_Sub1_9525;
		aClass167_Sub2_9901.method8551();
		aClass167_Sub2_9901.method8617(aClass124_Sub1_Sub1_9900);
		if (aBool9903 || bool) {
			aClass167_Sub2_9901.method8558(7681, 8448);
			aClass167_Sub2_9901.method8520(0, 34168, 768);
		} else
			aClass167_Sub2_9901.method8558(7681, 7681);
		aClass167_Sub2_9901.method8556(1);
		aClass167_Sub2_9901.method8617(class124_sub1_sub1);
		aClass167_Sub2_9901.method8558(7681, 8448);
		aClass167_Sub2_9901.method8520(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f = (class124_sub1_sub1.aFloat11363 / (float) class124_sub1_sub1.anInt11361);
		float f_4_ = (class124_sub1_sub1.aFloat11362 / (float) class124_sub1_sub1.anInt11365);
		OpenGL.glTexGenfv(8192, 9474, new float[] { f, 0.0F, 0.0F, (float) -i_2_ * f }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_4_, 0.0F, (float) -i_3_ * f_4_ }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_1_ >> 16), (byte) (i_1_ >> 8), (byte) i_1_, (byte) (i_1_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_0_, 0.0F);
		aClass125_9902.method1639(c);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		aClass167_Sub2_9901.method8520(0, 5890, 768);
		aClass167_Sub2_9901.method8558(8448, 8448);
		aClass167_Sub2_9901.method8617(null);
		aClass167_Sub2_9901.method8556(0);
		if (aBool9903 || bool)
			aClass167_Sub2_9901.method8520(0, 5890, 768);
	}

	void method2755(char c, int i, int i_5_, int i_6_, boolean bool) {
		aClass167_Sub2_9901.method8551();
		aClass167_Sub2_9901.method8617(aClass124_Sub1_Sub1_9900);
		if (aBool9903 || bool) {
			aClass167_Sub2_9901.method8558(7681, 8448);
			aClass167_Sub2_9901.method8520(0, 34168, 768);
		} else
			aClass167_Sub2_9901.method8558(7681, 7681);
		OpenGL.glColor4ub((byte) (i_6_ >> 16), (byte) (i_6_ >> 8), (byte) i_6_, (byte) (i_6_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_5_, 0.0F);
		aClass125_9902.method1639(c);
		OpenGL.glLoadIdentity();
		if (aBool9903 || bool)
			aClass167_Sub2_9901.method8520(0, 5890, 768);
	}

	Class184_Sub4(Class167_Sub2 class167_sub2, Class2 class2, Class179[] class179s, boolean bool) {
		super(class167_sub2, class2);
		aClass167_Sub2_9901 = class167_sub2;
		int i = 0;
		for (int i_7_ = 0; i_7_ < 256; i_7_++) {
			Class179 class179 = class179s[i_7_];
			if (class179.method2677() > i)
				i = class179.method2677();
			if (class179.method2633() > i)
				i = class179.method2633();
		}
		int i_8_ = i * 16;
		if (bool) {
			byte[] is = new byte[i_8_ * i_8_];
			for (int i_9_ = 0; i_9_ < 256; i_9_++) {
				Class179 class179 = class179s[i_9_];
				int i_10_ = class179.method2677();
				int i_11_ = class179.method2633();
				int i_12_ = i_9_ % 16 * i;
				int i_13_ = i_9_ / 16 * i;
				int i_14_ = i_13_ * i_8_ + i_12_;
				int i_15_ = 0;
				if (class179.method2631()) {
					Class179_Sub2 class179_sub2 = (Class179_Sub2) class179s[i_9_];
					if (!class179_sub2.method2641()) {
						byte[] is_16_ = class179_sub2.aByteArray9820;
						for (int i_17_ = 0; i_17_ < i_10_; i_17_++) {
							for (int i_18_ = 0; i_18_ < i_11_; i_18_++)
								is[i_14_++] = (byte) (is_16_[i_15_++] == 0 ? 0 : -1);
							i_14_ += i_8_ - i_11_;
						}
					} else {
						byte[] is_19_ = class179_sub2.aByteArray9821;
						for (int i_20_ = 0; i_20_ < i_10_; i_20_++) {
							for (int i_21_ = 0; i_21_ < i_11_; i_21_++)
								is[i_14_++] = is_19_[i_15_++];
							i_14_ += i_8_ - i_11_;
						}
					}
				} else {
					Class179_Sub1 class179_sub1 = (Class179_Sub1) class179s[i_9_];
					int[] is_22_ = class179_sub1.method2643(false);
					if (!class179_sub1.method2641()) {
						for (int i_23_ = 0; i_23_ < i_10_; i_23_++) {
							for (int i_24_ = 0; i_24_ < i_11_; i_24_++) {
								int i_25_ = is_22_[i_15_++];
								byte i_26_ = (byte) (((i_25_ >> 16 & 0xff) * 3 + (i_25_ >> 8 & 0xff) * 4 + (i_25_ & 0xff)) >> 3);
								is[i_14_++] = i_26_;
							}
							i_14_ += i_8_ - i_11_;
						}
					} else {
						for (int i_27_ = 0; i_27_ < i_10_; i_27_++) {
							for (int i_28_ = 0; i_28_ < i_11_; i_28_++)
								is[i_14_++] = (byte) (is_22_[i_15_++] >> 24 & 0xff);
							i_14_ += i_8_ - i_11_;
						}
					}
				}
			}
			aClass124_Sub1_Sub1_9900 = Class124_Sub1_Sub1.method10528(class167_sub2, Class155.aClass155_1729, Class171.aClass171_1905, i_8_, i_8_, false, is, Class155.aClass155_1729);
			aBool9903 = true;
		} else {
			int[] is = new int[i_8_ * i_8_];
			for (int i_29_ = 0; i_29_ < 256; i_29_++) {
				Class179 class179 = class179s[i_29_];
				int i_30_ = class179.method2677();
				int i_31_ = class179.method2633();
				int i_32_ = i_29_ % 16 * i;
				int i_33_ = i_29_ / 16 * i;
				int i_34_ = i_33_ * i_8_ + i_32_;
				int i_35_ = 0;
				if (class179.method2631()) {
					Class179_Sub2 class179_sub2 = (Class179_Sub2) class179s[i_29_];
					int[] is_36_ = class179_sub2.anIntArray9813;
					byte[] is_37_ = class179_sub2.aByteArray9821;
					byte[] is_38_ = class179_sub2.aByteArray9820;
					if (is_37_ != null) {
						for (int i_39_ = 0; i_39_ < i_30_; i_39_++) {
							for (int i_40_ = 0; i_40_ < i_31_; i_40_++) {
								is[i_34_++] = (is_37_[i_35_] << 24 | is_36_[is_38_[i_35_] & 0xff]);
								i_35_++;
							}
							i_34_ += i_8_ - i_31_;
						}
					} else {
						for (int i_41_ = 0; i_41_ < i_30_; i_41_++) {
							for (int i_42_ = 0; i_42_ < i_31_; i_42_++) {
								int i_43_;
								if ((i_43_ = is_38_[i_35_++]) != 0)
									is[i_34_++] = ~0xffffff | is_36_[i_43_ & 0xff];
								else
									i_34_++;
							}
							i_34_ += i_8_ - i_31_;
						}
					}
				} else {
					Class179_Sub1 class179_sub1 = (Class179_Sub1) class179s[i_29_];
					int[] is_44_ = class179_sub1.method2643(false);
					if (!class179_sub1.method2641()) {
						for (int i_45_ = 0; i_45_ < i_30_; i_45_++) {
							for (int i_46_ = 0; i_46_ < i_31_; i_46_++) {
								int i_47_ = is_44_[i_35_] & 0xffffff;
								is[i_34_++] = (i_47_ == 0 ? 0 : 255) << 24 | i_47_;
								i_35_++;
							}
							i_34_ += i_8_ - i_31_;
						}
					} else {
						for (int i_48_ = 0; i_48_ < i_30_; i_48_++) {
							for (int i_49_ = 0; i_49_ < i_31_; i_49_++)
								is[i_34_++] = is_44_[i_35_++];
							i_34_ += i_8_ - i_31_;
						}
					}
				}
			}
			aClass124_Sub1_Sub1_9900 = Class124_Sub1_Sub1.method10527(class167_sub2, i_8_, i_8_, false, is, 0, 0);
			aBool9903 = false;
		}
		aClass124_Sub1_Sub1_9900.method1609(false);
		aClass125_9902 = new Class125(class167_sub2, 256);
		float f = (aClass124_Sub1_Sub1_9900.aFloat11363 / (float) aClass124_Sub1_Sub1_9900.anInt11361);
		float f_50_ = (aClass124_Sub1_Sub1_9900.aFloat11362 / (float) aClass124_Sub1_Sub1_9900.anInt11365);
		for (int i_51_ = 0; i_51_ < 256; i_51_++) {
			Class179 class179 = class179s[i_51_];
			int i_52_ = class179.method2677();
			int i_53_ = class179.method2633();
			int i_54_ = class179.method2637();
			int i_55_ = class179.method2635();
			float f_56_ = (float) (i_51_ % 16 * i);
			float f_57_ = (float) (i_51_ / 16 * i);
			float f_58_ = f_56_ * f;
			float f_59_ = f_57_ * f_50_;
			float f_60_ = (f_56_ + (float) i_53_) * f;
			float f_61_ = (f_57_ + (float) i_52_) * f_50_;
			aClass125_9902.method1636(i_51_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(f_58_, aClass124_Sub1_Sub1_9900.aFloat11362 - f_59_);
			OpenGL.glVertex2i(i_55_, i_54_);
			OpenGL.glTexCoord2f(f_58_, aClass124_Sub1_Sub1_9900.aFloat11362 - f_61_);
			OpenGL.glVertex2i(i_55_, i_54_ + i_52_);
			OpenGL.glTexCoord2f(f_60_, aClass124_Sub1_Sub1_9900.aFloat11362 - f_61_);
			OpenGL.glVertex2i(i_55_ + i_53_, i_54_ + i_52_);
			OpenGL.glTexCoord2f(f_60_, aClass124_Sub1_Sub1_9900.aFloat11362 - f_59_);
			OpenGL.glVertex2i(i_55_ + i_53_, i_54_);
			OpenGL.glEnd();
			aClass125_9902.method1638();
		}
	}

	void method2762(char c, int i, int i_62_, int i_63_, boolean bool) {
		aClass167_Sub2_9901.method8551();
		aClass167_Sub2_9901.method8617(aClass124_Sub1_Sub1_9900);
		if (aBool9903 || bool) {
			aClass167_Sub2_9901.method8558(7681, 8448);
			aClass167_Sub2_9901.method8520(0, 34168, 768);
		} else
			aClass167_Sub2_9901.method8558(7681, 7681);
		OpenGL.glColor4ub((byte) (i_63_ >> 16), (byte) (i_63_ >> 8), (byte) i_63_, (byte) (i_63_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_62_, 0.0F);
		aClass125_9902.method1639(c);
		OpenGL.glLoadIdentity();
		if (aBool9903 || bool)
			aClass167_Sub2_9901.method8520(0, 5890, 768);
	}

	void method2753(char c, int i, int i_64_, int i_65_, boolean bool) {
		aClass167_Sub2_9901.method8551();
		aClass167_Sub2_9901.method8617(aClass124_Sub1_Sub1_9900);
		if (aBool9903 || bool) {
			aClass167_Sub2_9901.method8558(7681, 8448);
			aClass167_Sub2_9901.method8520(0, 34168, 768);
		} else
			aClass167_Sub2_9901.method8558(7681, 7681);
		OpenGL.glColor4ub((byte) (i_65_ >> 16), (byte) (i_65_ >> 8), (byte) i_65_, (byte) (i_65_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_64_, 0.0F);
		aClass125_9902.method1639(c);
		OpenGL.glLoadIdentity();
		if (aBool9903 || bool)
			aClass167_Sub2_9901.method8520(0, 5890, 768);
	}

	void method2756(char c, int i, int i_66_, int i_67_, boolean bool, Class161 class161, int i_68_, int i_69_) {
		Class161_Sub3 class161_sub3 = (Class161_Sub3) class161;
		Class124_Sub1_Sub1 class124_sub1_sub1 = class161_sub3.aClass124_Sub1_Sub1_9525;
		aClass167_Sub2_9901.method8551();
		aClass167_Sub2_9901.method8617(aClass124_Sub1_Sub1_9900);
		if (aBool9903 || bool) {
			aClass167_Sub2_9901.method8558(7681, 8448);
			aClass167_Sub2_9901.method8520(0, 34168, 768);
		} else
			aClass167_Sub2_9901.method8558(7681, 7681);
		aClass167_Sub2_9901.method8556(1);
		aClass167_Sub2_9901.method8617(class124_sub1_sub1);
		aClass167_Sub2_9901.method8558(7681, 8448);
		aClass167_Sub2_9901.method8520(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f = (class124_sub1_sub1.aFloat11363 / (float) class124_sub1_sub1.anInt11361);
		float f_70_ = (class124_sub1_sub1.aFloat11362 / (float) class124_sub1_sub1.anInt11365);
		OpenGL.glTexGenfv(8192, 9474, new float[] { f, 0.0F, 0.0F, (float) -i_68_ * f }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_70_, 0.0F, (float) -i_69_ * f_70_ }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_67_ >> 16), (byte) (i_67_ >> 8), (byte) i_67_, (byte) (i_67_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_66_, 0.0F);
		aClass125_9902.method1639(c);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		aClass167_Sub2_9901.method8520(0, 5890, 768);
		aClass167_Sub2_9901.method8558(8448, 8448);
		aClass167_Sub2_9901.method8617(null);
		aClass167_Sub2_9901.method8556(0);
		if (aBool9903 || bool)
			aClass167_Sub2_9901.method8520(0, 5890, 768);
	}

	void method2752(char c, int i, int i_71_, int i_72_, boolean bool, Class161 class161, int i_73_, int i_74_) {
		Class161_Sub3 class161_sub3 = (Class161_Sub3) class161;
		Class124_Sub1_Sub1 class124_sub1_sub1 = class161_sub3.aClass124_Sub1_Sub1_9525;
		aClass167_Sub2_9901.method8551();
		aClass167_Sub2_9901.method8617(aClass124_Sub1_Sub1_9900);
		if (aBool9903 || bool) {
			aClass167_Sub2_9901.method8558(7681, 8448);
			aClass167_Sub2_9901.method8520(0, 34168, 768);
		} else
			aClass167_Sub2_9901.method8558(7681, 7681);
		aClass167_Sub2_9901.method8556(1);
		aClass167_Sub2_9901.method8617(class124_sub1_sub1);
		aClass167_Sub2_9901.method8558(7681, 8448);
		aClass167_Sub2_9901.method8520(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f = (class124_sub1_sub1.aFloat11363 / (float) class124_sub1_sub1.anInt11361);
		float f_75_ = (class124_sub1_sub1.aFloat11362 / (float) class124_sub1_sub1.anInt11365);
		OpenGL.glTexGenfv(8192, 9474, new float[] { f, 0.0F, 0.0F, (float) -i_73_ * f }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_75_, 0.0F, (float) -i_74_ * f_75_ }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_72_ >> 16), (byte) (i_72_ >> 8), (byte) i_72_, (byte) (i_72_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_71_, 0.0F);
		aClass125_9902.method1639(c);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		aClass167_Sub2_9901.method8520(0, 5890, 768);
		aClass167_Sub2_9901.method8558(8448, 8448);
		aClass167_Sub2_9901.method8617(null);
		aClass167_Sub2_9901.method8556(0);
		if (aBool9903 || bool)
			aClass167_Sub2_9901.method8520(0, 5890, 768);
	}

	void method2757(char c, int i, int i_76_, int i_77_, boolean bool, Class161 class161, int i_78_, int i_79_) {
		Class161_Sub3 class161_sub3 = (Class161_Sub3) class161;
		Class124_Sub1_Sub1 class124_sub1_sub1 = class161_sub3.aClass124_Sub1_Sub1_9525;
		aClass167_Sub2_9901.method8551();
		aClass167_Sub2_9901.method8617(aClass124_Sub1_Sub1_9900);
		if (aBool9903 || bool) {
			aClass167_Sub2_9901.method8558(7681, 8448);
			aClass167_Sub2_9901.method8520(0, 34168, 768);
		} else
			aClass167_Sub2_9901.method8558(7681, 7681);
		aClass167_Sub2_9901.method8556(1);
		aClass167_Sub2_9901.method8617(class124_sub1_sub1);
		aClass167_Sub2_9901.method8558(7681, 8448);
		aClass167_Sub2_9901.method8520(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f = (class124_sub1_sub1.aFloat11363 / (float) class124_sub1_sub1.anInt11361);
		float f_80_ = (class124_sub1_sub1.aFloat11362 / (float) class124_sub1_sub1.anInt11365);
		OpenGL.glTexGenfv(8192, 9474, new float[] { f, 0.0F, 0.0F, (float) -i_78_ * f }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_80_, 0.0F, (float) -i_79_ * f_80_ }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_77_ >> 16), (byte) (i_77_ >> 8), (byte) i_77_, (byte) (i_77_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_76_, 0.0F);
		aClass125_9902.method1639(c);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		aClass167_Sub2_9901.method8520(0, 5890, 768);
		aClass167_Sub2_9901.method8558(8448, 8448);
		aClass167_Sub2_9901.method8617(null);
		aClass167_Sub2_9901.method8556(0);
		if (aBool9903 || bool)
			aClass167_Sub2_9901.method8520(0, 5890, 768);
	}

	void method2749(char c, int i, int i_81_, int i_82_, boolean bool, Class161 class161, int i_83_, int i_84_) {
		Class161_Sub3 class161_sub3 = (Class161_Sub3) class161;
		Class124_Sub1_Sub1 class124_sub1_sub1 = class161_sub3.aClass124_Sub1_Sub1_9525;
		aClass167_Sub2_9901.method8551();
		aClass167_Sub2_9901.method8617(aClass124_Sub1_Sub1_9900);
		if (aBool9903 || bool) {
			aClass167_Sub2_9901.method8558(7681, 8448);
			aClass167_Sub2_9901.method8520(0, 34168, 768);
		} else
			aClass167_Sub2_9901.method8558(7681, 7681);
		aClass167_Sub2_9901.method8556(1);
		aClass167_Sub2_9901.method8617(class124_sub1_sub1);
		aClass167_Sub2_9901.method8558(7681, 8448);
		aClass167_Sub2_9901.method8520(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f = (class124_sub1_sub1.aFloat11363 / (float) class124_sub1_sub1.anInt11361);
		float f_85_ = (class124_sub1_sub1.aFloat11362 / (float) class124_sub1_sub1.anInt11365);
		OpenGL.glTexGenfv(8192, 9474, new float[] { f, 0.0F, 0.0F, (float) -i_83_ * f }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_85_, 0.0F, (float) -i_84_ * f_85_ }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_82_ >> 16), (byte) (i_82_ >> 8), (byte) i_82_, (byte) (i_82_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_81_, 0.0F);
		aClass125_9902.method1639(c);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		aClass167_Sub2_9901.method8520(0, 5890, 768);
		aClass167_Sub2_9901.method8558(8448, 8448);
		aClass167_Sub2_9901.method8617(null);
		aClass167_Sub2_9901.method8556(0);
		if (aBool9903 || bool)
			aClass167_Sub2_9901.method8520(0, 5890, 768);
	}
}
