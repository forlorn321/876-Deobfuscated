/* Class166 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class166 {
	public static final int anInt1834 = 8191;
	public static int[] anIntArray1835 = { 3, 7, 15 };
	public static final int anInt1836 = 16;
	public static final int anInt1837 = 32;
	public static final int anInt1838 = 1;
	public static final int anInt1839 = 2;
	public static final int anInt1840 = 0;
	public static final int anInt1841 = 1023;
	public static final int anInt1842 = 64;
	public static final int anInt1843 = 16;
	public static final int anInt1844 = 0;
	public static int[] anIntArray1845 = { 2047, 16383, 65535 };
	public static final int anInt1846 = 8;
	public static final int anInt1847 = 2;

	Class166() throws Throwable {
		throw new Error();
	}

	public static Class396[] method2667(int i) {
		return (new Class396[] { Class396.aClass396_4109, Class396.aClass396_4108, Class396.aClass396_4107, Class396.aClass396_4110, Class396.aClass396_4117, Class396.aClass396_4112, Class396.aClass396_4111, Class396.aClass396_4114, Class396.aClass396_4115, Class396.aClass396_4116, Class396.aClass396_4113 });
	}

	public static Object method2668(byte[] is, boolean bool, short i) {
		if (is == null)
			return null;
		if (is.length > 136) {
			ByteBuffer bytebuffer = ByteBuffer.allocateDirect(is.length);
			bytebuffer.position(0);
			bytebuffer.put(is);
			return bytebuffer;
		}
		if (bool)
			return Arrays.copyOf(is, is.length);
		return is;
	}

	public static String method2669(CharSequence charsequence, byte i) {
		int i_0_ = charsequence.length();
		StringBuilder stringbuilder = new StringBuilder(i_0_);
		for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
			char c = charsequence.charAt(i_1_);
			if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || '.' == c || c == '-' || '*' == c || '_' == c)
				stringbuilder.append(c);
			else if (c == ' ')
				stringbuilder.append('+');
			else {
				int i_2_ = Class676.method13876(c, 1907269876);
				stringbuilder.append('%');
				int i_3_ = i_2_ >> 4 & 0xf;
				if (i_3_ >= 10)
					stringbuilder.append((char) (55 + i_3_));
				else
					stringbuilder.append((char) (i_3_ + 48));
				i_3_ = i_2_ & 0xf;
				if (i_3_ >= 10)
					stringbuilder.append((char) (i_3_ + 55));
				else
					stringbuilder.append((char) (i_3_ + 48));
			}
		}
		return stringbuilder.toString();
	}
}
