/* Class102 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.net.URL;

public class Class102 {
	URL anURL1234;
	volatile boolean aBool1235;
	volatile byte[] aByteArray1236;
	public static Class459 aClass459_1237;

	Class102(URL url) {
		anURL1234 = url;
	}

	boolean method1792(int i) {
		return aBool1235;
	}

	byte[] method1793(int i) {
		return aByteArray1236;
	}

	byte[] method1794() {
		return aByteArray1236;
	}

	byte[] method1795() {
		return aByteArray1236;
	}

	byte[] method1796() {
		return aByteArray1236;
	}

	boolean method1797() {
		return aBool1235;
	}

	static void method1798(int i, int i_0_, int i_1_) {
		if (1 == Class35.anInt344 * -1997055909)
			Class47.method1237(Class206.aClass527_Sub8_Sub7_2231, i, i_0_, false, (short) 3553);
		else if (Class35.anInt344 * -1997055909 == 2)
			Class504.method8221(i, i_0_, -830884542);
		Class35.anInt344 = 0;
		Class206.aClass527_Sub8_Sub7_2231 = null;
	}

	public static void method1799(float[] fs, int[] is, int i, int i_2_, byte i_3_) {
		if (i < i_2_) {
			int i_4_ = (i + i_2_) / 2;
			int i_5_ = i;
			float f = fs[i_4_];
			fs[i_4_] = fs[i_2_];
			fs[i_2_] = f;
			int i_6_ = is[i_4_];
			is[i_4_] = is[i_2_];
			is[i_2_] = i_6_;
			for (int i_7_ = i; i_7_ < i_2_; i_7_++) {
				if (fs[i_7_] > f) {
					float f_8_ = fs[i_7_];
					fs[i_7_] = fs[i_5_];
					fs[i_5_] = f_8_;
					int i_9_ = is[i_7_];
					is[i_7_] = is[i_5_];
					is[i_5_++] = i_9_;
				}
			}
			fs[i_2_] = fs[i_5_];
			fs[i_5_] = f;
			is[i_2_] = is[i_5_];
			is[i_5_] = i_6_;
			method1799(fs, is, i, i_5_ - 1, (byte) 113);
			method1799(fs, is, 1 + i_5_, i_2_, (byte) 84);
		}
	}
}
