/* Class327_Sub3_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class327_Sub3_Sub3 extends Class327_Sub3 {
	float[] aFloatArray11614;
	float[] aFloatArray11615;
	float[] aFloatArray11616;
	int anInt11617 = 0;

	float method15849(float f, float f_0_, float f_1_) {
		float f_2_ = aFloat10212 / f;
		if (f_2_ < 0.0F)
			f_2_ = 0.0F;
		if (f_2_ > 1.0F)
			f_2_ = 1.0F;
		return (f / aFloatArray11616[anInt11617 * -1884187493] * ((aFloatArray11615[-1884187493 * anInt11617] - aFloatArray11614[-1884187493 * anInt11617]) * f_2_ + aFloatArray11614[anInt11617 * -1884187493]));
	}

	void method15844(byte i) {
		anInt11617 += -115199597;
	}

	float method15842(float f, float f_3_, float f_4_, byte i) {
		float f_5_ = aFloat10212 / f;
		if (f_5_ < 0.0F)
			f_5_ = 0.0F;
		if (f_5_ > 1.0F)
			f_5_ = 1.0F;
		return (f / aFloatArray11616[anInt11617 * -1884187493] * ((aFloatArray11615[-1884187493 * anInt11617] - aFloatArray11614[-1884187493 * anInt11617]) * f_5_ + aFloatArray11614[anInt11617 * -1884187493]));
	}

	void method15853(RSByteBuffer class527_sub38, int i, int i_6_) {
		aFloatArray11614 = new float[i];
		aFloatArray11615 = new float[i];
		aFloatArray11616 = new float[i];
		anInt11617 = 0;
		for (int i_7_ = 0; i_7_ < i; i_7_++) {
			aFloatArray11614[i_7_] = class527_sub38.readFloat(-1755251181);
			aFloatArray11615[i_7_] = class527_sub38.readFloat(-17186444);
			aFloatArray11616[i_7_] = class527_sub38.readFloat(-672512071);
		}
	}

	void method15852(RSByteBuffer class527_sub38, int i) {
		aFloatArray11614 = new float[i];
		aFloatArray11615 = new float[i];
		aFloatArray11616 = new float[i];
		anInt11617 = 0;
		for (int i_8_ = 0; i_8_ < i; i_8_++) {
			aFloatArray11614[i_8_] = class527_sub38.readFloat(-54097466);
			aFloatArray11615[i_8_] = class527_sub38.readFloat(-1175267997);
			aFloatArray11616[i_8_] = class527_sub38.readFloat(-386529430);
		}
	}

	float method15855(float f, float f_9_, float f_10_) {
		float f_11_ = aFloat10212 / f;
		if (f_11_ < 0.0F)
			f_11_ = 0.0F;
		if (f_11_ > 1.0F)
			f_11_ = 1.0F;
		return (f / aFloatArray11616[anInt11617 * -1884187493] * ((aFloatArray11615[-1884187493 * anInt11617] - aFloatArray11614[-1884187493 * anInt11617]) * f_11_ + aFloatArray11614[anInt11617 * -1884187493]));
	}

	float method15843(float f, float f_12_, float f_13_) {
		float f_14_ = aFloat10212 / f;
		if (f_14_ < 0.0F)
			f_14_ = 0.0F;
		if (f_14_ > 1.0F)
			f_14_ = 1.0F;
		return (f / aFloatArray11616[anInt11617 * -1884187493] * ((aFloatArray11615[-1884187493 * anInt11617] - aFloatArray11614[-1884187493 * anInt11617]) * f_14_ + aFloatArray11614[anInt11617 * -1884187493]));
	}

	void method15851(RSByteBuffer class527_sub38, int i) {
		aFloatArray11614 = new float[i];
		aFloatArray11615 = new float[i];
		aFloatArray11616 = new float[i];
		anInt11617 = 0;
		for (int i_15_ = 0; i_15_ < i; i_15_++) {
			aFloatArray11614[i_15_] = class527_sub38.readFloat(-1399765443);
			aFloatArray11615[i_15_] = class527_sub38.readFloat(-975722207);
			aFloatArray11616[i_15_] = class527_sub38.readFloat(-1898232414);
		}
	}

	float method15845(float f, float f_16_, float f_17_) {
		float f_18_ = aFloat10212 / f;
		if (f_18_ < 0.0F)
			f_18_ = 0.0F;
		if (f_18_ > 1.0F)
			f_18_ = 1.0F;
		return (f / aFloatArray11616[anInt11617 * -1884187493] * ((aFloatArray11615[-1884187493 * anInt11617] - aFloatArray11614[-1884187493 * anInt11617]) * f_18_ + aFloatArray11614[anInt11617 * -1884187493]));
	}

	void method15846() {
		anInt11617 += -115199597;
	}

	void method15850() {
		anInt11617 += -115199597;
	}

	public Class327_Sub3_Sub3(Class296 class296) {
		super(class296);
	}

	void method15848() {
		anInt11617 += -115199597;
	}

	void method15847(RSByteBuffer class527_sub38, int i) {
		aFloatArray11614 = new float[i];
		aFloatArray11615 = new float[i];
		aFloatArray11616 = new float[i];
		anInt11617 = 0;
		for (int i_19_ = 0; i_19_ < i; i_19_++) {
			aFloatArray11614[i_19_] = class527_sub38.readFloat(-1623729814);
			aFloatArray11615[i_19_] = class527_sub38.readFloat(-1549112456);
			aFloatArray11616[i_19_] = class527_sub38.readFloat(-286672649);
		}
	}
}
