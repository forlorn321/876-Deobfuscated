/* Class536_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub20 extends Class536 {
	public short aShort10520;

	public Class536_Sub20(short i) {
		aShort10520 = i;
	}

	static int method9567(NPC class649_sub1_sub5_sub1_sub1, int i) {
		Class296 class296 = class649_sub1_sub5_sub1_sub1.aClass296_12174;
		if (class296.anIntArray3304 != null) {
			class296 = class296.method3984(Class465_Sub1.aClass96_10352, Class465_Sub1.aClass96_10352, (byte) -38);
			if (class296 == null)
				return -1;
		}
		int i_0_ = class296.anInt3321 * -369448145;
		Class589 class589 = class649_sub1_sub5_sub1_sub1.method10877(772515732);
		int i_1_ = class649_sub1_sub5_sub1_sub1.aClass688_Sub3_11914.method8120((byte) 89);
		if (-1 == i_1_ || class649_sub1_sub5_sub1_sub1.aClass688_Sub3_11914.aBool10975)
			i_0_ = class296.anInt3319 * -1037321689;
		else if (-1967774449 * class589.anInt7751 == i_1_ || i_1_ == class589.anInt7752 * 1554006571 || i_1_ == -461301069 * class589.anInt7754 || -1062537651 * class589.anInt7741 == i_1_)
			i_0_ = class296.anInt3326 * -3853097;
		else if (1910615395 * class589.anInt7755 == i_1_ || 183104283 * class589.anInt7766 == i_1_ || 592656773 * class589.anInt7758 == i_1_ || class589.anInt7757 * -1930617513 == i_1_)
			i_0_ = -1335145847 * class296.anInt3320;
		return i_0_;
	}

	public static final int method9568(String string, int i) {
		if (string == null)
			return -1;
		for (int i_2_ = 0; i_2_ < 142551095 * client.anInt11288; i_2_++) {
			if (string.equalsIgnoreCase(client.aClass31Array11291[i_2_].aString266))
				return i_2_;
		}
		return -1;
	}

	public static void method9569(int i, int i_3_, byte i_4_) {
		Class536_Sub18_Sub5 class536_sub18_sub5 = Class34_Sub11.method10334(20, (long) i_3_ << 32 | (long) i);
		class536_sub18_sub5.method10669(1048568136);
	}

	static final void method9570(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_5_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_6_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		Class700 class700 = Class542.method6574(i_5_ >> 14 & 0x3fff, i_5_ & 0x3fff);
		boolean bool = false;
		for (Class536_Sub18_Sub14 class536_sub18_sub14 = (Class536_Sub18_Sub14) class700.method8248(-1764370079); null != class536_sub18_sub14; class536_sub18_sub14 = (Class536_Sub18_Sub14) class700.method8241(-709511250)) {
			if (i_6_ == class536_sub18_sub14.anInt11765 * -673647059) {
				bool = true;
				break;
			}
		}
		if (bool)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}
}
