/* Class439 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class439 {
	public float aFloat4890;
	public float aFloat4891;
	public float aFloat4892;
	public float aFloat4893;
	public float aFloat4894;
	public float aFloat4895;
	static float[] aFloatArray4896 = new float[8];
	static float[] aFloatArray4897;
	static float[] aFloatArray4898 = new float[8];

	static {
		aFloatArray4897 = new float[8];
	}

	public boolean method7097(int i, int i_0_, int i_1_, int i_2_, Class427 class427, float f, float f_3_, float f_4_, float f_5_) {
		boolean bool = false;
		float f_6_ = 3.4028235E38F;
		float f_7_ = -3.4028235E38F;
		float f_8_ = 3.4028235E38F;
		float f_9_ = -3.4028235E38F;
		aFloatArray4896[0] = aFloat4894;
		aFloatArray4898[0] = aFloat4891;
		aFloatArray4897[0] = aFloat4892;
		aFloatArray4896[1] = aFloat4893;
		aFloatArray4898[1] = aFloat4891;
		aFloatArray4897[1] = aFloat4892;
		aFloatArray4896[2] = aFloat4894;
		aFloatArray4898[2] = aFloat4890;
		aFloatArray4897[2] = aFloat4892;
		aFloatArray4896[3] = aFloat4893;
		aFloatArray4898[3] = aFloat4890;
		aFloatArray4897[3] = aFloat4892;
		aFloatArray4896[4] = aFloat4894;
		aFloatArray4898[4] = aFloat4891;
		aFloatArray4897[4] = aFloat4895;
		aFloatArray4896[5] = aFloat4893;
		aFloatArray4898[5] = aFloat4891;
		aFloatArray4897[5] = aFloat4895;
		aFloatArray4896[6] = aFloat4894;
		aFloatArray4898[6] = aFloat4890;
		aFloatArray4897[6] = aFloat4895;
		aFloatArray4896[7] = aFloat4893;
		aFloatArray4898[7] = aFloat4890;
		aFloatArray4897[7] = aFloat4895;
		for (int i_10_ = 0; i_10_ < 8; i_10_++) {
			float f_11_ = aFloatArray4896[i_10_];
			float f_12_ = aFloatArray4898[i_10_];
			float f_13_ = aFloatArray4897[i_10_];
			float f_14_ = (class427.aFloatArray4807[2] * f_11_ + class427.aFloatArray4807[6] * f_12_ + class427.aFloatArray4807[10] * f_13_ + class427.aFloatArray4807[14]);
			float f_15_ = (class427.aFloatArray4807[3] * f_11_ + class427.aFloatArray4807[7] * f_12_ + class427.aFloatArray4807[11] * f_13_ + class427.aFloatArray4807[15]);
			if (f_14_ >= -f_15_) {
				float f_16_ = (class427.aFloatArray4807[0] * f_11_ + class427.aFloatArray4807[4] * f_12_ + class427.aFloatArray4807[8] * f_13_ + class427.aFloatArray4807[12]);
				float f_17_ = (class427.aFloatArray4807[1] * f_11_ + class427.aFloatArray4807[5] * f_12_ + class427.aFloatArray4807[9] * f_13_ + class427.aFloatArray4807[13]);
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
