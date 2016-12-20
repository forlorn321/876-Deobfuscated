/* Class663 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class663 {
	static char[] aCharArray8516 = { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	static long[] aLongArray8517 = new long[12];

	static {
		for (int i = 0; i < aLongArray8517.length; i++)
			aLongArray8517[i] = (long) Math.pow(37.0, (double) i);
	}

	Class663() throws Throwable {
		throw new Error();
	}

	static long method11038(CharSequence charsequence) {
		long l = 0L;
		int i = charsequence.length();
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			l *= 37L;
			char c = charsequence.charAt(i_0_);
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

	static long method11039(CharSequence charsequence) {
		long l = 0L;
		int i = charsequence.length();
		for (int i_1_ = 0; i_1_ < i; i_1_++) {
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

	static String method11040(long l) {
		if (l <= 0L || l >= 6582952005840035281L)
			return null;
		if (l % 37L == 0L)
			return null;
		int i = 0;
		for (long l_2_ = l; l_2_ != 0L; l_2_ /= 37L)
			i++;
		StringBuilder stringbuilder = new StringBuilder(i);
		while (l != 0L) {
			long l_3_ = l;
			l /= 37L;
			char c = aCharArray8516[(int) (l_3_ - 37L * l)];
			if ('_' == c) {
				int i_4_ = stringbuilder.length() - 1;
				stringbuilder.setCharAt(i_4_, Character.toUpperCase(stringbuilder.charAt(i_4_)));
				c = '\u00a0';
			}
			stringbuilder.append(c);
		}
		stringbuilder.reverse();
		stringbuilder.setCharAt(0, Character.toUpperCase(stringbuilder.charAt(0)));
		return stringbuilder.toString();
	}

	static String method11041(long l) {
		if (l <= 0L || l >= 6582952005840035281L)
			return null;
		if (l % 37L == 0L)
			return null;
		int i = 0;
		for (long l_5_ = l; l_5_ != 0L; l_5_ /= 37L)
			i++;
		StringBuilder stringbuilder = new StringBuilder(i);
		while (l != 0L) {
			long l_6_ = l;
			l /= 37L;
			char c = aCharArray8516[(int) (l_6_ - 37L * l)];
			if ('_' == c) {
				int i_7_ = stringbuilder.length() - 1;
				stringbuilder.setCharAt(i_7_, Character.toUpperCase(stringbuilder.charAt(i_7_)));
				c = '\u00a0';
			}
			stringbuilder.append(c);
		}
		stringbuilder.reverse();
		stringbuilder.setCharAt(0, Character.toUpperCase(stringbuilder.charAt(0)));
		return stringbuilder.toString();
	}

	static String method11042(long l) {
		if (l <= 0L || l >= 6582952005840035281L)
			return null;
		if (l % 37L == 0L)
			return null;
		int i = 0;
		for (long l_8_ = l; l_8_ != 0L; l_8_ /= 37L)
			i++;
		StringBuilder stringbuilder = new StringBuilder(i);
		while (l != 0L) {
			long l_9_ = l;
			l /= 37L;
			char c = aCharArray8516[(int) (l_9_ - 37L * l)];
			if ('_' == c) {
				int i_10_ = stringbuilder.length() - 1;
				stringbuilder.setCharAt(i_10_, Character.toUpperCase(stringbuilder.charAt(i_10_)));
				c = '\u00a0';
			}
			stringbuilder.append(c);
		}
		stringbuilder.reverse();
		stringbuilder.setCharAt(0, Character.toUpperCase(stringbuilder.charAt(0)));
		return stringbuilder.toString();
	}

	static final void method11043(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class316_Sub1.anInt10040 * -1588896611;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class55.anInt710 * -786345143;
	}
}
