/* Class68 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class68 {
	protected int anInt763;
	protected int anInt764;
	protected int anInt765;
	protected int anInt766;
	protected int anInt767;
	protected int anInt768;
	protected boolean aBool769;
	protected boolean aBool770;
	protected int anInt771;

	Class68(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_, int i_6_) {
		anInt765 = i * 642333255;
		anInt764 = i_0_ * -1468521391;
		anInt763 = (i_1_ > 65535 ? 65535 : i_1_) * 483362689;
		anInt767 = -41648485 * i_2_;
		anInt766 = (i_3_ > 255 ? 255 : i_3_) * 505241091;
		anInt768 = i_4_ * 1636720961;
		aBool769 = bool;
		aBool770 = bool_5_;
		anInt771 = i_6_ * -1950302195;
	}

	static void method1476(Class243 class243, int i, int i_7_, boolean bool, int i_8_) {
		int i_9_ = class243.anInt2511 * -1054537975;
		int i_10_ = -1386504031 * class243.anInt2514;
		if (class243.aByte2494 == 0)
			class243.anInt2511 = 316285473 * class243.anInt2509;
		else if (class243.aByte2494 == 1)
			class243.anInt2511 = (i - class243.anInt2509 * 1885280809) * -177555655;
		else if (class243.aByte2494 == 2)
			class243.anInt2511 = -177555655 * (class243.anInt2509 * 1885280809 * i >> 14);
		if (class243.aByte2506 == 0)
			class243.anInt2514 = -1427045249 * class243.anInt2644;
		else if (class243.aByte2506 == 1)
			class243.anInt2514 = -2038545567 * (i_7_ - class243.anInt2644 * -1870122017);
		else if (class243.aByte2506 == 2)
			class243.anInt2514 = -2038545567 * (i_7_ * (-1870122017 * class243.anInt2644) >> 14);
		if (class243.aByte2494 == 4)
			class243.anInt2511 = (class243.anInt2514 * -1386504031 * (596599177 * class243.anInt2515) / (class243.anInt2516 * 39157577) * -177555655);
		if (4 == class243.aByte2506)
			class243.anInt2514 = (class243.anInt2511 * -1054537975 * (class243.anInt2516 * 39157577) / (class243.anInt2515 * 596599177) * -2038545567);
		if (client.aBool11199 && (client.method17815(class243).anInt10520 * -2105107355 != 0 || 0 == -270144907 * class243.anInt2501)) {
			if (class243.anInt2514 * -1386504031 < 5 && class243.anInt2511 * -1054537975 < 5) {
				class243.anInt2514 = -1602793243;
				class243.anInt2511 = -887778275;
			} else {
				if (class243.anInt2514 * -1386504031 <= 0)
					class243.anInt2514 = -1602793243;
				if (-1054537975 * class243.anInt2511 <= 0)
					class243.anInt2511 = -887778275;
			}
		}
		if (-2084214243 * class243.anInt2528 == Class243.anInt2529 * 1043781351)
			client.aClass243_11201 = class243;
		if (bool && class243.anObjectArray2646 != null && (-1054537975 * class243.anInt2511 != i_9_ || i_10_ != class243.anInt2514 * -1386504031)) {
			Class527_Sub33 class527_sub33 = new Class527_Sub33();
			class527_sub33.aClass243_10648 = class243;
			class527_sub33.anObjectArray10650 = class243.anObjectArray2646;
			client.aClass694_11246.method14147(class527_sub33, -1596388454);
		}
	}

	static final void method1477(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub7_10613.method16897((byte) 46) ? 1 : 0;
	}

	static void method1478(Class665 class665, int i) {
		Class259 class259 = ((Class259) Class590.aClass62_Sub1_7793.method81((class665.anIntArray8525[((class665.anInt8526 -= 102380841) * 1769813785)]), 1055096612));
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (null == class259.anIntArray2838 ? 0 : class259.anIntArray2838.length);
	}
}
