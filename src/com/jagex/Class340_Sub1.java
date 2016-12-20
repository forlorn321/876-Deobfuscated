/* Class340_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class340_Sub1 extends Class340 {
	Class265 aClass265_10131;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10132;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10133;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10134;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10135;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10136;
	boolean aBool10137;
	public static float aFloat10138;
	public static float aFloat10139;
	Class261 aClass261_10140;
	public static float aFloat10141;
	public static float aFloat10142 = 1.0F;
	public static float aFloat10143;

	boolean method6052() {
		if (method6035()) {
			aClass261_10140 = aClass180_Sub2_3673.method14894("FilterLevels");
			if (aClass261_10140 == null)
				return false;
			try {
				aClass527_Sub18_Sub1_10133 = aClass261_10140.method4881("sceneTex", -1803846915);
				aClass527_Sub18_Sub1_10134 = aClass261_10140.method4881("paramsGamma", -1803846915);
				aClass527_Sub18_Sub1_10135 = aClass261_10140.method4881("paramsRanges", -1803846915);
				aClass527_Sub18_Sub1_10136 = aClass261_10140.method4881("pixelOffset", -1803846915);
				aClass527_Sub18_Sub1_10132 = aClass261_10140.method4881("PosAndTexCoords", -1803846915);
				aClass265_10131 = aClass261_10140.method4805("techAdjust", -1733553076);
			} catch (Exception_Sub5_Sub2 exception_sub5_sub2) {
				return false;
			} catch (Exception_Sub5_Sub1 exception_sub5_sub1) {
				return false;
			}
			if (!aClass265_10131.method4988())
				return false;
			aBool10137 = true;
			return true;
		}
		return false;
	}

	boolean method6035() {
		return (aClass180_Sub2_3673.aBool9581 && aClass180_Sub2_3673.method14889());
	}

	boolean method6036() {
		return aBool10137;
	}

	boolean method6055() {
		if (method6035()) {
			aClass261_10140 = aClass180_Sub2_3673.method14894("FilterLevels");
			if (aClass261_10140 == null)
				return false;
			try {
				aClass527_Sub18_Sub1_10133 = aClass261_10140.method4881("sceneTex", -1803846915);
				aClass527_Sub18_Sub1_10134 = aClass261_10140.method4881("paramsGamma", -1803846915);
				aClass527_Sub18_Sub1_10135 = aClass261_10140.method4881("paramsRanges", -1803846915);
				aClass527_Sub18_Sub1_10136 = aClass261_10140.method4881("pixelOffset", -1803846915);
				aClass527_Sub18_Sub1_10132 = aClass261_10140.method4881("PosAndTexCoords", -1803846915);
				aClass265_10131 = aClass261_10140.method4805("techAdjust", -1733553076);
			} catch (Exception_Sub5_Sub2 exception_sub5_sub2) {
				return false;
			} catch (Exception_Sub5_Sub1 exception_sub5_sub1) {
				return false;
			}
			if (!aClass265_10131.method4988())
				return false;
			aBool10137 = true;
			return true;
		}
		return false;
	}

	void method6040(int i, int i_0_) {
		/* empty */
	}

	void method6041(int i) {
		aClass261_10140.method4854();
	}

	void method6058() {
		/* empty */
	}

	void method6070(int i, Class171_Sub2 class171_sub2, Interface38 interface38, Interface23 interface23, Interface38 interface38_1_, boolean bool) {
		float f = aClass180_Sub2_3673.method14911();
		float f_2_ = (float) class171_sub2.method2728();
		float f_3_ = (float) class171_sub2.method2729();
		float f_4_ = f * 2.0F / f_2_;
		float f_5_ = -f * 2.0F / f_3_;
		float[] fs = { -1.0F + f_4_, 1.0F + f_5_, 0.0F, 0.0F, -1.0F + f_4_, -3.0F + f_5_, 0.0F, 2.0F, 3.0F + f_4_, 1.0F + f_5_, 2.0F, 0.0F };
		int i_6_ = (int) f_2_;
		int i_7_ = (int) f_3_;
		int i_8_ = (bool ? aClass180_Sub2_3673.method3100(1796578387).method2728() : i_6_);
		int i_9_ = (bool ? aClass180_Sub2_3673.method3100(740475893).method2729() : i_7_);
		aClass261_10140.method4810(aClass265_10131);
		aClass261_10140.method4875();
		float f_10_ = (float) i_6_ / f_2_;
		float f_11_ = (float) i_7_ / f_3_;
		float f_12_ = (float) i_8_ / f_2_;
		float f_13_ = (float) i_9_ / f_3_;
		fs[8] = (fs[8] + 1.0F) * f_10_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_11_ + 1.0F;
		fs[10] *= f_12_;
		fs[7] *= f_13_;
		aClass261_10140.method4819(aClass527_Sub18_Sub1_10132, fs, (byte) 82);
		aClass261_10140.method4807(aClass527_Sub18_Sub1_10133, 0, interface38, -1867444458);
		aClass261_10140.method4814(aClass527_Sub18_Sub1_10134, aFloat10142, -716842688);
		aClass261_10140.method4817(aClass527_Sub18_Sub1_10135, aFloat10139, aFloat10138, aFloat10141, aFloat10143, 1959209019);
		aClass261_10140.method4817(aClass527_Sub18_Sub1_10136, 0.0F, 0.0F, 0.0F, 0.0F, 1127586315);
		aClass180_Sub2_3673.method3128(0, 0, i_6_, i_7_);
	}

	boolean method6067() {
		return (aFloat10142 == 1.0F && aFloat10139 == 0.0F && aFloat10138 == 1.0F && aFloat10141 == 0.0F && aFloat10143 == 1.0F);
	}

	void method6078(int i, int i_14_) {
		/* empty */
	}

	int method6046() {
		return 1;
	}

	boolean method6048() {
		return (aFloat10142 == 1.0F && aFloat10139 == 0.0F && aFloat10138 == 1.0F && aFloat10141 == 0.0F && aFloat10143 == 1.0F);
	}

	static {
		aFloat10139 = 0.0F;
		aFloat10138 = 1.0F;
		aFloat10141 = 0.0F;
		aFloat10143 = 1.0F;
	}

	boolean method6049() {
		return (aClass180_Sub2_3673.aBool9581 && aClass180_Sub2_3673.method14889());
	}

	boolean method6050() {
		return aBool10137;
	}

	void method6039() {
		/* empty */
	}

	boolean method6072() {
		return aBool10137;
	}

	void method6057() {
		/* empty */
	}

	boolean method6054() {
		if (method6035()) {
			aClass261_10140 = aClass180_Sub2_3673.method14894("FilterLevels");
			if (aClass261_10140 == null)
				return false;
			try {
				aClass527_Sub18_Sub1_10133 = aClass261_10140.method4881("sceneTex", -1803846915);
				aClass527_Sub18_Sub1_10134 = aClass261_10140.method4881("paramsGamma", -1803846915);
				aClass527_Sub18_Sub1_10135 = aClass261_10140.method4881("paramsRanges", -1803846915);
				aClass527_Sub18_Sub1_10136 = aClass261_10140.method4881("pixelOffset", -1803846915);
				aClass527_Sub18_Sub1_10132 = aClass261_10140.method4881("PosAndTexCoords", -1803846915);
				aClass265_10131 = aClass261_10140.method4805("techAdjust", -1733553076);
			} catch (Exception_Sub5_Sub2 exception_sub5_sub2) {
				return false;
			} catch (Exception_Sub5_Sub1 exception_sub5_sub1) {
				return false;
			}
			if (!aClass265_10131.method4988())
				return false;
			aBool10137 = true;
			return true;
		}
		return false;
	}

	boolean method6053() {
		if (method6035()) {
			aClass261_10140 = aClass180_Sub2_3673.method14894("FilterLevels");
			if (aClass261_10140 == null)
				return false;
			try {
				aClass527_Sub18_Sub1_10133 = aClass261_10140.method4881("sceneTex", -1803846915);
				aClass527_Sub18_Sub1_10134 = aClass261_10140.method4881("paramsGamma", -1803846915);
				aClass527_Sub18_Sub1_10135 = aClass261_10140.method4881("paramsRanges", -1803846915);
				aClass527_Sub18_Sub1_10136 = aClass261_10140.method4881("pixelOffset", -1803846915);
				aClass527_Sub18_Sub1_10132 = aClass261_10140.method4881("PosAndTexCoords", -1803846915);
				aClass265_10131 = aClass261_10140.method4805("techAdjust", -1733553076);
			} catch (Exception_Sub5_Sub2 exception_sub5_sub2) {
				return false;
			} catch (Exception_Sub5_Sub1 exception_sub5_sub1) {
				return false;
			}
			if (!aClass265_10131.method4988())
				return false;
			aBool10137 = true;
			return true;
		}
		return false;
	}

	boolean method6038() {
		return (aFloat10142 == 1.0F && aFloat10139 == 0.0F && aFloat10138 == 1.0F && aFloat10141 == 0.0F && aFloat10143 == 1.0F);
	}

	int method6045() {
		return 0;
	}

	void method6060(int i) {
		aClass261_10140.method4854();
	}

	void method6061(int i) {
		aClass261_10140.method4854();
	}

	int method6071() {
		return 1;
	}

	int method6034() {
		return 1;
	}

	int method6064() {
		return 0;
	}

	public Class340_Sub1(Class180_Sub2 class180_sub2) {
		super(class180_sub2);
	}

	int method6043() {
		return 1;
	}

	boolean method6073() {
		return (aFloat10142 == 1.0F && aFloat10139 == 0.0F && aFloat10138 == 1.0F && aFloat10141 == 0.0F && aFloat10143 == 1.0F);
	}

	boolean method6074() {
		return (aFloat10142 == 1.0F && aFloat10139 == 0.0F && aFloat10138 == 1.0F && aFloat10141 == 0.0F && aFloat10143 == 1.0F);
	}

	int method6044() {
		return 1;
	}

	void method6051(int i, int i_15_) {
		/* empty */
	}

	void method6077(int i, int i_16_) {
		/* empty */
	}

	void method6059(int i, Class171_Sub2 class171_sub2, Interface38 interface38, Interface23 interface23, Interface38 interface38_17_, boolean bool) {
		float f = aClass180_Sub2_3673.method14911();
		float f_18_ = (float) class171_sub2.method2728();
		float f_19_ = (float) class171_sub2.method2729();
		float f_20_ = f * 2.0F / f_18_;
		float f_21_ = -f * 2.0F / f_19_;
		float[] fs = { -1.0F + f_20_, 1.0F + f_21_, 0.0F, 0.0F, -1.0F + f_20_, -3.0F + f_21_, 0.0F, 2.0F, 3.0F + f_20_, 1.0F + f_21_, 2.0F, 0.0F };
		int i_22_ = (int) f_18_;
		int i_23_ = (int) f_19_;
		int i_24_ = (bool ? aClass180_Sub2_3673.method3100(1276582199).method2728() : i_22_);
		int i_25_ = (bool ? aClass180_Sub2_3673.method3100(785214372).method2729() : i_23_);
		aClass261_10140.method4810(aClass265_10131);
		aClass261_10140.method4875();
		float f_26_ = (float) i_22_ / f_18_;
		float f_27_ = (float) i_23_ / f_19_;
		float f_28_ = (float) i_24_ / f_18_;
		float f_29_ = (float) i_25_ / f_19_;
		fs[8] = (fs[8] + 1.0F) * f_26_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_27_ + 1.0F;
		fs[10] *= f_28_;
		fs[7] *= f_29_;
		aClass261_10140.method4819(aClass527_Sub18_Sub1_10132, fs, (byte) 56);
		aClass261_10140.method4807(aClass527_Sub18_Sub1_10133, 0, interface38, -1643608423);
		aClass261_10140.method4814(aClass527_Sub18_Sub1_10134, aFloat10142, -881444413);
		aClass261_10140.method4817(aClass527_Sub18_Sub1_10135, aFloat10139, aFloat10138, aFloat10141, aFloat10143, 842872510);
		aClass261_10140.method4817(aClass527_Sub18_Sub1_10136, 0.0F, 0.0F, 0.0F, 0.0F, 187180997);
		aClass180_Sub2_3673.method3128(0, 0, i_22_, i_23_);
	}
}
