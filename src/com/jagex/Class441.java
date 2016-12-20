/* Class441 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class441 {
	public float aFloat4910;
	public float aFloat4911;
	public float aFloat4912;
	public float aFloat4913;

	final void method7116() {
		aFloat4910 = 0.0F;
		aFloat4912 = 0.0F;
		aFloat4911 = 0.0F;
		aFloat4913 = 0.0F;
	}

	public final void method7117(Class427 class427) {
		float f = aFloat4913;
		float f_0_ = aFloat4911;
		float f_1_ = aFloat4912;
		float f_2_ = aFloat4910;
		aFloat4913 = (class427.aFloatArray4807[0] * f + class427.aFloatArray4807[4] * f_0_ + class427.aFloatArray4807[8] * f_1_ + class427.aFloatArray4807[12] * f_2_);
		aFloat4911 = (class427.aFloatArray4807[1] * f + class427.aFloatArray4807[5] * f_0_ + class427.aFloatArray4807[9] * f_1_ + class427.aFloatArray4807[13] * f_2_);
		aFloat4912 = (class427.aFloatArray4807[2] * f + class427.aFloatArray4807[6] * f_0_ + class427.aFloatArray4807[10] * f_1_ + class427.aFloatArray4807[14] * f_2_);
		aFloat4910 = (class427.aFloatArray4807[3] * f + class427.aFloatArray4807[7] * f_0_ + class427.aFloatArray4807[11] * f_1_ + class427.aFloatArray4807[15] * f_2_);
	}

	public void method7118(float f, float f_3_, float f_4_, float f_5_) {
		aFloat4913 = f;
		aFloat4911 = f_3_;
		aFloat4912 = f_4_;
		aFloat4910 = f_5_;
	}

	public void method7119(Class441 class441_6_) {
		method7118(class441_6_.aFloat4913, class441_6_.aFloat4911, class441_6_.aFloat4912, class441_6_.aFloat4910);
	}

	public final void method7120() {
		aFloat4913 = -aFloat4913;
		aFloat4911 = -aFloat4911;
		aFloat4912 = -aFloat4912;
		aFloat4910 = -aFloat4910;
	}

	final void method7121() {
		aFloat4910 = 0.0F;
		aFloat4912 = 0.0F;
		aFloat4911 = 0.0F;
		aFloat4913 = 0.0F;
	}

	public final void method7122() {
		aFloat4913 = -aFloat4913;
		aFloat4911 = -aFloat4911;
		aFloat4912 = -aFloat4912;
		aFloat4910 = -aFloat4910;
	}

	public Class441() {
		method7121();
	}

	public final void method7123(Class427 class427) {
		float f = aFloat4913;
		float f_7_ = aFloat4911;
		float f_8_ = aFloat4912;
		float f_9_ = aFloat4910;
		aFloat4913 = (class427.aFloatArray4807[0] * f + class427.aFloatArray4807[4] * f_7_ + class427.aFloatArray4807[8] * f_8_ + class427.aFloatArray4807[12] * f_9_);
		aFloat4911 = (class427.aFloatArray4807[1] * f + class427.aFloatArray4807[5] * f_7_ + class427.aFloatArray4807[9] * f_8_ + class427.aFloatArray4807[13] * f_9_);
		aFloat4912 = (class427.aFloatArray4807[2] * f + class427.aFloatArray4807[6] * f_7_ + class427.aFloatArray4807[10] * f_8_ + class427.aFloatArray4807[14] * f_9_);
		aFloat4910 = (class427.aFloatArray4807[3] * f + class427.aFloatArray4807[7] * f_7_ + class427.aFloatArray4807[11] * f_8_ + class427.aFloatArray4807[15] * f_9_);
	}

	public String toString() {
		return new StringBuilder().append(aFloat4913).append(",").append(aFloat4911).append(",").append(aFloat4912).append(",").append(aFloat4910).toString();
	}

	public String method7124() {
		return new StringBuilder().append(aFloat4913).append(",").append(aFloat4911).append(",").append(aFloat4912).append(",").append(aFloat4910).toString();
	}

	public void method7125(int i) {
		method7118((float) (i >> 16 & 0xff) * 0.003921569F, (float) (i >> 8 & 0xff) * 0.003921569F, (float) (i >> 0 & 0xff) * 0.003921569F, (float) (i >> 24 & 0xff) * 0.003921569F);
	}

	public void method7126(int i) {
		method7118((float) (i >> 16 & 0xff) * 0.003921569F, (float) (i >> 8 & 0xff) * 0.003921569F, (float) (i >> 0 & 0xff) * 0.003921569F, (float) (i >> 24 & 0xff) * 0.003921569F);
	}

	final void method7127() {
		aFloat4910 = 0.0F;
		aFloat4912 = 0.0F;
		aFloat4911 = 0.0F;
		aFloat4913 = 0.0F;
	}

	public final void method7128(float f) {
		aFloat4913 *= f;
		aFloat4911 *= f;
		aFloat4912 *= f;
		aFloat4910 *= f;
	}

	public Class441(float f, float f_10_, float f_11_, float f_12_) {
		method7118(f, f_10_, f_11_, f_12_);
	}

	public final void method7129(Class427 class427) {
		float f = aFloat4913;
		float f_13_ = aFloat4911;
		float f_14_ = aFloat4912;
		float f_15_ = aFloat4910;
		aFloat4913 = (class427.aFloatArray4807[0] * f + class427.aFloatArray4807[4] * f_13_ + class427.aFloatArray4807[8] * f_14_ + class427.aFloatArray4807[12] * f_15_);
		aFloat4911 = (class427.aFloatArray4807[1] * f + class427.aFloatArray4807[5] * f_13_ + class427.aFloatArray4807[9] * f_14_ + class427.aFloatArray4807[13] * f_15_);
		aFloat4912 = (class427.aFloatArray4807[2] * f + class427.aFloatArray4807[6] * f_13_ + class427.aFloatArray4807[10] * f_14_ + class427.aFloatArray4807[14] * f_15_);
		aFloat4910 = (class427.aFloatArray4807[3] * f + class427.aFloatArray4807[7] * f_13_ + class427.aFloatArray4807[11] * f_14_ + class427.aFloatArray4807[15] * f_15_);
	}

	public final void method7130(float f) {
		aFloat4913 *= f;
		aFloat4911 *= f;
		aFloat4912 *= f;
		aFloat4910 *= f;
	}

	public final void method7131(float f) {
		aFloat4913 *= f;
		aFloat4911 *= f;
		aFloat4912 *= f;
		aFloat4910 *= f;
	}

	public void method7132(int i) {
		method7118((float) (i >> 16 & 0xff) * 0.003921569F, (float) (i >> 8 & 0xff) * 0.003921569F, (float) (i >> 0 & 0xff) * 0.003921569F, (float) (i >> 24 & 0xff) * 0.003921569F);
	}

	public final void method7133(Class427 class427) {
		float f = aFloat4913;
		float f_16_ = aFloat4911;
		float f_17_ = aFloat4912;
		float f_18_ = aFloat4910;
		aFloat4913 = (class427.aFloatArray4807[0] * f + class427.aFloatArray4807[4] * f_16_ + class427.aFloatArray4807[8] * f_17_ + class427.aFloatArray4807[12] * f_18_);
		aFloat4911 = (class427.aFloatArray4807[1] * f + class427.aFloatArray4807[5] * f_16_ + class427.aFloatArray4807[9] * f_17_ + class427.aFloatArray4807[13] * f_18_);
		aFloat4912 = (class427.aFloatArray4807[2] * f + class427.aFloatArray4807[6] * f_16_ + class427.aFloatArray4807[10] * f_17_ + class427.aFloatArray4807[14] * f_18_);
		aFloat4910 = (class427.aFloatArray4807[3] * f + class427.aFloatArray4807[7] * f_16_ + class427.aFloatArray4807[11] * f_17_ + class427.aFloatArray4807[15] * f_18_);
	}

	public final void method7134() {
		aFloat4913 = -aFloat4913;
		aFloat4911 = -aFloat4911;
		aFloat4912 = -aFloat4912;
		aFloat4910 = -aFloat4910;
	}

	public final void method7135(Class427 class427) {
		float f = aFloat4913;
		float f_19_ = aFloat4911;
		float f_20_ = aFloat4912;
		float f_21_ = aFloat4910;
		aFloat4913 = (class427.aFloatArray4807[0] * f + class427.aFloatArray4807[4] * f_19_ + class427.aFloatArray4807[8] * f_20_ + class427.aFloatArray4807[12] * f_21_);
		aFloat4911 = (class427.aFloatArray4807[1] * f + class427.aFloatArray4807[5] * f_19_ + class427.aFloatArray4807[9] * f_20_ + class427.aFloatArray4807[13] * f_21_);
		aFloat4912 = (class427.aFloatArray4807[2] * f + class427.aFloatArray4807[6] * f_19_ + class427.aFloatArray4807[10] * f_20_ + class427.aFloatArray4807[14] * f_21_);
		aFloat4910 = (class427.aFloatArray4807[3] * f + class427.aFloatArray4807[7] * f_19_ + class427.aFloatArray4807[11] * f_20_ + class427.aFloatArray4807[15] * f_21_);
	}
}
