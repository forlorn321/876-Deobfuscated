/* Class333_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class333_Sub3_Sub1 extends Class333_Sub3 {
	void method9227() {
		/* empty */
	}

	float method9215(float f, float f_0_, float f_1_, byte i) {
		float f_2_ = f - aFloat10116;
		if (aClass301_3620.method4032((byte) -1).aFloat4850 == Float.POSITIVE_INFINITY)
			f_0_ = aClass301_3620.method4029((byte) -16).method5291();
		else {
			float f_3_ = f_0_ / aClass301_3620.method4032((byte) -1).method5291();
			float f_4_ = f_0_ / 2.0F * f_3_;
			if (f_4_ > f_2_) {
				f_0_ -= (aClass301_3620.method4032((byte) -1).method5291() * f_1_);
				if (f_0_ < 0.0F)
					f_0_ = 0.0F;
			} else if (f_0_ < aClass301_3620.method4029((byte) -85).method5291()) {
				f_0_ += (aClass301_3620.method4032((byte) -1).method5291() * f_1_);
				if (f_0_ > aClass301_3620.method4029((byte) -105).method5291())
					f_0_ = aClass301_3620.method4029((byte) -71).method5291();
			}
		}
		return f_0_;
	}

	void method9228(int i) {
		/* empty */
	}

	void method9218(RSByteBuffer class536_sub33, int i, int i_5_) {
		/* empty */
	}

	void method9221() {
		/* empty */
	}

	float method9220(float f, float f_6_, float f_7_) {
		float f_8_ = f - aFloat10116;
		if (aClass301_3620.method4032((byte) -1).aFloat4850 == Float.POSITIVE_INFINITY)
			f_6_ = aClass301_3620.method4029((byte) -10).method5291();
		else {
			float f_9_ = f_6_ / aClass301_3620.method4032((byte) -1).method5291();
			float f_10_ = f_6_ / 2.0F * f_9_;
			if (f_10_ > f_8_) {
				f_6_ -= (aClass301_3620.method4032((byte) -1).method5291() * f_7_);
				if (f_6_ < 0.0F)
					f_6_ = 0.0F;
			} else if (f_6_ < aClass301_3620.method4029((byte) -119).method5291()) {
				f_6_ += (aClass301_3620.method4032((byte) -1).method5291() * f_7_);
				if (f_6_ > aClass301_3620.method4029((byte) -5).method5291())
					f_6_ = aClass301_3620.method4029((byte) -98).method5291();
			}
		}
		return f_6_;
	}

	float method9219(float f, float f_11_, float f_12_) {
		float f_13_ = f - aFloat10116;
		if (aClass301_3620.method4032((byte) -1).aFloat4850 == Float.POSITIVE_INFINITY)
			f_11_ = aClass301_3620.method4029((byte) -103).method5291();
		else {
			float f_14_ = f_11_ / aClass301_3620.method4032((byte) -1).method5291();
			float f_15_ = f_11_ / 2.0F * f_14_;
			if (f_15_ > f_13_) {
				f_11_ -= (aClass301_3620.method4032((byte) -1).method5291() * f_12_);
				if (f_11_ < 0.0F)
					f_11_ = 0.0F;
			} else if (f_11_ < aClass301_3620.method4029((byte) -16).method5291()) {
				f_11_ += (aClass301_3620.method4032((byte) -1).method5291() * f_12_);
				if (f_11_ > aClass301_3620.method4029((byte) -102).method5291())
					f_11_ = aClass301_3620.method4029((byte) -126).method5291();
			}
		}
		return f_11_;
	}

	void method9222(RSByteBuffer class536_sub33, int i) {
		/* empty */
	}

	void method9225(RSByteBuffer class536_sub33, int i) {
		/* empty */
	}

	public Class333_Sub3_Sub1(Class301 class301) {
		super(class301);
	}

	static final void method10600(Class668 class668, byte i) {
		int i_16_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_16_);
		Class234 class234 = Class463.aClass234Array5227[i_16_ >> 16];
		Class621.method7410(class251, class234, class668, 1903121955);
	}

	static final void method10601(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}
}
