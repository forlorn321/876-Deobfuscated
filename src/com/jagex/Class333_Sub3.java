/* Class333_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class333_Sub3 extends Class333 {
	float aFloat10112;
	float[] aFloatArray10113;
	Class439[] aClass439Array10114;
	int anInt10115 = 0;
	float aFloat10116 = 0.0F;
	int[] anIntArray10117;

	public Class436 method4362() {
		Class436 class436 = Class436.method5238();
		double[] ds = aClass439Array10114[anInt10115 * -144801315].method5319(aFloat10116);
		class436.aFloat4850 = (float) ds[0];
		class436.aFloat4852 = (float) ds[1];
		class436.aFloat4853 = (float) ds[2];
		return class436;
	}

	public void method9213(Class439 class439, int i, float f, byte i_0_) {
		if (aClass439Array10114 == null) {
			aClass439Array10114 = new Class439[] { class439 };
			aFloatArray10113 = new float[] { f };
			anIntArray10117 = new int[] { i };
		} else {
			Class439[] class439s = new Class439[1 + aClass439Array10114.length];
			float[] fs = new float[1 + aClass439Array10114.length];
			int[] is = new int[aClass439Array10114.length + 1];
			System.arraycopy(aClass439Array10114, 0, class439s, 0, aClass439Array10114.length);
			System.arraycopy(aFloatArray10113, 0, fs, 0, aClass439Array10114.length);
			System.arraycopy(anIntArray10117, 0, is, 0, aClass439Array10114.length);
			aClass439Array10114 = class439s;
			aFloatArray10113 = fs;
			anIntArray10117 = is;
			aClass439Array10114[aClass439Array10114.length - 1] = class439;
			aFloatArray10113[aFloatArray10113.length - 1] = f;
			anIntArray10117[anIntArray10117.length - 1] = i;
		}
	}

	public void method4345(float f, int[][][] is, Class455 class455, int i, int i_1_, int i_2_) {
		Class439 class439 = aClass439Array10114[-144801315 * anInt10115];
		if (aFloatArray10113[-144801315 * anInt10115] > 0.0F) {
			if (aFloatArray10113[anInt10115 * -144801315] >= f) {
				aFloatArray10113[-144801315 * anInt10115] -= f;
				return;
			}
			f -= aFloatArray10113[anInt10115 * -144801315];
			aFloatArray10113[anInt10115 * -144801315] = 0.0F;
		}
		float f_3_ = 1.0F / (float) Class319_Sub1.method9134(1323978354);
		while (f > 0.0F) {
			float f_4_ = class439.method5306();
			if (aFloat10116 >= f_4_) {
				if (aClass439Array10114.length == 1 + anInt10115 * -144801315)
					break;
				if (aFloatArray10113[1 + -144801315 * anInt10115] >= f) {
					aFloatArray10113[-144801315 * anInt10115 + 1] -= f;
					break;
				}
				anInt10115 += 895868533;
				f -= aFloatArray10113[anInt10115 * -144801315];
				aFloatArray10113[-144801315 * anInt10115] = 0.0F;
				method9228(904297854);
				aFloat10116 = 0.0F;
				aFloat10112 = 0.0F;
				class439 = aClass439Array10114[-144801315 * anInt10115];
				f_4_ = class439.method5306();
			}
			while (f > 0.0F && aFloat10116 < f_4_) {
				aFloat10112 = method9215(f_4_, aFloat10112, Math.min(f, f_3_), (byte) -77);
				f -= f_3_;
				method9214(aFloat10112, f_4_, -2111329775);
			}
		}
	}

	void method9214(float f, float f_5_, int i) {
		aFloat10116 += f;
		if (aFloat10116 > f_5_)
			aFloat10116 = f_5_;
	}

	Class333_Sub3(Class301 class301) {
		super(class301);
		aFloat10112 = 0.0F;
	}

	abstract float method9215(float f, float f_6_, float f_7_, byte i);

	public boolean method4342(int i) {
		return aClass439Array10114 != null;
	}

	public Class436 method4343(byte i) {
		Class436 class436 = Class436.method5238();
		double[] ds = aClass439Array10114[anInt10115 * -144801315].method5319(aFloat10116);
		class436.aFloat4850 = (float) ds[0];
		class436.aFloat4852 = (float) ds[1];
		class436.aFloat4853 = (float) ds[2];
		return class436;
	}

	public double[] method4344(int i) {
		return aClass439Array10114[-144801315 * anInt10115].method5319(aFloat10116);
	}

	public void method4358(RSByteBuffer class536_sub33) {
		aFloat10116 = 0.0F;
		aFloat10112 = 0.0F;
		anInt10115 = 0;
		int i = class536_sub33.readUnsignedByte(1935054098);
		aClass439Array10114 = new Class439[i];
		aFloatArray10113 = new float[i];
		for (int i_8_ = 0; i_8_ < i; i_8_++) {
			aClass439Array10114[i_8_] = new Class439(class536_sub33);
			aFloatArray10113[i_8_] = class536_sub33.method9712(2057731205);
		}
		method9218(class536_sub33, i, -1376860709);
	}

	public float method9216(int i) {
		return aClass439Array10114[-144801315 * anInt10115].method5307(aFloat10116);
	}

	void method9217(float f, float f_9_) {
		aFloat10116 += f;
		if (aFloat10116 > f_9_)
			aFloat10116 = f_9_;
	}

	public void method4340(Class305 class305, int i, int i_10_, int i_11_) {
		Class436 class436 = method4343((byte) -34);
		class305.anInt3441 = ((int) class436.aFloat4850 - i) * 164961599;
		class305.anInt3442 = 1436659191 * (int) -class436.aFloat4852;
		class305.anInt3443 = -1246574647 * ((int) class436.aFloat4853 - i_10_);
	}

	public Class536_Sub30 method4360() {
		Class436 class436 = method4343((byte) 19);
		return new Class536_Sub30(0, (int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853);
	}

	abstract void method9218(RSByteBuffer class536_sub33, int i, int i_12_);

	abstract float method9219(float f, float f_13_, float f_14_);

	abstract float method9220(float f, float f_15_, float f_16_);

	public float method4346(int i) {
		return aClass439Array10114[anInt10115 * -144801315].method5309(aFloat10116);
	}

	abstract void method9221();

	public boolean method4350() {
		return aClass439Array10114 != null;
	}

	abstract void method9222(RSByteBuffer class536_sub33, int i);

	public void method4349(float f, int[][][] is, Class455 class455, int i, int i_17_) {
		Class439 class439 = aClass439Array10114[-144801315 * anInt10115];
		if (aFloatArray10113[-144801315 * anInt10115] > 0.0F) {
			if (aFloatArray10113[anInt10115 * -144801315] >= f) {
				aFloatArray10113[-144801315 * anInt10115] -= f;
				return;
			}
			f -= aFloatArray10113[anInt10115 * -144801315];
			aFloatArray10113[anInt10115 * -144801315] = 0.0F;
		}
		float f_18_ = 1.0F / (float) Class319_Sub1.method9134(81994419);
		while (f > 0.0F) {
			float f_19_ = class439.method5306();
			if (aFloat10116 >= f_19_) {
				if (aClass439Array10114.length == 1 + anInt10115 * -144801315)
					break;
				if (aFloatArray10113[1 + -144801315 * anInt10115] >= f) {
					aFloatArray10113[-144801315 * anInt10115 + 1] -= f;
					break;
				}
				anInt10115 += 895868533;
				f -= aFloatArray10113[anInt10115 * -144801315];
				aFloatArray10113[-144801315 * anInt10115] = 0.0F;
				method9228(-1091693645);
				aFloat10116 = 0.0F;
				aFloat10112 = 0.0F;
				class439 = aClass439Array10114[-144801315 * anInt10115];
				f_19_ = class439.method5306();
			}
			while (f > 0.0F && aFloat10116 < f_19_) {
				aFloat10112 = method9215(f_19_, aFloat10112, Math.min(f, f_18_), (byte) -111);
				f -= f_18_;
				method9214(aFloat10112, f_19_, -2086641731);
			}
		}
	}

	public boolean method4352() {
		return aClass439Array10114 != null;
	}

	public boolean method4351() {
		return aClass439Array10114 != null;
	}

	public float method9223() {
		return aClass439Array10114[-144801315 * anInt10115].method5307(aFloat10116);
	}

	public Class436 method4356() {
		Class436 class436 = Class436.method5238();
		double[] ds = aClass439Array10114[anInt10115 * -144801315].method5319(aFloat10116);
		class436.aFloat4850 = (float) ds[0];
		class436.aFloat4852 = (float) ds[1];
		class436.aFloat4853 = (float) ds[2];
		return class436;
	}

	public float method9224() {
		return aClass439Array10114[-144801315 * anInt10115].method5307(aFloat10116);
	}

	public Class536_Sub30 method4353(int i) {
		Class436 class436 = method4343((byte) 80);
		return new Class536_Sub30(0, (int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853);
	}

	public Class436 method4355() {
		Class436 class436 = Class436.method5238();
		double[] ds = aClass439Array10114[anInt10115 * -144801315].method5319(aFloat10116);
		class436.aFloat4850 = (float) ds[0];
		class436.aFloat4852 = (float) ds[1];
		class436.aFloat4853 = (float) ds[2];
		return class436;
	}

	public Class536_Sub30 method4347() {
		Class436 class436 = method4343((byte) 29);
		return new Class536_Sub30(0, (int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853);
	}

	public Class536_Sub30 method4357() {
		Class436 class436 = method4343((byte) -75);
		return new Class536_Sub30(0, (int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853);
	}

	public double[] method4361() {
		return aClass439Array10114[-144801315 * anInt10115].method5319(aFloat10116);
	}

	public void method4359(Class305 class305, int i, int i_20_) {
		Class436 class436 = method4343((byte) 12);
		class305.anInt3441 = ((int) class436.aFloat4850 - i) * 164961599;
		class305.anInt3442 = 1436659191 * (int) -class436.aFloat4852;
		class305.anInt3443 = -1246574647 * ((int) class436.aFloat4853 - i_20_);
	}

	abstract void method9225(RSByteBuffer class536_sub33, int i);

	public void method4348(RSByteBuffer class536_sub33, byte i) {
		aFloat10116 = 0.0F;
		aFloat10112 = 0.0F;
		anInt10115 = 0;
		int i_21_ = class536_sub33.readUnsignedByte(329899068);
		aClass439Array10114 = new Class439[i_21_];
		aFloatArray10113 = new float[i_21_];
		for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
			aClass439Array10114[i_22_] = new Class439(class536_sub33);
			aFloatArray10113[i_22_] = class536_sub33.method9712(-213927998);
		}
		method9218(class536_sub33, i_21_, -1044723760);
	}

	public double[] method4341() {
		return aClass439Array10114[-144801315 * anInt10115].method5319(aFloat10116);
	}

	public double[] method4363() {
		return aClass439Array10114[-144801315 * anInt10115].method5319(aFloat10116);
	}

	public float method4364() {
		return aClass439Array10114[anInt10115 * -144801315].method5309(aFloat10116);
	}

	public float method4365() {
		return aClass439Array10114[anInt10115 * -144801315].method5309(aFloat10116);
	}

	void method9226(float f, float f_23_) {
		aFloat10116 += f;
		if (aFloat10116 > f_23_)
			aFloat10116 = f_23_;
	}

	abstract void method9227();

	public Class436 method4354() {
		Class436 class436 = Class436.method5238();
		double[] ds = aClass439Array10114[anInt10115 * -144801315].method5319(aFloat10116);
		class436.aFloat4850 = (float) ds[0];
		class436.aFloat4852 = (float) ds[1];
		class436.aFloat4853 = (float) ds[2];
		return class436;
	}

	abstract void method9228(int i);

	static void method9229(int i) {
		if (Class54.aClass167_600 != null) {
			Class54.aClass167_600.method2005(778784407);
			Class54.aClass167_600 = null;
			Class54.aClass184_601 = null;
		}
	}

	public static Class395[] method9230(int i) {
		return (new Class395[] { Class395.aClass395_4106, Class395.aClass395_4107, Class395.aClass395_4108 });
	}
}
