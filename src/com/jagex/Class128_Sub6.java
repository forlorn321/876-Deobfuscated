/* Class128_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class128_Sub6 extends Class128 {
	Class124_Sub3 aClass124_Sub3_8922;
	static final char aChar8923 = '\001';
	Class131 aClass131_8924;
	Class125 aClass125_8925;
	static float[] aFloatArray8926 = { 0.0F, 0.0F, 0.0F, 0.0F };
	static final char aChar8927 = '\0';

	void method1664(boolean bool) {
		aClass167_Sub2_1567.method8558(260, 8448);
	}

	boolean method1652() {
		return true;
	}

	void method1667(boolean bool) {
		if (aClass167_Sub2_1567.anInt9260 > 0) {
			float f = -0.5F / (float) aClass167_Sub2_1567.anInt9260;
			aClass167_Sub2_1567.method8556(1);
			aFloatArray8926[0] = 0.0F;
			aFloatArray8926[1] = 0.0F;
			aFloatArray8926[2] = f;
			aFloatArray8926[3] = aClass167_Sub2_1567.aFloat9126 * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray8926, 0);
			OpenGL.glPopMatrix();
			aClass167_Sub2_1567.method8537(0.5F, (float) aClass167_Sub2_1567.anInt9260);
			aClass167_Sub2_1567.method8617(aClass124_Sub3_8922);
			aClass167_Sub2_1567.method8556(0);
		}
		aClass125_8925.method1639('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	void method1673(boolean bool) {
		aClass167_Sub2_1567.method8558(260, 8448);
	}

	boolean method1659() {
		return true;
	}

	void method1656(int i, int i_0_) {
		if ((i & 0x1) == 1) {
			if (aClass131_8924.aBool1594) {
				aClass167_Sub2_1567.method8617(aClass131_8924.aClass124_Sub2_1596);
				aFloatArray8926[0] = 0.0F;
				aFloatArray8926[1] = 0.0F;
				aFloatArray8926[2] = 0.0F;
				aFloatArray8926[3] = (float) (aClass167_Sub2_1567.anInt9176 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray8926, 0);
			} else {
				int i_1_ = aClass167_Sub2_1567.anInt9176 % 4000 * 16 / 4000;
				aClass167_Sub2_1567.method8617(aClass131_8924.aClass124_Sub1Array1595[i_1_]);
			}
		} else if (aClass131_8924.aBool1594) {
			aClass167_Sub2_1567.method8617(aClass131_8924.aClass124_Sub2_1596);
			aFloatArray8926[0] = 0.0F;
			aFloatArray8926[1] = 0.0F;
			aFloatArray8926[2] = 0.0F;
			aFloatArray8926[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray8926, 0);
		} else
			aClass167_Sub2_1567.method8617(aClass131_8924.aClass124_Sub1Array1595[0]);
	}

	void method1674(Class124 class124, int i) {
		/* empty */
	}

	void method8419() {
		aClass125_8925 = new Class125(aClass167_Sub2_1567, 2);
		aClass125_8925.method1636(0);
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8558(7681, 260);
		aClass167_Sub2_1567.method8520(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		aClass167_Sub2_1567.method8556(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (aClass131_8924.aBool1594) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		aClass125_8925.method1638();
		aClass125_8925.method1636(1);
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8558(8448, 8448);
		aClass167_Sub2_1567.method8520(0, 5890, 768);
		OpenGL.glDisable(3168);
		aClass167_Sub2_1567.method8556(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (aClass131_8924.aBool1594) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		aClass125_8925.method1638();
	}

	boolean method1657() {
		return true;
	}

	void method1651() {
		aClass125_8925.method1639('\001');
		if (aClass167_Sub2_1567.anInt9260 > 0) {
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8537(1.0F, 0.0F);
			aClass167_Sub2_1567.method8556(0);
		}
		aClass167_Sub2_1567.method8558(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	void method8420() {
		aClass125_8925 = new Class125(aClass167_Sub2_1567, 2);
		aClass125_8925.method1636(0);
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8558(7681, 260);
		aClass167_Sub2_1567.method8520(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		aClass167_Sub2_1567.method8556(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (aClass131_8924.aBool1594) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		aClass125_8925.method1638();
		aClass125_8925.method1636(1);
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8558(8448, 8448);
		aClass167_Sub2_1567.method8520(0, 5890, 768);
		OpenGL.glDisable(3168);
		aClass167_Sub2_1567.method8556(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (aClass131_8924.aBool1594) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		aClass125_8925.method1638();
	}

	void method1660(boolean bool) {
		if (aClass167_Sub2_1567.anInt9260 > 0) {
			float f = -0.5F / (float) aClass167_Sub2_1567.anInt9260;
			aClass167_Sub2_1567.method8556(1);
			aFloatArray8926[0] = 0.0F;
			aFloatArray8926[1] = 0.0F;
			aFloatArray8926[2] = f;
			aFloatArray8926[3] = aClass167_Sub2_1567.aFloat9126 * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray8926, 0);
			OpenGL.glPopMatrix();
			aClass167_Sub2_1567.method8537(0.5F, (float) aClass167_Sub2_1567.anInt9260);
			aClass167_Sub2_1567.method8617(aClass124_Sub3_8922);
			aClass167_Sub2_1567.method8556(0);
		}
		aClass125_8925.method1639('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	void method1665(boolean bool) {
		aClass167_Sub2_1567.method8558(260, 8448);
	}

	void method1662(boolean bool) {
		if (aClass167_Sub2_1567.anInt9260 > 0) {
			float f = -0.5F / (float) aClass167_Sub2_1567.anInt9260;
			aClass167_Sub2_1567.method8556(1);
			aFloatArray8926[0] = 0.0F;
			aFloatArray8926[1] = 0.0F;
			aFloatArray8926[2] = f;
			aFloatArray8926[3] = aClass167_Sub2_1567.aFloat9126 * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray8926, 0);
			OpenGL.glPopMatrix();
			aClass167_Sub2_1567.method8537(0.5F, (float) aClass167_Sub2_1567.anInt9260);
			aClass167_Sub2_1567.method8617(aClass124_Sub3_8922);
			aClass167_Sub2_1567.method8556(0);
		}
		aClass125_8925.method1639('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	Class128_Sub6(Class167_Sub2 class167_sub2, Class131 class131) {
		super(class167_sub2);
		aClass131_8924 = class131;
		method8419();
		aClass124_Sub3_8922 = new Class124_Sub3(aClass167_Sub2_1567, Class155.aClass155_1729, Class171.aClass171_1905, 2, new byte[] { 0, -1 }, Class155.aClass155_1729);
		aClass124_Sub3_8922.method8440(false);
	}

	void method1654() {
		aClass125_8925.method1639('\001');
		if (aClass167_Sub2_1567.anInt9260 > 0) {
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8537(1.0F, 0.0F);
			aClass167_Sub2_1567.method8556(0);
		}
		aClass167_Sub2_1567.method8558(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	void method1653(boolean bool) {
		if (aClass167_Sub2_1567.anInt9260 > 0) {
			float f = -0.5F / (float) aClass167_Sub2_1567.anInt9260;
			aClass167_Sub2_1567.method8556(1);
			aFloatArray8926[0] = 0.0F;
			aFloatArray8926[1] = 0.0F;
			aFloatArray8926[2] = f;
			aFloatArray8926[3] = aClass167_Sub2_1567.aFloat9126 * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray8926, 0);
			OpenGL.glPopMatrix();
			aClass167_Sub2_1567.method8537(0.5F, (float) aClass167_Sub2_1567.anInt9260);
			aClass167_Sub2_1567.method8617(aClass124_Sub3_8922);
			aClass167_Sub2_1567.method8556(0);
		}
		aClass125_8925.method1639('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	void method1666(boolean bool) {
		aClass167_Sub2_1567.method8558(260, 8448);
	}

	boolean method1658() {
		return true;
	}

	void method1661() {
		aClass125_8925.method1639('\001');
		if (aClass167_Sub2_1567.anInt9260 > 0) {
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8537(1.0F, 0.0F);
			aClass167_Sub2_1567.method8556(0);
		}
		aClass167_Sub2_1567.method8558(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	void method1669() {
		aClass125_8925.method1639('\001');
		if (aClass167_Sub2_1567.anInt9260 > 0) {
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8537(1.0F, 0.0F);
			aClass167_Sub2_1567.method8556(0);
		}
		aClass167_Sub2_1567.method8558(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	void method1670() {
		aClass125_8925.method1639('\001');
		if (aClass167_Sub2_1567.anInt9260 > 0) {
			aClass167_Sub2_1567.method8556(1);
			aClass167_Sub2_1567.method8617(null);
			aClass167_Sub2_1567.method8537(1.0F, 0.0F);
			aClass167_Sub2_1567.method8556(0);
		}
		aClass167_Sub2_1567.method8558(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	void method1671(int i, int i_2_) {
		if ((i & 0x1) == 1) {
			if (aClass131_8924.aBool1594) {
				aClass167_Sub2_1567.method8617(aClass131_8924.aClass124_Sub2_1596);
				aFloatArray8926[0] = 0.0F;
				aFloatArray8926[1] = 0.0F;
				aFloatArray8926[2] = 0.0F;
				aFloatArray8926[3] = (float) (aClass167_Sub2_1567.anInt9176 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray8926, 0);
			} else {
				int i_3_ = aClass167_Sub2_1567.anInt9176 % 4000 * 16 / 4000;
				aClass167_Sub2_1567.method8617(aClass131_8924.aClass124_Sub1Array1595[i_3_]);
			}
		} else if (aClass131_8924.aBool1594) {
			aClass167_Sub2_1567.method8617(aClass131_8924.aClass124_Sub2_1596);
			aFloatArray8926[0] = 0.0F;
			aFloatArray8926[1] = 0.0F;
			aFloatArray8926[2] = 0.0F;
			aFloatArray8926[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray8926, 0);
		} else
			aClass167_Sub2_1567.method8617(aClass131_8924.aClass124_Sub1Array1595[0]);
	}

	void method1672(Class124 class124, int i) {
		/* empty */
	}

	void method1668(Class124 class124, int i) {
		/* empty */
	}

	void method1663(Class124 class124, int i) {
		/* empty */
	}

	void method8421() {
		aClass125_8925 = new Class125(aClass167_Sub2_1567, 2);
		aClass125_8925.method1636(0);
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8558(7681, 260);
		aClass167_Sub2_1567.method8520(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		aClass167_Sub2_1567.method8556(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (aClass131_8924.aBool1594) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		aClass125_8925.method1638();
		aClass125_8925.method1636(1);
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8558(8448, 8448);
		aClass167_Sub2_1567.method8520(0, 5890, 768);
		OpenGL.glDisable(3168);
		aClass167_Sub2_1567.method8556(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (aClass131_8924.aBool1594) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		aClass125_8925.method1638();
	}

	void method8422() {
		aClass125_8925 = new Class125(aClass167_Sub2_1567, 2);
		aClass125_8925.method1636(0);
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8558(7681, 260);
		aClass167_Sub2_1567.method8520(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		aClass167_Sub2_1567.method8556(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (aClass131_8924.aBool1594) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		aClass125_8925.method1638();
		aClass125_8925.method1636(1);
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8558(8448, 8448);
		aClass167_Sub2_1567.method8520(0, 5890, 768);
		OpenGL.glDisable(3168);
		aClass167_Sub2_1567.method8556(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (aClass131_8924.aBool1594) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		aClass125_8925.method1638();
	}

	void method8423() {
		aClass125_8925 = new Class125(aClass167_Sub2_1567, 2);
		aClass125_8925.method1636(0);
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8558(7681, 260);
		aClass167_Sub2_1567.method8520(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		aClass167_Sub2_1567.method8556(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (aClass131_8924.aBool1594) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		aClass125_8925.method1638();
		aClass125_8925.method1636(1);
		aClass167_Sub2_1567.method8556(1);
		aClass167_Sub2_1567.method8558(8448, 8448);
		aClass167_Sub2_1567.method8520(0, 5890, 768);
		OpenGL.glDisable(3168);
		aClass167_Sub2_1567.method8556(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (aClass131_8924.aBool1594) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		aClass125_8925.method1638();
	}

	void method1655(boolean bool) {
		aClass167_Sub2_1567.method8558(260, 8448);
	}
}
