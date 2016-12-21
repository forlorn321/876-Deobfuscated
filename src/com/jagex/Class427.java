/* Class427 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class427 {
	public float aFloat4811;
	public float aFloat4812;
	public float aFloat4813;
	public float aFloat4814;

	public void method5131(float f, float f_0_, float f_1_, float f_2_) {
		aFloat4813 = f;
		aFloat4811 = f_0_;
		aFloat4814 = f_1_;
		aFloat4812 = f_2_;
	}

	public Class427(float f, float f_3_, float f_4_, float f_5_) {
		method5131(f, f_3_, f_4_, f_5_);
	}

	public void method5132(int i) {
		method5131((float) (i >> 16 & 0xff) * 0.003921569F, (float) (i >> 8 & 0xff) * 0.003921569F, (float) (i >> 0 & 0xff) * 0.003921569F, (float) (i >> 24 & 0xff) * 0.003921569F);
	}

	public void method5133(Class427 class427_6_) {
		method5131(class427_6_.aFloat4813, class427_6_.aFloat4811, class427_6_.aFloat4814, class427_6_.aFloat4812);
	}

	public final void method5134(float f) {
		aFloat4813 *= f;
		aFloat4811 *= f;
		aFloat4814 *= f;
		aFloat4812 *= f;
	}

	public final void method5135() {
		aFloat4813 = -aFloat4813;
		aFloat4811 = -aFloat4811;
		aFloat4814 = -aFloat4814;
		aFloat4812 = -aFloat4812;
	}

	public void method5136(float f, float f_7_, float f_8_, float f_9_) {
		aFloat4813 = f;
		aFloat4811 = f_7_;
		aFloat4814 = f_8_;
		aFloat4812 = f_9_;
	}

	public final void method5137(Class443 class443) {
		float f = aFloat4813;
		float f_10_ = aFloat4811;
		float f_11_ = aFloat4814;
		float f_12_ = aFloat4812;
		aFloat4813 = (class443.aFloatArray4878[0] * f + class443.aFloatArray4878[4] * f_10_ + class443.aFloatArray4878[8] * f_11_ + class443.aFloatArray4878[12] * f_12_);
		aFloat4811 = (class443.aFloatArray4878[1] * f + class443.aFloatArray4878[5] * f_10_ + class443.aFloatArray4878[9] * f_11_ + class443.aFloatArray4878[13] * f_12_);
		aFloat4814 = (class443.aFloatArray4878[2] * f + class443.aFloatArray4878[6] * f_10_ + class443.aFloatArray4878[10] * f_11_ + class443.aFloatArray4878[14] * f_12_);
		aFloat4812 = (class443.aFloatArray4878[3] * f + class443.aFloatArray4878[7] * f_10_ + class443.aFloatArray4878[11] * f_11_ + class443.aFloatArray4878[15] * f_12_);
	}

	public String toString() {
		return new StringBuilder().append(aFloat4813).append(",").append(aFloat4811).append(",").append(aFloat4814).append(",").append(aFloat4812).toString();
	}

	public String method5138() {
		return new StringBuilder().append(aFloat4813).append(",").append(aFloat4811).append(",").append(aFloat4814).append(",").append(aFloat4812).toString();
	}

	public String method5139() {
		return new StringBuilder().append(aFloat4813).append(",").append(aFloat4811).append(",").append(aFloat4814).append(",").append(aFloat4812).toString();
	}

	public String method5140() {
		return new StringBuilder().append(aFloat4813).append(",").append(aFloat4811).append(",").append(aFloat4814).append(",").append(aFloat4812).toString();
	}

	public Class427() {
		method5147();
	}

	public void method5141(int i) {
		method5131((float) (i >> 16 & 0xff) * 0.003921569F, (float) (i >> 8 & 0xff) * 0.003921569F, (float) (i >> 0 & 0xff) * 0.003921569F, (float) (i >> 24 & 0xff) * 0.003921569F);
	}

	public void method5142(int i) {
		method5131((float) (i >> 16 & 0xff) * 0.003921569F, (float) (i >> 8 & 0xff) * 0.003921569F, (float) (i >> 0 & 0xff) * 0.003921569F, (float) (i >> 24 & 0xff) * 0.003921569F);
	}

	final void method5143() {
		aFloat4812 = 0.0F;
		aFloat4814 = 0.0F;
		aFloat4811 = 0.0F;
		aFloat4813 = 0.0F;
	}

	public final void method5144() {
		aFloat4813 = -aFloat4813;
		aFloat4811 = -aFloat4811;
		aFloat4814 = -aFloat4814;
		aFloat4812 = -aFloat4812;
	}

	public final void method5145(float f) {
		aFloat4813 *= f;
		aFloat4811 *= f;
		aFloat4814 *= f;
		aFloat4812 *= f;
	}

	public final void method5146(float f) {
		aFloat4813 *= f;
		aFloat4811 *= f;
		aFloat4814 *= f;
		aFloat4812 *= f;
	}

	final void method5147() {
		aFloat4812 = 0.0F;
		aFloat4814 = 0.0F;
		aFloat4811 = 0.0F;
		aFloat4813 = 0.0F;
	}
}
