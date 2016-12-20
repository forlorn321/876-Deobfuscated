/* Class318 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Map;

public abstract class Class318 implements Interface6 {
	Map aMap3534;
	public static int anInt3535;

	Class318(Map map) {
		aMap3534 = map;
	}

	static final void method5684(Class665 class665, int i) {
		if (null != Class627.aClass527_Sub21_8187) {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 1;
			class665.aClass527_Sub21_8537 = Class627.aClass527_Sub21_8187;
		} else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
	}

	static void method5685(int i) {
		Class527_Sub1.aClass14_10333.method721(-1741990516);
	}

	static final void method5686(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub40_10604.method17296(-171200960) ? 1 : 0;
	}

	static final void method5687(long l) {
		try {
			Thread.sleep(l);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	public static void method5688(Class615 class615, int i) {
		Class49.anInt505 = class615.anInt8068 * -197966861;
		Class49.anInt504 = class615.anInt8052 * -659434265;
		Class49.anInt506 = class615.anInt8070 * 1353871589;
	}
}
