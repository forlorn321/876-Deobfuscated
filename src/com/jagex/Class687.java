/* Class687 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class687 implements Interface76 {
	int anInt8674;
	public static Class687 aClass687_8675;
	static Class687 aClass687_8676;
	public static Class687 aClass687_8677;
	public static Class687 aClass687_8678;
	public static Class687 aClass687_8679 = new Class687(-2);

	public int method87() {
		return anInt8674 * 1014504351;
	}

	Class687(int i) {
		anInt8674 = 700072031 * i;
	}

	static {
		aClass687_8675 = new Class687(-3);
		aClass687_8678 = new Class687(2);
		aClass687_8677 = new Class687(3);
		aClass687_8676 = new Class687(4);
	}

	public int method42() {
		return anInt8674 * 1014504351;
	}

	public int method91() {
		return anInt8674 * 1014504351;
	}

	static long method13960(CharSequence charsequence, int i) {
		long l = 0L;
		int i_0_ = charsequence.length();
		for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
			l *= 37L;
			char c = charsequence.charAt(i_1_);
			if (c >= 'A' && c <= 'Z')
				l += (long) (c + '\001' - 'A');
			else if (c >= 'a' && c <= 'z')
				l += (long) (c + '\001' - 'a');
			else if (c >= '0' && c <= '9')
				l += (long) (c + '\033' - '0');
			if (l >= 177917621779460413L)
				break;
		}
		for (/**/; 0L == l % 37L && l != 0L; l /= 37L) {
			/* empty */
		}
		return l;
	}

	static void method13961(String string, String string_2_, int i, int i_3_, int i_4_, long l, int i_5_, int i_6_, boolean bool, boolean bool_7_, long l_8_, boolean bool_9_, byte i_10_) {
		if (!Class35.aBool338 && Class35.anInt346 * -943170217 < 513) {
			i = -1 != i ? i : 227760777 * client.anInt11185;
			Class527_Sub8_Sub7 class527_sub8_sub7 = new Class527_Sub8_Sub7(string, string_2_, i, i_3_, i_4_, l, i_5_, i_6_, bool, bool_7_, l_8_, bool_9_);
			Class259.method4785(class527_sub8_sub7, 1295012483);
		}
	}
}
