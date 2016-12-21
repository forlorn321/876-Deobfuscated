/* Class623 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class623 implements Interface75 {
	public static Class623 aClass623_8130 = new Class623(0);
	static Class623 aClass623_8131 = new Class623(1);
	int anInt8132;
	static Class623 aClass623_8133 = new Class623(2);

	public boolean method7420(int i) {
		return aClass623_8131 == this;
	}

	public int method78() {
		return -496939007 * anInt8132;
	}

	public int method73() {
		return -496939007 * anInt8132;
	}

	public boolean method7421(int i) {
		return this != aClass623_8130;
	}

	public int method12() {
		return -496939007 * anInt8132;
	}

	public static Class623[] method7422(byte i) {
		return (new Class623[] { aClass623_8133, aClass623_8131, aClass623_8130 });
	}

	Class623(int i) {
		anInt8132 = i * -694243327;
	}

	public boolean method7423() {
		return this != aClass623_8130;
	}

	static final void method7424(Class668 class668, byte i) {
		Class205_Sub14.method9073(true, -33263569);
	}

	static final void method7425(Class668 class668, byte i) {
		class668.anInt8542 -= 1534748737;
		int i_0_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_1_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		int i_2_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 2];
		int i_3_ = class668.anIntArray8541[3 + class668.anInt8542 * 1867269829];
		int i_4_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 4];
		if (-1 == i_2_)
			throw new RuntimeException();
		Class39 class39 = (Class39) Class676.aClass34_Sub6_8589.method70(i_2_, (byte) 42);
		if (class39.aClass453_482.method78() != i_1_)
			throw new RuntimeException();
		if (class39.aClass453_483.method78() != i_0_)
			throw new RuntimeException();
		int[] is = class39.method854(Integer.valueOf(i_3_), -914026133);
		if (i_4_ < 0 || null == is || is.length <= i_4_)
			throw new RuntimeException();
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = is[i_4_];
	}
}
