/* Class399 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

import com.jagex.twitchtv.TwitchWebcamFrameData;

public class Class399 {
	static Class399 aClass399_4124;
	static Class399 aClass399_4125;
	static Class399 aClass399_4126 = new Class399();
	public static Canvas aCanvas4127;
	public static Class530 aClass530_4128;

	public int method4906(int i, int i_0_, int i_1_) {
		int i_2_ = (Class34_Sub6.anInt10965 * 589116499 > i_0_ ? Class34_Sub6.anInt10965 * 589116499 : i_0_);
		if (this == aClass399_4126)
			return 0;
		if (aClass399_4124 == this)
			return i_2_ - i;
		if (aClass399_4125 == this)
			return (i_2_ - i) / 2;
		return 0;
	}

	Class399() {
		/* empty */
	}

	static {
		aClass399_4125 = new Class399();
		aClass399_4124 = new Class399();
	}

	public int method4907(int i, int i_3_) {
		int i_4_ = (Class34_Sub6.anInt10965 * 589116499 > i_3_ ? Class34_Sub6.anInt10965 * 589116499 : i_3_);
		if (this == aClass399_4126)
			return 0;
		if (aClass399_4124 == this)
			return i_4_ - i;
		if (aClass399_4125 == this)
			return (i_4_ - i) / 2;
		return 0;
	}

	public int method4908(int i, int i_5_) {
		int i_6_ = (Class34_Sub6.anInt10965 * 589116499 > i_5_ ? Class34_Sub6.anInt10965 * 589116499 : i_5_);
		if (this == aClass399_4126)
			return 0;
		if (aClass399_4124 == this)
			return i_6_ - i;
		if (aClass399_4125 == this)
			return (i_6_ - i) / 2;
		return 0;
	}

	public static int method4909(int i, int i_7_, int i_8_) {
		Class575.aTwitchWebcamFrameData7651 = new TwitchWebcamFrameData();
		if (i < 0 || i >= Class575.aTwitchWebcamDeviceArray7674.length)
			return -1;
		return (Class536_Sub42.aTwitchTV10811.StartWebcamDevice((-270689935 * Class575.aTwitchWebcamDeviceArray7674[i].anInt1128), i_7_));
	}

	static final void method4910(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_9_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_10_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		Class273.method3730(9, i_9_, i_10_, "", -1653244104);
	}

	public static void method4911(int i, int i_11_, int i_12_) {
		Class552.anInt7416 = (i - Class542_Sub1.anInt7185) * -406038895;
		Class391.anInt4063 = -1712142967 * (i_11_ - Class542_Sub1.anInt7186);
		Class542_Sub1.anInt10706 = 1619839959;
		Class542_Sub1.anInt10707 = 636642145;
		Class455.method5480((byte) 119);
	}

	static final void method4912(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class668.aClass350_8563.aByte3708;
	}

	static final void method4913(Class668 class668, int i) {
		int i_13_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub20_10779.method8348(i_13_, -1102005131);
	}
}
