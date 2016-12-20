/* Class620 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class620 implements Iterator {
	int anInt8116;
	Class626[] aClass626Array8117;
	public static Class459 aClass459_8118;
	static Class694 aClass694_8119;

	public boolean method10220() {
		return anInt8116 * -637192399 < aClass626Array8117.length;
	}

	public Object method10221() {
		return aClass626Array8117[(anInt8116 += 1086505425) * -637192399 - 1];
	}

	public Object next() {
		return aClass626Array8117[(anInt8116 += 1086505425) * -637192399 - 1];
	}

	Class620(Class626[] class626s) {
		aClass626Array8117 = class626s;
	}

	public void method10222() {
		throw new UnsupportedOperationException();
	}

	public Object method10223() {
		return aClass626Array8117[(anInt8116 += 1086505425) * -637192399 - 1];
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public boolean hasNext() {
		return anInt8116 * -637192399 < aClass626Array8117.length;
	}

	static final void method10224(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class575.method9632(class243, class240, class665, (byte) 104);
	}

	static final void method10225(Class665 class665, short i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub32_10620.method17238(1988339666) ? 1 : 0;
	}

	public static Class527_Sub8_Sub7 method10226(int i) {
		return Class200.aClass527_Sub8_Sub7_2202;
	}

	public static final int method10227(String string, int i) {
		if (string == null || string.length() == 0)
			return -1;
		for (int i_0_ = 0; i_0_ < 182205737 * client.anInt11299; i_0_++) {
			if (string.equalsIgnoreCase(client.aClass72Array11301[i_0_].aString785))
				return i_0_;
		}
		return -1;
	}
}
