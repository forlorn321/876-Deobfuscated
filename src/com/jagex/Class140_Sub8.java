/* Class140_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class140_Sub8 extends Class140 {
	static final float aFloat8967 = -12.0F;
	static final int anInt8968 = 5;
	static final int anInt8969 = 128;
	static final int anInt8970 = 24;
	static final float aFloat8971 = 26.0F;
	boolean aBool8972;
	static final float aFloat8973 = 0.0F;
	static final char aChar8974 = '\0';
	static final char aChar8975 = '\001';
	static final int anInt8976 = 128;
	Class121 aClass121_8977;
	boolean aBool8978 = false;
	Class118_Sub2[] aClass118_Sub2Array8979;

	boolean method2321() {
		return true;
	}

	void method2332(int i, int i_0_) {
		if (aBool8978) {
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(aClass118_Sub2Array8979[i - 1]);
			aClass180_Sub3_1647.method15400(0);
		}
	}

	void method14473() {
		aClass121_8977 = new Class121(aClass180_Sub3_1647, 2);
		aClass121_8977.method2126(0);
		aClass180_Sub3_1647.method15400(1);
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
		if (!aBool8972) {
			aClass180_Sub3_1647.method15403(7681, 8448);
			aClass180_Sub3_1647.method15404(0, 34168, 768);
			aClass180_Sub3_1647.method15400(2);
			aClass180_Sub3_1647.method15403(260, 7681);
			aClass180_Sub3_1647.method15404(0, 34168, 768);
			aClass180_Sub3_1647.method15404(1, 34168, 770);
			aClass180_Sub3_1647.method15405(0, 34167, 770);
		} else {
			aClass180_Sub3_1647.method15403(260, 7681);
			aClass180_Sub3_1647.method15404(0, 5890, 770);
			aClass180_Sub3_1647.method15405(0, 34167, 770);
		}
		aClass180_Sub3_1647.method15400(0);
		aClass121_8977.method2129();
		aClass121_8977.method2126(1);
		aClass180_Sub3_1647.method15400(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (!aBool8972) {
			aClass180_Sub3_1647.method15403(8448, 8448);
			aClass180_Sub3_1647.method15404(0, 5890, 768);
			aClass180_Sub3_1647.method15400(2);
			aClass180_Sub3_1647.method15403(8448, 8448);
			aClass180_Sub3_1647.method15404(0, 5890, 768);
			aClass180_Sub3_1647.method15404(1, 34168, 768);
			aClass180_Sub3_1647.method15405(0, 5890, 770);
		} else {
			aClass180_Sub3_1647.method15403(8448, 8448);
			aClass180_Sub3_1647.method15404(0, 5890, 768);
			aClass180_Sub3_1647.method15405(0, 5890, 770);
		}
		aClass180_Sub3_1647.method15400(0);
		aClass121_8977.method2129();
	}

	void method2324(boolean bool) {
		if (aClass121_8977 != null && bool) {
			if (!aBool8972) {
				aClass180_Sub3_1647.method15400(2);
				aClass180_Sub3_1647.method15401(aClass180_Sub3_1647.aClass118_Sub3_9807);
				aClass180_Sub3_1647.method15400(0);
			}
			aClass121_8977.method2127('\0');
			aBool8978 = true;
		} else
			aClass180_Sub3_1647.method15405(0, 34168, 770);
	}

	void method2333(int i, int i_1_) {
		if (aBool8978) {
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(aClass118_Sub2Array8979[i - 1]);
			aClass180_Sub3_1647.method15400(0);
		}
	}

	void method2339(Class118 class118, int i) {
		aClass180_Sub3_1647.method15401(class118);
		aClass180_Sub3_1647.method15402(i);
	}

	void method2340(boolean bool) {
		aClass180_Sub3_1647.method15403(8448, 7681);
	}

	void method2322() {
		if (aBool8978) {
			if (!aBool8972) {
				aClass180_Sub3_1647.method15400(2);
				aClass180_Sub3_1647.method15401(null);
			}
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(null);
			aClass180_Sub3_1647.method15400(0);
			aClass121_8977.method2127('\001');
			aBool8978 = false;
		} else
			aClass180_Sub3_1647.method15405(0, 5890, 770);
		aClass180_Sub3_1647.method15403(8448, 8448);
	}

	boolean method2325() {
		return true;
	}

	boolean method2319() {
		return true;
	}

	void method2326(boolean bool) {
		aClass180_Sub3_1647.method15403(8448, 7681);
	}

	void method2341(boolean bool) {
		aClass180_Sub3_1647.method15403(8448, 7681);
	}

	Class140_Sub8(Class180_Sub3 class180_sub3) {
		super(class180_sub3);
		if (class180_sub3.aBool9827) {
			byte[][] is = new byte[6][16384];
			byte[][] is_2_ = new byte[6][16384];
			byte[][] is_3_ = new byte[6][16384];
			int i = 0;
			Class442 class442 = new Class442(0.0F, -1.0F, 0.0F);
			for (int i_4_ = 0; i_4_ < 128; i_4_++) {
				for (int i_5_ = 0; i_5_ < 128; i_5_++) {
					float f = 2.0F * (float) i_5_ / 128.0F - 1.0F;
					float f_6_ = 2.0F * (float) i_4_ / 128.0F - 1.0F;
					float f_7_ = (float) (1.0 / Math.sqrt((double) (f * f + 1.0F + f_6_ * f_6_)));
					f *= f_7_;
					f_6_ *= f_7_;
					for (int i_8_ = 0; i_8_ < 6; i_8_++) {
						Class442 class442_9_;
						if (i_8_ == 0)
							class442_9_ = new Class442(-f_7_, -f, f_6_);
						else if (i_8_ == 1)
							class442_9_ = new Class442(f_7_, f, f_6_);
						else if (i_8_ == 2)
							class442_9_ = new Class442(-f, f_6_, -f_7_);
						else if (i_8_ == 3)
							class442_9_ = new Class442(-f, -f_6_, f_7_);
						else if (i_8_ == 4)
							class442_9_ = new Class442(f, f_7_, -f_6_);
						else
							class442_9_ = new Class442(f, -f_7_, f_6_);
						float f_10_ = class442_9_.method7212(class442);
						f_10_ = Math.max(0.0F, Math.min(1.0F, f_10_));
						int i_11_;
						int i_12_;
						int i_13_;
						if (f_10_ > 0.0F) {
							i_13_ = Math.min(255, (int) (Math.pow((double) f_10_, 128.0) * 400.0));
							i_12_ = Math.min(255, (int) (Math.pow((double) f_10_, 24.0) * 400.0));
							i_11_ = Math.min(255, (int) (Math.pow((double) f_10_, 5.0) * 400.0));
						} else {
							i_11_ = 0;
							i_12_ = 0;
							i_13_ = 0;
						}
						is_2_[i_8_][i] = (byte) i_13_;
						is_3_[i_8_][i] = (byte) i_12_;
						is[i_8_][i] = (byte) i_11_;
					}
					i++;
				}
			}
			aClass118_Sub2Array8979 = new Class118_Sub2[3];
			aClass118_Sub2Array8979[0] = new Class118_Sub2(aClass180_Sub3_1647, Class157.aClass157_1724, Class184.aClass184_2104, 128, false, is_2_, Class157.aClass157_1724);
			aClass118_Sub2Array8979[1] = new Class118_Sub2(aClass180_Sub3_1647, Class157.aClass157_1724, Class184.aClass184_2104, 128, false, is_3_, Class157.aClass157_1724);
			aClass118_Sub2Array8979[2] = new Class118_Sub2(aClass180_Sub3_1647, Class157.aClass157_1724, Class184.aClass184_2104, 128, false, is, Class157.aClass157_1724);
			method14473();
		}
	}

	void method2329(boolean bool) {
		aClass180_Sub3_1647.method15403(8448, 7681);
	}

	void method2330(int i, int i_14_) {
		if (aBool8978) {
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(aClass118_Sub2Array8979[i - 1]);
			aClass180_Sub3_1647.method15400(0);
		}
	}

	void method2338() {
		if (aBool8978) {
			if (!aBool8972) {
				aClass180_Sub3_1647.method15400(2);
				aClass180_Sub3_1647.method15401(null);
			}
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(null);
			aClass180_Sub3_1647.method15400(0);
			aClass121_8977.method2127('\001');
			aBool8978 = false;
		} else
			aClass180_Sub3_1647.method15405(0, 5890, 770);
		aClass180_Sub3_1647.method15403(8448, 8448);
	}

	void method2328(boolean bool) {
		aClass180_Sub3_1647.method15403(8448, 7681);
	}

	void method2320(Class118 class118, int i) {
		aClass180_Sub3_1647.method15401(class118);
		aClass180_Sub3_1647.method15402(i);
	}

	void method2334(int i, int i_15_) {
		if (aBool8978) {
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(aClass118_Sub2Array8979[i - 1]);
			aClass180_Sub3_1647.method15400(0);
		}
	}

	void method2335(boolean bool) {
		if (aClass121_8977 != null && bool) {
			if (!aBool8972) {
				aClass180_Sub3_1647.method15400(2);
				aClass180_Sub3_1647.method15401(aClass180_Sub3_1647.aClass118_Sub3_9807);
				aClass180_Sub3_1647.method15400(0);
			}
			aClass121_8977.method2127('\0');
			aBool8978 = true;
		} else
			aClass180_Sub3_1647.method15405(0, 34168, 770);
	}

	void method2336(boolean bool) {
		if (aClass121_8977 != null && bool) {
			if (!aBool8972) {
				aClass180_Sub3_1647.method15400(2);
				aClass180_Sub3_1647.method15401(aClass180_Sub3_1647.aClass118_Sub3_9807);
				aClass180_Sub3_1647.method15400(0);
			}
			aClass121_8977.method2127('\0');
			aBool8978 = true;
		} else
			aClass180_Sub3_1647.method15405(0, 34168, 770);
	}

	void method2337(boolean bool) {
		if (aClass121_8977 != null && bool) {
			if (!aBool8972) {
				aClass180_Sub3_1647.method15400(2);
				aClass180_Sub3_1647.method15401(aClass180_Sub3_1647.aClass118_Sub3_9807);
				aClass180_Sub3_1647.method15400(0);
			}
			aClass121_8977.method2127('\0');
			aBool8978 = true;
		} else
			aClass180_Sub3_1647.method15405(0, 34168, 770);
	}

	void method2318(int i, int i_16_) {
		if (aBool8978) {
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(aClass118_Sub2Array8979[i - 1]);
			aClass180_Sub3_1647.method15400(0);
		}
	}

	void method2323(int i, int i_17_) {
		if (aBool8978) {
			aClass180_Sub3_1647.method15400(1);
			aClass180_Sub3_1647.method15401(aClass118_Sub2Array8979[i - 1]);
			aClass180_Sub3_1647.method15400(0);
		}
	}

	void method2327(Class118 class118, int i) {
		aClass180_Sub3_1647.method15401(class118);
		aClass180_Sub3_1647.method15402(i);
	}

	void method2331(Class118 class118, int i) {
		aClass180_Sub3_1647.method15401(class118);
		aClass180_Sub3_1647.method15402(i);
	}
}
