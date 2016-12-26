/* Class417 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class417 {
	public static final int anInt4558 = 1;
	public static final int anInt4559 = 876;

	Class417() throws Throwable {
		throw new Error();
	}

	static final void method5035(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class536_Sub18_Sub14 class536_sub18_sub14 = Class682.method8090(532675698);
		if (null != class536_sub18_sub14) {
			boolean bool = class536_sub18_sub14.method10769(i_0_ >> 14 & 0x3fff, i_0_ & 0x3fff, Class685.anIntArray8657, -1100148889);
			if (bool) {
				class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class685.anIntArray8657[1];
				class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class685.anIntArray8657[2];
			} else {
				class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
				class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
			}
		} else {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
		}
	}

	static final void method5036(Class668 class668, int i) {
		Class629.method7501(-1535550516);
	}

	public static boolean method5037(String string, int i) {
		if (null == string)
			return false;
		for (int i_1_ = 0; i_1_ < client.anInt11288 * 142551095; i_1_++) {
			if (string.equalsIgnoreCase(client.aClass31Array11291[i_1_].aString266))
				return true;
		}
		if (string.equalsIgnoreCase(Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.username))
			return true;
		return false;
	}

	static final void method5038(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class535.aClass147_7131 != null ? 1 : 0;
	}
}
