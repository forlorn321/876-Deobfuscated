/* Class430 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class430 implements Interface5 {
	Class459 aClass459_4829;
	String aString4830;

	public int method51() {
		if (aClass459_4829.method7499(aString4830, -958250032))
			return 100;
		return 0;
	}

	public int method45(byte i) {
		if (aClass459_4829.method7499(aString4830, -1527227532))
			return 100;
		return 0;
	}

	public Class48 method49(int i) {
		return Class48.aClass48_502;
	}

	public Class48 method47() {
		return Class48.aClass48_502;
	}

	public int method7() {
		if (aClass459_4829.method7499(aString4830, -964158258))
			return 100;
		return 0;
	}

	public Class48 method48() {
		return Class48.aClass48_502;
	}

	public int method6() {
		if (aClass459_4829.method7499(aString4830, -1911721847))
			return 100;
		return 0;
	}

	public Class48 method50() {
		return Class48.aClass48_502;
	}

	Class430(Class459 class459, String string) {
		aClass459_4829 = class459;
		aString4830 = string;
	}

	public int method46() {
		if (aClass459_4829.method7499(aString4830, -390651951))
			return 100;
		return 0;
	}

	static final void method6870(Class243 class243, Class240 class240, Class665 class665, int i) {
		class665.anInt8526 -= 409523364;
		class243.anInt2509 = -51043815 * (class665.anIntArray8525[1769813785 * class665.anInt8526]);
		class243.anInt2644 = (74795039 * class665.anIntArray8525[1 + 1769813785 * class665.anInt8526]);
		class243.anInt2554 = 0;
		class243.anInt2677 = 0;
		int i_0_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 2];
		if (i_0_ < 0)
			i_0_ = 0;
		else if (i_0_ > 4)
			i_0_ = 4;
		int i_1_ = class665.anIntArray8525[3 + class665.anInt8526 * 1769813785];
		if (i_1_ < 0)
			i_1_ = 0;
		else if (i_1_ > 4)
			i_1_ = 4;
		class243.aByte2494 = (byte) i_0_;
		class243.aByte2506 = (byte) i_1_;
		method6876(class243, (byte) 50);
		Class209.method3869(class240, class243, -1778055362);
		if (-270144907 * class243.anInt2501 == 0)
			Class397.method6513(class240, class243, false, 1851772382);
	}

	static final void method6871(Class665 class665, byte i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4482, client.aClass109_11067.aClass2_1367, (byte) 35);
		class527_sub15.buffer.writeByte(string.length() + 1, 606409532);
		class527_sub15.buffer.writeString(string, 1038765287);
		client.aClass109_11067.method1969(class527_sub15, (byte) 1);
	}

	static void method6872(Class180 class180, int i, int i_2_, Class243 class243, int i_3_, int i_4_) {
		for (int i_5_ = 7; i_5_ >= 0; i_5_--) {
			for (int i_6_ = 127; i_6_ >= 0; i_6_--) {
				int i_7_ = (i_3_ & 0x3f) << 10 | (i_5_ & 0x7) << 7 | i_6_ & 0x7f;
				Class25.method851(false, true, (byte) 3);
				int i_8_ = Class656.anIntArray8393[i_7_];
				Class520.method8664(false, true, -840610485);
				class180.method3348((i_6_ * (class243.anInt2511 * -1054537975) >> 7) + i, ((7 - i_5_) * (-1386504031 * class243.anInt2514) >> 3) + i_2_, 1 + (class243.anInt2511 * -1054537975 >> 7), 1 + (class243.anInt2514 * -1386504031 >> 3), ~0xffffff | i_8_, 0);
			}
		}
	}

	static final void method6873(int i, int i_9_, int i_10_, int i_11_, int i_12_) {
		int i_13_ = client.anInt11140 * -1776439339;
		int i_14_ = client.anInt11141 * -1631573453;
		if (1 == -25431897 * client.anInt11123) {
			Class147 class147 = (Class294.aClass147Array3272[-398426617 * client.anInt11142 / 100]);
			class147.method2415(i_13_ - 8, i_14_ - 8);
		}
		if (client.anInt11123 * -25431897 == 2) {
			Class147 class147 = (Class294.aClass147Array3272[-398426617 * client.anInt11142 / 100 + 4]);
			class147.method2415(i_13_ - 8, i_14_ - 8);
		}
	}

	static boolean method6874(String string, String string_15_, byte i) {
		Class32.anInt286 = -2004669559;
		Class32.aClass109_270 = client.aClass109_11067;
		return Class40.method1166(false, false, string, string_15_, -1L);
	}

	static final void method6875(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.aBool11180 && !client.aBool11169 ? 1 : 0;
	}

	public static void method6876(Class243 class243, byte i) {
		if (-1575379485 * client.anInt11252 == 267321957 * class243.anInt2657)
			client.aBoolArray11310[class243.anInt2652 * -1405158265] = true;
	}
}
