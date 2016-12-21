/* Class128_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class128_Sub3 extends Class128 {
	static final char aChar8901 = '\0';
	Class125 aClass125_8902;
	static final char aChar8903 = '\001';
	Class131 aClass131_8904;
	static float[] aFloatArray8905 = new float[4];

	void method1670() {
		aClass125_8902.method1639('\001');
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8617(null);
		aClass167_Sub2_1567.method8556(0);
	}

	boolean method1652() {
		return true;
	}

	void method1653(boolean bool) {
		aClass125_8902.method1639('\0');
		if (aClass131_8904.aBool1594) {
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(aClass131_8904.aClass124_Sub2_1598);
			aClass167_Sub2_1567.method8556(0);
		}
	}

	void method1673(boolean bool) {
		/* empty */
	}

	void method1654() {
		aClass125_8902.method1639('\001');
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8617(null);
		aClass167_Sub2_1567.method8556(0);
	}

	void method1674(Class124 class124, int i) {
		aClass167_Sub2_1567.method8617(class124);
		aClass167_Sub2_1567.method8557(i);
	}

	void method1661() {
		aClass125_8902.method1639('\001');
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8617(null);
		aClass167_Sub2_1567.method8556(0);
	}

	boolean method1657() {
		return true;
	}

	void method1666(boolean bool) {
		/* empty */
	}

	boolean method1659() {
		return true;
	}

	void method1660(boolean bool) {
		aClass125_8902.method1639('\0');
		if (aClass131_8904.aBool1594) {
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(aClass131_8904.aClass124_Sub2_1598);
			aClass167_Sub2_1567.method8556(0);
		}
	}

	void method1667(boolean bool) {
		aClass125_8902.method1639('\0');
		if (aClass131_8904.aBool1594) {
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(aClass131_8904.aClass124_Sub2_1598);
			aClass167_Sub2_1567.method8556(0);
		}
	}

	void method1662(boolean bool) {
		aClass125_8902.method1639('\0');
		if (aClass131_8904.aBool1594) {
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(aClass131_8904.aClass124_Sub2_1598);
			aClass167_Sub2_1567.method8556(0);
		}
	}

	Class128_Sub3(Class167_Sub2 class167_sub2, Class131 class131) {
		super(class167_sub2);
		aClass131_8904 = class131;
		aClass125_8902 = new Class125(class167_sub2, 2);
		aClass125_8902.method1636(0);
		aClass167_Sub2_1567.method8556(1);
		if (aClass131_8904.aBool1594) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		aClass167_Sub2_1567.method8556(0);
		aClass125_8902.method1638();
		aClass125_8902.method1636(1);
		aClass167_Sub2_1567.method8556(1);
		if (aClass131_8904.aBool1594)
			OpenGL.glDisable(3170);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		aClass167_Sub2_1567.method8556(0);
		aClass125_8902.method1638();
	}

	void method1664(boolean bool) {
		/* empty */
	}

	void method1655(boolean bool) {
		/* empty */
	}

	boolean method1658() {
		return true;
	}

	void method1651() {
		aClass125_8902.method1639('\001');
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8617(null);
		aClass167_Sub2_1567.method8556(0);
	}

	void method1665(boolean bool) {
		/* empty */
	}

	void method1669() {
		aClass125_8902.method1639('\001');
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8617(null);
		aClass167_Sub2_1567.method8556(0);
	}

	void method1656(int i, int i_0_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_1_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_2_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		aClass167_Sub2_1567.method8556(1);
		if (bool) {
			aFloatArray8905[0] = f_2_;
			aFloatArray8905[1] = 0.0F;
			aFloatArray8905[2] = 0.0F;
			aFloatArray8905[3] = 0.0F;
		} else {
			aFloatArray8905[0] = 0.0F;
			aFloatArray8905[1] = 0.0F;
			aFloatArray8905[2] = f_2_;
			aFloatArray8905[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray8905, 0);
		aFloatArray8905[0] = 0.0F;
		aFloatArray8905[1] = f_2_;
		aFloatArray8905[2] = 0.0F;
		aFloatArray8905[3] = (float) aClass167_Sub2_1567.anInt9176 * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray8905, 0);
		if (!aClass131_8904.aBool1594) {
			int i_3_ = (int) (f_1_ * (float) aClass167_Sub2_1567.anInt9176 * 16.0F);
			aClass167_Sub2_1567.method8617(aClass131_8904.aClass124_Sub1Array1597[i_3_ % 16]);
		} else {
			aFloatArray8905[0] = 0.0F;
			aFloatArray8905[1] = 0.0F;
			aFloatArray8905[2] = 0.0F;
			aFloatArray8905[3] = (float) aClass167_Sub2_1567.anInt9176 * f_1_ % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray8905, 0);
		}
		aClass167_Sub2_1567.method8556(0);
	}

	void method1671(int i, int i_4_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_5_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_6_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		aClass167_Sub2_1567.method8556(1);
		if (bool) {
			aFloatArray8905[0] = f_6_;
			aFloatArray8905[1] = 0.0F;
			aFloatArray8905[2] = 0.0F;
			aFloatArray8905[3] = 0.0F;
		} else {
			aFloatArray8905[0] = 0.0F;
			aFloatArray8905[1] = 0.0F;
			aFloatArray8905[2] = f_6_;
			aFloatArray8905[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray8905, 0);
		aFloatArray8905[0] = 0.0F;
		aFloatArray8905[1] = f_6_;
		aFloatArray8905[2] = 0.0F;
		aFloatArray8905[3] = (float) aClass167_Sub2_1567.anInt9176 * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray8905, 0);
		if (!aClass131_8904.aBool1594) {
			int i_7_ = (int) (f_5_ * (float) aClass167_Sub2_1567.anInt9176 * 16.0F);
			aClass167_Sub2_1567.method8617(aClass131_8904.aClass124_Sub1Array1597[i_7_ % 16]);
		} else {
			aFloatArray8905[0] = 0.0F;
			aFloatArray8905[1] = 0.0F;
			aFloatArray8905[2] = 0.0F;
			aFloatArray8905[3] = (float) aClass167_Sub2_1567.anInt9176 * f_5_ % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray8905, 0);
		}
		aClass167_Sub2_1567.method8556(0);
	}

	void method1672(Class124 class124, int i) {
		aClass167_Sub2_1567.method8617(class124);
		aClass167_Sub2_1567.method8557(i);
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
