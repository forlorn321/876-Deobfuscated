/* Class706_Sub4_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class706_Sub4_Sub2 extends Class706_Sub4 {
	int anInt11774 = 0;
	float[] aFloatArray11775;
	float[] aFloatArray11776;

	double[] method10307(int i) {
		return aClass439Array10961[anInt11774 * 946164565].method5308(aFloat10959);
	}

	void method10306(int i) {
		anInt11774 += 1275335165;
	}

	float method10305(float f, float f_0_, float f_1_, int i) {
		float f_2_ = aFloat10959 / (float) aClass439Array10961[anInt11774 * 946164565].method5313();
		float f_3_ = (aFloatArray11776[anInt11774 * 946164565] + (aFloatArray11775[946164565 * anInt11774] - aFloatArray11776[anInt11774 * 946164565]) * f_2_);
		return f_3_;
	}

	void method10308(float f, float f_4_, int i) {
		aFloat10959 += f;
		if (aFloat10959 > (float) aClass439Array10961[anInt11774 * 946164565].method5313())
			aFloat10959 = (float) aClass439Array10961[946164565 * anInt11774].method5313();
	}

	float method10314(float f, float f_5_, float f_6_) {
		float f_7_ = aFloat10959 / (float) aClass439Array10961[anInt11774 * 946164565].method5313();
		float f_8_ = (aFloatArray11776[anInt11774 * 946164565] + (aFloatArray11775[946164565 * anInt11774] - aFloatArray11776[anInt11774 * 946164565]) * f_7_);
		return f_8_;
	}

	void method10313(RSByteBuffer class536_sub33, int i) {
		aFloatArray11776 = new float[i];
		aFloatArray11775 = new float[i];
		anInt11774 = 0;
		for (int i_9_ = 0; i_9_ < i; i_9_++) {
			aFloatArray11776[i_9_] = class536_sub33.method9712(286830889);
			aFloatArray11775[i_9_] = class536_sub33.method9712(1992913807);
		}
	}

	public Class436 method8293(int i) {
		return method8279(459796660);
	}

	void method10309(RSByteBuffer class536_sub33, int i, int i_10_) {
		aFloatArray11776 = new float[i];
		aFloatArray11775 = new float[i];
		anInt11774 = 0;
		for (int i_11_ = 0; i_11_ < i; i_11_++) {
			aFloatArray11776[i_11_] = class536_sub33.method9712(1178854257);
			aFloatArray11775[i_11_] = class536_sub33.method9712(1842021527);
		}
	}

	public Class706_Sub4_Sub2(Class301 class301) {
		super(class301);
	}

	public Class436 method8279(int i) {
		Class436 class436 = Class436.method5238();
		double[] ds = aClass439Array10961[anInt11774 * 946164565].method5308(aFloat10959);
		class436.aFloat4850 = (float) ds[0];
		class436.aFloat4852 = (float) ds[1];
		class436.aFloat4853 = (float) ds[2];
		return class436;
	}

	void method10311(RSByteBuffer class536_sub33, int i) {
		aFloatArray11776 = new float[i];
		aFloatArray11775 = new float[i];
		anInt11774 = 0;
		for (int i_12_ = 0; i_12_ < i; i_12_++) {
			aFloatArray11776[i_12_] = class536_sub33.method9712(1482486963);
			aFloatArray11775[i_12_] = class536_sub33.method9712(-1387704725);
		}
	}

	public Class436 method8288() {
		Class436 class436 = Class436.method5238();
		double[] ds = aClass439Array10961[anInt11774 * 946164565].method5308(aFloat10959);
		class436.aFloat4850 = (float) ds[0];
		class436.aFloat4852 = (float) ds[1];
		class436.aFloat4853 = (float) ds[2];
		return class436;
	}

	void method10312(float f, float f_13_) {
		aFloat10959 += f;
		if (aFloat10959 > (float) aClass439Array10961[anInt11774 * 946164565].method5313())
			aFloat10959 = (float) aClass439Array10961[946164565 * anInt11774].method5313();
	}

	public Class436 method8290() {
		return method8279(459796660);
	}

	public Class436 method8291() {
		return method8279(459796660);
	}

	public Class436 method8292() {
		return method8279(459796660);
	}

	public Class436 method8281() {
		return method8279(459796660);
	}

	void method10315() {
		anInt11774 += 1275335165;
	}

	double[] method10316() {
		return aClass439Array10961[anInt11774 * 946164565].method5308(aFloat10959);
	}

	void method10310(float f, float f_14_) {
		aFloat10959 += f;
		if (aFloat10959 > (float) aClass439Array10961[anInt11774 * 946164565].method5313())
			aFloat10959 = (float) aClass439Array10961[946164565 * anInt11774].method5313();
	}

	public Class436 method8289() {
		Class436 class436 = Class436.method5238();
		double[] ds = aClass439Array10961[anInt11774 * 946164565].method5308(aFloat10959);
		class436.aFloat4850 = (float) ds[0];
		class436.aFloat4852 = (float) ds[1];
		class436.aFloat4853 = (float) ds[2];
		return class436;
	}
}
