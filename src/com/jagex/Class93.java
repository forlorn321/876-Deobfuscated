/* Class93 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class93 {
	static final int anInt887 = 1;
	static final int anInt888 = 12;
	static char[] aCharArray889 = { ' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4', '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5', '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7', '\u00c7',
			'\u00ff', '\u0178', '\u00f1', '\u00d1', '\u00df' };
	static char[] aCharArray890 = { '[', ']', '#' };

	static char method1233(char c) {
		switch (c) {
		case '\u00cd':
		case '\u00ce':
		case '\u00cf':
		case '\u00ed':
		case '\u00ee':
		case '\u00ef':
			return 'i';
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
		case '\u00d9':
		case '\u00da':
		case '\u00db':
		case '\u00dc':
		case '\u00f9':
		case '\u00fa':
		case '\u00fb':
		case '\u00fc':
			return 'u';
		case ' ':
		case '-':
		case '_':
		case '\u00a0':
			return '_';
		case '\u00c7':
		case '\u00e7':
			return 'c';
		case '#':
		case '[':
		case ']':
			return c;
		case '\u00df':
			return 'b';
		case '\u00ff':
		case '\u0178':
			return 'y';
		case '\u00d1':
		case '\u00f1':
			return 'n';
		default:
			return Character.toLowerCase(c);
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
		}
	}

	static final boolean method1234(char c) {
		if (Character.isISOControl(c))
			return false;
		if (Class608.method7260(c, 1512197856))
			return true;
		char[] cs = aCharArray889;
		for (int i = 0; i < cs.length; i++) {
			char c_0_ = cs[i];
			if (c == c_0_)
				return true;
		}
		cs = aCharArray890;
		for (int i = 0; i < cs.length; i++) {
			char c_1_ = cs[i];
			if (c == c_1_)
				return true;
		}
		return false;
	}

	static final boolean method1235(char c) {
		return c == '\u00a0' || c == ' ' || c == '_' || c == '-';
	}

	Class93() throws Throwable {
		throw new Error();
	}

	static final void method1236(Class668 class668, byte i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (2 == -1484801557 * client.anInt11289 && i_2_ < 142551095 * client.anInt11288)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -377205431 * client.aClass31Array11291[i_2_].anInt270;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	public static Class597[] method1237(int i) {
		return (new Class597[] { Class597.aClass597_7831, Class597.aClass597_7833, Class597.aClass597_7837, Class597.aClass597_7832, Class597.aClass597_7835, Class597.aClass597_7834 });
	}

	public static void method1238(int i) {
		if (-708374433 * client.anInt11101 == 16 && (!Class344.method4487(-440129613) && !Class81.method1164(65280)))
			Class673.method8026(13, -1798113843);
	}

	static final void method1239(boolean bool, Class668 class668, short i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		if (bool)
			Class171.method2425(class234, class251, 324055827);
		else
			Class402.method4925(class234, class251, (byte) 56);
	}
}
