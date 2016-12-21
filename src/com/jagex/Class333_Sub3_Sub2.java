/* Class333_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class333_Sub3_Sub2 extends Class333_Sub3 {
	float[] aFloatArray11585;
	int anInt11586 = 0;
	float[] aFloatArray11587;
	float[] aFloatArray11588;

	void method9218(RSByteBuffer class536_sub33, int i, int i_0_) {
		aFloatArray11585 = new float[i];
		aFloatArray11588 = new float[i];
		aFloatArray11587 = new float[i];
		anInt11586 = 0;
		for (int i_1_ = 0; i_1_ < i; i_1_++) {
			aFloatArray11585[i_1_] = class536_sub33.method9712(-729644186);
			aFloatArray11588[i_1_] = class536_sub33.method9712(-858677511);
			aFloatArray11587[i_1_] = class536_sub33.method9712(1035178781);
		}
	}

	float method9219(float f, float f_2_, float f_3_) {
		float f_4_ = aFloat10116 / f;
		if (f_4_ < 0.0F)
			f_4_ = 0.0F;
		if (f_4_ > 1.0F)
			f_4_ = 1.0F;
		return ((f_4_ * (aFloatArray11588[-923333597 * anInt11586] - aFloatArray11585[anInt11586 * -923333597]) + aFloatArray11585[-923333597 * anInt11586]) * (f / aFloatArray11587[-923333597 * anInt11586]));
	}

	float method9215(float f, float f_5_, float f_6_, byte i) {
		float f_7_ = aFloat10116 / f;
		if (f_7_ < 0.0F)
			f_7_ = 0.0F;
		if (f_7_ > 1.0F)
			f_7_ = 1.0F;
		return ((f_7_ * (aFloatArray11588[-923333597 * anInt11586] - aFloatArray11585[anInt11586 * -923333597]) + aFloatArray11585[-923333597 * anInt11586]) * (f / aFloatArray11587[-923333597 * anInt11586]));
	}

	void method9228(int i) {
		anInt11586 += 1609040779;
	}

	public Class333_Sub3_Sub2(Class301 class301) {
		super(class301);
	}

	float method9220(float f, float f_8_, float f_9_) {
		float f_10_ = aFloat10116 / f;
		if (f_10_ < 0.0F)
			f_10_ = 0.0F;
		if (f_10_ > 1.0F)
			f_10_ = 1.0F;
		return ((f_10_ * (aFloatArray11588[-923333597 * anInt11586] - aFloatArray11585[anInt11586 * -923333597]) + aFloatArray11585[-923333597 * anInt11586]) * (f / aFloatArray11587[-923333597 * anInt11586]));
	}

	void method9227() {
		anInt11586 += 1609040779;
	}

	void method9225(RSByteBuffer class536_sub33, int i) {
		aFloatArray11585 = new float[i];
		aFloatArray11588 = new float[i];
		aFloatArray11587 = new float[i];
		anInt11586 = 0;
		for (int i_11_ = 0; i_11_ < i; i_11_++) {
			aFloatArray11585[i_11_] = class536_sub33.method9712(589621611);
			aFloatArray11588[i_11_] = class536_sub33.method9712(-44112114);
			aFloatArray11587[i_11_] = class536_sub33.method9712(-196786057);
		}
	}

	void method9221() {
		anInt11586 += 1609040779;
	}

	void method9222(RSByteBuffer class536_sub33, int i) {
		aFloatArray11585 = new float[i];
		aFloatArray11588 = new float[i];
		aFloatArray11587 = new float[i];
		anInt11586 = 0;
		for (int i_12_ = 0; i_12_ < i; i_12_++) {
			aFloatArray11585[i_12_] = class536_sub33.method9712(-1720869191);
			aFloatArray11588[i_12_] = class536_sub33.method9712(1593424510);
			aFloatArray11587[i_12_] = class536_sub33.method9712(722189805);
		}
	}

	static final void method10633(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (1939619399 * class251.anInt2601 == 1 ? class251.anInt2602 * -2011124813 : -1);
	}
}
