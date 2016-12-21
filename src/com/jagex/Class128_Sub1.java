/* Class128_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class128_Sub1 extends Class128 {
	boolean aBool8872 = false;
	Class125 aClass125_8873;
	static final int anInt8874 = 128;
	static final int anInt8875 = 24;
	static final float aFloat8876 = 26.0F;
	static final float aFloat8877 = -12.0F;
	static final float aFloat8878 = 0.0F;
	static final int anInt8879 = 128;
	static final char aChar8880 = '\001';
	static final int anInt8881 = 5;
	boolean aBool8882;
	static final char aChar8883 = '\0';
	Class124_Sub4[] aClass124_Sub4Array8884;

	void method1664(boolean bool) {
		aClass167_Sub2_1567.method8558(8448, 7681);
	}

	boolean method1652() {
		return true;
	}

	void method1666(boolean bool) {
		aClass167_Sub2_1567.method8558(8448, 7681);
	}

	void method1653(boolean bool) {
		if (aClass125_8873 != null && bool) {
			if (!aBool8882) {
				aClass167_Sub2_1567.method8556(2);
				aClass167_Sub2_1567.method8617(aClass167_Sub2_1567.aClass124_Sub1_9142);
				aClass167_Sub2_1567.method8556(0);
			}
			aClass125_8873.method1639('\0');
			aBool8872 = true;
		} else
			aClass167_Sub2_1567.method8560(0, 34168, 770);
	}

	Class128_Sub1(Class167_Sub2 class167_sub2) {
		super(class167_sub2);
		if (class167_sub2.aBool9298) {
			byte[][] is = new byte[6][16384];
			byte[][] is_0_ = new byte[6][16384];
			byte[][] is_1_ = new byte[6][16384];
			int i = 0;
			Class436 class436 = new Class436(0.0F, -1.0F, 0.0F);
			for (int i_2_ = 0; i_2_ < 128; i_2_++) {
				for (int i_3_ = 0; i_3_ < 128; i_3_++) {
					float f = 2.0F * (float) i_3_ / 128.0F - 1.0F;
					float f_4_ = 2.0F * (float) i_2_ / 128.0F - 1.0F;
					float f_5_ = (float) (1.0 / Math.sqrt((double) (f * f + 1.0F + f_4_ * f_4_)));
					f *= f_5_;
					f_4_ *= f_5_;
					for (int i_6_ = 0; i_6_ < 6; i_6_++) {
						Class436 class436_7_;
						if (i_6_ == 0)
							class436_7_ = new Class436(-f_5_, -f, f_4_);
						else if (i_6_ == 1)
							class436_7_ = new Class436(f_5_, f, f_4_);
						else if (i_6_ == 2)
							class436_7_ = new Class436(-f, f_4_, -f_5_);
						else if (i_6_ == 3)
							class436_7_ = new Class436(-f, -f_4_, f_5_);
						else if (i_6_ == 4)
							class436_7_ = new Class436(f, f_5_, -f_4_);
						else
							class436_7_ = new Class436(f, -f_5_, f_4_);
						float f_8_ = class436_7_.method5253(class436);
						f_8_ = Math.max(0.0F, Math.min(1.0F, f_8_));
						int i_9_;
						int i_10_;
						int i_11_;
						if (f_8_ > 0.0F) {
							i_11_ = Math.min(255, (int) (Math.pow((double) f_8_, 128.0) * 400.0));
							i_10_ = Math.min(255, (int) (Math.pow((double) f_8_, 24.0) * 400.0));
							i_9_ = Math.min(255, (int) (Math.pow((double) f_8_, 5.0) * 400.0));
						} else {
							i_9_ = 0;
							i_10_ = 0;
							i_11_ = 0;
						}
						is_0_[i_6_][i] = (byte) i_11_;
						is_1_[i_6_][i] = (byte) i_10_;
						is[i_6_][i] = (byte) i_9_;
					}
					i++;
				}
			}
			aClass124_Sub4Array8884 = new Class124_Sub4[3];
			aClass124_Sub4Array8884[0] = new Class124_Sub4(aClass167_Sub2_1567, Class155.aClass155_1729, Class171.aClass171_1905, 128, false, is_0_, Class155.aClass155_1729);
			aClass124_Sub4Array8884[1] = new Class124_Sub4(aClass167_Sub2_1567, Class155.aClass155_1729, Class171.aClass171_1905, 128, false, is_1_, Class155.aClass155_1729);
			aClass124_Sub4Array8884[2] = new Class124_Sub4(aClass167_Sub2_1567, Class155.aClass155_1729, Class171.aClass171_1905, 128, false, is, Class155.aClass155_1729);
			method8401();
		}
	}

	void method1654() {
		if (aBool8872) {
			if (!aBool8882) {
				aClass167_Sub2_1567.method8556(2);
				aClass167_Sub2_1567.method8617(null);
			}
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8556(0);
			aClass125_8873.method1639('\001');
			aBool8872 = false;
		} else
			aClass167_Sub2_1567.method8560(0, 5890, 770);
		aClass167_Sub2_1567.method8558(8448, 8448);
	}

	void method1673(boolean bool) {
		aClass167_Sub2_1567.method8558(8448, 7681);
	}

	void method1674(Class124 class124, int i) {
		aClass167_Sub2_1567.method8617(class124);
		aClass167_Sub2_1567.method8557(i);
	}

	boolean method1657() {
		return true;
	}

	void method1672(Class124 class124, int i) {
		aClass167_Sub2_1567.method8617(class124);
		aClass167_Sub2_1567.method8557(i);
	}

	boolean method1659() {
		return true;
	}

	void method1660(boolean bool) {
		if (aClass125_8873 != null && bool) {
			if (!aBool8882) {
				aClass167_Sub2_1567.method8556(2);
				aClass167_Sub2_1567.method8617(aClass167_Sub2_1567.aClass124_Sub1_9142);
				aClass167_Sub2_1567.method8556(0);
			}
			aClass125_8873.method1639('\0');
			aBool8872 = true;
		} else
			aClass167_Sub2_1567.method8560(0, 34168, 770);
	}

	void method1656(int i, int i_12_) {
		if (aBool8872) {
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(aClass124_Sub4Array8884[i - 1]);
			aClass167_Sub2_1567.method8556(0);
		}
	}

	void method1662(boolean bool) {
		if (aClass125_8873 != null && bool) {
			if (!aBool8882) {
				aClass167_Sub2_1567.method8556(2);
				aClass167_Sub2_1567.method8617(aClass167_Sub2_1567.aClass124_Sub1_9142);
				aClass167_Sub2_1567.method8556(0);
			}
			aClass125_8873.method1639('\0');
			aBool8872 = true;
		} else
			aClass167_Sub2_1567.method8560(0, 34168, 770);
	}

	void method1671(int i, int i_13_) {
		if (aBool8872) {
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(aClass124_Sub4Array8884[i - 1]);
			aClass167_Sub2_1567.method8556(0);
		}
	}

	void method1655(boolean bool) {
		aClass167_Sub2_1567.method8558(8448, 7681);
	}

	void method1665(boolean bool) {
		aClass167_Sub2_1567.method8558(8448, 7681);
	}

	void method1670() {
		if (aBool8872) {
			if (!aBool8882) {
				aClass167_Sub2_1567.method8556(2);
				aClass167_Sub2_1567.method8617(null);
			}
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8556(0);
			aClass125_8873.method1639('\001');
			aBool8872 = false;
		} else
			aClass167_Sub2_1567.method8560(0, 5890, 770);
		aClass167_Sub2_1567.method8558(8448, 8448);
	}

	void method1651() {
		if (aBool8872) {
			if (!aBool8882) {
				aClass167_Sub2_1567.method8556(2);
				aClass167_Sub2_1567.method8617(null);
			}
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8556(0);
			aClass125_8873.method1639('\001');
			aBool8872 = false;
		} else
			aClass167_Sub2_1567.method8560(0, 5890, 770);
		aClass167_Sub2_1567.method8558(8448, 8448);
	}

	void method1661() {
		if (aBool8872) {
			if (!aBool8882) {
				aClass167_Sub2_1567.method8556(2);
				aClass167_Sub2_1567.method8617(null);
			}
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8556(0);
			aClass125_8873.method1639('\001');
			aBool8872 = false;
		} else
			aClass167_Sub2_1567.method8560(0, 5890, 770);
		aClass167_Sub2_1567.method8558(8448, 8448);
	}

	void method1669() {
		if (aBool8872) {
			if (!aBool8882) {
				aClass167_Sub2_1567.method8556(2);
				aClass167_Sub2_1567.method8617(null);
			}
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8556(0);
			aClass125_8873.method1639('\001');
			aBool8872 = false;
		} else
			aClass167_Sub2_1567.method8560(0, 5890, 770);
		aClass167_Sub2_1567.method8558(8448, 8448);
	}

	void method1667(boolean bool) {
		if (aClass125_8873 != null && bool) {
			if (!aBool8882) {
				aClass167_Sub2_1567.method8556(2);
				aClass167_Sub2_1567.method8617(aClass167_Sub2_1567.aClass124_Sub1_9142);
				aClass167_Sub2_1567.method8556(0);
			}
			aClass125_8873.method1639('\0');
			aBool8872 = true;
		} else
			aClass167_Sub2_1567.method8560(0, 34168, 770);
	}

	boolean method1658() {
		return true;
	}

	void method8401() {
		aClass125_8873 = new Class125(aClass167_Sub2_1567, 2);
		aClass125_8873.method1636(0);
		aClass167_Sub2_1567.method8556(1);
		OpenGL.glTexGeni(8192, 9472, 34065);
		OpenGL.glTexGeni(8193, 9472, 34065);
		OpenGL.glTexGeni(8194, 9472, 34065);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glEnable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(26.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
		OpenGL.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
		OpenGL.glMatrixMode(5888);
		if (!aBool8882) {
			aClass167_Sub2_1567.method8558(7681, 8448);
			aClass167_Sub2_1567.method8520(0, 34168, 768);
			aClass167_Sub2_1567.method8556(2);
			aClass167_Sub2_1567.method8558(260, 7681);
			aClass167_Sub2_1567.method8520(0, 34168, 768);
			aClass167_Sub2_1567.method8520(1, 34168, 770);
			aClass167_Sub2_1567.method8560(0, 34167, 770);
		} else {
			aClass167_Sub2_1567.method8558(260, 7681);
			aClass167_Sub2_1567.method8520(0, 5890, 770);
			aClass167_Sub2_1567.method8560(0, 34167, 770);
		}
		aClass167_Sub2_1567.method8556(0);
		aClass125_8873.method1638();
		aClass125_8873.method1636(1);
		aClass167_Sub2_1567.method8556(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (!aBool8882) {
			aClass167_Sub2_1567.method8558(8448, 8448);
			aClass167_Sub2_1567.method8520(0, 5890, 768);
			aClass167_Sub2_1567.method8556(2);
			aClass167_Sub2_1567.method8558(8448, 8448);
			aClass167_Sub2_1567.method8520(0, 5890, 768);
			aClass167_Sub2_1567.method8520(1, 34168, 768);
			aClass167_Sub2_1567.method8560(0, 5890, 770);
		} else {
			aClass167_Sub2_1567.method8558(8448, 8448);
			aClass167_Sub2_1567.method8520(0, 5890, 768);
			aClass167_Sub2_1567.method8560(0, 5890, 770);
		}
		aClass167_Sub2_1567.method8556(0);
		aClass125_8873.method1638();
	}

	void method1668(Class124 class124, int i) {
		aClass167_Sub2_1567.method8617(class124);
		aClass167_Sub2_1567.method8557(i);
	}

	void method1663(Class124 class124, int i) {
		aClass167_Sub2_1567.method8617(class124);
		aClass167_Sub2_1567.method8557(i);
	}
}
