/* Class174_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class174_Sub5 extends Class174 {
	boolean aBool9879;
	Class118_Sub3_Sub1 aClass118_Sub3_Sub1_9880;
	Class180_Sub3 aClass180_Sub3_9881;
	Class121 aClass121_9882;

	void method2758(char c, int i, int i_0_, int i_1_, boolean bool) {
		aClass180_Sub3_9881.method15349();
		aClass180_Sub3_9881.method15401(aClass118_Sub3_Sub1_9880);
		if (aBool9879 || bool) {
			aClass180_Sub3_9881.method15403(7681, 8448);
			aClass180_Sub3_9881.method15404(0, 34168, 768);
		} else
			aClass180_Sub3_9881.method15403(7681, 7681);
		OpenGL.glColor4ub((byte) (i_1_ >> 16), (byte) (i_1_ >> 8), (byte) i_1_, (byte) (i_1_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_0_, 0.0F);
		aClass121_9882.method2127(c);
		OpenGL.glLoadIdentity();
		if (aBool9879 || bool)
			aClass180_Sub3_9881.method15404(0, 5890, 768);
	}

	void method2760(char c, int i, int i_2_, int i_3_, boolean bool) {
		aClass180_Sub3_9881.method15349();
		aClass180_Sub3_9881.method15401(aClass118_Sub3_Sub1_9880);
		if (aBool9879 || bool) {
			aClass180_Sub3_9881.method15403(7681, 8448);
			aClass180_Sub3_9881.method15404(0, 34168, 768);
		} else
			aClass180_Sub3_9881.method15403(7681, 7681);
		OpenGL.glColor4ub((byte) (i_3_ >> 16), (byte) (i_3_ >> 8), (byte) i_3_, (byte) (i_3_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_2_, 0.0F);
		aClass121_9882.method2127(c);
		OpenGL.glLoadIdentity();
		if (aBool9879 || bool)
			aClass180_Sub3_9881.method15404(0, 5890, 768);
	}

	void method2759(char c, int i, int i_4_, int i_5_, boolean bool, Class142 class142, int i_6_, int i_7_) {
		Class142_Sub3 class142_sub3 = (Class142_Sub3) class142;
		Class118_Sub3_Sub1 class118_sub3_sub1 = class142_sub3.aClass118_Sub3_Sub1_9382;
		aClass180_Sub3_9881.method15349();
		aClass180_Sub3_9881.method15401(aClass118_Sub3_Sub1_9880);
		if (aBool9879 || bool) {
			aClass180_Sub3_9881.method15403(7681, 8448);
			aClass180_Sub3_9881.method15404(0, 34168, 768);
		} else
			aClass180_Sub3_9881.method15403(7681, 7681);
		aClass180_Sub3_9881.method15400(1);
		aClass180_Sub3_9881.method15401(class118_sub3_sub1);
		aClass180_Sub3_9881.method15403(7681, 8448);
		aClass180_Sub3_9881.method15404(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f = (class118_sub3_sub1.aFloat11377 / (float) class118_sub3_sub1.anInt11375);
		float f_8_ = (class118_sub3_sub1.aFloat11376 / (float) class118_sub3_sub1.anInt11379);
		OpenGL.glTexGenfv(8192, 9474, new float[] { f, 0.0F, 0.0F, (float) -i_6_ * f }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_8_, 0.0F, (float) -i_7_ * f_8_ }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_5_ >> 16), (byte) (i_5_ >> 8), (byte) i_5_, (byte) (i_5_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_4_, 0.0F);
		aClass121_9882.method2127(c);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		aClass180_Sub3_9881.method15404(0, 5890, 768);
		aClass180_Sub3_9881.method15403(8448, 8448);
		aClass180_Sub3_9881.method15401(null);
		aClass180_Sub3_9881.method15400(0);
		if (aBool9879 || bool)
			aClass180_Sub3_9881.method15404(0, 5890, 768);
	}

	Class174_Sub5(Class180_Sub3 class180_sub3, Class22 class22, Class185[] class185s, boolean bool) {
		super(class180_sub3, class22);
		aClass180_Sub3_9881 = class180_sub3;
		int i = 0;
		for (int i_9_ = 0; i_9_ < 256; i_9_++) {
			Class185 class185 = class185s[i_9_];
			if (class185.method3570() > i)
				i = class185.method3570();
			if (class185.method3636() > i)
				i = class185.method3636();
		}
		int i_10_ = i * 16;
		if (bool) {
			byte[] is = new byte[i_10_ * i_10_];
			for (int i_11_ = 0; i_11_ < 256; i_11_++) {
				Class185 class185 = class185s[i_11_];
				int i_12_ = class185.method3570();
				int i_13_ = class185.method3636();
				int i_14_ = i_11_ % 16 * i;
				int i_15_ = i_11_ / 16 * i;
				int i_16_ = i_15_ * i_10_ + i_14_;
				int i_17_ = 0;
				if (class185.method3567()) {
					Class185_Sub2 class185_sub2 = (Class185_Sub2) class185s[i_11_];
					if (!class185_sub2.method3568()) {
						byte[] is_18_ = class185_sub2.aByteArray9371;
						for (int i_19_ = 0; i_19_ < i_12_; i_19_++) {
							for (int i_20_ = 0; i_20_ < i_13_; i_20_++)
								is[i_16_++] = (byte) (is_18_[i_17_++] == 0 ? 0 : -1);
							i_16_ += i_10_ - i_13_;
						}
					} else {
						byte[] is_21_ = class185_sub2.aByteArray9379;
						for (int i_22_ = 0; i_22_ < i_12_; i_22_++) {
							for (int i_23_ = 0; i_23_ < i_13_; i_23_++)
								is[i_16_++] = is_21_[i_17_++];
							i_16_ += i_10_ - i_13_;
						}
					}
				} else {
					Class185_Sub1 class185_sub1 = (Class185_Sub1) class185s[i_11_];
					int[] is_24_ = class185_sub1.method3584(false);
					if (!class185_sub1.method3568()) {
						for (int i_25_ = 0; i_25_ < i_12_; i_25_++) {
							for (int i_26_ = 0; i_26_ < i_13_; i_26_++) {
								int i_27_ = is_24_[i_17_++];
								byte i_28_ = (byte) (((i_27_ >> 16 & 0xff) * 3 + (i_27_ >> 8 & 0xff) * 4 + (i_27_ & 0xff)) >> 3);
								is[i_16_++] = i_28_;
							}
							i_16_ += i_10_ - i_13_;
						}
					} else {
						for (int i_29_ = 0; i_29_ < i_12_; i_29_++) {
							for (int i_30_ = 0; i_30_ < i_13_; i_30_++)
								is[i_16_++] = (byte) (is_24_[i_17_++] >> 24 & 0xff);
							i_16_ += i_10_ - i_13_;
						}
					}
				}
			}
			aClass118_Sub3_Sub1_9880 = Class118_Sub3_Sub1.method17946(class180_sub3, Class157.aClass157_1724, Class184.aClass184_2104, i_10_, i_10_, false, is, Class157.aClass157_1724);
			aBool9879 = true;
		} else {
			int[] is = new int[i_10_ * i_10_];
			for (int i_31_ = 0; i_31_ < 256; i_31_++) {
				Class185 class185 = class185s[i_31_];
				int i_32_ = class185.method3570();
				int i_33_ = class185.method3636();
				int i_34_ = i_31_ % 16 * i;
				int i_35_ = i_31_ / 16 * i;
				int i_36_ = i_35_ * i_10_ + i_34_;
				int i_37_ = 0;
				if (class185.method3567()) {
					Class185_Sub2 class185_sub2 = (Class185_Sub2) class185s[i_31_];
					int[] is_38_ = class185_sub2.anIntArray9377;
					byte[] is_39_ = class185_sub2.aByteArray9379;
					byte[] is_40_ = class185_sub2.aByteArray9371;
					if (is_39_ != null) {
						for (int i_41_ = 0; i_41_ < i_32_; i_41_++) {
							for (int i_42_ = 0; i_42_ < i_33_; i_42_++) {
								is[i_36_++] = (is_39_[i_37_] << 24 | is_38_[is_40_[i_37_] & 0xff]);
								i_37_++;
							}
							i_36_ += i_10_ - i_33_;
						}
					} else {
						for (int i_43_ = 0; i_43_ < i_32_; i_43_++) {
							for (int i_44_ = 0; i_44_ < i_33_; i_44_++) {
								int i_45_;
								if ((i_45_ = is_40_[i_37_++]) != 0)
									is[i_36_++] = ~0xffffff | is_38_[i_45_ & 0xff];
								else
									i_36_++;
							}
							i_36_ += i_10_ - i_33_;
						}
					}
				} else {
					Class185_Sub1 class185_sub1 = (Class185_Sub1) class185s[i_31_];
					int[] is_46_ = class185_sub1.method3584(false);
					if (!class185_sub1.method3568()) {
						for (int i_47_ = 0; i_47_ < i_32_; i_47_++) {
							for (int i_48_ = 0; i_48_ < i_33_; i_48_++) {
								int i_49_ = is_46_[i_37_] & 0xffffff;
								is[i_36_++] = (i_49_ == 0 ? 0 : 255) << 24 | i_49_;
								i_37_++;
							}
							i_36_ += i_10_ - i_33_;
						}
					} else {
						for (int i_50_ = 0; i_50_ < i_32_; i_50_++) {
							for (int i_51_ = 0; i_51_ < i_33_; i_51_++)
								is[i_36_++] = is_46_[i_37_++];
							i_36_ += i_10_ - i_33_;
						}
					}
				}
			}
			aClass118_Sub3_Sub1_9880 = Class118_Sub3_Sub1.method17947(class180_sub3, i_10_, i_10_, false, is, 0, 0);
			aBool9879 = false;
		}
		aClass118_Sub3_Sub1_9880.method2035(false);
		aClass121_9882 = new Class121(class180_sub3, 256);
		float f = (aClass118_Sub3_Sub1_9880.aFloat11377 / (float) aClass118_Sub3_Sub1_9880.anInt11375);
		float f_52_ = (aClass118_Sub3_Sub1_9880.aFloat11376 / (float) aClass118_Sub3_Sub1_9880.anInt11379);
		for (int i_53_ = 0; i_53_ < 256; i_53_++) {
			Class185 class185 = class185s[i_53_];
			int i_54_ = class185.method3570();
			int i_55_ = class185.method3636();
			int i_56_ = class185.method3611();
			int i_57_ = class185.method3634();
			float f_58_ = (float) (i_53_ % 16 * i);
			float f_59_ = (float) (i_53_ / 16 * i);
			float f_60_ = f_58_ * f;
			float f_61_ = f_59_ * f_52_;
			float f_62_ = (f_58_ + (float) i_55_) * f;
			float f_63_ = (f_59_ + (float) i_54_) * f_52_;
			aClass121_9882.method2126(i_53_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(f_60_, aClass118_Sub3_Sub1_9880.aFloat11376 - f_61_);
			OpenGL.glVertex2i(i_57_, i_56_);
			OpenGL.glTexCoord2f(f_60_, aClass118_Sub3_Sub1_9880.aFloat11376 - f_63_);
			OpenGL.glVertex2i(i_57_, i_56_ + i_54_);
			OpenGL.glTexCoord2f(f_62_, aClass118_Sub3_Sub1_9880.aFloat11376 - f_63_);
			OpenGL.glVertex2i(i_57_ + i_55_, i_56_ + i_54_);
			OpenGL.glTexCoord2f(f_62_, aClass118_Sub3_Sub1_9880.aFloat11376 - f_61_);
			OpenGL.glVertex2i(i_57_ + i_55_, i_56_);
			OpenGL.glEnd();
			aClass121_9882.method2129();
		}
	}

	void method2761(char c, int i, int i_64_, int i_65_, boolean bool) {
		aClass180_Sub3_9881.method15349();
		aClass180_Sub3_9881.method15401(aClass118_Sub3_Sub1_9880);
		if (aBool9879 || bool) {
			aClass180_Sub3_9881.method15403(7681, 8448);
			aClass180_Sub3_9881.method15404(0, 34168, 768);
		} else
			aClass180_Sub3_9881.method15403(7681, 7681);
		OpenGL.glColor4ub((byte) (i_65_ >> 16), (byte) (i_65_ >> 8), (byte) i_65_, (byte) (i_65_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_64_, 0.0F);
		aClass121_9882.method2127(c);
		OpenGL.glLoadIdentity();
		if (aBool9879 || bool)
			aClass180_Sub3_9881.method15404(0, 5890, 768);
	}

	void method2762(char c, int i, int i_66_, int i_67_, boolean bool, Class142 class142, int i_68_, int i_69_) {
		Class142_Sub3 class142_sub3 = (Class142_Sub3) class142;
		Class118_Sub3_Sub1 class118_sub3_sub1 = class142_sub3.aClass118_Sub3_Sub1_9382;
		aClass180_Sub3_9881.method15349();
		aClass180_Sub3_9881.method15401(aClass118_Sub3_Sub1_9880);
		if (aBool9879 || bool) {
			aClass180_Sub3_9881.method15403(7681, 8448);
			aClass180_Sub3_9881.method15404(0, 34168, 768);
		} else
			aClass180_Sub3_9881.method15403(7681, 7681);
		aClass180_Sub3_9881.method15400(1);
		aClass180_Sub3_9881.method15401(class118_sub3_sub1);
		aClass180_Sub3_9881.method15403(7681, 8448);
		aClass180_Sub3_9881.method15404(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f = (class118_sub3_sub1.aFloat11377 / (float) class118_sub3_sub1.anInt11375);
		float f_70_ = (class118_sub3_sub1.aFloat11376 / (float) class118_sub3_sub1.anInt11379);
		OpenGL.glTexGenfv(8192, 9474, new float[] { f, 0.0F, 0.0F, (float) -i_68_ * f }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_70_, 0.0F, (float) -i_69_ * f_70_ }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_67_ >> 16), (byte) (i_67_ >> 8), (byte) i_67_, (byte) (i_67_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_66_, 0.0F);
		aClass121_9882.method2127(c);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		aClass180_Sub3_9881.method15404(0, 5890, 768);
		aClass180_Sub3_9881.method15403(8448, 8448);
		aClass180_Sub3_9881.method15401(null);
		aClass180_Sub3_9881.method15400(0);
		if (aBool9879 || bool)
			aClass180_Sub3_9881.method15404(0, 5890, 768);
	}

	void method2763(char c, int i, int i_71_, int i_72_, boolean bool, Class142 class142, int i_73_, int i_74_) {
		Class142_Sub3 class142_sub3 = (Class142_Sub3) class142;
		Class118_Sub3_Sub1 class118_sub3_sub1 = class142_sub3.aClass118_Sub3_Sub1_9382;
		aClass180_Sub3_9881.method15349();
		aClass180_Sub3_9881.method15401(aClass118_Sub3_Sub1_9880);
		if (aBool9879 || bool) {
			aClass180_Sub3_9881.method15403(7681, 8448);
			aClass180_Sub3_9881.method15404(0, 34168, 768);
		} else
			aClass180_Sub3_9881.method15403(7681, 7681);
		aClass180_Sub3_9881.method15400(1);
		aClass180_Sub3_9881.method15401(class118_sub3_sub1);
		aClass180_Sub3_9881.method15403(7681, 8448);
		aClass180_Sub3_9881.method15404(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f = (class118_sub3_sub1.aFloat11377 / (float) class118_sub3_sub1.anInt11375);
		float f_75_ = (class118_sub3_sub1.aFloat11376 / (float) class118_sub3_sub1.anInt11379);
		OpenGL.glTexGenfv(8192, 9474, new float[] { f, 0.0F, 0.0F, (float) -i_73_ * f }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_75_, 0.0F, (float) -i_74_ * f_75_ }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_72_ >> 16), (byte) (i_72_ >> 8), (byte) i_72_, (byte) (i_72_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_71_, 0.0F);
		aClass121_9882.method2127(c);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		aClass180_Sub3_9881.method15404(0, 5890, 768);
		aClass180_Sub3_9881.method15403(8448, 8448);
		aClass180_Sub3_9881.method15401(null);
		aClass180_Sub3_9881.method15400(0);
		if (aBool9879 || bool)
			aClass180_Sub3_9881.method15404(0, 5890, 768);
	}
}
