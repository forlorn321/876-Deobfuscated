/* Class140_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class140_Sub6 extends Class140 {
	static final char aChar8956 = '\001';
	static float[] aFloatArray8957 = new float[4];
	static final char aChar8958 = '\0';
	Class136 aClass136_8959;
	Class121 aClass121_8960;

	void method2336(boolean bool) {
		aClass121_8960.method2127('\0');
		if (aClass136_8959.aBool1570) {
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(aClass136_8959.aClass118_Sub4_1577);
			aClass180_Sub3_1647.method15400(0);
		}
	}

	boolean method2319() {
		return true;
	}

	void method2324(boolean bool) {
		aClass121_8960.method2127('\0');
		if (aClass136_8959.aBool1570) {
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(aClass136_8959.aClass118_Sub4_1577);
			aClass180_Sub3_1647.method15400(0);
		}
	}

	void method2340(boolean bool) {
		/* empty */
	}

	Class140_Sub6(Class180_Sub3 class180_sub3, Class136 class136) {
		super(class180_sub3);
		aClass136_8959 = class136;
		aClass121_8960 = new Class121(class180_sub3, 2);
		aClass121_8960.method2126(0);
		aClass180_Sub3_1647.method15400(1);
		if (aClass136_8959.aBool1570) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		aClass180_Sub3_1647.method15400(0);
		aClass121_8960.method2129();
		aClass121_8960.method2126(1);
		aClass180_Sub3_1647.method15400(1);
		if (aClass136_8959.aBool1570)
			OpenGL.glDisable(3170);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		aClass180_Sub3_1647.method15400(0);
		aClass121_8960.method2129();
	}

	void method2323(int i, int i_0_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_1_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_2_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		aClass180_Sub3_1647.method15400(1);
		if (bool) {
			aFloatArray8957[0] = f_2_;
			aFloatArray8957[1] = 0.0F;
			aFloatArray8957[2] = 0.0F;
			aFloatArray8957[3] = 0.0F;
		} else {
			aFloatArray8957[0] = 0.0F;
			aFloatArray8957[1] = 0.0F;
			aFloatArray8957[2] = f_2_;
			aFloatArray8957[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray8957, 0);
		aFloatArray8957[0] = 0.0F;
		aFloatArray8957[1] = f_2_;
		aFloatArray8957[2] = 0.0F;
		aFloatArray8957[3] = (float) aClass180_Sub3_1647.anInt9705 * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray8957, 0);
		if (!aClass136_8959.aBool1570) {
			int i_3_ = (int) (f_1_ * (float) aClass180_Sub3_1647.anInt9705 * 16.0F);
			aClass180_Sub3_1647.method15401(aClass136_8959.aClass118_Sub3Array1573[i_3_ % 16]);
		} else {
			aFloatArray8957[0] = 0.0F;
			aFloatArray8957[1] = 0.0F;
			aFloatArray8957[2] = 0.0F;
			aFloatArray8957[3] = (float) aClass180_Sub3_1647.anInt9705 * f_1_ % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray8957, 0);
		}
		aClass180_Sub3_1647.method15400(0);
	}

	void method2320(Class118 class118, int i) {
		aClass180_Sub3_1647.method15401(class118);
		aClass180_Sub3_1647.method15402(i);
	}

	void method2328(boolean bool) {
		/* empty */
	}

	void method2329(boolean bool) {
		/* empty */
	}

	void method2337(boolean bool) {
		aClass121_8960.method2127('\0');
		if (aClass136_8959.aBool1570) {
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(aClass136_8959.aClass118_Sub4_1577);
			aClass180_Sub3_1647.method15400(0);
		}
	}

	void method2341(boolean bool) {
		/* empty */
	}

	void method2326(boolean bool) {
		/* empty */
	}

	void method2327(Class118 class118, int i) {
		aClass180_Sub3_1647.method15401(class118);
		aClass180_Sub3_1647.method15402(i);
	}

	void method2330(int i, int i_4_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_5_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_6_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		aClass180_Sub3_1647.method15400(1);
		if (bool) {
			aFloatArray8957[0] = f_6_;
			aFloatArray8957[1] = 0.0F;
			aFloatArray8957[2] = 0.0F;
			aFloatArray8957[3] = 0.0F;
		} else {
			aFloatArray8957[0] = 0.0F;
			aFloatArray8957[1] = 0.0F;
			aFloatArray8957[2] = f_6_;
			aFloatArray8957[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray8957, 0);
		aFloatArray8957[0] = 0.0F;
		aFloatArray8957[1] = f_6_;
		aFloatArray8957[2] = 0.0F;
		aFloatArray8957[3] = (float) aClass180_Sub3_1647.anInt9705 * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray8957, 0);
		if (!aClass136_8959.aBool1570) {
			int i_7_ = (int) (f_5_ * (float) aClass180_Sub3_1647.anInt9705 * 16.0F);
			aClass180_Sub3_1647.method15401(aClass136_8959.aClass118_Sub3Array1573[i_7_ % 16]);
		} else {
			aFloatArray8957[0] = 0.0F;
			aFloatArray8957[1] = 0.0F;
			aFloatArray8957[2] = 0.0F;
			aFloatArray8957[3] = (float) aClass180_Sub3_1647.anInt9705 * f_5_ % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray8957, 0);
		}
		aClass180_Sub3_1647.method15400(0);
	}

	void method2318(int i, int i_8_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_9_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_10_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		aClass180_Sub3_1647.method15400(1);
		if (bool) {
			aFloatArray8957[0] = f_10_;
			aFloatArray8957[1] = 0.0F;
			aFloatArray8957[2] = 0.0F;
			aFloatArray8957[3] = 0.0F;
		} else {
			aFloatArray8957[0] = 0.0F;
			aFloatArray8957[1] = 0.0F;
			aFloatArray8957[2] = f_10_;
			aFloatArray8957[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray8957, 0);
		aFloatArray8957[0] = 0.0F;
		aFloatArray8957[1] = f_10_;
		aFloatArray8957[2] = 0.0F;
		aFloatArray8957[3] = (float) aClass180_Sub3_1647.anInt9705 * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray8957, 0);
		if (!aClass136_8959.aBool1570) {
			int i_11_ = (int) (f_9_ * (float) aClass180_Sub3_1647.anInt9705 * 16.0F);
			aClass180_Sub3_1647.method15401(aClass136_8959.aClass118_Sub3Array1573[i_11_ % 16]);
		} else {
			aFloatArray8957[0] = 0.0F;
			aFloatArray8957[1] = 0.0F;
			aFloatArray8957[2] = 0.0F;
			aFloatArray8957[3] = (float) aClass180_Sub3_1647.anInt9705 * f_9_ % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray8957, 0);
		}
		aClass180_Sub3_1647.method15400(0);
	}

	void method2322() {
		aClass121_8960.method2127('\001');
		aClass180_Sub3_1647.method15400(1);
		aClass180_Sub3_1647.method15401(null);
		aClass180_Sub3_1647.method15400(0);
	}

	void method2333(int i, int i_12_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_13_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_14_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		aClass180_Sub3_1647.method15400(1);
		if (bool) {
			aFloatArray8957[0] = f_14_;
			aFloatArray8957[1] = 0.0F;
			aFloatArray8957[2] = 0.0F;
			aFloatArray8957[3] = 0.0F;
		} else {
			aFloatArray8957[0] = 0.0F;
			aFloatArray8957[1] = 0.0F;
			aFloatArray8957[2] = f_14_;
			aFloatArray8957[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray8957, 0);
		aFloatArray8957[0] = 0.0F;
		aFloatArray8957[1] = f_14_;
		aFloatArray8957[2] = 0.0F;
		aFloatArray8957[3] = (float) aClass180_Sub3_1647.anInt9705 * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray8957, 0);
		if (!aClass136_8959.aBool1570) {
			int i_15_ = (int) (f_13_ * (float) aClass180_Sub3_1647.anInt9705 * 16.0F);
			aClass180_Sub3_1647.method15401(aClass136_8959.aClass118_Sub3Array1573[i_15_ % 16]);
		} else {
			aFloatArray8957[0] = 0.0F;
			aFloatArray8957[1] = 0.0F;
			aFloatArray8957[2] = 0.0F;
			aFloatArray8957[3] = (float) aClass180_Sub3_1647.anInt9705 * f_13_ % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray8957, 0);
		}
		aClass180_Sub3_1647.method15400(0);
	}

	void method2334(int i, int i_16_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_17_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_18_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		aClass180_Sub3_1647.method15400(1);
		if (bool) {
			aFloatArray8957[0] = f_18_;
			aFloatArray8957[1] = 0.0F;
			aFloatArray8957[2] = 0.0F;
			aFloatArray8957[3] = 0.0F;
		} else {
			aFloatArray8957[0] = 0.0F;
			aFloatArray8957[1] = 0.0F;
			aFloatArray8957[2] = f_18_;
			aFloatArray8957[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray8957, 0);
		aFloatArray8957[0] = 0.0F;
		aFloatArray8957[1] = f_18_;
		aFloatArray8957[2] = 0.0F;
		aFloatArray8957[3] = (float) aClass180_Sub3_1647.anInt9705 * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray8957, 0);
		if (!aClass136_8959.aBool1570) {
			int i_19_ = (int) (f_17_ * (float) aClass180_Sub3_1647.anInt9705 * 16.0F);
			aClass180_Sub3_1647.method15401(aClass136_8959.aClass118_Sub3Array1573[i_19_ % 16]);
		} else {
			aFloatArray8957[0] = 0.0F;
			aFloatArray8957[1] = 0.0F;
			aFloatArray8957[2] = 0.0F;
			aFloatArray8957[3] = (float) aClass180_Sub3_1647.anInt9705 * f_17_ % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray8957, 0);
		}
		aClass180_Sub3_1647.method15400(0);
	}

	void method2335(boolean bool) {
		aClass121_8960.method2127('\0');
		if (aClass136_8959.aBool1570) {
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(aClass136_8959.aClass118_Sub4_1577);
			aClass180_Sub3_1647.method15400(0);
		}
	}

	boolean method2321() {
		return true;
	}

	void method2332(int i, int i_20_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_21_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_22_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		aClass180_Sub3_1647.method15400(1);
		if (bool) {
			aFloatArray8957[0] = f_22_;
			aFloatArray8957[1] = 0.0F;
			aFloatArray8957[2] = 0.0F;
			aFloatArray8957[3] = 0.0F;
		} else {
			aFloatArray8957[0] = 0.0F;
			aFloatArray8957[1] = 0.0F;
			aFloatArray8957[2] = f_22_;
			aFloatArray8957[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray8957, 0);
		aFloatArray8957[0] = 0.0F;
		aFloatArray8957[1] = f_22_;
		aFloatArray8957[2] = 0.0F;
		aFloatArray8957[3] = (float) aClass180_Sub3_1647.anInt9705 * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray8957, 0);
		if (!aClass136_8959.aBool1570) {
			int i_23_ = (int) (f_21_ * (float) aClass180_Sub3_1647.anInt9705 * 16.0F);
			aClass180_Sub3_1647.method15401(aClass136_8959.aClass118_Sub3Array1573[i_23_ % 16]);
		} else {
			aFloatArray8957[0] = 0.0F;
			aFloatArray8957[1] = 0.0F;
			aFloatArray8957[2] = 0.0F;
			aFloatArray8957[3] = (float) aClass180_Sub3_1647.anInt9705 * f_21_ % 1.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray8957, 0);
		}
		aClass180_Sub3_1647.method15400(0);
	}

	void method2338() {
		aClass121_8960.method2127('\001');
		aClass180_Sub3_1647.method15400(1);
		aClass180_Sub3_1647.method15401(null);
		aClass180_Sub3_1647.method15400(0);
	}

	void method2339(Class118 class118, int i) {
		aClass180_Sub3_1647.method15401(class118);
		aClass180_Sub3_1647.method15402(i);
	}

	boolean method2325() {
		return true;
	}

	void method2331(Class118 class118, int i) {
		aClass180_Sub3_1647.method15401(class118);
		aClass180_Sub3_1647.method15402(i);
	}
}
