/* Class667 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class667 {
	static char[] aCharArray8534 = { '\u20ac', '\0', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\0', '\u017d', '\0', '\0', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\0', '\u017e', '\u0178' };
	public static int anInt8535;

	public static boolean method8003(char c) {
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
			return true;
		if (c != 0) {
			char[] cs = aCharArray8534;
			for (int i = 0; i < cs.length; i++) {
				char c_0_ = cs[i];
				if (c_0_ == c)
					return true;
			}
		}
		return false;
	}

	public static boolean method8004(char c) {
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
			return true;
		if (c != 0) {
			char[] cs = aCharArray8534;
			for (int i = 0; i < cs.length; i++) {
				char c_1_ = cs[i];
				if (c_1_ == c)
					return true;
			}
		}
		return false;
	}

	Class667() throws Throwable {
		throw new Error();
	}

	static void method8005(int i) {
		Class18.aClass184_190 = null;
		Clan.aClass184_10488 = null;
		Class26.aClass184_248 = null;
		Class458_Sub5.aClass143Array10338 = null;
		Class688_Sub2_Sub1.aClass143Array11872 = null;
		Class610.aClass143Array7922 = null;
		Class28.aClass143Array259 = null;
		Class35.aClass143Array292 = null;
		Class195.aClass143Array2201 = null;
		Class618.aClass143_8090 = null;
		Class289.aClass143_3215 = null;
		Class62.aClass143Array701 = null;
	}
}
