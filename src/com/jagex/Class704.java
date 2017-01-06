/* Class704 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class704 {
	int anInt8805;
	int anInt8806;
	boolean aBool8807 = false;
	Class536_Sub18_Sub17 aClass536_Sub18_Sub17_8808;
	Class536_Sub18_Sub17 aClass536_Sub18_Sub17_8809;
	int anInt8810;
	static Class536_Sub18_Sub9 aClass536_Sub18_Sub9_8811;

	final void method8260() {
		aBool8807 = false;
		anInt8810 = 0;
		aClass536_Sub18_Sub17_8809 = null;
		aClass536_Sub18_Sub17_8808 = null;
	}

	final boolean method8261(Class34_Sub11 class34_sub11, Class191 class191, int i, int i_0_, int[] is, int i_1_) {
		if (!aBool8807) {
			if (i >= is.length)
				return false;
			anInt8806 = 2021488689 * is[i];
			aClass536_Sub18_Sub17_8808 = class34_sub11.method10333(anInt8806 * -347676463 >> 16, -1163884553);
			anInt8806 = (anInt8806 * -347676463 & 0xffff) * 2021488689;
			if (null != aClass536_Sub18_Sub17_8808) {
				if (class191.aBool2165 && i_0_ != -1 && i_0_ < is.length) {
					anInt8805 = -2110281735 * is[i_0_];
					aClass536_Sub18_Sub17_8809 = class34_sub11.method10333((1412721225 * anInt8805 >> 16), -1654937198);
					anInt8805 = -2110281735 * (1412721225 * anInt8805 & 0xffff);
				}
				if (class191.aBool2152)
					anInt8810 = -281114673 * (-8577233 * anInt8810 | 0x200);
				if (aClass536_Sub18_Sub17_8808.method10794(-347676463 * anInt8806, 100182690))
					anInt8810 = (anInt8810 * -8577233 | 0x80) * -281114673;
				if (aClass536_Sub18_Sub17_8808.method10793(anInt8806 * -347676463, -2103399632))
					anInt8810 = (anInt8810 * -8577233 | 0x100) * -281114673;
				if (aClass536_Sub18_Sub17_8808.method10795(-347676463 * anInt8806, 1725170180))
					anInt8810 = (anInt8810 * -8577233 | 0x400) * -281114673;
				if (aClass536_Sub18_Sub17_8809 != null) {
					if (aClass536_Sub18_Sub17_8809.method10794(anInt8805 * 1412721225, 799386132))
						anInt8810 = -281114673 * (anInt8810 * -8577233 | 0x80);
					if (aClass536_Sub18_Sub17_8809.method10793(anInt8805 * 1412721225, -2144625922))
						anInt8810 = (-8577233 * anInt8810 | 0x100) * -281114673;
					if (aClass536_Sub18_Sub17_8809.method10795(anInt8805 * 1412721225, 2013848434))
						anInt8810 = -281114673 * (anInt8810 * -8577233 | 0x400);
				}
				anInt8810 = (-8577233 * anInt8810 | 0x20) * -281114673;
				aBool8807 = true;
				return true;
			}
			return false;
		}
		return true;
	}

	final void method8262(short i) {
		aBool8807 = false;
		anInt8810 = 0;
		aClass536_Sub18_Sub17_8809 = null;
		aClass536_Sub18_Sub17_8808 = null;
	}

	final void method8263() {
		aBool8807 = false;
		anInt8810 = 0;
		aClass536_Sub18_Sub17_8809 = null;
		aClass536_Sub18_Sub17_8808 = null;
	}

	Class704() {
		/* empty */
	}

	public static void method8264(int i, boolean bool, byte i_2_) {
		Class101.method1355(i, Class38.aClass38_402.method840((Class459.CLIENT_PARAMS), 2088071124), bool, -504758393);
	}

	static final boolean method8265(int[][] is, int[][] is_3_, int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		for (int i_9_ = i_4_; i_9_ <= i_6_; i_9_++) {
			for (int i_10_ = i_5_; i_10_ <= i_7_; i_10_++) {
				if (i == is[i_9_][i_10_] && is_3_[i_9_][i_10_] <= 1)
					return true;
			}
		}
		return false;
	}

	static final void method8266(IComponentDefinitions class251, Class234 class234, Class668 class668, byte i) {
		class251.aBool2659 = false;
		Class668.method8011(class251, 263642117);
	}

	static final void method8267(Class668 class668, byte i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		class668.anInt8542 -= 1472892954;
		int i_11_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_12_ = class668.anIntArray8541[1 + class668.anInt8542 * 1867269829];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = string.indexOf(i_11_, i_12_);
	}
}
