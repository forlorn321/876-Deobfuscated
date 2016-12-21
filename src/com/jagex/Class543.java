/* Class543 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class543 {
	public int anInt7234;
	public int[] anIntArray7235;
	public int[] anIntArray7236;

	public Class543(int i) {
		anInt7234 = i * -1355569915;
		anIntArray7235 = new int[anInt7234 * -1605869619];
		anIntArray7236 = new int[anInt7234 * -1605869619];
	}

	static final void method6580(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_0_, -689214737);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 223822141 * class251.anInt2574;
	}

	public static byte method6581(char c, int i) {
		byte i_1_;
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
			i_1_ = (byte) c;
		else if ('\u20ac' == c)
			i_1_ = (byte) -128;
		else if (c == '\u201a')
			i_1_ = (byte) -126;
		else if (c == '\u0192')
			i_1_ = (byte) -125;
		else if ('\u201e' == c)
			i_1_ = (byte) -124;
		else if (c == '\u2026')
			i_1_ = (byte) -123;
		else if (c == '\u2020')
			i_1_ = (byte) -122;
		else if ('\u2021' == c)
			i_1_ = (byte) -121;
		else if ('\u02c6' == c)
			i_1_ = (byte) -120;
		else if ('\u2030' == c)
			i_1_ = (byte) -119;
		else if ('\u0160' == c)
			i_1_ = (byte) -118;
		else if ('\u2039' == c)
			i_1_ = (byte) -117;
		else if (c == '\u0152')
			i_1_ = (byte) -116;
		else if ('\u017d' == c)
			i_1_ = (byte) -114;
		else if (c == '\u2018')
			i_1_ = (byte) -111;
		else if (c == '\u2019')
			i_1_ = (byte) -110;
		else if (c == '\u201c')
			i_1_ = (byte) -109;
		else if ('\u201d' == c)
			i_1_ = (byte) -108;
		else if (c == '\u2022')
			i_1_ = (byte) -107;
		else if ('\u2013' == c)
			i_1_ = (byte) -106;
		else if (c == '\u2014')
			i_1_ = (byte) -105;
		else if ('\u02dc' == c)
			i_1_ = (byte) -104;
		else if (c == '\u2122')
			i_1_ = (byte) -103;
		else if ('\u0161' == c)
			i_1_ = (byte) -102;
		else if ('\u203a' == c)
			i_1_ = (byte) -101;
		else if (c == '\u0153')
			i_1_ = (byte) -100;
		else if ('\u017e' == c)
			i_1_ = (byte) -98;
		else if ('\u0178' == c)
			i_1_ = (byte) -97;
		else
			i_1_ = (byte) 63;
		return i_1_;
	}

	static final void method6582(Class668 class668, short i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_2_ >> 14 & 0x3fff;
	}
}
