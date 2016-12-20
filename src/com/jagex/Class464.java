/* Class464 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class464 {
	public static Class464 aClass464_5291;
	public int anInt5292;
	public static Class464 aClass464_5293 = new Class464(0);
	public static Class464 aClass464_5294 = new Class464(1);
	public static Class464 aClass464_5295;
	static Class464 aClass464_5296;
	static Class464 aClass464_5297;
	static Class464 aClass464_5298;
	static Class464 aClass464_5299;
	public static Class464 aClass464_5300 = new Class464(2);

	static {
		aClass464_5295 = new Class464(3);
		aClass464_5291 = new Class464(4);
		aClass464_5296 = new Class464(5);
		aClass464_5297 = new Class464(6);
		aClass464_5298 = new Class464(7);
		aClass464_5299 = new Class464(8);
	}

	Class464(int i) {
		anInt5292 = i * 1844832559;
	}

	static final void method7628(Class665 class665, int i) {
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub37_10637, (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]), 1737883038);
		Class535.method8982(Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(389223577), false, 2038795974);
		Class631.method10465(-2096797097);
	}

	public static int method7629(CharSequence charsequence, int i, int i_0_, byte[] is, int i_1_, byte i_2_) {
		int i_3_ = i_0_ - i;
		for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
			char c = charsequence.charAt(i_4_ + i);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				is[i_4_ + i_1_] = (byte) c;
			else if (c == '\u20ac')
				is[i_1_ + i_4_] = (byte) -128;
			else if (c == '\u201a')
				is[i_4_ + i_1_] = (byte) -126;
			else if ('\u0192' == c)
				is[i_4_ + i_1_] = (byte) -125;
			else if (c == '\u201e')
				is[i_4_ + i_1_] = (byte) -124;
			else if (c == '\u2026')
				is[i_4_ + i_1_] = (byte) -123;
			else if (c == '\u2020')
				is[i_4_ + i_1_] = (byte) -122;
			else if ('\u2021' == c)
				is[i_1_ + i_4_] = (byte) -121;
			else if ('\u02c6' == c)
				is[i_4_ + i_1_] = (byte) -120;
			else if ('\u2030' == c)
				is[i_1_ + i_4_] = (byte) -119;
			else if ('\u0160' == c)
				is[i_4_ + i_1_] = (byte) -118;
			else if ('\u2039' == c)
				is[i_4_ + i_1_] = (byte) -117;
			else if ('\u0152' == c)
				is[i_4_ + i_1_] = (byte) -116;
			else if ('\u017d' == c)
				is[i_1_ + i_4_] = (byte) -114;
			else if (c == '\u2018')
				is[i_4_ + i_1_] = (byte) -111;
			else if ('\u2019' == c)
				is[i_1_ + i_4_] = (byte) -110;
			else if ('\u201c' == c)
				is[i_4_ + i_1_] = (byte) -109;
			else if (c == '\u201d')
				is[i_1_ + i_4_] = (byte) -108;
			else if ('\u2022' == c)
				is[i_1_ + i_4_] = (byte) -107;
			else if ('\u2013' == c)
				is[i_4_ + i_1_] = (byte) -106;
			else if ('\u2014' == c)
				is[i_1_ + i_4_] = (byte) -105;
			else if (c == '\u02dc')
				is[i_4_ + i_1_] = (byte) -104;
			else if ('\u2122' == c)
				is[i_4_ + i_1_] = (byte) -103;
			else if (c == '\u0161')
				is[i_4_ + i_1_] = (byte) -102;
			else if ('\u203a' == c)
				is[i_1_ + i_4_] = (byte) -101;
			else if ('\u0153' == c)
				is[i_4_ + i_1_] = (byte) -100;
			else if (c == '\u017e')
				is[i_1_ + i_4_] = (byte) -98;
			else if ('\u0178' == c)
				is[i_1_ + i_4_] = (byte) -97;
			else
				is[i_4_ + i_1_] = (byte) 63;
		}
		return i_3_;
	}

	static final void method7630(Class665 class665, short i) {
		class665.anInt8526 -= 204761682;
		int i_5_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_6_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class335.method5879(i_5_, i_6_, false, -1804367000);
	}

	public static Class604_Sub1 method7631(int i) {
		if (1306745497 * Class3.anInt40 < Class3.aClass604_Sub1Array31.length)
			return (Class3.aClass604_Sub1Array31[(Class3.anInt40 += 972708265) * 1306745497 - 1]);
		return null;
	}
}
