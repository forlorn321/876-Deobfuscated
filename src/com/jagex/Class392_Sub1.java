/* Class392_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class392_Sub1 extends Class392 {
	public int anInt10105;
	public int anInt10106;
	public static RSByteBuffer aClass536_Sub33_10107;

	public Class390 method343(byte i) {
		return Class390.aClass390_4049;
	}

	public Class390 method344() {
		return Class390.aClass390_4049;
	}

	public Class390 method342() {
		return Class390.aClass390_4049;
	}

	Class392_Sub1(Class395 class395, Class399 class399, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		super(class395, class399, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_);
		anInt10105 = i_6_ * -1839255243;
		anInt10106 = 394700645 * i_7_;
	}

	public static Class392 method9208(RSByteBuffer class536_sub33) {
		Class392 class392 = Class392.method4864(class536_sub33, -2090412745);
		int i = class536_sub33.readInt();
		int i_8_ = class536_sub33.readInt();
		return new Class392_Sub1(class392.aClass395_4064, class392.aClass399_4065, 316945261 * class392.anInt4066, 1917287119 * class392.anInt4069, class392.anInt4068 * -1755858667, -840030237 * class392.anInt4067, -2068781397 * class392.anInt4070, 1694830205 * class392.anInt4071, class392.anInt4072 * -369678755, i, i_8_);
	}

	static final void method9209(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_9_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_10_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		if (i_9_ > 700 || i_10_ > 700)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 256;
		double d = ((Math.random() * (double) (i_10_ + i_9_) - (double) i_9_ + 800.0) / 100.0);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (int) (Math.pow(2.0, d) + 0.5);
	}
}
