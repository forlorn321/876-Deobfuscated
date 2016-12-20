/* Class340_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class340_Sub2 extends Class340 {
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10144;
	public static float aFloat10145;
	public static int anInt10146;
	Class261 aClass261_10147;
	boolean aBool10148;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10149;
	Class265[] aClass265Array10150 = null;
	Class527_Sub18_Sub1[] aClass527_Sub18_Sub1Array10151 = null;
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10152;
	public static float[] aFloatArray10153 = { 0.0F, 0.0F, 0.0F };
	Class527_Sub18_Sub1 aClass527_Sub18_Sub1_10154;
	public static Class172_Sub2[] aClass172_Sub2Array10155;

	void method6060(int i) {
		aClass261_10147.method4854();
	}

	boolean method6035() {
		return (aClass180_Sub2_3673.aBool9581 && aClass180_Sub2_3673.method14889());
	}

	boolean method6036() {
		return aBool10148;
	}

	boolean method6055() {
		if (method6035()) {
			aClass261_10147 = aClass180_Sub2_3673.method14894("FilterColourRemapping");
			if (aClass261_10147 == null)
				return false;
			try {
				aClass527_Sub18_Sub1_10149 = aClass261_10147.method4881("sceneTex", -1803846915);
				aClass265Array10150 = new Class265[3];
				aClass527_Sub18_Sub1Array10151 = new Class527_Sub18_Sub1[3];
				if (aClass180_Sub2_3673.aBool9587) {
					aClass265Array10150[0] = aClass261_10147.method4805("techRemap3D_1", -1733553076);
					aClass265Array10150[1] = aClass261_10147.method4805("techRemap3D_2", -1733553076);
					aClass265Array10150[2] = aClass261_10147.method4805("techRemap3D_3", -1733553076);
					aClass527_Sub18_Sub1Array10151[0] = aClass261_10147.method4881("remapTex3D_1", -1803846915);
					aClass527_Sub18_Sub1Array10151[1] = aClass261_10147.method4881("remapTex3D_2", -1803846915);
					aClass527_Sub18_Sub1Array10151[2] = aClass261_10147.method4881("remapTex3D_3", -1803846915);
				} else {
					aClass265Array10150[0] = aClass261_10147.method4805("techRemap2D_1", -1733553076);
					aClass265Array10150[1] = aClass261_10147.method4805("techRemap2D_2", -1733553076);
					aClass265Array10150[2] = aClass261_10147.method4805("techRemap2D_3", -1733553076);
					aClass527_Sub18_Sub1Array10151[0] = aClass261_10147.method4881("remapTex2D_1", -1803846915);
					aClass527_Sub18_Sub1Array10151[1] = aClass261_10147.method4881("remapTex2D_2", -1803846915);
					aClass527_Sub18_Sub1Array10151[2] = aClass261_10147.method4881("remapTex2D_3", -1803846915);
				}
				aClass527_Sub18_Sub1_10152 = aClass261_10147.method4881("paramsWeightings", -1803846915);
				aClass527_Sub18_Sub1_10144 = aClass261_10147.method4881("pixelOffset", -1803846915);
				aClass527_Sub18_Sub1_10154 = aClass261_10147.method4881("PosAndTexCoords", -1803846915);
			} catch (Exception_Sub5_Sub2 exception_sub5_sub2) {
				return false;
			} catch (Exception_Sub5_Sub1 exception_sub5_sub1) {
				return false;
			}
			if (!aClass265Array10150[0].method4988() || !aClass265Array10150[1].method4988() || !aClass265Array10150[2].method4988())
				return false;
			aBool10148 = true;
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

	boolean method6052() {
		if (method6035()) {
			aClass261_10147 = aClass180_Sub2_3673.method14894("FilterColourRemapping");
			if (aClass261_10147 == null)
				return false;
			try {
				aClass527_Sub18_Sub1_10149 = aClass261_10147.method4881("sceneTex", -1803846915);
				aClass265Array10150 = new Class265[3];
				aClass527_Sub18_Sub1Array10151 = new Class527_Sub18_Sub1[3];
				if (aClass180_Sub2_3673.aBool9587) {
					aClass265Array10150[0] = aClass261_10147.method4805("techRemap3D_1", -1733553076);
					aClass265Array10150[1] = aClass261_10147.method4805("techRemap3D_2", -1733553076);
					aClass265Array10150[2] = aClass261_10147.method4805("techRemap3D_3", -1733553076);
					aClass527_Sub18_Sub1Array10151[0] = aClass261_10147.method4881("remapTex3D_1", -1803846915);
					aClass527_Sub18_Sub1Array10151[1] = aClass261_10147.method4881("remapTex3D_2", -1803846915);
					aClass527_Sub18_Sub1Array10151[2] = aClass261_10147.method4881("remapTex3D_3", -1803846915);
				} else {
					aClass265Array10150[0] = aClass261_10147.method4805("techRemap2D_1", -1733553076);
					aClass265Array10150[1] = aClass261_10147.method4805("techRemap2D_2", -1733553076);
					aClass265Array10150[2] = aClass261_10147.method4805("techRemap2D_3", -1733553076);
					aClass527_Sub18_Sub1Array10151[0] = aClass261_10147.method4881("remapTex2D_1", -1803846915);
					aClass527_Sub18_Sub1Array10151[1] = aClass261_10147.method4881("remapTex2D_2", -1803846915);
					aClass527_Sub18_Sub1Array10151[2] = aClass261_10147.method4881("remapTex2D_3", -1803846915);
				}
				aClass527_Sub18_Sub1_10152 = aClass261_10147.method4881("paramsWeightings", -1803846915);
				aClass527_Sub18_Sub1_10144 = aClass261_10147.method4881("pixelOffset", -1803846915);
				aClass527_Sub18_Sub1_10154 = aClass261_10147.method4881("PosAndTexCoords", -1803846915);
			} catch (Exception_Sub5_Sub2 exception_sub5_sub2) {
				return false;
			} catch (Exception_Sub5_Sub1 exception_sub5_sub1) {
				return false;
			}
			if (!aClass265Array10150[0].method4988() || !aClass265Array10150[1].method4988() || !aClass265Array10150[2].method4988())
				return false;
			aBool10148 = true;
			return true;
		}
		return false;
	}

	void method6059(int i, Class171_Sub2 class171_sub2, Interface38 interface38, Interface23 interface23, Interface38 interface38_1_, boolean bool) {
		float f = aClass180_Sub2_3673.method14911();
		float f_2_ = (float) class171_sub2.method2728();
		float f_3_ = (float) class171_sub2.method2729();
		Interface38 interface38_4_ = interface38;
		float f_5_ = f * 2.0F / f_2_;
		float f_6_ = -f * 2.0F / f_3_;
		float[] fs = { -1.0F + f_5_, 1.0F + f_6_, 0.0F, 0.0F, -1.0F + f_5_, -3.0F + f_6_, 0.0F, 2.0F, 3.0F + f_5_, 1.0F + f_6_, 2.0F, 0.0F };
		int i_7_ = (int) f_2_;
		int i_8_ = (int) f_3_;
		int i_9_ = (bool ? aClass180_Sub2_3673.method3100(1736002979).method2728() : i_7_);
		int i_10_ = (bool ? aClass180_Sub2_3673.method3100(1795946948).method2729() : i_8_);
		Class265 class265 = aClass265Array10150[anInt10146 - 1];
		aClass261_10147.method4810(class265);
		aClass261_10147.method4875();
		aClass261_10147.method4817(aClass527_Sub18_Sub1_10152, aFloat10145, aFloatArray10153[0], aFloatArray10153[1], aFloatArray10153[2], 1744530928);
		Object object = null;
		Object object_11_ = null;
		for (int i_12_ = 0; i_12_ < anInt10146; i_12_++) {
			if (aClass172_Sub2Array10155[i_12_] != null) {
				Class527_Sub18_Sub1 class527_sub18_sub1 = aClass527_Sub18_Sub1Array10151[i_12_];
				Interface41 interface41 = aClass172_Sub2Array10155[i_12_].method14812();
				aClass261_10147.method4807(class527_sub18_sub1, i_12_ + 1, interface41, -1954580540);
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
		aClass261_10147.method4819(aClass527_Sub18_Sub1_10154, fs, (byte) 95);
		aClass261_10147.method4807(aClass527_Sub18_Sub1_10149, 0, interface38_4_, -1719878023);
		aClass261_10147.method4817(aClass527_Sub18_Sub1_10144, 0.0F, 0.0F, 0.0F, 0.0F, 1620210620);
		aClass180_Sub2_3673.method3128(0, 0, i_7_, i_8_);
	}

	void method6041(int i) {
		aClass261_10147.method4854();
	}

	int method6045() {
		return 0;
	}

	int method6046() {
		return 2;
	}

	boolean method6048() {
		return (anInt10146 == 0 || aFloat10145 == 1.0F || (aFloatArray10153[0] + aFloatArray10153[1] + aFloatArray10153[2]) == 0.0F || (aClass172_Sub2Array10155[0] == null && aClass172_Sub2Array10155[1] == null && aClass172_Sub2Array10155[2] == null));
	}

	static {
		aFloat10145 = 1.0F;
		anInt10146 = 1;
		aClass172_Sub2Array10155 = new Class172_Sub2[] { null, null, null };
	}

	boolean method6049() {
		return (aClass180_Sub2_3673.aBool9581 && aClass180_Sub2_3673.method14889());
	}

	boolean method6050() {
		return aBool10148;
	}

	boolean method6072() {
		return aBool10148;
	}

	void method6070(int i, Class171_Sub2 class171_sub2, Interface38 interface38, Interface23 interface23, Interface38 interface38_17_, boolean bool) {
		float f = aClass180_Sub2_3673.method14911();
		float f_18_ = (float) class171_sub2.method2728();
		float f_19_ = (float) class171_sub2.method2729();
		Interface38 interface38_20_ = interface38;
		float f_21_ = f * 2.0F / f_18_;
		float f_22_ = -f * 2.0F / f_19_;
		float[] fs = { -1.0F + f_21_, 1.0F + f_22_, 0.0F, 0.0F, -1.0F + f_21_, -3.0F + f_22_, 0.0F, 2.0F, 3.0F + f_21_, 1.0F + f_22_, 2.0F, 0.0F };
		int i_23_ = (int) f_18_;
		int i_24_ = (int) f_19_;
		int i_25_ = (bool ? aClass180_Sub2_3673.method3100(1995999760).method2728() : i_23_);
		int i_26_ = (bool ? aClass180_Sub2_3673.method3100(1592352423).method2729() : i_24_);
		Class265 class265 = aClass265Array10150[anInt10146 - 1];
		aClass261_10147.method4810(class265);
		aClass261_10147.method4875();
		aClass261_10147.method4817(aClass527_Sub18_Sub1_10152, aFloat10145, aFloatArray10153[0], aFloatArray10153[1], aFloatArray10153[2], 588328730);
		Object object = null;
		Object object_27_ = null;
		for (int i_28_ = 0; i_28_ < anInt10146; i_28_++) {
			if (aClass172_Sub2Array10155[i_28_] != null) {
				Class527_Sub18_Sub1 class527_sub18_sub1 = aClass527_Sub18_Sub1Array10151[i_28_];
				Interface41 interface41 = aClass172_Sub2Array10155[i_28_].method14812();
				aClass261_10147.method4807(class527_sub18_sub1, i_28_ + 1, interface41, -1713026729);
			}
		}
		float f_29_ = (float) i_23_ / f_18_;
		float f_30_ = (float) i_24_ / f_19_;
		float f_31_ = (float) i_25_ / f_18_;
		float f_32_ = (float) i_26_ / f_19_;
		fs[8] = (fs[8] + 1.0F) * f_29_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_30_ + 1.0F;
		fs[10] *= f_31_;
		fs[7] *= f_32_;
		aClass261_10147.method4819(aClass527_Sub18_Sub1_10154, fs, (byte) 70);
		aClass261_10147.method4807(aClass527_Sub18_Sub1_10149, 0, interface38_20_, -2098694142);
		aClass261_10147.method4817(aClass527_Sub18_Sub1_10144, 0.0F, 0.0F, 0.0F, 0.0F, -526696361);
		aClass180_Sub2_3673.method3128(0, 0, i_23_, i_24_);
	}

	void method6051(int i, int i_33_) {
		/* empty */
	}

	boolean method6054() {
		if (method6035()) {
			aClass261_10147 = aClass180_Sub2_3673.method14894("FilterColourRemapping");
			if (aClass261_10147 == null)
				return false;
			try {
				aClass527_Sub18_Sub1_10149 = aClass261_10147.method4881("sceneTex", -1803846915);
				aClass265Array10150 = new Class265[3];
				aClass527_Sub18_Sub1Array10151 = new Class527_Sub18_Sub1[3];
				if (aClass180_Sub2_3673.aBool9587) {
					aClass265Array10150[0] = aClass261_10147.method4805("techRemap3D_1", -1733553076);
					aClass265Array10150[1] = aClass261_10147.method4805("techRemap3D_2", -1733553076);
					aClass265Array10150[2] = aClass261_10147.method4805("techRemap3D_3", -1733553076);
					aClass527_Sub18_Sub1Array10151[0] = aClass261_10147.method4881("remapTex3D_1", -1803846915);
					aClass527_Sub18_Sub1Array10151[1] = aClass261_10147.method4881("remapTex3D_2", -1803846915);
					aClass527_Sub18_Sub1Array10151[2] = aClass261_10147.method4881("remapTex3D_3", -1803846915);
				} else {
					aClass265Array10150[0] = aClass261_10147.method4805("techRemap2D_1", -1733553076);
					aClass265Array10150[1] = aClass261_10147.method4805("techRemap2D_2", -1733553076);
					aClass265Array10150[2] = aClass261_10147.method4805("techRemap2D_3", -1733553076);
					aClass527_Sub18_Sub1Array10151[0] = aClass261_10147.method4881("remapTex2D_1", -1803846915);
					aClass527_Sub18_Sub1Array10151[1] = aClass261_10147.method4881("remapTex2D_2", -1803846915);
					aClass527_Sub18_Sub1Array10151[2] = aClass261_10147.method4881("remapTex2D_3", -1803846915);
				}
				aClass527_Sub18_Sub1_10152 = aClass261_10147.method4881("paramsWeightings", -1803846915);
				aClass527_Sub18_Sub1_10144 = aClass261_10147.method4881("pixelOffset", -1803846915);
				aClass527_Sub18_Sub1_10154 = aClass261_10147.method4881("PosAndTexCoords", -1803846915);
			} catch (Exception_Sub5_Sub2 exception_sub5_sub2) {
				return false;
			} catch (Exception_Sub5_Sub1 exception_sub5_sub1) {
				return false;
			}
			if (!aClass265Array10150[0].method4988() || !aClass265Array10150[1].method4988() || !aClass265Array10150[2].method4988())
				return false;
			aBool10148 = true;
			return true;
		}
		return false;
	}

	void method6057() {
		/* empty */
	}

	boolean method6073() {
		return (anInt10146 == 0 || aFloat10145 == 1.0F || (aFloatArray10153[0] + aFloatArray10153[1] + aFloatArray10153[2]) == 0.0F || (aClass172_Sub2Array10155[0] == null && aClass172_Sub2Array10155[1] == null && aClass172_Sub2Array10155[2] == null));
	}

	boolean method6038() {
		return (anInt10146 == 0 || aFloat10145 == 1.0F || (aFloatArray10153[0] + aFloatArray10153[1] + aFloatArray10153[2]) == 0.0F || (aClass172_Sub2Array10155[0] == null && aClass172_Sub2Array10155[1] == null && aClass172_Sub2Array10155[2] == null));
	}

	void method6058() {
		/* empty */
	}

	void method6061(int i) {
		aClass261_10147.method4854();
	}

	int method6071() {
		return 2;
	}

	int method6034() {
		return 2;
	}

	int method6043() {
		return 1;
	}

	boolean method6067() {
		return (anInt10146 == 0 || aFloat10145 == 1.0F || (aFloatArray10153[0] + aFloatArray10153[1] + aFloatArray10153[2]) == 0.0F || (aClass172_Sub2Array10155[0] == null && aClass172_Sub2Array10155[1] == null && aClass172_Sub2Array10155[2] == null));
	}

	void method6077(int i, int i_34_) {
		/* empty */
	}

	public Class340_Sub2(Class180_Sub2 class180_sub2) {
		super(class180_sub2);
	}

	boolean method6074() {
		return (anInt10146 == 0 || aFloat10145 == 1.0F || (aFloatArray10153[0] + aFloatArray10153[1] + aFloatArray10153[2]) == 0.0F || (aClass172_Sub2Array10155[0] == null && aClass172_Sub2Array10155[1] == null && aClass172_Sub2Array10155[2] == null));
	}

	int method6044() {
		return 1;
	}

	boolean method6053() {
		if (method6035()) {
			aClass261_10147 = aClass180_Sub2_3673.method14894("FilterColourRemapping");
			if (aClass261_10147 == null)
				return false;
			try {
				aClass527_Sub18_Sub1_10149 = aClass261_10147.method4881("sceneTex", -1803846915);
				aClass265Array10150 = new Class265[3];
				aClass527_Sub18_Sub1Array10151 = new Class527_Sub18_Sub1[3];
				if (aClass180_Sub2_3673.aBool9587) {
					aClass265Array10150[0] = aClass261_10147.method4805("techRemap3D_1", -1733553076);
					aClass265Array10150[1] = aClass261_10147.method4805("techRemap3D_2", -1733553076);
					aClass265Array10150[2] = aClass261_10147.method4805("techRemap3D_3", -1733553076);
					aClass527_Sub18_Sub1Array10151[0] = aClass261_10147.method4881("remapTex3D_1", -1803846915);
					aClass527_Sub18_Sub1Array10151[1] = aClass261_10147.method4881("remapTex3D_2", -1803846915);
					aClass527_Sub18_Sub1Array10151[2] = aClass261_10147.method4881("remapTex3D_3", -1803846915);
				} else {
					aClass265Array10150[0] = aClass261_10147.method4805("techRemap2D_1", -1733553076);
					aClass265Array10150[1] = aClass261_10147.method4805("techRemap2D_2", -1733553076);
					aClass265Array10150[2] = aClass261_10147.method4805("techRemap2D_3", -1733553076);
					aClass527_Sub18_Sub1Array10151[0] = aClass261_10147.method4881("remapTex2D_1", -1803846915);
					aClass527_Sub18_Sub1Array10151[1] = aClass261_10147.method4881("remapTex2D_2", -1803846915);
					aClass527_Sub18_Sub1Array10151[2] = aClass261_10147.method4881("remapTex2D_3", -1803846915);
				}
				aClass527_Sub18_Sub1_10152 = aClass261_10147.method4881("paramsWeightings", -1803846915);
				aClass527_Sub18_Sub1_10144 = aClass261_10147.method4881("pixelOffset", -1803846915);
				aClass527_Sub18_Sub1_10154 = aClass261_10147.method4881("PosAndTexCoords", -1803846915);
			} catch (Exception_Sub5_Sub2 exception_sub5_sub2) {
				return false;
			} catch (Exception_Sub5_Sub1 exception_sub5_sub1) {
				return false;
			}
			if (!aClass265Array10150[0].method4988() || !aClass265Array10150[1].method4988() || !aClass265Array10150[2].method4988())
				return false;
			aBool10148 = true;
			return true;
		}
		return false;
	}

	int method6064() {
		return 0;
	}

	void method6078(int i, int i_35_) {
		/* empty */
	}
}
