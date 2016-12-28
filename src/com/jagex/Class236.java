/* Class236 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;

public class Class236 implements Interface75 {
	int anInt2386;
	int anInt2387;
	static Class236 aClass236_2388;
	static Class236 aClass236_2389;
	static Class236 aClass236_2390;
	static Class236 aClass236_2391;
	static Class236 aClass236_2392;
	static Class236 aClass236_2393;
	static Class236 aClass236_2394;
	static Class236 aClass236_2395;
	static Class236 aClass236_2396;
	static Class236 aClass236_2397;
	static Class236 aClass236_2398 = new Class236(1, 100);
	static Class236 aClass236_2399;
	static Class236 aClass236_2400;
	static Class236 aClass236_2401;
	static Class236 aClass236_2402;
	static Class236 aClass236_2403;
	static Class236 aClass236_2404;
	static Class236 aClass236_2405;

	static {
		aClass236_2388 = new Class236(9, 101);
		aClass236_2405 = new Class236(3, 102);
		aClass236_2389 = new Class236(16, 103);
		aClass236_2390 = new Class236(5, 104);
		aClass236_2391 = new Class236(7, 105);
		aClass236_2392 = new Class236(12, 106);
		aClass236_2393 = new Class236(4, 107);
		aClass236_2402 = new Class236(13, 108);
		aClass236_2395 = new Class236(10, 109);
		aClass236_2396 = new Class236(11, 110);
		aClass236_2397 = new Class236(14, 111);
		aClass236_2394 = new Class236(2, 112);
		aClass236_2399 = new Class236(17, 113);
		aClass236_2400 = new Class236(6, 114);
		aClass236_2403 = new Class236(15, 115);
		aClass236_2401 = new Class236(0, 116);
		aClass236_2404 = new Class236(8, 117);
	}

	public int method78() {
		return anInt2387 * 701149371;
	}

	public int method12() {
		return anInt2387 * 701149371;
	}

	Class236(int i, int i_0_) {
		anInt2386 = -1482608421 * i;
		anInt2387 = -869526413 * i_0_;
	}

	public int method73() {
		return anInt2387 * 701149371;
	}

	public static void method3342(int[] is, float[] fs, float[] fs_1_, int i) {
		JS5ConfigGroup.method7828(is, fs, fs_1_, 0, is.length - 1, (byte) 89);
	}

	static void method3343(Class668 class668, int i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		TwitchWebcamDevice twitchwebcamdevice = Class484.method5843(i_2_, -1482648078);
		if (twitchwebcamdevice == null) {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
		} else {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1043008323 * twitchwebcamdevice.anInt1127;
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = twitchwebcamdevice.aString1125;
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = twitchwebcamdevice.aString1126;
		}
	}

	public static void method3344(int i, String string, int i_3_, int i_4_) {
		Class536_Sub18_Sub16 class536_sub18_sub16 = Class221.method3108(Class570.aClass570_7617, i, -1, (byte) -36);
		if (class536_sub18_sub16 != null) {
			Class668 class668 = Class586.method7063((byte) 5);
			class668.anIntArray8550 = new int[class536_sub18_sub16.anInt11795 * 520600665];
			class668.anObjectArray8561 = new String[1265663029 * class536_sub18_sub16.anInt11799];
			class668.anObjectArray8561[0] = string;
			class668.anIntArray8550[0] = i_3_;
			Class198.method2876(class536_sub18_sub16, 500000, class668, -453833608);
		}
	}

	static final void method3345(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		class668.anInt8542 -= -1225469822;
		byte[] is = null;
		byte[] is_5_ = null;
		int i_6_;
		for (i_6_ = 0; i_6_ < 10 && (class668.anIntArray8541[i_6_ + class668.anInt8542 * 1867269829]) >= 0; i_6_ += 2) {
			/* empty */
		}
		if (i_6_ > 0) {
			is = new byte[i_6_ / 2];
			is_5_ = new byte[i_6_ / 2];
			for (i_6_ -= 2; i_6_ >= 0; i_6_ -= 2) {
				is[i_6_ / 2] = (byte) (class668.anIntArray8541[i_6_ + 1867269829 * class668.anInt8542]);
				is_5_[i_6_ / 2] = (byte) (class668.anIntArray8541[1 + (1867269829 * class668.anInt8542 + i_6_)]);
			}
		}
		Class386.method4844(class251, is, is_5_, class668, 716267437);
	}

	static final void method3346(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		Class184_Sub2.aClass211_9442.method3010((class668.anIntArray8541[(1867269829 * class668.anInt8542)]), 255, -256790022);
	}

	static final void method3347(Class668 class668, int i) {
		Class315_Sub1_Sub1.method10554(Class536_Sub16.method9519(559868420), class668, (byte) -91);
	}

	static final void method3348(Class668 class668, int i) {
		int i_7_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class319_Sub1.method9135(i_7_ >> 14 & 0x3fff, i_7_ & 0x3fff, 153495778);
	}

	static final void method3349(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_8_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		boolean bool = (class668.anIntArray8541[1 + class668.anInt8542 * 1867269829] == 1);
		Class709.method8344(i_8_, string, bool, (byte) -121);
	}

	static Class601[] method3350(int i) {
		return (new Class601[] { Class601.aClass601_7851, Class601.aClass601_7850, Class601.aClass601_7852 });
	}

	static final void method3351(Class668 class668, int i) {
		class668.anInt8546 -= 1792517805;
	}
}
