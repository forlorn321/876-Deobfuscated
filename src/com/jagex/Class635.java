/* Class635 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class635 {
	int[] anIntArray8266;
	static Class635 aClass635_8267 = new Class635();

	int method7550(int i, byte i_0_) {
		int i_1_ = 0;
		for (int i_2_ = 0; i_2_ < anIntArray8266.length && i >= anIntArray8266[i_2_]; i_2_++)
			i_1_ = 1 + i_2_;
		return i_1_;
	}

	Class635() {
		anIntArray8266 = new int[120];
		int i = 0;
		for (int i_3_ = 0; i_3_ < 120; i_3_++) {
			int i_4_ = 1 + i_3_;
			int i_5_ = (int) ((double) i_4_ + 300.0 * Math.pow(2.0, (double) i_4_ / 7.0));
			i += i_5_;
			anIntArray8266[i_3_] = i / 4;
		}
		method7551(1161474361);
	}

	final void method7551(int i) {
		for (int i_6_ = 1; i_6_ < anIntArray8266.length; i_6_++) {
			if (anIntArray8266[i_6_ - 1] < 0)
				throw new IllegalArgumentException(new StringBuilder().append("Negative XP at pos:").append(i_6_ - 1).toString());
			if (anIntArray8266[i_6_] < anIntArray8266[i_6_ - 1])
				throw new IllegalArgumentException(new StringBuilder().append("XP goes backwards at pos:").append(i_6_).toString());
		}
	}

	int method7552(int i, byte i_7_) {
		if (i < 1)
			return 0;
		if (i > anIntArray8266.length)
			i = anIntArray8266.length;
		return anIntArray8266[i - 1];
	}

	Class635(int[] is) {
		if (null == is)
			throw new NullPointerException();
		anIntArray8266 = is;
		method7551(-1873518215);
	}

	final void method7553() {
		for (int i = 1; i < anIntArray8266.length; i++) {
			if (anIntArray8266[i - 1] < 0)
				throw new IllegalArgumentException(new StringBuilder().append("Negative XP at pos:").append(i - 1).toString());
			if (anIntArray8266[i] < anIntArray8266[i - 1])
				throw new IllegalArgumentException(new StringBuilder().append("XP goes backwards at pos:").append(i).toString());
		}
	}

	int method7554(int i) {
		int i_8_ = 0;
		for (int i_9_ = 0; i_9_ < anIntArray8266.length && i >= anIntArray8266[i_9_]; i_9_++)
			i_8_ = 1 + i_9_;
		return i_8_;
	}

	int method7555(int i) {
		int i_10_ = 0;
		for (int i_11_ = 0; i_11_ < anIntArray8266.length && i >= anIntArray8266[i_11_]; i_11_++)
			i_10_ = 1 + i_11_;
		return i_10_;
	}

	final void method7556() {
		for (int i = 1; i < anIntArray8266.length; i++) {
			if (anIntArray8266[i - 1] < 0)
				throw new IllegalArgumentException(new StringBuilder().append("Negative XP at pos:").append(i - 1).toString());
			if (anIntArray8266[i] < anIntArray8266[i - 1])
				throw new IllegalArgumentException(new StringBuilder().append("XP goes backwards at pos:").append(i).toString());
		}
	}

	int method7557(int i) {
		int i_12_ = 0;
		for (int i_13_ = 0; i_13_ < anIntArray8266.length && i >= anIntArray8266[i_13_]; i_13_++)
			i_12_ = 1 + i_13_;
		return i_12_;
	}

	int method7558(int i) {
		if (i < 1)
			return 0;
		if (i > anIntArray8266.length)
			i = anIntArray8266.length;
		return anIntArray8266[i - 1];
	}

	int method7559(int i) {
		if (i < 1)
			return 0;
		if (i > anIntArray8266.length)
			i = anIntArray8266.length;
		return anIntArray8266[i - 1];
	}

	int method7560(int i) {
		if (i < 1)
			return 0;
		if (i > anIntArray8266.length)
			i = anIntArray8266.length;
		return anIntArray8266[i - 1];
	}

	static void method7561(byte i) {
		Class586.aClass106_7710.method1407(-280973396);
		Class586.aClass106_7710.byteBuffer.off = 0;
		Class586.aClass106_7710.aClass422_1270 = null;
		Class586.aClass106_7710.aClass422_1271 = null;
		Class586.aClass106_7710.aClass422_1274 = null;
		Class586.aClass106_7710.anInt1264 = 0;
		client.anInt11065 = 0;
		client.anInt11289 = 0;
		client.anInt11288 = 0;
		client.anInt11293 = 0;
		client.aString11137 = null;
		Class269.anInt2880 = 0;
		Class360_Sub1.aClass94Array10168 = null;
		Class50.aClass350_585 = null;
		Class256.aClass350_2762 = null;
		client.aBool11172 = true;
		Class260.method3615(1639875821);
		for (int i_14_ = 0; i_14_ < Class465_Sub1.aClass96_10352.aClass618Array1167.length; i_14_++) {
			Class618 class618 = new Class618(Class611.aClass602_7930.method7174(i_14_, (byte) 46), false);
			class618.method7380(0, (byte) -37);
			class618.method7376(0, 1454222899);
			Class465_Sub1.aClass96_10352.aClass618Array1167[i_14_] = class618;
		}
		Class465_Sub1.aClass96_10352.aClass610_1164.method7271(-1056104537);
		Class688_Sub3.method10358((byte) 0);
		Class30.method781(Class586.aClass106_7710, (byte) -35);
	}

	static final void method7562(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ClientSetting.aClass536_Sub40_8843.defaultToolkit.method10069(-1286425232) ? 1 : 0;
	}

	public static String method7563(int i, byte i_15_) {
		return new StringBuilder().append("<img=").append(i).append(">").toString();
	}

	public static void method7564(int i, int i_16_, String string, String string_17_, String string_18_, String string_19_, Class402 class402, int i_20_) {
		Class536_Sub18_Sub2.method10491(i, i_16_, string, string_17_, string_18_, string_19_, null, -1, class402, -321036105);
	}

	public static int method7565(Class461 class461, byte i) {
		int i_21_ = 0;
		if (class461.method5580(-96459827 * Class98_Sub1_Sub2.anInt11334, -964514165))
			i_21_++;
		if (class461.method5580(-468583255 * Class693.anInt8723, -964514165))
			i_21_++;
		if (class461.method5580(Class205_Sub5.anInt9870 * 590375313, -964514165))
			i_21_++;
		if (class461.method5580(-1246344865 * Class35.anInt293, -964514165))
			i_21_++;
		if (class461.method5580(1917064127 * Class389.anInt4047, -964514165))
			i_21_++;
		if (class461.method5580(Class35.anInt296 * -709600219, -964514165))
			i_21_++;
		if (class461.method5580(-850268363 * Class35.anInt299, -964514165))
			i_21_++;
		if (class461.method5580(157454897 * Class315_Sub1_Sub1.anInt11395, -964514165))
			i_21_++;
		if (class461.method5580(1355499421 * Class35.anInt297, -964514165))
			i_21_++;
		if (class461.method5580(1869435031 * Class662.anInt8513, -964514165))
			i_21_++;
		return i_21_;
	}
}
