/* Class28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Random;

public class Class28 {
	static Class472 aClass472_253 = new Class472(16, Class456.aClass456_5156);
	public static int[] anIntArray254;
	static int anInt255;
	static final int anInt256 = 12;
	public static int[] anIntArray257;
	public static int anInt258;
	static Class143[] aClass143Array259;
	public static int anInt260;

	static final void method764(Class668 class668, byte i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = new StringBuilder().append(string).append(i_0_).toString();
	}

	public static void method765(int i, int i_1_, int i_2_) {
		if (1394024703 * anInt258 != i) {
			anIntArray254 = new int[i];
			for (int i_3_ = 0; i_3_ < i; i_3_++)
				anIntArray254[i_3_] = (i_3_ << 12) / i;
			anInt258 = i * 1504173823;
		}
		if (i_1_ != anInt255 * 1399945409) {
			if (anInt258 * 1394024703 != i_1_) {
				anIntArray257 = new int[i_1_];
				for (int i_4_ = 0; i_4_ < i_1_; i_4_++)
					anIntArray257[i_4_] = (i_4_ << 12) / i_1_;
			} else
				anIntArray257 = anIntArray254;
			anInt255 = i_1_ * 85399361;
		}
	}

	public static byte[] method766(int i, int i_5_) {
		byte[] is = ((byte[]) aClass472_253.method5723(Integer.valueOf(i), (byte) 107));
		if (is == null) {
			is = new byte[512];
			Random random = new Random((long) i);
			for (int i_6_ = 0; i_6_ < 255; i_6_++)
				is[i_6_] = (byte) i_6_;
			for (int i_7_ = 0; i_7_ < 255; i_7_++) {
				int i_8_ = 255 - i_7_;
				int i_9_ = Class147.method1815(random, i_8_, (byte) 65);
				byte i_10_ = is[i_9_];
				is[i_9_] = is[i_8_];
				is[i_8_] = is[511 - i_7_] = i_10_;
			}
			aClass472_253.method5722(Integer.valueOf(i), is, (byte) 79);
		}
		return is;
	}

	Class28() throws Throwable {
		throw new Error();
	}

	public static byte[] method767(int i) {
		byte[] is = (byte[]) aClass472_253.method5723(Integer.valueOf(i), (byte) 94);
		if (is == null) {
			is = new byte[512];
			Random random = new Random((long) i);
			for (int i_11_ = 0; i_11_ < 255; i_11_++)
				is[i_11_] = (byte) i_11_;
			for (int i_12_ = 0; i_12_ < 255; i_12_++) {
				int i_13_ = 255 - i_12_;
				int i_14_ = Class147.method1815(random, i_13_, (byte) 51);
				byte i_15_ = is[i_14_];
				is[i_14_] = is[i_13_];
				is[i_13_] = is[511 - i_12_] = i_15_;
			}
			aClass472_253.method5722(Integer.valueOf(i), is, (byte) 55);
		}
		return is;
	}

	public static void method768(int i, int i_16_) {
		if (1394024703 * anInt258 != i) {
			anIntArray254 = new int[i];
			for (int i_17_ = 0; i_17_ < i; i_17_++)
				anIntArray254[i_17_] = (i_17_ << 12) / i;
			anInt258 = i * 1504173823;
		}
		if (i_16_ != anInt255 * 1399945409) {
			if (anInt258 * 1394024703 != i_16_) {
				anIntArray257 = new int[i_16_];
				for (int i_18_ = 0; i_18_ < i_16_; i_18_++)
					anIntArray257[i_18_] = (i_18_ << 12) / i_16_;
			} else
				anIntArray257 = anIntArray254;
			anInt255 = i_16_ * 85399361;
		}
	}

	public static byte[] method769(int i) {
		byte[] is = (byte[]) aClass472_253.method5723(Integer.valueOf(i), (byte) 82);
		if (is == null) {
			is = new byte[512];
			Random random = new Random((long) i);
			for (int i_19_ = 0; i_19_ < 255; i_19_++)
				is[i_19_] = (byte) i_19_;
			for (int i_20_ = 0; i_20_ < 255; i_20_++) {
				int i_21_ = 255 - i_20_;
				int i_22_ = Class147.method1815(random, i_21_, (byte) -105);
				byte i_23_ = is[i_22_];
				is[i_22_] = is[i_21_];
				is[i_21_] = is[511 - i_20_] = i_23_;
			}
			aClass472_253.method5722(Integer.valueOf(i), is, (byte) 112);
		}
		return is;
	}

	public static void method770(int i, short i_24_) {
		if (11 == client.anInt11101 * -708374433) {
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4408, client.aClass106_11218.aClass15_1258, 1872912713);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(i);
			client.aClass106_11218.method1409(class536_sub23, -412368918);
		}
	}

	static final void method771(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		InterfaceDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class349.method4593(class251, class234, class668, 1980884312);
	}

	public static void method772(int i, int i_25_) {
		if (1394024703 * anInt258 != i) {
			anIntArray254 = new int[i];
			for (int i_26_ = 0; i_26_ < i; i_26_++)
				anIntArray254[i_26_] = (i_26_ << 12) / i;
			anInt258 = i * 1504173823;
		}
		if (i_25_ != anInt255 * 1399945409) {
			if (anInt258 * 1394024703 != i_25_) {
				anIntArray257 = new int[i_25_];
				for (int i_27_ = 0; i_27_ < i_25_; i_27_++)
					anIntArray257[i_27_] = (i_27_ << 12) / i_25_;
			} else
				anIntArray257 = anIntArray254;
			anInt255 = i_25_ * 85399361;
		}
	}
}
