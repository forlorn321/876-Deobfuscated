/* Class312 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class312 implements Interface33 {
	Class147 aClass147_3493;
	Class459 aClass459_3494;
	Class387 aClass387_3495;
	static int anInt3496;
	public static Class24_Sub11 aClass24_Sub11_3497;

	public void method85() {
		aClass147_3493 = Class568.method9569(aClass459_3494, 873584819 * aClass387_3495.anInt3965, 173180259);
	}

	public void method205(byte i) {
		aClass147_3493 = Class568.method9569(aClass459_3494, 873584819 * aClass387_3495.anInt3965, 173180259);
	}

	public void method203(boolean bool, int i) {
		if (bool) {
			int i_0_ = ((Class289.anInt3223 * -1803844265 > client.anInt11158 * -1844600635) ? Class289.anInt3223 * -1803844265 : client.anInt11158 * -1844600635);
			int i_1_ = ((-471480167 * Class611.anInt8009 > 1254981347 * client.anInt11058) ? -471480167 * Class611.anInt8009 : client.anInt11058 * 1254981347);
			int i_2_ = aClass147_3493.method42();
			int i_3_ = aClass147_3493.method2410();
			int i_4_ = 0;
			int i_5_ = i_0_;
			int i_6_ = i_3_ * i_0_ / i_2_;
			int i_7_ = (i_1_ - i_6_) / 2;
			if (i_6_ > i_1_) {
				i_7_ = 0;
				i_6_ = i_1_;
				i_5_ = i_1_ * i_2_ / i_3_;
				i_4_ = (i_0_ - i_5_) / 2;
			}
			aClass147_3493.method2418(i_4_, i_7_, i_5_, i_6_);
		}
	}

	public boolean method204(int i) {
		return aClass459_3494.method7480(aClass387_3495.anInt3965 * 873584819, -699949245);
	}

	public void method206(boolean bool) {
		if (bool) {
			int i = ((Class289.anInt3223 * -1803844265 > client.anInt11158 * -1844600635) ? Class289.anInt3223 * -1803844265 : client.anInt11158 * -1844600635);
			int i_8_ = ((-471480167 * Class611.anInt8009 > 1254981347 * client.anInt11058) ? -471480167 * Class611.anInt8009 : client.anInt11058 * 1254981347);
			int i_9_ = aClass147_3493.method42();
			int i_10_ = aClass147_3493.method2410();
			int i_11_ = 0;
			int i_12_ = i;
			int i_13_ = i_10_ * i / i_9_;
			int i_14_ = (i_8_ - i_13_) / 2;
			if (i_13_ > i_8_) {
				i_14_ = 0;
				i_13_ = i_8_;
				i_12_ = i_8_ * i_9_ / i_10_;
				i_11_ = (i - i_12_) / 2;
			}
			aClass147_3493.method2418(i_11_, i_14_, i_12_, i_13_);
		}
	}

	Class312(Class459 class459, Class387 class387) {
		aClass459_3494 = class459;
		aClass387_3495 = class387;
	}

	public boolean method207() {
		return aClass459_3494.method7480(aClass387_3495.anInt3965 * 873584819, -1358872065);
	}

	public boolean method208() {
		return aClass459_3494.method7480(aClass387_3495.anInt3965 * 873584819, -158554090);
	}

	static final void method5650(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class309.method5629(class243, class240, class665, 204273084);
	}

	static final void method5651(Class665 class665, int i) {
		int i_15_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_15_, -584425039);
		Class240 class240 = Class183.aClass240Array2100[i_15_ >> 16];
		Class160.method2581(class243, class240, class665, 1302478489);
	}

	public static void method5652(boolean bool, int i) {
		if (2 != -1481292237 * client.anInt11080 && 3 != -1481292237 * client.anInt11080) {
			if (!bool) {
				if (null != Class181.aClass208Array2093) {
					Class208[] class208s = Class181.aClass208Array2093;
					for (int i_16_ = 0; i_16_ < class208s.length; i_16_++) {
						Class208 class208 = class208s[i_16_];
						class208.method3850((byte) 106);
					}
				}
				if (-1939121951 * Class209.anInt2237 != -1)
					Class245.aClass226_2698.method4273((-1939121951 * Class209.anInt2237), 255, (byte) 8);
			}
			client.anInt11080 = 1879984630;
			Class213.aClass527_Sub38_2261 = null;
			client.aBool11081 = false;
			if (Class209.anInt2244 * 554639759 > 0)
				Class546.method9060(Class579.aClass579_7650, Class209.anInt2244 * 554639759, -1, (byte) -128);
			Class263.method4963(1274737106);
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4403, client.aClass109_11067.aClass2_1367, (byte) -72);
			class527_sub15.buffer.writeByte(bool ? 1 : 0, 1355425908);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
	}
}
