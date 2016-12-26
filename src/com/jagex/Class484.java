/* Class484 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;

public class Class484 {
	RSByteBuffer aClass536_Sub33_5432;
	int anInt5433;
	int anInt5434;
	boolean aBool5435;
	Class492 this$0;
	protected static Class18[] aClass18Array5436;

	void method5841(int i) {
		if (aClass536_Sub33_5432 != null && !aBool5435)
			aClass536_Sub33_5432.method9685(120764410);
		anInt5434 = -31667017;
		anInt5433 = 728696753;
	}

	Class484(Class492 class492, RSByteBuffer class536_sub33, boolean bool) {
		this$0 = class492;
		aClass536_Sub33_5432 = class536_sub33;
		aBool5435 = bool;
		anInt5434 = -31667017;
		anInt5433 = 728696753;
	}

	void method5842() {
		if (aClass536_Sub33_5432 != null && !aBool5435)
			aClass536_Sub33_5432.method9685(120764410);
		anInt5434 = -31667017;
		anInt5433 = 728696753;
	}

	public static TwitchWebcamDevice method5843(int i, int i_0_) {
		if (null == Class575.aTwitchWebcamDeviceArray7674)
			return null;
		for (int i_1_ = 0; i_1_ < Class575.aTwitchWebcamDeviceArray7674.length; i_1_++) {
			if ((Class575.aTwitchWebcamDeviceArray7674[i_1_].anInt1127 * 1043008323) == i)
				return Class575.aTwitchWebcamDeviceArray7674[i_1_];
		}
		return null;
	}

	static final void method5844(Class668 class668, int i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		InterfaceDefinitions class251 = Class264.method3678(i_2_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_2_ >> 16];
		Class613.method7318(class251, class234, class668, -1219398736);
	}

	static final void method5845(InterfaceDefinitions class251, Class234 class234, Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class510.method6183(string, class668, -1176109845) != null)
			string = string.substring(0, string.length() - 1);
		class251.anObjectArray2709 = Class33.method796(string, class668, (short) 25599);
		class251.aBool2666 = true;
	}

	static final void method5846(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class329.aClass550_3601.method6656(-1986439438);
	}

	static final void method5847(Class668 class668, short i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		boolean bool = ((class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) == 1);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class467.method5692(string, bool, (byte) 1);
	}

	static final void method5848(Class668 class668, int i) {
		int i_3_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub9_10756.method8348(i_3_, -1102005131);
	}

	static final void method5849(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		InterfaceDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class400.method4918(class251, class234, class668, 428426270);
	}
}
