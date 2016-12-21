/* Class706_Sub4_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class706_Sub4_Sub3 extends Class706_Sub4 {
	float[] aFloatArray11876;
	int anInt11877 = 0;
	float[] aFloatArray11878;
	float[] aFloatArray11879;

	void method10309(RSByteBuffer class536_sub33, int i, int i_0_) {
		aFloatArray11876 = new float[i];
		aFloatArray11879 = new float[i];
		aFloatArray11878 = new float[i];
		anInt11877 = 0;
		for (int i_1_ = 0; i_1_ < i; i_1_++) {
			aFloatArray11876[i_1_] = class536_sub33.method9712(-1152368477);
			aFloatArray11879[i_1_] = class536_sub33.method9712(-1254790578);
			aFloatArray11878[i_1_] = class536_sub33.method9712(149249118);
		}
	}

	void method10315() {
		anInt11877 += 277087993;
	}

	void method10311(RSByteBuffer class536_sub33, int i) {
		aFloatArray11876 = new float[i];
		aFloatArray11879 = new float[i];
		aFloatArray11878 = new float[i];
		anInt11877 = 0;
		for (int i_2_ = 0; i_2_ < i; i_2_++) {
			aFloatArray11876[i_2_] = class536_sub33.method9712(233402335);
			aFloatArray11879[i_2_] = class536_sub33.method9712(1283539408);
			aFloatArray11878[i_2_] = class536_sub33.method9712(-1884196244);
		}
	}

	void method10306(int i) {
		anInt11877 += 277087993;
	}

	float method10314(float f, float f_3_, float f_4_) {
		float f_5_ = aFloat10959 / f;
		if (f_5_ < 0.0F)
			f_5_ = 0.0F;
		if (f_5_ > 1.0F)
			f_5_ = 1.0F;
		return ((f_5_ * (aFloatArray11879[anInt11877 * -449062071] - aFloatArray11876[anInt11877 * -449062071]) + aFloatArray11876[-449062071 * anInt11877]) * (f / aFloatArray11878[anInt11877 * -449062071]));
	}

	void method10313(RSByteBuffer class536_sub33, int i) {
		aFloatArray11876 = new float[i];
		aFloatArray11879 = new float[i];
		aFloatArray11878 = new float[i];
		anInt11877 = 0;
		for (int i_6_ = 0; i_6_ < i; i_6_++) {
			aFloatArray11876[i_6_] = class536_sub33.method9712(1458149815);
			aFloatArray11879[i_6_] = class536_sub33.method9712(-752051086);
			aFloatArray11878[i_6_] = class536_sub33.method9712(2068055381);
		}
	}

	public Class706_Sub4_Sub3(Class301 class301) {
		super(class301);
	}

	float method10305(float f, float f_7_, float f_8_, int i) {
		float f_9_ = aFloat10959 / f;
		if (f_9_ < 0.0F)
			f_9_ = 0.0F;
		if (f_9_ > 1.0F)
			f_9_ = 1.0F;
		return ((f_9_ * (aFloatArray11879[anInt11877 * -449062071] - aFloatArray11876[anInt11877 * -449062071]) + aFloatArray11876[-449062071 * anInt11877]) * (f / aFloatArray11878[anInt11877 * -449062071]));
	}
}
