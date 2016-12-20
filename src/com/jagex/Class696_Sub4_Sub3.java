/* Class696_Sub4_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class696_Sub4_Sub3 extends Class696_Sub4 {
	float[] aFloatArray11881;
	float[] aFloatArray11882;
	float[] aFloatArray11883;
	int anInt11884 = 0;

	void method17345(RSByteBuffer class527_sub38, int i) {
		aFloatArray11882 = new float[i];
		aFloatArray11883 = new float[i];
		aFloatArray11881 = new float[i];
		anInt11884 = 0;
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			aFloatArray11882[i_0_] = class527_sub38.readFloat(-2024556753);
			aFloatArray11883[i_0_] = class527_sub38.readFloat(-1341033039);
			aFloatArray11881[i_0_] = class527_sub38.readFloat(-882140940);
		}
	}

	void method17342(RSByteBuffer class527_sub38, int i) {
		aFloatArray11882 = new float[i];
		aFloatArray11883 = new float[i];
		aFloatArray11881 = new float[i];
		anInt11884 = 0;
		for (int i_1_ = 0; i_1_ < i; i_1_++) {
			aFloatArray11882[i_1_] = class527_sub38.readFloat(-2125371599);
			aFloatArray11883[i_1_] = class527_sub38.readFloat(-279154190);
			aFloatArray11881[i_1_] = class527_sub38.readFloat(-915563945);
		}
	}

	float method17333(float f, float f_2_, float f_3_, int i) {
		float f_4_ = aFloat10961 / f;
		if (f_4_ < 0.0F)
			f_4_ = 0.0F;
		if (f_4_ > 1.0F)
			f_4_ = 1.0F;
		return ((f_4_ * (aFloatArray11883[anInt11884 * -1205590411] - aFloatArray11882[-1205590411 * anInt11884]) + aFloatArray11882[anInt11884 * -1205590411]) * (f / aFloatArray11881[anInt11884 * -1205590411]));
	}

	void method17346(RSByteBuffer class527_sub38, int i, byte i_5_) {
		aFloatArray11882 = new float[i];
		aFloatArray11883 = new float[i];
		aFloatArray11881 = new float[i];
		anInt11884 = 0;
		for (int i_6_ = 0; i_6_ < i; i_6_++) {
			aFloatArray11882[i_6_] = class527_sub38.readFloat(-705201996);
			aFloatArray11883[i_6_] = class527_sub38.readFloat(-542984330);
			aFloatArray11881[i_6_] = class527_sub38.readFloat(-1496842945);
		}
	}

	public Class696_Sub4_Sub3(Class296 class296) {
		super(class296);
	}

	float method17337(float f, float f_7_, float f_8_) {
		float f_9_ = aFloat10961 / f;
		if (f_9_ < 0.0F)
			f_9_ = 0.0F;
		if (f_9_ > 1.0F)
			f_9_ = 1.0F;
		return ((f_9_ * (aFloatArray11883[anInt11884 * -1205590411] - aFloatArray11882[-1205590411 * anInt11884]) + aFloatArray11882[anInt11884 * -1205590411]) * (f / aFloatArray11881[anInt11884 * -1205590411]));
	}

	float method17344(float f, float f_10_, float f_11_) {
		float f_12_ = aFloat10961 / f;
		if (f_12_ < 0.0F)
			f_12_ = 0.0F;
		if (f_12_ > 1.0F)
			f_12_ = 1.0F;
		return ((f_12_ * (aFloatArray11883[anInt11884 * -1205590411] - aFloatArray11882[-1205590411 * anInt11884]) + aFloatArray11882[anInt11884 * -1205590411]) * (f / aFloatArray11881[anInt11884 * -1205590411]));
	}

	float method17338(float f, float f_13_, float f_14_) {
		float f_15_ = aFloat10961 / f;
		if (f_15_ < 0.0F)
			f_15_ = 0.0F;
		if (f_15_ > 1.0F)
			f_15_ = 1.0F;
		return ((f_15_ * (aFloatArray11883[anInt11884 * -1205590411] - aFloatArray11882[-1205590411 * anInt11884]) + aFloatArray11882[anInt11884 * -1205590411]) * (f / aFloatArray11881[anInt11884 * -1205590411]));
	}

	void method17339() {
		anInt11884 += 595065309;
	}

	void method17340() {
		anInt11884 += 595065309;
	}

	void method17334(int i) {
		anInt11884 += 595065309;
	}

	void method17341(RSByteBuffer class527_sub38, int i) {
		aFloatArray11882 = new float[i];
		aFloatArray11883 = new float[i];
		aFloatArray11881 = new float[i];
		anInt11884 = 0;
		for (int i_16_ = 0; i_16_ < i; i_16_++) {
			aFloatArray11882[i_16_] = class527_sub38.readFloat(-620665818);
			aFloatArray11883[i_16_] = class527_sub38.readFloat(-595446814);
			aFloatArray11881[i_16_] = class527_sub38.readFloat(-866029063);
		}
	}

	float method17336(float f, float f_17_, float f_18_) {
		float f_19_ = aFloat10961 / f;
		if (f_19_ < 0.0F)
			f_19_ = 0.0F;
		if (f_19_ > 1.0F)
			f_19_ = 1.0F;
		return ((f_19_ * (aFloatArray11883[anInt11884 * -1205590411] - aFloatArray11882[-1205590411 * anInt11884]) + aFloatArray11882[anInt11884 * -1205590411]) * (f / aFloatArray11881[anInt11884 * -1205590411]));
	}
}
