/* Class706_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class706_Sub4_Sub1 extends Class706_Sub4 {
	void method10309(RSByteBuffer class536_sub33, int i, int i_0_) {
		/* empty */
	}

	float method10305(float f, float f_1_, float f_2_, int i) {
		float f_3_ = f - aFloat10959;
		if (aClass301_8821.method4083(-1136804778).aFloat4850 == Float.POSITIVE_INFINITY)
			f_1_ = aClass301_8821.method4065(2068073752).method5291();
		else {
			float f_4_ = f_1_ / aClass301_8821.method4083(-1136804778).method5291();
			float f_5_ = f_4_ * (f_1_ / 2.0F);
			if (f_5_ > f_3_) {
				f_1_ -= (aClass301_8821.method4083(-1136804778).method5291() * f_2_);
				if (f_1_ < 0.0F)
					f_1_ = 0.0F;
			} else if (f_1_ < aClass301_8821.method4065(1583600111).method5291()) {
				f_1_ += (aClass301_8821.method4083(-1136804778).method5291() * f_2_);
				if (f_1_ > aClass301_8821.method4065(1553350536).method5291())
					f_1_ = aClass301_8821.method4065(1798334186).method5291();
			}
		}
		return f_1_;
	}

	void method10306(int i) {
		/* empty */
	}

	void method10313(RSByteBuffer class536_sub33, int i) {
		/* empty */
	}

	public Class706_Sub4_Sub1(Class301 class301) {
		super(class301);
	}

	float method10314(float f, float f_6_, float f_7_) {
		float f_8_ = f - aFloat10959;
		if (aClass301_8821.method4083(-1136804778).aFloat4850 == Float.POSITIVE_INFINITY)
			f_6_ = aClass301_8821.method4065(2080262882).method5291();
		else {
			float f_9_ = f_6_ / aClass301_8821.method4083(-1136804778).method5291();
			float f_10_ = f_9_ * (f_6_ / 2.0F);
			if (f_10_ > f_8_) {
				f_6_ -= (aClass301_8821.method4083(-1136804778).method5291() * f_7_);
				if (f_6_ < 0.0F)
					f_6_ = 0.0F;
			} else if (f_6_ < aClass301_8821.method4065(1617469978).method5291()) {
				f_6_ += (aClass301_8821.method4083(-1136804778).method5291() * f_7_);
				if (f_6_ > aClass301_8821.method4065(2133849786).method5291())
					f_6_ = aClass301_8821.method4065(2115532101).method5291();
			}
		}
		return f_6_;
	}

	void method10311(RSByteBuffer class536_sub33, int i) {
		/* empty */
	}

	void method10315() {
		/* empty */
	}
}
