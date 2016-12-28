/* Class231 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.List;

public class Class231 {
	static final int anInt2366 = 5;
	List aList2367 = new ArrayList();

	public void method3299(int i) {
		aList2367.remove(i);
	}

	public int method3300(int i, byte i_0_) {
		for (int i_1_ = 0; i_1_ < aList2367.size(); i_1_++) {
			if (((Class223) aList2367.get(i_1_)).anInt2332 * -1409377821 == i)
				return i_1_;
		}
		return -1;
	}

	public Class223 method3301(int i, byte i_2_) {
		return (Class223) aList2367.get(i);
	}

	public int method3302(Class223 class223, int i) {
		return method3312(class223, -1, (byte) 105);
	}

	public void method3303() {
		aList2367.clear();
	}

	public void method3304(int i, byte i_3_) {
		aList2367.remove(i);
	}

	public int method3305(int i) {
		return aList2367.size();
	}

	public int method3306() {
		return aList2367.size();
	}

	public int method3307() {
		return aList2367.size();
	}

	public int method3308() {
		return aList2367.size();
	}

	public int method3309() {
		return aList2367.size();
	}

	public int method3310(int i) {
		for (int i_4_ = 0; i_4_ < aList2367.size(); i_4_++) {
			if (((Class223) aList2367.get(i_4_)).anInt2332 * -1409377821 == i)
				return i_4_;
		}
		return -1;
	}

	public int method3311() {
		return aList2367.size();
	}

	public int method3312(Class223 class223, int i, byte i_5_) {
		if (aList2367.size() == 5)
			throw new RuntimeException("");
		if (method3300(-1409377821 * class223.anInt2332, (byte) -47) != -1)
			throw new RuntimeException("");
		if (-1 == i)
			i = aList2367.size();
		aList2367.add(i, class223);
		return i;
	}

	public void method3313() {
		aList2367.clear();
	}

	public void method3314(int i) {
		aList2367.clear();
	}

	public void method3315() {
		aList2367.clear();
	}

	static Class2 method3316(int i) {
		Class2 class2;
		if (Class70.aBool780) {
			if (null != Class642.aClass184_8333 && Class287.aClass2_3209 != null)
				class2 = Class287.aClass2_3209;
			else
				class2 = Class260.aClass2_2840;
		} else
			class2 = Class260.aClass2_2840;
		Class70.anInt749 = class2.anInt91 * 566535419 + class2.anInt92 * -2052260103;
		return class2;
	}

	public static int method3317(int i) {
		return 500175661 * Class626.anInt8167;
	}

	static final void method3318(Class668 class668, int i) {
		int i_6_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		ItemDefinitions class1 = (ItemDefinitions) Class111.aClass34_Sub13_1391.method70(i_6_, (byte) 67);
		if (-1 == class1.anInt64 * 208949951 && 989214201 * class1.anInt67 >= 0)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 989214201 * class1.anInt67;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_6_;
	}

	static final void method3319(Class668 class668, int i) {
		float f = Class447.method5400(class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)]);
		Class536_Sub18_Sub18_Sub2 class536_sub18_sub18_sub2 = new Class536_Sub18_Sub18_Sub2(Class683.aClass301_Sub1_8651.method9200(-173337294), f);
		Class683.aClass301_Sub1_8651.method4063(class536_sub18_sub18_sub2, -1081235108);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1164011507 * class536_sub18_sub18_sub2.anInt11824;
	}

	public static String method3320(String string, char c, String string_7_, int i) {
		int i_8_ = string.length();
		int i_9_ = string_7_.length();
		int i_10_ = i_8_;
		int i_11_ = i_9_ - 1;
		if (0 != i_11_) {
			int i_12_ = 0;
			for (;;) {
				i_12_ = string.indexOf(c, i_12_);
				if (i_12_ < 0)
					break;
				i_12_++;
				i_10_ += i_11_;
			}
		}
		StringBuilder stringbuilder = new StringBuilder(i_10_);
		int i_13_ = 0;
		for (;;) {
			int i_14_ = string.indexOf(c, i_13_);
			if (i_14_ < 0)
				break;
			stringbuilder.append(string.substring(i_13_, i_14_));
			stringbuilder.append(string_7_);
			i_13_ = 1 + i_14_;
		}
		stringbuilder.append(string.substring(i_13_));
		return stringbuilder.toString();
	}

	static boolean method3321(Class579 class579, int i) {
		return Class402.method4929(class579, null, 1095964989);
	}
}
