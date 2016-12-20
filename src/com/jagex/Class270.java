/* Class270 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class270 {
	int anInt3122;
	static Class270 aClass270_3123;
	static Class270 aClass270_3124 = new Class270(0);

	Class270(int i) {
		anInt3122 = i * -161767463;
	}

	public static Class270 method5059(int i) {
		if (i == aClass270_3124.anInt3122 * -116330391)
			return aClass270_3124;
		if (-116330391 * aClass270_3123.anInt3122 == i)
			return aClass270_3123;
		return null;
	}

	public static Class270 method5060(int i) {
		if (i == aClass270_3124.anInt3122 * -116330391)
			return aClass270_3124;
		if (-116330391 * aClass270_3123.anInt3122 == i)
			return aClass270_3123;
		return null;
	}

	public static Class270 method5061(int i) {
		if (i == aClass270_3124.anInt3122 * -116330391)
			return aClass270_3124;
		if (-116330391 * aClass270_3123.anInt3122 == i)
			return aClass270_3123;
		return null;
	}

	static {
		aClass270_3123 = new Class270(1);
	}

	public static Class270 method5062(int i) {
		if (i == aClass270_3124.anInt3122 * -116330391)
			return aClass270_3124;
		if (-116330391 * aClass270_3123.anInt3122 == i)
			return aClass270_3123;
		return null;
	}

	public static int method5063(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		if (1 == (i_4_ & 0x1)) {
			int i_6_ = i_2_;
			i_2_ = i_3_;
			i_3_ = i_6_;
		}
		i_1_ &= 0x3;
		if (0 == i_1_)
			return i_0_;
		if (1 == i_1_)
			return 7 - i - (i_2_ - 1);
		if (2 == i_1_)
			return 7 - i_0_ - (i_3_ - 1);
		return i;
	}
}
