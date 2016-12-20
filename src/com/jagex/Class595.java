/* Class595 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class595 implements Interface76 {
	public static Class595 aClass595_7814;
	public static Class595 aClass595_7815;
	public static Class595 aClass595_7816 = new Class595(0);
	int anInt7817;
	static Thread aThread7818;
	public static int anInt7819;

	Class595(int i) {
		anInt7817 = 1372419075 * i;
	}

	public int method87() {
		return -1069295957 * anInt7817;
	}

	static {
		aClass595_7815 = new Class595(1);
		aClass595_7814 = new Class595(2);
	}

	public int method42() {
		return -1069295957 * anInt7817;
	}

	public int method91() {
		return -1069295957 * anInt7817;
	}

	public static Class595[] method9886() {
		return (new Class595[] { aClass595_7814, aClass595_7816, aClass595_7815 });
	}

	static final void method9887(Class665 class665, int i) {
		class665.anInt8528 -= 433009517;
	}

	static final void method9888(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_0_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_1_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_0_ + i_1_;
	}

	static final void method9889(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 1220660925 * Class335.anInt3642;
	}

	static float method9890(float f, float f_2_, float f_3_, float f_4_, float f_5_, float f_6_, int i, short i_7_) {
		float f_8_ = 0.0F;
		float f_9_ = f_4_ - f;
		float f_10_ = f_5_ - f_2_;
		float f_11_ = f_6_ - f_3_;
		float f_12_ = 0.0F;
		float f_13_ = 0.0F;
		float f_14_ = 0.0F;
		Class555 class555 = client.aClass509_11072.method8314(-726366421);
		for (/**/; f_8_ < 1.1F; f_8_ += 0.1F) {
			float f_15_ = f + f_9_ * f_8_;
			float f_16_ = f_2_ + f_8_ * f_10_;
			float f_17_ = f_3_ + f_11_ * f_8_;
			int i_18_ = (int) f_15_ >> 9;
			int i_19_ = (int) f_17_ >> 9;
			if (i_18_ > 0 && i_19_ > 0 && i_18_ < client.aClass509_11072.method8284((byte) 115) && i_19_ < client.aClass509_11072.method8285(-144264215)) {
				int i_20_ = Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864;
				if (i_20_ < 3 && ((client.aClass509_11072.method8359(907389498).aByteArrayArrayArray5354[1][i_18_][i_19_]) & 0x2) != 0)
					i_20_++;
				int i_21_ = class555.aClass161Array7457[i_20_].method2593((int) f_15_, (int) f_17_, -1151432033);
				if ((float) i_21_ < f_16_) {
					if (i >= 2)
						return (f_8_ - 0.1F + (method9890(f_12_, f_13_, f_14_, f_15_, f_16_, f_17_, i - 1, (short) 255) * 0.1F));
					return f_8_;
				}
			}
			f_12_ = f_15_;
			f_13_ = f_16_;
			f_14_ = f_17_;
		}
		return -1.0F;
	}
}
