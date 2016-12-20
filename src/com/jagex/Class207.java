/* Class207 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class207 implements Interface42 {
	Class226 this$0;
	static Class702 aClass702_2232;

	Class207(Class226 class226) {
		this$0 = class226;
	}

	public float method278(int i) {
		return ((float) Class204.aClass527_Sub31_2213.aClass700_Sub24_10636.method17139((byte) 51) / 255.0F);
	}

	public float method279() {
		return ((float) Class204.aClass527_Sub31_2213.aClass700_Sub24_10636.method17139((byte) -91) / 255.0F);
	}

	static void method3841(Class243 class243, Class248 class248, int i, int i_0_, int i_1_, int i_2_, int i_3_, long l) {
		int i_4_ = i_2_ * i_2_ + i_1_ * i_1_;
		if ((long) i_4_ <= l) {
			int i_5_;
			if (2 == Class30.anInt265 * -349191067)
				i_5_ = ((int) ((double) Class208_Sub10.aClass296_Sub1_9923.method5382(-539387481) * 2607.5945876176133) + -973282125 * client.anInt11088) & 0x3fff;
			else if (-349191067 * Class30.anInt265 == 6)
				i_5_ = (int) client.aFloat11112 & 0x3fff;
			else
				i_5_ = (-973282125 * client.anInt11088 + (int) client.aFloat11112) & 0x3fff;
			int i_6_ = Class428.anIntArray4825[i_5_];
			int i_7_ = Class428.anIntArray4819[i_5_];
			if (6 != Class30.anInt265 * -349191067) {
				i_6_ = 256 * i_6_ / (256 + -2083955513 * client.anInt10991);
				i_7_ = 256 * i_7_ / (256 + client.anInt10991 * -2083955513);
			}
			int i_8_ = i_2_ * i_6_ + i_1_ * i_7_ >> 14;
			int i_9_ = i_2_ * i_7_ - i_1_ * i_6_ >> 14;
			Class147 class147 = Class650.aClass147Array8373[i_3_];
			int i_10_ = class147.method2407();
			int i_11_ = class147.method2424();
			int i_12_ = class243.anInt2511 * -1054537975 / 2 + i_8_ - i_10_ / 2;
			int i_13_ = i_12_ + i_10_;
			int i_14_ = -i_9_ + class243.anInt2514 * -1386504031 / 2 - i_11_;
			int i_15_ = i_11_ + i_14_;
			boolean bool;
			if (null != class248)
				bool = (!class248.method4631(i_12_, i_14_, 1531562541) || !class248.method4631(i_13_, i_14_, 1251397803) || !class248.method4631(i_12_, i_15_, 2119654290) || !class248.method4631(i_13_, i_15_, 1725627280));
			else {
				int i_16_ = i_11_;
				int i_17_ = i_10_ / 2;
				bool = (i_14_ <= -i_16_ || i_15_ >= -1386504031 * class243.anInt2514 || i_12_ <= -i_17_ || i_13_ >= i_17_ + class243.anInt2511 * -1054537975);
			}
			if (bool) {
				double d = Math.atan2((double) i_8_, (double) i_9_);
				double d_18_ = Math.atan2((double) Math.abs(i_8_), (double) Math.abs(i_9_));
				double d_19_ = Math.atan2((double) (class243.anInt2511 * -1054537975 / 2), (double) (-1386504031 * class243.anInt2514 / 2));
				boolean bool_20_ = false;
				double d_21_ = 0.0;
				int i_22_;
				if (d_18_ < d_19_) {
					d_21_ = 1.5707963267948966 - d;
					i_22_ = class243.anInt2514 * -1386504031 / 2;
				} else {
					d_21_ = d;
					i_22_ = -1054537975 * class243.anInt2511 / 2;
				}
				int i_23_ = Math.abs((int) -((double) i_22_ * Math.sin(1.5707963267948966) / Math.sin(d_21_)));
				Class499.aClass147Array5592[i_3_].method2423(0.0F + ((float) (-1054537975 * class243.anInt2511) / 2.0F + (float) i), ((float) i_0_ + (float) (class243.anInt2514 * -1386504031) / 2.0F - 0.0F), ((float) Class499.aClass147Array5592[i_3_].method42() / 2.0F), (float) i_23_, 4096, (int) (65535.0 * (-d / 6.283185307179586)));
			} else if (class248 != null)
				class147.method2465(i_12_ + i, i_0_ + i_14_, class248.aClass142_2725, i, i_0_);
			else
				class147.method2415(i_12_ + i, i_0_ + i_14_);
		}
	}

	static final void method3842(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_24_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_25_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_24_ & i_25_;
	}

	static final void method3843(Class665 class665, int i) {
		class665.anInt8528 -= 1299028551;
		String string = ((String) class665.anObjectArray8541[318492261 * class665.anInt8528]);
		String string_26_ = ((String) class665.anObjectArray8541[1 + class665.anInt8528 * 318492261]);
		String string_27_ = ((String) class665.anObjectArray8541[2 + class665.anInt8528 * 318492261]);
		boolean bool = ((class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) == 1);
		Class327.method5803(string, string_26_, string_27_, bool, -1989449850);
	}

	public static void method3844(int i, int i_28_) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(4, (long) i);
		class527_sub8_sub9.method18186(-2140861866);
	}
}
