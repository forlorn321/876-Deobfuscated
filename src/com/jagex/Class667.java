/* Class667 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class667 {
	static int[] anIntArray8562;
	static char[] aCharArray8563;
	static char[] aCharArray8564;
	static char[] aCharArray8565 = new char[64];
	static String[] aStringArray8566;

	static {
		for (int i = 0; i < 26; i++)
			aCharArray8565[i] = (char) (i + 65);
		for (int i = 26; i < 52; i++)
			aCharArray8565[i] = (char) (97 + i - 26);
		for (int i = 52; i < 62; i++)
			aCharArray8565[i] = (char) (i + 48 - 52);
		aCharArray8565[62] = '+';
		aCharArray8565[63] = '/';
		aCharArray8563 = new char[64];
		for (int i = 0; i < 26; i++)
			aCharArray8563[i] = (char) (65 + i);
		for (int i = 26; i < 52; i++)
			aCharArray8563[i] = (char) (97 + i - 26);
		for (int i = 52; i < 62; i++)
			aCharArray8563[i] = (char) (48 + i - 52);
		aCharArray8563[62] = '*';
		aCharArray8563[63] = '-';
		aCharArray8564 = new char[64];
		for (int i = 0; i < 26; i++)
			aCharArray8564[i] = (char) (65 + i);
		for (int i = 26; i < 52; i++)
			aCharArray8564[i] = (char) (97 + i - 26);
		for (int i = 52; i < 62; i++)
			aCharArray8564[i] = (char) (48 + i - 52);
		aCharArray8564[62] = '-';
		aCharArray8564[63] = '_';
		anIntArray8562 = new int[128];
		for (int i = 0; i < anIntArray8562.length; i++)
			anIntArray8562[i] = -1;
		for (int i = 65; i <= 90; i++)
			anIntArray8562[i] = i - 65;
		for (int i = 97; i <= 122; i++)
			anIntArray8562[i] = 26 + (i - 97);
		for (int i = 48; i <= 57; i++)
			anIntArray8562[i] = 52 + (i - 48);
		int[] is = anIntArray8562;
		anIntArray8562[43] = 62;
		is[42] = 62;
		int[] is_0_ = anIntArray8562;
		anIntArray8562[47] = 63;
		is_0_[45] = 63;
	}

	static String method13743(byte[] is, int i, int i_1_) {
		StringBuilder stringbuilder = new StringBuilder();
		for (int i_2_ = i; i_2_ < i + i_1_; i_2_ += 3) {
			int i_3_ = is[i_2_] & 0xff;
			stringbuilder.append(aCharArray8565[i_3_ >>> 2]);
			if (i_2_ < i_1_ - 1) {
				int i_4_ = is[i_2_ + 1] & 0xff;
				stringbuilder.append(aCharArray8565[(i_3_ & 0x3) << 4 | i_4_ >>> 4]);
				if (i_2_ < i_1_ - 2) {
					int i_5_ = is[2 + i_2_] & 0xff;
					stringbuilder.append(aCharArray8565[(i_4_ & 0xf) << 2 | i_5_ >>> 6]).append(aCharArray8565[i_5_ & 0x3f]);
				} else
					stringbuilder.append(aCharArray8565[(i_4_ & 0xf) << 2]).append('=');
			} else
				stringbuilder.append(aCharArray8565[(i_3_ & 0x3) << 4]).append('=').append('=');
		}
		return stringbuilder.toString();
	}

	static String method13744(byte[] is, int i, int i_6_) {
		StringBuilder stringbuilder = new StringBuilder();
		for (int i_7_ = i; i_7_ < i + i_6_; i_7_ += 3) {
			int i_8_ = is[i_7_] & 0xff;
			stringbuilder.append(aCharArray8565[i_8_ >>> 2]);
			if (i_7_ < i_6_ - 1) {
				int i_9_ = is[i_7_ + 1] & 0xff;
				stringbuilder.append(aCharArray8565[(i_8_ & 0x3) << 4 | i_9_ >>> 4]);
				if (i_7_ < i_6_ - 2) {
					int i_10_ = is[2 + i_7_] & 0xff;
					stringbuilder.append(aCharArray8565[(i_9_ & 0xf) << 2 | i_10_ >>> 6]).append(aCharArray8565[i_10_ & 0x3f]);
				} else
					stringbuilder.append(aCharArray8565[(i_9_ & 0xf) << 2]).append('=');
			} else
				stringbuilder.append(aCharArray8565[(i_8_ & 0x3) << 4]).append('=').append('=');
		}
		return stringbuilder.toString();
	}

	Class667() throws Throwable {
		throw new Error();
	}
}
