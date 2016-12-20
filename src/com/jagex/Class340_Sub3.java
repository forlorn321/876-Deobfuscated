/* Class340_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class340_Sub3 extends Class340 {
	Class265 aClass265_10252;
	Class265 aClass265_10253;
	public static float aFloat10254;
	public static float aFloat10255;
	public static float aFloat10256;
	Class265 aClass265_10257;
	Class265 aClass265_10258;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10259;
	boolean aBool10260;
	Class261 aClass261_10261;
	public static float aFloat10262 = 0.25F;
	Class265 aClass265_10263;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10264;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10265;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10266;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10267;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10268;
	static final int anInt10269 = 256;

	boolean method6048() {
		return false;
	}

	void method6058() {
		/* empty */
	}

	int method6045() {
		return 1;
	}

	boolean method6055() {
		if (method6035()) {
			aClass261_10261 = aClass180_Sub2_3673.method14894("FilterBloom");
			if (aClass261_10261 == null)
				return false;
			try {
				aClass527_Sub18_Sub1_10268 = aClass261_10261.method4881("sceneTex", -1803846915);
				aClass527_Sub18_Sub1_10264 = aClass261_10261.method4881("bloomTex1", -1803846915);
				aClass527_Sub18_Sub1_10265 = aClass261_10261.method4881("params", -1803846915);
				aClass527_Sub18_Sub1_10266 = aClass261_10261.method4881("sampleSize", -1803846915);
				aClass527_Sub18_Sub1_10267 = aClass261_10261.method4881("pixelOffsetAndBloomScale", -1803846915);
				aClass527_Sub18_Sub1_10259 = aClass261_10261.method4881("PosAndTexCoords", -1803846915);
				aClass261_10261.method4805("test", -1733553076);
				aClass265_10263 = aClass261_10261.method4805("techFullscreenTri", -1733553076);
				aClass265_10257 = aClass261_10261.method4805("brightpass", -1733553076);
				aClass265_10253 = aClass261_10261.method4805("blur", -1733553076);
				aClass265_10252 = aClass261_10261.method4805("composite", -1733553076);
				aClass265_10258 = aClass261_10261.method4805("techDefault", -1733553076);
			} catch (Exception_Sub5_Sub2 exception_sub5_sub2) {
				return false;
			} catch (Exception_Sub5_Sub1 exception_sub5_sub1) {
				return false;
			}
			if (!aClass265_10263.method4988())
				return false;
			if (!aClass265_10257.method4988())
				return false;
			if (!aClass265_10253.method4988())
				return false;
			if (!aClass265_10252.method4988())
				return false;
			if (!aClass265_10258.method4988())
				return false;
			aBool10260 = true;
			return true;
		}
		return false;
	}

	void method6040(int i, int i_0_) {
		/* empty */
	}

	void method6039() {
		/* empty */
	}

	int method6043() {
		return 4;
	}

	void method6070(int i, Class171_Sub2 class171_sub2, Interface38 interface38, Interface23 interface23, Interface38 interface38_1_, boolean bool) {
		float f = aClass180_Sub2_3673.method14911();
		float f_2_ = (float) class171_sub2.method2728();
		float f_3_ = (float) class171_sub2.method2729();
		Interface38 interface38_4_ = interface38;
		float f_5_ = f * 2.0F / f_2_;
		float f_6_ = -f * 2.0F / f_3_;
		float[] fs = { -1.0F + f_5_, 1.0F + f_6_, 0.0F, 0.0F, -1.0F + f_5_, -3.0F + f_6_, 0.0F, 2.0F, 3.0F + f_5_, 1.0F + f_6_, 2.0F, 0.0F };
		int i_7_ = (int) f_2_;
		int i_8_ = (int) f_3_;
		int i_9_ = (bool ? aClass180_Sub2_3673.method3100(2114895601).method2728() : i_7_);
		int i_10_ = (bool ? aClass180_Sub2_3673.method3100(190094278).method2729() : i_8_);
		if (i == 0) {
			i_7_ = 256;
			i_8_ = 256;
			aClass261_10261.method4810(aClass265_10257);
			aClass261_10261.method4875();
		} else if (i == 1) {
			i_7_ = 256;
			i_8_ = 256;
			i_9_ = i_7_;
			i_10_ = i_8_;
			aClass261_10261.method4810(aClass265_10253);
			aClass261_10261.method4875();
			aClass261_10261.method4815(aClass527_Sub18_Sub1_10266, aFloat10256 / f_2_, 0.0F, 2058476790);
		} else if (i == 2) {
			i_7_ = 256;
			i_8_ = 256;
			i_9_ = i_7_;
			i_10_ = i_8_;
			aClass261_10261.method4810(aClass265_10253);
			aClass261_10261.method4875();
			aClass261_10261.method4815(aClass527_Sub18_Sub1_10266, 0.0F, aFloat10256 / f_3_, 2058476790);
		} else if (i == 3) {
			aClass261_10261.method4810(aClass265_10252);
			interface38_4_ = interface38_1_;
			aClass261_10261.method4807(aClass527_Sub18_Sub1_10264, 1, interface38, -1424445071);
			aClass261_10261.method4875();
		}
		float f_11_ = (float) i_7_ / f_2_;
		float f_12_ = (float) i_8_ / f_3_;
		float f_13_ = (float) i_9_ / f_2_;
		float f_14_ = (float) i_10_ / f_3_;
		fs[8] = (fs[8] + 1.0F) * f_11_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_12_ + 1.0F;
		fs[10] *= f_13_;
		fs[7] *= f_14_;
		aClass261_10261.method4819(aClass527_Sub18_Sub1_10259, fs, (byte) 25);
		aClass261_10261.method4807(aClass527_Sub18_Sub1_10268, 0, interface38_4_, -1557015065);
		aClass261_10261.method4817(aClass527_Sub18_Sub1_10265, aFloat10255, aFloat10262, aFloat10254, 0.0F, 534028399);
		aClass261_10261.method4817(aClass527_Sub18_Sub1_10267, 0.0F, 0.0F, 256.0F / f_2_, 256.0F / f_3_, 2104261467);
		aClass180_Sub2_3673.method3128(0, 0, i_7_, i_8_);
	}

	boolean method6049() {
		return (aClass180_Sub2_3673.aBool9581 && aClass180_Sub2_3673.method14889() && aClass180_Sub2_3673.method15053(true));
	}

	int method6064() {
		return 1;
	}

	boolean method6036() {
		return aBool10260;
	}

	boolean method6035() {
		return (aClass180_Sub2_3673.aBool9581 && aClass180_Sub2_3673.method14889() && aClass180_Sub2_3673.method15053(true));
	}

	boolean method6067() {
		return false;
	}

	void method6060(int i) {
		aClass261_10261.method4854();
	}

	boolean method6050() {
		return aBool10260;
	}

	boolean method6072() {
		return aBool10260;
	}

	boolean method6052() {
		if (method6035()) {
			aClass261_10261 = aClass180_Sub2_3673.method14894("FilterBloom");
			if (aClass261_10261 == null)
				return false;
			try {
				aClass527_Sub18_Sub1_10268 = aClass261_10261.method4881("sceneTex", -1803846915);
				aClass527_Sub18_Sub1_10264 = aClass261_10261.method4881("bloomTex1", -1803846915);
				aClass527_Sub18_Sub1_10265 = aClass261_10261.method4881("params", -1803846915);
				aClass527_Sub18_Sub1_10266 = aClass261_10261.method4881("sampleSize", -1803846915);
				aClass527_Sub18_Sub1_10267 = aClass261_10261.method4881("pixelOffsetAndBloomScale", -1803846915);
				aClass527_Sub18_Sub1_10259 = aClass261_10261.method4881("PosAndTexCoords", -1803846915);
				aClass261_10261.method4805("test", -1733553076);
				aClass265_10263 = aClass261_10261.method4805("techFullscreenTri", -1733553076);
				aClass265_10257 = aClass261_10261.method4805("brightpass", -1733553076);
				aClass265_10253 = aClass261_10261.method4805("blur", -1733553076);
				aClass265_10252 = aClass261_10261.method4805("composite", -1733553076);
				aClass265_10258 = aClass261_10261.method4805("techDefault", -1733553076);
			} catch (Exception_Sub5_Sub2 exception_sub5_sub2) {
				return false;
			} catch (Exception_Sub5_Sub1 exception_sub5_sub1) {
				return false;
			}
			if (!aClass265_10263.method4988())
				return false;
			if (!aClass265_10257.method4988())
				return false;
			if (!aClass265_10253.method4988())
				return false;
			if (!aClass265_10252.method4988())
				return false;
			if (!aClass265_10258.method4988())
				return false;
			aBool10260 = true;
			return true;
		}
		return false;
	}

	boolean method6053() {
		if (method6035()) {
			aClass261_10261 = aClass180_Sub2_3673.method14894("FilterBloom");
			if (aClass261_10261 == null)
				return false;
			try {
				aClass527_Sub18_Sub1_10268 = aClass261_10261.method4881("sceneTex", -1803846915);
				aClass527_Sub18_Sub1_10264 = aClass261_10261.method4881("bloomTex1", -1803846915);
				aClass527_Sub18_Sub1_10265 = aClass261_10261.method4881("params", -1803846915);
				aClass527_Sub18_Sub1_10266 = aClass261_10261.method4881("sampleSize", -1803846915);
				aClass527_Sub18_Sub1_10267 = aClass261_10261.method4881("pixelOffsetAndBloomScale", -1803846915);
				aClass527_Sub18_Sub1_10259 = aClass261_10261.method4881("PosAndTexCoords", -1803846915);
				aClass261_10261.method4805("test", -1733553076);
				aClass265_10263 = aClass261_10261.method4805("techFullscreenTri", -1733553076);
				aClass265_10257 = aClass261_10261.method4805("brightpass", -1733553076);
				aClass265_10253 = aClass261_10261.method4805("blur", -1733553076);
				aClass265_10252 = aClass261_10261.method4805("composite", -1733553076);
				aClass265_10258 = aClass261_10261.method4805("techDefault", -1733553076);
			} catch (Exception_Sub5_Sub2 exception_sub5_sub2) {
				return false;
			} catch (Exception_Sub5_Sub1 exception_sub5_sub1) {
				return false;
			}
			if (!aClass265_10263.method4988())
				return false;
			if (!aClass265_10257.method4988())
				return false;
			if (!aClass265_10253.method4988())
				return false;
			if (!aClass265_10252.method4988())
				return false;
			if (!aClass265_10258.method4988())
				return false;
			aBool10260 = true;
			return true;
		}
		return false;
	}

	int method6046() {
		return 0;
	}

	void method6041(int i) {
		aClass261_10261.method4854();
	}

	int method6034() {
		return 0;
	}

	void method6059(int i, Class171_Sub2 class171_sub2, Interface38 interface38, Interface23 interface23, Interface38 interface38_15_, boolean bool) {
		float f = aClass180_Sub2_3673.method14911();
		float f_16_ = (float) class171_sub2.method2728();
		float f_17_ = (float) class171_sub2.method2729();
		Interface38 interface38_18_ = interface38;
		float f_19_ = f * 2.0F / f_16_;
		float f_20_ = -f * 2.0F / f_17_;
		float[] fs = { -1.0F + f_19_, 1.0F + f_20_, 0.0F, 0.0F, -1.0F + f_19_, -3.0F + f_20_, 0.0F, 2.0F, 3.0F + f_19_, 1.0F + f_20_, 2.0F, 0.0F };
		int i_21_ = (int) f_16_;
		int i_22_ = (int) f_17_;
		int i_23_ = (bool ? aClass180_Sub2_3673.method3100(1216445917).method2728() : i_21_);
		int i_24_ = (bool ? aClass180_Sub2_3673.method3100(-378991243).method2729() : i_22_);
		if (i == 0) {
			i_21_ = 256;
			i_22_ = 256;
			aClass261_10261.method4810(aClass265_10257);
			aClass261_10261.method4875();
		} else if (i == 1) {
			i_21_ = 256;
			i_22_ = 256;
			i_23_ = i_21_;
			i_24_ = i_22_;
			aClass261_10261.method4810(aClass265_10253);
			aClass261_10261.method4875();
			aClass261_10261.method4815(aClass527_Sub18_Sub1_10266, aFloat10256 / f_16_, 0.0F, 2058476790);
		} else if (i == 2) {
			i_21_ = 256;
			i_22_ = 256;
			i_23_ = i_21_;
			i_24_ = i_22_;
			aClass261_10261.method4810(aClass265_10253);
			aClass261_10261.method4875();
			aClass261_10261.method4815(aClass527_Sub18_Sub1_10266, 0.0F, aFloat10256 / f_17_, 2058476790);
		} else if (i == 3) {
			aClass261_10261.method4810(aClass265_10252);
			interface38_18_ = interface38_15_;
			aClass261_10261.method4807(aClass527_Sub18_Sub1_10264, 1, interface38, -2111456016);
			aClass261_10261.method4875();
		}
		float f_25_ = (float) i_21_ / f_16_;
		float f_26_ = (float) i_22_ / f_17_;
		float f_27_ = (float) i_23_ / f_16_;
		float f_28_ = (float) i_24_ / f_17_;
		fs[8] = (fs[8] + 1.0F) * f_25_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_26_ + 1.0F;
		fs[10] *= f_27_;
		fs[7] *= f_28_;
		aClass261_10261.method4819(aClass527_Sub18_Sub1_10259, fs, (byte) 73);
		aClass261_10261.method4807(aClass527_Sub18_Sub1_10268, 0, interface38_18_, -1650024023);
		aClass261_10261.method4817(aClass527_Sub18_Sub1_10265, aFloat10255, aFloat10262, aFloat10254, 0.0F, 1428523324);
		aClass261_10261.method4817(aClass527_Sub18_Sub1_10267, 0.0F, 0.0F, 256.0F / f_16_, 256.0F / f_17_, -67198750);
		aClass180_Sub2_3673.method3128(0, 0, i_21_, i_22_);
	}

	boolean method6054() {
		if (method6035()) {
			aClass261_10261 = aClass180_Sub2_3673.method14894("FilterBloom");
			if (aClass261_10261 == null)
				return false;
			try {
				aClass527_Sub18_Sub1_10268 = aClass261_10261.method4881("sceneTex", -1803846915);
				aClass527_Sub18_Sub1_10264 = aClass261_10261.method4881("bloomTex1", -1803846915);
				aClass527_Sub18_Sub1_10265 = aClass261_10261.method4881("params", -1803846915);
				aClass527_Sub18_Sub1_10266 = aClass261_10261.method4881("sampleSize", -1803846915);
				aClass527_Sub18_Sub1_10267 = aClass261_10261.method4881("pixelOffsetAndBloomScale", -1803846915);
				aClass527_Sub18_Sub1_10259 = aClass261_10261.method4881("PosAndTexCoords", -1803846915);
				aClass261_10261.method4805("test", -1733553076);
				aClass265_10263 = aClass261_10261.method4805("techFullscreenTri", -1733553076);
				aClass265_10257 = aClass261_10261.method4805("brightpass", -1733553076);
				aClass265_10253 = aClass261_10261.method4805("blur", -1733553076);
				aClass265_10252 = aClass261_10261.method4805("composite", -1733553076);
				aClass265_10258 = aClass261_10261.method4805("techDefault", -1733553076);
			} catch (Exception_Sub5_Sub2 exception_sub5_sub2) {
				return false;
			} catch (Exception_Sub5_Sub1 exception_sub5_sub1) {
				return false;
			}
			if (!aClass265_10263.method4988())
				return false;
			if (!aClass265_10257.method4988())
				return false;
			if (!aClass265_10253.method4988())
				return false;
			if (!aClass265_10252.method4988())
				return false;
			if (!aClass265_10258.method4988())
				return false;
			aBool10260 = true;
			return true;
		}
		return false;
	}

	void method6061(int i) {
		aClass261_10261.method4854();
	}

	int method6071() {
		return 0;
	}

	public Class340_Sub3(Class180_Sub2 class180_sub2) {
		super(class180_sub2);
	}

	static {
		aFloat10254 = 1.0F;
		aFloat10255 = 1.0F;
		aFloat10256 = 1.0F;
	}

	void method6057() {
		/* empty */
	}

	boolean method6038() {
		return false;
	}

	boolean method6073() {
		return false;
	}

	boolean method6074() {
		return false;
	}

	int method6044() {
		return 4;
	}

	void method6051(int i, int i_29_) {
		/* empty */
	}

	void method6077(int i, int i_30_) {
		/* empty */
	}

	void method6078(int i, int i_31_) {
		/* empty */
	}
}
