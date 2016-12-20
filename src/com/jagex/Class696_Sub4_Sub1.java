/* Class696_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class696_Sub4_Sub1 extends Class696_Sub4 {
	float[] aFloatArray11736;
	float[] aFloatArray11737;
	int anInt11738 = 0;

	public Class696_Sub4_Sub1(Class296 class296) {
		super(class296);
	}

	void method17334(int i) {
		anInt11738 += 615165917;
	}

	float method17333(float f, float f_0_, float f_1_, int i) {
		float f_2_ = aFloat10961 / (float) aClass437Array10960[1223303285 * anInt11738].method6992();
		float f_3_ = ((aFloatArray11737[1223303285 * anInt11738] - aFloatArray11736[1223303285 * anInt11738]) * f_2_ + aFloatArray11736[1223303285 * anInt11738]);
		return f_3_;
	}

	void method17335(float f, float f_4_, int i) {
		aFloat10961 += f;
		if (aFloat10961 > (float) aClass437Array10960[anInt11738 * 1223303285].method6992())
			aFloat10961 = (float) aClass437Array10960[anInt11738 * 1223303285].method6992();
	}

	public Class442 method14245(byte i) {
		Class442 class442 = Class442.method7137();
		double[] ds = aClass437Array10960[anInt11738 * 1223303285].method6991(aFloat10961);
		class442.aFloat4918 = (float) ds[0];
		class442.aFloat4915 = (float) ds[1];
		class442.aFloat4919 = (float) ds[2];
		return class442;
	}

	void method17340() {
		anInt11738 += 615165917;
	}

	public Class442 method14246(byte i) {
		return method14245((byte) 30);
	}

	void method17339() {
		anInt11738 += 615165917;
	}

	float method17336(float f, float f_5_, float f_6_) {
		float f_7_ = aFloat10961 / (float) aClass437Array10960[1223303285 * anInt11738].method6992();
		float f_8_ = ((aFloatArray11737[1223303285 * anInt11738] - aFloatArray11736[1223303285 * anInt11738]) * f_7_ + aFloatArray11736[1223303285 * anInt11738]);
		return f_8_;
	}

	double[] method17350() {
		return aClass437Array10960[1223303285 * anInt11738].method6991(aFloat10961);
	}

	float method17344(float f, float f_9_, float f_10_) {
		float f_11_ = aFloat10961 / (float) aClass437Array10960[1223303285 * anInt11738].method6992();
		float f_12_ = ((aFloatArray11737[1223303285 * anInt11738] - aFloatArray11736[1223303285 * anInt11738]) * f_11_ + aFloatArray11736[1223303285 * anInt11738]);
		return f_12_;
	}

	void method17342(RSByteBuffer class527_sub38, int i) {
		aFloatArray11736 = new float[i];
		aFloatArray11737 = new float[i];
		anInt11738 = 0;
		for (int i_13_ = 0; i_13_ < i; i_13_++) {
			aFloatArray11736[i_13_] = class527_sub38.readFloat(-695959475);
			aFloatArray11737[i_13_] = class527_sub38.readFloat(-1928291497);
		}
	}

	public Class442 method14256() {
		Class442 class442 = Class442.method7137();
		double[] ds = aClass437Array10960[anInt11738 * 1223303285].method6991(aFloat10961);
		class442.aFloat4918 = (float) ds[0];
		class442.aFloat4915 = (float) ds[1];
		class442.aFloat4919 = (float) ds[2];
		return class442;
	}

	float method17337(float f, float f_14_, float f_15_) {
		float f_16_ = aFloat10961 / (float) aClass437Array10960[1223303285 * anInt11738].method6992();
		float f_17_ = ((aFloatArray11737[1223303285 * anInt11738] - aFloatArray11736[1223303285 * anInt11738]) * f_16_ + aFloatArray11736[1223303285 * anInt11738]);
		return f_17_;
	}

	public Class442 method14254() {
		Class442 class442 = Class442.method7137();
		double[] ds = aClass437Array10960[anInt11738 * 1223303285].method6991(aFloat10961);
		class442.aFloat4918 = (float) ds[0];
		class442.aFloat4915 = (float) ds[1];
		class442.aFloat4919 = (float) ds[2];
		return class442;
	}

	void method17341(RSByteBuffer class527_sub38, int i) {
		aFloatArray11736 = new float[i];
		aFloatArray11737 = new float[i];
		anInt11738 = 0;
		for (int i_18_ = 0; i_18_ < i; i_18_++) {
			aFloatArray11736[i_18_] = class527_sub38.readFloat(-676437064);
			aFloatArray11737[i_18_] = class527_sub38.readFloat(-1704175745);
		}
	}

	double[] method17332(byte i) {
		return aClass437Array10960[1223303285 * anInt11738].method6991(aFloat10961);
	}

	public Class442 method14253() {
		Class442 class442 = Class442.method7137();
		double[] ds = aClass437Array10960[anInt11738 * 1223303285].method6991(aFloat10961);
		class442.aFloat4918 = (float) ds[0];
		class442.aFloat4915 = (float) ds[1];
		class442.aFloat4919 = (float) ds[2];
		return class442;
	}

	void method17346(RSByteBuffer class527_sub38, int i, byte i_19_) {
		aFloatArray11736 = new float[i];
		aFloatArray11737 = new float[i];
		anInt11738 = 0;
		for (int i_20_ = 0; i_20_ < i; i_20_++) {
			aFloatArray11736[i_20_] = class527_sub38.readFloat(-357500220);
			aFloatArray11737[i_20_] = class527_sub38.readFloat(-92276404);
		}
	}

	public Class442 method14255() {
		Class442 class442 = Class442.method7137();
		double[] ds = aClass437Array10960[anInt11738 * 1223303285].method6991(aFloat10961);
		class442.aFloat4918 = (float) ds[0];
		class442.aFloat4915 = (float) ds[1];
		class442.aFloat4919 = (float) ds[2];
		return class442;
	}

	void method17345(RSByteBuffer class527_sub38, int i) {
		aFloatArray11736 = new float[i];
		aFloatArray11737 = new float[i];
		anInt11738 = 0;
		for (int i_21_ = 0; i_21_ < i; i_21_++) {
			aFloatArray11736[i_21_] = class527_sub38.readFloat(-1035245730);
			aFloatArray11737[i_21_] = class527_sub38.readFloat(-1432241678);
		}
	}

	public Class442 method14251() {
		return method14245((byte) 86);
	}

	public Class442 method14258() {
		return method14245((byte) 63);
	}

	void method17349(float f, float f_22_) {
		aFloat10961 += f;
		if (aFloat10961 > (float) aClass437Array10960[anInt11738 * 1223303285].method6992())
			aFloat10961 = (float) aClass437Array10960[anInt11738 * 1223303285].method6992();
	}

	float method17338(float f, float f_23_, float f_24_) {
		float f_25_ = aFloat10961 / (float) aClass437Array10960[1223303285 * anInt11738].method6992();
		float f_26_ = ((aFloatArray11737[1223303285 * anInt11738] - aFloatArray11736[1223303285 * anInt11738]) * f_25_ + aFloatArray11736[1223303285 * anInt11738]);
		return f_26_;
	}
}
