/* Class244 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class244 {
	int anInt2459;
	public int anInt2460;
	public int[] anIntArray2461;
	public int[] anIntArray2462;
	public Class161 aClass161_2463;
	public int anInt2464;

	public boolean method3406(int i, int i_0_) {
		if (i_0_ >= 0 && i_0_ < anIntArray2462.length) {
			int i_1_ = anIntArray2462[i_0_];
			if (i >= i_1_ && i <= anIntArray2461[i_0_] + i_1_)
				return true;
		}
		return false;
	}

	public boolean method3407(int i, int i_2_, byte i_3_) {
		if (i_2_ >= 0 && i_2_ < anIntArray2462.length) {
			int i_4_ = anIntArray2462[i_2_];
			if (i >= i_4_ && i <= anIntArray2461[i_2_] + i_4_)
				return true;
		}
		return false;
	}

	public boolean method3408(int i, int i_5_) {
		if (i_5_ >= 0 && i_5_ < anIntArray2462.length) {
			int i_6_ = anIntArray2462[i_5_];
			if (i >= i_6_ && i <= anIntArray2461[i_5_] + i_6_)
				return true;
		}
		return false;
	}

	Class244(int i, int i_7_, int[] is, int[] is_8_, Class161 class161, int i_9_) {
		anInt2464 = i * -2101696565;
		anInt2460 = i_7_ * 1473753339;
		anIntArray2461 = is;
		anIntArray2462 = is_8_;
		aClass161_2463 = class161;
		anInt2459 = 1428258407 * i_9_;
	}

	static final void method3409(Class668 class668, byte i) {
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = (class668.aClass536_Sub18_Sub16_8547.anObjectArray11796[class668.anInt8564 * -1640738851]);
	}

	static int method3410(char c, Language class664, int i) {
		int i_10_ = c << 4;
		if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
			c = Character.toLowerCase(c);
			i_10_ = 1 + (c << 4);
		}
		if (c == 241 && Language.aClass664_8521 == class664)
			i_10_ = 1762;
		return i_10_;
	}

	static final void method3411(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class15.method642(class251, class234, class668, -1582225981);
	}
}
