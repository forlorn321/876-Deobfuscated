/* Class205 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class205 {
	public int anInt2235;

	boolean method2939(int i) {
		return true;
	}

	public abstract void method2940(int i);

	void method2941(byte i) {
		/* empty */
	}

	public abstract void method2942();

	public abstract void method2943();

	boolean method2944() {
		return true;
	}

	void method2945() {
		/* empty */
	}

	void method2946() {
		/* empty */
	}

	void method2947() {
		/* empty */
	}

	Class205(RSByteBuffer class536_sub33) {
		anInt2235 = class536_sub33.readUnsignedShort() * -746986755;
	}

	static final void method2948(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class524.method6409(class251, class234, class668, 1570417800);
	}

	public static Class79 method2949(int i, int i_0_) {
		Class79[] class79s = Class494.method5993(1533121603);
		Class79[] class79s_1_ = class79s;
		for (int i_2_ = 0; i_2_ < class79s_1_.length; i_2_++) {
			Class79 class79 = class79s_1_[i_2_];
			if (i == -1161536159 * class79.anInt831)
				return class79;
		}
		return null;
	}

	static final void method2950(int i, int i_3_, int i_4_) {
		if (Class644.method7794(i, null, 140667413))
			Class56.method964((Class463.aClass234Array5227[i].aClass251Array2378), i_3_, -2075596792);
	}
}
