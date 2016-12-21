/* Class605 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class605 {
	static Class605 aClass605_7869;
	static Class605 aClass605_7870 = new Class605(0);
	public static Class605 aClass605_7871;
	static Class567 aClass567_7872;

	static {
		aClass605_7869 = new Class605(1);
		aClass605_7871 = new Class605(2);
	}

	Class605(int i) {
		/* empty */
	}

	static final void method7208(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_0_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_1_ = class668.anIntArray8541[1 + class668.anInt8542 * 1867269829];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_0_ > i_1_ ? i_0_ : i_1_;
	}

	static void method7209(String string, int i) {
		client.aString10986 = string;
		if (Class74.method1136(-1617235478) != Class512.aClass512_6934) {
			try {
				String string_2_ = Class622.anApplet8126.getParameter(Class401.aClass401_4162.aString4190);
				String string_3_ = Class622.anApplet8126.getParameter(Class401.aClass401_4163.aString4190);
				String string_4_ = new StringBuilder().append(string_2_).append("settings=").append(string).append("; version=1; path=/; domain=").append(string_3_).toString();
				if (string.length() == 0)
					string_4_ = new StringBuilder().append(string_4_).append("; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0").toString();
				else
					string_4_ = new StringBuilder().append(string_4_).append("; Expires=").append(Class287.method3913(Class249.method3450(1413442557) + 94608000000L)).append("; Max-Age=").append(94608000L).toString();
				Class25.method728(Class622.anApplet8126, new StringBuilder().append("document.cookie=\"").append(string_4_).append("\"").toString(), (byte) 47);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}
}
