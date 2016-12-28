/* Class309_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class309_Sub1 extends Class309 {
	Class309_Sub1(boolean bool, Class461 class461, Class664 class664, Class670 class670) {
		super(bool, class461, class664, class670);
	}

	public DefinitionI method55(int i, Interface12 interface12, int i_0_) {
		return new Class296(i, this, interface12);
	}

	public Class method51(int i) {
		return com.jagex.Class296.class;
	}

	public DefinitionI method53(int i, Interface12 interface12) {
		return new Class296(i, this, interface12);
	}

	public DefinitionI method54(int i, Interface12 interface12) {
		return new Class296(i, this, interface12);
	}

	public Class method52() {
		return com.jagex.Class296.class;
	}

	static final void method9188(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub35_10785.method10213(-45764204);
	}

	static final void method9189(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class453.method5447(class251, class234, class668, (byte) 124);
	}

	public static int method9190(CharSequence charsequence, CharSequence charsequence_1_, byte i) {
		int i_2_ = charsequence.length();
		int i_3_ = charsequence_1_.length();
		if (0 == i_2_)
			return i_3_;
		if (0 == i_3_)
			return i_2_;
		int[] is = new int[1 + i_2_];
		int[] is_4_ = new int[i_2_ + 1];
		for (int i_5_ = 0; i_5_ <= i_2_; i_5_++)
			is[i_5_] = i_5_;
		for (int i_6_ = 1; i_6_ <= i_3_; i_6_++) {
			is_4_[0] = i_6_;
			char c = charsequence_1_.charAt(i_6_ - 1);
			for (int i_7_ = 1; i_7_ <= i_2_; i_7_++)
				is_4_[i_7_] = Math.min(Math.min(1 + is_4_[i_7_ - 1], is[i_7_] + 1), (is[i_7_ - 1] + (charsequence.charAt(i_7_ - 1) == c ? 0 : 1)));
			int[] is_8_ = is;
			is = is_4_;
			is_4_ = is_8_;
		}
		return is[i_2_];
	}
}
