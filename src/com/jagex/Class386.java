/* Class386 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class386 implements Interface49 {
	public int anInt4021;
	public String aString4022;
	public int anInt4023;
	public int anInt4024;
	public Class399 aClass399_4025;
	public int anInt4026;
	public int anInt4027;
	public int anInt4028;
	public int anInt4029;
	public int anInt4030;
	public int anInt4031;
	public Class395 aClass395_4032;
	public int anInt4033;

	public Class390 method343(byte i) {
		return Class390.aClass390_4054;
	}

	public Class390 method344() {
		return Class390.aClass390_4054;
	}

	public Class390 method342() {
		return Class390.aClass390_4054;
	}

	Class386(String string, Class395 class395, Class399 class399, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		aString4022 = string;
		aClass395_4032 = class395;
		aClass399_4025 = class399;
		anInt4023 = 113424053 * i;
		anInt4021 = 525408679 * i_0_;
		anInt4026 = 1975336987 * i_1_;
		anInt4027 = i_2_ * -1614898945;
		anInt4028 = i_3_ * 1598884977;
		anInt4029 = 1626451503 * i_4_;
		anInt4030 = 356790167 * i_5_;
		anInt4031 = i_6_ * 186562505;
		anInt4024 = i_7_ * -478232661;
		anInt4033 = -1989969707 * i_8_;
	}

	static void method4843(Class668 class668, byte i) {
		class668.anInt8542 -= 1472892954;
		boolean bool = class668.anIntArray8541[1867269829 * class668.anInt8542] != 0;
		boolean bool_9_ = 0 != (class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1]);
		Class205_Sub23.method9102(bool, bool_9_, -2073717069);
	}

	static final void method4844(InterfaceDefinitions class251, byte[] is, byte[] is_10_, Class668 class668, int i) {
		int i_11_ = ((class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) - 1);
		if (i_11_ < 0 || i_11_ > 9)
			throw new RuntimeException();
		Class481.method5831(class251, i_11_, is, is_10_, class668, -1953501988);
	}

	static final void method4845(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		InterfaceDefinitions class251 = class683.aClass251_8650;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class251.anInt2581 * 1428895931;
	}
}
