/* Class359 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class359 {
	Map aMap3825 = new HashMap();
	Class360 aClass360_3826;

	public void method4715() {
		Iterator iterator = aMap3825.values().iterator();
		while (iterator.hasNext()) {
			Class374 class374 = (Class374) iterator.next();
			class374.method4769(1340568585);
		}
	}

	public Class374 method4716(int i, int i_0_, float f, Interface42 interface42, int i_1_) {
		if (method4717(i, -1268314088) != null)
			return null;
		Class374 class374 = null;
		if (-1 != i_0_)
			class374 = method4717(i_0_, 205165789);
		Object object = aClass360_3826.method4733(class374, (byte) 1);
		Class374 class374_2_ = new Class374(i, f, object, this, interface42, class374);
		aMap3825.put(Integer.valueOf(i), class374_2_);
		return class374_2_;
	}

	public Class374 method4717(int i, int i_3_) {
		return (Class374) aMap3825.get(Integer.valueOf(i));
	}

	public void method4718() {
		Iterator iterator = aMap3825.values().iterator();
		while (iterator.hasNext()) {
			Class374 class374 = (Class374) iterator.next();
			class374.method4769(85002117);
		}
	}

	public void method4719(byte i) {
		Iterator iterator = aMap3825.values().iterator();
		while (iterator.hasNext()) {
			Class374 class374 = (Class374) iterator.next();
			class374.method4769(1125391451);
		}
	}

	public Class359(Class360 class360) {
		aClass360_3826 = class360;
	}

	public void method4720() {
		Iterator iterator = aMap3825.values().iterator();
		while (iterator.hasNext()) {
			Class374 class374 = (Class374) iterator.next();
			class374.method4769(-1431876253);
		}
	}

	public void method4721() {
		Iterator iterator = aMap3825.values().iterator();
		while (iterator.hasNext()) {
			Class374 class374 = (Class374) iterator.next();
			class374.method4769(-2063892235);
		}
	}

	static void method4722(Class167 class167, int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, byte i_9_) {
		class167.method2057(i, i_4_, i_5_, i_6_, i_7_, (short) -3620);
		class167.method2057(1 + i, i_4_ + 1, i_5_ - 2, 16, i_8_, (short) -16168);
		class167.method2056(i + 1, i_4_ + 18, i_5_ - 2, i_6_ - 19, i_8_, 120317252);
	}

	static final void method4723(Class668 class668, byte i) {
		int i_10_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		int i_11_ = i_10_ >> 16;
		if (null == Class463.aClass234Array5227[i_11_])
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
		else {
			String string = (Class463.aClass234Array5227[i_11_].aClass251Array2378[i_10_].aString2557);
			if (null == string)
				class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
			else
				class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = string;
		}
	}

	static final void method4724(InterfaceDefinitions class251, Class668 class668, int i) {
		int i_12_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		int i_13_ = ((class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) - 1);
		if (1939619399 * class251.anInt2601 != 6)
			throw new RuntimeException("");
		Class296 class296 = ((Class296) Class172.aClass34_Sub7_1922.method70(class251.anInt2602 * -2011124813, (byte) 54));
		if (class251.aClass304_2583 == null)
			class251.aClass304_2583 = new Class304(class296, true);
		class251.aClass304_2583.aLong3434 = Class584.method7047(726730692) * 1195640203384682761L;
		if (i_13_ < 0 || i_13_ >= class296.anIntArray3317.length)
			throw new RuntimeException(new StringBuilder().append("").append(i_13_).toString());
		class251.aClass304_2583.anIntArray3433[i_13_] = i_12_;
		Class668.method8011(class251, 263642117);
	}

	static Class583 method4725(int i, int i_14_) {
		Class583[] class583s = Class254.method3536((byte) -46);
		for (int i_15_ = 0; i_15_ < class583s.length; i_15_++) {
			Class583 class583 = class583s[i_15_];
			if (class583.anInt7702 * 1451560717 == i)
				return class583;
		}
		return null;
	}
}
