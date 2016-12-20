/* Class491 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Component;

public class Class491 {
	static Class491 aClass491_5474;
	public static Class491 aClass491_5475;
	int anInt5476;
	public static Class491 aClass491_5477;
	public static Class491 aClass491_5478;
	static Class491 aClass491_5479;
	static Class491 aClass491_5480 = new Class491(0);
	static Class491 aClass491_5481;
	static Class491 aClass491_5482;
	public static Class491 aClass491_5483;

	Class491(int i) {
		anInt5476 = 396408031 * i;
	}

	static {
		aClass491_5475 = new Class491(1);
		aClass491_5474 = new Class491(2);
		aClass491_5477 = new Class491(3);
		aClass491_5478 = new Class491(4);
		aClass491_5483 = new Class491(5);
		aClass491_5479 = new Class491(6);
		aClass491_5481 = new Class491(7);
		aClass491_5482 = new Class491(8);
	}

	public static Class554 method7978(Component component, int i) {
		return new Class554_Sub1(component);
	}

	static void method7979(byte i) {
		Class299.aClass205_3393.method3793((byte) 106);
	}

	public static void method7980(Class527_Sub33 class527_sub33, int i) {
		Class447.method7261(class527_sub33, 500000, -950852928);
	}

	static final void method7981(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 236302803 * class243.anInt2576;
	}

	static final void method7982(Class665 class665, byte i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class9 class9 = ((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(i_0_, -1854369001));
		if (-73038935 * class9.anInt132 == -1 && class9.anInt103 * 1450438899 >= 0)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 1450438899 * class9.anInt103;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = i_0_;
	}
}
