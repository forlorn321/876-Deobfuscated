/* Class696_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class696_Sub4 extends Class696 {
	int[] anIntArray10958;
	float[] aFloatArray10959;
	Class437[] aClass437Array10960;
	float aFloat10961;
	int anInt10962 = 0;
	float aFloat10963;

	public void method14260(RSByteBuffer class527_sub38) {
		aFloat10961 = 0.0F;
		aFloat10963 = 0.0F;
		anInt10962 = 0;
		int i = class527_sub38.readUnsignedByte();
		aClass437Array10960 = new Class437[i];
		aFloatArray10959 = new float[i];
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			aClass437Array10960[i_0_] = new Class437(class527_sub38);
			aFloatArray10959[i_0_] = class527_sub38.readFloat(-1361709475);
		}
		method17346(class527_sub38, i, (byte) -34);
	}

	public boolean method14252() {
		return null != aClass437Array10960;
	}

	double[] method17332(byte i) {
		return aClass437Array10960[anInt10962 * 1593915563].method6994(aFloat10961);
	}

	public Class442 method14254() {
		Class442 class442 = Class442.method7137();
		double[] ds = aClass437Array10960[1593915563 * anInt10962].method6994(aFloat10961);
		class442.aFloat4918 = (float) ds[0];
		class442.aFloat4915 = (float) ds[1];
		class442.aFloat4919 = (float) ds[2];
		return class442;
	}

	abstract float method17333(float f, float f_1_, float f_2_, int i);

	abstract void method17334(int i);

	public boolean method14244(int i) {
		return null != aClass437Array10960;
	}

	public Class442 method14255() {
		Class442 class442 = Class442.method7137();
		double[] ds = aClass437Array10960[1593915563 * anInt10962].method6994(aFloat10961);
		class442.aFloat4918 = (float) ds[0];
		class442.aFloat4915 = (float) ds[1];
		class442.aFloat4919 = (float) ds[2];
		return class442;
	}

	public Class442 method14246(byte i) {
		return method14245((byte) 97);
	}

	void method17335(float f, float f_3_, int i) {
		aFloat10961 += f;
		if (aFloat10961 > f_3_)
			aFloat10961 = f_3_;
	}

	public void method14243(Class302 class302, Class432 class432, int i, int i_4_, float f, int i_5_) {
		double[] ds = aClass296_8753.method5341(2011746197);
		ds[0] -= (double) i;
		ds[2] -= (double) i_4_;
		double[] ds_6_ = method17332((byte) -60);
		ds_6_[0] -= (double) i;
		ds_6_[2] -= (double) i_4_;
		ds[1] *= -1.0;
		ds_6_[1] *= -1.0;
		Class442 class442 = Class442.method7137();
		class442.aFloat4918 = (float) (ds_6_[0] - ds[0]);
		class442.aFloat4915 = (float) (ds_6_[1] - ds[1]);
		class442.aFloat4919 = (float) (ds_6_[2] - ds[2]);
		class442.method7173();
		Class438 class438 = new Class438();
		class438.method7091(class442, f);
		Class442 class442_7_ = Class442.method7166(0.0F, 1.0F, 0.0F);
		Class442 class442_8_ = Class442.method7159(class442, class442_7_);
		class442_7_ = Class442.method7159(class442_8_, class442);
		class442_7_.method7157(class438);
		class432.method6945(ds[0], ds[1], ds[2], ds_6_[0], ds_6_[1], ds_6_[2], class442_7_.aFloat4918, class442_7_.aFloat4915, class442_7_.aFloat4919);
		class442_7_.method7141();
	}

	public void method14248(RSByteBuffer class527_sub38, int i) {
		aFloat10961 = 0.0F;
		aFloat10963 = 0.0F;
		anInt10962 = 0;
		int i_9_ = class527_sub38.readUnsignedByte();
		aClass437Array10960 = new Class437[i_9_];
		aFloatArray10959 = new float[i_9_];
		for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
			aClass437Array10960[i_10_] = new Class437(class527_sub38);
			aFloatArray10959[i_10_] = class527_sub38.readFloat(-114960210);
		}
		method17346(class527_sub38, i_9_, (byte) 6);
	}

	Class696_Sub4(Class296 class296) {
		super(class296);
		aFloat10961 = 0.0F;
		aFloat10963 = 0.0F;
	}

	abstract float method17336(float f, float f_11_, float f_12_);

	abstract float method17337(float f, float f_13_, float f_14_);

	public Class442 method14251() {
		return method14245((byte) 39);
	}

	abstract float method17338(float f, float f_15_, float f_16_);

	abstract void method17339();

	abstract void method17340();

	public boolean method14247() {
		return null != aClass437Array10960;
	}

	abstract void method17341(RSByteBuffer class527_sub38, int i);

	abstract void method17342(RSByteBuffer class527_sub38, int i);

	public void method14249(float f) {
		Class437 class437 = aClass437Array10960[1593915563 * anInt10962];
		if (aFloatArray10959[1593915563 * anInt10962] > 0.0F) {
			if (aFloatArray10959[anInt10962 * 1593915563] >= f) {
				aFloatArray10959[1593915563 * anInt10962] -= f;
				return;
			}
			f -= aFloatArray10959[1593915563 * anInt10962];
			aFloatArray10959[anInt10962 * 1593915563] = 0.0F;
		}
		float f_17_ = 1.0F / (float) Class259.method4781((byte) -16);
		while (f > 0.0F) {
			float f_18_ = class437.method6996();
			if (aFloat10961 >= f_18_) {
				if (aClass437Array10960.length == 1 + 1593915563 * anInt10962)
					break;
				if (aFloatArray10959[1 + anInt10962 * 1593915563] >= f) {
					aFloatArray10959[anInt10962 * 1593915563 + 1] -= f;
					break;
				}
				anInt10962 += -1214184957;
				f -= aFloatArray10959[anInt10962 * 1593915563];
				aFloatArray10959[anInt10962 * 1593915563] = 0.0F;
				method17334(-1545079827);
				aFloat10961 = 0.0F;
				aFloat10963 = 0.0F;
				class437 = aClass437Array10960[anInt10962 * 1593915563];
				f_18_ = class437.method6996();
			}
			while (f > 0.0F && aFloat10961 < f_18_) {
				aFloat10963 = method17333(f_18_, aFloat10963, Math.min(f, f_17_), 225772937);
				f -= f_17_;
				method17335(aFloat10963, f_18_, -961301383);
			}
		}
	}

	public void method17343(Class437 class437, int i, float f, byte i_19_) {
		if (null == aClass437Array10960) {
			aClass437Array10960 = new Class437[] { class437 };
			aFloatArray10959 = new float[] { f };
			anIntArray10958 = new int[] { i };
		} else {
			Class437[] class437s = new Class437[aClass437Array10960.length + 1];
			float[] fs = new float[aClass437Array10960.length + 1];
			int[] is = new int[aClass437Array10960.length + 1];
			System.arraycopy(aClass437Array10960, 0, class437s, 0, aClass437Array10960.length);
			System.arraycopy(aFloatArray10959, 0, fs, 0, aClass437Array10960.length);
			System.arraycopy(anIntArray10958, 0, is, 0, aClass437Array10960.length);
			aClass437Array10960 = class437s;
			aFloatArray10959 = fs;
			anIntArray10958 = is;
			aClass437Array10960[aClass437Array10960.length - 1] = class437;
			aFloatArray10959[aFloatArray10959.length - 1] = f;
			anIntArray10958[anIntArray10958.length - 1] = i;
		}
	}

	abstract float method17344(float f, float f_20_, float f_21_);

	public void method14257(Class302 class302, Class432 class432, int i, int i_22_, float f) {
		double[] ds = aClass296_8753.method5341(1991024163);
		ds[0] -= (double) i;
		ds[2] -= (double) i_22_;
		double[] ds_23_ = method17332((byte) -2);
		ds_23_[0] -= (double) i;
		ds_23_[2] -= (double) i_22_;
		ds[1] *= -1.0;
		ds_23_[1] *= -1.0;
		Class442 class442 = Class442.method7137();
		class442.aFloat4918 = (float) (ds_23_[0] - ds[0]);
		class442.aFloat4915 = (float) (ds_23_[1] - ds[1]);
		class442.aFloat4919 = (float) (ds_23_[2] - ds[2]);
		class442.method7173();
		Class438 class438 = new Class438();
		class438.method7091(class442, f);
		Class442 class442_24_ = Class442.method7166(0.0F, 1.0F, 0.0F);
		Class442 class442_25_ = Class442.method7159(class442, class442_24_);
		class442_24_ = Class442.method7159(class442_25_, class442);
		class442_24_.method7157(class438);
		class432.method6945(ds[0], ds[1], ds[2], ds_23_[0], ds_23_[1], ds_23_[2], class442_24_.aFloat4918, class442_24_.aFloat4915, class442_24_.aFloat4919);
		class442_24_.method7141();
	}

	public Class442 method14253() {
		Class442 class442 = Class442.method7137();
		double[] ds = aClass437Array10960[1593915563 * anInt10962].method6994(aFloat10961);
		class442.aFloat4918 = (float) ds[0];
		class442.aFloat4915 = (float) ds[1];
		class442.aFloat4919 = (float) ds[2];
		return class442;
	}

	public Class442 method14258() {
		return method14245((byte) 112);
	}

	abstract void method17345(RSByteBuffer class527_sub38, int i);

	public Class442 method14256() {
		Class442 class442 = Class442.method7137();
		double[] ds = aClass437Array10960[1593915563 * anInt10962].method6994(aFloat10961);
		class442.aFloat4918 = (float) ds[0];
		class442.aFloat4915 = (float) ds[1];
		class442.aFloat4919 = (float) ds[2];
		return class442;
	}

	abstract void method17346(RSByteBuffer class527_sub38, int i, byte i_26_);

	public Class442 method14245(byte i) {
		Class442 class442 = Class442.method7137();
		double[] ds = aClass437Array10960[1593915563 * anInt10962].method6994(aFloat10961);
		class442.aFloat4918 = (float) ds[0];
		class442.aFloat4915 = (float) ds[1];
		class442.aFloat4919 = (float) ds[2];
		return class442;
	}

	public void method14259(RSByteBuffer class527_sub38) {
		aFloat10961 = 0.0F;
		aFloat10963 = 0.0F;
		anInt10962 = 0;
		int i = class527_sub38.readUnsignedByte();
		aClass437Array10960 = new Class437[i];
		aFloatArray10959 = new float[i];
		for (int i_27_ = 0; i_27_ < i; i_27_++) {
			aClass437Array10960[i_27_] = new Class437(class527_sub38);
			aFloatArray10959[i_27_] = class527_sub38.readFloat(-2074084567);
		}
		method17346(class527_sub38, i, (byte) 6);
	}

	public void method14250(float f, int i) {
		Class437 class437 = aClass437Array10960[1593915563 * anInt10962];
		if (aFloatArray10959[1593915563 * anInt10962] > 0.0F) {
			if (aFloatArray10959[anInt10962 * 1593915563] >= f) {
				aFloatArray10959[1593915563 * anInt10962] -= f;
				return;
			}
			f -= aFloatArray10959[1593915563 * anInt10962];
			aFloatArray10959[anInt10962 * 1593915563] = 0.0F;
		}
		float f_28_ = 1.0F / (float) Class259.method4781((byte) 107);
		while (f > 0.0F) {
			float f_29_ = class437.method6996();
			if (aFloat10961 >= f_29_) {
				if (aClass437Array10960.length == 1 + 1593915563 * anInt10962)
					break;
				if (aFloatArray10959[1 + anInt10962 * 1593915563] >= f) {
					aFloatArray10959[anInt10962 * 1593915563 + 1] -= f;
					break;
				}
				anInt10962 += -1214184957;
				f -= aFloatArray10959[anInt10962 * 1593915563];
				aFloatArray10959[anInt10962 * 1593915563] = 0.0F;
				method17334(-1410318484);
				aFloat10961 = 0.0F;
				aFloat10963 = 0.0F;
				class437 = aClass437Array10960[anInt10962 * 1593915563];
				f_29_ = class437.method6996();
			}
			while (f > 0.0F && aFloat10961 < f_29_) {
				aFloat10963 = method17333(f_29_, aFloat10963, Math.min(f, f_28_), 225772937);
				f -= f_28_;
				method17335(aFloat10963, f_29_, 2135139679);
			}
		}
	}

	public void method17347(Class437 class437, int i, float f) {
		if (null == aClass437Array10960) {
			aClass437Array10960 = new Class437[] { class437 };
			aFloatArray10959 = new float[] { f };
			anIntArray10958 = new int[] { i };
		} else {
			Class437[] class437s = new Class437[aClass437Array10960.length + 1];
			float[] fs = new float[aClass437Array10960.length + 1];
			int[] is = new int[aClass437Array10960.length + 1];
			System.arraycopy(aClass437Array10960, 0, class437s, 0, aClass437Array10960.length);
			System.arraycopy(aFloatArray10959, 0, fs, 0, aClass437Array10960.length);
			System.arraycopy(anIntArray10958, 0, is, 0, aClass437Array10960.length);
			aClass437Array10960 = class437s;
			aFloatArray10959 = fs;
			anIntArray10958 = is;
			aClass437Array10960[aClass437Array10960.length - 1] = class437;
			aFloatArray10959[aFloatArray10959.length - 1] = f;
			anIntArray10958[anIntArray10958.length - 1] = i;
		}
	}

	public void method17348(Class437 class437, int i, float f) {
		if (null == aClass437Array10960) {
			aClass437Array10960 = new Class437[] { class437 };
			aFloatArray10959 = new float[] { f };
			anIntArray10958 = new int[] { i };
		} else {
			Class437[] class437s = new Class437[aClass437Array10960.length + 1];
			float[] fs = new float[aClass437Array10960.length + 1];
			int[] is = new int[aClass437Array10960.length + 1];
			System.arraycopy(aClass437Array10960, 0, class437s, 0, aClass437Array10960.length);
			System.arraycopy(aFloatArray10959, 0, fs, 0, aClass437Array10960.length);
			System.arraycopy(anIntArray10958, 0, is, 0, aClass437Array10960.length);
			aClass437Array10960 = class437s;
			aFloatArray10959 = fs;
			anIntArray10958 = is;
			aClass437Array10960[aClass437Array10960.length - 1] = class437;
			aFloatArray10959[aFloatArray10959.length - 1] = f;
			anIntArray10958[anIntArray10958.length - 1] = i;
		}
	}

	void method17349(float f, float f_30_) {
		aFloat10961 += f;
		if (aFloat10961 > f_30_)
			aFloat10961 = f_30_;
	}

	double[] method17350() {
		return aClass437Array10960[anInt10962 * 1593915563].method6994(aFloat10961);
	}

	static Class410[] method17351(int i) {
		return (new Class410[] { Class410.aClass410_4347, Class410.aClass410_4343, Class410.aClass410_4349, Class410.aClass410_4346, Class410.aClass410_4352, Class410.aClass410_4355, Class410.aClass410_4351, Class410.aClass410_4350, Class410.aClass410_4348, Class410.aClass410_4353, Class410.aClass410_4345, Class410.aClass410_4342 });
	}
}
