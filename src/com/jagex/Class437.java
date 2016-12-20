/* Class437 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class437 {
	Class434[] aClass434Array4881 = new Class434[1];
	float[] aFloatArray4882 = new float[2];

	public double[] method6991(float f) {
		int i = (int) f;
		if (i < aClass434Array4881.length)
			return aClass434Array4881[i].method6970(f - (float) i);
		return aClass434Array4881[aClass434Array4881.length - 1].method6970(1.0F);
	}

	public int method6992() {
		return aClass434Array4881.length;
	}

	public float method6993(float f) {
		int i = (int) f;
		if (i + 1 < aFloatArray4882.length) {
			float f_0_ = aFloatArray4882[i];
			float f_1_ = aFloatArray4882[i + 1];
			float f_2_ = f - (float) i;
			return (1.0F - f_2_) * f_0_ + f_2_ * f_1_;
		}
		return aFloatArray4882[aFloatArray4882.length - 1];
	}

	public double[] method6994(float f) {
		float f_3_ = 0.0F;
		float f_4_ = 0.0F;
		for (int i = 0; i < aClass434Array4881.length; i++) {
			f_4_ += aClass434Array4881[i].method6981();
			if (f < f_4_) {
				float f_5_ = aClass434Array4881[i].method6983(f - f_3_);
				return aClass434Array4881[i].method6970(f_5_);
			}
			f_3_ = f_4_;
		}
		return aClass434Array4881[aClass434Array4881.length - 1].method6970(1.0F);
	}

	public float method6995(float f) {
		float f_6_ = 0.0F;
		float f_7_ = 0.0F;
		for (int i = 0; i < aClass434Array4881.length; i++) {
			f_7_ += aClass434Array4881[i].method6981();
			if (f < f_7_)
				return aClass434Array4881[i].method6983(f - f_6_) + (float) i;
			f_6_ = f_7_;
		}
		return (float) aClass434Array4881.length;
	}

	public float method6996() {
		float f = 0.0F;
		for (int i = 0; i < aClass434Array4881.length; i++)
			f += aClass434Array4881[i].method6981();
		return f;
	}

	void method6997(Class442 class442, Class442 class442_8_, float f) {
		Class434[] class434s = new Class434[aClass434Array4881.length + 1];
		System.arraycopy(aClass434Array4881, 0, class434s, 0, aClass434Array4881.length);
		Class434 class434 = new Class434();
		Class434 class434_9_ = aClass434Array4881[aClass434Array4881.length - 1];
		class434.method6968(0, class434_9_.method6969(3));
		Class442 class442_10_ = Class442.method7155(class434_9_.method6969(3), class434_9_.method6969(2));
		class434.method6968(1, Class442.method7153(class434_9_.method6969(3), class442_10_));
		class434.method6968(3, class442);
		class434.method6968(2, class442_8_);
		class434s[class434s.length - 1] = class434;
		aClass434Array4881 = class434s;
		float[] fs = new float[aFloatArray4882.length + 1];
		System.arraycopy(aFloatArray4882, 0, fs, 0, aFloatArray4882.length);
		fs[fs.length - 1] = f;
		aFloatArray4882 = fs;
	}

	public float method6998(float f) {
		int i = (int) f;
		if (i + 1 < aFloatArray4882.length) {
			float f_11_ = aFloatArray4882[i];
			float f_12_ = aFloatArray4882[i + 1];
			float f_13_ = f - (float) i;
			return (1.0F - f_13_) * f_11_ + f_13_ * f_12_;
		}
		return aFloatArray4882[aFloatArray4882.length - 1];
	}

	public Class437(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedSmart((byte) -19);
		aClass434Array4881[0] = new Class434();
		aClass434Array4881[0].method6968(0, Class442.method7142(class527_sub38));
		aClass434Array4881[0].method6968(1, Class442.method7142(class527_sub38));
		aFloatArray4882[0] = class527_sub38.readFloat(-1378544159);
		Class442 class442 = Class442.method7142(class527_sub38);
		Class442 class442_14_ = Class442.method7142(class527_sub38);
		Class442 class442_15_ = Class442.method7155(class442, class442_14_);
		class442_14_.method7141();
		class442_14_ = class442_15_;
		class442_14_.method7219(class442);
		aClass434Array4881[0].method6968(3, class442);
		aClass434Array4881[0].method6968(2, class442_14_);
		aFloatArray4882[1] = class527_sub38.readFloat(-1252687770);
		for (int i_16_ = 2; i_16_ < i; i_16_++) {
			Class442 class442_17_ = Class442.method7142(class527_sub38);
			Class442 class442_18_ = Class442.method7142(class527_sub38);
			Class442 class442_19_ = Class442.method7155(class442_17_, class442_18_);
			class442_18_.method7141();
			class442_18_ = class442_19_;
			class442_18_.method7219(class442_17_);
			method6997(class442_17_, class442_18_, class527_sub38.readFloat(-1476715015));
		}
	}

	void method6999(Class442 class442, Class442 class442_20_, float f) {
		Class434[] class434s = new Class434[aClass434Array4881.length + 1];
		System.arraycopy(aClass434Array4881, 0, class434s, 0, aClass434Array4881.length);
		Class434 class434 = new Class434();
		Class434 class434_21_ = aClass434Array4881[aClass434Array4881.length - 1];
		class434.method6968(0, class434_21_.method6969(3));
		Class442 class442_22_ = Class442.method7155(class434_21_.method6969(3), class434_21_.method6969(2));
		class434.method6968(1, Class442.method7153(class434_21_.method6969(3), class442_22_));
		class434.method6968(3, class442);
		class434.method6968(2, class442_20_);
		class434s[class434s.length - 1] = class434;
		aClass434Array4881 = class434s;
		float[] fs = new float[aFloatArray4882.length + 1];
		System.arraycopy(aFloatArray4882, 0, fs, 0, aFloatArray4882.length);
		fs[fs.length - 1] = f;
		aFloatArray4882 = fs;
	}

	public float method7000(float f) {
		return method6998(method6995(f));
	}

	public int method7001() {
		return aClass434Array4881.length;
	}

	public float method7002() {
		float f = 0.0F;
		for (int i = 0; i < aClass434Array4881.length; i++)
			f += aClass434Array4881[i].method6981();
		return f;
	}

	public float method7003() {
		float f = 0.0F;
		for (int i = 0; i < aClass434Array4881.length; i++)
			f += aClass434Array4881[i].method6981();
		return f;
	}

	public double[] method7004(float f) {
		float f_23_ = 0.0F;
		float f_24_ = 0.0F;
		for (int i = 0; i < aClass434Array4881.length; i++) {
			f_24_ += aClass434Array4881[i].method6981();
			if (f < f_24_) {
				float f_25_ = aClass434Array4881[i].method6983(f - f_23_);
				return aClass434Array4881[i].method6970(f_25_);
			}
			f_23_ = f_24_;
		}
		return aClass434Array4881[aClass434Array4881.length - 1].method6970(1.0F);
	}

	public double[] method7005(float f) {
		float f_26_ = 0.0F;
		float f_27_ = 0.0F;
		for (int i = 0; i < aClass434Array4881.length; i++) {
			f_27_ += aClass434Array4881[i].method6981();
			if (f < f_27_) {
				float f_28_ = aClass434Array4881[i].method6983(f - f_26_);
				return aClass434Array4881[i].method6970(f_28_);
			}
			f_26_ = f_27_;
		}
		return aClass434Array4881[aClass434Array4881.length - 1].method6970(1.0F);
	}

	public double[] method7006(float f) {
		int i = (int) f;
		if (i < aClass434Array4881.length)
			return aClass434Array4881[i].method6970(f - (float) i);
		return aClass434Array4881[aClass434Array4881.length - 1].method6970(1.0F);
	}

	public float method7007(float f) {
		float f_29_ = 0.0F;
		float f_30_ = 0.0F;
		for (int i = 0; i < aClass434Array4881.length; i++) {
			f_30_ += aClass434Array4881[i].method6981();
			if (f < f_30_)
				return aClass434Array4881[i].method6983(f - f_29_) + (float) i;
			f_29_ = f_30_;
		}
		return (float) aClass434Array4881.length;
	}

	public float method7008(float f) {
		float f_31_ = 0.0F;
		float f_32_ = 0.0F;
		for (int i = 0; i < aClass434Array4881.length; i++) {
			f_32_ += aClass434Array4881[i].method6981();
			if (f < f_32_)
				return aClass434Array4881[i].method6983(f - f_31_) + (float) i;
			f_31_ = f_32_;
		}
		return (float) aClass434Array4881.length;
	}

	void method7009(Class442 class442, Class442 class442_33_, float f) {
		Class434[] class434s = new Class434[aClass434Array4881.length + 1];
		System.arraycopy(aClass434Array4881, 0, class434s, 0, aClass434Array4881.length);
		Class434 class434 = new Class434();
		Class434 class434_34_ = aClass434Array4881[aClass434Array4881.length - 1];
		class434.method6968(0, class434_34_.method6969(3));
		Class442 class442_35_ = Class442.method7155(class434_34_.method6969(3), class434_34_.method6969(2));
		class434.method6968(1, Class442.method7153(class434_34_.method6969(3), class442_35_));
		class434.method6968(3, class442);
		class434.method6968(2, class442_33_);
		class434s[class434s.length - 1] = class434;
		aClass434Array4881 = class434s;
		float[] fs = new float[aFloatArray4882.length + 1];
		System.arraycopy(aFloatArray4882, 0, fs, 0, aFloatArray4882.length);
		fs[fs.length - 1] = f;
		aFloatArray4882 = fs;
	}

	public float method7010(float f) {
		return method6998(method6995(f));
	}

	public double[] method7011(float f) {
		int i = (int) f;
		if (i < aClass434Array4881.length)
			return aClass434Array4881[i].method6970(f - (float) i);
		return aClass434Array4881[aClass434Array4881.length - 1].method6970(1.0F);
	}

	public float method7012(float f) {
		return method6998(method6995(f));
	}

	public float method7013(float f) {
		return method6998(method6995(f));
	}

	public double[] method7014(float f) {
		float f_36_ = 0.0F;
		float f_37_ = 0.0F;
		for (int i = 0; i < aClass434Array4881.length; i++) {
			f_37_ += aClass434Array4881[i].method6981();
			if (f < f_37_) {
				float f_38_ = aClass434Array4881[i].method6983(f - f_36_);
				return aClass434Array4881[i].method6970(f_38_);
			}
			f_36_ = f_37_;
		}
		return aClass434Array4881[aClass434Array4881.length - 1].method6970(1.0F);
	}

	public float method7015(float f) {
		return method6998(method6995(f));
	}

	public float method7016(float f) {
		int i = (int) f;
		if (i + 1 < aFloatArray4882.length) {
			float f_39_ = aFloatArray4882[i];
			float f_40_ = aFloatArray4882[i + 1];
			float f_41_ = f - (float) i;
			return (1.0F - f_41_) * f_39_ + f_41_ * f_40_;
		}
		return aFloatArray4882[aFloatArray4882.length - 1];
	}

	public float method7017(float f) {
		int i = (int) f;
		if (i + 1 < aFloatArray4882.length) {
			float f_42_ = aFloatArray4882[i];
			float f_43_ = aFloatArray4882[i + 1];
			float f_44_ = f - (float) i;
			return (1.0F - f_44_) * f_42_ + f_44_ * f_43_;
		}
		return aFloatArray4882[aFloatArray4882.length - 1];
	}

	public double[] method7018(float f) {
		int i = (int) f;
		if (i < aClass434Array4881.length)
			return aClass434Array4881[i].method6970(f - (float) i);
		return aClass434Array4881[aClass434Array4881.length - 1].method6970(1.0F);
	}
}
