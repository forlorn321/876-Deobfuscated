/* Class449 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;

public class Class449 implements Interface76 {
	static Class449 aClass449_4931;
	static Class449 aClass449_4932;
	static Class449 aClass449_4933 = new Class449(0);
	int anInt4934;
	static long aLong4935;

	public int method87() {
		return anInt4934 * 1067274105;
	}

	public static Class449[] method7278() {
		return (new Class449[] { aClass449_4931, aClass449_4933, aClass449_4932 });
	}

	Class449(int i) {
		anInt4934 = -342299959 * i;
	}

	public int method42() {
		return anInt4934 * 1067274105;
	}

	public int method91() {
		return anInt4934 * 1067274105;
	}

	public static Class449[] method7279() {
		return (new Class449[] { aClass449_4931, aClass449_4933, aClass449_4932 });
	}

	public static Class449[] method7280() {
		return (new Class449[] { aClass449_4931, aClass449_4933, aClass449_4932 });
	}

	static {
		aClass449_4932 = new Class449(1);
		aClass449_4931 = new Class449(2);
	}

	static final void method7281(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -1054537975 * class243.anInt2511;
	}

	public static int method7282(String string, boolean bool, byte i) {
		string = string.toLowerCase();
		Class208.anIntArray2235 = null;
		Class190.anInt2129 = 0;
		LinkedList linkedlist = new LinkedList();
		LinkedList linkedlist_0_ = new LinkedList();
		for (int i_1_ = 0; i_1_ < Class174_Sub2.aClass24_Sub17_9120.anInt230 * -1588728841; i_1_++) {
			Class9 class9 = (Class9) Class174_Sub2.aClass24_Sub17_9120.method81(i_1_, -1963509056);
			if ((!bool || class9.aBool73) && -1 == 295433991 * class9.anInt127 && class9.anInt119 * -1637960559 == -1 && class9.anInt147 * -1475818213 == -1 && -88004625 * class9.anInt144 == 0 && class9.aString84.toLowerCase().indexOf(string) != -1) {
				if (linkedlist.size() >= 250)
					return -1;
				linkedlist.add(Integer.valueOf(i_1_));
				linkedlist_0_.add(class9.aString84);
			}
		}
		Class208.anIntArray2235 = new int[linkedlist.size()];
		int i_2_ = 0;
		Iterator iterator = linkedlist.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			Class208.anIntArray2235[i_2_++] = integer.intValue();
		}
		String[] strings = ((String[]) linkedlist_0_.toArray(new String[Class208.anIntArray2235.length]));
		Class325.method5752(strings, Class208.anIntArray2235, -709566596);
		return linkedlist.size();
	}

	static final void method7283(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		if (class665.anIntArray8525[class665.anInt8526 * 1769813785] <= class665.anIntArray8525[1 + 1769813785 * class665.anInt8526])
			class665.anInt8527 += (-1038991169 * class665.anIntArray8545[891367231 * class665.anInt8527]);
	}
}
