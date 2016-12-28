/* Class580 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class580 {
	int anInt7691;
	int anInt7692;
	int anInt7693;
	int anInt7694;
	public static Class34_Sub19 aClass34_Sub19_7695;

	Class580(int i, int i_0_, int i_1_, int i_2_) {
		anInt7693 = 702260283 * i;
		anInt7692 = 71091087 * i_0_;
		anInt7691 = 925700409 * i_1_;
		anInt7694 = -869023817 * i_2_;
	}

	public static int method7012(int i, int i_3_, int i_4_, int i_5_) {
		i_4_ &= 0x3;
		if (0 == i_4_)
			return i;
		if (1 == i_4_)
			return i_3_;
		if (2 == i_4_)
			return 4095 - i;
		return 4095 - i_3_;
	}

	public static void method7013(int i) {
		Class626.aClass4_8165 = new Class4(8);
		Class626.anInt8166 = 0;
		Iterator iterator = Class626.aList8161.iterator();
		while (iterator.hasNext()) {
			Class627 class627 = (Class627) iterator.next();
			class627.method7468();
		}
	}

	static Class302 method7014(int i, byte i_6_) {
		if (i == Class302.aClass302_3402.anInt3403 * -2102067219)
			return Class302.aClass302_3402;
		if (i == Class302.aClass302_3404.anInt3403 * -2102067219)
			return Class302.aClass302_3404;
		if (i == Class302.aClass302_3401.anInt3403 * -2102067219)
			return Class302.aClass302_3401;
		return null;
	}

	static String method7015(String string, int i) {
		String string_7_ = null;
		int i_8_ = string.indexOf("--> ");
		if (i_8_ >= 0) {
			string_7_ = string.substring(0, i_8_ + 4);
			string = string.substring(4 + i_8_);
		}
		int i_9_ = -1;
		if (string.startsWith("directlogin "))
			i_9_ = string.indexOf(" ", "directlogin ".length());
		if (i_9_ >= 0) {
			int i_10_ = string.length();
			string = new StringBuilder().append(string.substring(0, i_9_)).append(" ").toString();
			for (int i_11_ = i_9_ + 1; i_11_ < i_10_; i_11_++)
				string = new StringBuilder().append(string).append("*").toString();
		}
		if (string_7_ != null)
			return new StringBuilder().append(string_7_).append(string).toString();
		return string;
	}

	static final void method7016(Class668 class668, byte i) {
		int i_12_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.method3678(i_12_, -689214737);
		Class656.method7944(class251, class668, -1329991286);
	}

	static final void method7017(Class668 class668, int i) {
		int i_13_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub23_10774.method8348(i_13_, -1102005131);
	}

	static void method7018(int i) {
		/* empty */
	}
}
