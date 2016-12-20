/* Class86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class86 {
	static char[] aCharArray820 = { ' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4', '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5', '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7', '\u00c7',
			'\u00ff', '\u0178', '\u00f1', '\u00d1', '\u00df' };
	static final int anInt821 = 12;
	static final int anInt822 = 1;
	static char[] aCharArray823 = { '[', ']', '#' };
	static int anInt824;

	Class86() throws Throwable {
		throw new Error();
	}

	static char method1608(char c) {
		switch (c) {
		case '\u00c8':
		case '\u00c9':
		case '\u00ca':
		case '\u00cb':
		case '\u00e8':
		case '\u00e9':
		case '\u00ea':
		case '\u00eb':
			return 'e';
		case '\u00d2':
		case '\u00d3':
		case '\u00d4':
		case '\u00d5':
		case '\u00d6':
		case '\u00f2':
		case '\u00f3':
		case '\u00f4':
		case '\u00f5':
		case '\u00f6':
			return 'o';
		case '\u00cd':
		case '\u00ce':
		case '\u00cf':
		case '\u00ed':
		case '\u00ee':
		case '\u00ef':
			return 'i';
		case '\u00c7':
		case '\u00e7':
			return 'c';
		case '\u00d1':
		case '\u00f1':
			return 'n';
		case ' ':
		case '-':
		case '_':
		case '\u00a0':
			return '_';
		case '#':
		case '[':
		case ']':
			return c;
		case '\u00df':
			return 'b';
		case '\u00d9':
		case '\u00da':
		case '\u00db':
		case '\u00dc':
		case '\u00f9':
		case '\u00fa':
		case '\u00fb':
		case '\u00fc':
			return 'u';
		case '\u00ff':
		case '\u0178':
			return 'y';
		case '\u00c0':
		case '\u00c1':
		case '\u00c2':
		case '\u00c3':
		case '\u00c4':
		case '\u00e0':
		case '\u00e1':
		case '\u00e2':
		case '\u00e3':
		case '\u00e4':
			return 'a';
		default:
			return Character.toLowerCase(c);
		}
	}

	static final int method1609(Class91 class91) {
		if (null == class91)
			return 12;
		switch (class91.anInt846 * 1899620479) {
		default:
			return 12;
		case 3:
			return 20;
		}
	}

	static final boolean method1610(char c) {
		if (Character.isISOControl(c))
			return false;
		if (Class394.method6500(c, 105842603))
			return true;
		char[] cs = aCharArray820;
		for (int i = 0; i < cs.length; i++) {
			char c_0_ = cs[i];
			if (c == c_0_)
				return true;
		}
		cs = aCharArray823;
		for (int i = 0; i < cs.length; i++) {
			char c_1_ = cs[i];
			if (c == c_1_)
				return true;
		}
		return false;
	}

	static final boolean method1611(char c) {
		return '\u00a0' == c || ' ' == c || c == '_' || c == '-';
	}

	public static String method1612(CharSequence charsequence, Class91 class91) {
		if (null == charsequence)
			return null;
		int i = 0;
		int i_2_;
		for (i_2_ = charsequence.length(); (i < i_2_ && Class71.method1491(charsequence.charAt(i), -1770951978)); i++) {
			/* empty */
		}
		for (/**/; (i_2_ > i && Class71.method1491(charsequence.charAt(i_2_ - 1), 287067440)); i_2_--) {
			/* empty */
		}
		int i_3_ = i_2_ - i;
		if (i_3_ < 1 || i_3_ > Class300.method5565(class91, 1763208595))
			return null;
		StringBuilder stringbuilder = new StringBuilder(i_3_);
		for (int i_4_ = i; i_4_ < i_2_; i_4_++) {
			char c = charsequence.charAt(i_4_);
			if (Class300.method5566(c, 211546141)) {
				char c_5_ = Class55.method1321(c, -1438205615);
				if (c_5_ != 0)
					stringbuilder.append(c_5_);
			}
		}
		if (stringbuilder.length() == 0)
			return null;
		return stringbuilder.toString();
	}

	public static String method1613(CharSequence charsequence, Class91 class91) {
		if (null == charsequence)
			return null;
		int i = 0;
		int i_6_;
		for (i_6_ = charsequence.length(); (i < i_6_ && Class71.method1491(charsequence.charAt(i), -593523669)); i++) {
			/* empty */
		}
		for (/**/; i_6_ > i && Class71.method1491(charsequence.charAt(i_6_ - 1), -1582322352); i_6_--) {
			/* empty */
		}
		int i_7_ = i_6_ - i;
		if (i_7_ < 1 || i_7_ > Class300.method5565(class91, 1748159482))
			return null;
		StringBuilder stringbuilder = new StringBuilder(i_7_);
		for (int i_8_ = i; i_8_ < i_6_; i_8_++) {
			char c = charsequence.charAt(i_8_);
			if (Class300.method5566(c, 211546141)) {
				char c_9_ = Class55.method1321(c, -1863199872);
				if (c_9_ != 0)
					stringbuilder.append(c_9_);
			}
		}
		if (stringbuilder.length() == 0)
			return null;
		return stringbuilder.toString();
	}

	public static String method1614(CharSequence charsequence, Class91 class91) {
		if (null == charsequence)
			return null;
		int i = 0;
		int i_10_;
		for (i_10_ = charsequence.length(); (i < i_10_ && Class71.method1491(charsequence.charAt(i), 1631355533)); i++) {
			/* empty */
		}
		for (/**/; i_10_ > i && Class71.method1491(charsequence.charAt(i_10_ - 1), 362430444); i_10_--) {
			/* empty */
		}
		int i_11_ = i_10_ - i;
		if (i_11_ < 1 || i_11_ > Class300.method5565(class91, 2120755939))
			return null;
		StringBuilder stringbuilder = new StringBuilder(i_11_);
		for (int i_12_ = i; i_12_ < i_10_; i_12_++) {
			char c = charsequence.charAt(i_12_);
			if (Class300.method5566(c, 211546141)) {
				char c_13_ = Class55.method1321(c, -1474445951);
				if (c_13_ != 0)
					stringbuilder.append(c_13_);
			}
		}
		if (stringbuilder.length() == 0)
			return null;
		return stringbuilder.toString();
	}

	public static String method1615(CharSequence charsequence, Class91 class91) {
		if (null == charsequence)
			return null;
		int i = 0;
		int i_14_;
		for (i_14_ = charsequence.length(); (i < i_14_ && Class71.method1491(charsequence.charAt(i), 203709125)); i++) {
			/* empty */
		}
		for (/**/; i_14_ > i && Class71.method1491(charsequence.charAt(i_14_ - 1), 204683296); i_14_--) {
			/* empty */
		}
		int i_15_ = i_14_ - i;
		if (i_15_ < 1 || i_15_ > Class300.method5565(class91, 2081358333))
			return null;
		StringBuilder stringbuilder = new StringBuilder(i_15_);
		for (int i_16_ = i; i_16_ < i_14_; i_16_++) {
			char c = charsequence.charAt(i_16_);
			if (Class300.method5566(c, 211546141)) {
				char c_17_ = Class55.method1321(c, -1907142140);
				if (c_17_ != 0)
					stringbuilder.append(c_17_);
			}
		}
		if (stringbuilder.length() == 0)
			return null;
		return stringbuilder.toString();
	}

	static char method1616(char c) {
		switch (c) {
		case '\u00c8':
		case '\u00c9':
		case '\u00ca':
		case '\u00cb':
		case '\u00e8':
		case '\u00e9':
		case '\u00ea':
		case '\u00eb':
			return 'e';
		case '\u00d2':
		case '\u00d3':
		case '\u00d4':
		case '\u00d5':
		case '\u00d6':
		case '\u00f2':
		case '\u00f3':
		case '\u00f4':
		case '\u00f5':
		case '\u00f6':
			return 'o';
		case '\u00cd':
		case '\u00ce':
		case '\u00cf':
		case '\u00ed':
		case '\u00ee':
		case '\u00ef':
			return 'i';
		case '\u00c7':
		case '\u00e7':
			return 'c';
		case '\u00d1':
		case '\u00f1':
			return 'n';
		case ' ':
		case '-':
		case '_':
		case '\u00a0':
			return '_';
		case '#':
		case '[':
		case ']':
			return c;
		case '\u00df':
			return 'b';
		case '\u00d9':
		case '\u00da':
		case '\u00db':
		case '\u00dc':
		case '\u00f9':
		case '\u00fa':
		case '\u00fb':
		case '\u00fc':
			return 'u';
		case '\u00ff':
		case '\u0178':
			return 'y';
		case '\u00c0':
		case '\u00c1':
		case '\u00c2':
		case '\u00c3':
		case '\u00c4':
		case '\u00e0':
		case '\u00e1':
		case '\u00e2':
		case '\u00e3':
		case '\u00e4':
			return 'a';
		default:
			return Character.toLowerCase(c);
		}
	}

	static final void method1617(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class110.method2010(class243, class240, class665, (byte) 4);
	}
}
