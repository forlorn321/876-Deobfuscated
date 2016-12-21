/* Class267 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class267 {
	public String aString2868;
	public String aString2869;
	public static short[][][] aShortArrayArrayArray2870;

	void method3697(Class269 class269) {
		aString2868 = class269.method3709(-1000987173);
		aString2869 = class269.method3709(-833438696);
	}

	void method3698(Class269 class269, int i) {
		aString2868 = class269.method3709(-649869323);
		aString2869 = class269.method3709(-957123499);
	}

	void method3699(Class269 class269) {
		aString2868 = class269.method3709(-392286679);
		aString2869 = class269.method3709(-1837747804);
	}

	Class267() {
		/* empty */
	}

	void method3700(Class269 class269) {
		aString2868 = class269.method3709(-1212320104);
		aString2869 = class269.method3709(-1123962857);
	}

	void method3701(Class269 class269) {
		aString2868 = class269.method3709(-1561247032);
		aString2869 = class269.method3709(-1974316536);
	}

	public static void method3702(Interface60 interface60, byte i) {
		if (Class508.anInterface60_6916 != null)
			throw new IllegalStateException("");
		Class508.anInterface60_6916 = interface60;
	}

	public static int method3703(int i, int i_0_, int i_1_) {
		i_0_ = i_0_ * (i & 0x7f) >> 7;
		if (i_0_ < 2)
			i_0_ = 2;
		else if (i_0_ > 126)
			i_0_ = 126;
		return (i & 0xff80) + i_0_;
	}

	public static Class298 method3704(int i, int i_2_) {
		if (i == -224469679 * Class298.aClass298_3346.anInt3347)
			return Class298.aClass298_3346;
		if (i == -224469679 * Class298.aClass298_3345.anInt3347)
			return Class298.aClass298_3345;
		if (i == Class298.aClass298_3344.anInt3347 * -224469679)
			return Class298.aClass298_3344;
		return null;
	}
}
