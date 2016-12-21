/* Class443 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Arrays;

public final class Class443 {
	public float[] aFloatArray4878;
	public static Class443 aClass443_4879 = new Class443();

	float method5337() {
		return ((aFloatArray4878[0] * aFloatArray4878[5] * aFloatArray4878[10] * aFloatArray4878[15]) - (aFloatArray4878[0] * aFloatArray4878[5] * aFloatArray4878[11] * aFloatArray4878[14]) - (aFloatArray4878[0] * aFloatArray4878[6] * aFloatArray4878[9] * aFloatArray4878[15]) + (aFloatArray4878[0] * aFloatArray4878[6] * aFloatArray4878[11] * aFloatArray4878[13]) + (aFloatArray4878[0] * aFloatArray4878[7] * aFloatArray4878[9] * aFloatArray4878[14])
				- (aFloatArray4878[0] * aFloatArray4878[7] * aFloatArray4878[10] * aFloatArray4878[13]) - (aFloatArray4878[1] * aFloatArray4878[4] * aFloatArray4878[10] * aFloatArray4878[15]) + (aFloatArray4878[1] * aFloatArray4878[4] * aFloatArray4878[11] * aFloatArray4878[14]) + (aFloatArray4878[1] * aFloatArray4878[6] * aFloatArray4878[8] * aFloatArray4878[15]) - (aFloatArray4878[1] * aFloatArray4878[6] * aFloatArray4878[11] * aFloatArray4878[12])
				- (aFloatArray4878[1] * aFloatArray4878[7] * aFloatArray4878[8] * aFloatArray4878[14]) + (aFloatArray4878[1] * aFloatArray4878[7] * aFloatArray4878[10] * aFloatArray4878[12]) + (aFloatArray4878[2] * aFloatArray4878[4] * aFloatArray4878[9] * aFloatArray4878[15]) - (aFloatArray4878[2] * aFloatArray4878[4] * aFloatArray4878[11] * aFloatArray4878[13]) - (aFloatArray4878[2] * aFloatArray4878[5] * aFloatArray4878[8] * aFloatArray4878[15])
				+ (aFloatArray4878[2] * aFloatArray4878[5] * aFloatArray4878[11] * aFloatArray4878[12]) + (aFloatArray4878[2] * aFloatArray4878[7] * aFloatArray4878[8] * aFloatArray4878[13]) - (aFloatArray4878[2] * aFloatArray4878[7] * aFloatArray4878[9] * aFloatArray4878[12]) - (aFloatArray4878[3] * aFloatArray4878[4] * aFloatArray4878[9] * aFloatArray4878[14]) + (aFloatArray4878[3] * aFloatArray4878[4] * aFloatArray4878[10] * aFloatArray4878[13])
				+ (aFloatArray4878[3] * aFloatArray4878[5] * aFloatArray4878[8] * aFloatArray4878[14]) - (aFloatArray4878[3] * aFloatArray4878[5] * aFloatArray4878[10] * aFloatArray4878[12]) - (aFloatArray4878[3] * aFloatArray4878[6] * aFloatArray4878[8] * aFloatArray4878[13]) + (aFloatArray4878[3] * aFloatArray4878[6] * aFloatArray4878[9] * aFloatArray4878[12]));
	}

	public void method5338() {
		aFloatArray4878[0] = 1.0F;
		aFloatArray4878[1] = 0.0F;
		aFloatArray4878[2] = 0.0F;
		aFloatArray4878[3] = 0.0F;
		aFloatArray4878[4] = 0.0F;
		aFloatArray4878[5] = 1.0F;
		aFloatArray4878[6] = 0.0F;
		aFloatArray4878[7] = 0.0F;
		aFloatArray4878[8] = 0.0F;
		aFloatArray4878[9] = 0.0F;
		aFloatArray4878[10] = 1.0F;
		aFloatArray4878[11] = 0.0F;
		aFloatArray4878[12] = 0.0F;
		aFloatArray4878[13] = 0.0F;
		aFloatArray4878[14] = 0.0F;
		aFloatArray4878[15] = 1.0F;
	}

	public void method5339(Class443 class443_0_) {
		System.arraycopy(class443_0_.aFloatArray4878, 0, aFloatArray4878, 0, 16);
	}

	public void method5340(Class443 class443_1_) {
		System.arraycopy(class443_1_.aFloatArray4878, 0, aFloatArray4878, 0, 11);
		aFloatArray4878[3] = 0.0F;
		aFloatArray4878[7] = 0.0F;
		aFloatArray4878[11] = 0.0F;
		aFloatArray4878[12] = 0.0F;
		aFloatArray4878[13] = 0.0F;
		aFloatArray4878[14] = 0.0F;
		aFloatArray4878[15] = 1.0F;
	}

	public int method5341() {
		int i = 1;
		i = 31 * i + Arrays.hashCode(aFloatArray4878);
		return i;
	}

	public boolean method5342() {
		return (aFloatArray4878[0] == 1.0F && aFloatArray4878[1] == 0.0F && aFloatArray4878[2] == 0.0F && aFloatArray4878[3] == 0.0F && aFloatArray4878[4] == 0.0F && aFloatArray4878[5] == 1.0F && aFloatArray4878[6] == 0.0F && aFloatArray4878[7] == 0.0F && aFloatArray4878[8] == 0.0F && aFloatArray4878[9] == 0.0F && aFloatArray4878[10] == 1.0F && aFloatArray4878[11] == 0.0F && aFloatArray4878[12] == 0.0F && aFloatArray4878[13] == 0.0F && aFloatArray4878[14] == 0.0F && aFloatArray4878[15] == 1.0F);
	}

	public void method5343() {
		float f = 1.0F / method5337();
		float f_2_ = (aFloatArray4878[5] * aFloatArray4878[10] * aFloatArray4878[15] - aFloatArray4878[5] * aFloatArray4878[11] * aFloatArray4878[14] - aFloatArray4878[6] * aFloatArray4878[9] * aFloatArray4878[15] + aFloatArray4878[6] * aFloatArray4878[11] * aFloatArray4878[13] + aFloatArray4878[7] * aFloatArray4878[9] * aFloatArray4878[14] - (aFloatArray4878[7] * aFloatArray4878[10] * aFloatArray4878[13])) * f;
		float f_3_ = (-aFloatArray4878[1] * aFloatArray4878[10] * aFloatArray4878[15] + aFloatArray4878[1] * aFloatArray4878[11] * aFloatArray4878[14] + aFloatArray4878[2] * aFloatArray4878[9] * aFloatArray4878[15] - aFloatArray4878[2] * aFloatArray4878[11] * aFloatArray4878[13] - aFloatArray4878[3] * aFloatArray4878[9] * aFloatArray4878[14] + (aFloatArray4878[3] * aFloatArray4878[10] * aFloatArray4878[13])) * f;
		float f_4_ = ((aFloatArray4878[1] * aFloatArray4878[6] * aFloatArray4878[15] - aFloatArray4878[1] * aFloatArray4878[7] * aFloatArray4878[14] - aFloatArray4878[2] * aFloatArray4878[5] * aFloatArray4878[15] + aFloatArray4878[2] * aFloatArray4878[7] * aFloatArray4878[13] + aFloatArray4878[3] * aFloatArray4878[5] * aFloatArray4878[14] - (aFloatArray4878[3] * aFloatArray4878[6] * aFloatArray4878[13])) * f);
		float f_5_ = ((-aFloatArray4878[1] * aFloatArray4878[6] * aFloatArray4878[11] + aFloatArray4878[1] * aFloatArray4878[7] * aFloatArray4878[10] + aFloatArray4878[2] * aFloatArray4878[5] * aFloatArray4878[11] - aFloatArray4878[2] * aFloatArray4878[7] * aFloatArray4878[9] - aFloatArray4878[3] * aFloatArray4878[5] * aFloatArray4878[10] + aFloatArray4878[3] * aFloatArray4878[6] * aFloatArray4878[9]) * f);
		float f_6_ = (-aFloatArray4878[4] * aFloatArray4878[10] * aFloatArray4878[15] + aFloatArray4878[4] * aFloatArray4878[11] * aFloatArray4878[14] + aFloatArray4878[6] * aFloatArray4878[8] * aFloatArray4878[15] - aFloatArray4878[6] * aFloatArray4878[11] * aFloatArray4878[12] - aFloatArray4878[7] * aFloatArray4878[8] * aFloatArray4878[14] + (aFloatArray4878[7] * aFloatArray4878[10] * aFloatArray4878[12])) * f;
		float f_7_ = (aFloatArray4878[0] * aFloatArray4878[10] * aFloatArray4878[15] - aFloatArray4878[0] * aFloatArray4878[11] * aFloatArray4878[14] - aFloatArray4878[2] * aFloatArray4878[8] * aFloatArray4878[15] + aFloatArray4878[2] * aFloatArray4878[11] * aFloatArray4878[12] + aFloatArray4878[3] * aFloatArray4878[8] * aFloatArray4878[14] - (aFloatArray4878[3] * aFloatArray4878[10] * aFloatArray4878[12])) * f;
		float f_8_ = ((-aFloatArray4878[0] * aFloatArray4878[6] * aFloatArray4878[15] + aFloatArray4878[0] * aFloatArray4878[7] * aFloatArray4878[14] + aFloatArray4878[2] * aFloatArray4878[4] * aFloatArray4878[15] - aFloatArray4878[2] * aFloatArray4878[7] * aFloatArray4878[12] - aFloatArray4878[3] * aFloatArray4878[4] * aFloatArray4878[14] + (aFloatArray4878[3] * aFloatArray4878[6] * aFloatArray4878[12])) * f);
		float f_9_ = ((aFloatArray4878[0] * aFloatArray4878[6] * aFloatArray4878[11] - aFloatArray4878[0] * aFloatArray4878[7] * aFloatArray4878[10] - aFloatArray4878[2] * aFloatArray4878[4] * aFloatArray4878[11] + aFloatArray4878[2] * aFloatArray4878[7] * aFloatArray4878[8] + aFloatArray4878[3] * aFloatArray4878[4] * aFloatArray4878[10] - aFloatArray4878[3] * aFloatArray4878[6] * aFloatArray4878[8]) * f);
		float f_10_ = (aFloatArray4878[4] * aFloatArray4878[9] * aFloatArray4878[15] - aFloatArray4878[4] * aFloatArray4878[11] * aFloatArray4878[13] - aFloatArray4878[5] * aFloatArray4878[8] * aFloatArray4878[15] + aFloatArray4878[5] * aFloatArray4878[11] * aFloatArray4878[12] + aFloatArray4878[7] * aFloatArray4878[8] * aFloatArray4878[13] - (aFloatArray4878[7] * aFloatArray4878[9] * aFloatArray4878[12])) * f;
		float f_11_ = (-aFloatArray4878[0] * aFloatArray4878[9] * aFloatArray4878[15] + aFloatArray4878[0] * aFloatArray4878[11] * aFloatArray4878[13] + aFloatArray4878[1] * aFloatArray4878[8] * aFloatArray4878[15] - aFloatArray4878[1] * aFloatArray4878[11] * aFloatArray4878[12] - aFloatArray4878[3] * aFloatArray4878[8] * aFloatArray4878[13] + (aFloatArray4878[3] * aFloatArray4878[9] * aFloatArray4878[12])) * f;
		float f_12_ = ((aFloatArray4878[0] * aFloatArray4878[5] * aFloatArray4878[15] - aFloatArray4878[0] * aFloatArray4878[7] * aFloatArray4878[13] - aFloatArray4878[1] * aFloatArray4878[4] * aFloatArray4878[15] + aFloatArray4878[1] * aFloatArray4878[7] * aFloatArray4878[12] + aFloatArray4878[3] * aFloatArray4878[4] * aFloatArray4878[13] - (aFloatArray4878[3] * aFloatArray4878[5] * aFloatArray4878[12])) * f);
		float f_13_ = ((-aFloatArray4878[0] * aFloatArray4878[5] * aFloatArray4878[11] + aFloatArray4878[0] * aFloatArray4878[7] * aFloatArray4878[9] + aFloatArray4878[1] * aFloatArray4878[4] * aFloatArray4878[11] - aFloatArray4878[1] * aFloatArray4878[7] * aFloatArray4878[8] - aFloatArray4878[3] * aFloatArray4878[4] * aFloatArray4878[9] + aFloatArray4878[3] * aFloatArray4878[5] * aFloatArray4878[8]) * f);
		float f_14_ = (-aFloatArray4878[4] * aFloatArray4878[9] * aFloatArray4878[14] + aFloatArray4878[4] * aFloatArray4878[10] * aFloatArray4878[13] + aFloatArray4878[5] * aFloatArray4878[8] * aFloatArray4878[14] - aFloatArray4878[5] * aFloatArray4878[10] * aFloatArray4878[12] - aFloatArray4878[6] * aFloatArray4878[8] * aFloatArray4878[13] + (aFloatArray4878[6] * aFloatArray4878[9] * aFloatArray4878[12])) * f;
		float f_15_ = (aFloatArray4878[0] * aFloatArray4878[9] * aFloatArray4878[14] - aFloatArray4878[0] * aFloatArray4878[10] * aFloatArray4878[13] - aFloatArray4878[1] * aFloatArray4878[8] * aFloatArray4878[14] + aFloatArray4878[1] * aFloatArray4878[10] * aFloatArray4878[12] + aFloatArray4878[2] * aFloatArray4878[8] * aFloatArray4878[13] - (aFloatArray4878[2] * aFloatArray4878[9] * aFloatArray4878[12])) * f;
		float f_16_ = ((-aFloatArray4878[0] * aFloatArray4878[5] * aFloatArray4878[14] + aFloatArray4878[0] * aFloatArray4878[6] * aFloatArray4878[13] + aFloatArray4878[1] * aFloatArray4878[4] * aFloatArray4878[14] - aFloatArray4878[1] * aFloatArray4878[6] * aFloatArray4878[12] - aFloatArray4878[2] * aFloatArray4878[4] * aFloatArray4878[13] + (aFloatArray4878[2] * aFloatArray4878[5] * aFloatArray4878[12])) * f);
		float f_17_ = ((aFloatArray4878[0] * aFloatArray4878[5] * aFloatArray4878[10] - aFloatArray4878[0] * aFloatArray4878[6] * aFloatArray4878[9] - aFloatArray4878[1] * aFloatArray4878[4] * aFloatArray4878[10] + aFloatArray4878[1] * aFloatArray4878[6] * aFloatArray4878[8] + aFloatArray4878[2] * aFloatArray4878[4] * aFloatArray4878[9] - aFloatArray4878[2] * aFloatArray4878[5] * aFloatArray4878[8]) * f);
		aFloatArray4878[0] = f_2_;
		aFloatArray4878[1] = f_3_;
		aFloatArray4878[2] = f_4_;
		aFloatArray4878[3] = f_5_;
		aFloatArray4878[4] = f_6_;
		aFloatArray4878[5] = f_7_;
		aFloatArray4878[6] = f_8_;
		aFloatArray4878[7] = f_9_;
		aFloatArray4878[8] = f_10_;
		aFloatArray4878[9] = f_11_;
		aFloatArray4878[10] = f_12_;
		aFloatArray4878[11] = f_13_;
		aFloatArray4878[12] = f_14_;
		aFloatArray4878[13] = f_15_;
		aFloatArray4878[14] = f_16_;
		aFloatArray4878[15] = f_17_;
	}

	public void method5344(float f, float f_18_, float f_19_, float f_20_) {
		aFloatArray4878[0] = f;
		aFloatArray4878[1] = 0.0F;
		aFloatArray4878[2] = 0.0F;
		aFloatArray4878[3] = 0.0F;
		aFloatArray4878[4] = 0.0F;
		aFloatArray4878[5] = f_18_;
		aFloatArray4878[6] = 0.0F;
		aFloatArray4878[7] = 0.0F;
		aFloatArray4878[8] = 0.0F;
		aFloatArray4878[9] = 0.0F;
		aFloatArray4878[10] = f_19_;
		aFloatArray4878[11] = 0.0F;
		aFloatArray4878[12] = 0.0F;
		aFloatArray4878[13] = 0.0F;
		aFloatArray4878[14] = 0.0F;
		aFloatArray4878[15] = f_20_;
	}

	public void method5345() {
		aFloatArray4878[0] = 1.0F;
		aFloatArray4878[1] = 0.0F;
		aFloatArray4878[2] = 0.0F;
		aFloatArray4878[3] = 0.0F;
		aFloatArray4878[4] = 0.0F;
		aFloatArray4878[5] = 1.0F;
		aFloatArray4878[6] = 0.0F;
		aFloatArray4878[7] = 0.0F;
		aFloatArray4878[8] = 0.0F;
		aFloatArray4878[9] = 0.0F;
		aFloatArray4878[10] = 1.0F;
		aFloatArray4878[11] = 0.0F;
		aFloatArray4878[12] = 0.0F;
		aFloatArray4878[13] = 0.0F;
		aFloatArray4878[14] = 0.0F;
		aFloatArray4878[15] = 1.0F;
	}

	public void method5346(float f, float f_21_, float f_22_, float[] fs) {
		fs[0] = (aFloatArray4878[0] * f + aFloatArray4878[4] * f_21_ + aFloatArray4878[8] * f_22_ + aFloatArray4878[12]);
		fs[1] = (aFloatArray4878[1] * f + aFloatArray4878[5] * f_21_ + aFloatArray4878[9] * f_22_ + aFloatArray4878[13]);
		fs[2] = (aFloatArray4878[2] * f + aFloatArray4878[6] * f_21_ + aFloatArray4878[10] * f_22_ + aFloatArray4878[14]);
		if (fs.length > 3)
			fs[3] = (aFloatArray4878[3] * f + aFloatArray4878[7] * f_21_ + aFloatArray4878[11] * f_22_ + aFloatArray4878[15]);
	}

	public void method5347(float[] fs) {
		float f = fs[0];
		float f_23_ = fs[1];
		float f_24_ = fs[2];
		fs[0] = (aFloatArray4878[0] * f + aFloatArray4878[4] * f_23_ + aFloatArray4878[8] * f_24_ + aFloatArray4878[12]);
		fs[1] = (aFloatArray4878[1] * f + aFloatArray4878[5] * f_23_ + aFloatArray4878[9] * f_24_ + aFloatArray4878[13]);
		fs[2] = (aFloatArray4878[2] * f + aFloatArray4878[6] * f_23_ + aFloatArray4878[10] * f_24_ + aFloatArray4878[14]);
	}

	public void method5348(float f, float f_25_, float f_26_, float[] fs) {
		fs[0] = (aFloatArray4878[0] * f + aFloatArray4878[4] * f_25_ + aFloatArray4878[8] * f_26_);
		fs[1] = (aFloatArray4878[1] * f + aFloatArray4878[5] * f_25_ + aFloatArray4878[9] * f_26_);
		fs[2] = (aFloatArray4878[2] * f + aFloatArray4878[6] * f_25_ + aFloatArray4878[10] * f_26_);
		if (fs.length > 3)
			fs[3] = (aFloatArray4878[3] * f + aFloatArray4878[7] * f_25_ + aFloatArray4878[11] * f_26_);
	}

	public void method5349(float f, float f_27_, float f_28_, float f_29_) {
		float f_30_ = (float) (Math.tan((double) (f_28_ / 2.0F)) * (double) f);
		float f_31_ = (float) (Math.tan((double) (f_29_ / 2.0F)) * (double) f);
		method5387(-f_30_, f_30_, -f_31_, f_31_, f, f_27_);
	}

	public Class443() {
		aFloatArray4878 = new float[16];
		method5338();
	}

	public void method5350(float f, float f_32_, float f_33_, float f_34_, float f_35_, float f_36_, float f_37_, float f_38_) {
		aFloatArray4878[0] = f_33_ * 2.0F / f_37_;
		aFloatArray4878[1] = 0.0F;
		aFloatArray4878[2] = 0.0F;
		aFloatArray4878[3] = 0.0F;
		aFloatArray4878[4] = 0.0F;
		aFloatArray4878[5] = f_34_ * 2.0F / f_38_;
		aFloatArray4878[6] = 0.0F;
		aFloatArray4878[7] = 0.0F;
		aFloatArray4878[8] = 2.0F * f / f_37_ - 1.0F;
		aFloatArray4878[9] = 2.0F * f_32_ / f_38_ - 1.0F;
		aFloatArray4878[10] = (f_36_ + f_35_) / (f_36_ - f_35_);
		aFloatArray4878[11] = 1.0F;
		aFloatArray4878[12] = 0.0F;
		aFloatArray4878[13] = 0.0F;
		aFloatArray4878[14] = 2.0F * f_36_ * f_35_ / (f_35_ - f_36_);
		aFloatArray4878[15] = 0.0F;
	}

	public float method5351() {
		return (-(aFloatArray4878[15] + aFloatArray4878[14]) / (aFloatArray4878[11] + aFloatArray4878[10]));
	}

	public float method5352() {
		return ((aFloatArray4878[14] - aFloatArray4878[15]) / (aFloatArray4878[11] - aFloatArray4878[10]));
	}

	public float[] method5353(float[] fs) {
		float f = aFloatArray4878[3] + aFloatArray4878[0];
		float f_39_ = aFloatArray4878[7] + aFloatArray4878[4];
		float f_40_ = aFloatArray4878[11] + aFloatArray4878[8];
		double d = Math.sqrt((double) (f * f + f_39_ * f_39_ + f_40_ * f_40_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_39_ / d);
		fs[2] = (float) ((double) f_40_ / d);
		fs[3] = (float) ((double) (aFloatArray4878[15] + aFloatArray4878[12]) / d);
		return fs;
	}

	public float[] method5354(float[] fs) {
		float f = aFloatArray4878[3] - aFloatArray4878[0];
		float f_41_ = aFloatArray4878[7] - aFloatArray4878[4];
		float f_42_ = aFloatArray4878[11] - aFloatArray4878[8];
		double d = Math.sqrt((double) (f * f + f_41_ * f_41_ + f_42_ * f_42_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_41_ / d);
		fs[2] = (float) ((double) f_42_ / d);
		fs[3] = (float) ((double) (aFloatArray4878[15] - aFloatArray4878[12]) / d);
		return fs;
	}

	public float[] method5355(float[] fs) {
		float f = aFloatArray4878[3] + aFloatArray4878[1];
		float f_43_ = aFloatArray4878[7] + aFloatArray4878[5];
		float f_44_ = aFloatArray4878[11] + aFloatArray4878[9];
		double d = Math.sqrt((double) (f * f + f_43_ * f_43_ + f_44_ * f_44_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_43_ / d);
		fs[2] = (float) ((double) f_44_ / d);
		fs[3] = (float) ((double) (aFloatArray4878[15] + aFloatArray4878[13]) / d);
		return fs;
	}

	public float[] method5356(float[] fs) {
		fs[0] = aFloatArray4878[0];
		fs[1] = aFloatArray4878[4];
		fs[2] = aFloatArray4878[8];
		fs[3] = aFloatArray4878[12];
		fs[4] = aFloatArray4878[1];
		fs[5] = aFloatArray4878[5];
		fs[6] = aFloatArray4878[9];
		fs[7] = aFloatArray4878[13];
		fs[8] = aFloatArray4878[2];
		fs[9] = aFloatArray4878[6];
		fs[10] = aFloatArray4878[10];
		fs[11] = aFloatArray4878[14];
		fs[12] = aFloatArray4878[3];
		fs[13] = aFloatArray4878[7];
		fs[14] = aFloatArray4878[11];
		fs[15] = aFloatArray4878[15];
		return fs;
	}

	public float[] method5357(float[] fs) {
		float f = aFloatArray4878[3] + aFloatArray4878[2];
		float f_45_ = aFloatArray4878[7] + aFloatArray4878[6];
		float f_46_ = aFloatArray4878[11] + aFloatArray4878[10];
		double d = Math.sqrt((double) (f * f + f_45_ * f_45_ + f_46_ * f_46_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_45_ / d);
		fs[2] = (float) ((double) f_46_ / d);
		fs[3] = (float) ((double) (aFloatArray4878[15] + aFloatArray4878[14]) / d);
		return fs;
	}

	public float[] method5358(float[] fs) {
		float f = aFloatArray4878[3] - aFloatArray4878[2];
		float f_47_ = aFloatArray4878[7] - aFloatArray4878[6];
		float f_48_ = aFloatArray4878[11] - aFloatArray4878[10];
		double d = Math.sqrt((double) (f * f + f_47_ * f_47_ + f_48_ * f_48_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_47_ / d);
		fs[2] = (float) ((double) f_48_ / d);
		fs[3] = (float) ((double) (aFloatArray4878[15] - aFloatArray4878[14]) / d);
		return fs;
	}

	public void method5359(Class433 class433) {
		aFloatArray4878[0] = class433.aFloat4827;
		aFloatArray4878[1] = class433.aFloat4828;
		aFloatArray4878[2] = class433.aFloat4833;
		aFloatArray4878[3] = 0.0F;
		aFloatArray4878[4] = class433.aFloat4826;
		aFloatArray4878[5] = class433.aFloat4831;
		aFloatArray4878[6] = class433.aFloat4832;
		aFloatArray4878[7] = 0.0F;
		aFloatArray4878[8] = class433.aFloat4834;
		aFloatArray4878[9] = class433.aFloat4830;
		aFloatArray4878[10] = class433.aFloat4829;
		aFloatArray4878[11] = 0.0F;
		aFloatArray4878[12] = class433.aFloat4835;
		aFloatArray4878[13] = class433.aFloat4837;
		aFloatArray4878[14] = class433.aFloat4838;
		aFloatArray4878[15] = 1.0F;
	}

	public float[] method5360(float[] fs) {
		System.arraycopy(aFloatArray4878, 0, fs, 0, 16);
		fs[3] = 0.0F;
		fs[7] = 0.0F;
		fs[11] = 0.0F;
		fs[12] = 0.0F;
		fs[13] = 0.0F;
		fs[14] = 0.0F;
		fs[15] = 1.0F;
		return fs;
	}

	public float[] method5361(float[] fs) {
		fs[0] = aFloatArray4878[0];
		fs[1] = aFloatArray4878[1];
		fs[2] = aFloatArray4878[2];
		fs[3] = aFloatArray4878[4];
		fs[4] = aFloatArray4878[5];
		fs[5] = aFloatArray4878[6];
		fs[6] = aFloatArray4878[8];
		fs[7] = aFloatArray4878[9];
		fs[8] = aFloatArray4878[10];
		return fs;
	}

	public void method5362() {
		float f = aFloatArray4878[0];
		float f_49_ = aFloatArray4878[4];
		float f_50_ = aFloatArray4878[8];
		float f_51_ = aFloatArray4878[12];
		float f_52_ = aFloatArray4878[1];
		float f_53_ = aFloatArray4878[5];
		float f_54_ = aFloatArray4878[9];
		float f_55_ = aFloatArray4878[13];
		float f_56_ = aFloatArray4878[2];
		float f_57_ = aFloatArray4878[6];
		float f_58_ = aFloatArray4878[10];
		float f_59_ = aFloatArray4878[14];
		float f_60_ = aFloatArray4878[3];
		float f_61_ = aFloatArray4878[7];
		float f_62_ = aFloatArray4878[11];
		float f_63_ = aFloatArray4878[15];
		aFloatArray4878[0] = f;
		aFloatArray4878[1] = f_49_;
		aFloatArray4878[2] = f_50_;
		aFloatArray4878[3] = f_51_;
		aFloatArray4878[4] = f_52_;
		aFloatArray4878[5] = f_53_;
		aFloatArray4878[6] = f_54_;
		aFloatArray4878[7] = f_55_;
		aFloatArray4878[8] = f_56_;
		aFloatArray4878[9] = f_57_;
		aFloatArray4878[10] = f_58_;
		aFloatArray4878[11] = f_59_;
		aFloatArray4878[12] = f_60_;
		aFloatArray4878[13] = f_61_;
		aFloatArray4878[14] = f_62_;
		aFloatArray4878[15] = f_63_;
	}

	public float[] method5363(float[] fs) {
		fs[0] = aFloatArray4878[0];
		fs[1] = aFloatArray4878[1];
		fs[2] = aFloatArray4878[4];
		fs[3] = aFloatArray4878[5];
		fs[4] = aFloatArray4878[8];
		fs[5] = aFloatArray4878[9];
		fs[6] = aFloatArray4878[12];
		fs[7] = aFloatArray4878[13];
		return fs;
	}

	public float[] method5364(float[] fs) {
		fs[0] = aFloatArray4878[0];
		fs[1] = aFloatArray4878[1];
		fs[2] = 0.0F;
		fs[3] = 0.0F;
		fs[4] = aFloatArray4878[4];
		fs[5] = aFloatArray4878[5];
		fs[6] = 0.0F;
		fs[7] = 0.0F;
		fs[8] = aFloatArray4878[12];
		fs[9] = aFloatArray4878[13];
		fs[10] = aFloatArray4878[14];
		fs[11] = 0.0F;
		fs[12] = 0.0F;
		fs[13] = 0.0F;
		fs[14] = 0.0F;
		fs[15] = 1.0F;
		return fs;
	}

	public void method5365(int i, int i_64_, int i_65_, float f, float f_66_, float f_67_) {
		if (i != 0) {
			float f_68_ = Class435.aFloatArray4847[i & 0x3fff];
			float f_69_ = Class435.aFloatArray4846[i & 0x3fff];
			aFloatArray4878[0] = f_68_ * (float) i_64_;
			aFloatArray4878[5] = f_68_ * (float) i_65_;
			aFloatArray4878[1] = f_69_ * (float) i_64_;
			aFloatArray4878[4] = -f_69_ * (float) i_65_;
			aFloatArray4878[10] = 1.0F;
			float[] fs = aFloatArray4878;
			float[] fs_70_ = aFloatArray4878;
			float[] fs_71_ = aFloatArray4878;
			aFloatArray4878[9] = 0.0F;
			fs_71_[8] = 0.0F;
			fs_70_[6] = 0.0F;
			fs[2] = 0.0F;
		} else {
			aFloatArray4878[0] = (float) i_64_;
			aFloatArray4878[5] = (float) i_65_;
			aFloatArray4878[10] = 1.0F;
			float[] fs = aFloatArray4878;
			float[] fs_72_ = aFloatArray4878;
			float[] fs_73_ = aFloatArray4878;
			float[] fs_74_ = aFloatArray4878;
			float[] fs_75_ = aFloatArray4878;
			aFloatArray4878[9] = 0.0F;
			fs_75_[8] = 0.0F;
			fs_74_[6] = 0.0F;
			fs_73_[4] = 0.0F;
			fs_72_[2] = 0.0F;
			fs[1] = 0.0F;
		}
		float[] fs = aFloatArray4878;
		float[] fs_76_ = aFloatArray4878;
		aFloatArray4878[11] = 0.0F;
		fs_76_[7] = 0.0F;
		fs[3] = 0.0F;
		aFloatArray4878[15] = 1.0F;
		aFloatArray4878[12] = f;
		aFloatArray4878[13] = f_66_;
		aFloatArray4878[14] = f_67_;
	}

	public String toString() {
		StringBuilder stringbuilder = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			for (int i_77_ = 0; i_77_ < 4; i_77_++) {
				if (i_77_ > 0)
					stringbuilder.append("\t");
				stringbuilder.append(aFloatArray4878[i * 4 + i_77_]);
			}
			stringbuilder.append("\n");
		}
		return stringbuilder.toString();
	}

	public int hashCode() {
		int i = 1;
		i = 31 * i + Arrays.hashCode(aFloatArray4878);
		return i;
	}

	public boolean equals(Object object) {
		if (!(object instanceof Class443))
			return false;
		Class443 class443_78_ = (Class443) object;
		for (int i = 0; i < 16; i++) {
			if (aFloatArray4878[i] != class443_78_.aFloatArray4878[i])
				return false;
		}
		return true;
	}

	public boolean method5366(Object object) {
		if (!(object instanceof Class443))
			return false;
		Class443 class443_79_ = (Class443) object;
		for (int i = 0; i < 16; i++) {
			if (aFloatArray4878[i] != class443_79_.aFloatArray4878[i])
				return false;
		}
		return true;
	}

	public boolean method5367(Object object) {
		if (!(object instanceof Class443))
			return false;
		Class443 class443_80_ = (Class443) object;
		for (int i = 0; i < 16; i++) {
			if (aFloatArray4878[i] != class443_80_.aFloatArray4878[i])
				return false;
		}
		return true;
	}

	public String method5368() {
		StringBuilder stringbuilder = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			for (int i_81_ = 0; i_81_ < 4; i_81_++) {
				if (i_81_ > 0)
					stringbuilder.append("\t");
				stringbuilder.append(aFloatArray4878[i * 4 + i_81_]);
			}
			stringbuilder.append("\n");
		}
		return stringbuilder.toString();
	}

	public void method5369(float f, float f_82_, float f_83_) {
		method5372(-10000.0F / f_83_, 10000.0F / f_83_, -10000.0F / f_83_, 10000.0F / f_83_, f, f_82_);
	}

	public float[] method5370(float[] fs) {
		fs[0] = aFloatArray4878[0];
		fs[1] = aFloatArray4878[4];
		fs[2] = aFloatArray4878[8];
		fs[3] = aFloatArray4878[12];
		fs[4] = aFloatArray4878[1];
		fs[5] = aFloatArray4878[5];
		fs[6] = aFloatArray4878[9];
		fs[7] = aFloatArray4878[13];
		return fs;
	}

	public void method5371() {
		aFloatArray4878[0] = 1.0F;
		aFloatArray4878[1] = 0.0F;
		aFloatArray4878[2] = 0.0F;
		aFloatArray4878[3] = 0.0F;
		aFloatArray4878[4] = 0.0F;
		aFloatArray4878[5] = 1.0F;
		aFloatArray4878[6] = 0.0F;
		aFloatArray4878[7] = 0.0F;
		aFloatArray4878[8] = 0.0F;
		aFloatArray4878[9] = 0.0F;
		aFloatArray4878[10] = 1.0F;
		aFloatArray4878[11] = 0.0F;
		aFloatArray4878[12] = 0.0F;
		aFloatArray4878[13] = 0.0F;
		aFloatArray4878[14] = 0.0F;
		aFloatArray4878[15] = 1.0F;
	}

	public void method5372(float f, float f_84_, float f_85_, float f_86_, float f_87_, float f_88_) {
		aFloatArray4878[0] = 2.0F / (f_84_ - f);
		aFloatArray4878[1] = 0.0F;
		aFloatArray4878[2] = 0.0F;
		aFloatArray4878[3] = 0.0F;
		aFloatArray4878[4] = 0.0F;
		aFloatArray4878[5] = 2.0F / (f_86_ - f_85_);
		aFloatArray4878[6] = 0.0F;
		aFloatArray4878[7] = 0.0F;
		aFloatArray4878[8] = 0.0F;
		aFloatArray4878[9] = 0.0F;
		aFloatArray4878[10] = 2.0F / (f_88_ - f_87_);
		aFloatArray4878[11] = 0.0F;
		aFloatArray4878[12] = -(f_84_ + f) / (f_84_ - f);
		aFloatArray4878[13] = -(f_86_ + f_85_) / (f_86_ - f_85_);
		aFloatArray4878[14] = -(f_88_ + f_87_) / (f_88_ - f_87_);
		aFloatArray4878[15] = 1.0F;
	}

	public float[] method5373(float[] fs) {
		float f = aFloatArray4878[3] - aFloatArray4878[1];
		float f_89_ = aFloatArray4878[7] - aFloatArray4878[5];
		float f_90_ = aFloatArray4878[11] - aFloatArray4878[9];
		double d = Math.sqrt((double) (f * f + f_89_ * f_89_ + f_90_ * f_90_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_89_ / d);
		fs[2] = (float) ((double) f_90_ / d);
		fs[3] = (float) ((double) (aFloatArray4878[15] - aFloatArray4878[13]) / d);
		return fs;
	}

	public void method5374() {
		float f = 1.0F / method5337();
		float f_91_ = (aFloatArray4878[5] * aFloatArray4878[10] * aFloatArray4878[15] - aFloatArray4878[5] * aFloatArray4878[11] * aFloatArray4878[14] - aFloatArray4878[6] * aFloatArray4878[9] * aFloatArray4878[15] + aFloatArray4878[6] * aFloatArray4878[11] * aFloatArray4878[13] + aFloatArray4878[7] * aFloatArray4878[9] * aFloatArray4878[14] - (aFloatArray4878[7] * aFloatArray4878[10] * aFloatArray4878[13])) * f;
		float f_92_ = (-aFloatArray4878[1] * aFloatArray4878[10] * aFloatArray4878[15] + aFloatArray4878[1] * aFloatArray4878[11] * aFloatArray4878[14] + aFloatArray4878[2] * aFloatArray4878[9] * aFloatArray4878[15] - aFloatArray4878[2] * aFloatArray4878[11] * aFloatArray4878[13] - aFloatArray4878[3] * aFloatArray4878[9] * aFloatArray4878[14] + (aFloatArray4878[3] * aFloatArray4878[10] * aFloatArray4878[13])) * f;
		float f_93_ = ((aFloatArray4878[1] * aFloatArray4878[6] * aFloatArray4878[15] - aFloatArray4878[1] * aFloatArray4878[7] * aFloatArray4878[14] - aFloatArray4878[2] * aFloatArray4878[5] * aFloatArray4878[15] + aFloatArray4878[2] * aFloatArray4878[7] * aFloatArray4878[13] + aFloatArray4878[3] * aFloatArray4878[5] * aFloatArray4878[14] - (aFloatArray4878[3] * aFloatArray4878[6] * aFloatArray4878[13])) * f);
		float f_94_ = ((-aFloatArray4878[1] * aFloatArray4878[6] * aFloatArray4878[11] + aFloatArray4878[1] * aFloatArray4878[7] * aFloatArray4878[10] + aFloatArray4878[2] * aFloatArray4878[5] * aFloatArray4878[11] - aFloatArray4878[2] * aFloatArray4878[7] * aFloatArray4878[9] - aFloatArray4878[3] * aFloatArray4878[5] * aFloatArray4878[10] + aFloatArray4878[3] * aFloatArray4878[6] * aFloatArray4878[9]) * f);
		float f_95_ = (-aFloatArray4878[4] * aFloatArray4878[10] * aFloatArray4878[15] + aFloatArray4878[4] * aFloatArray4878[11] * aFloatArray4878[14] + aFloatArray4878[6] * aFloatArray4878[8] * aFloatArray4878[15] - aFloatArray4878[6] * aFloatArray4878[11] * aFloatArray4878[12] - aFloatArray4878[7] * aFloatArray4878[8] * aFloatArray4878[14] + (aFloatArray4878[7] * aFloatArray4878[10] * aFloatArray4878[12])) * f;
		float f_96_ = (aFloatArray4878[0] * aFloatArray4878[10] * aFloatArray4878[15] - aFloatArray4878[0] * aFloatArray4878[11] * aFloatArray4878[14] - aFloatArray4878[2] * aFloatArray4878[8] * aFloatArray4878[15] + aFloatArray4878[2] * aFloatArray4878[11] * aFloatArray4878[12] + aFloatArray4878[3] * aFloatArray4878[8] * aFloatArray4878[14] - (aFloatArray4878[3] * aFloatArray4878[10] * aFloatArray4878[12])) * f;
		float f_97_ = ((-aFloatArray4878[0] * aFloatArray4878[6] * aFloatArray4878[15] + aFloatArray4878[0] * aFloatArray4878[7] * aFloatArray4878[14] + aFloatArray4878[2] * aFloatArray4878[4] * aFloatArray4878[15] - aFloatArray4878[2] * aFloatArray4878[7] * aFloatArray4878[12] - aFloatArray4878[3] * aFloatArray4878[4] * aFloatArray4878[14] + (aFloatArray4878[3] * aFloatArray4878[6] * aFloatArray4878[12])) * f);
		float f_98_ = ((aFloatArray4878[0] * aFloatArray4878[6] * aFloatArray4878[11] - aFloatArray4878[0] * aFloatArray4878[7] * aFloatArray4878[10] - aFloatArray4878[2] * aFloatArray4878[4] * aFloatArray4878[11] + aFloatArray4878[2] * aFloatArray4878[7] * aFloatArray4878[8] + aFloatArray4878[3] * aFloatArray4878[4] * aFloatArray4878[10] - aFloatArray4878[3] * aFloatArray4878[6] * aFloatArray4878[8]) * f);
		float f_99_ = (aFloatArray4878[4] * aFloatArray4878[9] * aFloatArray4878[15] - aFloatArray4878[4] * aFloatArray4878[11] * aFloatArray4878[13] - aFloatArray4878[5] * aFloatArray4878[8] * aFloatArray4878[15] + aFloatArray4878[5] * aFloatArray4878[11] * aFloatArray4878[12] + aFloatArray4878[7] * aFloatArray4878[8] * aFloatArray4878[13] - (aFloatArray4878[7] * aFloatArray4878[9] * aFloatArray4878[12])) * f;
		float f_100_ = (-aFloatArray4878[0] * aFloatArray4878[9] * aFloatArray4878[15] + aFloatArray4878[0] * aFloatArray4878[11] * aFloatArray4878[13] + aFloatArray4878[1] * aFloatArray4878[8] * aFloatArray4878[15] - aFloatArray4878[1] * aFloatArray4878[11] * aFloatArray4878[12] - aFloatArray4878[3] * aFloatArray4878[8] * aFloatArray4878[13] + (aFloatArray4878[3] * aFloatArray4878[9] * aFloatArray4878[12])) * f;
		float f_101_ = ((aFloatArray4878[0] * aFloatArray4878[5] * aFloatArray4878[15] - aFloatArray4878[0] * aFloatArray4878[7] * aFloatArray4878[13] - aFloatArray4878[1] * aFloatArray4878[4] * aFloatArray4878[15] + aFloatArray4878[1] * aFloatArray4878[7] * aFloatArray4878[12] + aFloatArray4878[3] * aFloatArray4878[4] * aFloatArray4878[13] - (aFloatArray4878[3] * aFloatArray4878[5] * aFloatArray4878[12])) * f);
		float f_102_ = ((-aFloatArray4878[0] * aFloatArray4878[5] * aFloatArray4878[11] + aFloatArray4878[0] * aFloatArray4878[7] * aFloatArray4878[9] + aFloatArray4878[1] * aFloatArray4878[4] * aFloatArray4878[11] - aFloatArray4878[1] * aFloatArray4878[7] * aFloatArray4878[8] - aFloatArray4878[3] * aFloatArray4878[4] * aFloatArray4878[9] + aFloatArray4878[3] * aFloatArray4878[5] * aFloatArray4878[8]) * f);
		float f_103_ = (-aFloatArray4878[4] * aFloatArray4878[9] * aFloatArray4878[14] + aFloatArray4878[4] * aFloatArray4878[10] * aFloatArray4878[13] + aFloatArray4878[5] * aFloatArray4878[8] * aFloatArray4878[14] - aFloatArray4878[5] * aFloatArray4878[10] * aFloatArray4878[12] - aFloatArray4878[6] * aFloatArray4878[8] * aFloatArray4878[13] + (aFloatArray4878[6] * aFloatArray4878[9] * aFloatArray4878[12])) * f;
		float f_104_ = (aFloatArray4878[0] * aFloatArray4878[9] * aFloatArray4878[14] - aFloatArray4878[0] * aFloatArray4878[10] * aFloatArray4878[13] - aFloatArray4878[1] * aFloatArray4878[8] * aFloatArray4878[14] + aFloatArray4878[1] * aFloatArray4878[10] * aFloatArray4878[12] + aFloatArray4878[2] * aFloatArray4878[8] * aFloatArray4878[13] - (aFloatArray4878[2] * aFloatArray4878[9] * aFloatArray4878[12])) * f;
		float f_105_ = ((-aFloatArray4878[0] * aFloatArray4878[5] * aFloatArray4878[14] + aFloatArray4878[0] * aFloatArray4878[6] * aFloatArray4878[13] + aFloatArray4878[1] * aFloatArray4878[4] * aFloatArray4878[14] - aFloatArray4878[1] * aFloatArray4878[6] * aFloatArray4878[12] - aFloatArray4878[2] * aFloatArray4878[4] * aFloatArray4878[13] + (aFloatArray4878[2] * aFloatArray4878[5] * aFloatArray4878[12])) * f);
		float f_106_ = ((aFloatArray4878[0] * aFloatArray4878[5] * aFloatArray4878[10] - aFloatArray4878[0] * aFloatArray4878[6] * aFloatArray4878[9] - aFloatArray4878[1] * aFloatArray4878[4] * aFloatArray4878[10] + aFloatArray4878[1] * aFloatArray4878[6] * aFloatArray4878[8] + aFloatArray4878[2] * aFloatArray4878[4] * aFloatArray4878[9] - aFloatArray4878[2] * aFloatArray4878[5] * aFloatArray4878[8]) * f);
		aFloatArray4878[0] = f_91_;
		aFloatArray4878[1] = f_92_;
		aFloatArray4878[2] = f_93_;
		aFloatArray4878[3] = f_94_;
		aFloatArray4878[4] = f_95_;
		aFloatArray4878[5] = f_96_;
		aFloatArray4878[6] = f_97_;
		aFloatArray4878[7] = f_98_;
		aFloatArray4878[8] = f_99_;
		aFloatArray4878[9] = f_100_;
		aFloatArray4878[10] = f_101_;
		aFloatArray4878[11] = f_102_;
		aFloatArray4878[12] = f_103_;
		aFloatArray4878[13] = f_104_;
		aFloatArray4878[14] = f_105_;
		aFloatArray4878[15] = f_106_;
	}

	public String method5375() {
		StringBuilder stringbuilder = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			for (int i_107_ = 0; i_107_ < 4; i_107_++) {
				if (i_107_ > 0)
					stringbuilder.append("\t");
				stringbuilder.append(aFloatArray4878[i * 4 + i_107_]);
			}
			stringbuilder.append("\n");
		}
		return stringbuilder.toString();
	}

	public void method5376() {
		float f = 1.0F / method5337();
		float f_108_ = (aFloatArray4878[5] * aFloatArray4878[10] * aFloatArray4878[15] - aFloatArray4878[5] * aFloatArray4878[11] * aFloatArray4878[14] - aFloatArray4878[6] * aFloatArray4878[9] * aFloatArray4878[15] + aFloatArray4878[6] * aFloatArray4878[11] * aFloatArray4878[13] + aFloatArray4878[7] * aFloatArray4878[9] * aFloatArray4878[14] - (aFloatArray4878[7] * aFloatArray4878[10] * aFloatArray4878[13])) * f;
		float f_109_ = (-aFloatArray4878[1] * aFloatArray4878[10] * aFloatArray4878[15] + aFloatArray4878[1] * aFloatArray4878[11] * aFloatArray4878[14] + aFloatArray4878[2] * aFloatArray4878[9] * aFloatArray4878[15] - aFloatArray4878[2] * aFloatArray4878[11] * aFloatArray4878[13] - aFloatArray4878[3] * aFloatArray4878[9] * aFloatArray4878[14] + (aFloatArray4878[3] * aFloatArray4878[10] * aFloatArray4878[13])) * f;
		float f_110_ = ((aFloatArray4878[1] * aFloatArray4878[6] * aFloatArray4878[15] - aFloatArray4878[1] * aFloatArray4878[7] * aFloatArray4878[14] - aFloatArray4878[2] * aFloatArray4878[5] * aFloatArray4878[15] + aFloatArray4878[2] * aFloatArray4878[7] * aFloatArray4878[13] + aFloatArray4878[3] * aFloatArray4878[5] * aFloatArray4878[14] - (aFloatArray4878[3] * aFloatArray4878[6] * aFloatArray4878[13])) * f);
		float f_111_ = ((-aFloatArray4878[1] * aFloatArray4878[6] * aFloatArray4878[11] + aFloatArray4878[1] * aFloatArray4878[7] * aFloatArray4878[10] + aFloatArray4878[2] * aFloatArray4878[5] * aFloatArray4878[11] - aFloatArray4878[2] * aFloatArray4878[7] * aFloatArray4878[9] - aFloatArray4878[3] * aFloatArray4878[5] * aFloatArray4878[10] + aFloatArray4878[3] * aFloatArray4878[6] * aFloatArray4878[9]) * f);
		float f_112_ = (-aFloatArray4878[4] * aFloatArray4878[10] * aFloatArray4878[15] + aFloatArray4878[4] * aFloatArray4878[11] * aFloatArray4878[14] + aFloatArray4878[6] * aFloatArray4878[8] * aFloatArray4878[15] - aFloatArray4878[6] * aFloatArray4878[11] * aFloatArray4878[12] - aFloatArray4878[7] * aFloatArray4878[8] * aFloatArray4878[14] + (aFloatArray4878[7] * aFloatArray4878[10] * aFloatArray4878[12])) * f;
		float f_113_ = (aFloatArray4878[0] * aFloatArray4878[10] * aFloatArray4878[15] - aFloatArray4878[0] * aFloatArray4878[11] * aFloatArray4878[14] - aFloatArray4878[2] * aFloatArray4878[8] * aFloatArray4878[15] + aFloatArray4878[2] * aFloatArray4878[11] * aFloatArray4878[12] + aFloatArray4878[3] * aFloatArray4878[8] * aFloatArray4878[14] - (aFloatArray4878[3] * aFloatArray4878[10] * aFloatArray4878[12])) * f;
		float f_114_ = ((-aFloatArray4878[0] * aFloatArray4878[6] * aFloatArray4878[15] + aFloatArray4878[0] * aFloatArray4878[7] * aFloatArray4878[14] + aFloatArray4878[2] * aFloatArray4878[4] * aFloatArray4878[15] - aFloatArray4878[2] * aFloatArray4878[7] * aFloatArray4878[12] - aFloatArray4878[3] * aFloatArray4878[4] * aFloatArray4878[14] + (aFloatArray4878[3] * aFloatArray4878[6] * aFloatArray4878[12])) * f);
		float f_115_ = ((aFloatArray4878[0] * aFloatArray4878[6] * aFloatArray4878[11] - aFloatArray4878[0] * aFloatArray4878[7] * aFloatArray4878[10] - aFloatArray4878[2] * aFloatArray4878[4] * aFloatArray4878[11] + aFloatArray4878[2] * aFloatArray4878[7] * aFloatArray4878[8] + aFloatArray4878[3] * aFloatArray4878[4] * aFloatArray4878[10] - aFloatArray4878[3] * aFloatArray4878[6] * aFloatArray4878[8]) * f);
		float f_116_ = (aFloatArray4878[4] * aFloatArray4878[9] * aFloatArray4878[15] - aFloatArray4878[4] * aFloatArray4878[11] * aFloatArray4878[13] - aFloatArray4878[5] * aFloatArray4878[8] * aFloatArray4878[15] + aFloatArray4878[5] * aFloatArray4878[11] * aFloatArray4878[12] + aFloatArray4878[7] * aFloatArray4878[8] * aFloatArray4878[13] - (aFloatArray4878[7] * aFloatArray4878[9] * aFloatArray4878[12])) * f;
		float f_117_ = (-aFloatArray4878[0] * aFloatArray4878[9] * aFloatArray4878[15] + aFloatArray4878[0] * aFloatArray4878[11] * aFloatArray4878[13] + aFloatArray4878[1] * aFloatArray4878[8] * aFloatArray4878[15] - aFloatArray4878[1] * aFloatArray4878[11] * aFloatArray4878[12] - aFloatArray4878[3] * aFloatArray4878[8] * aFloatArray4878[13] + (aFloatArray4878[3] * aFloatArray4878[9] * aFloatArray4878[12])) * f;
		float f_118_ = ((aFloatArray4878[0] * aFloatArray4878[5] * aFloatArray4878[15] - aFloatArray4878[0] * aFloatArray4878[7] * aFloatArray4878[13] - aFloatArray4878[1] * aFloatArray4878[4] * aFloatArray4878[15] + aFloatArray4878[1] * aFloatArray4878[7] * aFloatArray4878[12] + aFloatArray4878[3] * aFloatArray4878[4] * aFloatArray4878[13] - (aFloatArray4878[3] * aFloatArray4878[5] * aFloatArray4878[12])) * f);
		float f_119_ = ((-aFloatArray4878[0] * aFloatArray4878[5] * aFloatArray4878[11] + aFloatArray4878[0] * aFloatArray4878[7] * aFloatArray4878[9] + aFloatArray4878[1] * aFloatArray4878[4] * aFloatArray4878[11] - aFloatArray4878[1] * aFloatArray4878[7] * aFloatArray4878[8] - aFloatArray4878[3] * aFloatArray4878[4] * aFloatArray4878[9] + aFloatArray4878[3] * aFloatArray4878[5] * aFloatArray4878[8]) * f);
		float f_120_ = (-aFloatArray4878[4] * aFloatArray4878[9] * aFloatArray4878[14] + aFloatArray4878[4] * aFloatArray4878[10] * aFloatArray4878[13] + aFloatArray4878[5] * aFloatArray4878[8] * aFloatArray4878[14] - aFloatArray4878[5] * aFloatArray4878[10] * aFloatArray4878[12] - aFloatArray4878[6] * aFloatArray4878[8] * aFloatArray4878[13] + (aFloatArray4878[6] * aFloatArray4878[9] * aFloatArray4878[12])) * f;
		float f_121_ = (aFloatArray4878[0] * aFloatArray4878[9] * aFloatArray4878[14] - aFloatArray4878[0] * aFloatArray4878[10] * aFloatArray4878[13] - aFloatArray4878[1] * aFloatArray4878[8] * aFloatArray4878[14] + aFloatArray4878[1] * aFloatArray4878[10] * aFloatArray4878[12] + aFloatArray4878[2] * aFloatArray4878[8] * aFloatArray4878[13] - (aFloatArray4878[2] * aFloatArray4878[9] * aFloatArray4878[12])) * f;
		float f_122_ = ((-aFloatArray4878[0] * aFloatArray4878[5] * aFloatArray4878[14] + aFloatArray4878[0] * aFloatArray4878[6] * aFloatArray4878[13] + aFloatArray4878[1] * aFloatArray4878[4] * aFloatArray4878[14] - aFloatArray4878[1] * aFloatArray4878[6] * aFloatArray4878[12] - aFloatArray4878[2] * aFloatArray4878[4] * aFloatArray4878[13] + (aFloatArray4878[2] * aFloatArray4878[5] * aFloatArray4878[12])) * f);
		float f_123_ = ((aFloatArray4878[0] * aFloatArray4878[5] * aFloatArray4878[10] - aFloatArray4878[0] * aFloatArray4878[6] * aFloatArray4878[9] - aFloatArray4878[1] * aFloatArray4878[4] * aFloatArray4878[10] + aFloatArray4878[1] * aFloatArray4878[6] * aFloatArray4878[8] + aFloatArray4878[2] * aFloatArray4878[4] * aFloatArray4878[9] - aFloatArray4878[2] * aFloatArray4878[5] * aFloatArray4878[8]) * f);
		aFloatArray4878[0] = f_108_;
		aFloatArray4878[1] = f_109_;
		aFloatArray4878[2] = f_110_;
		aFloatArray4878[3] = f_111_;
		aFloatArray4878[4] = f_112_;
		aFloatArray4878[5] = f_113_;
		aFloatArray4878[6] = f_114_;
		aFloatArray4878[7] = f_115_;
		aFloatArray4878[8] = f_116_;
		aFloatArray4878[9] = f_117_;
		aFloatArray4878[10] = f_118_;
		aFloatArray4878[11] = f_119_;
		aFloatArray4878[12] = f_120_;
		aFloatArray4878[13] = f_121_;
		aFloatArray4878[14] = f_122_;
		aFloatArray4878[15] = f_123_;
	}

	public float[] method5377(float[] fs) {
		System.arraycopy(aFloatArray4878, 0, fs, 0, 16);
		return fs;
	}

	public void method5378() {
		aFloatArray4878[0] = 1.0F;
		aFloatArray4878[1] = 0.0F;
		aFloatArray4878[2] = 0.0F;
		aFloatArray4878[3] = 0.0F;
		aFloatArray4878[4] = 0.0F;
		aFloatArray4878[5] = 1.0F;
		aFloatArray4878[6] = 0.0F;
		aFloatArray4878[7] = 0.0F;
		aFloatArray4878[8] = 0.0F;
		aFloatArray4878[9] = 0.0F;
		aFloatArray4878[10] = 1.0F;
		aFloatArray4878[11] = 0.0F;
		aFloatArray4878[12] = 0.0F;
		aFloatArray4878[13] = 0.0F;
		aFloatArray4878[14] = 0.0F;
		aFloatArray4878[15] = 1.0F;
	}

	public boolean method5379() {
		return (aFloatArray4878[0] == 1.0F && aFloatArray4878[1] == 0.0F && aFloatArray4878[2] == 0.0F && aFloatArray4878[3] == 0.0F && aFloatArray4878[4] == 0.0F && aFloatArray4878[5] == 1.0F && aFloatArray4878[6] == 0.0F && aFloatArray4878[7] == 0.0F && aFloatArray4878[8] == 0.0F && aFloatArray4878[9] == 0.0F && aFloatArray4878[10] == 1.0F && aFloatArray4878[11] == 0.0F && aFloatArray4878[12] == 0.0F && aFloatArray4878[13] == 0.0F && aFloatArray4878[14] == 0.0F && aFloatArray4878[15] == 1.0F);
	}

	public boolean method5380() {
		return (aFloatArray4878[0] == 1.0F && aFloatArray4878[1] == 0.0F && aFloatArray4878[2] == 0.0F && aFloatArray4878[3] == 0.0F && aFloatArray4878[4] == 0.0F && aFloatArray4878[5] == 1.0F && aFloatArray4878[6] == 0.0F && aFloatArray4878[7] == 0.0F && aFloatArray4878[8] == 0.0F && aFloatArray4878[9] == 0.0F && aFloatArray4878[10] == 1.0F && aFloatArray4878[11] == 0.0F && aFloatArray4878[12] == 0.0F && aFloatArray4878[13] == 0.0F && aFloatArray4878[14] == 0.0F && aFloatArray4878[15] == 1.0F);
	}

	public boolean method5381() {
		return (aFloatArray4878[0] == 1.0F && aFloatArray4878[1] == 0.0F && aFloatArray4878[2] == 0.0F && aFloatArray4878[3] == 0.0F && aFloatArray4878[4] == 0.0F && aFloatArray4878[5] == 1.0F && aFloatArray4878[6] == 0.0F && aFloatArray4878[7] == 0.0F && aFloatArray4878[8] == 0.0F && aFloatArray4878[9] == 0.0F && aFloatArray4878[10] == 1.0F && aFloatArray4878[11] == 0.0F && aFloatArray4878[12] == 0.0F && aFloatArray4878[13] == 0.0F && aFloatArray4878[14] == 0.0F && aFloatArray4878[15] == 1.0F);
	}

	public boolean method5382() {
		return (aFloatArray4878[0] == 1.0F && aFloatArray4878[1] == 0.0F && aFloatArray4878[2] == 0.0F && aFloatArray4878[3] == 0.0F && aFloatArray4878[4] == 0.0F && aFloatArray4878[5] == 1.0F && aFloatArray4878[6] == 0.0F && aFloatArray4878[7] == 0.0F && aFloatArray4878[8] == 0.0F && aFloatArray4878[9] == 0.0F && aFloatArray4878[10] == 1.0F && aFloatArray4878[11] == 0.0F && aFloatArray4878[12] == 0.0F && aFloatArray4878[13] == 0.0F && aFloatArray4878[14] == 0.0F && aFloatArray4878[15] == 1.0F);
	}

	public void method5383(Class443 class443_124_, Class443 class443_125_) {
		float f = ((class443_124_.aFloatArray4878[0] * class443_125_.aFloatArray4878[0]) + (class443_124_.aFloatArray4878[1] * class443_125_.aFloatArray4878[4]) + (class443_124_.aFloatArray4878[2] * class443_125_.aFloatArray4878[8]) + (class443_124_.aFloatArray4878[3] * class443_125_.aFloatArray4878[12]));
		float f_126_ = ((class443_124_.aFloatArray4878[0] * class443_125_.aFloatArray4878[1]) + (class443_124_.aFloatArray4878[1] * class443_125_.aFloatArray4878[5]) + (class443_124_.aFloatArray4878[2] * class443_125_.aFloatArray4878[9]) + (class443_124_.aFloatArray4878[3] * class443_125_.aFloatArray4878[13]));
		float f_127_ = ((class443_124_.aFloatArray4878[0] * class443_125_.aFloatArray4878[2]) + (class443_124_.aFloatArray4878[1] * class443_125_.aFloatArray4878[6]) + (class443_124_.aFloatArray4878[2] * class443_125_.aFloatArray4878[10]) + (class443_124_.aFloatArray4878[3] * class443_125_.aFloatArray4878[14]));
		float f_128_ = ((class443_124_.aFloatArray4878[0] * class443_125_.aFloatArray4878[3]) + (class443_124_.aFloatArray4878[1] * class443_125_.aFloatArray4878[7]) + (class443_124_.aFloatArray4878[2] * class443_125_.aFloatArray4878[11]) + (class443_124_.aFloatArray4878[3] * class443_125_.aFloatArray4878[15]));
		float f_129_ = ((class443_124_.aFloatArray4878[4] * class443_125_.aFloatArray4878[0]) + (class443_124_.aFloatArray4878[5] * class443_125_.aFloatArray4878[4]) + (class443_124_.aFloatArray4878[6] * class443_125_.aFloatArray4878[8]) + (class443_124_.aFloatArray4878[7] * class443_125_.aFloatArray4878[12]));
		float f_130_ = ((class443_124_.aFloatArray4878[4] * class443_125_.aFloatArray4878[1]) + (class443_124_.aFloatArray4878[5] * class443_125_.aFloatArray4878[5]) + (class443_124_.aFloatArray4878[6] * class443_125_.aFloatArray4878[9]) + (class443_124_.aFloatArray4878[7] * class443_125_.aFloatArray4878[13]));
		float f_131_ = ((class443_124_.aFloatArray4878[4] * class443_125_.aFloatArray4878[2]) + (class443_124_.aFloatArray4878[5] * class443_125_.aFloatArray4878[6]) + (class443_124_.aFloatArray4878[6] * class443_125_.aFloatArray4878[10]) + (class443_124_.aFloatArray4878[7] * class443_125_.aFloatArray4878[14]));
		float f_132_ = ((class443_124_.aFloatArray4878[4] * class443_125_.aFloatArray4878[3]) + (class443_124_.aFloatArray4878[5] * class443_125_.aFloatArray4878[7]) + (class443_124_.aFloatArray4878[6] * class443_125_.aFloatArray4878[11]) + (class443_124_.aFloatArray4878[7] * class443_125_.aFloatArray4878[15]));
		float f_133_ = ((class443_124_.aFloatArray4878[8] * class443_125_.aFloatArray4878[0]) + (class443_124_.aFloatArray4878[9] * class443_125_.aFloatArray4878[4]) + (class443_124_.aFloatArray4878[10] * class443_125_.aFloatArray4878[8]) + (class443_124_.aFloatArray4878[11] * class443_125_.aFloatArray4878[12]));
		float f_134_ = ((class443_124_.aFloatArray4878[8] * class443_125_.aFloatArray4878[1]) + (class443_124_.aFloatArray4878[9] * class443_125_.aFloatArray4878[5]) + (class443_124_.aFloatArray4878[10] * class443_125_.aFloatArray4878[9]) + (class443_124_.aFloatArray4878[11] * class443_125_.aFloatArray4878[13]));
		float f_135_ = ((class443_124_.aFloatArray4878[8] * class443_125_.aFloatArray4878[2]) + (class443_124_.aFloatArray4878[9] * class443_125_.aFloatArray4878[6]) + (class443_124_.aFloatArray4878[10] * class443_125_.aFloatArray4878[10]) + (class443_124_.aFloatArray4878[11] * class443_125_.aFloatArray4878[14]));
		float f_136_ = ((class443_124_.aFloatArray4878[8] * class443_125_.aFloatArray4878[3]) + (class443_124_.aFloatArray4878[9] * class443_125_.aFloatArray4878[7]) + (class443_124_.aFloatArray4878[10] * class443_125_.aFloatArray4878[11]) + (class443_124_.aFloatArray4878[11] * class443_125_.aFloatArray4878[15]));
		float f_137_ = ((class443_124_.aFloatArray4878[12] * class443_125_.aFloatArray4878[0]) + (class443_124_.aFloatArray4878[13] * class443_125_.aFloatArray4878[4]) + (class443_124_.aFloatArray4878[14] * class443_125_.aFloatArray4878[8]) + (class443_124_.aFloatArray4878[15] * class443_125_.aFloatArray4878[12]));
		float f_138_ = ((class443_124_.aFloatArray4878[12] * class443_125_.aFloatArray4878[1]) + (class443_124_.aFloatArray4878[13] * class443_125_.aFloatArray4878[5]) + (class443_124_.aFloatArray4878[14] * class443_125_.aFloatArray4878[9]) + (class443_124_.aFloatArray4878[15] * class443_125_.aFloatArray4878[13]));
		float f_139_ = ((class443_124_.aFloatArray4878[12] * class443_125_.aFloatArray4878[2]) + (class443_124_.aFloatArray4878[13] * class443_125_.aFloatArray4878[6]) + (class443_124_.aFloatArray4878[14] * class443_125_.aFloatArray4878[10]) + (class443_124_.aFloatArray4878[15] * class443_125_.aFloatArray4878[14]));
		float f_140_ = ((class443_124_.aFloatArray4878[12] * class443_125_.aFloatArray4878[3]) + (class443_124_.aFloatArray4878[13] * class443_125_.aFloatArray4878[7]) + (class443_124_.aFloatArray4878[14] * class443_125_.aFloatArray4878[11]) + (class443_124_.aFloatArray4878[15] * class443_125_.aFloatArray4878[15]));
		aFloatArray4878[0] = f;
		aFloatArray4878[1] = f_126_;
		aFloatArray4878[2] = f_127_;
		aFloatArray4878[3] = f_128_;
		aFloatArray4878[4] = f_129_;
		aFloatArray4878[5] = f_130_;
		aFloatArray4878[6] = f_131_;
		aFloatArray4878[7] = f_132_;
		aFloatArray4878[8] = f_133_;
		aFloatArray4878[9] = f_134_;
		aFloatArray4878[10] = f_135_;
		aFloatArray4878[11] = f_136_;
		aFloatArray4878[12] = f_137_;
		aFloatArray4878[13] = f_138_;
		aFloatArray4878[14] = f_139_;
		aFloatArray4878[15] = f_140_;
	}

	public void method5384(float f, float f_141_, float f_142_, float[] fs) {
		fs[0] = (aFloatArray4878[0] * f + aFloatArray4878[4] * f_141_ + aFloatArray4878[8] * f_142_ + aFloatArray4878[12]);
		fs[1] = (aFloatArray4878[1] * f + aFloatArray4878[5] * f_141_ + aFloatArray4878[9] * f_142_ + aFloatArray4878[13]);
		fs[2] = (aFloatArray4878[2] * f + aFloatArray4878[6] * f_141_ + aFloatArray4878[10] * f_142_ + aFloatArray4878[14]);
		if (fs.length > 3)
			fs[3] = (aFloatArray4878[3] * f + aFloatArray4878[7] * f_141_ + aFloatArray4878[11] * f_142_ + aFloatArray4878[15]);
	}

	public void method5385(float[] fs) {
		float f = fs[0];
		float f_143_ = fs[1];
		float f_144_ = fs[2];
		fs[0] = (aFloatArray4878[0] * f + aFloatArray4878[4] * f_143_ + aFloatArray4878[8] * f_144_ + aFloatArray4878[12]);
		fs[1] = (aFloatArray4878[1] * f + aFloatArray4878[5] * f_143_ + aFloatArray4878[9] * f_144_ + aFloatArray4878[13]);
		fs[2] = (aFloatArray4878[2] * f + aFloatArray4878[6] * f_143_ + aFloatArray4878[10] * f_144_ + aFloatArray4878[14]);
	}

	public String method5386() {
		StringBuilder stringbuilder = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			for (int i_145_ = 0; i_145_ < 4; i_145_++) {
				if (i_145_ > 0)
					stringbuilder.append("\t");
				stringbuilder.append(aFloatArray4878[i * 4 + i_145_]);
			}
			stringbuilder.append("\n");
		}
		return stringbuilder.toString();
	}

	void method5387(float f, float f_146_, float f_147_, float f_148_, float f_149_, float f_150_) {
		aFloatArray4878[0] = 2.0F * f_149_ / (f_146_ - f);
		aFloatArray4878[1] = 0.0F;
		aFloatArray4878[2] = 0.0F;
		aFloatArray4878[3] = 0.0F;
		aFloatArray4878[4] = 0.0F;
		aFloatArray4878[5] = 2.0F * f_149_ / (f_148_ - f_147_);
		aFloatArray4878[6] = 0.0F;
		aFloatArray4878[7] = 0.0F;
		aFloatArray4878[8] = (f_146_ + f) / (f_146_ - f);
		aFloatArray4878[9] = (f_148_ + f_147_) / (f_148_ - f_147_);
		aFloatArray4878[10] = (f_150_ + f_149_) / (f_150_ - f_149_);
		aFloatArray4878[11] = 1.0F;
		aFloatArray4878[12] = 0.0F;
		aFloatArray4878[13] = 0.0F;
		aFloatArray4878[14] = -(2.0F * f_150_ * f_149_) / (f_150_ - f_149_);
		aFloatArray4878[15] = 0.0F;
	}

	public void method5388(float f, float f_151_, float f_152_, float f_153_, float f_154_, float f_155_, float f_156_, float f_157_, float f_158_) {
		method5372(-(f * f_158_) / f_152_, f_158_ * (f_156_ - f) / f_152_, -(f_151_ * f_158_) / f_153_, f_158_ * (f_157_ - f_151_) / f_153_, f_154_, f_155_);
	}

	public void method5389() {
		aFloatArray4878[0] = 1.0F;
		aFloatArray4878[1] = 0.0F;
		aFloatArray4878[2] = 0.0F;
		aFloatArray4878[3] = 0.0F;
		aFloatArray4878[4] = 0.0F;
		aFloatArray4878[5] = 1.0F;
		aFloatArray4878[6] = 0.0F;
		aFloatArray4878[7] = 0.0F;
		aFloatArray4878[8] = 0.0F;
		aFloatArray4878[9] = 0.0F;
		aFloatArray4878[10] = 1.0F;
		aFloatArray4878[11] = 0.0F;
		aFloatArray4878[12] = 0.0F;
		aFloatArray4878[13] = 0.0F;
		aFloatArray4878[14] = 0.0F;
		aFloatArray4878[15] = 1.0F;
	}

	public void method5390(Class443 class443_159_) {
		float f = (aFloatArray4878[0] * class443_159_.aFloatArray4878[0] + aFloatArray4878[1] * class443_159_.aFloatArray4878[4] + aFloatArray4878[2] * class443_159_.aFloatArray4878[8] + aFloatArray4878[3] * class443_159_.aFloatArray4878[12]);
		float f_160_ = (aFloatArray4878[0] * class443_159_.aFloatArray4878[1] + aFloatArray4878[1] * class443_159_.aFloatArray4878[5] + aFloatArray4878[2] * class443_159_.aFloatArray4878[9] + aFloatArray4878[3] * class443_159_.aFloatArray4878[13]);
		float f_161_ = (aFloatArray4878[0] * class443_159_.aFloatArray4878[2] + aFloatArray4878[1] * class443_159_.aFloatArray4878[6] + aFloatArray4878[2] * class443_159_.aFloatArray4878[10] + aFloatArray4878[3] * class443_159_.aFloatArray4878[14]);
		float f_162_ = (aFloatArray4878[0] * class443_159_.aFloatArray4878[3] + aFloatArray4878[1] * class443_159_.aFloatArray4878[7] + aFloatArray4878[2] * class443_159_.aFloatArray4878[11] + aFloatArray4878[3] * class443_159_.aFloatArray4878[15]);
		float f_163_ = (aFloatArray4878[4] * class443_159_.aFloatArray4878[0] + aFloatArray4878[5] * class443_159_.aFloatArray4878[4] + aFloatArray4878[6] * class443_159_.aFloatArray4878[8] + aFloatArray4878[7] * class443_159_.aFloatArray4878[12]);
		float f_164_ = (aFloatArray4878[4] * class443_159_.aFloatArray4878[1] + aFloatArray4878[5] * class443_159_.aFloatArray4878[5] + aFloatArray4878[6] * class443_159_.aFloatArray4878[9] + aFloatArray4878[7] * class443_159_.aFloatArray4878[13]);
		float f_165_ = (aFloatArray4878[4] * class443_159_.aFloatArray4878[2] + aFloatArray4878[5] * class443_159_.aFloatArray4878[6] + aFloatArray4878[6] * class443_159_.aFloatArray4878[10] + aFloatArray4878[7] * class443_159_.aFloatArray4878[14]);
		float f_166_ = (aFloatArray4878[4] * class443_159_.aFloatArray4878[3] + aFloatArray4878[5] * class443_159_.aFloatArray4878[7] + aFloatArray4878[6] * class443_159_.aFloatArray4878[11] + aFloatArray4878[7] * class443_159_.aFloatArray4878[15]);
		float f_167_ = (aFloatArray4878[8] * class443_159_.aFloatArray4878[0] + aFloatArray4878[9] * class443_159_.aFloatArray4878[4] + aFloatArray4878[10] * class443_159_.aFloatArray4878[8] + aFloatArray4878[11] * class443_159_.aFloatArray4878[12]);
		float f_168_ = (aFloatArray4878[8] * class443_159_.aFloatArray4878[1] + aFloatArray4878[9] * class443_159_.aFloatArray4878[5] + aFloatArray4878[10] * class443_159_.aFloatArray4878[9] + aFloatArray4878[11] * class443_159_.aFloatArray4878[13]);
		float f_169_ = (aFloatArray4878[8] * class443_159_.aFloatArray4878[2] + aFloatArray4878[9] * class443_159_.aFloatArray4878[6] + aFloatArray4878[10] * class443_159_.aFloatArray4878[10] + aFloatArray4878[11] * class443_159_.aFloatArray4878[14]);
		float f_170_ = (aFloatArray4878[8] * class443_159_.aFloatArray4878[3] + aFloatArray4878[9] * class443_159_.aFloatArray4878[7] + aFloatArray4878[10] * class443_159_.aFloatArray4878[11] + aFloatArray4878[11] * class443_159_.aFloatArray4878[15]);
		float f_171_ = (aFloatArray4878[12] * class443_159_.aFloatArray4878[0] + aFloatArray4878[13] * class443_159_.aFloatArray4878[4] + aFloatArray4878[14] * class443_159_.aFloatArray4878[8] + aFloatArray4878[15] * class443_159_.aFloatArray4878[12]);
		float f_172_ = (aFloatArray4878[12] * class443_159_.aFloatArray4878[1] + aFloatArray4878[13] * class443_159_.aFloatArray4878[5] + aFloatArray4878[14] * class443_159_.aFloatArray4878[9] + aFloatArray4878[15] * class443_159_.aFloatArray4878[13]);
		float f_173_ = (aFloatArray4878[12] * class443_159_.aFloatArray4878[2] + aFloatArray4878[13] * class443_159_.aFloatArray4878[6] + aFloatArray4878[14] * class443_159_.aFloatArray4878[10] + aFloatArray4878[15] * class443_159_.aFloatArray4878[14]);
		float f_174_ = (aFloatArray4878[12] * class443_159_.aFloatArray4878[3] + aFloatArray4878[13] * class443_159_.aFloatArray4878[7] + aFloatArray4878[14] * class443_159_.aFloatArray4878[11] + aFloatArray4878[15] * class443_159_.aFloatArray4878[15]);
		aFloatArray4878[0] = f;
		aFloatArray4878[1] = f_160_;
		aFloatArray4878[2] = f_161_;
		aFloatArray4878[3] = f_162_;
		aFloatArray4878[4] = f_163_;
		aFloatArray4878[5] = f_164_;
		aFloatArray4878[6] = f_165_;
		aFloatArray4878[7] = f_166_;
		aFloatArray4878[8] = f_167_;
		aFloatArray4878[9] = f_168_;
		aFloatArray4878[10] = f_169_;
		aFloatArray4878[11] = f_170_;
		aFloatArray4878[12] = f_171_;
		aFloatArray4878[13] = f_172_;
		aFloatArray4878[14] = f_173_;
		aFloatArray4878[15] = f_174_;
	}

	public Class443(Class443 class443_175_) {
		aFloatArray4878 = new float[16];
		method5339(class443_175_);
	}

	public int method5391() {
		int i = 1;
		i = 31 * i + Arrays.hashCode(aFloatArray4878);
		return i;
	}
}
