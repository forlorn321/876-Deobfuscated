/* Class431 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class431 {
	public static final int anInt4831 = 2;
	public static final int anInt4832 = 7;
	public static final int anInt4833 = 12;
	public static final int anInt4834 = 18;
	public static final int anInt4835 = 15;
	public static final int anInt4836 = 10;
	public static final int anInt4837 = 3;
	public static final int anInt4838 = 0;
	public static final int anInt4839 = 14;
	public static final int anInt4840 = 8;
	public static final int anInt4841 = 6;
	public static final int anInt4842 = 9;
	public static final int anInt4843 = 13;
	public static final int anInt4844 = 4;
	public static final int anInt4845 = 17;
	public static final int anInt4846 = 19;
	public static final int anInt4847 = 16;
	public static final int anInt4848 = 1;
	public static final int anInt4849 = 11;
	public static final int anInt4850 = 5;
	public static Class24 aClass24_4851;

	Class431() throws Throwable {
		throw new Error();
	}

	public static int method6877(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		if ((i_4_ & 0x1) == 1) {
			int i_6_ = i_2_;
			i_2_ = i_3_;
			i_3_ = i_6_;
		}
		i_1_ &= 0x3;
		if (i_1_ == 0)
			return i;
		if (i_1_ == 1)
			return i_0_;
		if (i_1_ == 2)
			return 7 - i - (i_2_ - 1);
		return 7 - i_0_ - (i_3_ - 1);
	}
}
