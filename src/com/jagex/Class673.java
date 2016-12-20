/* Class673 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class673 {
	public static int anInt8585;

	static char method13831(char c) {
		if ('\u00c6' == c)
			return 'E';
		if ('\u00e6' == c)
			return 'e';
		if (c == '\u00df')
			return 's';
		if (c == '\u0152')
			return 'E';
		if (c == '\u0153')
			return 'e';
		return '\0';
	}

	public static int method13832(CharSequence charsequence, CharSequence charsequence_0_, Class671 class671) {
		int i = charsequence.length();
		int i_1_ = charsequence_0_.length();
		int i_2_ = 0;
		int i_3_ = 0;
		char c = '\0';
		char c_4_ = '\0';
		while (i_2_ - c < i || i_3_ - c_4_ < i_1_) {
			if (i_2_ - c >= i)
				return -1;
			if (i_3_ - c_4_ >= i_1_)
				return 1;
			char c_5_;
			if (c != 0) {
				c_5_ = c;
				boolean bool = false;
			} else
				c_5_ = charsequence.charAt(i_2_++);
			char c_6_;
			if (c_4_ != 0) {
				c_6_ = c_4_;
				boolean bool = false;
			} else
				c_6_ = charsequence_0_.charAt(i_3_++);
			c = Class525.method8725(c_5_, -143282464);
			c_4_ = Class525.method8725(c_6_, 358624354);
			c_5_ = Class230.method4319(c_5_, class671, (byte) 52);
			c_6_ = Class230.method4319(c_6_, class671, (byte) 8);
			if (c_5_ != c_6_ && (Character.toUpperCase(c_5_) != Character.toUpperCase(c_6_))) {
				c_5_ = Character.toLowerCase(c_5_);
				c_6_ = Character.toLowerCase(c_6_);
				if (c_5_ != c_6_)
					return (Class179.method3072(c_5_, class671, -1450083643) - Class179.method3072(c_6_, class671, -1736885641));
			}
		}
		int i_7_ = Math.min(i, i_1_);
		for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
			if (Class671.aClass671_8573 == class671) {
				i_2_ = i - 1 - i_8_;
				i_3_ = i_1_ - 1 - i_8_;
			} else
				i_2_ = i_3_ = i_8_;
			char c_9_ = charsequence.charAt(i_2_);
			char c_10_ = charsequence_0_.charAt(i_3_);
			if (c_10_ != c_9_ && (Character.toUpperCase(c_9_) != Character.toUpperCase(c_10_))) {
				c_9_ = Character.toLowerCase(c_9_);
				c_10_ = Character.toLowerCase(c_10_);
				if (c_9_ != c_10_)
					return (Class179.method3072(c_9_, class671, -1933241927) - Class179.method3072(c_10_, class671, -1114843090));
			}
		}
		int i_11_ = i - i_1_;
		if (0 != i_11_)
			return i_11_;
		for (int i_12_ = 0; i_12_ < i_7_; i_12_++) {
			char c_13_ = charsequence.charAt(i_12_);
			char c_14_ = charsequence_0_.charAt(i_12_);
			if (c_13_ != c_14_)
				return (Class179.method3072(c_13_, class671, -1182705620) - Class179.method3072(c_14_, class671, -895775738));
		}
		return 0;
	}

	static char method13833(char c, Class671 class671) {
		if (c >= '\u00c0' && c <= '\u00ff') {
			if (c >= '\u00c0' && c <= '\u00c6')
				return 'A';
			if (c == '\u00c7')
				return 'C';
			if (c >= '\u00c8' && c <= '\u00cb')
				return 'E';
			if (c >= '\u00cc' && c <= '\u00cf')
				return 'I';
			if ('\u00d1' == c && class671 != Class671.aClass671_8578)
				return 'N';
			if (c >= '\u00d2' && c <= '\u00d6')
				return 'O';
			if (c >= '\u00d9' && c <= '\u00dc')
				return 'U';
			if (c == '\u00dd')
				return 'Y';
			if ('\u00df' == c)
				return 's';
			if (c >= '\u00e0' && c <= '\u00e6')
				return 'a';
			if ('\u00e7' == c)
				return 'c';
			if (c >= '\u00e8' && c <= '\u00eb')
				return 'e';
			if (c >= '\u00ec' && c <= '\u00ef')
				return 'i';
			if (c == '\u00f1' && Class671.aClass671_8578 != class671)
				return 'n';
			if (c >= '\u00f2' && c <= '\u00f6')
				return 'o';
			if (c >= '\u00f9' && c <= '\u00fc')
				return 'u';
			if ('\u00fd' == c || '\u00ff' == c)
				return 'y';
		}
		if (c == '\u0152')
			return 'O';
		if ('\u0153' == c)
			return 'o';
		if (c == '\u0178')
			return 'Y';
		return c;
	}

	static char method13834(char c, Class671 class671) {
		if (c >= '\u00c0' && c <= '\u00ff') {
			if (c >= '\u00c0' && c <= '\u00c6')
				return 'A';
			if (c == '\u00c7')
				return 'C';
			if (c >= '\u00c8' && c <= '\u00cb')
				return 'E';
			if (c >= '\u00cc' && c <= '\u00cf')
				return 'I';
			if ('\u00d1' == c && class671 != Class671.aClass671_8578)
				return 'N';
			if (c >= '\u00d2' && c <= '\u00d6')
				return 'O';
			if (c >= '\u00d9' && c <= '\u00dc')
				return 'U';
			if (c == '\u00dd')
				return 'Y';
			if ('\u00df' == c)
				return 's';
			if (c >= '\u00e0' && c <= '\u00e6')
				return 'a';
			if ('\u00e7' == c)
				return 'c';
			if (c >= '\u00e8' && c <= '\u00eb')
				return 'e';
			if (c >= '\u00ec' && c <= '\u00ef')
				return 'i';
			if (c == '\u00f1' && Class671.aClass671_8578 != class671)
				return 'n';
			if (c >= '\u00f2' && c <= '\u00f6')
				return 'o';
			if (c >= '\u00f9' && c <= '\u00fc')
				return 'u';
			if ('\u00fd' == c || '\u00ff' == c)
				return 'y';
		}
		if (c == '\u0152')
			return 'O';
		if ('\u0153' == c)
			return 'o';
		if (c == '\u0178')
			return 'Y';
		return c;
	}

	Class673() throws Throwable {
		throw new Error();
	}

	static char method13835(char c, Class671 class671) {
		if (c >= '\u00c0' && c <= '\u00ff') {
			if (c >= '\u00c0' && c <= '\u00c6')
				return 'A';
			if (c == '\u00c7')
				return 'C';
			if (c >= '\u00c8' && c <= '\u00cb')
				return 'E';
			if (c >= '\u00cc' && c <= '\u00cf')
				return 'I';
			if ('\u00d1' == c && class671 != Class671.aClass671_8578)
				return 'N';
			if (c >= '\u00d2' && c <= '\u00d6')
				return 'O';
			if (c >= '\u00d9' && c <= '\u00dc')
				return 'U';
			if (c == '\u00dd')
				return 'Y';
			if ('\u00df' == c)
				return 's';
			if (c >= '\u00e0' && c <= '\u00e6')
				return 'a';
			if ('\u00e7' == c)
				return 'c';
			if (c >= '\u00e8' && c <= '\u00eb')
				return 'e';
			if (c >= '\u00ec' && c <= '\u00ef')
				return 'i';
			if (c == '\u00f1' && Class671.aClass671_8578 != class671)
				return 'n';
			if (c >= '\u00f2' && c <= '\u00f6')
				return 'o';
			if (c >= '\u00f9' && c <= '\u00fc')
				return 'u';
			if ('\u00fd' == c || '\u00ff' == c)
				return 'y';
		}
		if (c == '\u0152')
			return 'O';
		if ('\u0153' == c)
			return 'o';
		if (c == '\u0178')
			return 'Y';
		return c;
	}

	static char method13836(char c) {
		if ('\u00c6' == c)
			return 'E';
		if ('\u00e6' == c)
			return 'e';
		if (c == '\u00df')
			return 's';
		if (c == '\u0152')
			return 'E';
		if (c == '\u0153')
			return 'e';
		return '\0';
	}

	static int method13837(char c, Class671 class671) {
		int i = c << 4;
		if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
			c = Character.toLowerCase(c);
			i = 1 + (c << 4);
		}
		if (241 == c && Class671.aClass671_8578 == class671)
			i = 1762;
		return i;
	}

	public static String method13838(long l, int i, boolean bool, Class671 class671) {
		char c = ',';
		char c_15_ = '.';
		if (Class671.aClass671_8572 == class671) {
			c = '.';
			c_15_ = ',';
		}
		if (Class671.aClass671_8573 == class671)
			c_15_ = '\u00a0';
		boolean bool_16_ = false;
		if (l < 0L) {
			bool_16_ = true;
			l = -l;
		}
		StringBuilder stringbuilder = new StringBuilder(26);
		if (i > 0) {
			for (int i_17_ = 0; i_17_ < i; i_17_++) {
				int i_18_ = (int) l;
				l /= 10L;
				stringbuilder.append((char) (48 + i_18_ - (int) l * 10));
			}
			stringbuilder.append(c);
		}
		int i_19_ = 0;
		for (;;) {
			int i_20_ = (int) l;
			l /= 10L;
			stringbuilder.append((char) (i_20_ + 48 - (int) l * 10));
			if (l == 0L)
				break;
			if (bool) {
				i_19_++;
				if (0 == i_19_ % 3)
					stringbuilder.append(c_15_);
			}
		}
		if (bool_16_)
			stringbuilder.append('-');
		return stringbuilder.reverse().toString();
	}

	public static String method13839(long l, int i, boolean bool, Class671 class671) {
		char c = ',';
		char c_21_ = '.';
		if (Class671.aClass671_8572 == class671) {
			c = '.';
			c_21_ = ',';
		}
		if (Class671.aClass671_8573 == class671)
			c_21_ = '\u00a0';
		boolean bool_22_ = false;
		if (l < 0L) {
			bool_22_ = true;
			l = -l;
		}
		StringBuilder stringbuilder = new StringBuilder(26);
		if (i > 0) {
			for (int i_23_ = 0; i_23_ < i; i_23_++) {
				int i_24_ = (int) l;
				l /= 10L;
				stringbuilder.append((char) (48 + i_24_ - (int) l * 10));
			}
			stringbuilder.append(c);
		}
		int i_25_ = 0;
		for (;;) {
			int i_26_ = (int) l;
			l /= 10L;
			stringbuilder.append((char) (i_26_ + 48 - (int) l * 10));
			if (l == 0L)
				break;
			if (bool) {
				i_25_++;
				if (0 == i_25_ % 3)
					stringbuilder.append(c_21_);
			}
		}
		if (bool_22_)
			stringbuilder.append('-');
		return stringbuilder.reverse().toString();
	}

	static final void method13840(Class665 class665, byte i) {
		int i_27_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_27_, -699865104);
		Class240 class240 = Class183.aClass240Array2100[i_27_ >> 16];
		Class290.method5252(class243, class240, class665, -715724038);
	}
}
