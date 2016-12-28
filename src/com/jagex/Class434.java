/* Class434 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class434 {
	public static final int anInt4839 = 3;
	public static final int anInt4840 = 1;
	public static final int anInt4841 = 4;
	public static final int anInt4842 = 6;
	public static final int anInt4843 = 5;
	public static final int anInt4844 = 2;
	static int anInt4845;

	Class434() throws Throwable {
		throw new Error();
	}

	static final void method5232(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class198.method2873(class251, class234, class668, ((class668.aClass536_Sub15_8553 == Class646.aClass536_Sub15_8361) ? Class233.aClass233_2372 : Class233.aClass233_2369), (byte) -26);
	}

	static final void method5233(IComponentDefinitions class251, Class234 class234, Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		int[] is = Class510.method6183(string, class668, -1362720412);
		if (null != is)
			string = string.substring(0, string.length() - 1);
		class251.onInvTransmitHook = Class33.method796(string, class668, (short) -16785);
		class251.invTransmitList = is;
		class251.hasComponentHook = true;
	}

	static final void method5234(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.aShort11275;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.aShort11276;
	}

	static final void method5235(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (i_0_ > 255 || i_0_ < 0)
			i_0_ = 0;
		if (i_0_ != ClientSetting.aClass536_Sub40_8843.loadingScreenTypeSetting.method10186(-965046076)) {
			ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.loadingScreenTypeSetting), i_0_, (byte) 1);
			Class27.method763(2018089425);
			client.aBool11015 = false;
		}
	}

	static final void method5236(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1330526743 * class668.aClass350_8563.anInt3718;
	}

	static final void method5237(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_1_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_2_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_1_ / i_2_;
	}
}
