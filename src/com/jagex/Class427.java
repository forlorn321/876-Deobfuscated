/* Class427 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Arrays;

public final class Class427 {
	public float[] aFloatArray4807;
	public static Class427 aClass427_4808 = new Class427();

	float method6735() {
		return ((aFloatArray4807[0] * aFloatArray4807[5] * aFloatArray4807[10] * aFloatArray4807[15]) - (aFloatArray4807[0] * aFloatArray4807[5] * aFloatArray4807[11] * aFloatArray4807[14]) - (aFloatArray4807[0] * aFloatArray4807[6] * aFloatArray4807[9] * aFloatArray4807[15]) + (aFloatArray4807[0] * aFloatArray4807[6] * aFloatArray4807[11] * aFloatArray4807[13]) + (aFloatArray4807[0] * aFloatArray4807[7] * aFloatArray4807[9] * aFloatArray4807[14])
				- (aFloatArray4807[0] * aFloatArray4807[7] * aFloatArray4807[10] * aFloatArray4807[13]) - (aFloatArray4807[1] * aFloatArray4807[4] * aFloatArray4807[10] * aFloatArray4807[15]) + (aFloatArray4807[1] * aFloatArray4807[4] * aFloatArray4807[11] * aFloatArray4807[14]) + (aFloatArray4807[1] * aFloatArray4807[6] * aFloatArray4807[8] * aFloatArray4807[15]) - (aFloatArray4807[1] * aFloatArray4807[6] * aFloatArray4807[11] * aFloatArray4807[12])
				- (aFloatArray4807[1] * aFloatArray4807[7] * aFloatArray4807[8] * aFloatArray4807[14]) + (aFloatArray4807[1] * aFloatArray4807[7] * aFloatArray4807[10] * aFloatArray4807[12]) + (aFloatArray4807[2] * aFloatArray4807[4] * aFloatArray4807[9] * aFloatArray4807[15]) - (aFloatArray4807[2] * aFloatArray4807[4] * aFloatArray4807[11] * aFloatArray4807[13]) - (aFloatArray4807[2] * aFloatArray4807[5] * aFloatArray4807[8] * aFloatArray4807[15])
				+ (aFloatArray4807[2] * aFloatArray4807[5] * aFloatArray4807[11] * aFloatArray4807[12]) + (aFloatArray4807[2] * aFloatArray4807[7] * aFloatArray4807[8] * aFloatArray4807[13]) - (aFloatArray4807[2] * aFloatArray4807[7] * aFloatArray4807[9] * aFloatArray4807[12]) - (aFloatArray4807[3] * aFloatArray4807[4] * aFloatArray4807[9] * aFloatArray4807[14]) + (aFloatArray4807[3] * aFloatArray4807[4] * aFloatArray4807[10] * aFloatArray4807[13])
				+ (aFloatArray4807[3] * aFloatArray4807[5] * aFloatArray4807[8] * aFloatArray4807[14]) - (aFloatArray4807[3] * aFloatArray4807[5] * aFloatArray4807[10] * aFloatArray4807[12]) - (aFloatArray4807[3] * aFloatArray4807[6] * aFloatArray4807[8] * aFloatArray4807[13]) + (aFloatArray4807[3] * aFloatArray4807[6] * aFloatArray4807[9] * aFloatArray4807[12]));
	}

	public Class427(Class427 class427_0_) {
		aFloatArray4807 = new float[16];
		method6750(class427_0_);
	}

	public float[] method6736(float[] fs) {
		float f = aFloatArray4807[3] - aFloatArray4807[2];
		float f_1_ = aFloatArray4807[7] - aFloatArray4807[6];
		float f_2_ = aFloatArray4807[11] - aFloatArray4807[10];
		double d = Math.sqrt((double) (f * f + f_1_ * f_1_ + f_2_ * f_2_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_1_ / d);
		fs[2] = (float) ((double) f_2_ / d);
		fs[3] = (float) ((double) (aFloatArray4807[15] - aFloatArray4807[14]) / d);
		return fs;
	}

	public void method6737(Class432 class432) {
		aFloatArray4807[0] = class432.aFloat4862;
		aFloatArray4807[1] = class432.aFloat4854;
		aFloatArray4807[2] = class432.aFloat4858;
		aFloatArray4807[3] = 0.0F;
		aFloatArray4807[4] = class432.aFloat4856;
		aFloatArray4807[5] = class432.aFloat4857;
		aFloatArray4807[6] = class432.aFloat4860;
		aFloatArray4807[7] = 0.0F;
		aFloatArray4807[8] = class432.aFloat4859;
		aFloatArray4807[9] = class432.aFloat4861;
		aFloatArray4807[10] = class432.aFloat4855;
		aFloatArray4807[11] = 0.0F;
		aFloatArray4807[12] = class432.aFloat4852;
		aFloatArray4807[13] = class432.aFloat4863;
		aFloatArray4807[14] = class432.aFloat4864;
		aFloatArray4807[15] = 1.0F;
	}

	public int hashCode() {
		int i = 1;
		i = 31 * i + Arrays.hashCode(aFloatArray4807);
		return i;
	}

	public void method6738(float f, float f_3_, float f_4_, float f_5_) {
		float f_6_ = (float) (Math.tan((double) (f_4_ / 2.0F)) * (double) f);
		float f_7_ = (float) (Math.tan((double) (f_5_ / 2.0F)) * (double) f);
		method6785(-f_6_, f_6_, -f_7_, f_7_, f, f_3_);
	}

	public void method6739(Class427 class427_8_, Class427 class427_9_) {
		float f = (class427_8_.aFloatArray4807[0] * class427_9_.aFloatArray4807[0] + (class427_8_.aFloatArray4807[1] * class427_9_.aFloatArray4807[4]) + (class427_8_.aFloatArray4807[2] * class427_9_.aFloatArray4807[8]) + (class427_8_.aFloatArray4807[3] * class427_9_.aFloatArray4807[12]));
		float f_10_ = (class427_8_.aFloatArray4807[0] * class427_9_.aFloatArray4807[1] + (class427_8_.aFloatArray4807[1] * class427_9_.aFloatArray4807[5]) + (class427_8_.aFloatArray4807[2] * class427_9_.aFloatArray4807[9]) + (class427_8_.aFloatArray4807[3] * class427_9_.aFloatArray4807[13]));
		float f_11_ = (class427_8_.aFloatArray4807[0] * class427_9_.aFloatArray4807[2] + (class427_8_.aFloatArray4807[1] * class427_9_.aFloatArray4807[6]) + (class427_8_.aFloatArray4807[2] * class427_9_.aFloatArray4807[10]) + (class427_8_.aFloatArray4807[3] * class427_9_.aFloatArray4807[14]));
		float f_12_ = (class427_8_.aFloatArray4807[0] * class427_9_.aFloatArray4807[3] + (class427_8_.aFloatArray4807[1] * class427_9_.aFloatArray4807[7]) + (class427_8_.aFloatArray4807[2] * class427_9_.aFloatArray4807[11]) + (class427_8_.aFloatArray4807[3] * class427_9_.aFloatArray4807[15]));
		float f_13_ = (class427_8_.aFloatArray4807[4] * class427_9_.aFloatArray4807[0] + (class427_8_.aFloatArray4807[5] * class427_9_.aFloatArray4807[4]) + (class427_8_.aFloatArray4807[6] * class427_9_.aFloatArray4807[8]) + (class427_8_.aFloatArray4807[7] * class427_9_.aFloatArray4807[12]));
		float f_14_ = (class427_8_.aFloatArray4807[4] * class427_9_.aFloatArray4807[1] + (class427_8_.aFloatArray4807[5] * class427_9_.aFloatArray4807[5]) + (class427_8_.aFloatArray4807[6] * class427_9_.aFloatArray4807[9]) + (class427_8_.aFloatArray4807[7] * class427_9_.aFloatArray4807[13]));
		float f_15_ = (class427_8_.aFloatArray4807[4] * class427_9_.aFloatArray4807[2] + (class427_8_.aFloatArray4807[5] * class427_9_.aFloatArray4807[6]) + (class427_8_.aFloatArray4807[6] * class427_9_.aFloatArray4807[10]) + (class427_8_.aFloatArray4807[7] * class427_9_.aFloatArray4807[14]));
		float f_16_ = (class427_8_.aFloatArray4807[4] * class427_9_.aFloatArray4807[3] + (class427_8_.aFloatArray4807[5] * class427_9_.aFloatArray4807[7]) + (class427_8_.aFloatArray4807[6] * class427_9_.aFloatArray4807[11]) + (class427_8_.aFloatArray4807[7] * class427_9_.aFloatArray4807[15]));
		float f_17_ = (class427_8_.aFloatArray4807[8] * class427_9_.aFloatArray4807[0] + (class427_8_.aFloatArray4807[9] * class427_9_.aFloatArray4807[4]) + (class427_8_.aFloatArray4807[10] * class427_9_.aFloatArray4807[8]) + (class427_8_.aFloatArray4807[11] * class427_9_.aFloatArray4807[12]));
		float f_18_ = (class427_8_.aFloatArray4807[8] * class427_9_.aFloatArray4807[1] + (class427_8_.aFloatArray4807[9] * class427_9_.aFloatArray4807[5]) + (class427_8_.aFloatArray4807[10] * class427_9_.aFloatArray4807[9]) + (class427_8_.aFloatArray4807[11] * class427_9_.aFloatArray4807[13]));
		float f_19_ = (class427_8_.aFloatArray4807[8] * class427_9_.aFloatArray4807[2] + (class427_8_.aFloatArray4807[9] * class427_9_.aFloatArray4807[6]) + (class427_8_.aFloatArray4807[10] * class427_9_.aFloatArray4807[10]) + (class427_8_.aFloatArray4807[11] * class427_9_.aFloatArray4807[14]));
		float f_20_ = (class427_8_.aFloatArray4807[8] * class427_9_.aFloatArray4807[3] + (class427_8_.aFloatArray4807[9] * class427_9_.aFloatArray4807[7]) + (class427_8_.aFloatArray4807[10] * class427_9_.aFloatArray4807[11]) + (class427_8_.aFloatArray4807[11] * class427_9_.aFloatArray4807[15]));
		float f_21_ = (class427_8_.aFloatArray4807[12] * class427_9_.aFloatArray4807[0] + (class427_8_.aFloatArray4807[13] * class427_9_.aFloatArray4807[4]) + (class427_8_.aFloatArray4807[14] * class427_9_.aFloatArray4807[8]) + (class427_8_.aFloatArray4807[15] * class427_9_.aFloatArray4807[12]));
		float f_22_ = (class427_8_.aFloatArray4807[12] * class427_9_.aFloatArray4807[1] + (class427_8_.aFloatArray4807[13] * class427_9_.aFloatArray4807[5]) + (class427_8_.aFloatArray4807[14] * class427_9_.aFloatArray4807[9]) + (class427_8_.aFloatArray4807[15] * class427_9_.aFloatArray4807[13]));
		float f_23_ = (class427_8_.aFloatArray4807[12] * class427_9_.aFloatArray4807[2] + (class427_8_.aFloatArray4807[13] * class427_9_.aFloatArray4807[6]) + (class427_8_.aFloatArray4807[14] * class427_9_.aFloatArray4807[10]) + (class427_8_.aFloatArray4807[15] * class427_9_.aFloatArray4807[14]));
		float f_24_ = (class427_8_.aFloatArray4807[12] * class427_9_.aFloatArray4807[3] + (class427_8_.aFloatArray4807[13] * class427_9_.aFloatArray4807[7]) + (class427_8_.aFloatArray4807[14] * class427_9_.aFloatArray4807[11]) + (class427_8_.aFloatArray4807[15] * class427_9_.aFloatArray4807[15]));
		aFloatArray4807[0] = f;
		aFloatArray4807[1] = f_10_;
		aFloatArray4807[2] = f_11_;
		aFloatArray4807[3] = f_12_;
		aFloatArray4807[4] = f_13_;
		aFloatArray4807[5] = f_14_;
		aFloatArray4807[6] = f_15_;
		aFloatArray4807[7] = f_16_;
		aFloatArray4807[8] = f_17_;
		aFloatArray4807[9] = f_18_;
		aFloatArray4807[10] = f_19_;
		aFloatArray4807[11] = f_20_;
		aFloatArray4807[12] = f_21_;
		aFloatArray4807[13] = f_22_;
		aFloatArray4807[14] = f_23_;
		aFloatArray4807[15] = f_24_;
	}

	public float[] method6740(float[] fs) {
		float f = aFloatArray4807[3] + aFloatArray4807[0];
		float f_25_ = aFloatArray4807[7] + aFloatArray4807[4];
		float f_26_ = aFloatArray4807[11] + aFloatArray4807[8];
		double d = Math.sqrt((double) (f * f + f_25_ * f_25_ + f_26_ * f_26_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_25_ / d);
		fs[2] = (float) ((double) f_26_ / d);
		fs[3] = (float) ((double) (aFloatArray4807[15] + aFloatArray4807[12]) / d);
		return fs;
	}

	public void method6741() {
		aFloatArray4807[0] = 1.0F;
		aFloatArray4807[1] = 0.0F;
		aFloatArray4807[2] = 0.0F;
		aFloatArray4807[3] = 0.0F;
		aFloatArray4807[4] = 0.0F;
		aFloatArray4807[5] = 1.0F;
		aFloatArray4807[6] = 0.0F;
		aFloatArray4807[7] = 0.0F;
		aFloatArray4807[8] = 0.0F;
		aFloatArray4807[9] = 0.0F;
		aFloatArray4807[10] = 1.0F;
		aFloatArray4807[11] = 0.0F;
		aFloatArray4807[12] = 0.0F;
		aFloatArray4807[13] = 0.0F;
		aFloatArray4807[14] = 0.0F;
		aFloatArray4807[15] = 1.0F;
	}

	public void method6742() {
		aFloatArray4807[0] = 1.0F;
		aFloatArray4807[1] = 0.0F;
		aFloatArray4807[2] = 0.0F;
		aFloatArray4807[3] = 0.0F;
		aFloatArray4807[4] = 0.0F;
		aFloatArray4807[5] = 1.0F;
		aFloatArray4807[6] = 0.0F;
		aFloatArray4807[7] = 0.0F;
		aFloatArray4807[8] = 0.0F;
		aFloatArray4807[9] = 0.0F;
		aFloatArray4807[10] = 1.0F;
		aFloatArray4807[11] = 0.0F;
		aFloatArray4807[12] = 0.0F;
		aFloatArray4807[13] = 0.0F;
		aFloatArray4807[14] = 0.0F;
		aFloatArray4807[15] = 1.0F;
	}

	public float[] method6743(float[] fs) {
		float f = aFloatArray4807[3] + aFloatArray4807[1];
		float f_27_ = aFloatArray4807[7] + aFloatArray4807[5];
		float f_28_ = aFloatArray4807[11] + aFloatArray4807[9];
		double d = Math.sqrt((double) (f * f + f_27_ * f_27_ + f_28_ * f_28_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_27_ / d);
		fs[2] = (float) ((double) f_28_ / d);
		fs[3] = (float) ((double) (aFloatArray4807[15] + aFloatArray4807[13]) / d);
		return fs;
	}

	public boolean method6744() {
		return (aFloatArray4807[0] == 1.0F && aFloatArray4807[1] == 0.0F && aFloatArray4807[2] == 0.0F && aFloatArray4807[3] == 0.0F && aFloatArray4807[4] == 0.0F && aFloatArray4807[5] == 1.0F && aFloatArray4807[6] == 0.0F && aFloatArray4807[7] == 0.0F && aFloatArray4807[8] == 0.0F && aFloatArray4807[9] == 0.0F && aFloatArray4807[10] == 1.0F && aFloatArray4807[11] == 0.0F && aFloatArray4807[12] == 0.0F && aFloatArray4807[13] == 0.0F && aFloatArray4807[14] == 0.0F && aFloatArray4807[15] == 1.0F);
	}

	public float[] method6745(float[] fs) {
		fs[0] = aFloatArray4807[0];
		fs[1] = aFloatArray4807[4];
		fs[2] = aFloatArray4807[8];
		fs[3] = aFloatArray4807[12];
		fs[4] = aFloatArray4807[1];
		fs[5] = aFloatArray4807[5];
		fs[6] = aFloatArray4807[9];
		fs[7] = aFloatArray4807[13];
		fs[8] = aFloatArray4807[2];
		fs[9] = aFloatArray4807[6];
		fs[10] = aFloatArray4807[10];
		fs[11] = aFloatArray4807[14];
		fs[12] = aFloatArray4807[3];
		fs[13] = aFloatArray4807[7];
		fs[14] = aFloatArray4807[11];
		fs[15] = aFloatArray4807[15];
		return fs;
	}

	public void method6746(float[] fs) {
		float f = fs[0];
		float f_29_ = fs[1];
		float f_30_ = fs[2];
		fs[0] = (aFloatArray4807[0] * f + aFloatArray4807[4] * f_29_ + aFloatArray4807[8] * f_30_ + aFloatArray4807[12]);
		fs[1] = (aFloatArray4807[1] * f + aFloatArray4807[5] * f_29_ + aFloatArray4807[9] * f_30_ + aFloatArray4807[13]);
		fs[2] = (aFloatArray4807[2] * f + aFloatArray4807[6] * f_29_ + aFloatArray4807[10] * f_30_ + aFloatArray4807[14]);
	}

	public void method6747(float f, float f_31_, float f_32_, float[] fs) {
		fs[0] = (aFloatArray4807[0] * f + aFloatArray4807[4] * f_31_ + aFloatArray4807[8] * f_32_);
		fs[1] = (aFloatArray4807[1] * f + aFloatArray4807[5] * f_31_ + aFloatArray4807[9] * f_32_);
		fs[2] = (aFloatArray4807[2] * f + aFloatArray4807[6] * f_31_ + aFloatArray4807[10] * f_32_);
		if (fs.length > 3)
			fs[3] = (aFloatArray4807[3] * f + aFloatArray4807[7] * f_31_ + aFloatArray4807[11] * f_32_);
	}

	public void method6748(float f, float f_33_, float f_34_, float f_35_, float f_36_, float f_37_) {
		aFloatArray4807[0] = 2.0F / (f_33_ - f);
		aFloatArray4807[1] = 0.0F;
		aFloatArray4807[2] = 0.0F;
		aFloatArray4807[3] = 0.0F;
		aFloatArray4807[4] = 0.0F;
		aFloatArray4807[5] = 2.0F / (f_35_ - f_34_);
		aFloatArray4807[6] = 0.0F;
		aFloatArray4807[7] = 0.0F;
		aFloatArray4807[8] = 0.0F;
		aFloatArray4807[9] = 0.0F;
		aFloatArray4807[10] = 2.0F / (f_37_ - f_36_);
		aFloatArray4807[11] = 0.0F;
		aFloatArray4807[12] = -(f_33_ + f) / (f_33_ - f);
		aFloatArray4807[13] = -(f_35_ + f_34_) / (f_35_ - f_34_);
		aFloatArray4807[14] = -(f_37_ + f_36_) / (f_37_ - f_36_);
		aFloatArray4807[15] = 1.0F;
	}

	public float[] method6749(float[] fs) {
		fs[0] = aFloatArray4807[0];
		fs[1] = aFloatArray4807[1];
		fs[2] = aFloatArray4807[4];
		fs[3] = aFloatArray4807[5];
		fs[4] = aFloatArray4807[8];
		fs[5] = aFloatArray4807[9];
		fs[6] = aFloatArray4807[12];
		fs[7] = aFloatArray4807[13];
		return fs;
	}

	public void method6750(Class427 class427_38_) {
		System.arraycopy(class427_38_.aFloatArray4807, 0, aFloatArray4807, 0, 16);
	}

	public void method6751(Class427 class427_39_) {
		float f = (aFloatArray4807[0] * class427_39_.aFloatArray4807[0] + aFloatArray4807[1] * class427_39_.aFloatArray4807[4] + aFloatArray4807[2] * class427_39_.aFloatArray4807[8] + aFloatArray4807[3] * class427_39_.aFloatArray4807[12]);
		float f_40_ = (aFloatArray4807[0] * class427_39_.aFloatArray4807[1] + aFloatArray4807[1] * class427_39_.aFloatArray4807[5] + aFloatArray4807[2] * class427_39_.aFloatArray4807[9] + aFloatArray4807[3] * class427_39_.aFloatArray4807[13]);
		float f_41_ = (aFloatArray4807[0] * class427_39_.aFloatArray4807[2] + aFloatArray4807[1] * class427_39_.aFloatArray4807[6] + aFloatArray4807[2] * class427_39_.aFloatArray4807[10] + aFloatArray4807[3] * class427_39_.aFloatArray4807[14]);
		float f_42_ = (aFloatArray4807[0] * class427_39_.aFloatArray4807[3] + aFloatArray4807[1] * class427_39_.aFloatArray4807[7] + aFloatArray4807[2] * class427_39_.aFloatArray4807[11] + aFloatArray4807[3] * class427_39_.aFloatArray4807[15]);
		float f_43_ = (aFloatArray4807[4] * class427_39_.aFloatArray4807[0] + aFloatArray4807[5] * class427_39_.aFloatArray4807[4] + aFloatArray4807[6] * class427_39_.aFloatArray4807[8] + aFloatArray4807[7] * class427_39_.aFloatArray4807[12]);
		float f_44_ = (aFloatArray4807[4] * class427_39_.aFloatArray4807[1] + aFloatArray4807[5] * class427_39_.aFloatArray4807[5] + aFloatArray4807[6] * class427_39_.aFloatArray4807[9] + aFloatArray4807[7] * class427_39_.aFloatArray4807[13]);
		float f_45_ = (aFloatArray4807[4] * class427_39_.aFloatArray4807[2] + aFloatArray4807[5] * class427_39_.aFloatArray4807[6] + aFloatArray4807[6] * class427_39_.aFloatArray4807[10] + aFloatArray4807[7] * class427_39_.aFloatArray4807[14]);
		float f_46_ = (aFloatArray4807[4] * class427_39_.aFloatArray4807[3] + aFloatArray4807[5] * class427_39_.aFloatArray4807[7] + aFloatArray4807[6] * class427_39_.aFloatArray4807[11] + aFloatArray4807[7] * class427_39_.aFloatArray4807[15]);
		float f_47_ = (aFloatArray4807[8] * class427_39_.aFloatArray4807[0] + aFloatArray4807[9] * class427_39_.aFloatArray4807[4] + aFloatArray4807[10] * class427_39_.aFloatArray4807[8] + aFloatArray4807[11] * class427_39_.aFloatArray4807[12]);
		float f_48_ = (aFloatArray4807[8] * class427_39_.aFloatArray4807[1] + aFloatArray4807[9] * class427_39_.aFloatArray4807[5] + aFloatArray4807[10] * class427_39_.aFloatArray4807[9] + aFloatArray4807[11] * class427_39_.aFloatArray4807[13]);
		float f_49_ = (aFloatArray4807[8] * class427_39_.aFloatArray4807[2] + aFloatArray4807[9] * class427_39_.aFloatArray4807[6] + aFloatArray4807[10] * class427_39_.aFloatArray4807[10] + aFloatArray4807[11] * class427_39_.aFloatArray4807[14]);
		float f_50_ = (aFloatArray4807[8] * class427_39_.aFloatArray4807[3] + aFloatArray4807[9] * class427_39_.aFloatArray4807[7] + aFloatArray4807[10] * class427_39_.aFloatArray4807[11] + aFloatArray4807[11] * class427_39_.aFloatArray4807[15]);
		float f_51_ = (aFloatArray4807[12] * class427_39_.aFloatArray4807[0] + aFloatArray4807[13] * class427_39_.aFloatArray4807[4] + aFloatArray4807[14] * class427_39_.aFloatArray4807[8] + aFloatArray4807[15] * class427_39_.aFloatArray4807[12]);
		float f_52_ = (aFloatArray4807[12] * class427_39_.aFloatArray4807[1] + aFloatArray4807[13] * class427_39_.aFloatArray4807[5] + aFloatArray4807[14] * class427_39_.aFloatArray4807[9] + aFloatArray4807[15] * class427_39_.aFloatArray4807[13]);
		float f_53_ = (aFloatArray4807[12] * class427_39_.aFloatArray4807[2] + aFloatArray4807[13] * class427_39_.aFloatArray4807[6] + aFloatArray4807[14] * class427_39_.aFloatArray4807[10] + aFloatArray4807[15] * class427_39_.aFloatArray4807[14]);
		float f_54_ = (aFloatArray4807[12] * class427_39_.aFloatArray4807[3] + aFloatArray4807[13] * class427_39_.aFloatArray4807[7] + aFloatArray4807[14] * class427_39_.aFloatArray4807[11] + aFloatArray4807[15] * class427_39_.aFloatArray4807[15]);
		aFloatArray4807[0] = f;
		aFloatArray4807[1] = f_40_;
		aFloatArray4807[2] = f_41_;
		aFloatArray4807[3] = f_42_;
		aFloatArray4807[4] = f_43_;
		aFloatArray4807[5] = f_44_;
		aFloatArray4807[6] = f_45_;
		aFloatArray4807[7] = f_46_;
		aFloatArray4807[8] = f_47_;
		aFloatArray4807[9] = f_48_;
		aFloatArray4807[10] = f_49_;
		aFloatArray4807[11] = f_50_;
		aFloatArray4807[12] = f_51_;
		aFloatArray4807[13] = f_52_;
		aFloatArray4807[14] = f_53_;
		aFloatArray4807[15] = f_54_;
	}

	public void method6752(float f, float f_55_, float f_56_, float f_57_, float f_58_, float f_59_, float f_60_, float f_61_) {
		aFloatArray4807[0] = f_56_ * 2.0F / f_60_;
		aFloatArray4807[1] = 0.0F;
		aFloatArray4807[2] = 0.0F;
		aFloatArray4807[3] = 0.0F;
		aFloatArray4807[4] = 0.0F;
		aFloatArray4807[5] = f_57_ * 2.0F / f_61_;
		aFloatArray4807[6] = 0.0F;
		aFloatArray4807[7] = 0.0F;
		aFloatArray4807[8] = 2.0F * f / f_60_ - 1.0F;
		aFloatArray4807[9] = 2.0F * f_55_ / f_61_ - 1.0F;
		aFloatArray4807[10] = (f_59_ + f_58_) / (f_59_ - f_58_);
		aFloatArray4807[11] = 1.0F;
		aFloatArray4807[12] = 0.0F;
		aFloatArray4807[13] = 0.0F;
		aFloatArray4807[14] = 2.0F * f_59_ * f_58_ / (f_58_ - f_59_);
		aFloatArray4807[15] = 0.0F;
	}

	public void method6753(float f, float f_62_, float f_63_, float f_64_, float f_65_, float f_66_, float f_67_, float f_68_, float f_69_) {
		method6748(-(f * f_69_) / f_63_, f_69_ * (f_67_ - f) / f_63_, -(f_62_ * f_69_) / f_64_, f_69_ * (f_68_ - f_62_) / f_64_, f_65_, f_66_);
	}

	public int method6754() {
		int i = 1;
		i = 31 * i + Arrays.hashCode(aFloatArray4807);
		return i;
	}

	public float method6755() {
		return ((aFloatArray4807[14] - aFloatArray4807[15]) / (aFloatArray4807[11] - aFloatArray4807[10]));
	}

	public float[] method6756(float[] fs) {
		float f = aFloatArray4807[3] + aFloatArray4807[0];
		float f_70_ = aFloatArray4807[7] + aFloatArray4807[4];
		float f_71_ = aFloatArray4807[11] + aFloatArray4807[8];
		double d = Math.sqrt((double) (f * f + f_70_ * f_70_ + f_71_ * f_71_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_70_ / d);
		fs[2] = (float) ((double) f_71_ / d);
		fs[3] = (float) ((double) (aFloatArray4807[15] + aFloatArray4807[12]) / d);
		return fs;
	}

	public float[] method6757(float[] fs) {
		float f = aFloatArray4807[3] - aFloatArray4807[0];
		float f_72_ = aFloatArray4807[7] - aFloatArray4807[4];
		float f_73_ = aFloatArray4807[11] - aFloatArray4807[8];
		double d = Math.sqrt((double) (f * f + f_72_ * f_72_ + f_73_ * f_73_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_72_ / d);
		fs[2] = (float) ((double) f_73_ / d);
		fs[3] = (float) ((double) (aFloatArray4807[15] - aFloatArray4807[12]) / d);
		return fs;
	}

	public float[] method6758(float[] fs) {
		float f = aFloatArray4807[3] + aFloatArray4807[1];
		float f_74_ = aFloatArray4807[7] + aFloatArray4807[5];
		float f_75_ = aFloatArray4807[11] + aFloatArray4807[9];
		double d = Math.sqrt((double) (f * f + f_74_ * f_74_ + f_75_ * f_75_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_74_ / d);
		fs[2] = (float) ((double) f_75_ / d);
		fs[3] = (float) ((double) (aFloatArray4807[15] + aFloatArray4807[13]) / d);
		return fs;
	}

	public void method6759(float f, float f_76_, float f_77_) {
		method6748(-10000.0F / f_77_, 10000.0F / f_77_, -10000.0F / f_77_, 10000.0F / f_77_, f, f_76_);
	}

	public float[] method6760(float[] fs) {
		float f = aFloatArray4807[3] + aFloatArray4807[2];
		float f_78_ = aFloatArray4807[7] + aFloatArray4807[6];
		float f_79_ = aFloatArray4807[11] + aFloatArray4807[10];
		double d = Math.sqrt((double) (f * f + f_78_ * f_78_ + f_79_ * f_79_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_78_ / d);
		fs[2] = (float) ((double) f_79_ / d);
		fs[3] = (float) ((double) (aFloatArray4807[15] + aFloatArray4807[14]) / d);
		return fs;
	}

	public float[] method6761(float[] fs) {
		float f = aFloatArray4807[3] - aFloatArray4807[2];
		float f_80_ = aFloatArray4807[7] - aFloatArray4807[6];
		float f_81_ = aFloatArray4807[11] - aFloatArray4807[10];
		double d = Math.sqrt((double) (f * f + f_80_ * f_80_ + f_81_ * f_81_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_80_ / d);
		fs[2] = (float) ((double) f_81_ / d);
		fs[3] = (float) ((double) (aFloatArray4807[15] - aFloatArray4807[14]) / d);
		return fs;
	}

	public void method6762(Class427 class427_82_) {
		System.arraycopy(class427_82_.aFloatArray4807, 0, aFloatArray4807, 0, 16);
	}

	public float[] method6763(float[] fs) {
		System.arraycopy(aFloatArray4807, 0, fs, 0, 16);
		return fs;
	}

	public float[] method6764(float[] fs) {
		System.arraycopy(aFloatArray4807, 0, fs, 0, 16);
		fs[3] = 0.0F;
		fs[7] = 0.0F;
		fs[11] = 0.0F;
		fs[12] = 0.0F;
		fs[13] = 0.0F;
		fs[14] = 0.0F;
		fs[15] = 1.0F;
		return fs;
	}

	public float[] method6765(float[] fs) {
		fs[0] = aFloatArray4807[0];
		fs[1] = aFloatArray4807[1];
		fs[2] = aFloatArray4807[2];
		fs[3] = aFloatArray4807[4];
		fs[4] = aFloatArray4807[5];
		fs[5] = aFloatArray4807[6];
		fs[6] = aFloatArray4807[8];
		fs[7] = aFloatArray4807[9];
		fs[8] = aFloatArray4807[10];
		return fs;
	}

	public float[] method6766(float[] fs) {
		fs[0] = aFloatArray4807[0];
		fs[1] = aFloatArray4807[4];
		fs[2] = aFloatArray4807[8];
		fs[3] = aFloatArray4807[12];
		fs[4] = aFloatArray4807[1];
		fs[5] = aFloatArray4807[5];
		fs[6] = aFloatArray4807[9];
		fs[7] = aFloatArray4807[13];
		fs[8] = aFloatArray4807[2];
		fs[9] = aFloatArray4807[6];
		fs[10] = aFloatArray4807[10];
		fs[11] = aFloatArray4807[14];
		fs[12] = aFloatArray4807[3];
		fs[13] = aFloatArray4807[7];
		fs[14] = aFloatArray4807[11];
		fs[15] = aFloatArray4807[15];
		return fs;
	}

	public float[] method6767(float[] fs) {
		fs[0] = aFloatArray4807[0];
		fs[1] = aFloatArray4807[1];
		fs[2] = aFloatArray4807[4];
		fs[3] = aFloatArray4807[5];
		fs[4] = aFloatArray4807[8];
		fs[5] = aFloatArray4807[9];
		fs[6] = aFloatArray4807[12];
		fs[7] = aFloatArray4807[13];
		return fs;
	}

	public float method6768() {
		return (-(aFloatArray4807[15] + aFloatArray4807[14]) / (aFloatArray4807[11] + aFloatArray4807[10]));
	}

	public float[] method6769(float[] fs) {
		fs[0] = aFloatArray4807[0];
		fs[1] = aFloatArray4807[1];
		fs[2] = 0.0F;
		fs[3] = 0.0F;
		fs[4] = aFloatArray4807[4];
		fs[5] = aFloatArray4807[5];
		fs[6] = 0.0F;
		fs[7] = 0.0F;
		fs[8] = aFloatArray4807[12];
		fs[9] = aFloatArray4807[13];
		fs[10] = aFloatArray4807[14];
		fs[11] = 0.0F;
		fs[12] = 0.0F;
		fs[13] = 0.0F;
		fs[14] = 0.0F;
		fs[15] = 1.0F;
		return fs;
	}

	public boolean method6770(Object object) {
		if (!(object instanceof Class427))
			return false;
		Class427 class427_83_ = (Class427) object;
		for (int i = 0; i < 16; i++) {
			if (aFloatArray4807[i] != class427_83_.aFloatArray4807[i])
				return false;
		}
		return true;
	}

	public void method6771(float f, float f_84_, float f_85_) {
		method6748(-10000.0F / f_85_, 10000.0F / f_85_, -10000.0F / f_85_, 10000.0F / f_85_, f, f_84_);
	}

	public float[] method6772(float[] fs) {
		fs[0] = aFloatArray4807[0];
		fs[1] = aFloatArray4807[4];
		fs[2] = aFloatArray4807[8];
		fs[3] = aFloatArray4807[12];
		fs[4] = aFloatArray4807[1];
		fs[5] = aFloatArray4807[5];
		fs[6] = aFloatArray4807[9];
		fs[7] = aFloatArray4807[13];
		return fs;
	}

	public void method6773(float f, float f_86_, float f_87_, float[] fs) {
		fs[0] = (aFloatArray4807[0] * f + aFloatArray4807[4] * f_86_ + aFloatArray4807[8] * f_87_ + aFloatArray4807[12]);
		fs[1] = (aFloatArray4807[1] * f + aFloatArray4807[5] * f_86_ + aFloatArray4807[9] * f_87_ + aFloatArray4807[13]);
		fs[2] = (aFloatArray4807[2] * f + aFloatArray4807[6] * f_86_ + aFloatArray4807[10] * f_87_ + aFloatArray4807[14]);
		if (fs.length > 3)
			fs[3] = (aFloatArray4807[3] * f + aFloatArray4807[7] * f_86_ + aFloatArray4807[11] * f_87_ + aFloatArray4807[15]);
	}

	public void method6774(float f, float f_88_, float f_89_, float f_90_) {
		float f_91_ = (float) (Math.tan((double) (f_89_ / 2.0F)) * (double) f);
		float f_92_ = (float) (Math.tan((double) (f_90_ / 2.0F)) * (double) f);
		method6785(-f_91_, f_91_, -f_92_, f_92_, f, f_88_);
	}

	public float[] method6775(float[] fs) {
		float f = aFloatArray4807[3] - aFloatArray4807[2];
		float f_93_ = aFloatArray4807[7] - aFloatArray4807[6];
		float f_94_ = aFloatArray4807[11] - aFloatArray4807[10];
		double d = Math.sqrt((double) (f * f + f_93_ * f_93_ + f_94_ * f_94_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_93_ / d);
		fs[2] = (float) ((double) f_94_ / d);
		fs[3] = (float) ((double) (aFloatArray4807[15] - aFloatArray4807[14]) / d);
		return fs;
	}

	public boolean method6776(Object object) {
		if (!(object instanceof Class427))
			return false;
		Class427 class427_95_ = (Class427) object;
		for (int i = 0; i < 16; i++) {
			if (aFloatArray4807[i] != class427_95_.aFloatArray4807[i])
				return false;
		}
		return true;
	}

	public float[] method6777(float[] fs) {
		fs[0] = aFloatArray4807[0];
		fs[1] = aFloatArray4807[4];
		fs[2] = aFloatArray4807[8];
		fs[3] = aFloatArray4807[12];
		fs[4] = aFloatArray4807[1];
		fs[5] = aFloatArray4807[5];
		fs[6] = aFloatArray4807[9];
		fs[7] = aFloatArray4807[13];
		return fs;
	}

	public int method6778() {
		int i = 1;
		i = 31 * i + Arrays.hashCode(aFloatArray4807);
		return i;
	}

	public float[] method6779(float[] fs) {
		float f = aFloatArray4807[3] - aFloatArray4807[1];
		float f_96_ = aFloatArray4807[7] - aFloatArray4807[5];
		float f_97_ = aFloatArray4807[11] - aFloatArray4807[9];
		double d = Math.sqrt((double) (f * f + f_96_ * f_96_ + f_97_ * f_97_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_96_ / d);
		fs[2] = (float) ((double) f_97_ / d);
		fs[3] = (float) ((double) (aFloatArray4807[15] - aFloatArray4807[13]) / d);
		return fs;
	}

	public void method6780(float f, float f_98_, float f_99_, float[] fs) {
		fs[0] = (aFloatArray4807[0] * f + aFloatArray4807[4] * f_98_ + aFloatArray4807[8] * f_99_);
		fs[1] = (aFloatArray4807[1] * f + aFloatArray4807[5] * f_98_ + aFloatArray4807[9] * f_99_);
		fs[2] = (aFloatArray4807[2] * f + aFloatArray4807[6] * f_98_ + aFloatArray4807[10] * f_99_);
		if (fs.length > 3)
			fs[3] = (aFloatArray4807[3] * f + aFloatArray4807[7] * f_98_ + aFloatArray4807[11] * f_99_);
	}

	public float[] method6781(float[] fs) {
		fs[0] = aFloatArray4807[0];
		fs[1] = aFloatArray4807[4];
		fs[2] = aFloatArray4807[8];
		fs[3] = aFloatArray4807[12];
		fs[4] = aFloatArray4807[1];
		fs[5] = aFloatArray4807[5];
		fs[6] = aFloatArray4807[9];
		fs[7] = aFloatArray4807[13];
		fs[8] = aFloatArray4807[2];
		fs[9] = aFloatArray4807[6];
		fs[10] = aFloatArray4807[10];
		fs[11] = aFloatArray4807[14];
		fs[12] = aFloatArray4807[3];
		fs[13] = aFloatArray4807[7];
		fs[14] = aFloatArray4807[11];
		fs[15] = aFloatArray4807[15];
		return fs;
	}

	public void method6782(float f, float f_100_, float f_101_, float f_102_, float f_103_, float f_104_, float f_105_, float f_106_, float f_107_) {
		method6748(-(f * f_107_) / f_101_, f_107_ * (f_105_ - f) / f_101_, -(f_100_ * f_107_) / f_102_, f_107_ * (f_106_ - f_100_) / f_102_, f_103_, f_104_);
	}

	public void method6783() {
		aFloatArray4807[0] = 1.0F;
		aFloatArray4807[1] = 0.0F;
		aFloatArray4807[2] = 0.0F;
		aFloatArray4807[3] = 0.0F;
		aFloatArray4807[4] = 0.0F;
		aFloatArray4807[5] = 1.0F;
		aFloatArray4807[6] = 0.0F;
		aFloatArray4807[7] = 0.0F;
		aFloatArray4807[8] = 0.0F;
		aFloatArray4807[9] = 0.0F;
		aFloatArray4807[10] = 1.0F;
		aFloatArray4807[11] = 0.0F;
		aFloatArray4807[12] = 0.0F;
		aFloatArray4807[13] = 0.0F;
		aFloatArray4807[14] = 0.0F;
		aFloatArray4807[15] = 1.0F;
	}

	public void method6784(Class432 class432) {
		aFloatArray4807[0] = class432.aFloat4862;
		aFloatArray4807[1] = class432.aFloat4854;
		aFloatArray4807[2] = class432.aFloat4858;
		aFloatArray4807[3] = 0.0F;
		aFloatArray4807[4] = class432.aFloat4856;
		aFloatArray4807[5] = class432.aFloat4857;
		aFloatArray4807[6] = class432.aFloat4860;
		aFloatArray4807[7] = 0.0F;
		aFloatArray4807[8] = class432.aFloat4859;
		aFloatArray4807[9] = class432.aFloat4861;
		aFloatArray4807[10] = class432.aFloat4855;
		aFloatArray4807[11] = 0.0F;
		aFloatArray4807[12] = class432.aFloat4852;
		aFloatArray4807[13] = class432.aFloat4863;
		aFloatArray4807[14] = class432.aFloat4864;
		aFloatArray4807[15] = 1.0F;
	}

	public Class427() {
		aFloatArray4807 = new float[16];
		method6742();
	}

	void method6785(float f, float f_108_, float f_109_, float f_110_, float f_111_, float f_112_) {
		aFloatArray4807[0] = 2.0F * f_111_ / (f_108_ - f);
		aFloatArray4807[1] = 0.0F;
		aFloatArray4807[2] = 0.0F;
		aFloatArray4807[3] = 0.0F;
		aFloatArray4807[4] = 0.0F;
		aFloatArray4807[5] = 2.0F * f_111_ / (f_110_ - f_109_);
		aFloatArray4807[6] = 0.0F;
		aFloatArray4807[7] = 0.0F;
		aFloatArray4807[8] = (f_108_ + f) / (f_108_ - f);
		aFloatArray4807[9] = (f_110_ + f_109_) / (f_110_ - f_109_);
		aFloatArray4807[10] = (f_112_ + f_111_) / (f_112_ - f_111_);
		aFloatArray4807[11] = 1.0F;
		aFloatArray4807[12] = 0.0F;
		aFloatArray4807[13] = 0.0F;
		aFloatArray4807[14] = -(2.0F * f_112_ * f_111_) / (f_112_ - f_111_);
		aFloatArray4807[15] = 0.0F;
	}

	public void method6786(Class427 class427_113_) {
		System.arraycopy(class427_113_.aFloatArray4807, 0, aFloatArray4807, 0, 11);
		aFloatArray4807[3] = 0.0F;
		aFloatArray4807[7] = 0.0F;
		aFloatArray4807[11] = 0.0F;
		aFloatArray4807[12] = 0.0F;
		aFloatArray4807[13] = 0.0F;
		aFloatArray4807[14] = 0.0F;
		aFloatArray4807[15] = 1.0F;
	}

	public void method6787(Class427 class427_114_, Class427 class427_115_) {
		float f = ((class427_114_.aFloatArray4807[0] * class427_115_.aFloatArray4807[0]) + (class427_114_.aFloatArray4807[1] * class427_115_.aFloatArray4807[4]) + (class427_114_.aFloatArray4807[2] * class427_115_.aFloatArray4807[8]) + (class427_114_.aFloatArray4807[3] * class427_115_.aFloatArray4807[12]));
		float f_116_ = ((class427_114_.aFloatArray4807[0] * class427_115_.aFloatArray4807[1]) + (class427_114_.aFloatArray4807[1] * class427_115_.aFloatArray4807[5]) + (class427_114_.aFloatArray4807[2] * class427_115_.aFloatArray4807[9]) + (class427_114_.aFloatArray4807[3] * class427_115_.aFloatArray4807[13]));
		float f_117_ = ((class427_114_.aFloatArray4807[0] * class427_115_.aFloatArray4807[2]) + (class427_114_.aFloatArray4807[1] * class427_115_.aFloatArray4807[6]) + (class427_114_.aFloatArray4807[2] * class427_115_.aFloatArray4807[10]) + (class427_114_.aFloatArray4807[3] * class427_115_.aFloatArray4807[14]));
		float f_118_ = ((class427_114_.aFloatArray4807[0] * class427_115_.aFloatArray4807[3]) + (class427_114_.aFloatArray4807[1] * class427_115_.aFloatArray4807[7]) + (class427_114_.aFloatArray4807[2] * class427_115_.aFloatArray4807[11]) + (class427_114_.aFloatArray4807[3] * class427_115_.aFloatArray4807[15]));
		float f_119_ = ((class427_114_.aFloatArray4807[4] * class427_115_.aFloatArray4807[0]) + (class427_114_.aFloatArray4807[5] * class427_115_.aFloatArray4807[4]) + (class427_114_.aFloatArray4807[6] * class427_115_.aFloatArray4807[8]) + (class427_114_.aFloatArray4807[7] * class427_115_.aFloatArray4807[12]));
		float f_120_ = ((class427_114_.aFloatArray4807[4] * class427_115_.aFloatArray4807[1]) + (class427_114_.aFloatArray4807[5] * class427_115_.aFloatArray4807[5]) + (class427_114_.aFloatArray4807[6] * class427_115_.aFloatArray4807[9]) + (class427_114_.aFloatArray4807[7] * class427_115_.aFloatArray4807[13]));
		float f_121_ = ((class427_114_.aFloatArray4807[4] * class427_115_.aFloatArray4807[2]) + (class427_114_.aFloatArray4807[5] * class427_115_.aFloatArray4807[6]) + (class427_114_.aFloatArray4807[6] * class427_115_.aFloatArray4807[10]) + (class427_114_.aFloatArray4807[7] * class427_115_.aFloatArray4807[14]));
		float f_122_ = ((class427_114_.aFloatArray4807[4] * class427_115_.aFloatArray4807[3]) + (class427_114_.aFloatArray4807[5] * class427_115_.aFloatArray4807[7]) + (class427_114_.aFloatArray4807[6] * class427_115_.aFloatArray4807[11]) + (class427_114_.aFloatArray4807[7] * class427_115_.aFloatArray4807[15]));
		float f_123_ = ((class427_114_.aFloatArray4807[8] * class427_115_.aFloatArray4807[0]) + (class427_114_.aFloatArray4807[9] * class427_115_.aFloatArray4807[4]) + (class427_114_.aFloatArray4807[10] * class427_115_.aFloatArray4807[8]) + (class427_114_.aFloatArray4807[11] * class427_115_.aFloatArray4807[12]));
		float f_124_ = ((class427_114_.aFloatArray4807[8] * class427_115_.aFloatArray4807[1]) + (class427_114_.aFloatArray4807[9] * class427_115_.aFloatArray4807[5]) + (class427_114_.aFloatArray4807[10] * class427_115_.aFloatArray4807[9]) + (class427_114_.aFloatArray4807[11] * class427_115_.aFloatArray4807[13]));
		float f_125_ = ((class427_114_.aFloatArray4807[8] * class427_115_.aFloatArray4807[2]) + (class427_114_.aFloatArray4807[9] * class427_115_.aFloatArray4807[6]) + (class427_114_.aFloatArray4807[10] * class427_115_.aFloatArray4807[10]) + (class427_114_.aFloatArray4807[11] * class427_115_.aFloatArray4807[14]));
		float f_126_ = ((class427_114_.aFloatArray4807[8] * class427_115_.aFloatArray4807[3]) + (class427_114_.aFloatArray4807[9] * class427_115_.aFloatArray4807[7]) + (class427_114_.aFloatArray4807[10] * class427_115_.aFloatArray4807[11]) + (class427_114_.aFloatArray4807[11] * class427_115_.aFloatArray4807[15]));
		float f_127_ = ((class427_114_.aFloatArray4807[12] * class427_115_.aFloatArray4807[0]) + (class427_114_.aFloatArray4807[13] * class427_115_.aFloatArray4807[4]) + (class427_114_.aFloatArray4807[14] * class427_115_.aFloatArray4807[8]) + (class427_114_.aFloatArray4807[15] * class427_115_.aFloatArray4807[12]));
		float f_128_ = ((class427_114_.aFloatArray4807[12] * class427_115_.aFloatArray4807[1]) + (class427_114_.aFloatArray4807[13] * class427_115_.aFloatArray4807[5]) + (class427_114_.aFloatArray4807[14] * class427_115_.aFloatArray4807[9]) + (class427_114_.aFloatArray4807[15] * class427_115_.aFloatArray4807[13]));
		float f_129_ = ((class427_114_.aFloatArray4807[12] * class427_115_.aFloatArray4807[2]) + (class427_114_.aFloatArray4807[13] * class427_115_.aFloatArray4807[6]) + (class427_114_.aFloatArray4807[14] * class427_115_.aFloatArray4807[10]) + (class427_114_.aFloatArray4807[15] * class427_115_.aFloatArray4807[14]));
		float f_130_ = ((class427_114_.aFloatArray4807[12] * class427_115_.aFloatArray4807[3]) + (class427_114_.aFloatArray4807[13] * class427_115_.aFloatArray4807[7]) + (class427_114_.aFloatArray4807[14] * class427_115_.aFloatArray4807[11]) + (class427_114_.aFloatArray4807[15] * class427_115_.aFloatArray4807[15]));
		aFloatArray4807[0] = f;
		aFloatArray4807[1] = f_116_;
		aFloatArray4807[2] = f_117_;
		aFloatArray4807[3] = f_118_;
		aFloatArray4807[4] = f_119_;
		aFloatArray4807[5] = f_120_;
		aFloatArray4807[6] = f_121_;
		aFloatArray4807[7] = f_122_;
		aFloatArray4807[8] = f_123_;
		aFloatArray4807[9] = f_124_;
		aFloatArray4807[10] = f_125_;
		aFloatArray4807[11] = f_126_;
		aFloatArray4807[12] = f_127_;
		aFloatArray4807[13] = f_128_;
		aFloatArray4807[14] = f_129_;
		aFloatArray4807[15] = f_130_;
	}

	public void method6788(Class427 class427_131_) {
		float f = (aFloatArray4807[0] * class427_131_.aFloatArray4807[0] + aFloatArray4807[1] * class427_131_.aFloatArray4807[4] + aFloatArray4807[2] * class427_131_.aFloatArray4807[8] + aFloatArray4807[3] * class427_131_.aFloatArray4807[12]);
		float f_132_ = (aFloatArray4807[0] * class427_131_.aFloatArray4807[1] + aFloatArray4807[1] * class427_131_.aFloatArray4807[5] + aFloatArray4807[2] * class427_131_.aFloatArray4807[9] + aFloatArray4807[3] * class427_131_.aFloatArray4807[13]);
		float f_133_ = (aFloatArray4807[0] * class427_131_.aFloatArray4807[2] + aFloatArray4807[1] * class427_131_.aFloatArray4807[6] + aFloatArray4807[2] * class427_131_.aFloatArray4807[10] + aFloatArray4807[3] * class427_131_.aFloatArray4807[14]);
		float f_134_ = (aFloatArray4807[0] * class427_131_.aFloatArray4807[3] + aFloatArray4807[1] * class427_131_.aFloatArray4807[7] + aFloatArray4807[2] * class427_131_.aFloatArray4807[11] + aFloatArray4807[3] * class427_131_.aFloatArray4807[15]);
		float f_135_ = (aFloatArray4807[4] * class427_131_.aFloatArray4807[0] + aFloatArray4807[5] * class427_131_.aFloatArray4807[4] + aFloatArray4807[6] * class427_131_.aFloatArray4807[8] + aFloatArray4807[7] * class427_131_.aFloatArray4807[12]);
		float f_136_ = (aFloatArray4807[4] * class427_131_.aFloatArray4807[1] + aFloatArray4807[5] * class427_131_.aFloatArray4807[5] + aFloatArray4807[6] * class427_131_.aFloatArray4807[9] + aFloatArray4807[7] * class427_131_.aFloatArray4807[13]);
		float f_137_ = (aFloatArray4807[4] * class427_131_.aFloatArray4807[2] + aFloatArray4807[5] * class427_131_.aFloatArray4807[6] + aFloatArray4807[6] * class427_131_.aFloatArray4807[10] + aFloatArray4807[7] * class427_131_.aFloatArray4807[14]);
		float f_138_ = (aFloatArray4807[4] * class427_131_.aFloatArray4807[3] + aFloatArray4807[5] * class427_131_.aFloatArray4807[7] + aFloatArray4807[6] * class427_131_.aFloatArray4807[11] + aFloatArray4807[7] * class427_131_.aFloatArray4807[15]);
		float f_139_ = (aFloatArray4807[8] * class427_131_.aFloatArray4807[0] + aFloatArray4807[9] * class427_131_.aFloatArray4807[4] + aFloatArray4807[10] * class427_131_.aFloatArray4807[8] + aFloatArray4807[11] * class427_131_.aFloatArray4807[12]);
		float f_140_ = (aFloatArray4807[8] * class427_131_.aFloatArray4807[1] + aFloatArray4807[9] * class427_131_.aFloatArray4807[5] + aFloatArray4807[10] * class427_131_.aFloatArray4807[9] + aFloatArray4807[11] * class427_131_.aFloatArray4807[13]);
		float f_141_ = (aFloatArray4807[8] * class427_131_.aFloatArray4807[2] + aFloatArray4807[9] * class427_131_.aFloatArray4807[6] + aFloatArray4807[10] * class427_131_.aFloatArray4807[10] + aFloatArray4807[11] * class427_131_.aFloatArray4807[14]);
		float f_142_ = (aFloatArray4807[8] * class427_131_.aFloatArray4807[3] + aFloatArray4807[9] * class427_131_.aFloatArray4807[7] + aFloatArray4807[10] * class427_131_.aFloatArray4807[11] + aFloatArray4807[11] * class427_131_.aFloatArray4807[15]);
		float f_143_ = (aFloatArray4807[12] * class427_131_.aFloatArray4807[0] + aFloatArray4807[13] * class427_131_.aFloatArray4807[4] + aFloatArray4807[14] * class427_131_.aFloatArray4807[8] + aFloatArray4807[15] * class427_131_.aFloatArray4807[12]);
		float f_144_ = (aFloatArray4807[12] * class427_131_.aFloatArray4807[1] + aFloatArray4807[13] * class427_131_.aFloatArray4807[5] + aFloatArray4807[14] * class427_131_.aFloatArray4807[9] + aFloatArray4807[15] * class427_131_.aFloatArray4807[13]);
		float f_145_ = (aFloatArray4807[12] * class427_131_.aFloatArray4807[2] + aFloatArray4807[13] * class427_131_.aFloatArray4807[6] + aFloatArray4807[14] * class427_131_.aFloatArray4807[10] + aFloatArray4807[15] * class427_131_.aFloatArray4807[14]);
		float f_146_ = (aFloatArray4807[12] * class427_131_.aFloatArray4807[3] + aFloatArray4807[13] * class427_131_.aFloatArray4807[7] + aFloatArray4807[14] * class427_131_.aFloatArray4807[11] + aFloatArray4807[15] * class427_131_.aFloatArray4807[15]);
		aFloatArray4807[0] = f;
		aFloatArray4807[1] = f_132_;
		aFloatArray4807[2] = f_133_;
		aFloatArray4807[3] = f_134_;
		aFloatArray4807[4] = f_135_;
		aFloatArray4807[5] = f_136_;
		aFloatArray4807[6] = f_137_;
		aFloatArray4807[7] = f_138_;
		aFloatArray4807[8] = f_139_;
		aFloatArray4807[9] = f_140_;
		aFloatArray4807[10] = f_141_;
		aFloatArray4807[11] = f_142_;
		aFloatArray4807[12] = f_143_;
		aFloatArray4807[13] = f_144_;
		aFloatArray4807[14] = f_145_;
		aFloatArray4807[15] = f_146_;
	}

	public void method6789(Class427 class427_147_) {
		float f = (aFloatArray4807[0] * class427_147_.aFloatArray4807[0] + aFloatArray4807[1] * class427_147_.aFloatArray4807[4] + aFloatArray4807[2] * class427_147_.aFloatArray4807[8] + aFloatArray4807[3] * class427_147_.aFloatArray4807[12]);
		float f_148_ = (aFloatArray4807[0] * class427_147_.aFloatArray4807[1] + aFloatArray4807[1] * class427_147_.aFloatArray4807[5] + aFloatArray4807[2] * class427_147_.aFloatArray4807[9] + aFloatArray4807[3] * class427_147_.aFloatArray4807[13]);
		float f_149_ = (aFloatArray4807[0] * class427_147_.aFloatArray4807[2] + aFloatArray4807[1] * class427_147_.aFloatArray4807[6] + aFloatArray4807[2] * class427_147_.aFloatArray4807[10] + aFloatArray4807[3] * class427_147_.aFloatArray4807[14]);
		float f_150_ = (aFloatArray4807[0] * class427_147_.aFloatArray4807[3] + aFloatArray4807[1] * class427_147_.aFloatArray4807[7] + aFloatArray4807[2] * class427_147_.aFloatArray4807[11] + aFloatArray4807[3] * class427_147_.aFloatArray4807[15]);
		float f_151_ = (aFloatArray4807[4] * class427_147_.aFloatArray4807[0] + aFloatArray4807[5] * class427_147_.aFloatArray4807[4] + aFloatArray4807[6] * class427_147_.aFloatArray4807[8] + aFloatArray4807[7] * class427_147_.aFloatArray4807[12]);
		float f_152_ = (aFloatArray4807[4] * class427_147_.aFloatArray4807[1] + aFloatArray4807[5] * class427_147_.aFloatArray4807[5] + aFloatArray4807[6] * class427_147_.aFloatArray4807[9] + aFloatArray4807[7] * class427_147_.aFloatArray4807[13]);
		float f_153_ = (aFloatArray4807[4] * class427_147_.aFloatArray4807[2] + aFloatArray4807[5] * class427_147_.aFloatArray4807[6] + aFloatArray4807[6] * class427_147_.aFloatArray4807[10] + aFloatArray4807[7] * class427_147_.aFloatArray4807[14]);
		float f_154_ = (aFloatArray4807[4] * class427_147_.aFloatArray4807[3] + aFloatArray4807[5] * class427_147_.aFloatArray4807[7] + aFloatArray4807[6] * class427_147_.aFloatArray4807[11] + aFloatArray4807[7] * class427_147_.aFloatArray4807[15]);
		float f_155_ = (aFloatArray4807[8] * class427_147_.aFloatArray4807[0] + aFloatArray4807[9] * class427_147_.aFloatArray4807[4] + aFloatArray4807[10] * class427_147_.aFloatArray4807[8] + aFloatArray4807[11] * class427_147_.aFloatArray4807[12]);
		float f_156_ = (aFloatArray4807[8] * class427_147_.aFloatArray4807[1] + aFloatArray4807[9] * class427_147_.aFloatArray4807[5] + aFloatArray4807[10] * class427_147_.aFloatArray4807[9] + aFloatArray4807[11] * class427_147_.aFloatArray4807[13]);
		float f_157_ = (aFloatArray4807[8] * class427_147_.aFloatArray4807[2] + aFloatArray4807[9] * class427_147_.aFloatArray4807[6] + aFloatArray4807[10] * class427_147_.aFloatArray4807[10] + aFloatArray4807[11] * class427_147_.aFloatArray4807[14]);
		float f_158_ = (aFloatArray4807[8] * class427_147_.aFloatArray4807[3] + aFloatArray4807[9] * class427_147_.aFloatArray4807[7] + aFloatArray4807[10] * class427_147_.aFloatArray4807[11] + aFloatArray4807[11] * class427_147_.aFloatArray4807[15]);
		float f_159_ = (aFloatArray4807[12] * class427_147_.aFloatArray4807[0] + aFloatArray4807[13] * class427_147_.aFloatArray4807[4] + aFloatArray4807[14] * class427_147_.aFloatArray4807[8] + aFloatArray4807[15] * class427_147_.aFloatArray4807[12]);
		float f_160_ = (aFloatArray4807[12] * class427_147_.aFloatArray4807[1] + aFloatArray4807[13] * class427_147_.aFloatArray4807[5] + aFloatArray4807[14] * class427_147_.aFloatArray4807[9] + aFloatArray4807[15] * class427_147_.aFloatArray4807[13]);
		float f_161_ = (aFloatArray4807[12] * class427_147_.aFloatArray4807[2] + aFloatArray4807[13] * class427_147_.aFloatArray4807[6] + aFloatArray4807[14] * class427_147_.aFloatArray4807[10] + aFloatArray4807[15] * class427_147_.aFloatArray4807[14]);
		float f_162_ = (aFloatArray4807[12] * class427_147_.aFloatArray4807[3] + aFloatArray4807[13] * class427_147_.aFloatArray4807[7] + aFloatArray4807[14] * class427_147_.aFloatArray4807[11] + aFloatArray4807[15] * class427_147_.aFloatArray4807[15]);
		aFloatArray4807[0] = f;
		aFloatArray4807[1] = f_148_;
		aFloatArray4807[2] = f_149_;
		aFloatArray4807[3] = f_150_;
		aFloatArray4807[4] = f_151_;
		aFloatArray4807[5] = f_152_;
		aFloatArray4807[6] = f_153_;
		aFloatArray4807[7] = f_154_;
		aFloatArray4807[8] = f_155_;
		aFloatArray4807[9] = f_156_;
		aFloatArray4807[10] = f_157_;
		aFloatArray4807[11] = f_158_;
		aFloatArray4807[12] = f_159_;
		aFloatArray4807[13] = f_160_;
		aFloatArray4807[14] = f_161_;
		aFloatArray4807[15] = f_162_;
	}

	public void method6790() {
		float f = aFloatArray4807[0];
		float f_163_ = aFloatArray4807[4];
		float f_164_ = aFloatArray4807[8];
		float f_165_ = aFloatArray4807[12];
		float f_166_ = aFloatArray4807[1];
		float f_167_ = aFloatArray4807[5];
		float f_168_ = aFloatArray4807[9];
		float f_169_ = aFloatArray4807[13];
		float f_170_ = aFloatArray4807[2];
		float f_171_ = aFloatArray4807[6];
		float f_172_ = aFloatArray4807[10];
		float f_173_ = aFloatArray4807[14];
		float f_174_ = aFloatArray4807[3];
		float f_175_ = aFloatArray4807[7];
		float f_176_ = aFloatArray4807[11];
		float f_177_ = aFloatArray4807[15];
		aFloatArray4807[0] = f;
		aFloatArray4807[1] = f_163_;
		aFloatArray4807[2] = f_164_;
		aFloatArray4807[3] = f_165_;
		aFloatArray4807[4] = f_166_;
		aFloatArray4807[5] = f_167_;
		aFloatArray4807[6] = f_168_;
		aFloatArray4807[7] = f_169_;
		aFloatArray4807[8] = f_170_;
		aFloatArray4807[9] = f_171_;
		aFloatArray4807[10] = f_172_;
		aFloatArray4807[11] = f_173_;
		aFloatArray4807[12] = f_174_;
		aFloatArray4807[13] = f_175_;
		aFloatArray4807[14] = f_176_;
		aFloatArray4807[15] = f_177_;
	}

	public void method6791(Class432 class432) {
		aFloatArray4807[0] = class432.aFloat4862;
		aFloatArray4807[1] = class432.aFloat4854;
		aFloatArray4807[2] = class432.aFloat4858;
		aFloatArray4807[3] = 0.0F;
		aFloatArray4807[4] = class432.aFloat4856;
		aFloatArray4807[5] = class432.aFloat4857;
		aFloatArray4807[6] = class432.aFloat4860;
		aFloatArray4807[7] = 0.0F;
		aFloatArray4807[8] = class432.aFloat4859;
		aFloatArray4807[9] = class432.aFloat4861;
		aFloatArray4807[10] = class432.aFloat4855;
		aFloatArray4807[11] = 0.0F;
		aFloatArray4807[12] = class432.aFloat4852;
		aFloatArray4807[13] = class432.aFloat4863;
		aFloatArray4807[14] = class432.aFloat4864;
		aFloatArray4807[15] = 1.0F;
	}

	public void method6792(Class432 class432) {
		aFloatArray4807[0] = class432.aFloat4862;
		aFloatArray4807[1] = class432.aFloat4854;
		aFloatArray4807[2] = class432.aFloat4858;
		aFloatArray4807[3] = 0.0F;
		aFloatArray4807[4] = class432.aFloat4856;
		aFloatArray4807[5] = class432.aFloat4857;
		aFloatArray4807[6] = class432.aFloat4860;
		aFloatArray4807[7] = 0.0F;
		aFloatArray4807[8] = class432.aFloat4859;
		aFloatArray4807[9] = class432.aFloat4861;
		aFloatArray4807[10] = class432.aFloat4855;
		aFloatArray4807[11] = 0.0F;
		aFloatArray4807[12] = class432.aFloat4852;
		aFloatArray4807[13] = class432.aFloat4863;
		aFloatArray4807[14] = class432.aFloat4864;
		aFloatArray4807[15] = 1.0F;
	}

	float method6793() {
		return ((aFloatArray4807[0] * aFloatArray4807[5] * aFloatArray4807[10] * aFloatArray4807[15]) - (aFloatArray4807[0] * aFloatArray4807[5] * aFloatArray4807[11] * aFloatArray4807[14]) - (aFloatArray4807[0] * aFloatArray4807[6] * aFloatArray4807[9] * aFloatArray4807[15]) + (aFloatArray4807[0] * aFloatArray4807[6] * aFloatArray4807[11] * aFloatArray4807[13]) + (aFloatArray4807[0] * aFloatArray4807[7] * aFloatArray4807[9] * aFloatArray4807[14])
				- (aFloatArray4807[0] * aFloatArray4807[7] * aFloatArray4807[10] * aFloatArray4807[13]) - (aFloatArray4807[1] * aFloatArray4807[4] * aFloatArray4807[10] * aFloatArray4807[15]) + (aFloatArray4807[1] * aFloatArray4807[4] * aFloatArray4807[11] * aFloatArray4807[14]) + (aFloatArray4807[1] * aFloatArray4807[6] * aFloatArray4807[8] * aFloatArray4807[15]) - (aFloatArray4807[1] * aFloatArray4807[6] * aFloatArray4807[11] * aFloatArray4807[12])
				- (aFloatArray4807[1] * aFloatArray4807[7] * aFloatArray4807[8] * aFloatArray4807[14]) + (aFloatArray4807[1] * aFloatArray4807[7] * aFloatArray4807[10] * aFloatArray4807[12]) + (aFloatArray4807[2] * aFloatArray4807[4] * aFloatArray4807[9] * aFloatArray4807[15]) - (aFloatArray4807[2] * aFloatArray4807[4] * aFloatArray4807[11] * aFloatArray4807[13]) - (aFloatArray4807[2] * aFloatArray4807[5] * aFloatArray4807[8] * aFloatArray4807[15])
				+ (aFloatArray4807[2] * aFloatArray4807[5] * aFloatArray4807[11] * aFloatArray4807[12]) + (aFloatArray4807[2] * aFloatArray4807[7] * aFloatArray4807[8] * aFloatArray4807[13]) - (aFloatArray4807[2] * aFloatArray4807[7] * aFloatArray4807[9] * aFloatArray4807[12]) - (aFloatArray4807[3] * aFloatArray4807[4] * aFloatArray4807[9] * aFloatArray4807[14]) + (aFloatArray4807[3] * aFloatArray4807[4] * aFloatArray4807[10] * aFloatArray4807[13])
				+ (aFloatArray4807[3] * aFloatArray4807[5] * aFloatArray4807[8] * aFloatArray4807[14]) - (aFloatArray4807[3] * aFloatArray4807[5] * aFloatArray4807[10] * aFloatArray4807[12]) - (aFloatArray4807[3] * aFloatArray4807[6] * aFloatArray4807[8] * aFloatArray4807[13]) + (aFloatArray4807[3] * aFloatArray4807[6] * aFloatArray4807[9] * aFloatArray4807[12]));
	}

	public void method6794() {
		aFloatArray4807[0] = 1.0F;
		aFloatArray4807[1] = 0.0F;
		aFloatArray4807[2] = 0.0F;
		aFloatArray4807[3] = 0.0F;
		aFloatArray4807[4] = 0.0F;
		aFloatArray4807[5] = 1.0F;
		aFloatArray4807[6] = 0.0F;
		aFloatArray4807[7] = 0.0F;
		aFloatArray4807[8] = 0.0F;
		aFloatArray4807[9] = 0.0F;
		aFloatArray4807[10] = 1.0F;
		aFloatArray4807[11] = 0.0F;
		aFloatArray4807[12] = 0.0F;
		aFloatArray4807[13] = 0.0F;
		aFloatArray4807[14] = 0.0F;
		aFloatArray4807[15] = 1.0F;
	}

	public void method6795() {
		float f = 1.0F / method6854();
		float f_178_ = (aFloatArray4807[5] * aFloatArray4807[10] * aFloatArray4807[15] - aFloatArray4807[5] * aFloatArray4807[11] * aFloatArray4807[14] - aFloatArray4807[6] * aFloatArray4807[9] * aFloatArray4807[15] + aFloatArray4807[6] * aFloatArray4807[11] * aFloatArray4807[13] + aFloatArray4807[7] * aFloatArray4807[9] * aFloatArray4807[14] - (aFloatArray4807[7] * aFloatArray4807[10] * aFloatArray4807[13])) * f;
		float f_179_ = (-aFloatArray4807[1] * aFloatArray4807[10] * aFloatArray4807[15] + aFloatArray4807[1] * aFloatArray4807[11] * aFloatArray4807[14] + aFloatArray4807[2] * aFloatArray4807[9] * aFloatArray4807[15] - aFloatArray4807[2] * aFloatArray4807[11] * aFloatArray4807[13] - aFloatArray4807[3] * aFloatArray4807[9] * aFloatArray4807[14] + (aFloatArray4807[3] * aFloatArray4807[10] * aFloatArray4807[13])) * f;
		float f_180_ = ((aFloatArray4807[1] * aFloatArray4807[6] * aFloatArray4807[15] - aFloatArray4807[1] * aFloatArray4807[7] * aFloatArray4807[14] - aFloatArray4807[2] * aFloatArray4807[5] * aFloatArray4807[15] + aFloatArray4807[2] * aFloatArray4807[7] * aFloatArray4807[13] + aFloatArray4807[3] * aFloatArray4807[5] * aFloatArray4807[14] - (aFloatArray4807[3] * aFloatArray4807[6] * aFloatArray4807[13])) * f);
		float f_181_ = ((-aFloatArray4807[1] * aFloatArray4807[6] * aFloatArray4807[11] + aFloatArray4807[1] * aFloatArray4807[7] * aFloatArray4807[10] + aFloatArray4807[2] * aFloatArray4807[5] * aFloatArray4807[11] - aFloatArray4807[2] * aFloatArray4807[7] * aFloatArray4807[9] - aFloatArray4807[3] * aFloatArray4807[5] * aFloatArray4807[10] + aFloatArray4807[3] * aFloatArray4807[6] * aFloatArray4807[9]) * f);
		float f_182_ = (-aFloatArray4807[4] * aFloatArray4807[10] * aFloatArray4807[15] + aFloatArray4807[4] * aFloatArray4807[11] * aFloatArray4807[14] + aFloatArray4807[6] * aFloatArray4807[8] * aFloatArray4807[15] - aFloatArray4807[6] * aFloatArray4807[11] * aFloatArray4807[12] - aFloatArray4807[7] * aFloatArray4807[8] * aFloatArray4807[14] + (aFloatArray4807[7] * aFloatArray4807[10] * aFloatArray4807[12])) * f;
		float f_183_ = (aFloatArray4807[0] * aFloatArray4807[10] * aFloatArray4807[15] - aFloatArray4807[0] * aFloatArray4807[11] * aFloatArray4807[14] - aFloatArray4807[2] * aFloatArray4807[8] * aFloatArray4807[15] + aFloatArray4807[2] * aFloatArray4807[11] * aFloatArray4807[12] + aFloatArray4807[3] * aFloatArray4807[8] * aFloatArray4807[14] - (aFloatArray4807[3] * aFloatArray4807[10] * aFloatArray4807[12])) * f;
		float f_184_ = ((-aFloatArray4807[0] * aFloatArray4807[6] * aFloatArray4807[15] + aFloatArray4807[0] * aFloatArray4807[7] * aFloatArray4807[14] + aFloatArray4807[2] * aFloatArray4807[4] * aFloatArray4807[15] - aFloatArray4807[2] * aFloatArray4807[7] * aFloatArray4807[12] - aFloatArray4807[3] * aFloatArray4807[4] * aFloatArray4807[14] + (aFloatArray4807[3] * aFloatArray4807[6] * aFloatArray4807[12])) * f);
		float f_185_ = ((aFloatArray4807[0] * aFloatArray4807[6] * aFloatArray4807[11] - aFloatArray4807[0] * aFloatArray4807[7] * aFloatArray4807[10] - aFloatArray4807[2] * aFloatArray4807[4] * aFloatArray4807[11] + aFloatArray4807[2] * aFloatArray4807[7] * aFloatArray4807[8] + aFloatArray4807[3] * aFloatArray4807[4] * aFloatArray4807[10] - aFloatArray4807[3] * aFloatArray4807[6] * aFloatArray4807[8]) * f);
		float f_186_ = (aFloatArray4807[4] * aFloatArray4807[9] * aFloatArray4807[15] - aFloatArray4807[4] * aFloatArray4807[11] * aFloatArray4807[13] - aFloatArray4807[5] * aFloatArray4807[8] * aFloatArray4807[15] + aFloatArray4807[5] * aFloatArray4807[11] * aFloatArray4807[12] + aFloatArray4807[7] * aFloatArray4807[8] * aFloatArray4807[13] - (aFloatArray4807[7] * aFloatArray4807[9] * aFloatArray4807[12])) * f;
		float f_187_ = (-aFloatArray4807[0] * aFloatArray4807[9] * aFloatArray4807[15] + aFloatArray4807[0] * aFloatArray4807[11] * aFloatArray4807[13] + aFloatArray4807[1] * aFloatArray4807[8] * aFloatArray4807[15] - aFloatArray4807[1] * aFloatArray4807[11] * aFloatArray4807[12] - aFloatArray4807[3] * aFloatArray4807[8] * aFloatArray4807[13] + (aFloatArray4807[3] * aFloatArray4807[9] * aFloatArray4807[12])) * f;
		float f_188_ = ((aFloatArray4807[0] * aFloatArray4807[5] * aFloatArray4807[15] - aFloatArray4807[0] * aFloatArray4807[7] * aFloatArray4807[13] - aFloatArray4807[1] * aFloatArray4807[4] * aFloatArray4807[15] + aFloatArray4807[1] * aFloatArray4807[7] * aFloatArray4807[12] + aFloatArray4807[3] * aFloatArray4807[4] * aFloatArray4807[13] - (aFloatArray4807[3] * aFloatArray4807[5] * aFloatArray4807[12])) * f);
		float f_189_ = ((-aFloatArray4807[0] * aFloatArray4807[5] * aFloatArray4807[11] + aFloatArray4807[0] * aFloatArray4807[7] * aFloatArray4807[9] + aFloatArray4807[1] * aFloatArray4807[4] * aFloatArray4807[11] - aFloatArray4807[1] * aFloatArray4807[7] * aFloatArray4807[8] - aFloatArray4807[3] * aFloatArray4807[4] * aFloatArray4807[9] + aFloatArray4807[3] * aFloatArray4807[5] * aFloatArray4807[8]) * f);
		float f_190_ = (-aFloatArray4807[4] * aFloatArray4807[9] * aFloatArray4807[14] + aFloatArray4807[4] * aFloatArray4807[10] * aFloatArray4807[13] + aFloatArray4807[5] * aFloatArray4807[8] * aFloatArray4807[14] - aFloatArray4807[5] * aFloatArray4807[10] * aFloatArray4807[12] - aFloatArray4807[6] * aFloatArray4807[8] * aFloatArray4807[13] + (aFloatArray4807[6] * aFloatArray4807[9] * aFloatArray4807[12])) * f;
		float f_191_ = (aFloatArray4807[0] * aFloatArray4807[9] * aFloatArray4807[14] - aFloatArray4807[0] * aFloatArray4807[10] * aFloatArray4807[13] - aFloatArray4807[1] * aFloatArray4807[8] * aFloatArray4807[14] + aFloatArray4807[1] * aFloatArray4807[10] * aFloatArray4807[12] + aFloatArray4807[2] * aFloatArray4807[8] * aFloatArray4807[13] - (aFloatArray4807[2] * aFloatArray4807[9] * aFloatArray4807[12])) * f;
		float f_192_ = ((-aFloatArray4807[0] * aFloatArray4807[5] * aFloatArray4807[14] + aFloatArray4807[0] * aFloatArray4807[6] * aFloatArray4807[13] + aFloatArray4807[1] * aFloatArray4807[4] * aFloatArray4807[14] - aFloatArray4807[1] * aFloatArray4807[6] * aFloatArray4807[12] - aFloatArray4807[2] * aFloatArray4807[4] * aFloatArray4807[13] + (aFloatArray4807[2] * aFloatArray4807[5] * aFloatArray4807[12])) * f);
		float f_193_ = ((aFloatArray4807[0] * aFloatArray4807[5] * aFloatArray4807[10] - aFloatArray4807[0] * aFloatArray4807[6] * aFloatArray4807[9] - aFloatArray4807[1] * aFloatArray4807[4] * aFloatArray4807[10] + aFloatArray4807[1] * aFloatArray4807[6] * aFloatArray4807[8] + aFloatArray4807[2] * aFloatArray4807[4] * aFloatArray4807[9] - aFloatArray4807[2] * aFloatArray4807[5] * aFloatArray4807[8]) * f);
		aFloatArray4807[0] = f_178_;
		aFloatArray4807[1] = f_179_;
		aFloatArray4807[2] = f_180_;
		aFloatArray4807[3] = f_181_;
		aFloatArray4807[4] = f_182_;
		aFloatArray4807[5] = f_183_;
		aFloatArray4807[6] = f_184_;
		aFloatArray4807[7] = f_185_;
		aFloatArray4807[8] = f_186_;
		aFloatArray4807[9] = f_187_;
		aFloatArray4807[10] = f_188_;
		aFloatArray4807[11] = f_189_;
		aFloatArray4807[12] = f_190_;
		aFloatArray4807[13] = f_191_;
		aFloatArray4807[14] = f_192_;
		aFloatArray4807[15] = f_193_;
	}

	public void method6796() {
		float f = 1.0F / method6854();
		float f_194_ = (aFloatArray4807[5] * aFloatArray4807[10] * aFloatArray4807[15] - aFloatArray4807[5] * aFloatArray4807[11] * aFloatArray4807[14] - aFloatArray4807[6] * aFloatArray4807[9] * aFloatArray4807[15] + aFloatArray4807[6] * aFloatArray4807[11] * aFloatArray4807[13] + aFloatArray4807[7] * aFloatArray4807[9] * aFloatArray4807[14] - (aFloatArray4807[7] * aFloatArray4807[10] * aFloatArray4807[13])) * f;
		float f_195_ = (-aFloatArray4807[1] * aFloatArray4807[10] * aFloatArray4807[15] + aFloatArray4807[1] * aFloatArray4807[11] * aFloatArray4807[14] + aFloatArray4807[2] * aFloatArray4807[9] * aFloatArray4807[15] - aFloatArray4807[2] * aFloatArray4807[11] * aFloatArray4807[13] - aFloatArray4807[3] * aFloatArray4807[9] * aFloatArray4807[14] + (aFloatArray4807[3] * aFloatArray4807[10] * aFloatArray4807[13])) * f;
		float f_196_ = ((aFloatArray4807[1] * aFloatArray4807[6] * aFloatArray4807[15] - aFloatArray4807[1] * aFloatArray4807[7] * aFloatArray4807[14] - aFloatArray4807[2] * aFloatArray4807[5] * aFloatArray4807[15] + aFloatArray4807[2] * aFloatArray4807[7] * aFloatArray4807[13] + aFloatArray4807[3] * aFloatArray4807[5] * aFloatArray4807[14] - (aFloatArray4807[3] * aFloatArray4807[6] * aFloatArray4807[13])) * f);
		float f_197_ = ((-aFloatArray4807[1] * aFloatArray4807[6] * aFloatArray4807[11] + aFloatArray4807[1] * aFloatArray4807[7] * aFloatArray4807[10] + aFloatArray4807[2] * aFloatArray4807[5] * aFloatArray4807[11] - aFloatArray4807[2] * aFloatArray4807[7] * aFloatArray4807[9] - aFloatArray4807[3] * aFloatArray4807[5] * aFloatArray4807[10] + aFloatArray4807[3] * aFloatArray4807[6] * aFloatArray4807[9]) * f);
		float f_198_ = (-aFloatArray4807[4] * aFloatArray4807[10] * aFloatArray4807[15] + aFloatArray4807[4] * aFloatArray4807[11] * aFloatArray4807[14] + aFloatArray4807[6] * aFloatArray4807[8] * aFloatArray4807[15] - aFloatArray4807[6] * aFloatArray4807[11] * aFloatArray4807[12] - aFloatArray4807[7] * aFloatArray4807[8] * aFloatArray4807[14] + (aFloatArray4807[7] * aFloatArray4807[10] * aFloatArray4807[12])) * f;
		float f_199_ = (aFloatArray4807[0] * aFloatArray4807[10] * aFloatArray4807[15] - aFloatArray4807[0] * aFloatArray4807[11] * aFloatArray4807[14] - aFloatArray4807[2] * aFloatArray4807[8] * aFloatArray4807[15] + aFloatArray4807[2] * aFloatArray4807[11] * aFloatArray4807[12] + aFloatArray4807[3] * aFloatArray4807[8] * aFloatArray4807[14] - (aFloatArray4807[3] * aFloatArray4807[10] * aFloatArray4807[12])) * f;
		float f_200_ = ((-aFloatArray4807[0] * aFloatArray4807[6] * aFloatArray4807[15] + aFloatArray4807[0] * aFloatArray4807[7] * aFloatArray4807[14] + aFloatArray4807[2] * aFloatArray4807[4] * aFloatArray4807[15] - aFloatArray4807[2] * aFloatArray4807[7] * aFloatArray4807[12] - aFloatArray4807[3] * aFloatArray4807[4] * aFloatArray4807[14] + (aFloatArray4807[3] * aFloatArray4807[6] * aFloatArray4807[12])) * f);
		float f_201_ = ((aFloatArray4807[0] * aFloatArray4807[6] * aFloatArray4807[11] - aFloatArray4807[0] * aFloatArray4807[7] * aFloatArray4807[10] - aFloatArray4807[2] * aFloatArray4807[4] * aFloatArray4807[11] + aFloatArray4807[2] * aFloatArray4807[7] * aFloatArray4807[8] + aFloatArray4807[3] * aFloatArray4807[4] * aFloatArray4807[10] - aFloatArray4807[3] * aFloatArray4807[6] * aFloatArray4807[8]) * f);
		float f_202_ = (aFloatArray4807[4] * aFloatArray4807[9] * aFloatArray4807[15] - aFloatArray4807[4] * aFloatArray4807[11] * aFloatArray4807[13] - aFloatArray4807[5] * aFloatArray4807[8] * aFloatArray4807[15] + aFloatArray4807[5] * aFloatArray4807[11] * aFloatArray4807[12] + aFloatArray4807[7] * aFloatArray4807[8] * aFloatArray4807[13] - (aFloatArray4807[7] * aFloatArray4807[9] * aFloatArray4807[12])) * f;
		float f_203_ = (-aFloatArray4807[0] * aFloatArray4807[9] * aFloatArray4807[15] + aFloatArray4807[0] * aFloatArray4807[11] * aFloatArray4807[13] + aFloatArray4807[1] * aFloatArray4807[8] * aFloatArray4807[15] - aFloatArray4807[1] * aFloatArray4807[11] * aFloatArray4807[12] - aFloatArray4807[3] * aFloatArray4807[8] * aFloatArray4807[13] + (aFloatArray4807[3] * aFloatArray4807[9] * aFloatArray4807[12])) * f;
		float f_204_ = ((aFloatArray4807[0] * aFloatArray4807[5] * aFloatArray4807[15] - aFloatArray4807[0] * aFloatArray4807[7] * aFloatArray4807[13] - aFloatArray4807[1] * aFloatArray4807[4] * aFloatArray4807[15] + aFloatArray4807[1] * aFloatArray4807[7] * aFloatArray4807[12] + aFloatArray4807[3] * aFloatArray4807[4] * aFloatArray4807[13] - (aFloatArray4807[3] * aFloatArray4807[5] * aFloatArray4807[12])) * f);
		float f_205_ = ((-aFloatArray4807[0] * aFloatArray4807[5] * aFloatArray4807[11] + aFloatArray4807[0] * aFloatArray4807[7] * aFloatArray4807[9] + aFloatArray4807[1] * aFloatArray4807[4] * aFloatArray4807[11] - aFloatArray4807[1] * aFloatArray4807[7] * aFloatArray4807[8] - aFloatArray4807[3] * aFloatArray4807[4] * aFloatArray4807[9] + aFloatArray4807[3] * aFloatArray4807[5] * aFloatArray4807[8]) * f);
		float f_206_ = (-aFloatArray4807[4] * aFloatArray4807[9] * aFloatArray4807[14] + aFloatArray4807[4] * aFloatArray4807[10] * aFloatArray4807[13] + aFloatArray4807[5] * aFloatArray4807[8] * aFloatArray4807[14] - aFloatArray4807[5] * aFloatArray4807[10] * aFloatArray4807[12] - aFloatArray4807[6] * aFloatArray4807[8] * aFloatArray4807[13] + (aFloatArray4807[6] * aFloatArray4807[9] * aFloatArray4807[12])) * f;
		float f_207_ = (aFloatArray4807[0] * aFloatArray4807[9] * aFloatArray4807[14] - aFloatArray4807[0] * aFloatArray4807[10] * aFloatArray4807[13] - aFloatArray4807[1] * aFloatArray4807[8] * aFloatArray4807[14] + aFloatArray4807[1] * aFloatArray4807[10] * aFloatArray4807[12] + aFloatArray4807[2] * aFloatArray4807[8] * aFloatArray4807[13] - (aFloatArray4807[2] * aFloatArray4807[9] * aFloatArray4807[12])) * f;
		float f_208_ = ((-aFloatArray4807[0] * aFloatArray4807[5] * aFloatArray4807[14] + aFloatArray4807[0] * aFloatArray4807[6] * aFloatArray4807[13] + aFloatArray4807[1] * aFloatArray4807[4] * aFloatArray4807[14] - aFloatArray4807[1] * aFloatArray4807[6] * aFloatArray4807[12] - aFloatArray4807[2] * aFloatArray4807[4] * aFloatArray4807[13] + (aFloatArray4807[2] * aFloatArray4807[5] * aFloatArray4807[12])) * f);
		float f_209_ = ((aFloatArray4807[0] * aFloatArray4807[5] * aFloatArray4807[10] - aFloatArray4807[0] * aFloatArray4807[6] * aFloatArray4807[9] - aFloatArray4807[1] * aFloatArray4807[4] * aFloatArray4807[10] + aFloatArray4807[1] * aFloatArray4807[6] * aFloatArray4807[8] + aFloatArray4807[2] * aFloatArray4807[4] * aFloatArray4807[9] - aFloatArray4807[2] * aFloatArray4807[5] * aFloatArray4807[8]) * f);
		aFloatArray4807[0] = f_194_;
		aFloatArray4807[1] = f_195_;
		aFloatArray4807[2] = f_196_;
		aFloatArray4807[3] = f_197_;
		aFloatArray4807[4] = f_198_;
		aFloatArray4807[5] = f_199_;
		aFloatArray4807[6] = f_200_;
		aFloatArray4807[7] = f_201_;
		aFloatArray4807[8] = f_202_;
		aFloatArray4807[9] = f_203_;
		aFloatArray4807[10] = f_204_;
		aFloatArray4807[11] = f_205_;
		aFloatArray4807[12] = f_206_;
		aFloatArray4807[13] = f_207_;
		aFloatArray4807[14] = f_208_;
		aFloatArray4807[15] = f_209_;
	}

	public void method6797() {
		float f = 1.0F / method6854();
		float f_210_ = (aFloatArray4807[5] * aFloatArray4807[10] * aFloatArray4807[15] - aFloatArray4807[5] * aFloatArray4807[11] * aFloatArray4807[14] - aFloatArray4807[6] * aFloatArray4807[9] * aFloatArray4807[15] + aFloatArray4807[6] * aFloatArray4807[11] * aFloatArray4807[13] + aFloatArray4807[7] * aFloatArray4807[9] * aFloatArray4807[14] - (aFloatArray4807[7] * aFloatArray4807[10] * aFloatArray4807[13])) * f;
		float f_211_ = (-aFloatArray4807[1] * aFloatArray4807[10] * aFloatArray4807[15] + aFloatArray4807[1] * aFloatArray4807[11] * aFloatArray4807[14] + aFloatArray4807[2] * aFloatArray4807[9] * aFloatArray4807[15] - aFloatArray4807[2] * aFloatArray4807[11] * aFloatArray4807[13] - aFloatArray4807[3] * aFloatArray4807[9] * aFloatArray4807[14] + (aFloatArray4807[3] * aFloatArray4807[10] * aFloatArray4807[13])) * f;
		float f_212_ = ((aFloatArray4807[1] * aFloatArray4807[6] * aFloatArray4807[15] - aFloatArray4807[1] * aFloatArray4807[7] * aFloatArray4807[14] - aFloatArray4807[2] * aFloatArray4807[5] * aFloatArray4807[15] + aFloatArray4807[2] * aFloatArray4807[7] * aFloatArray4807[13] + aFloatArray4807[3] * aFloatArray4807[5] * aFloatArray4807[14] - (aFloatArray4807[3] * aFloatArray4807[6] * aFloatArray4807[13])) * f);
		float f_213_ = ((-aFloatArray4807[1] * aFloatArray4807[6] * aFloatArray4807[11] + aFloatArray4807[1] * aFloatArray4807[7] * aFloatArray4807[10] + aFloatArray4807[2] * aFloatArray4807[5] * aFloatArray4807[11] - aFloatArray4807[2] * aFloatArray4807[7] * aFloatArray4807[9] - aFloatArray4807[3] * aFloatArray4807[5] * aFloatArray4807[10] + aFloatArray4807[3] * aFloatArray4807[6] * aFloatArray4807[9]) * f);
		float f_214_ = (-aFloatArray4807[4] * aFloatArray4807[10] * aFloatArray4807[15] + aFloatArray4807[4] * aFloatArray4807[11] * aFloatArray4807[14] + aFloatArray4807[6] * aFloatArray4807[8] * aFloatArray4807[15] - aFloatArray4807[6] * aFloatArray4807[11] * aFloatArray4807[12] - aFloatArray4807[7] * aFloatArray4807[8] * aFloatArray4807[14] + (aFloatArray4807[7] * aFloatArray4807[10] * aFloatArray4807[12])) * f;
		float f_215_ = (aFloatArray4807[0] * aFloatArray4807[10] * aFloatArray4807[15] - aFloatArray4807[0] * aFloatArray4807[11] * aFloatArray4807[14] - aFloatArray4807[2] * aFloatArray4807[8] * aFloatArray4807[15] + aFloatArray4807[2] * aFloatArray4807[11] * aFloatArray4807[12] + aFloatArray4807[3] * aFloatArray4807[8] * aFloatArray4807[14] - (aFloatArray4807[3] * aFloatArray4807[10] * aFloatArray4807[12])) * f;
		float f_216_ = ((-aFloatArray4807[0] * aFloatArray4807[6] * aFloatArray4807[15] + aFloatArray4807[0] * aFloatArray4807[7] * aFloatArray4807[14] + aFloatArray4807[2] * aFloatArray4807[4] * aFloatArray4807[15] - aFloatArray4807[2] * aFloatArray4807[7] * aFloatArray4807[12] - aFloatArray4807[3] * aFloatArray4807[4] * aFloatArray4807[14] + (aFloatArray4807[3] * aFloatArray4807[6] * aFloatArray4807[12])) * f);
		float f_217_ = ((aFloatArray4807[0] * aFloatArray4807[6] * aFloatArray4807[11] - aFloatArray4807[0] * aFloatArray4807[7] * aFloatArray4807[10] - aFloatArray4807[2] * aFloatArray4807[4] * aFloatArray4807[11] + aFloatArray4807[2] * aFloatArray4807[7] * aFloatArray4807[8] + aFloatArray4807[3] * aFloatArray4807[4] * aFloatArray4807[10] - aFloatArray4807[3] * aFloatArray4807[6] * aFloatArray4807[8]) * f);
		float f_218_ = (aFloatArray4807[4] * aFloatArray4807[9] * aFloatArray4807[15] - aFloatArray4807[4] * aFloatArray4807[11] * aFloatArray4807[13] - aFloatArray4807[5] * aFloatArray4807[8] * aFloatArray4807[15] + aFloatArray4807[5] * aFloatArray4807[11] * aFloatArray4807[12] + aFloatArray4807[7] * aFloatArray4807[8] * aFloatArray4807[13] - (aFloatArray4807[7] * aFloatArray4807[9] * aFloatArray4807[12])) * f;
		float f_219_ = (-aFloatArray4807[0] * aFloatArray4807[9] * aFloatArray4807[15] + aFloatArray4807[0] * aFloatArray4807[11] * aFloatArray4807[13] + aFloatArray4807[1] * aFloatArray4807[8] * aFloatArray4807[15] - aFloatArray4807[1] * aFloatArray4807[11] * aFloatArray4807[12] - aFloatArray4807[3] * aFloatArray4807[8] * aFloatArray4807[13] + (aFloatArray4807[3] * aFloatArray4807[9] * aFloatArray4807[12])) * f;
		float f_220_ = ((aFloatArray4807[0] * aFloatArray4807[5] * aFloatArray4807[15] - aFloatArray4807[0] * aFloatArray4807[7] * aFloatArray4807[13] - aFloatArray4807[1] * aFloatArray4807[4] * aFloatArray4807[15] + aFloatArray4807[1] * aFloatArray4807[7] * aFloatArray4807[12] + aFloatArray4807[3] * aFloatArray4807[4] * aFloatArray4807[13] - (aFloatArray4807[3] * aFloatArray4807[5] * aFloatArray4807[12])) * f);
		float f_221_ = ((-aFloatArray4807[0] * aFloatArray4807[5] * aFloatArray4807[11] + aFloatArray4807[0] * aFloatArray4807[7] * aFloatArray4807[9] + aFloatArray4807[1] * aFloatArray4807[4] * aFloatArray4807[11] - aFloatArray4807[1] * aFloatArray4807[7] * aFloatArray4807[8] - aFloatArray4807[3] * aFloatArray4807[4] * aFloatArray4807[9] + aFloatArray4807[3] * aFloatArray4807[5] * aFloatArray4807[8]) * f);
		float f_222_ = (-aFloatArray4807[4] * aFloatArray4807[9] * aFloatArray4807[14] + aFloatArray4807[4] * aFloatArray4807[10] * aFloatArray4807[13] + aFloatArray4807[5] * aFloatArray4807[8] * aFloatArray4807[14] - aFloatArray4807[5] * aFloatArray4807[10] * aFloatArray4807[12] - aFloatArray4807[6] * aFloatArray4807[8] * aFloatArray4807[13] + (aFloatArray4807[6] * aFloatArray4807[9] * aFloatArray4807[12])) * f;
		float f_223_ = (aFloatArray4807[0] * aFloatArray4807[9] * aFloatArray4807[14] - aFloatArray4807[0] * aFloatArray4807[10] * aFloatArray4807[13] - aFloatArray4807[1] * aFloatArray4807[8] * aFloatArray4807[14] + aFloatArray4807[1] * aFloatArray4807[10] * aFloatArray4807[12] + aFloatArray4807[2] * aFloatArray4807[8] * aFloatArray4807[13] - (aFloatArray4807[2] * aFloatArray4807[9] * aFloatArray4807[12])) * f;
		float f_224_ = ((-aFloatArray4807[0] * aFloatArray4807[5] * aFloatArray4807[14] + aFloatArray4807[0] * aFloatArray4807[6] * aFloatArray4807[13] + aFloatArray4807[1] * aFloatArray4807[4] * aFloatArray4807[14] - aFloatArray4807[1] * aFloatArray4807[6] * aFloatArray4807[12] - aFloatArray4807[2] * aFloatArray4807[4] * aFloatArray4807[13] + (aFloatArray4807[2] * aFloatArray4807[5] * aFloatArray4807[12])) * f);
		float f_225_ = ((aFloatArray4807[0] * aFloatArray4807[5] * aFloatArray4807[10] - aFloatArray4807[0] * aFloatArray4807[6] * aFloatArray4807[9] - aFloatArray4807[1] * aFloatArray4807[4] * aFloatArray4807[10] + aFloatArray4807[1] * aFloatArray4807[6] * aFloatArray4807[8] + aFloatArray4807[2] * aFloatArray4807[4] * aFloatArray4807[9] - aFloatArray4807[2] * aFloatArray4807[5] * aFloatArray4807[8]) * f);
		aFloatArray4807[0] = f_210_;
		aFloatArray4807[1] = f_211_;
		aFloatArray4807[2] = f_212_;
		aFloatArray4807[3] = f_213_;
		aFloatArray4807[4] = f_214_;
		aFloatArray4807[5] = f_215_;
		aFloatArray4807[6] = f_216_;
		aFloatArray4807[7] = f_217_;
		aFloatArray4807[8] = f_218_;
		aFloatArray4807[9] = f_219_;
		aFloatArray4807[10] = f_220_;
		aFloatArray4807[11] = f_221_;
		aFloatArray4807[12] = f_222_;
		aFloatArray4807[13] = f_223_;
		aFloatArray4807[14] = f_224_;
		aFloatArray4807[15] = f_225_;
	}

	public void method6798(float f, float f_226_, float f_227_, float f_228_) {
		aFloatArray4807[0] = f;
		aFloatArray4807[1] = 0.0F;
		aFloatArray4807[2] = 0.0F;
		aFloatArray4807[3] = 0.0F;
		aFloatArray4807[4] = 0.0F;
		aFloatArray4807[5] = f_226_;
		aFloatArray4807[6] = 0.0F;
		aFloatArray4807[7] = 0.0F;
		aFloatArray4807[8] = 0.0F;
		aFloatArray4807[9] = 0.0F;
		aFloatArray4807[10] = f_227_;
		aFloatArray4807[11] = 0.0F;
		aFloatArray4807[12] = 0.0F;
		aFloatArray4807[13] = 0.0F;
		aFloatArray4807[14] = 0.0F;
		aFloatArray4807[15] = f_228_;
	}

	public void method6799(float f, float f_229_, float f_230_, float f_231_) {
		aFloatArray4807[0] = f;
		aFloatArray4807[1] = 0.0F;
		aFloatArray4807[2] = 0.0F;
		aFloatArray4807[3] = 0.0F;
		aFloatArray4807[4] = 0.0F;
		aFloatArray4807[5] = f_229_;
		aFloatArray4807[6] = 0.0F;
		aFloatArray4807[7] = 0.0F;
		aFloatArray4807[8] = 0.0F;
		aFloatArray4807[9] = 0.0F;
		aFloatArray4807[10] = f_230_;
		aFloatArray4807[11] = 0.0F;
		aFloatArray4807[12] = 0.0F;
		aFloatArray4807[13] = 0.0F;
		aFloatArray4807[14] = 0.0F;
		aFloatArray4807[15] = f_231_;
	}

	public void method6800(float f, float f_232_, float f_233_, float f_234_) {
		aFloatArray4807[0] = f;
		aFloatArray4807[1] = 0.0F;
		aFloatArray4807[2] = 0.0F;
		aFloatArray4807[3] = 0.0F;
		aFloatArray4807[4] = 0.0F;
		aFloatArray4807[5] = f_232_;
		aFloatArray4807[6] = 0.0F;
		aFloatArray4807[7] = 0.0F;
		aFloatArray4807[8] = 0.0F;
		aFloatArray4807[9] = 0.0F;
		aFloatArray4807[10] = f_233_;
		aFloatArray4807[11] = 0.0F;
		aFloatArray4807[12] = 0.0F;
		aFloatArray4807[13] = 0.0F;
		aFloatArray4807[14] = 0.0F;
		aFloatArray4807[15] = f_234_;
	}

	public boolean method6801() {
		return (aFloatArray4807[0] == 1.0F && aFloatArray4807[1] == 0.0F && aFloatArray4807[2] == 0.0F && aFloatArray4807[3] == 0.0F && aFloatArray4807[4] == 0.0F && aFloatArray4807[5] == 1.0F && aFloatArray4807[6] == 0.0F && aFloatArray4807[7] == 0.0F && aFloatArray4807[8] == 0.0F && aFloatArray4807[9] == 0.0F && aFloatArray4807[10] == 1.0F && aFloatArray4807[11] == 0.0F && aFloatArray4807[12] == 0.0F && aFloatArray4807[13] == 0.0F && aFloatArray4807[14] == 0.0F && aFloatArray4807[15] == 1.0F);
	}

	public boolean method6802() {
		return (aFloatArray4807[0] == 1.0F && aFloatArray4807[1] == 0.0F && aFloatArray4807[2] == 0.0F && aFloatArray4807[3] == 0.0F && aFloatArray4807[4] == 0.0F && aFloatArray4807[5] == 1.0F && aFloatArray4807[6] == 0.0F && aFloatArray4807[7] == 0.0F && aFloatArray4807[8] == 0.0F && aFloatArray4807[9] == 0.0F && aFloatArray4807[10] == 1.0F && aFloatArray4807[11] == 0.0F && aFloatArray4807[12] == 0.0F && aFloatArray4807[13] == 0.0F && aFloatArray4807[14] == 0.0F && aFloatArray4807[15] == 1.0F);
	}

	public void method6803(float f, float f_235_, float f_236_, float[] fs) {
		fs[0] = (aFloatArray4807[0] * f + aFloatArray4807[4] * f_235_ + aFloatArray4807[8] * f_236_ + aFloatArray4807[12]);
		fs[1] = (aFloatArray4807[1] * f + aFloatArray4807[5] * f_235_ + aFloatArray4807[9] * f_236_ + aFloatArray4807[13]);
		fs[2] = (aFloatArray4807[2] * f + aFloatArray4807[6] * f_235_ + aFloatArray4807[10] * f_236_ + aFloatArray4807[14]);
		if (fs.length > 3)
			fs[3] = (aFloatArray4807[3] * f + aFloatArray4807[7] * f_235_ + aFloatArray4807[11] * f_236_ + aFloatArray4807[15]);
	}

	public void method6804(int i, int i_237_, int i_238_, float f, float f_239_, float f_240_) {
		if (i != 0) {
			float f_241_ = Class436.aFloatArray4880[i & 0x3fff];
			float f_242_ = Class436.aFloatArray4879[i & 0x3fff];
			aFloatArray4807[0] = f_241_ * (float) i_237_;
			aFloatArray4807[5] = f_241_ * (float) i_238_;
			aFloatArray4807[1] = f_242_ * (float) i_237_;
			aFloatArray4807[4] = -f_242_ * (float) i_238_;
			aFloatArray4807[10] = 1.0F;
			float[] fs = aFloatArray4807;
			float[] fs_243_ = aFloatArray4807;
			float[] fs_244_ = aFloatArray4807;
			aFloatArray4807[9] = 0.0F;
			fs_244_[8] = 0.0F;
			fs_243_[6] = 0.0F;
			fs[2] = 0.0F;
		} else {
			aFloatArray4807[0] = (float) i_237_;
			aFloatArray4807[5] = (float) i_238_;
			aFloatArray4807[10] = 1.0F;
			float[] fs = aFloatArray4807;
			float[] fs_245_ = aFloatArray4807;
			float[] fs_246_ = aFloatArray4807;
			float[] fs_247_ = aFloatArray4807;
			float[] fs_248_ = aFloatArray4807;
			aFloatArray4807[9] = 0.0F;
			fs_248_[8] = 0.0F;
			fs_247_[6] = 0.0F;
			fs_246_[4] = 0.0F;
			fs_245_[2] = 0.0F;
			fs[1] = 0.0F;
		}
		float[] fs = aFloatArray4807;
		float[] fs_249_ = aFloatArray4807;
		aFloatArray4807[11] = 0.0F;
		fs_249_[7] = 0.0F;
		fs[3] = 0.0F;
		aFloatArray4807[15] = 1.0F;
		aFloatArray4807[12] = f;
		aFloatArray4807[13] = f_239_;
		aFloatArray4807[14] = f_240_;
	}

	void method6805(float f, float f_250_, float f_251_, float f_252_, float f_253_, float f_254_) {
		aFloatArray4807[0] = 2.0F * f_253_ / (f_250_ - f);
		aFloatArray4807[1] = 0.0F;
		aFloatArray4807[2] = 0.0F;
		aFloatArray4807[3] = 0.0F;
		aFloatArray4807[4] = 0.0F;
		aFloatArray4807[5] = 2.0F * f_253_ / (f_252_ - f_251_);
		aFloatArray4807[6] = 0.0F;
		aFloatArray4807[7] = 0.0F;
		aFloatArray4807[8] = (f_250_ + f) / (f_250_ - f);
		aFloatArray4807[9] = (f_252_ + f_251_) / (f_252_ - f_251_);
		aFloatArray4807[10] = (f_254_ + f_253_) / (f_254_ - f_253_);
		aFloatArray4807[11] = 1.0F;
		aFloatArray4807[12] = 0.0F;
		aFloatArray4807[13] = 0.0F;
		aFloatArray4807[14] = -(2.0F * f_254_ * f_253_) / (f_254_ - f_253_);
		aFloatArray4807[15] = 0.0F;
	}

	public void method6806(float f, float f_255_, float f_256_, float[] fs) {
		fs[0] = (aFloatArray4807[0] * f + aFloatArray4807[4] * f_255_ + aFloatArray4807[8] * f_256_ + aFloatArray4807[12]);
		fs[1] = (aFloatArray4807[1] * f + aFloatArray4807[5] * f_255_ + aFloatArray4807[9] * f_256_ + aFloatArray4807[13]);
		fs[2] = (aFloatArray4807[2] * f + aFloatArray4807[6] * f_255_ + aFloatArray4807[10] * f_256_ + aFloatArray4807[14]);
		if (fs.length > 3)
			fs[3] = (aFloatArray4807[3] * f + aFloatArray4807[7] * f_255_ + aFloatArray4807[11] * f_256_ + aFloatArray4807[15]);
	}

	public void method6807(float[] fs) {
		float f = fs[0];
		float f_257_ = fs[1];
		float f_258_ = fs[2];
		fs[0] = (aFloatArray4807[0] * f + aFloatArray4807[4] * f_257_ + aFloatArray4807[8] * f_258_ + aFloatArray4807[12]);
		fs[1] = (aFloatArray4807[1] * f + aFloatArray4807[5] * f_257_ + aFloatArray4807[9] * f_258_ + aFloatArray4807[13]);
		fs[2] = (aFloatArray4807[2] * f + aFloatArray4807[6] * f_257_ + aFloatArray4807[10] * f_258_ + aFloatArray4807[14]);
	}

	public float[] method6808(float[] fs) {
		System.arraycopy(aFloatArray4807, 0, fs, 0, 16);
		return fs;
	}

	public void method6809(float f, float f_259_, float f_260_, float f_261_, float f_262_, float f_263_) {
		aFloatArray4807[0] = 2.0F / (f_259_ - f);
		aFloatArray4807[1] = 0.0F;
		aFloatArray4807[2] = 0.0F;
		aFloatArray4807[3] = 0.0F;
		aFloatArray4807[4] = 0.0F;
		aFloatArray4807[5] = 2.0F / (f_261_ - f_260_);
		aFloatArray4807[6] = 0.0F;
		aFloatArray4807[7] = 0.0F;
		aFloatArray4807[8] = 0.0F;
		aFloatArray4807[9] = 0.0F;
		aFloatArray4807[10] = 2.0F / (f_263_ - f_262_);
		aFloatArray4807[11] = 0.0F;
		aFloatArray4807[12] = -(f_259_ + f) / (f_259_ - f);
		aFloatArray4807[13] = -(f_261_ + f_260_) / (f_261_ - f_260_);
		aFloatArray4807[14] = -(f_263_ + f_262_) / (f_263_ - f_262_);
		aFloatArray4807[15] = 1.0F;
	}

	public void method6810(float f, float f_264_, float f_265_, float f_266_, float f_267_, float f_268_) {
		aFloatArray4807[0] = 2.0F / (f_264_ - f);
		aFloatArray4807[1] = 0.0F;
		aFloatArray4807[2] = 0.0F;
		aFloatArray4807[3] = 0.0F;
		aFloatArray4807[4] = 0.0F;
		aFloatArray4807[5] = 2.0F / (f_266_ - f_265_);
		aFloatArray4807[6] = 0.0F;
		aFloatArray4807[7] = 0.0F;
		aFloatArray4807[8] = 0.0F;
		aFloatArray4807[9] = 0.0F;
		aFloatArray4807[10] = 2.0F / (f_268_ - f_267_);
		aFloatArray4807[11] = 0.0F;
		aFloatArray4807[12] = -(f_264_ + f) / (f_264_ - f);
		aFloatArray4807[13] = -(f_266_ + f_265_) / (f_266_ - f_265_);
		aFloatArray4807[14] = -(f_268_ + f_267_) / (f_268_ - f_267_);
		aFloatArray4807[15] = 1.0F;
	}

	public void method6811(float f, float f_269_, float f_270_, float f_271_, float f_272_, float f_273_) {
		aFloatArray4807[0] = 2.0F / (f_269_ - f);
		aFloatArray4807[1] = 0.0F;
		aFloatArray4807[2] = 0.0F;
		aFloatArray4807[3] = 0.0F;
		aFloatArray4807[4] = 0.0F;
		aFloatArray4807[5] = 2.0F / (f_271_ - f_270_);
		aFloatArray4807[6] = 0.0F;
		aFloatArray4807[7] = 0.0F;
		aFloatArray4807[8] = 0.0F;
		aFloatArray4807[9] = 0.0F;
		aFloatArray4807[10] = 2.0F / (f_273_ - f_272_);
		aFloatArray4807[11] = 0.0F;
		aFloatArray4807[12] = -(f_269_ + f) / (f_269_ - f);
		aFloatArray4807[13] = -(f_271_ + f_270_) / (f_271_ - f_270_);
		aFloatArray4807[14] = -(f_273_ + f_272_) / (f_273_ - f_272_);
		aFloatArray4807[15] = 1.0F;
	}

	public float[] method6812(float[] fs) {
		float f = aFloatArray4807[3] + aFloatArray4807[2];
		float f_274_ = aFloatArray4807[7] + aFloatArray4807[6];
		float f_275_ = aFloatArray4807[11] + aFloatArray4807[10];
		double d = Math.sqrt((double) (f * f + f_274_ * f_274_ + f_275_ * f_275_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_274_ / d);
		fs[2] = (float) ((double) f_275_ / d);
		fs[3] = (float) ((double) (aFloatArray4807[15] + aFloatArray4807[14]) / d);
		return fs;
	}

	public void method6813(float f, float f_276_, float f_277_, float f_278_) {
		float f_279_ = (float) (Math.tan((double) (f_277_ / 2.0F)) * (double) f);
		float f_280_ = (float) (Math.tan((double) (f_278_ / 2.0F)) * (double) f);
		method6785(-f_279_, f_279_, -f_280_, f_280_, f, f_276_);
	}

	public void method6814(float f, float f_281_, float f_282_, float f_283_) {
		float f_284_ = (float) (Math.tan((double) (f_282_ / 2.0F)) * (double) f);
		float f_285_ = (float) (Math.tan((double) (f_283_ / 2.0F)) * (double) f);
		method6785(-f_284_, f_284_, -f_285_, f_285_, f, f_281_);
	}

	public void method6815(float f, float f_286_, float f_287_, float f_288_) {
		aFloatArray4807[0] = f;
		aFloatArray4807[1] = 0.0F;
		aFloatArray4807[2] = 0.0F;
		aFloatArray4807[3] = 0.0F;
		aFloatArray4807[4] = 0.0F;
		aFloatArray4807[5] = f_286_;
		aFloatArray4807[6] = 0.0F;
		aFloatArray4807[7] = 0.0F;
		aFloatArray4807[8] = 0.0F;
		aFloatArray4807[9] = 0.0F;
		aFloatArray4807[10] = f_287_;
		aFloatArray4807[11] = 0.0F;
		aFloatArray4807[12] = 0.0F;
		aFloatArray4807[13] = 0.0F;
		aFloatArray4807[14] = 0.0F;
		aFloatArray4807[15] = f_288_;
	}

	public int method6816() {
		int i = 1;
		i = 31 * i + Arrays.hashCode(aFloatArray4807);
		return i;
	}

	public void method6817(float f, float f_289_, float f_290_) {
		method6748(-10000.0F / f_290_, 10000.0F / f_290_, -10000.0F / f_290_, 10000.0F / f_290_, f, f_289_);
	}

	public void method6818(float f, float f_291_, float f_292_) {
		method6748(-10000.0F / f_292_, 10000.0F / f_292_, -10000.0F / f_292_, 10000.0F / f_292_, f, f_291_);
	}

	public boolean equals(Object object) {
		if (!(object instanceof Class427))
			return false;
		Class427 class427_293_ = (Class427) object;
		for (int i = 0; i < 16; i++) {
			if (aFloatArray4807[i] != class427_293_.aFloatArray4807[i])
				return false;
		}
		return true;
	}

	public void method6819(Class427 class427_294_) {
		System.arraycopy(class427_294_.aFloatArray4807, 0, aFloatArray4807, 0, 16);
	}

	void method6820(float f, float f_295_, float f_296_, float f_297_, float f_298_, float f_299_) {
		aFloatArray4807[0] = 2.0F * f_298_ / (f_295_ - f);
		aFloatArray4807[1] = 0.0F;
		aFloatArray4807[2] = 0.0F;
		aFloatArray4807[3] = 0.0F;
		aFloatArray4807[4] = 0.0F;
		aFloatArray4807[5] = 2.0F * f_298_ / (f_297_ - f_296_);
		aFloatArray4807[6] = 0.0F;
		aFloatArray4807[7] = 0.0F;
		aFloatArray4807[8] = (f_295_ + f) / (f_295_ - f);
		aFloatArray4807[9] = (f_297_ + f_296_) / (f_297_ - f_296_);
		aFloatArray4807[10] = (f_299_ + f_298_) / (f_299_ - f_298_);
		aFloatArray4807[11] = 1.0F;
		aFloatArray4807[12] = 0.0F;
		aFloatArray4807[13] = 0.0F;
		aFloatArray4807[14] = -(2.0F * f_299_ * f_298_) / (f_299_ - f_298_);
		aFloatArray4807[15] = 0.0F;
	}

	public void method6821(float f, float f_300_, float f_301_, float f_302_, float f_303_, float f_304_, float f_305_, float f_306_) {
		aFloatArray4807[0] = f_301_ * 2.0F / f_305_;
		aFloatArray4807[1] = 0.0F;
		aFloatArray4807[2] = 0.0F;
		aFloatArray4807[3] = 0.0F;
		aFloatArray4807[4] = 0.0F;
		aFloatArray4807[5] = f_302_ * 2.0F / f_306_;
		aFloatArray4807[6] = 0.0F;
		aFloatArray4807[7] = 0.0F;
		aFloatArray4807[8] = 2.0F * f / f_305_ - 1.0F;
		aFloatArray4807[9] = 2.0F * f_300_ / f_306_ - 1.0F;
		aFloatArray4807[10] = (f_304_ + f_303_) / (f_304_ - f_303_);
		aFloatArray4807[11] = 1.0F;
		aFloatArray4807[12] = 0.0F;
		aFloatArray4807[13] = 0.0F;
		aFloatArray4807[14] = 2.0F * f_304_ * f_303_ / (f_303_ - f_304_);
		aFloatArray4807[15] = 0.0F;
	}

	public void method6822(float f, float f_307_, float f_308_, float f_309_, float f_310_, float f_311_, float f_312_, float f_313_, float f_314_) {
		method6748(-(f * f_314_) / f_308_, f_314_ * (f_312_ - f) / f_308_, -(f_307_ * f_314_) / f_309_, f_314_ * (f_313_ - f_307_) / f_309_, f_310_, f_311_);
	}

	public void method6823(Class427 class427_315_) {
		System.arraycopy(class427_315_.aFloatArray4807, 0, aFloatArray4807, 0, 11);
		aFloatArray4807[3] = 0.0F;
		aFloatArray4807[7] = 0.0F;
		aFloatArray4807[11] = 0.0F;
		aFloatArray4807[12] = 0.0F;
		aFloatArray4807[13] = 0.0F;
		aFloatArray4807[14] = 0.0F;
		aFloatArray4807[15] = 1.0F;
	}

	public void method6824(float f, float f_316_, float f_317_, float f_318_, float f_319_, float f_320_, float f_321_, float f_322_, float f_323_) {
		method6748(-(f * f_323_) / f_317_, f_323_ * (f_321_ - f) / f_317_, -(f_316_ * f_323_) / f_318_, f_323_ * (f_322_ - f_316_) / f_318_, f_319_, f_320_);
	}

	public float method6825() {
		return (-(aFloatArray4807[15] + aFloatArray4807[14]) / (aFloatArray4807[11] + aFloatArray4807[10]));
	}

	public float method6826() {
		return ((aFloatArray4807[14] - aFloatArray4807[15]) / (aFloatArray4807[11] - aFloatArray4807[10]));
	}

	public String method6827() {
		StringBuilder stringbuilder = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			for (int i_324_ = 0; i_324_ < 4; i_324_++) {
				if (i_324_ > 0)
					stringbuilder.append("\t");
				stringbuilder.append(aFloatArray4807[i * 4 + i_324_]);
			}
			stringbuilder.append("\n");
		}
		return stringbuilder.toString();
	}

	public float[] method6828(float[] fs) {
		float f = aFloatArray4807[3] + aFloatArray4807[0];
		float f_325_ = aFloatArray4807[7] + aFloatArray4807[4];
		float f_326_ = aFloatArray4807[11] + aFloatArray4807[8];
		double d = Math.sqrt((double) (f * f + f_325_ * f_325_ + f_326_ * f_326_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_325_ / d);
		fs[2] = (float) ((double) f_326_ / d);
		fs[3] = (float) ((double) (aFloatArray4807[15] + aFloatArray4807[12]) / d);
		return fs;
	}

	public void method6829(float f, float f_327_, float f_328_, float[] fs) {
		fs[0] = (aFloatArray4807[0] * f + aFloatArray4807[4] * f_327_ + aFloatArray4807[8] * f_328_ + aFloatArray4807[12]);
		fs[1] = (aFloatArray4807[1] * f + aFloatArray4807[5] * f_327_ + aFloatArray4807[9] * f_328_ + aFloatArray4807[13]);
		fs[2] = (aFloatArray4807[2] * f + aFloatArray4807[6] * f_327_ + aFloatArray4807[10] * f_328_ + aFloatArray4807[14]);
		if (fs.length > 3)
			fs[3] = (aFloatArray4807[3] * f + aFloatArray4807[7] * f_327_ + aFloatArray4807[11] * f_328_ + aFloatArray4807[15]);
	}

	public float[] method6830(float[] fs) {
		float f = aFloatArray4807[3] - aFloatArray4807[0];
		float f_329_ = aFloatArray4807[7] - aFloatArray4807[4];
		float f_330_ = aFloatArray4807[11] - aFloatArray4807[8];
		double d = Math.sqrt((double) (f * f + f_329_ * f_329_ + f_330_ * f_330_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_329_ / d);
		fs[2] = (float) ((double) f_330_ / d);
		fs[3] = (float) ((double) (aFloatArray4807[15] - aFloatArray4807[12]) / d);
		return fs;
	}

	public float[] method6831(float[] fs) {
		float f = aFloatArray4807[3] + aFloatArray4807[1];
		float f_331_ = aFloatArray4807[7] + aFloatArray4807[5];
		float f_332_ = aFloatArray4807[11] + aFloatArray4807[9];
		double d = Math.sqrt((double) (f * f + f_331_ * f_331_ + f_332_ * f_332_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_331_ / d);
		fs[2] = (float) ((double) f_332_ / d);
		fs[3] = (float) ((double) (aFloatArray4807[15] + aFloatArray4807[13]) / d);
		return fs;
	}

	public void method6832(int i, int i_333_, int i_334_, float f, float f_335_, float f_336_) {
		if (i != 0) {
			float f_337_ = Class436.aFloatArray4880[i & 0x3fff];
			float f_338_ = Class436.aFloatArray4879[i & 0x3fff];
			aFloatArray4807[0] = f_337_ * (float) i_333_;
			aFloatArray4807[5] = f_337_ * (float) i_334_;
			aFloatArray4807[1] = f_338_ * (float) i_333_;
			aFloatArray4807[4] = -f_338_ * (float) i_334_;
			aFloatArray4807[10] = 1.0F;
			float[] fs = aFloatArray4807;
			float[] fs_339_ = aFloatArray4807;
			float[] fs_340_ = aFloatArray4807;
			aFloatArray4807[9] = 0.0F;
			fs_340_[8] = 0.0F;
			fs_339_[6] = 0.0F;
			fs[2] = 0.0F;
		} else {
			aFloatArray4807[0] = (float) i_333_;
			aFloatArray4807[5] = (float) i_334_;
			aFloatArray4807[10] = 1.0F;
			float[] fs = aFloatArray4807;
			float[] fs_341_ = aFloatArray4807;
			float[] fs_342_ = aFloatArray4807;
			float[] fs_343_ = aFloatArray4807;
			float[] fs_344_ = aFloatArray4807;
			aFloatArray4807[9] = 0.0F;
			fs_344_[8] = 0.0F;
			fs_343_[6] = 0.0F;
			fs_342_[4] = 0.0F;
			fs_341_[2] = 0.0F;
			fs[1] = 0.0F;
		}
		float[] fs = aFloatArray4807;
		float[] fs_345_ = aFloatArray4807;
		aFloatArray4807[11] = 0.0F;
		fs_345_[7] = 0.0F;
		fs[3] = 0.0F;
		aFloatArray4807[15] = 1.0F;
		aFloatArray4807[12] = f;
		aFloatArray4807[13] = f_335_;
		aFloatArray4807[14] = f_336_;
	}

	public float[] method6833(float[] fs) {
		float f = aFloatArray4807[3] - aFloatArray4807[1];
		float f_346_ = aFloatArray4807[7] - aFloatArray4807[5];
		float f_347_ = aFloatArray4807[11] - aFloatArray4807[9];
		double d = Math.sqrt((double) (f * f + f_346_ * f_346_ + f_347_ * f_347_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_346_ / d);
		fs[2] = (float) ((double) f_347_ / d);
		fs[3] = (float) ((double) (aFloatArray4807[15] - aFloatArray4807[13]) / d);
		return fs;
	}

	public float[] method6834(float[] fs) {
		float f = aFloatArray4807[3] + aFloatArray4807[2];
		float f_348_ = aFloatArray4807[7] + aFloatArray4807[6];
		float f_349_ = aFloatArray4807[11] + aFloatArray4807[10];
		double d = Math.sqrt((double) (f * f + f_348_ * f_348_ + f_349_ * f_349_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_348_ / d);
		fs[2] = (float) ((double) f_349_ / d);
		fs[3] = (float) ((double) (aFloatArray4807[15] + aFloatArray4807[14]) / d);
		return fs;
	}

	public float[] method6835(float[] fs) {
		float f = aFloatArray4807[3] + aFloatArray4807[2];
		float f_350_ = aFloatArray4807[7] + aFloatArray4807[6];
		float f_351_ = aFloatArray4807[11] + aFloatArray4807[10];
		double d = Math.sqrt((double) (f * f + f_350_ * f_350_ + f_351_ * f_351_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_350_ / d);
		fs[2] = (float) ((double) f_351_ / d);
		fs[3] = (float) ((double) (aFloatArray4807[15] + aFloatArray4807[14]) / d);
		return fs;
	}

	public void method6836(float f, float f_352_, float f_353_, float[] fs) {
		fs[0] = (aFloatArray4807[0] * f + aFloatArray4807[4] * f_352_ + aFloatArray4807[8] * f_353_ + aFloatArray4807[12]);
		fs[1] = (aFloatArray4807[1] * f + aFloatArray4807[5] * f_352_ + aFloatArray4807[9] * f_353_ + aFloatArray4807[13]);
		fs[2] = (aFloatArray4807[2] * f + aFloatArray4807[6] * f_352_ + aFloatArray4807[10] * f_353_ + aFloatArray4807[14]);
		if (fs.length > 3)
			fs[3] = (aFloatArray4807[3] * f + aFloatArray4807[7] * f_352_ + aFloatArray4807[11] * f_353_ + aFloatArray4807[15]);
	}

	public float[] method6837(float[] fs) {
		float f = aFloatArray4807[3] + aFloatArray4807[2];
		float f_354_ = aFloatArray4807[7] + aFloatArray4807[6];
		float f_355_ = aFloatArray4807[11] + aFloatArray4807[10];
		double d = Math.sqrt((double) (f * f + f_354_ * f_354_ + f_355_ * f_355_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_354_ / d);
		fs[2] = (float) ((double) f_355_ / d);
		fs[3] = (float) ((double) (aFloatArray4807[15] + aFloatArray4807[14]) / d);
		return fs;
	}

	public float[] method6838(float[] fs) {
		float f = aFloatArray4807[3] - aFloatArray4807[2];
		float f_356_ = aFloatArray4807[7] - aFloatArray4807[6];
		float f_357_ = aFloatArray4807[11] - aFloatArray4807[10];
		double d = Math.sqrt((double) (f * f + f_356_ * f_356_ + f_357_ * f_357_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_356_ / d);
		fs[2] = (float) ((double) f_357_ / d);
		fs[3] = (float) ((double) (aFloatArray4807[15] - aFloatArray4807[14]) / d);
		return fs;
	}

	public void method6839() {
		float f = 1.0F / method6854();
		float f_358_ = (aFloatArray4807[5] * aFloatArray4807[10] * aFloatArray4807[15] - aFloatArray4807[5] * aFloatArray4807[11] * aFloatArray4807[14] - aFloatArray4807[6] * aFloatArray4807[9] * aFloatArray4807[15] + aFloatArray4807[6] * aFloatArray4807[11] * aFloatArray4807[13] + aFloatArray4807[7] * aFloatArray4807[9] * aFloatArray4807[14] - (aFloatArray4807[7] * aFloatArray4807[10] * aFloatArray4807[13])) * f;
		float f_359_ = (-aFloatArray4807[1] * aFloatArray4807[10] * aFloatArray4807[15] + aFloatArray4807[1] * aFloatArray4807[11] * aFloatArray4807[14] + aFloatArray4807[2] * aFloatArray4807[9] * aFloatArray4807[15] - aFloatArray4807[2] * aFloatArray4807[11] * aFloatArray4807[13] - aFloatArray4807[3] * aFloatArray4807[9] * aFloatArray4807[14] + (aFloatArray4807[3] * aFloatArray4807[10] * aFloatArray4807[13])) * f;
		float f_360_ = ((aFloatArray4807[1] * aFloatArray4807[6] * aFloatArray4807[15] - aFloatArray4807[1] * aFloatArray4807[7] * aFloatArray4807[14] - aFloatArray4807[2] * aFloatArray4807[5] * aFloatArray4807[15] + aFloatArray4807[2] * aFloatArray4807[7] * aFloatArray4807[13] + aFloatArray4807[3] * aFloatArray4807[5] * aFloatArray4807[14] - (aFloatArray4807[3] * aFloatArray4807[6] * aFloatArray4807[13])) * f);
		float f_361_ = ((-aFloatArray4807[1] * aFloatArray4807[6] * aFloatArray4807[11] + aFloatArray4807[1] * aFloatArray4807[7] * aFloatArray4807[10] + aFloatArray4807[2] * aFloatArray4807[5] * aFloatArray4807[11] - aFloatArray4807[2] * aFloatArray4807[7] * aFloatArray4807[9] - aFloatArray4807[3] * aFloatArray4807[5] * aFloatArray4807[10] + aFloatArray4807[3] * aFloatArray4807[6] * aFloatArray4807[9]) * f);
		float f_362_ = (-aFloatArray4807[4] * aFloatArray4807[10] * aFloatArray4807[15] + aFloatArray4807[4] * aFloatArray4807[11] * aFloatArray4807[14] + aFloatArray4807[6] * aFloatArray4807[8] * aFloatArray4807[15] - aFloatArray4807[6] * aFloatArray4807[11] * aFloatArray4807[12] - aFloatArray4807[7] * aFloatArray4807[8] * aFloatArray4807[14] + (aFloatArray4807[7] * aFloatArray4807[10] * aFloatArray4807[12])) * f;
		float f_363_ = (aFloatArray4807[0] * aFloatArray4807[10] * aFloatArray4807[15] - aFloatArray4807[0] * aFloatArray4807[11] * aFloatArray4807[14] - aFloatArray4807[2] * aFloatArray4807[8] * aFloatArray4807[15] + aFloatArray4807[2] * aFloatArray4807[11] * aFloatArray4807[12] + aFloatArray4807[3] * aFloatArray4807[8] * aFloatArray4807[14] - (aFloatArray4807[3] * aFloatArray4807[10] * aFloatArray4807[12])) * f;
		float f_364_ = ((-aFloatArray4807[0] * aFloatArray4807[6] * aFloatArray4807[15] + aFloatArray4807[0] * aFloatArray4807[7] * aFloatArray4807[14] + aFloatArray4807[2] * aFloatArray4807[4] * aFloatArray4807[15] - aFloatArray4807[2] * aFloatArray4807[7] * aFloatArray4807[12] - aFloatArray4807[3] * aFloatArray4807[4] * aFloatArray4807[14] + (aFloatArray4807[3] * aFloatArray4807[6] * aFloatArray4807[12])) * f);
		float f_365_ = ((aFloatArray4807[0] * aFloatArray4807[6] * aFloatArray4807[11] - aFloatArray4807[0] * aFloatArray4807[7] * aFloatArray4807[10] - aFloatArray4807[2] * aFloatArray4807[4] * aFloatArray4807[11] + aFloatArray4807[2] * aFloatArray4807[7] * aFloatArray4807[8] + aFloatArray4807[3] * aFloatArray4807[4] * aFloatArray4807[10] - aFloatArray4807[3] * aFloatArray4807[6] * aFloatArray4807[8]) * f);
		float f_366_ = (aFloatArray4807[4] * aFloatArray4807[9] * aFloatArray4807[15] - aFloatArray4807[4] * aFloatArray4807[11] * aFloatArray4807[13] - aFloatArray4807[5] * aFloatArray4807[8] * aFloatArray4807[15] + aFloatArray4807[5] * aFloatArray4807[11] * aFloatArray4807[12] + aFloatArray4807[7] * aFloatArray4807[8] * aFloatArray4807[13] - (aFloatArray4807[7] * aFloatArray4807[9] * aFloatArray4807[12])) * f;
		float f_367_ = (-aFloatArray4807[0] * aFloatArray4807[9] * aFloatArray4807[15] + aFloatArray4807[0] * aFloatArray4807[11] * aFloatArray4807[13] + aFloatArray4807[1] * aFloatArray4807[8] * aFloatArray4807[15] - aFloatArray4807[1] * aFloatArray4807[11] * aFloatArray4807[12] - aFloatArray4807[3] * aFloatArray4807[8] * aFloatArray4807[13] + (aFloatArray4807[3] * aFloatArray4807[9] * aFloatArray4807[12])) * f;
		float f_368_ = ((aFloatArray4807[0] * aFloatArray4807[5] * aFloatArray4807[15] - aFloatArray4807[0] * aFloatArray4807[7] * aFloatArray4807[13] - aFloatArray4807[1] * aFloatArray4807[4] * aFloatArray4807[15] + aFloatArray4807[1] * aFloatArray4807[7] * aFloatArray4807[12] + aFloatArray4807[3] * aFloatArray4807[4] * aFloatArray4807[13] - (aFloatArray4807[3] * aFloatArray4807[5] * aFloatArray4807[12])) * f);
		float f_369_ = ((-aFloatArray4807[0] * aFloatArray4807[5] * aFloatArray4807[11] + aFloatArray4807[0] * aFloatArray4807[7] * aFloatArray4807[9] + aFloatArray4807[1] * aFloatArray4807[4] * aFloatArray4807[11] - aFloatArray4807[1] * aFloatArray4807[7] * aFloatArray4807[8] - aFloatArray4807[3] * aFloatArray4807[4] * aFloatArray4807[9] + aFloatArray4807[3] * aFloatArray4807[5] * aFloatArray4807[8]) * f);
		float f_370_ = (-aFloatArray4807[4] * aFloatArray4807[9] * aFloatArray4807[14] + aFloatArray4807[4] * aFloatArray4807[10] * aFloatArray4807[13] + aFloatArray4807[5] * aFloatArray4807[8] * aFloatArray4807[14] - aFloatArray4807[5] * aFloatArray4807[10] * aFloatArray4807[12] - aFloatArray4807[6] * aFloatArray4807[8] * aFloatArray4807[13] + (aFloatArray4807[6] * aFloatArray4807[9] * aFloatArray4807[12])) * f;
		float f_371_ = (aFloatArray4807[0] * aFloatArray4807[9] * aFloatArray4807[14] - aFloatArray4807[0] * aFloatArray4807[10] * aFloatArray4807[13] - aFloatArray4807[1] * aFloatArray4807[8] * aFloatArray4807[14] + aFloatArray4807[1] * aFloatArray4807[10] * aFloatArray4807[12] + aFloatArray4807[2] * aFloatArray4807[8] * aFloatArray4807[13] - (aFloatArray4807[2] * aFloatArray4807[9] * aFloatArray4807[12])) * f;
		float f_372_ = ((-aFloatArray4807[0] * aFloatArray4807[5] * aFloatArray4807[14] + aFloatArray4807[0] * aFloatArray4807[6] * aFloatArray4807[13] + aFloatArray4807[1] * aFloatArray4807[4] * aFloatArray4807[14] - aFloatArray4807[1] * aFloatArray4807[6] * aFloatArray4807[12] - aFloatArray4807[2] * aFloatArray4807[4] * aFloatArray4807[13] + (aFloatArray4807[2] * aFloatArray4807[5] * aFloatArray4807[12])) * f);
		float f_373_ = ((aFloatArray4807[0] * aFloatArray4807[5] * aFloatArray4807[10] - aFloatArray4807[0] * aFloatArray4807[6] * aFloatArray4807[9] - aFloatArray4807[1] * aFloatArray4807[4] * aFloatArray4807[10] + aFloatArray4807[1] * aFloatArray4807[6] * aFloatArray4807[8] + aFloatArray4807[2] * aFloatArray4807[4] * aFloatArray4807[9] - aFloatArray4807[2] * aFloatArray4807[5] * aFloatArray4807[8]) * f);
		aFloatArray4807[0] = f_358_;
		aFloatArray4807[1] = f_359_;
		aFloatArray4807[2] = f_360_;
		aFloatArray4807[3] = f_361_;
		aFloatArray4807[4] = f_362_;
		aFloatArray4807[5] = f_363_;
		aFloatArray4807[6] = f_364_;
		aFloatArray4807[7] = f_365_;
		aFloatArray4807[8] = f_366_;
		aFloatArray4807[9] = f_367_;
		aFloatArray4807[10] = f_368_;
		aFloatArray4807[11] = f_369_;
		aFloatArray4807[12] = f_370_;
		aFloatArray4807[13] = f_371_;
		aFloatArray4807[14] = f_372_;
		aFloatArray4807[15] = f_373_;
	}

	public void method6840(float f, float f_374_, float f_375_, float f_376_) {
		float f_377_ = (float) (Math.tan((double) (f_375_ / 2.0F)) * (double) f);
		float f_378_ = (float) (Math.tan((double) (f_376_ / 2.0F)) * (double) f);
		method6785(-f_377_, f_377_, -f_378_, f_378_, f, f_374_);
	}

	public float[] method6841(float[] fs) {
		float f = aFloatArray4807[3] - aFloatArray4807[2];
		float f_379_ = aFloatArray4807[7] - aFloatArray4807[6];
		float f_380_ = aFloatArray4807[11] - aFloatArray4807[10];
		double d = Math.sqrt((double) (f * f + f_379_ * f_379_ + f_380_ * f_380_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_379_ / d);
		fs[2] = (float) ((double) f_380_ / d);
		fs[3] = (float) ((double) (aFloatArray4807[15] - aFloatArray4807[14]) / d);
		return fs;
	}

	public void method6842() {
		float f = aFloatArray4807[0];
		float f_381_ = aFloatArray4807[4];
		float f_382_ = aFloatArray4807[8];
		float f_383_ = aFloatArray4807[12];
		float f_384_ = aFloatArray4807[1];
		float f_385_ = aFloatArray4807[5];
		float f_386_ = aFloatArray4807[9];
		float f_387_ = aFloatArray4807[13];
		float f_388_ = aFloatArray4807[2];
		float f_389_ = aFloatArray4807[6];
		float f_390_ = aFloatArray4807[10];
		float f_391_ = aFloatArray4807[14];
		float f_392_ = aFloatArray4807[3];
		float f_393_ = aFloatArray4807[7];
		float f_394_ = aFloatArray4807[11];
		float f_395_ = aFloatArray4807[15];
		aFloatArray4807[0] = f;
		aFloatArray4807[1] = f_381_;
		aFloatArray4807[2] = f_382_;
		aFloatArray4807[3] = f_383_;
		aFloatArray4807[4] = f_384_;
		aFloatArray4807[5] = f_385_;
		aFloatArray4807[6] = f_386_;
		aFloatArray4807[7] = f_387_;
		aFloatArray4807[8] = f_388_;
		aFloatArray4807[9] = f_389_;
		aFloatArray4807[10] = f_390_;
		aFloatArray4807[11] = f_391_;
		aFloatArray4807[12] = f_392_;
		aFloatArray4807[13] = f_393_;
		aFloatArray4807[14] = f_394_;
		aFloatArray4807[15] = f_395_;
	}

	public float[] method6843(float[] fs) {
		System.arraycopy(aFloatArray4807, 0, fs, 0, 16);
		return fs;
	}

	void method6844(float f, float f_396_, float f_397_, float f_398_, float f_399_, float f_400_) {
		aFloatArray4807[0] = 2.0F * f_399_ / (f_396_ - f);
		aFloatArray4807[1] = 0.0F;
		aFloatArray4807[2] = 0.0F;
		aFloatArray4807[3] = 0.0F;
		aFloatArray4807[4] = 0.0F;
		aFloatArray4807[5] = 2.0F * f_399_ / (f_398_ - f_397_);
		aFloatArray4807[6] = 0.0F;
		aFloatArray4807[7] = 0.0F;
		aFloatArray4807[8] = (f_396_ + f) / (f_396_ - f);
		aFloatArray4807[9] = (f_398_ + f_397_) / (f_398_ - f_397_);
		aFloatArray4807[10] = (f_400_ + f_399_) / (f_400_ - f_399_);
		aFloatArray4807[11] = 1.0F;
		aFloatArray4807[12] = 0.0F;
		aFloatArray4807[13] = 0.0F;
		aFloatArray4807[14] = -(2.0F * f_400_ * f_399_) / (f_400_ - f_399_);
		aFloatArray4807[15] = 0.0F;
	}

	public float[] method6845(float[] fs) {
		System.arraycopy(aFloatArray4807, 0, fs, 0, 16);
		fs[3] = 0.0F;
		fs[7] = 0.0F;
		fs[11] = 0.0F;
		fs[12] = 0.0F;
		fs[13] = 0.0F;
		fs[14] = 0.0F;
		fs[15] = 1.0F;
		return fs;
	}

	public float[] method6846(float[] fs) {
		fs[0] = aFloatArray4807[0];
		fs[1] = aFloatArray4807[1];
		fs[2] = aFloatArray4807[2];
		fs[3] = aFloatArray4807[4];
		fs[4] = aFloatArray4807[5];
		fs[5] = aFloatArray4807[6];
		fs[6] = aFloatArray4807[8];
		fs[7] = aFloatArray4807[9];
		fs[8] = aFloatArray4807[10];
		return fs;
	}

	public float[] method6847(float[] fs) {
		fs[0] = aFloatArray4807[0];
		fs[1] = aFloatArray4807[4];
		fs[2] = aFloatArray4807[8];
		fs[3] = aFloatArray4807[12];
		fs[4] = aFloatArray4807[1];
		fs[5] = aFloatArray4807[5];
		fs[6] = aFloatArray4807[9];
		fs[7] = aFloatArray4807[13];
		fs[8] = aFloatArray4807[2];
		fs[9] = aFloatArray4807[6];
		fs[10] = aFloatArray4807[10];
		fs[11] = aFloatArray4807[14];
		fs[12] = aFloatArray4807[3];
		fs[13] = aFloatArray4807[7];
		fs[14] = aFloatArray4807[11];
		fs[15] = aFloatArray4807[15];
		return fs;
	}

	public void method6848() {
		aFloatArray4807[0] = 1.0F;
		aFloatArray4807[1] = 0.0F;
		aFloatArray4807[2] = 0.0F;
		aFloatArray4807[3] = 0.0F;
		aFloatArray4807[4] = 0.0F;
		aFloatArray4807[5] = 1.0F;
		aFloatArray4807[6] = 0.0F;
		aFloatArray4807[7] = 0.0F;
		aFloatArray4807[8] = 0.0F;
		aFloatArray4807[9] = 0.0F;
		aFloatArray4807[10] = 1.0F;
		aFloatArray4807[11] = 0.0F;
		aFloatArray4807[12] = 0.0F;
		aFloatArray4807[13] = 0.0F;
		aFloatArray4807[14] = 0.0F;
		aFloatArray4807[15] = 1.0F;
	}

	public String toString() {
		StringBuilder stringbuilder = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			for (int i_401_ = 0; i_401_ < 4; i_401_++) {
				if (i_401_ > 0)
					stringbuilder.append("\t");
				stringbuilder.append(aFloatArray4807[i * 4 + i_401_]);
			}
			stringbuilder.append("\n");
		}
		return stringbuilder.toString();
	}

	public float[] method6849(float[] fs) {
		fs[0] = aFloatArray4807[0];
		fs[1] = aFloatArray4807[1];
		fs[2] = aFloatArray4807[4];
		fs[3] = aFloatArray4807[5];
		fs[4] = aFloatArray4807[8];
		fs[5] = aFloatArray4807[9];
		fs[6] = aFloatArray4807[12];
		fs[7] = aFloatArray4807[13];
		return fs;
	}

	public float method6850() {
		return ((aFloatArray4807[14] - aFloatArray4807[15]) / (aFloatArray4807[11] - aFloatArray4807[10]));
	}

	public float[] method6851(float[] fs) {
		fs[0] = aFloatArray4807[0];
		fs[1] = aFloatArray4807[4];
		fs[2] = aFloatArray4807[8];
		fs[3] = aFloatArray4807[12];
		fs[4] = aFloatArray4807[1];
		fs[5] = aFloatArray4807[5];
		fs[6] = aFloatArray4807[9];
		fs[7] = aFloatArray4807[13];
		return fs;
	}

	public float[] method6852(float[] fs) {
		fs[0] = aFloatArray4807[0];
		fs[1] = aFloatArray4807[4];
		fs[2] = aFloatArray4807[8];
		fs[3] = aFloatArray4807[12];
		fs[4] = aFloatArray4807[1];
		fs[5] = aFloatArray4807[5];
		fs[6] = aFloatArray4807[9];
		fs[7] = aFloatArray4807[13];
		return fs;
	}

	public float[] method6853(float[] fs) {
		fs[0] = aFloatArray4807[0];
		fs[1] = aFloatArray4807[4];
		fs[2] = aFloatArray4807[8];
		fs[3] = aFloatArray4807[12];
		fs[4] = aFloatArray4807[1];
		fs[5] = aFloatArray4807[5];
		fs[6] = aFloatArray4807[9];
		fs[7] = aFloatArray4807[13];
		return fs;
	}

	float method6854() {
		return ((aFloatArray4807[0] * aFloatArray4807[5] * aFloatArray4807[10] * aFloatArray4807[15]) - (aFloatArray4807[0] * aFloatArray4807[5] * aFloatArray4807[11] * aFloatArray4807[14]) - (aFloatArray4807[0] * aFloatArray4807[6] * aFloatArray4807[9] * aFloatArray4807[15]) + (aFloatArray4807[0] * aFloatArray4807[6] * aFloatArray4807[11] * aFloatArray4807[13]) + (aFloatArray4807[0] * aFloatArray4807[7] * aFloatArray4807[9] * aFloatArray4807[14])
				- (aFloatArray4807[0] * aFloatArray4807[7] * aFloatArray4807[10] * aFloatArray4807[13]) - (aFloatArray4807[1] * aFloatArray4807[4] * aFloatArray4807[10] * aFloatArray4807[15]) + (aFloatArray4807[1] * aFloatArray4807[4] * aFloatArray4807[11] * aFloatArray4807[14]) + (aFloatArray4807[1] * aFloatArray4807[6] * aFloatArray4807[8] * aFloatArray4807[15]) - (aFloatArray4807[1] * aFloatArray4807[6] * aFloatArray4807[11] * aFloatArray4807[12])
				- (aFloatArray4807[1] * aFloatArray4807[7] * aFloatArray4807[8] * aFloatArray4807[14]) + (aFloatArray4807[1] * aFloatArray4807[7] * aFloatArray4807[10] * aFloatArray4807[12]) + (aFloatArray4807[2] * aFloatArray4807[4] * aFloatArray4807[9] * aFloatArray4807[15]) - (aFloatArray4807[2] * aFloatArray4807[4] * aFloatArray4807[11] * aFloatArray4807[13]) - (aFloatArray4807[2] * aFloatArray4807[5] * aFloatArray4807[8] * aFloatArray4807[15])
				+ (aFloatArray4807[2] * aFloatArray4807[5] * aFloatArray4807[11] * aFloatArray4807[12]) + (aFloatArray4807[2] * aFloatArray4807[7] * aFloatArray4807[8] * aFloatArray4807[13]) - (aFloatArray4807[2] * aFloatArray4807[7] * aFloatArray4807[9] * aFloatArray4807[12]) - (aFloatArray4807[3] * aFloatArray4807[4] * aFloatArray4807[9] * aFloatArray4807[14]) + (aFloatArray4807[3] * aFloatArray4807[4] * aFloatArray4807[10] * aFloatArray4807[13])
				+ (aFloatArray4807[3] * aFloatArray4807[5] * aFloatArray4807[8] * aFloatArray4807[14]) - (aFloatArray4807[3] * aFloatArray4807[5] * aFloatArray4807[10] * aFloatArray4807[12]) - (aFloatArray4807[3] * aFloatArray4807[6] * aFloatArray4807[8] * aFloatArray4807[13]) + (aFloatArray4807[3] * aFloatArray4807[6] * aFloatArray4807[9] * aFloatArray4807[12]));
	}

	public float[] method6855(float[] fs) {
		fs[0] = aFloatArray4807[0];
		fs[1] = aFloatArray4807[1];
		fs[2] = 0.0F;
		fs[3] = 0.0F;
		fs[4] = aFloatArray4807[4];
		fs[5] = aFloatArray4807[5];
		fs[6] = 0.0F;
		fs[7] = 0.0F;
		fs[8] = aFloatArray4807[12];
		fs[9] = aFloatArray4807[13];
		fs[10] = aFloatArray4807[14];
		fs[11] = 0.0F;
		fs[12] = 0.0F;
		fs[13] = 0.0F;
		fs[14] = 0.0F;
		fs[15] = 1.0F;
		return fs;
	}

	public float[] method6856(float[] fs) {
		fs[0] = aFloatArray4807[0];
		fs[1] = aFloatArray4807[1];
		fs[2] = 0.0F;
		fs[3] = 0.0F;
		fs[4] = aFloatArray4807[4];
		fs[5] = aFloatArray4807[5];
		fs[6] = 0.0F;
		fs[7] = 0.0F;
		fs[8] = aFloatArray4807[12];
		fs[9] = aFloatArray4807[13];
		fs[10] = aFloatArray4807[14];
		fs[11] = 0.0F;
		fs[12] = 0.0F;
		fs[13] = 0.0F;
		fs[14] = 0.0F;
		fs[15] = 1.0F;
		return fs;
	}

	public float[] method6857(float[] fs) {
		System.arraycopy(aFloatArray4807, 0, fs, 0, 16);
		fs[3] = 0.0F;
		fs[7] = 0.0F;
		fs[11] = 0.0F;
		fs[12] = 0.0F;
		fs[13] = 0.0F;
		fs[14] = 0.0F;
		fs[15] = 1.0F;
		return fs;
	}

	public void method6858(int i, int i_402_, int i_403_, float f, float f_404_, float f_405_) {
		if (i != 0) {
			float f_406_ = Class436.aFloatArray4880[i & 0x3fff];
			float f_407_ = Class436.aFloatArray4879[i & 0x3fff];
			aFloatArray4807[0] = f_406_ * (float) i_402_;
			aFloatArray4807[5] = f_406_ * (float) i_403_;
			aFloatArray4807[1] = f_407_ * (float) i_402_;
			aFloatArray4807[4] = -f_407_ * (float) i_403_;
			aFloatArray4807[10] = 1.0F;
			float[] fs = aFloatArray4807;
			float[] fs_408_ = aFloatArray4807;
			float[] fs_409_ = aFloatArray4807;
			aFloatArray4807[9] = 0.0F;
			fs_409_[8] = 0.0F;
			fs_408_[6] = 0.0F;
			fs[2] = 0.0F;
		} else {
			aFloatArray4807[0] = (float) i_402_;
			aFloatArray4807[5] = (float) i_403_;
			aFloatArray4807[10] = 1.0F;
			float[] fs = aFloatArray4807;
			float[] fs_410_ = aFloatArray4807;
			float[] fs_411_ = aFloatArray4807;
			float[] fs_412_ = aFloatArray4807;
			float[] fs_413_ = aFloatArray4807;
			aFloatArray4807[9] = 0.0F;
			fs_413_[8] = 0.0F;
			fs_412_[6] = 0.0F;
			fs_411_[4] = 0.0F;
			fs_410_[2] = 0.0F;
			fs[1] = 0.0F;
		}
		float[] fs = aFloatArray4807;
		float[] fs_414_ = aFloatArray4807;
		aFloatArray4807[11] = 0.0F;
		fs_414_[7] = 0.0F;
		fs[3] = 0.0F;
		aFloatArray4807[15] = 1.0F;
		aFloatArray4807[12] = f;
		aFloatArray4807[13] = f_404_;
		aFloatArray4807[14] = f_405_;
	}

	public void method6859(int i, int i_415_, int i_416_, float f, float f_417_, float f_418_) {
		if (i != 0) {
			float f_419_ = Class436.aFloatArray4880[i & 0x3fff];
			float f_420_ = Class436.aFloatArray4879[i & 0x3fff];
			aFloatArray4807[0] = f_419_ * (float) i_415_;
			aFloatArray4807[5] = f_419_ * (float) i_416_;
			aFloatArray4807[1] = f_420_ * (float) i_415_;
			aFloatArray4807[4] = -f_420_ * (float) i_416_;
			aFloatArray4807[10] = 1.0F;
			float[] fs = aFloatArray4807;
			float[] fs_421_ = aFloatArray4807;
			float[] fs_422_ = aFloatArray4807;
			aFloatArray4807[9] = 0.0F;
			fs_422_[8] = 0.0F;
			fs_421_[6] = 0.0F;
			fs[2] = 0.0F;
		} else {
			aFloatArray4807[0] = (float) i_415_;
			aFloatArray4807[5] = (float) i_416_;
			aFloatArray4807[10] = 1.0F;
			float[] fs = aFloatArray4807;
			float[] fs_423_ = aFloatArray4807;
			float[] fs_424_ = aFloatArray4807;
			float[] fs_425_ = aFloatArray4807;
			float[] fs_426_ = aFloatArray4807;
			aFloatArray4807[9] = 0.0F;
			fs_426_[8] = 0.0F;
			fs_425_[6] = 0.0F;
			fs_424_[4] = 0.0F;
			fs_423_[2] = 0.0F;
			fs[1] = 0.0F;
		}
		float[] fs = aFloatArray4807;
		float[] fs_427_ = aFloatArray4807;
		aFloatArray4807[11] = 0.0F;
		fs_427_[7] = 0.0F;
		fs[3] = 0.0F;
		aFloatArray4807[15] = 1.0F;
		aFloatArray4807[12] = f;
		aFloatArray4807[13] = f_417_;
		aFloatArray4807[14] = f_418_;
	}
}
