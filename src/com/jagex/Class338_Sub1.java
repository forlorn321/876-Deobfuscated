/* Class338_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class338_Sub1 extends Class338 {
	Class285 aClass285_10169;
	public static float aFloat10170 = 0.25F;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10171;
	public static float aFloat10172;
	public static float aFloat10173 = 1.0F;
	Class286 aClass286_10174;
	boolean aBool10175;
	Class285 aClass285_10176;
	Class285 aClass285_10177;
	Class285 aClass285_10178;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10179;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10180;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10181;
	Class285 aClass285_10182;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10183;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10184;
	public static float aFloat10185;
	static final int anInt10186 = 256;

	boolean method4401() {
		return aBool10175;
	}

	boolean method4386() {
		return (aClass167_Sub3_3647.aBool9692 && aClass167_Sub3_3647.method8710() && aClass167_Sub3_3647.method8948(true));
	}

	boolean method4387() {
		return aBool10175;
	}

	boolean method4388() {
		if (method4386()) {
			aClass286_10174 = aClass167_Sub3_3647.method8714("FilterBloom");
			if (aClass286_10174 == null)
				return false;
			try {
				aClass536_Sub8_Sub1_10180 = aClass286_10174.method3866("sceneTex", (byte) 0);
				aClass536_Sub8_Sub1_10181 = aClass286_10174.method3866("bloomTex1", (byte) 0);
				aClass536_Sub8_Sub1_10179 = aClass286_10174.method3866("params", (byte) 0);
				aClass536_Sub8_Sub1_10183 = aClass286_10174.method3866("sampleSize", (byte) 0);
				aClass536_Sub8_Sub1_10184 = aClass286_10174.method3866("pixelOffsetAndBloomScale", (byte) 0);
				aClass536_Sub8_Sub1_10171 = aClass286_10174.method3866("PosAndTexCoords", (byte) 0);
				aClass286_10174.method3855("test", (byte) -3);
				aClass285_10169 = aClass286_10174.method3855("techFullscreenTri", (byte) 107);
				aClass285_10176 = aClass286_10174.method3855("brightpass", (byte) 75);
				aClass285_10177 = aClass286_10174.method3855("blur", (byte) 17);
				aClass285_10178 = aClass286_10174.method3855("composite", (byte) -24);
				aClass285_10182 = aClass286_10174.method3855("techDefault", (byte) 119);
			} catch (Exception_Sub7_Sub1 exception_sub7_sub1) {
				return false;
			} catch (Exception_Sub7_Sub2 exception_sub7_sub2) {
				return false;
			}
			if (!aClass285_10169.method3785())
				return false;
			if (!aClass285_10176.method3785())
				return false;
			if (!aClass285_10177.method3785())
				return false;
			if (!aClass285_10178.method3785())
				return false;
			if (!aClass285_10182.method3785())
				return false;
			aBool10175 = true;
			return true;
		}
		return false;
	}

	int method4418() {
		return 0;
	}

	void method4413() {
		/* empty */
	}

	int method4430() {
		return 4;
	}

	int method4395() {
		return 1;
	}

	void method4391(int i, int i_0_) {
		/* empty */
	}

	void method4407(int i) {
		aClass286_10174.method3844();
	}

	void method4390() {
		/* empty */
	}

	boolean method4398() {
		return false;
	}

	static {
		aFloat10172 = 1.0F;
		aFloat10185 = 1.0F;
	}

	boolean method4399() {
		return (aClass167_Sub3_3647.aBool9692 && aClass167_Sub3_3647.method8710() && aClass167_Sub3_3647.method8948(true));
	}

	void method4426(int i, int i_1_) {
		/* empty */
	}

	boolean method4400() {
		return (aClass167_Sub3_3647.aBool9692 && aClass167_Sub3_3647.method8710() && aClass167_Sub3_3647.method8948(true));
	}

	boolean method4402() {
		return aBool10175;
	}

	void method4394(int i, Class183_Sub2 class183_sub2, Interface36 interface36, Interface21 interface21, Interface36 interface36_2_, boolean bool) {
		float f = aClass167_Sub3_3647.method8725();
		float f_3_ = (float) class183_sub2.method2725();
		float f_4_ = (float) class183_sub2.method2726();
		Interface36 interface36_5_ = interface36;
		float f_6_ = f * 2.0F / f_3_;
		float f_7_ = -f * 2.0F / f_4_;
		float[] fs = { -1.0F + f_6_, 1.0F + f_7_, 0.0F, 0.0F, -1.0F + f_6_, -3.0F + f_7_, 0.0F, 2.0F, 3.0F + f_6_, 1.0F + f_7_, 2.0F, 0.0F };
		int i_8_ = (int) f_3_;
		int i_9_ = (int) f_4_;
		int i_10_ = (bool ? aClass167_Sub3_3647.method2022(1706432850).method2725() : i_8_);
		int i_11_ = (bool ? aClass167_Sub3_3647.method2022(561977665).method2726() : i_9_);
		if (i == 0) {
			i_8_ = 256;
			i_9_ = 256;
			aClass286_10174.method3850(aClass285_10176);
			aClass286_10174.method3843();
		} else if (i == 1) {
			i_8_ = 256;
			i_9_ = 256;
			i_10_ = i_8_;
			i_11_ = i_9_;
			aClass286_10174.method3850(aClass285_10177);
			aClass286_10174.method3843();
			aClass286_10174.method3854(aClass536_Sub8_Sub1_10183, aFloat10185 / f_3_, 0.0F, 1857095462);
		} else if (i == 2) {
			i_8_ = 256;
			i_9_ = 256;
			i_10_ = i_8_;
			i_11_ = i_9_;
			aClass286_10174.method3850(aClass285_10177);
			aClass286_10174.method3843();
			aClass286_10174.method3854(aClass536_Sub8_Sub1_10183, 0.0F, aFloat10185 / f_4_, 2095052380);
		} else if (i == 3) {
			aClass286_10174.method3850(aClass285_10178);
			interface36_5_ = interface36_2_;
			aClass286_10174.method3896(aClass536_Sub8_Sub1_10181, 1, interface36, -948976061);
			aClass286_10174.method3843();
		}
		float f_12_ = (float) i_8_ / f_3_;
		float f_13_ = (float) i_9_ / f_4_;
		float f_14_ = (float) i_10_ / f_3_;
		float f_15_ = (float) i_11_ / f_4_;
		fs[8] = (fs[8] + 1.0F) * f_12_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_13_ + 1.0F;
		fs[10] *= f_14_;
		fs[7] *= f_15_;
		aClass286_10174.method3858(aClass536_Sub8_Sub1_10171, fs, -1864573603);
		aClass286_10174.method3896(aClass536_Sub8_Sub1_10180, 0, interface36_5_, -948976061);
		aClass286_10174.method3856(aClass536_Sub8_Sub1_10179, aFloat10172, aFloat10170, aFloat10173, 0.0F, 538718616);
		aClass286_10174.method3856(aClass536_Sub8_Sub1_10184, 0.0F, 0.0F, 256.0F / f_3_, 256.0F / f_4_, 538718616);
		aClass167_Sub3_3647.method2048(0, 0, i_8_, i_9_);
	}

	boolean method4404() {
		if (method4386()) {
			aClass286_10174 = aClass167_Sub3_3647.method8714("FilterBloom");
			if (aClass286_10174 == null)
				return false;
			try {
				aClass536_Sub8_Sub1_10180 = aClass286_10174.method3866("sceneTex", (byte) 0);
				aClass536_Sub8_Sub1_10181 = aClass286_10174.method3866("bloomTex1", (byte) 0);
				aClass536_Sub8_Sub1_10179 = aClass286_10174.method3866("params", (byte) 0);
				aClass536_Sub8_Sub1_10183 = aClass286_10174.method3866("sampleSize", (byte) 0);
				aClass536_Sub8_Sub1_10184 = aClass286_10174.method3866("pixelOffsetAndBloomScale", (byte) 0);
				aClass536_Sub8_Sub1_10171 = aClass286_10174.method3866("PosAndTexCoords", (byte) 0);
				aClass286_10174.method3855("test", (byte) -48);
				aClass285_10169 = aClass286_10174.method3855("techFullscreenTri", (byte) 6);
				aClass285_10176 = aClass286_10174.method3855("brightpass", (byte) -21);
				aClass285_10177 = aClass286_10174.method3855("blur", (byte) -90);
				aClass285_10178 = aClass286_10174.method3855("composite", (byte) -36);
				aClass285_10182 = aClass286_10174.method3855("techDefault", (byte) -48);
			} catch (Exception_Sub7_Sub1 exception_sub7_sub1) {
				return false;
			} catch (Exception_Sub7_Sub2 exception_sub7_sub2) {
				return false;
			}
			if (!aClass285_10169.method3785())
				return false;
			if (!aClass285_10176.method3785())
				return false;
			if (!aClass285_10177.method3785())
				return false;
			if (!aClass285_10178.method3785())
				return false;
			if (!aClass285_10182.method3785())
				return false;
			aBool10175 = true;
			return true;
		}
		return false;
	}

	boolean method4405() {
		if (method4386()) {
			aClass286_10174 = aClass167_Sub3_3647.method8714("FilterBloom");
			if (aClass286_10174 == null)
				return false;
			try {
				aClass536_Sub8_Sub1_10180 = aClass286_10174.method3866("sceneTex", (byte) 0);
				aClass536_Sub8_Sub1_10181 = aClass286_10174.method3866("bloomTex1", (byte) 0);
				aClass536_Sub8_Sub1_10179 = aClass286_10174.method3866("params", (byte) 0);
				aClass536_Sub8_Sub1_10183 = aClass286_10174.method3866("sampleSize", (byte) 0);
				aClass536_Sub8_Sub1_10184 = aClass286_10174.method3866("pixelOffsetAndBloomScale", (byte) 0);
				aClass536_Sub8_Sub1_10171 = aClass286_10174.method3866("PosAndTexCoords", (byte) 0);
				aClass286_10174.method3855("test", (byte) -19);
				aClass285_10169 = aClass286_10174.method3855("techFullscreenTri", (byte) -76);
				aClass285_10176 = aClass286_10174.method3855("brightpass", (byte) -7);
				aClass285_10177 = aClass286_10174.method3855("blur", (byte) 37);
				aClass285_10178 = aClass286_10174.method3855("composite", (byte) 35);
				aClass285_10182 = aClass286_10174.method3855("techDefault", (byte) -39);
			} catch (Exception_Sub7_Sub1 exception_sub7_sub1) {
				return false;
			} catch (Exception_Sub7_Sub2 exception_sub7_sub2) {
				return false;
			}
			if (!aClass285_10169.method3785())
				return false;
			if (!aClass285_10176.method3785())
				return false;
			if (!aClass285_10177.method3785())
				return false;
			if (!aClass285_10178.method3785())
				return false;
			if (!aClass285_10182.method3785())
				return false;
			aBool10175 = true;
			return true;
		}
		return false;
	}

	boolean method4428() {
		return false;
	}

	boolean method4410() {
		return aBool10175;
	}

	void method4415(int i, Class183_Sub2 class183_sub2, Interface36 interface36, Interface21 interface21, Interface36 interface36_16_, boolean bool) {
		float f = aClass167_Sub3_3647.method8725();
		float f_17_ = (float) class183_sub2.method2725();
		float f_18_ = (float) class183_sub2.method2726();
		Interface36 interface36_19_ = interface36;
		float f_20_ = f * 2.0F / f_17_;
		float f_21_ = -f * 2.0F / f_18_;
		float[] fs = { -1.0F + f_20_, 1.0F + f_21_, 0.0F, 0.0F, -1.0F + f_20_, -3.0F + f_21_, 0.0F, 2.0F, 3.0F + f_20_, 1.0F + f_21_, 2.0F, 0.0F };
		int i_22_ = (int) f_17_;
		int i_23_ = (int) f_18_;
		int i_24_ = (bool ? aClass167_Sub3_3647.method2022(1558045126).method2725() : i_22_);
		int i_25_ = (bool ? aClass167_Sub3_3647.method2022(1129489717).method2726() : i_23_);
		if (i == 0) {
			i_22_ = 256;
			i_23_ = 256;
			aClass286_10174.method3850(aClass285_10176);
			aClass286_10174.method3843();
		} else if (i == 1) {
			i_22_ = 256;
			i_23_ = 256;
			i_24_ = i_22_;
			i_25_ = i_23_;
			aClass286_10174.method3850(aClass285_10177);
			aClass286_10174.method3843();
			aClass286_10174.method3854(aClass536_Sub8_Sub1_10183, aFloat10185 / f_17_, 0.0F, 2074391991);
		} else if (i == 2) {
			i_22_ = 256;
			i_23_ = 256;
			i_24_ = i_22_;
			i_25_ = i_23_;
			aClass286_10174.method3850(aClass285_10177);
			aClass286_10174.method3843();
			aClass286_10174.method3854(aClass536_Sub8_Sub1_10183, 0.0F, aFloat10185 / f_18_, 2134221112);
		} else if (i == 3) {
			aClass286_10174.method3850(aClass285_10178);
			interface36_19_ = interface36_16_;
			aClass286_10174.method3896(aClass536_Sub8_Sub1_10181, 1, interface36, -948976061);
			aClass286_10174.method3843();
		}
		float f_26_ = (float) i_22_ / f_17_;
		float f_27_ = (float) i_23_ / f_18_;
		float f_28_ = (float) i_24_ / f_17_;
		float f_29_ = (float) i_25_ / f_18_;
		fs[8] = (fs[8] + 1.0F) * f_26_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_27_ + 1.0F;
		fs[10] *= f_28_;
		fs[7] *= f_29_;
		aClass286_10174.method3858(aClass536_Sub8_Sub1_10171, fs, -682523951);
		aClass286_10174.method3896(aClass536_Sub8_Sub1_10180, 0, interface36_19_, -948976061);
		aClass286_10174.method3856(aClass536_Sub8_Sub1_10179, aFloat10172, aFloat10170, aFloat10173, 0.0F, 538718616);
		aClass286_10174.method3856(aClass536_Sub8_Sub1_10184, 0.0F, 0.0F, 256.0F / f_17_, 256.0F / f_18_, 538718616);
		aClass167_Sub3_3647.method2048(0, 0, i_22_, i_23_);
	}

	int method4422() {
		return 1;
	}

	public Class338_Sub1(Class167_Sub3 class167_sub3) {
		super(class167_sub3);
	}

	void method4414(int i, int i_30_) {
		/* empty */
	}

	void method4392(int i, Class183_Sub2 class183_sub2, Interface36 interface36, Interface21 interface21, Interface36 interface36_31_, boolean bool) {
		float f = aClass167_Sub3_3647.method8725();
		float f_32_ = (float) class183_sub2.method2725();
		float f_33_ = (float) class183_sub2.method2726();
		Interface36 interface36_34_ = interface36;
		float f_35_ = f * 2.0F / f_32_;
		float f_36_ = -f * 2.0F / f_33_;
		float[] fs = { -1.0F + f_35_, 1.0F + f_36_, 0.0F, 0.0F, -1.0F + f_35_, -3.0F + f_36_, 0.0F, 2.0F, 3.0F + f_35_, 1.0F + f_36_, 2.0F, 0.0F };
		int i_37_ = (int) f_32_;
		int i_38_ = (int) f_33_;
		int i_39_ = (bool ? aClass167_Sub3_3647.method2022(393808717).method2725() : i_37_);
		int i_40_ = (bool ? aClass167_Sub3_3647.method2022(1159102214).method2726() : i_38_);
		if (i == 0) {
			i_37_ = 256;
			i_38_ = 256;
			aClass286_10174.method3850(aClass285_10176);
			aClass286_10174.method3843();
		} else if (i == 1) {
			i_37_ = 256;
			i_38_ = 256;
			i_39_ = i_37_;
			i_40_ = i_38_;
			aClass286_10174.method3850(aClass285_10177);
			aClass286_10174.method3843();
			aClass286_10174.method3854(aClass536_Sub8_Sub1_10183, aFloat10185 / f_32_, 0.0F, 1349516093);
		} else if (i == 2) {
			i_37_ = 256;
			i_38_ = 256;
			i_39_ = i_37_;
			i_40_ = i_38_;
			aClass286_10174.method3850(aClass285_10177);
			aClass286_10174.method3843();
			aClass286_10174.method3854(aClass536_Sub8_Sub1_10183, 0.0F, aFloat10185 / f_33_, 2110889225);
		} else if (i == 3) {
			aClass286_10174.method3850(aClass285_10178);
			interface36_34_ = interface36_31_;
			aClass286_10174.method3896(aClass536_Sub8_Sub1_10181, 1, interface36, -948976061);
			aClass286_10174.method3843();
		}
		float f_41_ = (float) i_37_ / f_32_;
		float f_42_ = (float) i_38_ / f_33_;
		float f_43_ = (float) i_39_ / f_32_;
		float f_44_ = (float) i_40_ / f_33_;
		fs[8] = (fs[8] + 1.0F) * f_41_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_42_ + 1.0F;
		fs[10] *= f_43_;
		fs[7] *= f_44_;
		aClass286_10174.method3858(aClass536_Sub8_Sub1_10171, fs, 1444530234);
		aClass286_10174.method3896(aClass536_Sub8_Sub1_10180, 0, interface36_34_, -948976061);
		aClass286_10174.method3856(aClass536_Sub8_Sub1_10179, aFloat10172, aFloat10170, aFloat10173, 0.0F, 538718616);
		aClass286_10174.method3856(aClass536_Sub8_Sub1_10184, 0.0F, 0.0F, 256.0F / f_32_, 256.0F / f_33_, 538718616);
		aClass167_Sub3_3647.method2048(0, 0, i_37_, i_38_);
	}

	int method4423() {
		return 1;
	}

	int method4417() {
		return 4;
	}

	int method4385() {
		return 0;
	}

	int method4419() {
		return 0;
	}

	int method4403() {
		return 0;
	}

	int method4421() {
		return 1;
	}

	void method4409() {
		/* empty */
	}

	void method4412() {
		/* empty */
	}

	boolean method4427() {
		return false;
	}

	void method4431(int i) {
		aClass286_10174.method3844();
	}

	void method4429(int i) {
		aClass286_10174.method3844();
	}

	void method4416(int i) {
		aClass286_10174.method3844();
	}

	void method4425() {
		/* empty */
	}

	void method4432(int i) {
		aClass286_10174.method3844();
	}
}
