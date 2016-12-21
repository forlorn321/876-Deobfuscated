/* Class437 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class437 {
	public float aFloat4854;
	public float aFloat4855;
	public float aFloat4856;
	public float aFloat4857;
	public float aFloat4858;
	public float aFloat4859;
	static float[] aFloatArray4860 = new float[8];
	static float[] aFloatArray4861 = new float[8];
	static float[] aFloatArray4862 = new float[8];

	public boolean method5296(int i, int i_0_, int i_1_, int i_2_, Class443 class443, float f, float f_3_, float f_4_, float f_5_) {
		boolean bool = false;
		float f_6_ = 3.4028235E38F;
		float f_7_ = -3.4028235E38F;
		float f_8_ = 3.4028235E38F;
		float f_9_ = -3.4028235E38F;
		aFloatArray4860[0] = aFloat4859;
		aFloatArray4861[0] = aFloat4855;
		aFloatArray4862[0] = aFloat4856;
		aFloatArray4860[1] = aFloat4858;
		aFloatArray4861[1] = aFloat4855;
		aFloatArray4862[1] = aFloat4856;
		aFloatArray4860[2] = aFloat4859;
		aFloatArray4861[2] = aFloat4857;
		aFloatArray4862[2] = aFloat4856;
		aFloatArray4860[3] = aFloat4858;
		aFloatArray4861[3] = aFloat4857;
		aFloatArray4862[3] = aFloat4856;
		aFloatArray4860[4] = aFloat4859;
		aFloatArray4861[4] = aFloat4855;
		aFloatArray4862[4] = aFloat4854;
		aFloatArray4860[5] = aFloat4858;
		aFloatArray4861[5] = aFloat4855;
		aFloatArray4862[5] = aFloat4854;
		aFloatArray4860[6] = aFloat4859;
		aFloatArray4861[6] = aFloat4857;
		aFloatArray4862[6] = aFloat4854;
		aFloatArray4860[7] = aFloat4858;
		aFloatArray4861[7] = aFloat4857;
		aFloatArray4862[7] = aFloat4854;
		for (int i_10_ = 0; i_10_ < 8; i_10_++) {
			float f_11_ = aFloatArray4860[i_10_];
			float f_12_ = aFloatArray4861[i_10_];
			float f_13_ = aFloatArray4862[i_10_];
			float f_14_ = (class443.aFloatArray4878[2] * f_11_ + class443.aFloatArray4878[6] * f_12_ + class443.aFloatArray4878[10] * f_13_ + class443.aFloatArray4878[14]);
			float f_15_ = (class443.aFloatArray4878[3] * f_11_ + class443.aFloatArray4878[7] * f_12_ + class443.aFloatArray4878[11] * f_13_ + class443.aFloatArray4878[15]);
			if (f_14_ >= -f_15_) {
				float f_16_ = (class443.aFloatArray4878[0] * f_11_ + class443.aFloatArray4878[4] * f_12_ + class443.aFloatArray4878[8] * f_13_ + class443.aFloatArray4878[12]);
				float f_17_ = (class443.aFloatArray4878[1] * f_11_ + class443.aFloatArray4878[5] * f_12_ + class443.aFloatArray4878[9] * f_13_ + class443.aFloatArray4878[13]);
				float f_18_ = f + f_4_ * f_16_ / f_15_;
				float f_19_ = f_3_ + f_5_ * f_17_ / f_15_;
				if (f_18_ < f_6_)
					f_6_ = f_18_;
				if (f_18_ > f_7_)
					f_7_ = f_18_;
				if (f_19_ < f_8_)
					f_8_ = f_19_;
				if (f_19_ > f_9_)
					f_9_ = f_19_;
				bool = true;
			}
		}
		int i_20_ = i + i_1_;
		int i_21_ = i_0_ + i_2_;
		if (bool && (float) i_20_ > f_6_ && (float) i < f_7_ && (float) i_21_ > f_8_ && (float) i_0_ < f_9_)
			return true;
		return false;
	}
}
