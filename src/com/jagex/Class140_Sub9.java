/* Class140_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class140_Sub9 extends Class140 {
	Class136 aClass136_8996;
	static final char aChar8997 = '\001';
	Class121 aClass121_8998;
	static final char aChar8999 = '\0';
	Class118_Sub1 aClass118_Sub1_9000;
	static float[] aFloatArray9001 = { 0.0F, 0.0F, 0.0F, 0.0F };

	boolean method2321() {
		return true;
	}

	void method2340(boolean bool) {
		aClass180_Sub3_1647.method15403(260, 8448);
	}

	void method2331(Class118 class118, int i) {
		/* empty */
	}

	void method2327(Class118 class118, int i) {
		/* empty */
	}

	void method2322() {
		aClass121_8998.method2127('\001');
		if (aClass180_Sub3_1647.anInt9789 > 0) {
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(null);
			aClass180_Sub3_1647.method15378(1.0F, 0.0F);
			aClass180_Sub3_1647.method15400(0);
		}
		aClass180_Sub3_1647.method15403(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	void method2323(int i, int i_0_) {
		if ((i & 0x1) == 1) {
			if (aClass136_8996.aBool1570) {
				aClass180_Sub3_1647.method15401(aClass136_8996.aClass118_Sub4_1572);
				aFloatArray9001[0] = 0.0F;
				aFloatArray9001[1] = 0.0F;
				aFloatArray9001[2] = 0.0F;
				aFloatArray9001[3] = (float) (aClass180_Sub3_1647.anInt9705 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray9001, 0);
			} else {
				int i_1_ = aClass180_Sub3_1647.anInt9705 % 4000 * 16 / 4000;
				aClass180_Sub3_1647.method15401(aClass136_8996.aClass118_Sub3Array1571[i_1_]);
			}
		} else if (aClass136_8996.aBool1570) {
			aClass180_Sub3_1647.method15401(aClass136_8996.aClass118_Sub4_1572);
			aFloatArray9001[0] = 0.0F;
			aFloatArray9001[1] = 0.0F;
			aFloatArray9001[2] = 0.0F;
			aFloatArray9001[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray9001, 0);
		} else
			aClass180_Sub3_1647.method15401(aClass136_8996.aClass118_Sub3Array1571[0]);
	}

	void method2324(boolean bool) {
		if (aClass180_Sub3_1647.anInt9789 > 0) {
			float f = -0.5F / (float) aClass180_Sub3_1647.anInt9789;
			aClass180_Sub3_1647.method15400(1);
			aFloatArray9001[0] = 0.0F;
			aFloatArray9001[1] = 0.0F;
			aFloatArray9001[2] = f;
			aFloatArray9001[3] = aClass180_Sub3_1647.aFloat9791 * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray9001, 0);
			OpenGL.glPopMatrix();
			aClass180_Sub3_1647.method15378(0.5F, (float) aClass180_Sub3_1647.anInt9789);
			aClass180_Sub3_1647.method15401(aClass118_Sub1_9000);
			aClass180_Sub3_1647.method15400(0);
		}
		aClass121_8998.method2127('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	void method14517() {
		aClass121_8998 = new Class121(aClass180_Sub3_1647, 2);
		aClass121_8998.method2126(0);
		aClass180_Sub3_1647.method15400(1);
		aClass180_Sub3_1647.method15403(7681, 260);
		aClass180_Sub3_1647.method15404(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		aClass180_Sub3_1647.method15400(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (aClass136_8996.aBool1570) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		aClass121_8998.method2129();
		aClass121_8998.method2126(1);
		aClass180_Sub3_1647.method15400(1);
		aClass180_Sub3_1647.method15403(8448, 8448);
		aClass180_Sub3_1647.method15404(0, 5890, 768);
		OpenGL.glDisable(3168);
		aClass180_Sub3_1647.method15400(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (aClass136_8996.aBool1570) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		aClass121_8998.method2129();
	}

	boolean method2325() {
		return true;
	}

	void method2330(int i, int i_2_) {
		if ((i & 0x1) == 1) {
			if (aClass136_8996.aBool1570) {
				aClass180_Sub3_1647.method15401(aClass136_8996.aClass118_Sub4_1572);
				aFloatArray9001[0] = 0.0F;
				aFloatArray9001[1] = 0.0F;
				aFloatArray9001[2] = 0.0F;
				aFloatArray9001[3] = (float) (aClass180_Sub3_1647.anInt9705 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray9001, 0);
			} else {
				int i_3_ = aClass180_Sub3_1647.anInt9705 % 4000 * 16 / 4000;
				aClass180_Sub3_1647.method15401(aClass136_8996.aClass118_Sub3Array1571[i_3_]);
			}
		} else if (aClass136_8996.aBool1570) {
			aClass180_Sub3_1647.method15401(aClass136_8996.aClass118_Sub4_1572);
			aFloatArray9001[0] = 0.0F;
			aFloatArray9001[1] = 0.0F;
			aFloatArray9001[2] = 0.0F;
			aFloatArray9001[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray9001, 0);
		} else
			aClass180_Sub3_1647.method15401(aClass136_8996.aClass118_Sub3Array1571[0]);
	}

	void method2326(boolean bool) {
		aClass180_Sub3_1647.method15403(260, 8448);
	}

	void method2341(boolean bool) {
		aClass180_Sub3_1647.method15403(260, 8448);
	}

	void method2328(boolean bool) {
		aClass180_Sub3_1647.method15403(260, 8448);
	}

	void method2329(boolean bool) {
		aClass180_Sub3_1647.method15403(260, 8448);
	}

	Class140_Sub9(Class180_Sub3 class180_sub3, Class136 class136) {
		super(class180_sub3);
		aClass136_8996 = class136;
		method14517();
		aClass118_Sub1_9000 = new Class118_Sub1(aClass180_Sub3_1647, Class157.aClass157_1724, Class184.aClass184_2104, 2, new byte[] { 0, -1 }, Class157.aClass157_1724);
		aClass118_Sub1_9000.method14424(false);
	}

	void method2318(int i, int i_4_) {
		if ((i & 0x1) == 1) {
			if (aClass136_8996.aBool1570) {
				aClass180_Sub3_1647.method15401(aClass136_8996.aClass118_Sub4_1572);
				aFloatArray9001[0] = 0.0F;
				aFloatArray9001[1] = 0.0F;
				aFloatArray9001[2] = 0.0F;
				aFloatArray9001[3] = (float) (aClass180_Sub3_1647.anInt9705 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray9001, 0);
			} else {
				int i_5_ = aClass180_Sub3_1647.anInt9705 % 4000 * 16 / 4000;
				aClass180_Sub3_1647.method15401(aClass136_8996.aClass118_Sub3Array1571[i_5_]);
			}
		} else if (aClass136_8996.aBool1570) {
			aClass180_Sub3_1647.method15401(aClass136_8996.aClass118_Sub4_1572);
			aFloatArray9001[0] = 0.0F;
			aFloatArray9001[1] = 0.0F;
			aFloatArray9001[2] = 0.0F;
			aFloatArray9001[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray9001, 0);
		} else
			aClass180_Sub3_1647.method15401(aClass136_8996.aClass118_Sub3Array1571[0]);
	}

	void method2332(int i, int i_6_) {
		if ((i & 0x1) == 1) {
			if (aClass136_8996.aBool1570) {
				aClass180_Sub3_1647.method15401(aClass136_8996.aClass118_Sub4_1572);
				aFloatArray9001[0] = 0.0F;
				aFloatArray9001[1] = 0.0F;
				aFloatArray9001[2] = 0.0F;
				aFloatArray9001[3] = (float) (aClass180_Sub3_1647.anInt9705 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray9001, 0);
			} else {
				int i_7_ = aClass180_Sub3_1647.anInt9705 % 4000 * 16 / 4000;
				aClass180_Sub3_1647.method15401(aClass136_8996.aClass118_Sub3Array1571[i_7_]);
			}
		} else if (aClass136_8996.aBool1570) {
			aClass180_Sub3_1647.method15401(aClass136_8996.aClass118_Sub4_1572);
			aFloatArray9001[0] = 0.0F;
			aFloatArray9001[1] = 0.0F;
			aFloatArray9001[2] = 0.0F;
			aFloatArray9001[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray9001, 0);
		} else
			aClass180_Sub3_1647.method15401(aClass136_8996.aClass118_Sub3Array1571[0]);
	}

	void method2333(int i, int i_8_) {
		if ((i & 0x1) == 1) {
			if (aClass136_8996.aBool1570) {
				aClass180_Sub3_1647.method15401(aClass136_8996.aClass118_Sub4_1572);
				aFloatArray9001[0] = 0.0F;
				aFloatArray9001[1] = 0.0F;
				aFloatArray9001[2] = 0.0F;
				aFloatArray9001[3] = (float) (aClass180_Sub3_1647.anInt9705 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray9001, 0);
			} else {
				int i_9_ = aClass180_Sub3_1647.anInt9705 % 4000 * 16 / 4000;
				aClass180_Sub3_1647.method15401(aClass136_8996.aClass118_Sub3Array1571[i_9_]);
			}
		} else if (aClass136_8996.aBool1570) {
			aClass180_Sub3_1647.method15401(aClass136_8996.aClass118_Sub4_1572);
			aFloatArray9001[0] = 0.0F;
			aFloatArray9001[1] = 0.0F;
			aFloatArray9001[2] = 0.0F;
			aFloatArray9001[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray9001, 0);
		} else
			aClass180_Sub3_1647.method15401(aClass136_8996.aClass118_Sub3Array1571[0]);
	}

	void method2334(int i, int i_10_) {
		if ((i & 0x1) == 1) {
			if (aClass136_8996.aBool1570) {
				aClass180_Sub3_1647.method15401(aClass136_8996.aClass118_Sub4_1572);
				aFloatArray9001[0] = 0.0F;
				aFloatArray9001[1] = 0.0F;
				aFloatArray9001[2] = 0.0F;
				aFloatArray9001[3] = (float) (aClass180_Sub3_1647.anInt9705 % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray9001, 0);
			} else {
				int i_11_ = aClass180_Sub3_1647.anInt9705 % 4000 * 16 / 4000;
				aClass180_Sub3_1647.method15401(aClass136_8996.aClass118_Sub3Array1571[i_11_]);
			}
		} else if (aClass136_8996.aBool1570) {
			aClass180_Sub3_1647.method15401(aClass136_8996.aClass118_Sub4_1572);
			aFloatArray9001[0] = 0.0F;
			aFloatArray9001[1] = 0.0F;
			aFloatArray9001[2] = 0.0F;
			aFloatArray9001[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray9001, 0);
		} else
			aClass180_Sub3_1647.method15401(aClass136_8996.aClass118_Sub3Array1571[0]);
	}

	void method2335(boolean bool) {
		if (aClass180_Sub3_1647.anInt9789 > 0) {
			float f = -0.5F / (float) aClass180_Sub3_1647.anInt9789;
			aClass180_Sub3_1647.method15400(1);
			aFloatArray9001[0] = 0.0F;
			aFloatArray9001[1] = 0.0F;
			aFloatArray9001[2] = f;
			aFloatArray9001[3] = aClass180_Sub3_1647.aFloat9791 * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray9001, 0);
			OpenGL.glPopMatrix();
			aClass180_Sub3_1647.method15378(0.5F, (float) aClass180_Sub3_1647.anInt9789);
			aClass180_Sub3_1647.method15401(aClass118_Sub1_9000);
			aClass180_Sub3_1647.method15400(0);
		}
		aClass121_8998.method2127('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	void method2336(boolean bool) {
		if (aClass180_Sub3_1647.anInt9789 > 0) {
			float f = -0.5F / (float) aClass180_Sub3_1647.anInt9789;
			aClass180_Sub3_1647.method15400(1);
			aFloatArray9001[0] = 0.0F;
			aFloatArray9001[1] = 0.0F;
			aFloatArray9001[2] = f;
			aFloatArray9001[3] = aClass180_Sub3_1647.aFloat9791 * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray9001, 0);
			OpenGL.glPopMatrix();
			aClass180_Sub3_1647.method15378(0.5F, (float) aClass180_Sub3_1647.anInt9789);
			aClass180_Sub3_1647.method15401(aClass118_Sub1_9000);
			aClass180_Sub3_1647.method15400(0);
		}
		aClass121_8998.method2127('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	void method2337(boolean bool) {
		if (aClass180_Sub3_1647.anInt9789 > 0) {
			float f = -0.5F / (float) aClass180_Sub3_1647.anInt9789;
			aClass180_Sub3_1647.method15400(1);
			aFloatArray9001[0] = 0.0F;
			aFloatArray9001[1] = 0.0F;
			aFloatArray9001[2] = f;
			aFloatArray9001[3] = aClass180_Sub3_1647.aFloat9791 * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray9001, 0);
			OpenGL.glPopMatrix();
			aClass180_Sub3_1647.method15378(0.5F, (float) aClass180_Sub3_1647.anInt9789);
			aClass180_Sub3_1647.method15401(aClass118_Sub1_9000);
			aClass180_Sub3_1647.method15400(0);
		}
		aClass121_8998.method2127('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	void method2338() {
		aClass121_8998.method2127('\001');
		if (aClass180_Sub3_1647.anInt9789 > 0) {
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(null);
			aClass180_Sub3_1647.method15378(1.0F, 0.0F);
			aClass180_Sub3_1647.method15400(0);
		}
		aClass180_Sub3_1647.method15403(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	void method2339(Class118 class118, int i) {
		/* empty */
	}

	boolean method2319() {
		return true;
	}

	void method2320(Class118 class118, int i) {
		/* empty */
	}

	void method14518() {
		aClass121_8998 = new Class121(aClass180_Sub3_1647, 2);
		aClass121_8998.method2126(0);
		aClass180_Sub3_1647.method15400(1);
		aClass180_Sub3_1647.method15403(7681, 260);
		aClass180_Sub3_1647.method15404(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		aClass180_Sub3_1647.method15400(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (aClass136_8996.aBool1570) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		aClass121_8998.method2129();
		aClass121_8998.method2126(1);
		aClass180_Sub3_1647.method15400(1);
		aClass180_Sub3_1647.method15403(8448, 8448);
		aClass180_Sub3_1647.method15404(0, 5890, 768);
		OpenGL.glDisable(3168);
		aClass180_Sub3_1647.method15400(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (aClass136_8996.aBool1570) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		aClass121_8998.method2129();
	}

	void method14519() {
		aClass121_8998 = new Class121(aClass180_Sub3_1647, 2);
		aClass121_8998.method2126(0);
		aClass180_Sub3_1647.method15400(1);
		aClass180_Sub3_1647.method15403(7681, 260);
		aClass180_Sub3_1647.method15404(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		aClass180_Sub3_1647.method15400(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (aClass136_8996.aBool1570) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		aClass121_8998.method2129();
		aClass121_8998.method2126(1);
		aClass180_Sub3_1647.method15400(1);
		aClass180_Sub3_1647.method15403(8448, 8448);
		aClass180_Sub3_1647.method15404(0, 5890, 768);
		OpenGL.glDisable(3168);
		aClass180_Sub3_1647.method15400(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (aClass136_8996.aBool1570) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		aClass121_8998.method2129();
	}

	void method14520() {
		aClass121_8998 = new Class121(aClass180_Sub3_1647, 2);
		aClass121_8998.method2126(0);
		aClass180_Sub3_1647.method15400(1);
		aClass180_Sub3_1647.method15403(7681, 260);
		aClass180_Sub3_1647.method15404(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		aClass180_Sub3_1647.method15400(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (aClass136_8996.aBool1570) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		aClass121_8998.method2129();
		aClass121_8998.method2126(1);
		aClass180_Sub3_1647.method15400(1);
		aClass180_Sub3_1647.method15403(8448, 8448);
		aClass180_Sub3_1647.method15404(0, 5890, 768);
		OpenGL.glDisable(3168);
		aClass180_Sub3_1647.method15400(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (aClass136_8996.aBool1570) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		aClass121_8998.method2129();
	}
}
