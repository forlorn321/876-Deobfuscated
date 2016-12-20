/* Class229 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class229 implements Interface42 {
	Class226 this$0;

	Class229(Class226 class226) {
		this$0 = class226;
	}

	public float method278(int i) {
		return ((float) Class204.aClass527_Sub31_2213.aClass700_Sub24_10591.method17139((byte) 17) / 255.0F);
	}

	public float method279() {
		return ((float) Class204.aClass527_Sub31_2213.aClass700_Sub24_10591.method17139((byte) -5) / 255.0F);
	}

	public static void method4315(int i) {
		if (null != Class290.anInterface31Array3225) {
			Interface31[] interface31s = Class290.anInterface31Array3225;
			for (int i_0_ = 0; i_0_ < interface31s.length; i_0_++) {
				Interface31 interface31 = interface31s[i_0_];
				interface31.method182(570724365);
			}
		}
	}

	static final void method4316(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class274.method5132(class243, class240, class665, 591842255);
	}

	static final void method4317(byte i) {
		if (client.aFloat11111 < 1070.0F)
			client.aFloat11111 = 1070.0F;
		if (client.aFloat11111 > 3056.0F)
			client.aFloat11111 = 3056.0F;
		for (/**/; client.aFloat11112 >= 16384.0F; client.aFloat11112 -= 16384.0F) {
			/* empty */
		}
		for (/**/; client.aFloat11112 < 0.0F; client.aFloat11112 += 16384.0F) {
			/* empty */
		}
		Class470 class470 = client.aClass509_11072.method8359(2053202391);
		Class555 class555 = client.aClass509_11072.method8314(-780082273);
		int i_1_ = Class286.anInt3211 * 657661431 >> 9;
		int i_2_ = -1823634057 * Class608.anInt7995 >> 9;
		int i_3_ = Class590.method9853(657661431 * Class286.anInt3211, -1823634057 * Class608.anInt7995, 162317215 * Class673.anInt8585, (byte) 5);
		int i_4_ = 0;
		if (i_1_ > 3 && i_2_ > 3 && i_1_ < client.aClass509_11072.method8284((byte) 100) - 4 && i_2_ < client.aClass509_11072.method8285(1064528201) - 4) {
			for (int i_5_ = i_1_ - 4; i_5_ <= i_1_ + 4; i_5_++) {
				for (int i_6_ = i_2_ - 4; i_6_ <= i_2_ + 4; i_6_++) {
					int i_7_ = 162317215 * Class673.anInt8585;
					if (i_7_ < 3 && class470.method7706(i_5_, i_6_, (short) -16194))
						i_7_++;
					int i_8_ = 0;
					byte[][] is = client.aClass509_11072.method8349(i_7_, (byte) 79);
					if (is != null)
						i_8_ = 8 * (is[i_5_][i_6_] & 0xff) << 2;
					if (null != class555.aClass161Array7434 && class555.aClass161Array7434[i_7_] != null) {
						int i_9_ = i_3_ - (class555.aClass161Array7434[i_7_].method2595(i_5_, i_6_, (byte) 95) - i_8_);
						if (i_9_ > i_4_)
							i_4_ = i_9_;
					}
				}
			}
		}
		int i_10_ = (i_4_ >> 2) * 1536;
		if (i_10_ > 786432)
			i_10_ = 786432;
		if (i_10_ < 262144)
			i_10_ = 262144;
		if (i_10_ > client.anInt11120 * -340124423)
			client.anInt11120 += (i_10_ - -340124423 * client.anInt11120) / 24 * 1541137737;
		else if (i_10_ < client.anInt11120 * -340124423)
			client.anInt11120 += (i_10_ - -340124423 * client.anInt11120) / 80 * 1541137737;
	}

	static final void method4318(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		if (class243.aString2614 == null)
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
		else
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = class243.aString2614;
	}
}
