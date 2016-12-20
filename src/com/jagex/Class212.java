/* Class212 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.applet.Applet;
import java.util.ArrayList;
import java.util.List;

public class Class212 {
	Class226 this$0;
	List aList2257;
	public static Applet anApplet2258;

	boolean method3881(Class483 class483, byte i) {
		return aList2257.contains(class483);
	}

	void method3882(Class483 class483, short i) {
		aList2257.add(class483);
	}

	void method3883(Class483 class483, int i) {
		aList2257.remove(class483);
	}

	List method3884(short i) {
		return aList2257;
	}

	boolean method3885(Class483 class483) {
		return aList2257.contains(class483);
	}

	boolean method3886(Class483 class483) {
		return aList2257.contains(class483);
	}

	void method3887(Class483 class483) {
		aList2257.remove(class483);
	}

	Class212(Class226 class226) {
		this$0 = class226;
		aList2257 = new ArrayList();
	}

	static final void method3888(Class665 class665, int i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_0_, 1201497861);
		Class240 class240 = Class183.aClass240Array2100[i_0_ >> 16];
		Class314_Sub1.method15662(class243, class240, class665, (byte) -83);
	}

	static final void method3889(Class665 class665, int i) {
		if (client.aBool11271)
			Class411.aClass411_4362.method6580((byte) -111);
	}

	public static Class604_Sub1 method3890(int i) {
		Class3.anInt40 = 0;
		return Class464.method7631(1550833276);
	}
}
