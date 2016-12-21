/* Class124_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class124_Sub1 extends Class124 {
	int anInt8870;
	int anInt8871;

	Class124_Sub1(Class167_Sub2 class167_sub2, int i, int i_0_, int i_1_, boolean bool, int[] is, int i_2_, int i_3_, boolean bool_4_) {
		super(class167_sub2, i, Class155.aClass155_1722, Class171.aClass171_1905, i_0_ * i_1_, bool);
		anInt8871 = i_0_;
		anInt8870 = i_1_;
		if (bool_4_) {
			int[] is_5_ = new int[is.length];
			for (int i_6_ = 0; i_6_ < i_1_; i_6_++) {
				int i_7_ = i_6_ * i_0_;
				int i_8_ = (i_1_ - i_6_ - 1) * i_0_;
				for (int i_9_ = 0; i_9_ < i_0_; i_9_++)
					is_5_[i_7_++] = is[i_8_++];
			}
			is = is_5_;
		}
		aClass167_Sub2_1488.method8617(this);
		if (anInt1496 == 34037 || !bool || i_2_ != 0 || i_3_ != 0) {
			OpenGL.glPixelStorei(3314, i_2_);
			OpenGL.glTexImage2Di(anInt1496, 0, Class167_Sub2.method8519(aClass155_1495, aClass171_1498), anInt8871, anInt8870, 0, 32993, aClass167_Sub2_1488.anInt9309, is, i_3_ * 4);
			OpenGL.glPixelStorei(3314, 0);
			method1617(false);
		} else {
			method1612(anInt1496, Class167_Sub2.method8519(aClass155_1495, aClass171_1498), anInt8871, anInt8870, 32993, aClass167_Sub2_1488.anInt9309, is);
			method1617(true);
		}
		method1609(true);
	}

	Class124_Sub1(Class167_Sub2 class167_sub2, int i, Class155 class155, Class171 class171, int i_10_, int i_11_, boolean bool, byte[] is, Class155 class155_12_, boolean bool_13_) {
		super(class167_sub2, i, class155, class171, i_10_ * i_11_, bool);
		anInt8871 = i_10_;
		anInt8870 = i_11_;
		if (bool_13_) {
			byte[] is_14_ = new byte[is.length];
			for (int i_15_ = 0; i_15_ < i_11_; i_15_++) {
				int i_16_ = i_15_ * i_10_;
				int i_17_ = (i_11_ - i_15_ - 1) * i_10_;
				for (int i_18_ = 0; i_18_ < i_10_; i_18_++)
					is_14_[i_16_++] = is[i_17_++];
			}
			is = is_14_;
		}
		aClass167_Sub2_1488.method8617(this);
		OpenGL.glPixelStorei(3317, 1);
		if (bool && anInt1496 != 34037) {
			method1608(i, Class167_Sub2.method8519(aClass155_1495, aClass171_1498), i_10_, i_11_, class155_12_, is);
			method1617(true);
		} else {
			OpenGL.glTexImage2Dub(anInt1496, 0, Class167_Sub2.method8519(aClass155_1495, aClass171_1498), anInt8871, anInt8870, 0, Class167_Sub2.method8576(class155_12_), 5121, is, 0);
			method1617(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		method1609(true);
	}

	Class124_Sub1(Class167_Sub2 class167_sub2, int i, Class155 class155, Class171 class171, int i_19_, int i_20_) {
		super(class167_sub2, i, class155, class171, i_19_ * i_20_, false);
		anInt8871 = i_19_;
		anInt8870 = i_20_;
		aClass167_Sub2_1488.method8617(this);
		OpenGL.glTexImage2Dub(anInt1496, 0, Class167_Sub2.method8519(aClass155_1495, aClass171_1498), i_19_, i_20_, 0, Class167_Sub2.method8576(aClass155_1495), 5121, null, 0);
		method1609(true);
	}

	void method8394(boolean bool, boolean bool_21_) {
		if (anInt1496 == 3553) {
			aClass167_Sub2_1488.method8617(this);
			OpenGL.glTexParameteri(anInt1496, 10242, bool ? 10497 : 33071);
			OpenGL.glTexParameteri(anInt1496, 10243, bool_21_ ? 10497 : 33071);
		}
	}

	void method8395(int i, int i_22_, int i_23_, int i_24_, byte[] is, Class155 class155, int i_25_, int i_26_, boolean bool) {
		if (i_26_ == 0)
			i_26_ = i_23_;
		if (bool) {
			int i_27_ = class155.anInt1732 * -2037186451;
			int i_28_ = i_27_ * i_23_;
			int i_29_ = i_27_ * i_26_;
			byte[] is_30_ = new byte[i_28_ * i_24_];
			for (int i_31_ = 0; i_31_ < i_24_; i_31_++) {
				int i_32_ = i_31_ * i_28_;
				int i_33_ = (i_24_ - i_31_ - 1) * i_29_ + i_25_;
				for (int i_34_ = 0; i_34_ < i_28_; i_34_++)
					is_30_[i_32_++] = is[i_33_++];
			}
			is = is_30_;
		}
		aClass167_Sub2_1488.method8617(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_26_ != i_23_)
			OpenGL.glPixelStorei(3314, i_26_);
		OpenGL.glTexSubImage2Dub(anInt1496, 0, i, anInt8870 - i_22_ - i_24_, i_23_, i_24_, Class167_Sub2.method8576(class155), 5121, is, i_25_);
		if (i_26_ != i_23_)
			OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	void method8396(int i, int i_35_, int i_36_, int i_37_, int[] is, int[] is_38_, int i_39_) {
		int[] is_40_ = is_38_ == null ? new int[anInt8871 * anInt8870] : is_38_;
		aClass167_Sub2_1488.method8617(this);
		OpenGL.glGetTexImagei(anInt1496, 0, 32993, 5121, is_40_, 0);
		for (int i_41_ = 0; i_41_ < i_37_; i_41_++)
			System.arraycopy(is_40_, (i_35_ + (i_37_ - 1) - i_41_) * anInt8871, is, i_39_ + i_41_ * i_36_, i_36_);
	}

	void method8397(int i, int i_42_, int i_43_, int i_44_, int[] is, int i_45_, int i_46_, boolean bool) {
		if (i_46_ == 0)
			i_46_ = i_43_;
		if (bool) {
			int[] is_47_ = new int[i_43_ * i_44_];
			for (int i_48_ = 0; i_48_ < i_44_; i_48_++) {
				int i_49_ = i_48_ * i_43_;
				int i_50_ = (i_44_ - i_48_ - 1) * i_46_ + i_45_;
				for (int i_51_ = 0; i_51_ < i_43_; i_51_++)
					is_47_[i_49_++] = is[i_50_++];
			}
			is = is_47_;
		}
		aClass167_Sub2_1488.method8617(this);
		if (i_43_ != i_46_)
			OpenGL.glPixelStorei(3314, i_46_);
		OpenGL.glTexSubImage2Di(anInt1496, 0, i, anInt8870 - i_42_ - i_44_, i_43_, i_44_, 32993, aClass167_Sub2_1488.anInt9309, is, i_45_);
		if (i_43_ != i_46_)
			OpenGL.glPixelStorei(3314, 0);
	}

	Class124_Sub1(Class167_Sub2 class167_sub2, int i, Class155 class155, Class171 class171, int i_52_, int i_53_, boolean bool, float[] fs, Class155 class155_54_) {
		super(class167_sub2, i, class155, class171, i_52_ * i_53_, bool);
		anInt8871 = i_52_;
		anInt8870 = i_53_;
		aClass167_Sub2_1488.method8617(this);
		if (bool && anInt1496 != 34037) {
			method1618(i, Class167_Sub2.method8519(aClass155_1495, aClass171_1498), i_52_, i_53_, class155_54_, fs);
			method1617(true);
		} else {
			OpenGL.glTexImage2Df(anInt1496, 0, Class167_Sub2.method8519(aClass155_1495, aClass171_1498), anInt8871, anInt8870, 0, Class167_Sub2.method8576(class155_54_), 5126, fs, 0);
			method1617(false);
		}
		method1609(true);
	}

	Interface22 method8398(int i) {
		return new Class157(this, i);
	}

	Interface21 method8399(int i) {
		return new Class157(this, i);
	}

	Class124_Sub1(Class167_Sub2 class167_sub2, int i, int i_55_, int i_56_, int i_57_, int i_58_) {
		super(class167_sub2, i, Class155.aClass155_1724, Class171.aClass171_1905, i_57_ * i_58_, false);
		anInt8871 = i_57_;
		anInt8870 = i_58_;
		aClass167_Sub2_1488.method8617(this);
		Class183 class183 = aClass167_Sub2_1488.method2278((byte) -116);
		if (class183 != null) {
			int i_59_ = class183.method2726() - (i_56_ + i_58_);
			int i_60_ = Class167_Sub2.method8519(aClass155_1495, aClass171_1498);
			OpenGL.glCopyTexImage2D(anInt1496, 0, i_60_, i_55_, i_59_, i_57_, i_58_, 0);
		}
		method1609(true);
	}

	void method8400(int i, int i_61_, int i_62_, int i_63_, int i_64_, int i_65_) {
		Class183 class183 = aClass167_Sub2_1488.method2278((byte) -76);
		if (class183 != null) {
			int i_66_ = class183.method2726() - (i_65_ + i_63_);
			aClass167_Sub2_1488.method8617(this);
			OpenGL.glCopyTexSubImage2D(anInt1496, 0, i, anInt8870 - (i_61_ + i_63_), i_64_, i_66_, i_62_, i_63_);
			OpenGL.glFlush();
		}
	}
}
