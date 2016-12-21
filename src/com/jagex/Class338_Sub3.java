/* Class338_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class338_Sub3 extends Class338 {
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10271;
	public static float aFloat10272;
	public static int anInt10273;
	public static Class168_Sub2[] aClass168_Sub2Array10274;
	Class286 aClass286_10275;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10276;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10277;
	Class285[] aClass285Array10278 = null;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10279;
	Class536_Sub8_Sub1[] aClass536_Sub8_Sub1Array10280 = null;
	public static float[] aFloatArray10281 = { 0.0F, 0.0F, 0.0F };
	boolean aBool10282;

	int method4419() {
		return 2;
	}

	int method4423() {
		return 0;
	}

	boolean method4386() {
		return (aClass167_Sub3_3647.aBool9692 && aClass167_Sub3_3647.method8710());
	}

	void method4412() {
		/* empty */
	}

	void method4391(int i, int i_0_) {
		/* empty */
	}

	void method4390() {
		/* empty */
	}

	int method4430() {
		return 1;
	}

	void method4392(int i, Class183_Sub2 class183_sub2, Interface36 interface36, Interface21 interface21, Interface36 interface36_1_, boolean bool) {
		float f = aClass167_Sub3_3647.method8725();
		float f_2_ = (float) class183_sub2.method2725();
		float f_3_ = (float) class183_sub2.method2726();
		Interface36 interface36_4_ = interface36;
		float f_5_ = f * 2.0F / f_2_;
		float f_6_ = -f * 2.0F / f_3_;
		float[] fs = { -1.0F + f_5_, 1.0F + f_6_, 0.0F, 0.0F, -1.0F + f_5_, -3.0F + f_6_, 0.0F, 2.0F, 3.0F + f_5_, 1.0F + f_6_, 2.0F, 0.0F };
		int i_7_ = (int) f_2_;
		int i_8_ = (int) f_3_;
		int i_9_ = (bool ? aClass167_Sub3_3647.method2022(987802144).method2725() : i_7_);
		int i_10_ = (bool ? aClass167_Sub3_3647.method2022(860721368).method2726() : i_8_);
		Class285 class285 = aClass285Array10278[anInt10273 - 1];
		aClass286_10275.method3850(class285);
		aClass286_10275.method3843();
		aClass286_10275.method3856(aClass536_Sub8_Sub1_10279, aFloat10272, aFloatArray10281[0], aFloatArray10281[1], aFloatArray10281[2], 538718616);
		Object object = null;
		Object object_11_ = null;
		for (int i_12_ = 0; i_12_ < anInt10273; i_12_++) {
			if (aClass168_Sub2Array10274[i_12_] != null) {
				Class536_Sub8_Sub1 class536_sub8_sub1 = aClass536_Sub8_Sub1Array10280[i_12_];
				Interface40 interface40 = aClass168_Sub2Array10274[i_12_].method8986();
				aClass286_10275.method3896(class536_sub8_sub1, i_12_ + 1, interface40, -948976061);
			}
		}
		float f_13_ = (float) i_7_ / f_2_;
		float f_14_ = (float) i_8_ / f_3_;
		float f_15_ = (float) i_9_ / f_2_;
		float f_16_ = (float) i_10_ / f_3_;
		fs[8] = (fs[8] + 1.0F) * f_13_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_14_ + 1.0F;
		fs[10] *= f_15_;
		fs[7] *= f_16_;
		aClass286_10275.method3858(aClass536_Sub8_Sub1_10277, fs, -70951425);
		aClass286_10275.method3896(aClass536_Sub8_Sub1_10276, 0, interface36_4_, -948976061);
		aClass286_10275.method3856(aClass536_Sub8_Sub1_10271, 0.0F, 0.0F, 0.0F, 0.0F, 538718616);
		aClass167_Sub3_3647.method2048(0, 0, i_7_, i_8_);
	}

	void method4407(int i) {
		aClass286_10275.method3844();
	}

	int method4395() {
		return 0;
	}

	int method4418() {
		return 2;
	}

	boolean method4387() {
		return aBool10282;
	}

	static {
		aFloat10272 = 1.0F;
		anInt10273 = 1;
		aClass168_Sub2Array10274 = new Class168_Sub2[] { null, null, null };
	}

	boolean method4428() {
		return (anInt10273 == 0 || aFloat10272 == 1.0F || (aFloatArray10281[0] + aFloatArray10281[1] + aFloatArray10281[2]) == 0.0F || (aClass168_Sub2Array10274[0] == null && aClass168_Sub2Array10274[1] == null && aClass168_Sub2Array10274[2] == null));
	}

	boolean method4410() {
		return aBool10282;
	}

	boolean method4401() {
		return aBool10282;
	}

	boolean method4402() {
		return aBool10282;
	}

	boolean method4388() {
		if (method4386()) {
			aClass286_10275 = aClass167_Sub3_3647.method8714("FilterColourRemapping");
			if (aClass286_10275 == null)
				return false;
			try {
				aClass536_Sub8_Sub1_10276 = aClass286_10275.method3866("sceneTex", (byte) 0);
				aClass285Array10278 = new Class285[3];
				aClass536_Sub8_Sub1Array10280 = new Class536_Sub8_Sub1[3];
				if (aClass167_Sub3_3647.aBool9697) {
					aClass285Array10278[0] = aClass286_10275.method3855("techRemap3D_1", (byte) -28);
					aClass285Array10278[1] = aClass286_10275.method3855("techRemap3D_2", (byte) -113);
					aClass285Array10278[2] = aClass286_10275.method3855("techRemap3D_3", (byte) 38);
					aClass536_Sub8_Sub1Array10280[0] = aClass286_10275.method3866("remapTex3D_1", (byte) 0);
					aClass536_Sub8_Sub1Array10280[1] = aClass286_10275.method3866("remapTex3D_2", (byte) 0);
					aClass536_Sub8_Sub1Array10280[2] = aClass286_10275.method3866("remapTex3D_3", (byte) 0);
				} else {
					aClass285Array10278[0] = aClass286_10275.method3855("techRemap2D_1", (byte) -15);
					aClass285Array10278[1] = aClass286_10275.method3855("techRemap2D_2", (byte) 36);
					aClass285Array10278[2] = aClass286_10275.method3855("techRemap2D_3", (byte) -36);
					aClass536_Sub8_Sub1Array10280[0] = aClass286_10275.method3866("remapTex2D_1", (byte) 0);
					aClass536_Sub8_Sub1Array10280[1] = aClass286_10275.method3866("remapTex2D_2", (byte) 0);
					aClass536_Sub8_Sub1Array10280[2] = aClass286_10275.method3866("remapTex2D_3", (byte) 0);
				}
				aClass536_Sub8_Sub1_10279 = aClass286_10275.method3866("paramsWeightings", (byte) 0);
				aClass536_Sub8_Sub1_10271 = aClass286_10275.method3866("pixelOffset", (byte) 0);
				aClass536_Sub8_Sub1_10277 = aClass286_10275.method3866("PosAndTexCoords", (byte) 0);
			} catch (Exception_Sub7_Sub1 exception_sub7_sub1) {
				return false;
			} catch (Exception_Sub7_Sub2 exception_sub7_sub2) {
				return false;
			}
			if (!aClass285Array10278[0].method3785() || !aClass285Array10278[1].method3785() || !aClass285Array10278[2].method3785())
				return false;
			aBool10282 = true;
			return true;
		}
		return false;
	}

	boolean method4404() {
		if (method4386()) {
			aClass286_10275 = aClass167_Sub3_3647.method8714("FilterColourRemapping");
			if (aClass286_10275 == null)
				return false;
			try {
				aClass536_Sub8_Sub1_10276 = aClass286_10275.method3866("sceneTex", (byte) 0);
				aClass285Array10278 = new Class285[3];
				aClass536_Sub8_Sub1Array10280 = new Class536_Sub8_Sub1[3];
				if (aClass167_Sub3_3647.aBool9697) {
					aClass285Array10278[0] = aClass286_10275.method3855("techRemap3D_1", (byte) -72);
					aClass285Array10278[1] = aClass286_10275.method3855("techRemap3D_2", (byte) -43);
					aClass285Array10278[2] = aClass286_10275.method3855("techRemap3D_3", (byte) -76);
					aClass536_Sub8_Sub1Array10280[0] = aClass286_10275.method3866("remapTex3D_1", (byte) 0);
					aClass536_Sub8_Sub1Array10280[1] = aClass286_10275.method3866("remapTex3D_2", (byte) 0);
					aClass536_Sub8_Sub1Array10280[2] = aClass286_10275.method3866("remapTex3D_3", (byte) 0);
				} else {
					aClass285Array10278[0] = aClass286_10275.method3855("techRemap2D_1", (byte) -106);
					aClass285Array10278[1] = aClass286_10275.method3855("techRemap2D_2", (byte) 67);
					aClass285Array10278[2] = aClass286_10275.method3855("techRemap2D_3", (byte) -1);
					aClass536_Sub8_Sub1Array10280[0] = aClass286_10275.method3866("remapTex2D_1", (byte) 0);
					aClass536_Sub8_Sub1Array10280[1] = aClass286_10275.method3866("remapTex2D_2", (byte) 0);
					aClass536_Sub8_Sub1Array10280[2] = aClass286_10275.method3866("remapTex2D_3", (byte) 0);
				}
				aClass536_Sub8_Sub1_10279 = aClass286_10275.method3866("paramsWeightings", (byte) 0);
				aClass536_Sub8_Sub1_10271 = aClass286_10275.method3866("pixelOffset", (byte) 0);
				aClass536_Sub8_Sub1_10277 = aClass286_10275.method3866("PosAndTexCoords", (byte) 0);
			} catch (Exception_Sub7_Sub1 exception_sub7_sub1) {
				return false;
			} catch (Exception_Sub7_Sub2 exception_sub7_sub2) {
				return false;
			}
			if (!aClass285Array10278[0].method3785() || !aClass285Array10278[1].method3785() || !aClass285Array10278[2].method3785())
				return false;
			aBool10282 = true;
			return true;
		}
		return false;
	}

	boolean method4405() {
		if (method4386()) {
			aClass286_10275 = aClass167_Sub3_3647.method8714("FilterColourRemapping");
			if (aClass286_10275 == null)
				return false;
			try {
				aClass536_Sub8_Sub1_10276 = aClass286_10275.method3866("sceneTex", (byte) 0);
				aClass285Array10278 = new Class285[3];
				aClass536_Sub8_Sub1Array10280 = new Class536_Sub8_Sub1[3];
				if (aClass167_Sub3_3647.aBool9697) {
					aClass285Array10278[0] = aClass286_10275.method3855("techRemap3D_1", (byte) -71);
					aClass285Array10278[1] = aClass286_10275.method3855("techRemap3D_2", (byte) 2);
					aClass285Array10278[2] = aClass286_10275.method3855("techRemap3D_3", (byte) 52);
					aClass536_Sub8_Sub1Array10280[0] = aClass286_10275.method3866("remapTex3D_1", (byte) 0);
					aClass536_Sub8_Sub1Array10280[1] = aClass286_10275.method3866("remapTex3D_2", (byte) 0);
					aClass536_Sub8_Sub1Array10280[2] = aClass286_10275.method3866("remapTex3D_3", (byte) 0);
				} else {
					aClass285Array10278[0] = aClass286_10275.method3855("techRemap2D_1", (byte) 11);
					aClass285Array10278[1] = aClass286_10275.method3855("techRemap2D_2", (byte) -17);
					aClass285Array10278[2] = aClass286_10275.method3855("techRemap2D_3", (byte) -103);
					aClass536_Sub8_Sub1Array10280[0] = aClass286_10275.method3866("remapTex2D_1", (byte) 0);
					aClass536_Sub8_Sub1Array10280[1] = aClass286_10275.method3866("remapTex2D_2", (byte) 0);
					aClass536_Sub8_Sub1Array10280[2] = aClass286_10275.method3866("remapTex2D_3", (byte) 0);
				}
				aClass536_Sub8_Sub1_10279 = aClass286_10275.method3866("paramsWeightings", (byte) 0);
				aClass536_Sub8_Sub1_10271 = aClass286_10275.method3866("pixelOffset", (byte) 0);
				aClass536_Sub8_Sub1_10277 = aClass286_10275.method3866("PosAndTexCoords", (byte) 0);
			} catch (Exception_Sub7_Sub1 exception_sub7_sub1) {
				return false;
			} catch (Exception_Sub7_Sub2 exception_sub7_sub2) {
				return false;
			}
			if (!aClass285Array10278[0].method3785() || !aClass285Array10278[1].method3785() || !aClass285Array10278[2].method3785())
				return false;
			aBool10282 = true;
			return true;
		}
		return false;
	}

	void method4413() {
		/* empty */
	}

	void method4425() {
		/* empty */
	}

	void method4409() {
		/* empty */
	}

	int method4422() {
		return 0;
	}

	void method4426(int i, int i_17_) {
		/* empty */
	}

	void method4414(int i, int i_18_) {
		/* empty */
	}

	void method4415(int i, Class183_Sub2 class183_sub2, Interface36 interface36, Interface21 interface21, Interface36 interface36_19_, boolean bool) {
		float f = aClass167_Sub3_3647.method8725();
		float f_20_ = (float) class183_sub2.method2725();
		float f_21_ = (float) class183_sub2.method2726();
		Interface36 interface36_22_ = interface36;
		float f_23_ = f * 2.0F / f_20_;
		float f_24_ = -f * 2.0F / f_21_;
		float[] fs = { -1.0F + f_23_, 1.0F + f_24_, 0.0F, 0.0F, -1.0F + f_23_, -3.0F + f_24_, 0.0F, 2.0F, 3.0F + f_23_, 1.0F + f_24_, 2.0F, 0.0F };
		int i_25_ = (int) f_20_;
		int i_26_ = (int) f_21_;
		int i_27_ = (bool ? aClass167_Sub3_3647.method2022(769577914).method2725() : i_25_);
		int i_28_ = (bool ? aClass167_Sub3_3647.method2022(492080586).method2726() : i_26_);
		Class285 class285 = aClass285Array10278[anInt10273 - 1];
		aClass286_10275.method3850(class285);
		aClass286_10275.method3843();
		aClass286_10275.method3856(aClass536_Sub8_Sub1_10279, aFloat10272, aFloatArray10281[0], aFloatArray10281[1], aFloatArray10281[2], 538718616);
		Object object = null;
		Object object_29_ = null;
		for (int i_30_ = 0; i_30_ < anInt10273; i_30_++) {
			if (aClass168_Sub2Array10274[i_30_] != null) {
				Class536_Sub8_Sub1 class536_sub8_sub1 = aClass536_Sub8_Sub1Array10280[i_30_];
				Interface40 interface40 = aClass168_Sub2Array10274[i_30_].method8986();
				aClass286_10275.method3896(class536_sub8_sub1, i_30_ + 1, interface40, -948976061);
			}
		}
		float f_31_ = (float) i_25_ / f_20_;
		float f_32_ = (float) i_26_ / f_21_;
		float f_33_ = (float) i_27_ / f_20_;
		float f_34_ = (float) i_28_ / f_21_;
		fs[8] = (fs[8] + 1.0F) * f_31_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_32_ + 1.0F;
		fs[10] *= f_33_;
		fs[7] *= f_34_;
		aClass286_10275.method3858(aClass536_Sub8_Sub1_10277, fs, 105121020);
		aClass286_10275.method3896(aClass536_Sub8_Sub1_10276, 0, interface36_22_, -948976061);
		aClass286_10275.method3856(aClass536_Sub8_Sub1_10271, 0.0F, 0.0F, 0.0F, 0.0F, 538718616);
		aClass167_Sub3_3647.method2048(0, 0, i_25_, i_26_);
	}

	boolean method4399() {
		return (aClass167_Sub3_3647.aBool9692 && aClass167_Sub3_3647.method8710());
	}

	int method4417() {
		return 1;
	}

	int method4385() {
		return 2;
	}

	void method4394(int i, Class183_Sub2 class183_sub2, Interface36 interface36, Interface21 interface21, Interface36 interface36_35_, boolean bool) {
		float f = aClass167_Sub3_3647.method8725();
		float f_36_ = (float) class183_sub2.method2725();
		float f_37_ = (float) class183_sub2.method2726();
		Interface36 interface36_38_ = interface36;
		float f_39_ = f * 2.0F / f_36_;
		float f_40_ = -f * 2.0F / f_37_;
		float[] fs = { -1.0F + f_39_, 1.0F + f_40_, 0.0F, 0.0F, -1.0F + f_39_, -3.0F + f_40_, 0.0F, 2.0F, 3.0F + f_39_, 1.0F + f_40_, 2.0F, 0.0F };
		int i_41_ = (int) f_36_;
		int i_42_ = (int) f_37_;
		int i_43_ = (bool ? aClass167_Sub3_3647.method2022(722592586).method2725() : i_41_);
		int i_44_ = (bool ? aClass167_Sub3_3647.method2022(902903813).method2726() : i_42_);
		Class285 class285 = aClass285Array10278[anInt10273 - 1];
		aClass286_10275.method3850(class285);
		aClass286_10275.method3843();
		aClass286_10275.method3856(aClass536_Sub8_Sub1_10279, aFloat10272, aFloatArray10281[0], aFloatArray10281[1], aFloatArray10281[2], 538718616);
		Object object = null;
		Object object_45_ = null;
		for (int i_46_ = 0; i_46_ < anInt10273; i_46_++) {
			if (aClass168_Sub2Array10274[i_46_] != null) {
				Class536_Sub8_Sub1 class536_sub8_sub1 = aClass536_Sub8_Sub1Array10280[i_46_];
				Interface40 interface40 = aClass168_Sub2Array10274[i_46_].method8986();
				aClass286_10275.method3896(class536_sub8_sub1, i_46_ + 1, interface40, -948976061);
			}
		}
		float f_47_ = (float) i_41_ / f_36_;
		float f_48_ = (float) i_42_ / f_37_;
		float f_49_ = (float) i_43_ / f_36_;
		float f_50_ = (float) i_44_ / f_37_;
		fs[8] = (fs[8] + 1.0F) * f_47_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_48_ + 1.0F;
		fs[10] *= f_49_;
		fs[7] *= f_50_;
		aClass286_10275.method3858(aClass536_Sub8_Sub1_10277, fs, -365856757);
		aClass286_10275.method3896(aClass536_Sub8_Sub1_10276, 0, interface36_38_, -948976061);
		aClass286_10275.method3856(aClass536_Sub8_Sub1_10271, 0.0F, 0.0F, 0.0F, 0.0F, 538718616);
		aClass167_Sub3_3647.method2048(0, 0, i_41_, i_42_);
	}

	int method4403() {
		return 2;
	}

	int method4421() {
		return 0;
	}

	public Class338_Sub3(Class167_Sub3 class167_sub3) {
		super(class167_sub3);
	}

	boolean method4398() {
		return (anInt10273 == 0 || aFloat10272 == 1.0F || (aFloatArray10281[0] + aFloatArray10281[1] + aFloatArray10281[2]) == 0.0F || (aClass168_Sub2Array10274[0] == null && aClass168_Sub2Array10274[1] == null && aClass168_Sub2Array10274[2] == null));
	}

	boolean method4427() {
		return (anInt10273 == 0 || aFloat10272 == 1.0F || (aFloatArray10281[0] + aFloatArray10281[1] + aFloatArray10281[2]) == 0.0F || (aClass168_Sub2Array10274[0] == null && aClass168_Sub2Array10274[1] == null && aClass168_Sub2Array10274[2] == null));
	}

	void method4432(int i) {
		aClass286_10275.method3844();
	}

	void method4429(int i) {
		aClass286_10275.method3844();
	}

	void method4416(int i) {
		aClass286_10275.method3844();
	}

	void method4431(int i) {
		aClass286_10275.method3844();
	}

	boolean method4400() {
		return (aClass167_Sub3_3647.aBool9692 && aClass167_Sub3_3647.method8710());
	}
}
