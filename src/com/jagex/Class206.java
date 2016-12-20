/* Class206 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class206 {
	static Class206 aClass206_2220;
	static Class206 aClass206_2221;
	public static Class206 aClass206_2222;
	static Class206 aClass206_2223;
	static Class206 aClass206_2224;
	static Class206 aClass206_2225;
	static Class206 aClass206_2226;
	static Class206 aClass206_2227;
	public static Class206 aClass206_2228 = new Class206(5);
	static Class206 aClass206_2229;
	int anInt2230;
	static Class527_Sub8_Sub7 aClass527_Sub8_Sub7_2231;

	public int method3835() {
		return 0x2000000 | -320138467 * anInt2230;
	}

	public int method3836(int i) {
		return 0x2000000 | -320138467 * anInt2230;
	}

	Class206(int i) {
		anInt2230 = 782780213 * i;
	}

	public int method3837() {
		return 0x2000000 | -320138467 * anInt2230;
	}

	static {
		aClass206_2220 = new Class206(2);
		aClass206_2222 = new Class206(6);
		aClass206_2223 = new Class206(7);
		aClass206_2221 = new Class206(1);
		aClass206_2225 = new Class206(3);
		aClass206_2226 = new Class206(9);
		aClass206_2227 = new Class206(0);
		aClass206_2224 = new Class206(8);
		aClass206_2229 = new Class206(4);
	}

	static final void method3838(Class665 class665, byte i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_0_, -972997634);
		Class240 class240 = Class183.aClass240Array2100[i_0_ >> 16];
		Class373.method6377(class243, class240, class665, (byte) -38);
	}

	static final void method3839(Class243 class243, Class240 class240, Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		int[] is = Class606.method10056(string, class665, 1754754354);
		if (is != null)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2619 = Class103.method1800(string, class665, (byte) -99);
		class243.anIntArray2592 = is;
		class243.aBool2606 = true;
	}

	static final void method3840(Class665 class665, int i) {
		int i_1_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_1_, -1184772712);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class243.anInt2545 * -1768842777;
	}
}
