/* Class706_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class706_Sub4 extends Class706 {
	float aFloat10957;
	float[] aFloatArray10958;
	float aFloat10959;
	int anInt10960 = 0;
	Class439[] aClass439Array10961;
	int[] anIntArray10962;

	public void method8284(float f) {
		Class439 class439 = aClass439Array10961[anInt10960 * -1239275247];
		if (aFloatArray10958[anInt10960 * -1239275247] > 0.0F) {
			if (aFloatArray10958[anInt10960 * -1239275247] >= f) {
				aFloatArray10958[anInt10960 * -1239275247] -= f;
				return;
			}
			f -= aFloatArray10958[-1239275247 * anInt10960];
			aFloatArray10958[anInt10960 * -1239275247] = 0.0F;
		}
		float f_0_ = 1.0F / (float) Class319_Sub1.method9134(397076316);
		while (f > 0.0F) {
			float f_1_ = class439.method5306();
			if (aFloat10959 >= f_1_) {
				if (aClass439Array10961.length == anInt10960 * -1239275247 + 1)
					break;
				if (aFloatArray10958[1 + -1239275247 * anInt10960] >= f) {
					aFloatArray10958[anInt10960 * -1239275247 + 1] -= f;
					break;
				}
				anInt10960 += 1916397553;
				f -= aFloatArray10958[-1239275247 * anInt10960];
				aFloatArray10958[-1239275247 * anInt10960] = 0.0F;
				method10306(-989836992);
				aFloat10959 = 0.0F;
				aFloat10957 = 0.0F;
				class439 = aClass439Array10961[anInt10960 * -1239275247];
				f_1_ = class439.method5306();
			}
			while (f > 0.0F && aFloat10959 < f_1_) {
				aFloat10957 = method10305(f_1_, aFloat10957, Math.min(f, f_0_), 791471457);
				f -= f_0_;
				method10308(aFloat10957, f_1_, 1727828999);
			}
		}
	}

	public boolean method8282() {
		return aClass439Array10961 != null;
	}

	public void method8286(float f, int i) {
		Class439 class439 = aClass439Array10961[anInt10960 * -1239275247];
		if (aFloatArray10958[anInt10960 * -1239275247] > 0.0F) {
			if (aFloatArray10958[anInt10960 * -1239275247] >= f) {
				aFloatArray10958[anInt10960 * -1239275247] -= f;
				return;
			}
			f -= aFloatArray10958[-1239275247 * anInt10960];
			aFloatArray10958[anInt10960 * -1239275247] = 0.0F;
		}
		float f_2_ = 1.0F / (float) Class319_Sub1.method9134(1650696780);
		while (f > 0.0F) {
			float f_3_ = class439.method5306();
			if (aFloat10959 >= f_3_) {
				if (aClass439Array10961.length == anInt10960 * -1239275247 + 1)
					break;
				if (aFloatArray10958[1 + -1239275247 * anInt10960] >= f) {
					aFloatArray10958[anInt10960 * -1239275247 + 1] -= f;
					break;
				}
				anInt10960 += 1916397553;
				f -= aFloatArray10958[-1239275247 * anInt10960];
				aFloatArray10958[-1239275247 * anInt10960] = 0.0F;
				method10306(-1137863929);
				aFloat10959 = 0.0F;
				aFloat10957 = 0.0F;
				class439 = aClass439Array10961[anInt10960 * -1239275247];
				f_3_ = class439.method5306();
			}
			while (f > 0.0F && aFloat10959 < f_3_) {
				aFloat10957 = method10305(f_3_, aFloat10957, Math.min(f, f_2_), 246884566);
				f -= f_2_;
				method10308(aFloat10957, f_3_, 121502265);
			}
		}
	}

	public void method10304(Class439 class439, int i, float f, int i_4_) {
		if (null == aClass439Array10961) {
			aClass439Array10961 = new Class439[] { class439 };
			aFloatArray10958 = new float[] { f };
			anIntArray10962 = new int[] { i };
		} else {
			Class439[] class439s = new Class439[aClass439Array10961.length + 1];
			float[] fs = new float[aClass439Array10961.length + 1];
			int[] is = new int[1 + aClass439Array10961.length];
			System.arraycopy(aClass439Array10961, 0, class439s, 0, aClass439Array10961.length);
			System.arraycopy(aFloatArray10958, 0, fs, 0, aClass439Array10961.length);
			System.arraycopy(anIntArray10962, 0, is, 0, aClass439Array10961.length);
			aClass439Array10961 = class439s;
			aFloatArray10958 = fs;
			anIntArray10962 = is;
			aClass439Array10961[aClass439Array10961.length - 1] = class439;
			aFloatArray10958[aFloatArray10958.length - 1] = f;
			anIntArray10962[anIntArray10962.length - 1] = i;
		}
	}

	abstract float method10305(float f, float f_5_, float f_6_, int i);

	abstract void method10306(int i);

	Class706_Sub4(Class301 class301) {
		super(class301);
		aFloat10959 = 0.0F;
		aFloat10957 = 0.0F;
	}

	public Class436 method8279(int i) {
		Class436 class436 = Class436.method5238();
		double[] ds = aClass439Array10961[-1239275247 * anInt10960].method5319(aFloat10959);
		class436.aFloat4850 = (float) ds[0];
		class436.aFloat4852 = (float) ds[1];
		class436.aFloat4853 = (float) ds[2];
		return class436;
	}

	double[] method10307(int i) {
		return aClass439Array10961[-1239275247 * anInt10960].method5319(aFloat10959);
	}

	public Class436 method8293(int i) {
		return method8279(459796660);
	}

	void method10308(float f, float f_7_, int i) {
		aFloat10959 += f;
		if (aFloat10959 > f_7_)
			aFloat10959 = f_7_;
	}

	public void method8277(RSByteBuffer class536_sub33, int i) {
		aFloat10959 = 0.0F;
		aFloat10957 = 0.0F;
		anInt10960 = 0;
		int i_8_ = class536_sub33.readUnsignedByte();
		aClass439Array10961 = new Class439[i_8_];
		aFloatArray10958 = new float[i_8_];
		for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
			aClass439Array10961[i_9_] = new Class439(class536_sub33);
			aFloatArray10958[i_9_] = class536_sub33.method9712(-1102587308);
		}
		method10309(class536_sub33, i_8_, 1847188403);
	}

	abstract void method10309(RSByteBuffer class536_sub33, int i, int i_10_);

	void method10310(float f, float f_11_) {
		aFloat10959 += f;
		if (aFloat10959 > f_11_)
			aFloat10959 = f_11_;
	}

	public boolean method8285() {
		return aClass439Array10961 != null;
	}

	abstract void method10311(RSByteBuffer class536_sub33, int i);

	public void method8283(float f) {
		Class439 class439 = aClass439Array10961[anInt10960 * -1239275247];
		if (aFloatArray10958[anInt10960 * -1239275247] > 0.0F) {
			if (aFloatArray10958[anInt10960 * -1239275247] >= f) {
				aFloatArray10958[anInt10960 * -1239275247] -= f;
				return;
			}
			f -= aFloatArray10958[-1239275247 * anInt10960];
			aFloatArray10958[anInt10960 * -1239275247] = 0.0F;
		}
		float f_12_ = 1.0F / (float) Class319_Sub1.method9134(2066846275);
		while (f > 0.0F) {
			float f_13_ = class439.method5306();
			if (aFloat10959 >= f_13_) {
				if (aClass439Array10961.length == anInt10960 * -1239275247 + 1)
					break;
				if (aFloatArray10958[1 + -1239275247 * anInt10960] >= f) {
					aFloatArray10958[anInt10960 * -1239275247 + 1] -= f;
					break;
				}
				anInt10960 += 1916397553;
				f -= aFloatArray10958[-1239275247 * anInt10960];
				aFloatArray10958[-1239275247 * anInt10960] = 0.0F;
				method10306(1931371698);
				aFloat10959 = 0.0F;
				aFloat10957 = 0.0F;
				class439 = aClass439Array10961[anInt10960 * -1239275247];
				f_13_ = class439.method5306();
			}
			while (f > 0.0F && aFloat10959 < f_13_) {
				aFloat10957 = method10305(f_13_, aFloat10957, Math.min(f, f_12_), -1021401223);
				f -= f_12_;
				method10308(aFloat10957, f_13_, 1828999571);
			}
		}
	}

	public void method8278(Class305 class305, Class433 class433, int i, int i_14_, float f, int i_15_) {
		double[] ds = aClass301_8821.method4085(1226614501);
		ds[0] -= (double) i;
		ds[2] -= (double) i_14_;
		double[] ds_16_ = method10307(1059721660);
		ds_16_[0] -= (double) i;
		ds_16_[2] -= (double) i_14_;
		ds[1] *= -1.0;
		ds_16_[1] *= -1.0;
		Class436 class436 = Class436.method5238();
		class436.aFloat4850 = (float) (ds_16_[0] - ds[0]);
		class436.aFloat4852 = (float) (ds_16_[1] - ds[1]);
		class436.aFloat4853 = (float) (ds_16_[2] - ds[2]);
		class436.method5247();
		Class425 class425 = new Class425();
		class425.method5115(class436, f);
		Class436 class436_17_ = Class436.method5257(0.0F, 1.0F, 0.0F);
		Class436 class436_18_ = Class436.method5256(class436, class436_17_);
		class436_17_ = Class436.method5256(class436_18_, class436);
		class436_17_.method5263(class425);
		class433.method5194(ds[0], ds[1], ds[2], ds_16_[0], ds_16_[1], ds_16_[2], class436_17_.aFloat4850, class436_17_.aFloat4852, class436_17_.aFloat4853);
		class436_17_.method5239();
	}

	public Class436 method8291() {
		return method8279(459796660);
	}

	void method10312(float f, float f_19_) {
		aFloat10959 += f;
		if (aFloat10959 > f_19_)
			aFloat10959 = f_19_;
	}

	public void method8287(Class305 class305, Class433 class433, int i, int i_20_, float f) {
		double[] ds = aClass301_8821.method4085(665282758);
		ds[0] -= (double) i;
		ds[2] -= (double) i_20_;
		double[] ds_21_ = method10307(2101484115);
		ds_21_[0] -= (double) i;
		ds_21_[2] -= (double) i_20_;
		ds[1] *= -1.0;
		ds_21_[1] *= -1.0;
		Class436 class436 = Class436.method5238();
		class436.aFloat4850 = (float) (ds_21_[0] - ds[0]);
		class436.aFloat4852 = (float) (ds_21_[1] - ds[1]);
		class436.aFloat4853 = (float) (ds_21_[2] - ds[2]);
		class436.method5247();
		Class425 class425 = new Class425();
		class425.method5115(class436, f);
		Class436 class436_22_ = Class436.method5257(0.0F, 1.0F, 0.0F);
		Class436 class436_23_ = Class436.method5256(class436, class436_22_);
		class436_22_ = Class436.method5256(class436_23_, class436);
		class436_22_.method5263(class425);
		class433.method5194(ds[0], ds[1], ds[2], ds_21_[0], ds_21_[1], ds_21_[2], class436_22_.aFloat4850, class436_22_.aFloat4852, class436_22_.aFloat4853);
		class436_22_.method5239();
	}

	public Class436 method8288() {
		Class436 class436 = Class436.method5238();
		double[] ds = aClass439Array10961[-1239275247 * anInt10960].method5319(aFloat10959);
		class436.aFloat4850 = (float) ds[0];
		class436.aFloat4852 = (float) ds[1];
		class436.aFloat4853 = (float) ds[2];
		return class436;
	}

	public Class436 method8289() {
		Class436 class436 = Class436.method5238();
		double[] ds = aClass439Array10961[-1239275247 * anInt10960].method5319(aFloat10959);
		class436.aFloat4850 = (float) ds[0];
		class436.aFloat4852 = (float) ds[1];
		class436.aFloat4853 = (float) ds[2];
		return class436;
	}

	public Class436 method8290() {
		return method8279(459796660);
	}

	abstract void method10313(RSByteBuffer class536_sub33, int i);

	public Class436 method8292() {
		return method8279(459796660);
	}

	public void method8280(RSByteBuffer class536_sub33) {
		aFloat10959 = 0.0F;
		aFloat10957 = 0.0F;
		anInt10960 = 0;
		int i = class536_sub33.readUnsignedByte();
		aClass439Array10961 = new Class439[i];
		aFloatArray10958 = new float[i];
		for (int i_24_ = 0; i_24_ < i; i_24_++) {
			aClass439Array10961[i_24_] = new Class439(class536_sub33);
			aFloatArray10958[i_24_] = class536_sub33.method9712(1276901829);
		}
		method10309(class536_sub33, i, 2109788891);
	}

	public void method8294(RSByteBuffer class536_sub33) {
		aFloat10959 = 0.0F;
		aFloat10957 = 0.0F;
		anInt10960 = 0;
		int i = class536_sub33.readUnsignedByte();
		aClass439Array10961 = new Class439[i];
		aFloatArray10958 = new float[i];
		for (int i_25_ = 0; i_25_ < i; i_25_++) {
			aClass439Array10961[i_25_] = new Class439(class536_sub33);
			aFloatArray10958[i_25_] = class536_sub33.method9712(-1120879196);
		}
		method10309(class536_sub33, i, 600043135);
	}

	abstract float method10314(float f, float f_26_, float f_27_);

	abstract void method10315();

	double[] method10316() {
		return aClass439Array10961[-1239275247 * anInt10960].method5319(aFloat10959);
	}

	public boolean method8295(byte i) {
		return aClass439Array10961 != null;
	}

	public Class436 method8281() {
		return method8279(459796660);
	}

	static void method10317(int i, int i_28_, int i_29_, int i_30_, int i_31_) {
		Class536_Sub18_Sub5 class536_sub18_sub5 = Class34_Sub11.method10334(10, (long) i);
		class536_sub18_sub5.method10659(1655928518);
		class536_sub18_sub5.anInt11675 = i_28_ * 1577826219;
		class536_sub18_sub5.anInt11659 = 824043525 * i_29_;
		class536_sub18_sub5.anInt11654 = -445749437 * i_30_;
	}
}
