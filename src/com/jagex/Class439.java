/* Class439 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class439 {
	Class429[] aClass429Array4869 = new Class429[1];
	float[] aFloatArray4870 = new float[2];

	public float method5304() {
		float f = 0.0F;
		for (int i = 0; i < aClass429Array4869.length; i++)
			f += aClass429Array4869[i].method5157();
		return f;
	}

	public int method5305() {
		return aClass429Array4869.length;
	}

	public float method5306() {
		float f = 0.0F;
		for (int i = 0; i < aClass429Array4869.length; i++)
			f += aClass429Array4869[i].method5157();
		return f;
	}

	public float method5307(float f) {
		float f_0_ = 0.0F;
		float f_1_ = 0.0F;
		for (int i = 0; i < aClass429Array4869.length; i++) {
			f_1_ += aClass429Array4869[i].method5157();
			if (f < f_1_)
				return aClass429Array4869[i].method5153(f - f_0_) + (float) i;
			f_0_ = f_1_;
		}
		return (float) aClass429Array4869.length;
	}

	public double[] method5308(float f) {
		int i = (int) f;
		if (i < aClass429Array4869.length)
			return aClass429Array4869[i].method5152(f - (float) i);
		return aClass429Array4869[aClass429Array4869.length - 1].method5152(1.0F);
	}

	public float method5309(float f) {
		return method5310(method5307(f));
	}

	public float method5310(float f) {
		int i = (int) f;
		if (i + 1 < aFloatArray4870.length) {
			float f_2_ = aFloatArray4870[i];
			float f_3_ = aFloatArray4870[i + 1];
			float f_4_ = f - (float) i;
			return (1.0F - f_4_) * f_2_ + f_4_ * f_3_;
		}
		return aFloatArray4870[aFloatArray4870.length - 1];
	}

	public Class439(RSByteBuffer class536_sub33) {
		int i = class536_sub33.readUnsignedSmart();
		aClass429Array4869[0] = new Class429();
		aClass429Array4869[0].method5150(0, Class436.method5241(class536_sub33));
		aClass429Array4869[0].method5150(1, Class436.method5241(class536_sub33));
		aFloatArray4870[0] = class536_sub33.method9712(-952173732);
		Class436 class436 = Class436.method5241(class536_sub33);
		Class436 class436_5_ = Class436.method5241(class536_sub33);
		Class436 class436_6_ = Class436.method5252(class436, class436_5_);
		class436_5_.method5239();
		class436_5_ = class436_6_;
		class436_5_.method5248(class436);
		aClass429Array4869[0].method5150(3, class436);
		aClass429Array4869[0].method5150(2, class436_5_);
		aFloatArray4870[1] = class536_sub33.method9712(1800732694);
		for (int i_7_ = 2; i_7_ < i; i_7_++) {
			Class436 class436_8_ = Class436.method5241(class536_sub33);
			Class436 class436_9_ = Class436.method5241(class536_sub33);
			Class436 class436_10_ = Class436.method5252(class436_8_, class436_9_);
			class436_9_.method5239();
			class436_9_ = class436_10_;
			class436_9_.method5248(class436_8_);
			method5320(class436_8_, class436_9_, class536_sub33.method9712(1577642376));
		}
	}

	public int method5311() {
		return aClass429Array4869.length;
	}

	public int method5312() {
		return aClass429Array4869.length;
	}

	public int method5313() {
		return aClass429Array4869.length;
	}

	public float method5314() {
		float f = 0.0F;
		for (int i = 0; i < aClass429Array4869.length; i++)
			f += aClass429Array4869[i].method5157();
		return f;
	}

	public float method5315() {
		float f = 0.0F;
		for (int i = 0; i < aClass429Array4869.length; i++)
			f += aClass429Array4869[i].method5157();
		return f;
	}

	public float method5316(float f) {
		float f_11_ = 0.0F;
		float f_12_ = 0.0F;
		for (int i = 0; i < aClass429Array4869.length; i++) {
			f_12_ += aClass429Array4869[i].method5157();
			if (f < f_12_)
				return aClass429Array4869[i].method5153(f - f_11_) + (float) i;
			f_11_ = f_12_;
		}
		return (float) aClass429Array4869.length;
	}

	public float method5317(float f) {
		return method5310(method5307(f));
	}

	public float method5318(float f) {
		return method5310(method5307(f));
	}

	public double[] method5319(float f) {
		float f_13_ = 0.0F;
		float f_14_ = 0.0F;
		for (int i = 0; i < aClass429Array4869.length; i++) {
			f_14_ += aClass429Array4869[i].method5157();
			if (f < f_14_) {
				float f_15_ = aClass429Array4869[i].method5153(f - f_13_);
				return aClass429Array4869[i].method5152(f_15_);
			}
			f_13_ = f_14_;
		}
		return aClass429Array4869[aClass429Array4869.length - 1].method5152(1.0F);
	}

	void method5320(Class436 class436, Class436 class436_16_, float f) {
		Class429[] class429s = new Class429[aClass429Array4869.length + 1];
		System.arraycopy(aClass429Array4869, 0, class429s, 0, aClass429Array4869.length);
		Class429 class429 = new Class429();
		Class429 class429_17_ = aClass429Array4869[aClass429Array4869.length - 1];
		class429.method5150(0, class429_17_.method5151(3));
		Class436 class436_18_ = Class436.method5252(class429_17_.method5151(3), class429_17_.method5151(2));
		class429.method5150(1, Class436.method5250(class429_17_.method5151(3), class436_18_));
		class429.method5150(3, class436);
		class429.method5150(2, class436_16_);
		class429s[class429s.length - 1] = class429;
		aClass429Array4869 = class429s;
		float[] fs = new float[aFloatArray4870.length + 1];
		System.arraycopy(aFloatArray4870, 0, fs, 0, aFloatArray4870.length);
		fs[fs.length - 1] = f;
		aFloatArray4870 = fs;
	}
}
