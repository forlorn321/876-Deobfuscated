/* Class376 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class376 {
	public static Class376 aClass376_3912 = new Class376();
	public static Class376 aClass376_3913 = new Class376();

	Class376() {
		/* empty */
	}

	static final void method4792(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_0_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_1_ = class668.anIntArray8541[1 + class668.anInt8542 * 1867269829];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class317.method4227(i_0_, i_1_, false, -1709021167);
	}

	static final void method4793(Class668 class668, byte i) {
		class668.anInt8542 -= 61855783;
		int i_2_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_3_ = class668.anIntArray8541[1 + class668.anInt8542 * 1867269829];
		int i_4_ = class668.anIntArray8541[2 + class668.anInt8542 * 1867269829];
		if (i_3_ == -1)
			throw new RuntimeException();
		Class39 class39 = (Class39) Class676.aClass34_Sub6_8589.method70(i_3_, (byte) 59);
		if (class39.aClass453_483.method78() != i_2_)
			throw new RuntimeException();
		int[] is = class39.method854(Integer.valueOf(i_4_), -1652617414);
		int i_5_ = 0;
		if (null != is)
			i_5_ = is.length;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_5_;
	}
}
