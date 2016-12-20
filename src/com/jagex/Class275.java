/* Class275 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class275 {
	String aString3149;
	int anInt3150 = -340539899;
	public int[] anIntArray3151;
	Class266 aClass266_3152;
	String aString3153;
	public int[] anIntArray3154;
	Class266 aClass266_3155;
	static String aString3156;
	static int anInt3157;

	void method5134(Class278 class278) {
		int i = class278.method5158((byte) 18);
		aClass266_3155 = Class546.method9057((byte) 47)[i];
		if (Class266.aClass266_2927 == aClass266_3155) {
			int i_0_ = class278.method5158((byte) 112);
			aClass266_3152 = Class546.method9057((byte) 56)[i_0_];
			anInt3150 = class278.method5158((byte) 109) * 340539899;
		}
		aString3149 = class278.method5157(-123882494);
		aString3153 = class278.method5157(-123882494);
		int i_1_ = class278.method5158((byte) 36);
		anIntArray3154 = new int[i_1_];
		anIntArray3151 = new int[i_1_];
		for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
			anIntArray3154[i_2_] = class278.method5158((byte) 112);
			anIntArray3151[i_2_] = class278.method5158((byte) 47);
		}
	}

	void method5135(Class278 class278, int i) {
		int i_3_ = class278.method5158((byte) 68);
		aClass266_3155 = Class546.method9057((byte) 81)[i_3_];
		if (Class266.aClass266_2927 == aClass266_3155) {
			int i_4_ = class278.method5158((byte) 39);
			aClass266_3152 = Class546.method9057((byte) 101)[i_4_];
			anInt3150 = class278.method5158((byte) 86) * 340539899;
		}
		aString3149 = class278.method5157(-123882494);
		aString3153 = class278.method5157(-123882494);
		int i_5_ = class278.method5158((byte) 92);
		anIntArray3154 = new int[i_5_];
		anIntArray3151 = new int[i_5_];
		for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
			anIntArray3154[i_6_] = class278.method5158((byte) 85);
			anIntArray3151[i_6_] = class278.method5158((byte) 126);
		}
	}

	Class275() {
		/* empty */
	}

	void method5136(Class278 class278) {
		int i = class278.method5158((byte) 64);
		aClass266_3155 = Class546.method9057((byte) 112)[i];
		if (Class266.aClass266_2927 == aClass266_3155) {
			int i_7_ = class278.method5158((byte) 81);
			aClass266_3152 = Class546.method9057((byte) 106)[i_7_];
			anInt3150 = class278.method5158((byte) 68) * 340539899;
		}
		aString3149 = class278.method5157(-123882494);
		aString3153 = class278.method5157(-123882494);
		int i_8_ = class278.method5158((byte) 116);
		anIntArray3154 = new int[i_8_];
		anIntArray3151 = new int[i_8_];
		for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
			anIntArray3154[i_9_] = class278.method5158((byte) 75);
			anIntArray3151[i_9_] = class278.method5158((byte) 38);
		}
	}

	static void method5137(Class243 class243, Class142 class142, int i, int i_10_, int i_11_, int i_12_, Class147 class147, double d, Class274 class274, Class277 class277, byte i_13_) {
		if (null != class147) {
			int i_14_;
			if (2 == -349191067 * Class30.anInt265)
				i_14_ = ((int) ((double) Class208_Sub10.aClass296_Sub1_9923.method5382(-1086086917) * 2607.5945876176133) + -973282125 * client.anInt11088) & 0x3fff;
			else if (6 == Class30.anInt265 * -349191067)
				i_14_ = (int) client.aFloat11112 & 0x3fff;
			else
				i_14_ = (client.anInt11088 * -973282125 + (int) client.aFloat11112) & 0x3fff;
			int i_15_ = (Math.max(-1054537975 * class243.anInt2511 / 2, -1386504031 * class243.anInt2514 / 2) + 10);
			int i_16_ = i_11_ * i_11_ + i_12_ * i_12_;
			if (i_16_ <= i_15_ * i_15_) {
				int i_17_ = Class428.anIntArray4825[i_14_];
				int i_18_ = Class428.anIntArray4819[i_14_];
				if (-349191067 * Class30.anInt265 != 6) {
					i_17_ = i_17_ * 256 / (-2083955513 * client.anInt10991 + 256);
					i_18_ = i_18_ * 256 / (256 + client.anInt10991 * -2083955513);
				}
				int i_19_ = i_18_ * i_11_ + i_12_ * i_17_ >> 14;
				int i_20_ = i_12_ * i_18_ - i_11_ * i_17_ >> 14;
				double d_21_ = d / 100.0;
				switch (class274.anInt3146 * -229615941) {
				case 0:
					i = (-1054537975 * class243.anInt2511 / 2 + i + i_19_ - (int) ((double) class147.method42() * d_21_));
					break;
				case 1:
					i = (-1054537975 * class243.anInt2511 / 2 + i + i_19_ - (int) ((double) (class147.method42() / 2) * d_21_));
					break;
				case 2:
					i = class243.anInt2511 * -1054537975 / 2 + i + i_19_;
					break;
				}
				switch (class277.anInt3165 * -401058325) {
				case 2:
					i_10_ = (-1386504031 * class243.anInt2514 / 2 + i_10_ - i_20_ - (int) ((double) class147.method2410() * d_21_));
					break;
				case 1:
					i_10_ = (i_10_ + -1386504031 * class243.anInt2514 / 2 - i_20_ - (int) ((double) (class147.method2410() / 2) * d_21_));
					break;
				case 0:
					i_10_ = i_10_ + -1386504031 * class243.anInt2514 / 2 - i_20_;
					break;
				}
				if (null != class142) {
					if (1.0 == d_21_)
						class147.method2465(i, i_10_, class142, i, i_10_);
					else
						class147.method2418(i, i_10_, (int) ((double) class147.method42() * d_21_), (int) ((double) class147.method2410() * d_21_));
				} else {
					if (1.0 == d_21_)
						class147.method2415(i, i_10_);
					class147.method2418(i, i_10_, (int) ((double) class147.method42() * d_21_), (int) ((double) class147.method2410() * d_21_));
				}
			}
		}
	}

	static final void method5138(Class665 class665, byte i) {
		if (!Class208_Sub10.aClass296_Sub1_9923.method5376((byte) 1).method5569((byte) 38))
			throw new RuntimeException();
		Class327_Sub3 class327_sub3 = ((Class327_Sub3) Class208_Sub10.aClass296_Sub1_9923.method5372((byte) 0));
		class327_sub3.method15840(Class505.aClass437_6913, -1, 0.0F, 494674371);
		client.aBool11119 = true;
	}

	static final void method5139(Class665 class665, byte i) {
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub37_10589, (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]), 1195095677);
		Class631.method10465(-1361965160);
	}

	public static void method5140(int i, byte i_22_) {
		Class64.anInt744 = i * -1360328673;
		Class243.aClass205_2497.method3793((byte) 117);
	}

	static final void method5141(Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		int i_23_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class449.method7282(string, i_23_ == 1, (byte) -78);
	}

	static final void method5142(Class665 class665, byte i) {
		int i_24_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_24_, 1382390786);
		Class240 class240 = Class183.aClass240Array2100[i_24_ >> 16];
		Class492.method7990(class243, class240, class665, 1429585381);
	}

	public static void method5143(byte i) {
		if (null != IcmpService_Sub1.anIcmpService_Sub1_10869) {
			try {
				IcmpService_Sub1.anIcmpService_Sub1_10869.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
			IcmpService_Sub1.anIcmpService_Sub1_10869 = null;
		}
	}
}
