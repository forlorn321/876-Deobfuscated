/* Class509 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.applet.Applet;

import com.jagex.twitchtv.TwitchTV;

public class Class509 {
	static final int anInt6918 = 3;
	static String aString6919;
	static final int anInt6920 = 0;
	public static final int anInt6921 = 1;
	static final int anInt6922 = 2;
	static Applet anApplet6923 = null;

	static {
		aString6919 = null;
	}

	Class509() throws Throwable {
		throw new Error();
	}

	static int method6179(int i) {
		try {
			for (int i_0_ = 0; i_0_ < Class575.aStringArray7650.length; i_0_++) {
				if (Class575.aStringArray7650[i_0_] != null && Class575.aBoolArray7660[i_0_])
					Class114.method1481((byte) 63).method391(Class575.aStringArray7650[i_0_], 485887217);
			}
		} catch (Exception_Sub6 exception_sub6) {
			return 3;
		}
		Class536_Sub42.aTwitchTV10811 = new TwitchTV();
		int i_1_ = Class536_Sub42.aTwitchTV10811.InitialiseTTV(Class237.method3354((byte) -125));
		if (i_1_ == 0)
			Class575.aBool7662 = true;
		else
			Class81.method1165(new StringBuilder().append(10).append(Class40.aString491).append(i_1_).toString(), new RuntimeException(), (byte) 6);
		return 2;
	}

	static final void method6180(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class251.fontId * 2003514143;
	}

	static final void method6181(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	static void method6182(Class668 class668, byte i) {
		class668.anIntArray8541[1867269829 * class668.anInt8542 - 2] = (((Class277) Class38.aClass53_Sub2_481.method70((class668.anIntArray8541[((1867269829 * class668.anInt8542) - 2)]), (byte) -3)).anIntArrayArray3037[class668.anIntArray8541[class668.anInt8542 * 1867269829 - 1]][0]);
		class668.anInt8542 -= -1411037171;
	}
}
