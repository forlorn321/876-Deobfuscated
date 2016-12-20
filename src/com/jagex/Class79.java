/* Class79 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class79 {
	public static String method1561(CharSequence charsequence) {
		int i = charsequence.length();
		StringBuilder stringbuilder = new StringBuilder(i);
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			char c = charsequence.charAt(i_0_);
			if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || '.' == c || c == '-' || '*' == c || '_' == c)
				stringbuilder.append(c);
			else if (c == ' ')
				stringbuilder.append('+');
			else {
				int i_1_ = Class676.method13876(c, 1907269876);
				stringbuilder.append('%');
				int i_2_ = i_1_ >> 4 & 0xf;
				if (i_2_ >= 10)
					stringbuilder.append((char) (55 + i_2_));
				else
					stringbuilder.append((char) (i_2_ + 48));
				i_2_ = i_1_ & 0xf;
				if (i_2_ >= 10)
					stringbuilder.append((char) (i_2_ + 55));
				else
					stringbuilder.append((char) (i_2_ + 48));
			}
		}
		return stringbuilder.toString();
	}

	Class79() throws Throwable {
		throw new Error();
	}

	public static String method1562(CharSequence charsequence) {
		int i = charsequence.length();
		StringBuilder stringbuilder = new StringBuilder(i);
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			char c = charsequence.charAt(i_3_);
			if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || '.' == c || c == '-' || '*' == c || '_' == c)
				stringbuilder.append(c);
			else if (c == ' ')
				stringbuilder.append('+');
			else {
				int i_4_ = Class676.method13876(c, 1907269876);
				stringbuilder.append('%');
				int i_5_ = i_4_ >> 4 & 0xf;
				if (i_5_ >= 10)
					stringbuilder.append((char) (55 + i_5_));
				else
					stringbuilder.append((char) (i_5_ + 48));
				i_5_ = i_4_ & 0xf;
				if (i_5_ >= 10)
					stringbuilder.append((char) (i_5_ + 55));
				else
					stringbuilder.append((char) (i_5_ + 48));
			}
		}
		return stringbuilder.toString();
	}

	static final void method1563(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class243.anInt2512 * -71358053;
	}

	public static void method1564(boolean bool, int i) {
		if (Class585.aBool7704 != bool) {
			Class305.method5592((byte) 86);
			Class585.aBool7704 = bool;
		}
	}
}
