/* Class565 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class565 {
	public static final int anInt7587 = 16384;
	static final int anInt7588 = 2048;
	public static final int anInt7589 = 16384;
	static final int anInt7590 = 2048;
	public static Player MY_PLAYER;

	Class565() throws Throwable {
		throw new Error();
	}

	static final void method6875(Class668 class668, int i) {
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = (class668.anObjectArray8561[class668.anIntArray8537[-1640738851 * class668.anInt8564]]);
	}

	static final void method6876(IComponentDefinitions class251, Class234 class234, Class668 class668, int i) {
		class668.anInt8542 -= -1349181388;
		class251.posX = -45108559 * (class668.anIntArray8541[class668.anInt8542 * 1867269829]);
		class251.posY = (-1160038075 * class668.anIntArray8541[1 + 1867269829 * class668.anInt8542]);
		int i_0_ = class668.anIntArray8541[2 + class668.anInt8542 * 1867269829];
		if (i_0_ < 0)
			i_0_ = 0;
		else if (i_0_ > 5)
			i_0_ = 5;
		int i_1_ = class668.anIntArray8541[3 + 1867269829 * class668.anInt8542];
		if (i_1_ < 0)
			i_1_ = 0;
		else if (i_1_ > 5)
			i_1_ = 5;
		class251.posXMode = (byte) i_0_;
		class251.posYMode = (byte) i_1_;
		Class668.method8011(class251, 263642117);
		Class223.method3202(class234, class251, 864054473);
		if (class251.anInt2728 * 1049444347 == 0)
			Class499.method6023(class234, class251, false, (byte) -3);
		if (-809980533 * class251.anInt2546 == -1 && !class234.aBool2379)
			Class274.method3735(-1591767037 * class251.anInt2559, -950670297);
	}

	static final void method6877(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class536_Sub42.method9872(class251, class234, class668, -583227134);
	}

	static final void method6878(Class668 class668, byte i) {
		class668.anInt8542 -= -1411037171;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
	}
}
