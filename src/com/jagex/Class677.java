/* Class677 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Class677 implements Interface76 {
	int anInt8595;
	public static Class677 aClass677_8596 = new Class677("", 0, new Class670[] { Class670.aClass670_8570 });
	public static Class677 aClass677_8597;
	static Class677 aClass677_8598;
	public static Class677 aClass677_8599;
	public static Class677 aClass677_8600 = new Class677("", 1, new Class670[] { Class670.aClass670_8569, Class670.aClass670_8570 });
	static Class677 aClass677_8601;
	static Class677 aClass677_8602;
	static Class677 aClass677_8603;
	public static Class677 aClass677_8604;
	static Class677 aClass677_8605;
	Set aSet8606;
	static Class677 aClass677_8607;
	public static Class677 aClass677_8608;
	public static Class677 aClass677_8609;

	public int method42() {
		return -1446023805 * anInt8595;
	}

	Class677(String string, int i) {
		aSet8606 = new HashSet();
		anInt8595 = -1186658005 * i;
	}

	Class677(String string, int i, Class670[] class670s) {
		aSet8606 = new HashSet();
		anInt8595 = i * -1186658005;
		Class670[] class670s_0_ = class670s;
		for (int i_1_ = 0; i_1_ < class670s_0_.length; i_1_++) {
			Class670 class670 = class670s_0_[i_1_];
			aSet8606.add(class670);
		}
	}

	public int method91() {
		return -1446023805 * anInt8595;
	}

	public boolean method13879(Class670 class670, int i) {
		return aSet8606.contains(class670);
	}

	static {
		aClass677_8597 = new Class677("", 2, new Class670[] { Class670.aClass670_8569, Class670.aClass670_8568 });
		aClass677_8608 = new Class677("", 3, new Class670[] { Class670.aClass670_8569 });
		aClass677_8599 = new Class677("", 4);
		aClass677_8609 = new Class677("", 5, new Class670[] { Class670.aClass670_8569, Class670.aClass670_8570 });
		aClass677_8601 = new Class677("", 6, new Class670[] { Class670.aClass670_8570 });
		aClass677_8602 = new Class677("", 8, new Class670[] { Class670.aClass670_8569, Class670.aClass670_8570 });
		aClass677_8603 = new Class677("", 9, new Class670[] { Class670.aClass670_8569, Class670.aClass670_8568 });
		aClass677_8604 = new Class677("", 10, new Class670[] { Class670.aClass670_8569 });
		aClass677_8605 = new Class677("", 11, new Class670[] { Class670.aClass670_8569 });
		aClass677_8598 = new Class677("", 12, new Class670[] { Class670.aClass670_8569, Class670.aClass670_8570 });
		aClass677_8607 = new Class677("", 13, new Class670[] { Class670.aClass670_8569 });
		method13887((byte) -81);
	}

	public boolean method13880(Class670 class670) {
		return aSet8606.contains(class670);
	}

	public static void method13881(Interface46 interface46, Interface49 interface49, byte i) {
		Class628.anInt8190 = 0;
		Class628.anInt8194 = 0;
		Class628.aList8199 = new LinkedList();
		Class628.aClass522_Sub6_Sub1_Sub1Array8189 = new Class522_Sub6_Sub1_Sub1[1024];
		Class628.aClass613Array8192 = (new Class613[Class166.anIntArray1835[367556557 * Class628.anInt8201] + 1]);
		Class628.anInt8193 = 0;
		Class628.anInt8202 = 0;
		Class628.anInterface49_8197 = interface49;
	}

	public static Class677[] method13882() {
		return new Class677[] { aClass677_8597, aClass677_8608, aClass677_8605, aClass677_8599, aClass677_8600, aClass677_8596, aClass677_8603, aClass677_8601, aClass677_8602, aClass677_8607, aClass677_8609, aClass677_8604, aClass677_8598 };
	}

	public static Class677[] method13883() {
		return new Class677[] { aClass677_8597, aClass677_8608, aClass677_8605, aClass677_8599, aClass677_8600, aClass677_8596, aClass677_8603, aClass677_8601, aClass677_8602, aClass677_8607, aClass677_8609, aClass677_8604, aClass677_8598 };
	}

	public boolean method13884(Class670 class670) {
		return aSet8606.contains(class670);
	}

	public boolean method13885(Class670 class670) {
		return aSet8606.contains(class670);
	}

	public boolean method13886(Class670 class670) {
		return aSet8606.contains(class670);
	}

	public static Class677[] method13887(byte i) {
		return new Class677[] { aClass677_8597, aClass677_8608, aClass677_8605, aClass677_8599, aClass677_8600, aClass677_8596, aClass677_8603, aClass677_8601, aClass677_8602, aClass677_8607, aClass677_8609, aClass677_8604, aClass677_8598 };
	}

	public int method87() {
		return -1446023805 * anInt8595;
	}

	public static String method13888(int i, boolean bool, int i_2_) {
		if (!bool || i < 0)
			return Integer.toString(i);
		return Class269.method5056(i, 10, bool, -917201598);
	}

	static final void method13889(Class665 class665, byte i) {
		int i_3_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_3_, 2111748835);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -1514904661 * class243.anInt2548;
	}

	static final void method13890(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub42_10592.method17324((byte) 12) == 1 ? 1 : 0;
	}

	static final void method13891(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class243.anInt2514 * -1386504031;
	}

	static void method13892(int i, int i_4_, byte i_5_) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(7, (long) i);
		class527_sub8_sub9.method18187(-1505693749);
		class527_sub8_sub9.anInt11676 = -281159195 * i_4_;
	}
}
