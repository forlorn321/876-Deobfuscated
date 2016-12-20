/* Class218 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class218 implements Interface27 {
	int anInt2284;
	Class214 this$0;
	public static Class147 aClass147_2285;
	public static int anInt2286;

	public void method150(Class219 class219, int i) {
		Class228 class228 = ((Class228) class219.method4059((byte) 59).get(99354091 * anInt2284));
		class219.method3997(99354091 * anInt2284, 433009517);
		class228.method4310(-1798295199);
	}

	Class218(Class214 class214, RSByteBuffer class527_sub38) {
		this$0 = class214;
		anInt2284 = class527_sub38.readUnsignedShort() * -229573949;
	}

	public void method151(Class219 class219) {
		Class228 class228 = ((Class228) class219.method4059((byte) 79).get(99354091 * anInt2284));
		class219.method3997(99354091 * anInt2284, 433009517);
		class228.method4310(278115993);
	}

	static void method3975(int i) {
		if (null == Class656.anIntArray8393)
			Class656.anIntArray8393 = new int[65536];
		else
			return;
		double d = 0.7 + (Math.random() * 0.03 - 0.015);
		int i_0_ = 0;
		for (int i_1_ = 0; i_1_ < 512; i_1_++) {
			float f = (0.0078125F + (float) (i_1_ >> 3) / 64.0F) * 360.0F;
			float f_2_ = (float) (i_1_ & 0x7) / 8.0F + 0.0625F;
			for (int i_3_ = 0; i_3_ < 128; i_3_++) {
				float f_4_ = (float) i_3_ / 128.0F;
				float f_5_ = 0.0F;
				float f_6_ = 0.0F;
				float f_7_ = 0.0F;
				float f_8_ = f / 60.0F;
				int i_9_ = (int) f_8_;
				int i_10_ = i_9_ % 6;
				float f_11_ = f_8_ - (float) i_9_;
				float f_12_ = f_4_ * (1.0F - f_2_);
				float f_13_ = (1.0F - f_11_ * f_2_) * f_4_;
				float f_14_ = (1.0F - (1.0F - f_11_) * f_2_) * f_4_;
				if (i_10_ == 0) {
					f_5_ = f_4_;
					f_6_ = f_14_;
					f_7_ = f_12_;
				} else if (1 == i_10_) {
					f_5_ = f_13_;
					f_6_ = f_4_;
					f_7_ = f_12_;
				} else if (i_10_ == 2) {
					f_5_ = f_12_;
					f_6_ = f_4_;
					f_7_ = f_14_;
				} else if (i_10_ == 3) {
					f_5_ = f_12_;
					f_6_ = f_13_;
					f_7_ = f_4_;
				} else if (4 == i_10_) {
					f_5_ = f_14_;
					f_6_ = f_12_;
					f_7_ = f_4_;
				} else if (5 == i_10_) {
					f_5_ = f_4_;
					f_6_ = f_12_;
					f_7_ = f_13_;
				}
				f_5_ = (float) Math.pow((double) f_5_, d);
				f_6_ = (float) Math.pow((double) f_6_, d);
				f_7_ = (float) Math.pow((double) f_7_, d);
				int i_15_ = (int) (f_5_ * 256.0F);
				int i_16_ = (int) (f_6_ * 256.0F);
				int i_17_ = (int) (f_7_ * 256.0F);
				int i_18_ = i_17_ + ((i_16_ << 8) + (-16777216 + (i_15_ << 16)));
				Class656.anIntArray8393[i_0_++] = i_18_;
			}
		}
	}

	static final void method3976(Class243 class243, Class240 class240, Class665 class665, int i) {
		class243.anInt2602 = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) * -716980265;
	}

	static final void method3977(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class580.method9659(class243, class240, class665, -365367216);
	}

	static final void method3978(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub24_10633.method17139((byte) 37);
	}

	static final void method3979(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class703.aClass219_8825.method3986(-1919811784) ? 1 : 0;
	}

	static final void method3980(Class665 class665, int i) {
		int i_19_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class674 class674;
		if (class665.aBool8549)
			class674 = class665.aClass674_8534;
		else
			class674 = class665.aClass674_8533;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class674.method13843(i_19_, -1, -1948749902) ? 1 : 0;
	}
}
