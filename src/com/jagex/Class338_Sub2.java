/* Class338_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class338_Sub2 extends Class338 {
	Class285 aClass285_10241;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10242;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10243;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10244;
	Class286 aClass286_10245;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10246;
	Class536_Sub8_Sub1 aClass536_Sub8_Sub1_10247;
	public static float aFloat10248 = 1.0F;
	public static float aFloat10249 = 0.0F;
	public static float aFloat10250 = 1.0F;
	public static float aFloat10251 = 0.0F;
	public static float aFloat10252 = 1.0F;
	boolean aBool10253;

	void method4407(int i) {
		aClass286_10245.method3844();
	}

	boolean method4386() {
		return (aClass167_Sub3_3647.aBool9692 && aClass167_Sub3_3647.method8710());
	}

	boolean method4387() {
		return aBool10253;
	}

	boolean method4388() {
		if (method4386()) {
			aClass286_10245 = aClass167_Sub3_3647.method8714("FilterLevels");
			if (aClass286_10245 == null)
				return false;
			try {
				aClass536_Sub8_Sub1_10243 = aClass286_10245.method3866("sceneTex", (byte) 0);
				aClass536_Sub8_Sub1_10242 = aClass286_10245.method3866("paramsGamma", (byte) 0);
				aClass536_Sub8_Sub1_10244 = aClass286_10245.method3866("paramsRanges", (byte) 0);
				aClass536_Sub8_Sub1_10246 = aClass286_10245.method3866("pixelOffset", (byte) 0);
				aClass536_Sub8_Sub1_10247 = aClass286_10245.method3866("PosAndTexCoords", (byte) 0);
				aClass285_10241 = aClass286_10245.method3855("techAdjust", (byte) -42);
			} catch (Exception_Sub7_Sub1 exception_sub7_sub1) {
				return false;
			} catch (Exception_Sub7_Sub2 exception_sub7_sub2) {
				return false;
			}
			if (!aClass285_10241.method3785())
				return false;
			aBool10253 = true;
			return true;
		}
		return false;
	}

	void method4415(int i, Class183_Sub2 class183_sub2, Interface36 interface36, Interface21 interface21, Interface36 interface36_0_, boolean bool) {
		float f = aClass167_Sub3_3647.method8725();
		float f_1_ = (float) class183_sub2.method2725();
		float f_2_ = (float) class183_sub2.method2726();
		float f_3_ = f * 2.0F / f_1_;
		float f_4_ = -f * 2.0F / f_2_;
		float[] fs = { -1.0F + f_3_, 1.0F + f_4_, 0.0F, 0.0F, -1.0F + f_3_, -3.0F + f_4_, 0.0F, 2.0F, 3.0F + f_3_, 1.0F + f_4_, 2.0F, 0.0F };
		int i_5_ = (int) f_1_;
		int i_6_ = (int) f_2_;
		int i_7_ = (bool ? aClass167_Sub3_3647.method2022(1656377100).method2725() : i_5_);
		int i_8_ = (bool ? aClass167_Sub3_3647.method2022(1410836664).method2726() : i_6_);
		aClass286_10245.method3850(aClass285_10241);
		aClass286_10245.method3843();
		float f_9_ = (float) i_5_ / f_1_;
		float f_10_ = (float) i_6_ / f_2_;
		float f_11_ = (float) i_7_ / f_1_;
		float f_12_ = (float) i_8_ / f_2_;
		fs[8] = (fs[8] + 1.0F) * f_9_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_10_ + 1.0F;
		fs[10] *= f_11_;
		fs[7] *= f_12_;
		aClass286_10245.method3858(aClass536_Sub8_Sub1_10247, fs, -2009062471);
		aClass286_10245.method3896(aClass536_Sub8_Sub1_10243, 0, interface36, -948976061);
		aClass286_10245.method3902(aClass536_Sub8_Sub1_10242, aFloat10248, -976801504);
		aClass286_10245.method3856(aClass536_Sub8_Sub1_10244, aFloat10249, aFloat10250, aFloat10251, aFloat10252, 538718616);
		aClass286_10245.method3856(aClass536_Sub8_Sub1_10246, 0.0F, 0.0F, 0.0F, 0.0F, 538718616);
		aClass167_Sub3_3647.method2048(0, 0, i_5_, i_6_);
	}

	void method4429(int i) {
		aClass286_10245.method3844();
	}

	boolean method4428() {
		return (aFloat10248 == 1.0F && aFloat10249 == 0.0F && aFloat10250 == 1.0F && aFloat10251 == 0.0F && aFloat10252 == 1.0F);
	}

	void method4392(int i, Class183_Sub2 class183_sub2, Interface36 interface36, Interface21 interface21, Interface36 interface36_13_, boolean bool) {
		float f = aClass167_Sub3_3647.method8725();
		float f_14_ = (float) class183_sub2.method2725();
		float f_15_ = (float) class183_sub2.method2726();
		float f_16_ = f * 2.0F / f_14_;
		float f_17_ = -f * 2.0F / f_15_;
		float[] fs = { -1.0F + f_16_, 1.0F + f_17_, 0.0F, 0.0F, -1.0F + f_16_, -3.0F + f_17_, 0.0F, 2.0F, 3.0F + f_16_, 1.0F + f_17_, 2.0F, 0.0F };
		int i_18_ = (int) f_14_;
		int i_19_ = (int) f_15_;
		int i_20_ = (bool ? aClass167_Sub3_3647.method2022(1261128733).method2725() : i_18_);
		int i_21_ = (bool ? aClass167_Sub3_3647.method2022(801412898).method2726() : i_19_);
		aClass286_10245.method3850(aClass285_10241);
		aClass286_10245.method3843();
		float f_22_ = (float) i_18_ / f_14_;
		float f_23_ = (float) i_19_ / f_15_;
		float f_24_ = (float) i_20_ / f_14_;
		float f_25_ = (float) i_21_ / f_15_;
		fs[8] = (fs[8] + 1.0F) * f_22_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_23_ + 1.0F;
		fs[10] *= f_24_;
		fs[7] *= f_25_;
		aClass286_10245.method3858(aClass536_Sub8_Sub1_10247, fs, -835685527);
		aClass286_10245.method3896(aClass536_Sub8_Sub1_10243, 0, interface36, -948976061);
		aClass286_10245.method3902(aClass536_Sub8_Sub1_10242, aFloat10248, 327324058);
		aClass286_10245.method3856(aClass536_Sub8_Sub1_10244, aFloat10249, aFloat10250, aFloat10251, aFloat10252, 538718616);
		aClass286_10245.method3856(aClass536_Sub8_Sub1_10246, 0.0F, 0.0F, 0.0F, 0.0F, 538718616);
		aClass167_Sub3_3647.method2048(0, 0, i_18_, i_19_);
	}

	int method4421() {
		return 0;
	}

	int method4395() {
		return 0;
	}

	int method4418() {
		return 1;
	}

	boolean method4398() {
		return (aFloat10248 == 1.0F && aFloat10249 == 0.0F && aFloat10250 == 1.0F && aFloat10251 == 0.0F && aFloat10252 == 1.0F);
	}

	void method4391(int i, int i_26_) {
		/* empty */
	}

	boolean method4400() {
		return (aClass167_Sub3_3647.aBool9692 && aClass167_Sub3_3647.method8710());
	}

	boolean method4401() {
		return aBool10253;
	}

	void method4394(int i, Class183_Sub2 class183_sub2, Interface36 interface36, Interface21 interface21, Interface36 interface36_27_, boolean bool) {
		float f = aClass167_Sub3_3647.method8725();
		float f_28_ = (float) class183_sub2.method2725();
		float f_29_ = (float) class183_sub2.method2726();
		float f_30_ = f * 2.0F / f_28_;
		float f_31_ = -f * 2.0F / f_29_;
		float[] fs = { -1.0F + f_30_, 1.0F + f_31_, 0.0F, 0.0F, -1.0F + f_30_, -3.0F + f_31_, 0.0F, 2.0F, 3.0F + f_30_, 1.0F + f_31_, 2.0F, 0.0F };
		int i_32_ = (int) f_28_;
		int i_33_ = (int) f_29_;
		int i_34_ = (bool ? aClass167_Sub3_3647.method2022(938903765).method2725() : i_32_);
		int i_35_ = (bool ? aClass167_Sub3_3647.method2022(2006549314).method2726() : i_33_);
		aClass286_10245.method3850(aClass285_10241);
		aClass286_10245.method3843();
		float f_36_ = (float) i_32_ / f_28_;
		float f_37_ = (float) i_33_ / f_29_;
		float f_38_ = (float) i_34_ / f_28_;
		float f_39_ = (float) i_35_ / f_29_;
		fs[8] = (fs[8] + 1.0F) * f_36_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_37_ + 1.0F;
		fs[10] *= f_38_;
		fs[7] *= f_39_;
		aClass286_10245.method3858(aClass536_Sub8_Sub1_10247, fs, 511751865);
		aClass286_10245.method3896(aClass536_Sub8_Sub1_10243, 0, interface36, -948976061);
		aClass286_10245.method3902(aClass536_Sub8_Sub1_10242, aFloat10248, -1814090004);
		aClass286_10245.method3856(aClass536_Sub8_Sub1_10244, aFloat10249, aFloat10250, aFloat10251, aFloat10252, 538718616);
		aClass286_10245.method3856(aClass536_Sub8_Sub1_10246, 0.0F, 0.0F, 0.0F, 0.0F, 538718616);
		aClass167_Sub3_3647.method2048(0, 0, i_32_, i_33_);
	}

	boolean method4410() {
		return aBool10253;
	}

	boolean method4404() {
		if (method4386()) {
			aClass286_10245 = aClass167_Sub3_3647.method8714("FilterLevels");
			if (aClass286_10245 == null)
				return false;
			try {
				aClass536_Sub8_Sub1_10243 = aClass286_10245.method3866("sceneTex", (byte) 0);
				aClass536_Sub8_Sub1_10242 = aClass286_10245.method3866("paramsGamma", (byte) 0);
				aClass536_Sub8_Sub1_10244 = aClass286_10245.method3866("paramsRanges", (byte) 0);
				aClass536_Sub8_Sub1_10246 = aClass286_10245.method3866("pixelOffset", (byte) 0);
				aClass536_Sub8_Sub1_10247 = aClass286_10245.method3866("PosAndTexCoords", (byte) 0);
				aClass285_10241 = aClass286_10245.method3855("techAdjust", (byte) 24);
			} catch (Exception_Sub7_Sub1 exception_sub7_sub1) {
				return false;
			} catch (Exception_Sub7_Sub2 exception_sub7_sub2) {
				return false;
			}
			if (!aClass285_10241.method3785())
				return false;
			aBool10253 = true;
			return true;
		}
		return false;
	}

	void method4414(int i, int i_40_) {
		/* empty */
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

	boolean method4405() {
		if (method4386()) {
			aClass286_10245 = aClass167_Sub3_3647.method8714("FilterLevels");
			if (aClass286_10245 == null)
				return false;
			try {
				aClass536_Sub8_Sub1_10243 = aClass286_10245.method3866("sceneTex", (byte) 0);
				aClass536_Sub8_Sub1_10242 = aClass286_10245.method3866("paramsGamma", (byte) 0);
				aClass536_Sub8_Sub1_10244 = aClass286_10245.method3866("paramsRanges", (byte) 0);
				aClass536_Sub8_Sub1_10246 = aClass286_10245.method3866("pixelOffset", (byte) 0);
				aClass536_Sub8_Sub1_10247 = aClass286_10245.method3866("PosAndTexCoords", (byte) 0);
				aClass285_10241 = aClass286_10245.method3855("techAdjust", (byte) 38);
			} catch (Exception_Sub7_Sub1 exception_sub7_sub1) {
				return false;
			} catch (Exception_Sub7_Sub2 exception_sub7_sub2) {
				return false;
			}
			if (!aClass285_10241.method3785())
				return false;
			aBool10253 = true;
			return true;
		}
		return false;
	}

	boolean method4399() {
		return (aClass167_Sub3_3647.aBool9692 && aClass167_Sub3_3647.method8710());
	}

	boolean method4402() {
		return aBool10253;
	}

	void method4426(int i, int i_41_) {
		/* empty */
	}

	int method4419() {
		return 1;
	}

	int method4417() {
		return 1;
	}

	int method4385() {
		return 1;
	}

	int method4430() {
		return 1;
	}

	void method4412() {
		/* empty */
	}

	public Class338_Sub2(Class167_Sub3 class167_sub3) {
		super(class167_sub3);
	}

	int method4422() {
		return 0;
	}

	int method4423() {
		return 0;
	}

	boolean method4427() {
		return (aFloat10248 == 1.0F && aFloat10249 == 0.0F && aFloat10250 == 1.0F && aFloat10251 == 0.0F && aFloat10252 == 1.0F);
	}

	void method4390() {
		/* empty */
	}

	int method4403() {
		return 1;
	}

	void method4416(int i) {
		aClass286_10245.method3844();
	}

	void method4431(int i) {
		aClass286_10245.method3844();
	}

	void method4432(int i) {
		aClass286_10245.method3844();
	}
}
