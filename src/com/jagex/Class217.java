/* Class217 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class217 implements Interface42 {
	Class211 this$0;
	static int anInt2305;

	public float method287() {
		return ((float) Class710.aClass536_Sub40_8843.aClass710_Sub35_10742.method10213(22983264) / 255.0F);
	}

	public float method285(int i) {
		return ((float) Class710.aClass536_Sub40_8843.aClass710_Sub35_10742.method10213(-1418567324) / 255.0F);
	}

	public float method286() {
		return ((float) Class710.aClass536_Sub40_8843.aClass710_Sub35_10742.method10213(-367185057) / 255.0F);
	}

	Class217(Class211 class211) {
		this$0 = class211;
	}

	public float method288() {
		return ((float) Class710.aClass536_Sub40_8843.aClass710_Sub35_10742.method10213(730070313) / 255.0F);
	}

	static final void method3095(Class668 class668, int i) {
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = class668.aClass350_8563.aString3707;
	}

	static final void method3096(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1867600229 * client.anInt11259;
	}

	static final void method3097(Class668 class668, byte i) {
		/* empty */
	}

	static final void method3098(Class668 class668, byte i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (i_0_ == -1)
			throw new RuntimeException();
		Class39 class39 = (Class39) Class676.aClass34_Sub6_8589.method70(i_0_, (byte) -33);
		if (Class453.aClass453_5084 != class39.aClass453_483)
			throw new RuntimeException();
		int[] is = class39.method854(string, -2126835596);
		int i_1_ = 0;
		if (null != is)
			i_1_ = is.length;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_1_;
	}
}
