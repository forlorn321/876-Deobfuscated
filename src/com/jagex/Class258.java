/* Class258 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class258 implements Interface6 {
	Class459 aClass459_2825;
	Class205 aClass205_2826;
	public static Class24_Sub2 aClass24_Sub2_2827;

	Class258(Class459 class459, int i) {
		aClass459_2825 = class459;
		aClass205_2826 = new Class205(i);
	}

	static void method4741(int i) {
		Class66.aClass296_Sub1_760 = null;
		Class66.aBool758 = false;
	}

	static final void method4742(Class665 class665, int i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_0_, 2106519094);
		Class240 class240 = Class183.aClass240Array2100[i_0_ >> 16];
		Class160.method2581(class243, class240, class665, -1124314678);
	}

	public static void method4743(int i, String string, boolean bool, byte i_1_) {
		if (Class144.method2386(-10685197)) {
			if (-1552456759 * Class32.anInt274 != i)
				Class32.aLong321 = -2730100241404364287L;
			Class32.anInt274 = i * -1833818503;
			Class32.aString318 = string;
			Class32.aBool271 = bool;
			client.aClass109_11066.method1968((byte) 122);
			Class78.method1560(1, (byte) 0);
		}
	}

	public static Interface70 method4744(Class459 class459, int i, Interface71 interface71, boolean bool, Class205 class205, int i_2_) {
		if (Class649.aClass358_8371 != null) {
			if (bool)
				return new Class606(class459, i, Class649.aClass358_8371, interface71);
			return new Class608(class459, i, Class649.aClass358_8371, interface71, class205);
		}
		return null;
	}
}
