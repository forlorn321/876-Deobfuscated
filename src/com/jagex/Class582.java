/* Class582 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class582 {
	public static int anInt7699;
	static Class567 aClass567_7700;

	Class582() throws Throwable {
		throw new Error();
	}

	static final void method7023(Class251 class251, Class234 class234, Class668 class668, int i) {
		class668.anInt8542 -= -1349181388;
		class251.anInt2569 = (class668.anIntArray8541[class668.anInt8542 * 1867269829] * 1219788737);
		class251.anInt2664 = (49026457 * class668.anIntArray8541[1 + 1867269829 * class668.anInt8542]);
		class251.anInt2614 = 0;
		class251.anInt2615 = 0;
		int i_0_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 2];
		if (i_0_ < 0)
			i_0_ = 0;
		else if (i_0_ > 4)
			i_0_ = 4;
		int i_1_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 3];
		if (i_1_ < 0)
			i_1_ = 0;
		else if (i_1_ > 4)
			i_1_ = 4;
		class251.aByte2565 = (byte) i_0_;
		class251.aByte2618 = (byte) i_1_;
		Class668.method8011(class251, 263642117);
		Class223.method3202(class234, class251, 779208084);
		if (0 == class251.anInt2728 * 1049444347)
			Class499.method6023(class234, class251, false, (byte) -120);
	}

	static final void method7024(Class668 class668, int i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_2_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_2_ >> 16];
		Class230.method3298(class251, class234, class668, 2070866849);
	}

	static final void method7025(Class251 class251, Class234 class234, Class668 class668, int i) {
		class668.anInt8542 -= -1225469822;
		class251.aBool2659 = true;
		class251.anInt2588 = Math.max(Math.min((class668.anIntArray8541[class668.anInt8542 * 1867269829]), 2816), 0) * -594473299;
		class251.anInt2631 = Math.max(Math.min((class668.anIntArray8541[1 + class668.anInt8542 * 1867269829]), 2816), 0) * 3797743;
		class251.anInt2632 = Math.max(Math.min((class668.anIntArray8541[1867269829 * class668.anInt8542 + 2]), 2816), 0) * -1315088261;
		int i_3_ = Math.max(Math.min((class668.anIntArray8541[3 + class668.anInt8542 * 1867269829]), 255), 0);
		int i_4_ = Math.max(Math.min((class668.anIntArray8541[class668.anInt8542 * 1867269829 + 4]), 255), 0);
		int i_5_ = Math.max(Math.min((class668.anIntArray8541[class668.anInt8542 * 1867269829 + 5]), 255), 0);
		class251.anInt2579 = -373478313 * (i_3_ << 16 | i_4_ << 8 | i_5_);
		class251.anInt2650 = (class668.anIntArray8541[6 + 1867269829 * class668.anInt8542] * 520454843);
		class251.anInt2629 = (1284955013 * class668.anIntArray8541[7 + class668.anInt8542 * 1867269829]);
		class251.anInt2639 = (-476543717 * class668.anIntArray8541[8 + 1867269829 * class668.anInt8542]);
		class251.anInt2635 = (class668.anIntArray8541[1867269829 * class668.anInt8542 + 9] * -1974013825);
		Class668.method8011(class251, 263642117);
	}
}
