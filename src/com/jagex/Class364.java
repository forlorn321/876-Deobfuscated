/* Class364 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class364 {
	public static Class364 aClass364_3837 = new Class364();
	public static Class364 aClass364_3838 = new Class364();

	Class364() {
		/* empty */
	}

	static final void method4764(Class668 class668, short i) {
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.buildAreaSetting), (class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)]), (byte) 1);
		Class27.method763(1941946489);
		client.aBool11015 = false;
	}

	public static byte[] method4765(CharSequence charsequence, int i) {
		int i_0_ = charsequence.length();
		byte[] is = new byte[i_0_];
		for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
			char c = charsequence.charAt(i_1_);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				is[i_1_] = (byte) c;
			else if ('\u20ac' == c)
				is[i_1_] = (byte) -128;
			else if ('\u201a' == c)
				is[i_1_] = (byte) -126;
			else if ('\u0192' == c)
				is[i_1_] = (byte) -125;
			else if (c == '\u201e')
				is[i_1_] = (byte) -124;
			else if (c == '\u2026')
				is[i_1_] = (byte) -123;
			else if (c == '\u2020')
				is[i_1_] = (byte) -122;
			else if ('\u2021' == c)
				is[i_1_] = (byte) -121;
			else if (c == '\u02c6')
				is[i_1_] = (byte) -120;
			else if ('\u2030' == c)
				is[i_1_] = (byte) -119;
			else if (c == '\u0160')
				is[i_1_] = (byte) -118;
			else if (c == '\u2039')
				is[i_1_] = (byte) -117;
			else if ('\u0152' == c)
				is[i_1_] = (byte) -116;
			else if (c == '\u017d')
				is[i_1_] = (byte) -114;
			else if ('\u2018' == c)
				is[i_1_] = (byte) -111;
			else if (c == '\u2019')
				is[i_1_] = (byte) -110;
			else if ('\u201c' == c)
				is[i_1_] = (byte) -109;
			else if (c == '\u201d')
				is[i_1_] = (byte) -108;
			else if (c == '\u2022')
				is[i_1_] = (byte) -107;
			else if ('\u2013' == c)
				is[i_1_] = (byte) -106;
			else if (c == '\u2014')
				is[i_1_] = (byte) -105;
			else if ('\u02dc' == c)
				is[i_1_] = (byte) -104;
			else if ('\u2122' == c)
				is[i_1_] = (byte) -103;
			else if (c == '\u0161')
				is[i_1_] = (byte) -102;
			else if ('\u203a' == c)
				is[i_1_] = (byte) -101;
			else if ('\u0153' == c)
				is[i_1_] = (byte) -100;
			else if (c == '\u017e')
				is[i_1_] = (byte) -98;
			else if ('\u0178' == c)
				is[i_1_] = (byte) -97;
			else
				is[i_1_] = (byte) 63;
		}
		return is;
	}
}
