/* Class432 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class432 implements Interface5 {
	String aString4824;
	boolean aBool4825;

	public Class50 method49() {
		return Class50.aClass50_584;
	}

	public int method48(int i) {
		if (aBool4825)
			return 100;
		int i_0_;
		try {
			i_0_ = Class399.aClass530_4128.method6437(aString4824, (byte) 46);
		} catch (Exception_Sub1 exception_sub1) {
			Class684.method8105(Class52.aClass52_589, exception_sub1.aString11345, exception_sub1.anInt11344 * -813039431, exception_sub1.getCause(), 965339553);
			aBool4825 = true;
			return 100;
		}
		return i_0_;
	}

	public int method47() {
		if (aBool4825)
			return 100;
		int i;
		try {
			i = Class399.aClass530_4128.method6437(aString4824, (byte) 36);
		} catch (Exception_Sub1 exception_sub1) {
			Class684.method8105(Class52.aClass52_589, exception_sub1.aString11345, exception_sub1.anInt11344 * -813039431, exception_sub1.getCause(), 2027484448);
			aBool4825 = true;
			return 100;
		}
		return i;
	}

	void method5179() {
		aBool4825 = true;
	}

	public Class50 method50(byte i) {
		return Class50.aClass50_584;
	}

	boolean method5180(short i) {
		return aBool4825;
	}

	public Class50 method46() {
		return Class50.aClass50_584;
	}

	void method5181(byte i) {
		aBool4825 = true;
	}

	Class432(String string) {
		aString4824 = string;
	}

	boolean method5182() {
		return aBool4825;
	}

	boolean method5183() {
		return aBool4825;
	}

	public Class50 method45() {
		return Class50.aClass50_584;
	}

	void method5184() {
		aBool4825 = true;
	}

	static int method5185(int i, int i_1_, int i_2_) {
		if (i_1_ == 9)
			i = i + 1 & 0x3;
		if (10 == i_1_)
			i = 3 + i & 0x3;
		if (11 == i_1_)
			i = 3 + i & 0x3;
		return i;
	}

	static final void method5186(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_3_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_4_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		Class73 class73 = ((Class73) Class207.aClass34_Sub22_2244.method70(i_4_, (byte) -24));
		if (class73.method1128((byte) 121))
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = ((ItemDecoder) Class111.aClass34_Sub13_1391.method70(i_3_, (byte) 48)).method512(i_4_, class73.aString805, 599123255);
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (((ItemDecoder) Class111.aClass34_Sub13_1391.method70(i_3_, (byte) -34)).method510(i_4_, 1566477951 * class73.anInt803, (byte) 116));
	}

	static final void method5187(Class668 class668, int i) {
		Class54.method943((byte) 110);
	}

	public static void method5188(int i) {
		Class247_Sub1.aClass143_9969 = null;
		Class640.aClass143_8311 = null;
		Class536_Sub5.aClass143_10418 = null;
		Class323.aClass143_3550 = null;
		Class106.aClass143_1275 = null;
		Class472.aClass143_5369 = null;
		Class204.aClass143_2234 = null;
		Class662.aClass143_8514 = null;
		Class642.aClass184_8333 = null;
		Class287.aClass2_3209 = null;
	}

	static boolean method5189(int i, short i_5_) {
		if (i == 18 || i == 19 || i == 20 || 21 == i || i == 22 || 1004 == i)
			return true;
		if (i == 17)
			return true;
		return false;
	}
}
