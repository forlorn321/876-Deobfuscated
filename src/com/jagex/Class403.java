/* Class403 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class403 {
	static final int anInt4151 = 13;
	static final int anInt4152 = 3;
	static final int anInt4153 = 4;
	static final int anInt4154 = 9;
	static final int anInt4155 = 10;
	static final int anInt4156 = 1;
	static final int anInt4157 = 11;
	static final int anInt4158 = 7;
	static final int anInt4159 = 12;
	static final int anInt4160 = 2;
	static final int anInt4161 = 5;
	static final int anInt4162 = 6;
	static final int anInt4163 = 8;
	public static int anInt4164;

	Class403() throws Throwable {
		throw new Error();
	}

	public static void method6539(boolean bool, boolean bool_0_, int i) {
		Class585.aBool7712 = bool;
		Class585.aBool7711 = bool_0_;
	}

	static final void method6540(Class243 class243, Class240 class240, Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_1_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_2_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		Class80 class80 = ((Class80) Class679.aClass24_Sub21_8628.method81(i_1_, -1814928923));
		if (i_2_ != 780718929 * class80.anInt804)
			class243.method4558(i_1_, i_2_, 987260711);
		else
			class243.method4581(i_1_, (short) 7039);
	}

	public static boolean method6541(int i, int i_3_) {
		return i == 0 || 2 == i;
	}

	static void method6542(int i) {
		if (1402258827 * Class107.anInt1338 > 0) {
			int i_4_ = 0;
			for (int i_5_ = 0; i_5_ < Class107.aStringArray1327.length; i_5_++) {
				if (Class107.aStringArray1327[i_5_].indexOf("--> ") != -1 && ++i_4_ == Class107.anInt1338 * 1402258827) {
					Class107.aString1337 = (Class107.aStringArray1327[i_5_].substring(Class107.aStringArray1327[i_5_].indexOf('>') + 2));
					break;
				}
			}
		} else
			Class107.aString1337 = "";
	}
}
