/* Class662 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class662 {
	static char[] aCharArray8515 = { '\u20ac', '\0', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\0', '\u017d', '\0', '\0', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\0', '\u017e', '\u0178' };

	public static boolean method11023(char c) {
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
			return true;
		if ('\0' != c) {
			char[] cs = aCharArray8515;
			for (int i = 0; i < cs.length; i++) {
				char c_0_ = cs[i];
				if (c_0_ == c)
					return true;
			}
		}
		return false;
	}

	public static byte method11024(char c) {
		byte i;
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
			i = (byte) c;
		else if ('\u20ac' == c)
			i = (byte) -128;
		else if ('\u201a' == c)
			i = (byte) -126;
		else if ('\u0192' == c)
			i = (byte) -125;
		else if (c == '\u201e')
			i = (byte) -124;
		else if ('\u2026' == c)
			i = (byte) -123;
		else if ('\u2020' == c)
			i = (byte) -122;
		else if ('\u2021' == c)
			i = (byte) -121;
		else if (c == '\u02c6')
			i = (byte) -120;
		else if ('\u2030' == c)
			i = (byte) -119;
		else if (c == '\u0160')
			i = (byte) -118;
		else if ('\u2039' == c)
			i = (byte) -117;
		else if (c == '\u0152')
			i = (byte) -116;
		else if (c == '\u017d')
			i = (byte) -114;
		else if (c == '\u2018')
			i = (byte) -111;
		else if (c == '\u2019')
			i = (byte) -110;
		else if (c == '\u201c')
			i = (byte) -109;
		else if (c == '\u201d')
			i = (byte) -108;
		else if (c == '\u2022')
			i = (byte) -107;
		else if (c == '\u2013')
			i = (byte) -106;
		else if ('\u2014' == c)
			i = (byte) -105;
		else if ('\u02dc' == c)
			i = (byte) -104;
		else if ('\u2122' == c)
			i = (byte) -103;
		else if ('\u0161' == c)
			i = (byte) -102;
		else if (c == '\u203a')
			i = (byte) -101;
		else if (c == '\u0153')
			i = (byte) -100;
		else if ('\u017e' == c)
			i = (byte) -98;
		else if (c == '\u0178')
			i = (byte) -97;
		else
			i = (byte) 63;
		return i;
	}

	public static String method11025(byte[] is) {
		return Class539.method9000(is, 0, is.length, -1816014994);
	}

	public static boolean method11026(char c) {
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
			return true;
		if ('\0' != c) {
			char[] cs = aCharArray8515;
			for (int i = 0; i < cs.length; i++) {
				char c_1_ = cs[i];
				if (c_1_ == c)
					return true;
			}
		}
		return false;
	}

	public static boolean method11027(char c) {
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
			return true;
		if ('\0' != c) {
			char[] cs = aCharArray8515;
			for (int i = 0; i < cs.length; i++) {
				char c_2_ = cs[i];
				if (c_2_ == c)
					return true;
			}
		}
		return false;
	}

	public static char method11028(byte i) {
		int i_3_ = i & 0xff;
		if (i_3_ == 0)
			throw new IllegalArgumentException(new StringBuilder().append("").append(Integer.toString(i_3_, 16)).toString());
		if (i_3_ >= 128 && i_3_ < 160) {
			int i_4_ = aCharArray8515[i_3_ - 128];
			if (i_4_ == 0)
				i_4_ = 63;
			i_3_ = i_4_;
		}
		return (char) i_3_;
	}

	public static char method11029(byte i) {
		int i_5_ = i & 0xff;
		if (i_5_ == 0)
			throw new IllegalArgumentException(new StringBuilder().append("").append(Integer.toString(i_5_, 16)).toString());
		if (i_5_ >= 128 && i_5_ < 160) {
			int i_6_ = aCharArray8515[i_5_ - 128];
			if (i_6_ == 0)
				i_6_ = 63;
			i_5_ = i_6_;
		}
		return (char) i_5_;
	}

	public static char method11030(byte i) {
		int i_7_ = i & 0xff;
		if (i_7_ == 0)
			throw new IllegalArgumentException(new StringBuilder().append("").append(Integer.toString(i_7_, 16)).toString());
		if (i_7_ >= 128 && i_7_ < 160) {
			int i_8_ = aCharArray8515[i_7_ - 128];
			if (i_8_ == 0)
				i_8_ = 63;
			i_7_ = i_8_;
		}
		return (char) i_7_;
	}

	Class662() throws Throwable {
		throw new Error();
	}

	public static byte[] method11031(CharSequence charsequence) {
		int i = charsequence.length();
		byte[] is = new byte[i];
		for (int i_9_ = 0; i_9_ < i; i_9_++) {
			char c = charsequence.charAt(i_9_);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				is[i_9_] = (byte) c;
			else if (c == '\u20ac')
				is[i_9_] = (byte) -128;
			else if ('\u201a' == c)
				is[i_9_] = (byte) -126;
			else if (c == '\u0192')
				is[i_9_] = (byte) -125;
			else if (c == '\u201e')
				is[i_9_] = (byte) -124;
			else if ('\u2026' == c)
				is[i_9_] = (byte) -123;
			else if ('\u2020' == c)
				is[i_9_] = (byte) -122;
			else if (c == '\u2021')
				is[i_9_] = (byte) -121;
			else if (c == '\u02c6')
				is[i_9_] = (byte) -120;
			else if (c == '\u2030')
				is[i_9_] = (byte) -119;
			else if (c == '\u0160')
				is[i_9_] = (byte) -118;
			else if ('\u2039' == c)
				is[i_9_] = (byte) -117;
			else if (c == '\u0152')
				is[i_9_] = (byte) -116;
			else if (c == '\u017d')
				is[i_9_] = (byte) -114;
			else if ('\u2018' == c)
				is[i_9_] = (byte) -111;
			else if ('\u2019' == c)
				is[i_9_] = (byte) -110;
			else if ('\u201c' == c)
				is[i_9_] = (byte) -109;
			else if (c == '\u201d')
				is[i_9_] = (byte) -108;
			else if (c == '\u2022')
				is[i_9_] = (byte) -107;
			else if ('\u2013' == c)
				is[i_9_] = (byte) -106;
			else if (c == '\u2014')
				is[i_9_] = (byte) -105;
			else if ('\u02dc' == c)
				is[i_9_] = (byte) -104;
			else if (c == '\u2122')
				is[i_9_] = (byte) -103;
			else if ('\u0161' == c)
				is[i_9_] = (byte) -102;
			else if ('\u203a' == c)
				is[i_9_] = (byte) -101;
			else if (c == '\u0153')
				is[i_9_] = (byte) -100;
			else if ('\u017e' == c)
				is[i_9_] = (byte) -98;
			else if (c == '\u0178')
				is[i_9_] = (byte) -97;
			else
				is[i_9_] = (byte) 63;
		}
		return is;
	}

	public static int method11032(CharSequence charsequence, int i, int i_10_, byte[] is, int i_11_) {
		int i_12_ = i_10_ - i;
		for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
			char c = charsequence.charAt(i_13_ + i);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				is[i_13_ + i_11_] = (byte) c;
			else if (c == '\u20ac')
				is[i_11_ + i_13_] = (byte) -128;
			else if (c == '\u201a')
				is[i_13_ + i_11_] = (byte) -126;
			else if ('\u0192' == c)
				is[i_13_ + i_11_] = (byte) -125;
			else if (c == '\u201e')
				is[i_13_ + i_11_] = (byte) -124;
			else if (c == '\u2026')
				is[i_13_ + i_11_] = (byte) -123;
			else if (c == '\u2020')
				is[i_13_ + i_11_] = (byte) -122;
			else if ('\u2021' == c)
				is[i_11_ + i_13_] = (byte) -121;
			else if ('\u02c6' == c)
				is[i_13_ + i_11_] = (byte) -120;
			else if ('\u2030' == c)
				is[i_11_ + i_13_] = (byte) -119;
			else if ('\u0160' == c)
				is[i_13_ + i_11_] = (byte) -118;
			else if ('\u2039' == c)
				is[i_13_ + i_11_] = (byte) -117;
			else if ('\u0152' == c)
				is[i_13_ + i_11_] = (byte) -116;
			else if ('\u017d' == c)
				is[i_11_ + i_13_] = (byte) -114;
			else if (c == '\u2018')
				is[i_13_ + i_11_] = (byte) -111;
			else if ('\u2019' == c)
				is[i_11_ + i_13_] = (byte) -110;
			else if ('\u201c' == c)
				is[i_13_ + i_11_] = (byte) -109;
			else if (c == '\u201d')
				is[i_11_ + i_13_] = (byte) -108;
			else if ('\u2022' == c)
				is[i_11_ + i_13_] = (byte) -107;
			else if ('\u2013' == c)
				is[i_13_ + i_11_] = (byte) -106;
			else if ('\u2014' == c)
				is[i_11_ + i_13_] = (byte) -105;
			else if (c == '\u02dc')
				is[i_13_ + i_11_] = (byte) -104;
			else if ('\u2122' == c)
				is[i_13_ + i_11_] = (byte) -103;
			else if (c == '\u0161')
				is[i_13_ + i_11_] = (byte) -102;
			else if ('\u203a' == c)
				is[i_11_ + i_13_] = (byte) -101;
			else if ('\u0153' == c)
				is[i_13_ + i_11_] = (byte) -100;
			else if (c == '\u017e')
				is[i_11_ + i_13_] = (byte) -98;
			else if ('\u0178' == c)
				is[i_11_ + i_13_] = (byte) -97;
			else
				is[i_13_ + i_11_] = (byte) 63;
		}
		return i_12_;
	}

	public static byte[] method11033(CharSequence charsequence) {
		int i = charsequence.length();
		byte[] is = new byte[i];
		for (int i_14_ = 0; i_14_ < i; i_14_++) {
			char c = charsequence.charAt(i_14_);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				is[i_14_] = (byte) c;
			else if (c == '\u20ac')
				is[i_14_] = (byte) -128;
			else if ('\u201a' == c)
				is[i_14_] = (byte) -126;
			else if (c == '\u0192')
				is[i_14_] = (byte) -125;
			else if (c == '\u201e')
				is[i_14_] = (byte) -124;
			else if ('\u2026' == c)
				is[i_14_] = (byte) -123;
			else if ('\u2020' == c)
				is[i_14_] = (byte) -122;
			else if (c == '\u2021')
				is[i_14_] = (byte) -121;
			else if (c == '\u02c6')
				is[i_14_] = (byte) -120;
			else if (c == '\u2030')
				is[i_14_] = (byte) -119;
			else if (c == '\u0160')
				is[i_14_] = (byte) -118;
			else if ('\u2039' == c)
				is[i_14_] = (byte) -117;
			else if (c == '\u0152')
				is[i_14_] = (byte) -116;
			else if (c == '\u017d')
				is[i_14_] = (byte) -114;
			else if ('\u2018' == c)
				is[i_14_] = (byte) -111;
			else if ('\u2019' == c)
				is[i_14_] = (byte) -110;
			else if ('\u201c' == c)
				is[i_14_] = (byte) -109;
			else if (c == '\u201d')
				is[i_14_] = (byte) -108;
			else if (c == '\u2022')
				is[i_14_] = (byte) -107;
			else if ('\u2013' == c)
				is[i_14_] = (byte) -106;
			else if (c == '\u2014')
				is[i_14_] = (byte) -105;
			else if ('\u02dc' == c)
				is[i_14_] = (byte) -104;
			else if (c == '\u2122')
				is[i_14_] = (byte) -103;
			else if ('\u0161' == c)
				is[i_14_] = (byte) -102;
			else if ('\u203a' == c)
				is[i_14_] = (byte) -101;
			else if (c == '\u0153')
				is[i_14_] = (byte) -100;
			else if ('\u017e' == c)
				is[i_14_] = (byte) -98;
			else if (c == '\u0178')
				is[i_14_] = (byte) -97;
			else
				is[i_14_] = (byte) 63;
		}
		return is;
	}

	public static String method11034(byte[] is) {
		return Class539.method9000(is, 0, is.length, -2049045087);
	}

	public static String method11035(byte[] is) {
		return Class539.method9000(is, 0, is.length, -1685366643);
	}

	public static String method11036(byte[] is) {
		return Class539.method9000(is, 0, is.length, -2095898090);
	}

	public static byte[] method11037(CharSequence charsequence) {
		int i = charsequence.length();
		byte[] is = new byte[i];
		for (int i_15_ = 0; i_15_ < i; i_15_++) {
			char c = charsequence.charAt(i_15_);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				is[i_15_] = (byte) c;
			else if (c == '\u20ac')
				is[i_15_] = (byte) -128;
			else if ('\u201a' == c)
				is[i_15_] = (byte) -126;
			else if (c == '\u0192')
				is[i_15_] = (byte) -125;
			else if (c == '\u201e')
				is[i_15_] = (byte) -124;
			else if ('\u2026' == c)
				is[i_15_] = (byte) -123;
			else if ('\u2020' == c)
				is[i_15_] = (byte) -122;
			else if (c == '\u2021')
				is[i_15_] = (byte) -121;
			else if (c == '\u02c6')
				is[i_15_] = (byte) -120;
			else if (c == '\u2030')
				is[i_15_] = (byte) -119;
			else if (c == '\u0160')
				is[i_15_] = (byte) -118;
			else if ('\u2039' == c)
				is[i_15_] = (byte) -117;
			else if (c == '\u0152')
				is[i_15_] = (byte) -116;
			else if (c == '\u017d')
				is[i_15_] = (byte) -114;
			else if ('\u2018' == c)
				is[i_15_] = (byte) -111;
			else if ('\u2019' == c)
				is[i_15_] = (byte) -110;
			else if ('\u201c' == c)
				is[i_15_] = (byte) -109;
			else if (c == '\u201d')
				is[i_15_] = (byte) -108;
			else if (c == '\u2022')
				is[i_15_] = (byte) -107;
			else if ('\u2013' == c)
				is[i_15_] = (byte) -106;
			else if (c == '\u2014')
				is[i_15_] = (byte) -105;
			else if ('\u02dc' == c)
				is[i_15_] = (byte) -104;
			else if (c == '\u2122')
				is[i_15_] = (byte) -103;
			else if ('\u0161' == c)
				is[i_15_] = (byte) -102;
			else if ('\u203a' == c)
				is[i_15_] = (byte) -101;
			else if (c == '\u0153')
				is[i_15_] = (byte) -100;
			else if ('\u017e' == c)
				is[i_15_] = (byte) -98;
			else if (c == '\u0178')
				is[i_15_] = (byte) -97;
			else
				is[i_15_] = (byte) 63;
		}
		return is;
	}
}
