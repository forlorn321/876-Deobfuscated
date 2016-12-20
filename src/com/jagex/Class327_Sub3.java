/* Class327_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class327_Sub3 extends Class327 {
	float[] aFloatArray10209;
	float aFloat10210;
	int anInt10211 = 0;
	float aFloat10212 = 0.0F;
	Class437[] aClass437Array10213;
	int[] anIntArray10214;

	public boolean method5790() {
		return aClass437Array10213 != null;
	}

	public void method15840(Class437 class437, int i, float f, int i_0_) {
		if (null == aClass437Array10213) {
			aClass437Array10213 = new Class437[] { class437 };
			aFloatArray10209 = new float[] { f };
			anIntArray10214 = new int[] { i };
		} else {
			Class437[] class437s = new Class437[1 + aClass437Array10213.length];
			float[] fs = new float[aClass437Array10213.length + 1];
			int[] is = new int[1 + aClass437Array10213.length];
			System.arraycopy(aClass437Array10213, 0, class437s, 0, aClass437Array10213.length);
			System.arraycopy(aFloatArray10209, 0, fs, 0, aClass437Array10213.length);
			System.arraycopy(anIntArray10214, 0, is, 0, aClass437Array10213.length);
			aClass437Array10213 = class437s;
			aFloatArray10209 = fs;
			anIntArray10214 = is;
			aClass437Array10213[aClass437Array10213.length - 1] = class437;
			aFloatArray10209[aFloatArray10209.length - 1] = f;
			anIntArray10214[anIntArray10214.length - 1] = i;
		}
	}

	public void method5798(float f, int[][][] is, Class470 class470, int i, int i_1_, int i_2_) {
		Class437 class437 = aClass437Array10213[1617943147 * anInt10211];
		if (aFloatArray10209[anInt10211 * 1617943147] > 0.0F) {
			if (aFloatArray10209[1617943147 * anInt10211] >= f) {
				aFloatArray10209[anInt10211 * 1617943147] -= f;
				return;
			}
			f -= aFloatArray10209[1617943147 * anInt10211];
			aFloatArray10209[1617943147 * anInt10211] = 0.0F;
		}
		float f_3_ = 1.0F / (float) Class259.method4781((byte) 59);
		while (f > 0.0F) {
			float f_4_ = class437.method6996();
			if (aFloat10212 >= f_4_) {
				if (anInt10211 * 1617943147 + 1 == aClass437Array10213.length)
					break;
				if (aFloatArray10209[1617943147 * anInt10211 + 1] >= f) {
					aFloatArray10209[1 + 1617943147 * anInt10211] -= f;
					break;
				}
				anInt10211 += 1951334979;
				f -= aFloatArray10209[1617943147 * anInt10211];
				aFloatArray10209[1617943147 * anInt10211] = 0.0F;
				method15844((byte) -51);
				aFloat10212 = 0.0F;
				aFloat10210 = 0.0F;
				class437 = aClass437Array10213[anInt10211 * 1617943147];
				f_4_ = class437.method6996();
			}
			while (f > 0.0F && aFloat10212 < f_4_) {
				aFloat10210 = method15842(f_4_, aFloat10210, Math.min(f, f_3_), (byte) 0);
				f -= f_3_;
				method15841(aFloat10210, f_4_, 1609479215);
			}
		}
	}

	void method15841(float f, float f_5_, int i) {
		aFloat10212 += f;
		if (aFloat10212 > f_5_)
			aFloat10212 = f_5_;
	}

	abstract float method15842(float f, float f_6_, float f_7_, byte i);

	public Class442 method5781(int i) {
		Class442 class442 = Class442.method7137();
		double[] ds = aClass437Array10213[1617943147 * anInt10211].method6994(aFloat10212);
		class442.aFloat4918 = (float) ds[0];
		class442.aFloat4915 = (float) ds[1];
		class442.aFloat4919 = (float) ds[2];
		return class442;
	}

	public boolean method5780(short i) {
		return aClass437Array10213 != null;
	}

	abstract float method15843(float f, float f_8_, float f_9_);

	abstract void method15844(byte i);

	public Class527_Sub36 method5783(int i) {
		Class442 class442 = method5781(99088241);
		return new Class527_Sub36(0, (int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919);
	}

	public Class527_Sub36 method5795() {
		Class442 class442 = method5781(1516293420);
		return new Class527_Sub36(0, (int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919);
	}

	public float method5797(byte i) {
		return aClass437Array10213[anInt10211 * 1617943147].method7013(aFloat10212);
	}

	public void method5785(Class302 class302, int i, int i_10_, byte i_11_) {
		Class442 class442 = method5781(875675182);
		class302.anInt3420 = -2028651513 * ((int) class442.aFloat4918 - i);
		class302.anInt3419 = 184714985 * (int) -class442.aFloat4915;
		class302.anInt3421 = ((int) class442.aFloat4919 - i_10_) * -1971897151;
	}

	public void method5786(RSByteBuffer class527_sub38, int i) {
		aFloat10212 = 0.0F;
		aFloat10210 = 0.0F;
		anInt10211 = 0;
		int i_12_ = class527_sub38.readUnsignedByte();
		aClass437Array10213 = new Class437[i_12_];
		aFloatArray10209 = new float[i_12_];
		for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
			aClass437Array10213[i_13_] = new Class437(class527_sub38);
			aFloatArray10209[i_13_] = class527_sub38.readFloat(-624919169);
		}
		method15853(class527_sub38, i_12_, 1769813785);
	}

	Class327_Sub3(Class296 class296) {
		super(class296);
		aFloat10210 = 0.0F;
	}

	abstract float method15845(float f, float f_14_, float f_15_);

	public float method5778() {
		return aClass437Array10213[anInt10211 * 1617943147].method7013(aFloat10212);
	}

	abstract void method15846();

	abstract void method15847(RSByteBuffer class527_sub38, int i);

	abstract void method15848();

	abstract float method15849(float f, float f_16_, float f_17_);

	abstract void method15850();

	abstract void method15851(RSByteBuffer class527_sub38, int i);

	abstract void method15852(RSByteBuffer class527_sub38, int i);

	abstract void method15853(RSByteBuffer class527_sub38, int i, int i_18_);

	public void method5787(float f, int[][][] is, Class470 class470, int i, int i_19_) {
		Class437 class437 = aClass437Array10213[1617943147 * anInt10211];
		if (aFloatArray10209[anInt10211 * 1617943147] > 0.0F) {
			if (aFloatArray10209[1617943147 * anInt10211] >= f) {
				aFloatArray10209[anInt10211 * 1617943147] -= f;
				return;
			}
			f -= aFloatArray10209[1617943147 * anInt10211];
			aFloatArray10209[1617943147 * anInt10211] = 0.0F;
		}
		float f_20_ = 1.0F / (float) Class259.method4781((byte) -40);
		while (f > 0.0F) {
			float f_21_ = class437.method6996();
			if (aFloat10212 >= f_21_) {
				if (anInt10211 * 1617943147 + 1 == aClass437Array10213.length)
					break;
				if (aFloatArray10209[1617943147 * anInt10211 + 1] >= f) {
					aFloatArray10209[1 + 1617943147 * anInt10211] -= f;
					break;
				}
				anInt10211 += 1951334979;
				f -= aFloatArray10209[1617943147 * anInt10211];
				aFloatArray10209[1617943147 * anInt10211] = 0.0F;
				method15844((byte) -36);
				aFloat10212 = 0.0F;
				aFloat10210 = 0.0F;
				class437 = aClass437Array10213[anInt10211 * 1617943147];
				f_21_ = class437.method6996();
			}
			while (f > 0.0F && aFloat10212 < f_21_) {
				aFloat10210 = method15842(f_21_, aFloat10210, Math.min(f, f_20_), (byte) 0);
				f -= f_20_;
				method15841(aFloat10210, f_21_, 1609479215);
			}
		}
	}

	public float method15854() {
		return aClass437Array10213[1617943147 * anInt10211].method6995(aFloat10212);
	}

	public void method5779(float f, int[][][] is, Class470 class470, int i, int i_22_) {
		Class437 class437 = aClass437Array10213[1617943147 * anInt10211];
		if (aFloatArray10209[anInt10211 * 1617943147] > 0.0F) {
			if (aFloatArray10209[1617943147 * anInt10211] >= f) {
				aFloatArray10209[anInt10211 * 1617943147] -= f;
				return;
			}
			f -= aFloatArray10209[1617943147 * anInt10211];
			aFloatArray10209[1617943147 * anInt10211] = 0.0F;
		}
		float f_23_ = 1.0F / (float) Class259.method4781((byte) 72);
		while (f > 0.0F) {
			float f_24_ = class437.method6996();
			if (aFloat10212 >= f_24_) {
				if (anInt10211 * 1617943147 + 1 == aClass437Array10213.length)
					break;
				if (aFloatArray10209[1617943147 * anInt10211 + 1] >= f) {
					aFloatArray10209[1 + 1617943147 * anInt10211] -= f;
					break;
				}
				anInt10211 += 1951334979;
				f -= aFloatArray10209[1617943147 * anInt10211];
				aFloatArray10209[1617943147 * anInt10211] = 0.0F;
				method15844((byte) -22);
				aFloat10212 = 0.0F;
				aFloat10210 = 0.0F;
				class437 = aClass437Array10213[anInt10211 * 1617943147];
				f_24_ = class437.method6996();
			}
			while (f > 0.0F && aFloat10212 < f_24_) {
				aFloat10210 = method15842(f_24_, aFloat10210, Math.min(f, f_23_), (byte) 0);
				f -= f_23_;
				method15841(aFloat10210, f_24_, 1609479215);
			}
		}
	}

	public double[] method5782(int i) {
		return aClass437Array10213[1617943147 * anInt10211].method6994(aFloat10212);
	}

	public boolean method5784() {
		return aClass437Array10213 != null;
	}

	abstract float method15855(float f, float f_25_, float f_26_);

	public boolean method5793() {
		return aClass437Array10213 != null;
	}

	public Class442 method5794() {
		Class442 class442 = Class442.method7137();
		double[] ds = aClass437Array10213[1617943147 * anInt10211].method6994(aFloat10212);
		class442.aFloat4918 = (float) ds[0];
		class442.aFloat4915 = (float) ds[1];
		class442.aFloat4919 = (float) ds[2];
		return class442;
	}

	public double[] method5792() {
		return aClass437Array10213[1617943147 * anInt10211].method6994(aFloat10212);
	}

	void method15856(float f, float f_27_) {
		aFloat10212 += f;
		if (aFloat10212 > f_27_)
			aFloat10212 = f_27_;
	}

	public void method5788(float f, int[][][] is, Class470 class470, int i, int i_28_) {
		Class437 class437 = aClass437Array10213[1617943147 * anInt10211];
		if (aFloatArray10209[anInt10211 * 1617943147] > 0.0F) {
			if (aFloatArray10209[1617943147 * anInt10211] >= f) {
				aFloatArray10209[anInt10211 * 1617943147] -= f;
				return;
			}
			f -= aFloatArray10209[1617943147 * anInt10211];
			aFloatArray10209[1617943147 * anInt10211] = 0.0F;
		}
		float f_29_ = 1.0F / (float) Class259.method4781((byte) -12);
		while (f > 0.0F) {
			float f_30_ = class437.method6996();
			if (aFloat10212 >= f_30_) {
				if (anInt10211 * 1617943147 + 1 == aClass437Array10213.length)
					break;
				if (aFloatArray10209[1617943147 * anInt10211 + 1] >= f) {
					aFloatArray10209[1 + 1617943147 * anInt10211] -= f;
					break;
				}
				anInt10211 += 1951334979;
				f -= aFloatArray10209[1617943147 * anInt10211];
				aFloatArray10209[1617943147 * anInt10211] = 0.0F;
				method15844((byte) -74);
				aFloat10212 = 0.0F;
				aFloat10210 = 0.0F;
				class437 = aClass437Array10213[anInt10211 * 1617943147];
				f_30_ = class437.method6996();
			}
			while (f > 0.0F && aFloat10212 < f_30_) {
				aFloat10210 = method15842(f_30_, aFloat10210, Math.min(f, f_29_), (byte) 0);
				f -= f_29_;
				method15841(aFloat10210, f_30_, 1609479215);
			}
		}
	}

	public float method5791() {
		return aClass437Array10213[anInt10211 * 1617943147].method7013(aFloat10212);
	}

	public boolean method5789() {
		return aClass437Array10213 != null;
	}

	public void method5799(Class302 class302, int i, int i_31_) {
		Class442 class442 = method5781(-1332983230);
		class302.anInt3420 = -2028651513 * ((int) class442.aFloat4918 - i);
		class302.anInt3419 = 184714985 * (int) -class442.aFloat4915;
		class302.anInt3421 = ((int) class442.aFloat4919 - i_31_) * -1971897151;
	}

	public void method5800(RSByteBuffer class527_sub38) {
		aFloat10212 = 0.0F;
		aFloat10210 = 0.0F;
		anInt10211 = 0;
		int i = class527_sub38.readUnsignedByte();
		aClass437Array10213 = new Class437[i];
		aFloatArray10209 = new float[i];
		for (int i_32_ = 0; i_32_ < i; i_32_++) {
			aClass437Array10213[i_32_] = new Class437(class527_sub38);
			aFloatArray10209[i_32_] = class527_sub38.readFloat(-1698697352);
		}
		method15853(class527_sub38, i, 1769813785);
	}

	void method15857(float f, float f_33_) {
		aFloat10212 += f;
		if (aFloat10212 > f_33_)
			aFloat10212 = f_33_;
	}

	public float method15858(int i) {
		return aClass437Array10213[1617943147 * anInt10211].method6995(aFloat10212);
	}

	void method15859(float f, float f_34_) {
		aFloat10212 += f;
		if (aFloat10212 > f_34_)
			aFloat10212 = f_34_;
	}

	public Class527_Sub36 method5796() {
		Class442 class442 = method5781(-1359073497);
		return new Class527_Sub36(0, (int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919);
	}

	public float method15860() {
		return aClass437Array10213[1617943147 * anInt10211].method6995(aFloat10212);
	}

	public static void method15861(int i) {
		if (Class290.aClass310Array3230 == null) {
			Class290.aClass310Array3230 = Class310.method5634(-139954288);
			Class593.aClass310_7804 = Class290.aClass310Array3230[0];
			Class290.aLong3231 = Class234.method4347(-1408626088) * -3047710826636360549L;
		}
		if (null == Class290.aClass300_3229)
			Class97.method1749(102380841);
		Class310 class310 = Class593.aClass310_7804;
		int i_35_ = Class541.method9023(-312425811);
		if (Class593.aClass310_7804 == class310) {
			Class208_Sub19.aString9955 = Class593.aClass310_7804.aClass53_3484.method1290(Class144_Sub1.aClass671_8995, (byte) -96);
			Class287.aString3217 = Class208_Sub19.aString9955;
			if (Class593.aClass310_7804.aBool3489)
				Class323.anInt3566 = (-710251491 * (Class593.aClass310_7804.anInt3487 * -138373539 + ((1933212919 * Class593.aClass310_7804.anInt3467 - Class593.aClass310_7804.anInt3487 * -138373539) * i_35_ / 100)));
			if (Class593.aClass310_7804.aBool3488)
				Class287.aString3217 = new StringBuilder().append(Class287.aString3217).append(" - ").append(Class323.anInt3566 * -1051216331).append("%").toString();
		} else if (Class593.aClass310_7804 == Class310.aClass310_3482) {
			Class290.aClass300_3229 = null;
			Class78.method1560(16, (byte) 0);
			if (Class290.aBool3232) {
				Class290.aBool3232 = false;
				Class327.method5803(Class329.aString3606, Class200.aString2201, "", false, -1908148057);
			}
		} else {
			Class208_Sub19.aString9955 = class310.aClass53_3486.method1290(Class144_Sub1.aClass671_8995, (byte) -16);
			Class287.aString3217 = Class208_Sub19.aString9955;
			if (Class593.aClass310_7804.aBool3488)
				Class287.aString3217 = new StringBuilder().append(Class287.aString3217).append(" - ").append(class310.anInt3467 * 1933212919).append("%").toString();
			Class323.anInt3566 = 962485243 * class310.anInt3467;
			if (Class593.aClass310_7804.aBool3489 || class310.aBool3489)
				Class290.aLong3231 = Class234.method4347(-1408626088) * -3047710826636360549L;
		}
		if (null != Class290.aClass300_3229) {
			Class290.aClass300_3229.method5551(5626840548048503187L * Class290.aLong3231, Class208_Sub19.aString9955, Class287.aString3217, Class323.anInt3566 * -1051216331, Class593.aClass310_7804, 1247931996);
			if (null != Class290.anInterface31Array3225) {
				for (int i_36_ = Class290.anInt3226 * 731945593 + 1; i_36_ < Class290.anInterface31Array3225.length; i_36_++) {
					if (Class290.anInterface31Array3225[i_36_].method181(2056621253) >= 100 && Class290.anInt3226 * 731945593 == i_36_ - 1 && -1927019389 * client.anInt11048 != 18 && Class290.aClass300_3229.method5527((byte) -1)) {
						try {
							Class290.anInterface31Array3225[i_36_].method182(682863602);
						} catch (Exception exception) {
							Class290.anInterface31Array3225 = null;
							break;
						}
						Class290.aClass300_3229.method5528(Class290.anInterface31Array3225[i_36_], -1187945569);
						Class290.anInt3226 += -331436087;
						if ((Class290.anInt3226 * 731945593 >= Class290.anInterface31Array3225.length - 1) && Class290.anInterface31Array3225.length > 1)
							Class290.anInt3226 = (Class290.aClass90_3227.method1637(-25884295) ? 0 : -1) * -331436087;
					}
				}
			}
		}
	}
}
